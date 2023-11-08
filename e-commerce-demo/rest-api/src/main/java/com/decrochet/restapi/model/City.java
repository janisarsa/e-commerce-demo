package com.decrochet.restapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "city")
@Getter
@Setter
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long id;

    @Column(name = "name", nullable = false)
    @NotNull
    private String name;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "state_id", nullable = false)
    private State state;

    @Column(name = "created_at", columnDefinition = "timestamp with time zone not null")
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp createdAt;

    @Column(name = "updated_at", columnDefinition = "timestamp with time zone not null")
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp updatedAt;

    @Column(name = "deleted_at", columnDefinition = "timestamp with time zone")
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp deletedAt;
}
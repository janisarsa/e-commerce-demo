CREATE TABLE country (
    id BIGSERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    official_name TEXT UNIQUE NOT NULL,
    code TEXT UNIQUE NOT NULL,
    deleted_at TIMESTAMP WITH TIME ZONE DEFAULT NULL,
    updated_at TIMESTAMP WITH TIME ZONE DEFAULT NOW() NOT NULL,
    created_at TIMESTAMP WITH TIME ZONE DEFAULT NOW() NOT NULL
);
CREATE TABLE user_payment (
    user_id BIGSERIAL REFERENCES users (id) ON DELETE CASCADE NOT NULL,
    payment_id BIGSERIAL REFERENCES payment (id) ON DELETE CASCADE NOT NULL,
    deleted_at TIMESTAMP WITH TIME ZONE DEFAULT NULL,
    updated_at TIMESTAMP WITH TIME ZONE DEFAULT NOW() NOT NULL,
    created_at TIMESTAMP WITH TIME ZONE DEFAULT NOW() NOT NULL
);
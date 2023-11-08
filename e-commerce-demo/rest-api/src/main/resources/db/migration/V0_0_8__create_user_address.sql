CREATE TABLE user_address (
    user_id BIGSERIAL REFERENCES users (id) ON DELETE CASCADE NOT NULL,
    address_id BIGSERIAL REFERENCES addresses (id) ON DELETE CASCADE NOT NULL,
    deleted_at TIMESTAMP WITH TIME ZONE DEFAULT NULL,
    updated_at TIMESTAMP WITH TIME ZONE DEFAULT NOW() NOT NULL,
    created_at TIMESTAMP WITH TIME ZONE DEFAULT NOW() NOT NULL
);
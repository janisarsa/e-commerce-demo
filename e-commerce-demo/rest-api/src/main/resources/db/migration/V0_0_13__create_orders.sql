CREATE TABLE orders (
    id BIGSERIAL PRIMARY KEY,
    client_id BIGSERIAL REFERENCES users (id) ON DELETE CASCADE NOT NULL,
    subtotal DOUBLE PRECISION DEFAULT 0 NOT NULL,
    shipping DOUBLE PRECISION DEFAULT 0 NOT NULL,
    taxes DOUBLE PRECISION DEFAULT 0 NOT NULL,
    deleted_at TIMESTAMP WITH TIME ZONE DEFAULT NULL,
    updated_at TIMESTAMP WITH TIME ZONE DEFAULT NOW() NOT NULL,
    created_at TIMESTAMP WITH TIME ZONE DEFAULT NOW() NOT NULL
);
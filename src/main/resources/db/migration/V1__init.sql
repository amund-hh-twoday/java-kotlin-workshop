CREATE TABLE todo
(
    id        UUID PRIMARY KEY,
    date      DATE         NOT NULL,
    todo      VARCHAR(255) NOT NULL,
    completed BOOLEAN DEFAULT FALSE
);
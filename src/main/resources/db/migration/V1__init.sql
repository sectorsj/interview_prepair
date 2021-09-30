BEGIN;

CREATE TABLE groups (
    id bigserial        PRIMARY KEY,
    title               VARCHAR(255)
);

INSERT INTO groups (title) VALUES
('10A');


CREATE TABLE students (
    id bigserial        PRIMARY KEY,
    name                VARCHAR(255),
    age                 int,
    mark                int,
    group_id bigint     REFERENCES groups(id)
);

INSERT INTO students (name, age, mark, group_id) VALUES
('Alexander', 21, 87, 1),
('Bob', 25, 76, 1),
('John', 19, 88, 1),
('Kelly', 18, 85, 1),
('Sam', 24, 89, 1),
('Bill', 26, 95, 1);


COMMIT;
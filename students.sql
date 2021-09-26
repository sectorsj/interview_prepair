
DROP TABLE IF EXISTS students CASCADE;

CREATE TABLE students (
id bigserial PRIMARY KEY,
name VARCHAR(255),
mark int);

INSERT INTO students (name, mark) VALUES
('Alexander', 89),
('Bob', 98),
('John', 76),
('Kek', 89),
('Sem', 65),
('Bill', 84);

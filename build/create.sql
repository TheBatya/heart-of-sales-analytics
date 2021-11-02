-- Удаление старой схемы
DROP SCHEMA IF EXISTS ping CASCADE;

-- Создание схемы
CREATE SCHEMA ping;

DROP USER IF EXISTS ping;
CREATE USER ping WITH PASSWORD 'ping';
GRANT ALL ON SCHEMA ping TO ping;
ALTER DEFAULT PRIVILEGES IN SCHEMA ping GRANT ALL ON TABLES TO ping;
ALTER DEFAULT PRIVILEGES IN SCHEMA ping GRANT ALL ON SEQUENCES TO ping;

set search_path to 'ping';

CREATE TABLE ping (
  id                BIGSERIAL NOT NULL,
  value             VARCHAR(255),
  PRIMARY KEY (ID)
);

insert into ping (value) values ('pong');
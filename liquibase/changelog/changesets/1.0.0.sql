--liquibase formatted sql

--changeset mputov:voshod-1
GRANT USAGE ON SCHEMA voshodsm TO voshod;
--rollback DROP SCHEMA voshodsm

--changeset mputov:voshod-2
CREATE TABLE voshodsm.test
(
    guid                         uuid NOT NULL,
    CONSTRAINT pk_attribute PRIMARY KEY (guid)
);

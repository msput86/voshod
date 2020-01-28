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

--changeset mputov:voshod-3.1
CREATE TABLE voshodsm.subject_level
(
    ISUBJECT_LEVELID	bigserial,
    DTDATE_BEGIN	timestamp,
    DTDATE_END	timestamp,
    VCSUBJECT_LEVEL_NAME	VARCHAR(250),
    ISUBJECT_TYPEID	bigint,
    ISERVERID	bigint,
    IIS_UNCHECKED	boolean,
    IIS_PROTECTED	boolean,
    CONSTRAINT pk_isubject_levelid PRIMARY KEY (ISUBJECT_LEVELID)
);

--changeset mputov:voshod-3.2
CREATE TABLE voshodsm.subject_level_hierarch
(
    ISUBJECT_LEVEL_HIERARCHID	bigserial not null,
    DTDATE_BEGIN	timestamp,
    DTDATE_END	timestamp,
    IUPPER_LEVELID	bigint,
    ILOWER_LEVELID	bigint,
    ISERVERID	bigint,
    IIS_UNCHECKED	boolean,
    IIS_PROTECTED	boolean,
    CONSTRAINT pk_isubject_level_hierarchid PRIMARY KEY (ISUBJECT_LEVEL_HIERARCHID)
);


--changeset mputov:voshod-3.3
CREATE TABLE voshodsm.subject_type
(
    ISUBJECT_TYPEID		bigserial NOT NULL,
    DTDATE_BEGIN	timestamp ,
    DTDATE_END	timestamp ,
    VCSUBJECT_TYPE_NAME	TEXT,
    ISERVERID	bigint,
    IIS_UNCHECKED	boolean,
    IIS_PROTECTED	boolean,
    IIS_DOC	boolean,
    CONSTRAINT pk_isubject_typeid PRIMARY KEY (ISUBJECT_TYPEID)
);

--changeset mputov:voshod-3.4
CREATE TABLE voshodsm.subject
(
    ISUBJECTID  bigserial   NOT NULL,
    DTDATE_BEGIN	timestamp,
    DTDATE_END	timestamp,
    VCSUBJECT_NAME	text,
    ISUBJECT_LEVELID	bigint,
    ISUBJECT_TYPEID	bigint,
    ISERVERID	bigint,
    IREFERENDUMID	bigint,
    IIS_UNCHECKED	boolean,
    IIS_PROTECTED	boolean,
    ISUBJ_PARENTID	bigint,
    IIS_BASIC	boolean,
    IBASIC_WRITINGID	bigint,
    VCCODE_SUBJ	text,
    CONSTRAINT pk_isubjectid PRIMARY KEY (ISUBJECTID)
);

--changeset mputov:voshod-3.5
CREATE TABLE voshodsm.subject_hierarch
(
    ISUBJECT_HIERARCHID	bigserial NOT NULL,
    DTDATE_BEGIN	timestamp,
    DTDATE_END	timestamp,
    ILOWER_SUBJECTID	bigint,
    IUPPER_SUBJECTID	bigint,
    ISERVERID	bigint,
    ISUBJECT_LEVEL_HIERARCHID	bigint,
    IIS_UNCHECKED	boolean,
    IIS_PROTECTED	boolean,
    CONSTRAINT pk_isubject_hierarchid PRIMARY KEY (isubject_hierarchid)
);


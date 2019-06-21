-- begin WORKFLOWEXAMPLE_CONTRACT
create table WORKFLOWEXAMPLE_CONTRACT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMBER_ varchar(255),
    DATE_ date,
    STATE varchar(255),
    --
    primary key (ID)
)^
-- end WORKFLOWEXAMPLE_CONTRACT

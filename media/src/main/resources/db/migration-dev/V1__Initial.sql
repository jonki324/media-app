
    create table article_tags (
       id int8 generated by default as identity,
        article_id int8,
        tag_id int8,
        created_at timestamp,
        updated_at timestamp,
        version int4,
        primary key (id)
    );

    create table articles (
       id int8 generated by default as identity,
        body varchar(255),
        title varchar(255),
        author_id int8,
        created_at timestamp,
        updated_at timestamp,
        version int4,
        primary key (id)
    );

    create table comments (
       id int8 generated by default as identity,
        body varchar(255),
        author_id int8,
        article_id int8 not null,
        created_at timestamp,
        updated_at timestamp,
        version int4,
        primary key (id)
    );

    create table favorites (
       id int8 generated by default as identity,
        user_id int8,
        article_id int8,
        created_at timestamp,
        updated_at timestamp,
        version int4,
        primary key (id)
    );

    create table follows (
       id int8 generated by default as identity,
        user_id int8,
        followed_user_id int8,
        created_at timestamp,
        updated_at timestamp,
        version int4,
        primary key (id)
    );

    create table tags (
       id int8 generated by default as identity,
        name varchar(255) not null,
        created_at timestamp,
        updated_at timestamp,
        version int4,
        primary key (id)
    );

    alter table if exists article_tags
       add constraint FKeoil73g36agokjw6vuklqgli3
       foreign key (article_id)
       references articles;

    alter table if exists article_tags
       add constraint FKr17guaxramkeyxq0f1xn3bxbw
       foreign key (tag_id)
       references tags;

    alter table if exists comments
       add constraint FKk4ib6syde10dalk7r7xdl0m5p
       foreign key (article_id)
       references articles;

    alter table if exists favorites
       add constraint FKg5bjjgr1bd2g8guv8125gts3s
       foreign key (article_id)
       references articles;

-- test data
insert into articles
(title, body, author_id, created_at, updated_at, version) values
('title1', 'body1', 1, current_timestamp, current_timestamp, 0),
('title2', 'body2', 1, current_timestamp, current_timestamp, 0),
('title3', 'body3', 1, current_timestamp, current_timestamp, 0);

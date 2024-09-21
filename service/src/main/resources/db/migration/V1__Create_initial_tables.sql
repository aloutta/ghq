create table if not exists country (
    id serial primary key,
    alpha2 char(2) not null unique,
    alpha3 char(3) not null unique
);
create table if not exists developer (
    id serial primary key,
    name varchar(255) not null unique
);
create table if not exists game (
    id serial primary key,
    title varchar(255) not null unique,
    developer_id bigint not null
);
create table if not exists dlc (
    id serial primary key,
    name varchar(255) not null,
    game_id bigint not null,
    constraint fk_game foreign key (game_id) references game(id) on delete cascade
);
create table if not exists genre (
    id serial primary key,
    name varchar(255) not null unique
);
create table if not exists platform (
    id serial primary key,
    name varchar(255) not null unique,
    manufacturer varchar(255)
);
create table if not exists release (
    id serial primary key,
    game_id bigint,
    dlc_id bigint,
    country_id bigint,
    release_date date,
    constraint fk_release_game foreign key (game_id) references game(id) on delete cascade,
    constraint fk_release_dlc foreign key (dlc_id) references dlc(id) on delete cascade,
    constraint fk_release_country foreign key (country_id) references country(id) on delete cascade,
    constraint chk_release_type check (
        (game_id is not null and dlc_id is null) or
        (game_id is null and dlc_id is not null)
    )
);
create table if not exists screenshot (
    id serial primary key,
    url varchar(255),
    game_id bigint,
    dlc_id bigint,
    constraint fk_screenshot_game foreign key (game_id) references game(id) on delete cascade,
    constraint fk_screenshot_dlc foreign key (dlc_id) references dlc(id) on delete cascade,
    constraint chk_screenshot_type check (game_id is not null or dlc_id is not null)
);
create table if not exists tag (
    id serial primary key,
    name varchar(255) not null unique
);
create table if not exists video (
    id serial primary key,
    url varchar(255),
    game_id bigint,
    dlc_id bigint,
    constraint fk_video_game foreign key (game_id) references game(id) on delete cascade,
    constraint fk_video_dlc foreign key (dlc_id) references dlc(id) on delete cascade,
    constraint chk_video_type check (game_id is not null or dlc_id is not null)
);
create table if not exists game_platform (
    game_id bigint not null,
    platform_id bigint not null,
    primary key (game_id, platform_id),
    constraint fk_game_platform_game foreign key (game_id) references game(id) on delete cascade,
    constraint fk_game_platform_platform foreign key (platform_id) references platform(id) on delete cascade
);
create table if not exists game_genre (
    game_id bigint not null,
    genre_id bigint not null,
    primary key (game_id, genre_id),
    constraint fk_game_genre_game foreign key (game_id) references game(id) on delete cascade,
    constraint fk_game_genre_genre foreign key (genre_id) references genre(id) on delete cascade
);
create table if not exists game_tag (
    game_id bigint not null,
    tag_id bigint not null,
    primary key (game_id, tag_id),
    constraint fk_game_tag_game foreign key (game_id) references game(id) on delete cascade,
    constraint fk_game_tag_tag foreign key (tag_id) references tag(id) on delete cascade
);
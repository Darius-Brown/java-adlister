USE adlister_db

CREATE TABLE IF NOT EXISTS users(
id INT UNSIGNED NOT NULL AUTO_INCREMENT,
username VARCHAR(50) NOT NULL,
email VARCHAR(100) NOT NULL,
password VARCHAR(50) NOT NULL,
PRIMARY KEY (id) NOT NULL
);

CREATE TABLE IF NOT EXISTS ads(
id INT UNSIGNED NOT NULL AUTO_INCREMENT,
user_id INT unsigned NOT NULL,
FOREIGN KEY (user_id) REFERENCES users(id),
title VARCHAR(50) NOT NULL,
description VARCHAR(250) NOT NULL,
PRIMARY KEY (id) NOT NULL
    );


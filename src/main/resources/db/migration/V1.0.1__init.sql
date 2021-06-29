DROP TABLE IF EXISTS users;

CREATE TABLE users
(
    id BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    name VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
    age INT(11) NULL DEFAULT NULL COMMENT '年龄',
    email VARCHAR(50) NULL DEFAULT NULL COMMENT '邮箱',
    create_time DATETIME NULL DEFAULT NULL COMMENT '创建日期',
    PRIMARY KEY (id)
);

DELETE FROM users;

INSERT INTO users (id, `name`, age, email, create_time) VALUES
(1, 'Jone', 18, 'jone@163.com', '2020-02-09 08:20:00'),
(2, 'Jack', 20, 'jack@163.com', '2020-02-10 11:00:00'),
(3, 'Tom', 28, 'tom@163.com', '2020-03-11 06:10:00'),
(4, 'Sandy', 21, 'sandy@163.com', '2020-04-12 05:30:00'),
(5, 'Billie', 24, 'billie@163.com', '2020-05-13 03:40:00');
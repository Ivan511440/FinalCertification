Решение задания часть 2 (db)

7.задание

CREATE DATABASE IF NOT EXISTS HumanFriends;
USE HumanFriends;

8.задание

CREATE TABLE Animals(
   id INT NOT NULL AUTO_INCREMENT,
   title VARCHAR(50),
   PRIMARY KEY(id)
);

CREATE TABLE Pets(
   id INT NOT NULL AUTO_INCREMENT,
   id_animal INT,
   name VARCHAR(50),
   PRIMARY KEY(id),
   FOREIGN KEY(id_animal) REFERENCES Animals(id)
);

CREATE TABLE PackAnimals(
   id INT NOT NULL AUTO_INCREMENT,
   id_animal INT,
   name VARCHAR(50),
   PRIMARY KEY(id),
   FOREIGN KEY(id_animal) REFERENCES Animals(id)
);

CREATE TABLE ExecutedСommands(
   id INT NOT NULL AUTO_INCREMENT,
   team VARCHAR(50),
   PRIMARY KEY(id)
);

CREATE TABLE Dogs(
   id INT NOT NULL AUTO_INCREMENT,
   id_pets INT,
   nickname VARCHAR(50),
   breed VARCHAR(50),
   dateOfBirth DATE,
   id_comands INT,
   PRIMARY KEY(id),
   FOREIGN KEY(id_pets) REFERENCES Pets(id),
   FOREIGN KEY(id_comands) REFERENCES ExecutedСommands(id)
);

CREATE TABLE Cats(
   id INT NOT NULL AUTO_INCREMENT,
   id_pets INT,
   nickname VARCHAR(50),
   breed VARCHAR(50),
   dateOfBirth DATE,
   id_comands INT,
   PRIMARY KEY(id),
   FOREIGN KEY(id_pets) REFERENCES Pets(id),
   FOREIGN KEY(id_comands) REFERENCES ExecutedСommands(id)
);

CREATE TABLE Hamsters(
   id INT NOT NULL AUTO_INCREMENT,
   id_pets INT,
   nickname VARCHAR(50),
   breed VARCHAR(50),
   dateOfBirth DATE,
   id_comands INT,
   PRIMARY KEY(id),
   FOREIGN KEY(id_pets) REFERENCES Pets(id),
   FOREIGN KEY(id_comands) REFERENCES ExecutedСommands(id)
);

CREATE TABLE Horses(
   id INT NOT NULL AUTO_INCREMENT,
   id_pack_animals INT,
   nickname VARCHAR(50),
   breed VARCHAR(50),
   dateOfBirth DATE,
   id_comands INT,
   PRIMARY KEY(id),
   FOREIGN KEY(id_pack_animals) REFERENCES PackAnimals(id),
   FOREIGN KEY(id_comands) REFERENCES ExecutedСommands(id)
);

CREATE TABLE Camels(
   id INT NOT NULL AUTO_INCREMENT,
   id_pack_animals INT,
   nickname VARCHAR(50),
   breed VARCHAR(50),
   dateOfBirth DATE,
   id_comands INT,
   PRIMARY KEY(id),
   FOREIGN KEY(id_pack_animals) REFERENCES PackAnimals(id),
   FOREIGN KEY(id_comands) REFERENCES ExecutedСommands(id)
);

CREATE TABLE Donkeys(
   id INT NOT NULL AUTO_INCREMENT,
   id_pack_animals INT,
   nickname VARCHAR(50),
   breed VARCHAR(50),
   dateOfBirth DATE,
   id_comands INT,
   PRIMARY KEY(id),
   FOREIGN KEY(id_pack_animals) REFERENCES PackAnimals(id),
   FOREIGN KEY(id_comands) REFERENCES ExecutedСommands(id)
);

9.задание

INSERT Animals(title) VALUES("Домашнее животное"); -- 1
INSERT Animals(title) VALUES("Въючное животное");  -- 2

INSERT Pets(id_animal, name) VALUES(1, "Собака");  -- 1
INSERT Pets(id_animal, name) VALUES(1, "Кошка");   -- 2
INSERT Pets(id_animal, name) VALUES(1, "Хомяк");   -- 3

INSERT PackAnimals(id_animal, name) VALUES(2, "Лошадь");  -- 1
INSERT PackAnimals(id_animal, name) VALUES(2, "Верблюд"); -- 2
INSERT PackAnimals(id_animal, name) VALUES(2, "Осёл");    -- 3

INSERT ExecutedСommands(team) VALUES("Лежать");      -- 1
INSERT ExecutedСommands(team) VALUES("Сидеть");      -- 2
INSERT ExecutedСommands(team) VALUES("Голоп");       -- 3
INSERT ExecutedСommands(team) VALUES("Плеваться");   -- 4
INSERT ExecutedСommands(team) VALUES("Спать");       -- 5
INSERT ExecutedСommands(team) VALUES("Есть");        -- 6
INSERT ExecutedСommands(team) VALUES("Кричать");     -- 7

INSERT Dogs(id_pets, nickname, breed, dateOfBirth, id_comands)
VALUES(1, "Бобик", "Дворянин", "2021-12-05", 1);
INSERT Dogs(id_pets, nickname, breed, dateOfBirth, id_comands)
VALUES(1, "Бобик", "Дворянин", "2022-12-05", 2);
INSERT Cats(id_pets, nickname, breed, dateOfBirth, id_comands)
VALUES(2, "Барсик", "Шотландец", "2023-01-14", 5);
INSERT Hamsters(id_pets, nickname, breed, dateOfBirth, id_comands)
VALUES(3, "Хомка", "Беспородный", "2022-11-12", 6);
INSERT Horses(id_pack_animals, nickname, breed, dateOfBirth, id_comands)
VALUES(1, "Вихрь", "Русак", "2021-11-15", 3);
INSERT Camels(id_pack_animals, nickname, breed, dateOfBirth, id_comands)
VALUES(1, "Горбик", "Беспородный", "2020-03-18", 4);
INSERT Donkeys(id_pack_animals, nickname, breed, dateOfBirth, id_comands)
VALUES(1, "Иа", "Безпородный", "2019-06-13", 7);

10.задание

DELETE FROM Camels;

CREATE TABLE HorsesAndDonkeys AS
SELECT * FROM Horses
UNION
SELECT * FROM Donkeys;

11.задание

CREATE TABLE YoungAnimals AS
SELECT *, CONCAT(TIMESTAMPDIFF(YEAR, dateOfBirth, NOW()), " г ", TIMESTAMPDIFF(MONTH, dateOfBirth, NOW()) - (12 * TIMESTAMPDIFF(YEAR, dateOfBirth, NOW())), " м") AS age FROM Dogs
UNION
SELECT *, CONCAT(TIMESTAMPDIFF(YEAR, dateOfBirth, NOW()), " г ", TIMESTAMPDIFF(MONTH, dateOfBirth, NOW()) - (12 * TIMESTAMPDIFF(YEAR, dateOfBirth, NOW())), " м") AS age FROM Cats
UNION
SELECT *, CONCAT(TIMESTAMPDIFF(YEAR, dateOfBirth, NOW()), " г ", TIMESTAMPDIFF(MONTH, dateOfBirth, NOW()) - (12 * TIMESTAMPDIFF(YEAR, dateOfBirth, NOW())), " м") AS age FROM Hamsters
UNION
SELECT *, CONCAT(TIMESTAMPDIFF(YEAR, dateOfBirth, NOW()), " г ", TIMESTAMPDIFF(MONTH, dateOfBirth, NOW()) - (12 * TIMESTAMPDIFF(YEAR, dateOfBirth, NOW())), " м") AS age FROM Horses
UNION
SELECT *, CONCAT(TIMESTAMPDIFF(YEAR, dateOfBirth, NOW()), " г ", TIMESTAMPDIFF(MONTH, dateOfBirth, NOW()) - (12 * TIMESTAMPDIFF(YEAR, dateOfBirth, NOW())), " м") AS age FROM Camels
UNION
SELECT *, CONCAT(TIMESTAMPDIFF(YEAR, dateOfBirth, NOW()), " г ", TIMESTAMPDIFF(MONTH, dateOfBirth, NOW()) - (12 * TIMESTAMPDIFF(YEAR, dateOfBirth, NOW())), " м") AS age FROM Donkeys
WHERE TIMESTAMPDIFF(MONTH, DateOfBirth, NOW()) BETWEEN 12 AND 36;

12.задание

CREATE TABLE NewAnimals AS
SELECT nickname, breed, dateOfBirth, 'Dogs' AS oldTable FROM Dogs
UNION
SELECT nickname, breed, dateOfBirth, 'Cats' AS oldTable FROM Cats
UNION
SELECT nickname, breed, dateOfBirth, 'Hamsters' AS oldTable FROM Hamsters
UNION
SELECT nickname, breed, dateOfBirth, 'Horses' AS oldTable FROM Horses
UNION
SELECT nickname, breed, dateOfBirth, 'Camels' AS oldTable FROM Camels
UNION
SELECT nickname, breed, dateOfBirth, 'Donkeys' AS oldTable FROM Donkeys;
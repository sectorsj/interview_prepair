-- Задача про кинотеатр.

-- У фильма, который идет в кинотеатре, есть название, длительность (пусть будет 60, 90 или 120 минут), 
-- цена билета (в разное время и дни может быть разной),
-- время начала сеанса (один фильм может быть показан несколько раз в разное время и с разной ценой билета).

-- Есть информация о купленных билетах (номер билета, на какой сеанс).

-- Задания:
-- Составить грамотную нормализованную схему хранения этих данных в БД. Внести в нее 4–5 фильмов,
-- расписание на один день и несколько проданных билетов.

-- Сделать запросы, считающие и выводящие в понятном виде:

-- ошибки в расписании (фильмы накладываются друг на друга), отсортированные по возрастанию времени.

-- Выводить надо колонки «фильм 1», «время начала», «длительность», «фильм 2», «время начала», «длительность»;
-- перерывы 30 минут и более между фильмами — выводить по уменьшению длительности перерыва.
-- Колонки «фильм 1», «время начала», «длительность», «время начала второго фильма», «длительность перерыва»;


SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema sql_cinema_hw
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `sql_cinema_hw` ;

-- -----------------------------------------------------
-- Schema sql_cinema_hw
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `sql_cinema_hw` DEFAULT CHARACTER SET utf8 ;
USE `sql_cinema_hw` ;

-- -----------------------------------------------------
-- Table `sql_cinema_hw`.`date`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sql_cinema_hw`.`date` (
  `date_id` INT NOT NULL AUTO_INCREMENT,
  `date` DATE NOT NULL,
  PRIMARY KEY (`date_id`),
  UNIQUE INDEX `id_UNIQUE` (`date_id` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sql_cinema_hw`.`time`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sql_cinema_hw`.`time` (
  `time_id` INT NOT NULL AUTO_INCREMENT,
  `time` TIME NOT NULL,
  PRIMARY KEY (`time_id`),
  UNIQUE INDEX `id_UNIQUE` (`time_id` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sql_cinema_hw`.`movies`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sql_cinema_hw`.`movies` (
  `movie_id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(100) NOT NULL,
  `length` INT NOT NULL,
  PRIMARY KEY (`movie_id`),
  UNIQUE INDEX `id_UNIQUE` (`movie_id` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sql_cinema_hw`.`halls`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sql_cinema_hw`.`halls` (
  `hall_id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(45) NOT NULL,
  `seats_count` INT NULL,
  `rows_count` INT NULL,
  PRIMARY KEY (`hall_id`),
  UNIQUE INDEX `id_hall_UNIQUE` (`hall_id` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sql_cinema_hw`.`sessions`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sql_cinema_hw`.`sessions` (
  `session_id` INT NOT NULL AUTO_INCREMENT,
  `date_id` INT NOT NULL,
  `movie_id` INT NOT NULL,
  `time_id` INT NOT NULL,
  `hall_id` INT NOT NULL,
  PRIMARY KEY (`session_id`),
  INDEX `fk_sessions_movies1_idx` (`movie_id` ASC) VISIBLE,
  UNIQUE INDEX `session_id_UNIQUE` (`session_id` ASC) VISIBLE,
  INDEX `fk_sessions_time1_idx` (`time_id` ASC) VISIBLE,
  INDEX `fk_sessions_date1_idx` (`date_id` ASC) VISIBLE,
  INDEX `fk_sessions_halls1_idx` (`hall_id` ASC) VISIBLE,
  CONSTRAINT `fk_sessions_movies1`
    FOREIGN KEY (`movie_id`)
    REFERENCES `sql_cinema_hw`.`movies` (`movie_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_sessions_time1`
    FOREIGN KEY (`time_id`)
    REFERENCES `sql_cinema_hw`.`time` (`time_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_sessions_date1`
    FOREIGN KEY (`date_id`)
    REFERENCES `sql_cinema_hw`.`date` (`date_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_sessions_halls1`
    FOREIGN KEY (`hall_id`)
    REFERENCES `sql_cinema_hw`.`halls` (`hall_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sql_cinema_hw`.`hall_sectors`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sql_cinema_hw`.`hall_sectors` (
  `hall_sectors_id` INT NOT NULL AUTO_INCREMENT,
  `hall_id` INT NOT NULL,
  `title` VARCHAR(45) NOT NULL,
  `description` VARCHAR(255) NULL,
  PRIMARY KEY (`hall_sectors_id`),
  INDEX `fk_hall_sectors_halls1_idx` (`hall_id` ASC) VISIBLE,
  UNIQUE INDEX `hall_sectors_id_UNIQUE` (`hall_sectors_id` ASC) VISIBLE,
  CONSTRAINT `fk_hall_sectors_halls1`
    FOREIGN KEY (`hall_id`)
    REFERENCES `sql_cinema_hw`.`halls` (`hall_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sql_cinema_hw`.`ticket_price`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sql_cinema_hw`.`ticket_price` (
  `ticket_price_id` INT NOT NULL AUTO_INCREMENT,
  `price` DECIMAL(10,2) NOT NULL,
  `rate_title` VARCHAR(45) NULL,
  `hall_sectors_id` INT NOT NULL,
  PRIMARY KEY (`ticket_price_id`),
  UNIQUE INDEX `id_UNIQUE` (`ticket_price_id` ASC) VISIBLE,
  INDEX `fk_ticket_price_hall_sectors1_idx` (`hall_sectors_id` ASC) VISIBLE,
  CONSTRAINT `fk_ticket_price_hall_sectors1`
    FOREIGN KEY (`hall_sectors_id`)
    REFERENCES `sql_cinema_hw`.`hall_sectors` (`hall_sectors_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sql_cinema_hw`.`seats`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sql_cinema_hw`.`seats` (
  `seat_id` INT NOT NULL AUTO_INCREMENT,
  `row` INT NOT NULL,
  `seat` INT NOT NULL,
  `hall_id` INT NOT NULL,
  PRIMARY KEY (`seat_id`),
  UNIQUE INDEX `watch_hall_id_UNIQUE` (`seat_id` ASC) VISIBLE,
  INDEX `fk_seats_halls1_idx` (`hall_id` ASC) VISIBLE,
  CONSTRAINT `fk_seats_halls1`
    FOREIGN KEY (`hall_id`)
    REFERENCES `sql_cinema_hw`.`halls` (`hall_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sql_cinema_hw`.`tickets`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sql_cinema_hw`.`tickets` (
  `ticket_id` INT NOT NULL AUTO_INCREMENT,
  `ticket_price_id` INT NOT NULL,
  `session_id` INT NOT NULL,
  `seat_id` INT NOT NULL,
  `release_date` DATETIME NULL,
  `reservation` VARCHAR(45) NULL,
  `paid` VARCHAR(45) NULL,
  `destroyed` VARCHAR(45) NULL,
  `returned` VARCHAR(45) NULL,
  INDEX `fk_tickets_prices1_idx` (`ticket_price_id` ASC) VISIBLE,
  PRIMARY KEY (`ticket_id`),
  UNIQUE INDEX `tickets_id_UNIQUE` (`ticket_id` ASC) VISIBLE,
  INDEX `fk_tickets_sessions1_idx` (`session_id` ASC) VISIBLE,
  INDEX `fk_tickets_seats1_idx` (`seat_id` ASC) VISIBLE,
  CONSTRAINT `fk_tickets_prices1`
    FOREIGN KEY (`ticket_price_id`)
    REFERENCES `sql_cinema_hw`.`ticket_price` (`ticket_price_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tickets_sessions1`
    FOREIGN KEY (`session_id`)
    REFERENCES `sql_cinema_hw`.`sessions` (`session_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tickets_seats1`
    FOREIGN KEY (`seat_id`)
    REFERENCES `sql_cinema_hw`.`seats` (`seat_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sql_cinema_hw`.`clients`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sql_cinema_hw`.`clients` (
  `client_id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NULL,
  PRIMARY KEY (`client_id`),
  UNIQUE INDEX `client_id_UNIQUE` (`client_id` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sql_cinema_hw`.`schedule`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sql_cinema_hw`.`schedule` (
  `schedule_id` INT NOT NULL AUTO_INCREMENT,
  `ticket_id` INT NOT NULL,
  PRIMARY KEY (`schedule_id`),
  UNIQUE INDEX `schedule_id_UNIQUE` (`schedule_id` ASC) VISIBLE,
  INDEX `fk_schedule_tickets1_idx` (`ticket_id` ASC) VISIBLE,
  CONSTRAINT `fk_schedule_tickets1`
    FOREIGN KEY (`ticket_id`)
    REFERENCES `sql_cinema_hw`.`tickets` (`ticket_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sql_cinema_hw`.`positions`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sql_cinema_hw`.`positions` (
  `position_id` INT NOT NULL AUTO_INCREMENT,
  `position_title` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`position_id`),
  UNIQUE INDEX `position_id_UNIQUE` (`position_id` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sql_cinema_hw`.`staff`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sql_cinema_hw`.`staff` (
  `staff_id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `position_id` INT NOT NULL,
  PRIMARY KEY (`staff_id`),
  UNIQUE INDEX `staff_id_UNIQUE` (`staff_id` ASC) VISIBLE,
  INDEX `fk_staff_positions1_idx` (`position_id` ASC) VISIBLE,
  CONSTRAINT `fk_staff_positions1`
    FOREIGN KEY (`position_id`)
    REFERENCES `sql_cinema_hw`.`positions` (`position_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sql_cinema_hw`.`cashboxes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sql_cinema_hw`.`cashboxes` (
  `cashbox_id` INT NOT NULL AUTO_INCREMENT,
  `staff_id` INT NOT NULL,
  `schedule_id` INT NOT NULL,
  PRIMARY KEY (`cashbox_id`),
  UNIQUE INDEX `cashbox_id_UNIQUE` (`cashbox_id` ASC) VISIBLE,
  INDEX `fk_cashboxes_staff1_idx` (`staff_id` ASC) VISIBLE,
  INDEX `fk_cashboxes_schedule1_idx` (`schedule_id` ASC) VISIBLE,
  CONSTRAINT `fk_cashboxes_staff1`
    FOREIGN KEY (`staff_id`)
    REFERENCES `sql_cinema_hw`.`staff` (`staff_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_cashboxes_schedule1`
    FOREIGN KEY (`schedule_id`)
    REFERENCES `sql_cinema_hw`.`schedule` (`schedule_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `sql_cinema_hw`.`ticket_sale_from_cashbox`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `sql_cinema_hw`.`ticket_sale_from_cashbox` (
  `cashbox_id` INT NOT NULL,
  `client_id` INT NOT NULL,
  PRIMARY KEY (`cashbox_id`, `client_id`),
  INDEX `fk_cashboxes_has_clients_clients1_idx` (`client_id` ASC) VISIBLE,
  INDEX `fk_cashboxes_has_clients_cashboxes1_idx` (`cashbox_id` ASC) VISIBLE,
  CONSTRAINT `fk_cashboxes_has_clients_cashboxes1`
    FOREIGN KEY (`cashbox_id`)
    REFERENCES `sql_cinema_hw`.`cashboxes` (`cashbox_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_cashboxes_has_clients_clients1`
    FOREIGN KEY (`client_id`)
    REFERENCES `sql_cinema_hw`.`clients` (`client_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


USE sql_cinema_hw;

INSERT INTO `sql_cinema_hw`.`time` (`time`) VALUES ('09:00');
INSERT INTO `sql_cinema_hw`.`time` (`time`) VALUES ('10:10');
INSERT INTO `sql_cinema_hw`.`time` (`time`) VALUES ('11:20');

INSERT INTO `sql_cinema_hw`.`date` (`date`) VALUES ('2021-01-01');
INSERT INTO `sql_cinema_hw`.`date` (`date`) VALUES ('2021-01-02');
INSERT INTO `sql_cinema_hw`.`date` (`date`) VALUES ('2021-01-03');

INSERT INTO `sql_cinema_hw`.`positions` (`position_title`) VALUES ('агент');
INSERT INTO `sql_cinema_hw`.`positions` (`position_title`) VALUES ('менеджер');

INSERT INTO `sql_cinema_hw`.`staff` (`first_name`, `position_id`) VALUES ('Олег', '1');
INSERT INTO `sql_cinema_hw`.`staff` (`first_name`, `position_id`) VALUES ('Анна', '2');

INSERT INTO `sql_cinema_hw`.`clients` (`first_name`) VALUES ('Дарья');
INSERT INTO `sql_cinema_hw`.`clients` (`first_name`) VALUES ('Евгений');
INSERT INTO `sql_cinema_hw`.`clients` (`first_name`) VALUES ('Сергей');
INSERT INTO `sql_cinema_hw`.`clients` (`first_name`) VALUES ('Татьяна');
INSERT INTO `sql_cinema_hw`.`clients` (`first_name`) VALUES ('Алексей');
INSERT INTO `sql_cinema_hw`.`clients` (`first_name`) VALUES ('Наталья');

INSERT INTO `sql_cinema_hw`.`halls` (`title`, `seats_count`, `rows_count`) VALUES ('Красный зал', '10', '10');
INSERT INTO `sql_cinema_hw`.`halls` (`title`, `seats_count`, `rows_count`) VALUES ('Зеленый зал', '10', '10');

INSERT INTO `sql_cinema_hw`.`seats` (`row`, `seat`, `hall_id`) VALUES ('1', '1', '1');
INSERT INTO `sql_cinema_hw`.`seats` (`row`, `seat`, `hall_id`) VALUES ('1', '2', '1');
INSERT INTO `sql_cinema_hw`.`seats` (`row`, `seat`, `hall_id`) VALUES ('2', '1', '1');
INSERT INTO `sql_cinema_hw`.`seats` (`row`, `seat`, `hall_id`) VALUES ('2', '2', '1');
INSERT INTO `sql_cinema_hw`.`seats` (`row`, `seat`, `hall_id`) VALUES ('3', '1', '1');
INSERT INTO `sql_cinema_hw`.`seats` (`row`, `seat`, `hall_id`) VALUES ('3', '2', '1');

INSERT INTO `sql_cinema_hw`.`hall_sectors` (`hall_id`, `title`, `description`) VALUES ('1', 'сектор 1', 'текст 1');
INSERT INTO `sql_cinema_hw`.`hall_sectors` (`hall_id`, `title`, `description`) VALUES ('1', 'сектор 2', 'текст 2');
INSERT INTO `sql_cinema_hw`.`hall_sectors` (`hall_id`, `title`, `description`) VALUES ('1', 'сектор 3', 'текст 3');

INSERT INTO `sql_cinema_hw`.`movies` (`title`, `length`) VALUES ('Фильм 1', '90');
INSERT INTO `sql_cinema_hw`.`movies` (`title`, `length`) VALUES ('Фильм 2', '120');
INSERT INTO `sql_cinema_hw`.`movies` (`title`, `length`) VALUES ('Фильм 3', '60');

INSERT INTO `sql_cinema_hw`.`ticket_price` (`price`, `rate_title`, `hall_sectors_id`) VALUES ('100', 'тариф 1', '1');
INSERT INTO `sql_cinema_hw`.`ticket_price` (`price`, `rate_title`, `hall_sectors_id`) VALUES ('200', 'тариф 2', '2');
INSERT INTO `sql_cinema_hw`.`ticket_price` (`price`, `rate_title`, `hall_sectors_id`) VALUES ('300', 'тариф 3', '3');

INSERT INTO `sql_cinema_hw`.`sessions` (`date_id`, `movie_id`, `time_id`, `hall_id`) VALUES ('1', '1', '1', '1');
INSERT INTO `sql_cinema_hw`.`sessions` (`date_id`, `movie_id`, `time_id`, `hall_id`) VALUES ('1', '2', '2', '1');
INSERT INTO `sql_cinema_hw`.`sessions` (`date_id`, `movie_id`, `time_id`, `hall_id`) VALUES ('1', '3', '3', '1');

INSERT INTO `sql_cinema_hw`.`tickets` (`ticket_price_id`, `session_id`, `seat_id`, `release_date`, `reservation`, `paid`, `destroyed`, `returned`) VALUES ('1', '1', '1', '2021-01-01 07:00:00', '0', '0', '0', '0');
INSERT INTO `sql_cinema_hw`.`tickets` (`ticket_price_id`, `session_id`, `seat_id`, `release_date`, `reservation`, `paid`, `destroyed`, `returned`) VALUES ('1', '1', '2', '2021-01-01 07:00:00', '0', '0', '0', '0');
INSERT INTO `sql_cinema_hw`.`tickets` (`ticket_price_id`, `session_id`, `seat_id`, `release_date`, `reservation`, `paid`, `destroyed`, `returned`) VALUES ('1', '1', '3', '2021-01-01 07:00:00', '0', '0', '0', '0');

INSERT INTO `sql_cinema_hw`.`schedule` (`ticket_id`) VALUES ('1');
INSERT INTO `sql_cinema_hw`.`schedule` (`ticket_id`) VALUES ('2');
INSERT INTO `sql_cinema_hw`.`schedule` (`ticket_id`) VALUES ('3');

INSERT INTO `sql_cinema_hw`.`cashboxes` (`staff_id`, `schedule_id`) VALUES ('1', '1');
INSERT INTO `sql_cinema_hw`.`cashboxes` (`staff_id`, `schedule_id`) VALUES ('2', '2');
INSERT INTO `sql_cinema_hw`.`cashboxes` (`staff_id`, `schedule_id`) VALUES ('1', '3');

INSERT INTO `sql_cinema_hw`.`ticket_sale_from_cashbox` (`cashbox_id`, `client_id`) VALUES ('1', '1');
INSERT INTO `sql_cinema_hw`.`ticket_sale_from_cashbox` (`cashbox_id`, `client_id`) VALUES ('2', '2');
INSERT INTO `sql_cinema_hw`.`ticket_sale_from_cashbox` (`cashbox_id`, `client_id`) VALUES ('3', '3');






USE sql_cinema_hw;

SELECT
	title as 'Название фильма',
	time as 'Время начала сеанса',
	length as 'Длительность фильма'
FROM movies m
JOIN date d
	ON m.movie_id = d.date_id
JOIN time t
	ON m.movie_id = t.time_id;
    
















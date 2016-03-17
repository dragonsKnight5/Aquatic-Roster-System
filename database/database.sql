
/* create users table */
CREATE TABLE `users` (
  `ID` int(4) NOT NULL AUTO_INCREMENT,
  `username` varchar(65) NOT NULL,
  `first_name` varchar(65) NOT NULL,
  `last_name` varchar(65) NOT NULL,
  `department_1` varchar(25) NOT NULL,
  `department_2` varchar(25) DEFAULT NULL,
  `department_3` varchar(25) DEFAULT NULL,
  `supervisor` tinyint(1) DEFAULT NULL,
  `password` varchar(65) NOT NULL,
  PRIMARY KEY (ID),
  UNIQUE (username)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/* create lifeguards table */
CREATE TABLE `lifeguard` (
  `ID` int(4) NOT NULL AUTO_INCREMENT,
  `shift_date` date NOT NULL,
  `start_time` time NOT NULL,
  `end_time` time NOT NULL,
  `staff1` varchar(65) NOT NULL,
  `staff2` varchar(65) NOT NULL,
  `staff3` varchar(65) NOT NULL,
  PRIMARY KEY (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

ALTER TABLE `lifeguard`
  ADD KEY `staff1` (`staff1`);

ALTER TABLE `lifeguard`
  ADD CONSTRAINT `staffFK` FOREIGN KEY (`staff1`) REFERENCES `users` (`username`);
  
/* create table LTS_Shift */
 
CREATE TABLE `LTS_Shift` (
  `ID` int(4) NOT NULL AUTO_INCREMENT,
  `staff` varchar(65) NOT NULL,
  `shift_day` varchar(10) NOT NULL,
  `start_time` time NOT NULL,
  `end_time` time NOT NULL,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  PRIMARY KEY (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
   
/* create table LTS_Cover */
CREATE TABLE `LTS_Covers` (
  `ID` int(4) NOT NULL AUTO_INCREMENT,
  `cover_date` date NOT NULL,
  `start_time` time NOT NULL,
  `end_time` time NOT NULL,
  `staff` varchar(65) NOT NULL,
  `cover_for` varchar(65) NOT NULL,
  PRIMARY KEY (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/* create new user
 change address and password to desired values */
create user 'staff'@'192.168.1.%' identified by 'password';

/* change address to desired value */
grant select, insert, delete, alter on staff.* to 'staff'@'192.168.1.%';

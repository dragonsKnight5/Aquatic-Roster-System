
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

/* create location table */
CREATE TABLE `location` (
  `ID` int(4) NOT NULL AUTO_INCREMENT,
  `Location` varchar(65) NOT NULL,
  `lifeguard` tinyint(1) DEFAULT NULL,
  `lts` tinyint(1) DEFAULT NULL,
  `gym` tinyint(1) DEFAULT NULL,
  `isc` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

ALTER TABLE `location`
  ADD KEY `Location` (`Location`);

INSERT INTO `location` (`ID`, `Location`, `lifeguard`, `lts`, `gym`) VALUES (1, 'None', 1, 1, 1);

/* create lifeguards table */
CREATE TABLE `lifeguard` (
  `ID` int(4) NOT NULL AUTO_INCREMENT,
  `shift_date` date NOT NULL,
  `start_time` time NOT NULL,
  `end_time` time NOT NULL,
  `location` varchar(65) NOT NULL,
  `staff1` varchar(65) NOT NULL,
  `onCall` varchar(65) NOT NULL,
  PRIMARY KEY (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

ALTER TABLE `lifeguard`
  ADD KEY `staff1` (`staff1`),
  ADD CONSTRAINT `lifeguard_ibfk_1` FOREIGN KEY (`staff1`) REFERENCES `users` (`username`) ON UPDATE CASCADE;
  
/* create table LTS_Shift */
 
CREATE TABLE `LTS_Shift` (
  `ID` int(4) NOT NULL AUTO_INCREMENT,
  `staff` varchar(65) NOT NULL,
  `shift_day` varchar(10) NOT NULL,
  `location` varchar(65) NOT NULL,
  `start_time` time NOT NULL,
  `end_time` time NOT NULL,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  PRIMARY KEY (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

ALTER TABLE `LTS_Shift`
  ADD KEY `staff` (`staff`),
  ADD KEY `staff_2` (`staff`),
  ADD CONSTRAINT `staffFK` FOREIGN KEY (`staff`) REFERENCES `users` (`username`) ON UPDATE CASCADE;

/* create table LTS_Cover */
CREATE TABLE `LTS_Covers` (
  `ID` int(4) NOT NULL AUTO_INCREMENT,
  `cover_date` date NOT NULL,
  `start_time` time NOT NULL,
  `end_time` time NOT NULL,
  `location` varchar(65) NOT NULL,
  `staff` varchar(65) NOT NULL,
  `cover_for` varchar(65) NOT NULL,
  PRIMARY KEY (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

ALTER TABLE `LTS_Covers`
  ADD KEY `staff` (`staff`),
  ADD KEY `cover_for` (`cover_for`),
  ADD CONSTRAINT `cover_foreign_key` FOREIGN KEY (`cover_for`) REFERENCES `users` (`username`) ON UPDATE CASCADE;

/* create availability table */
CREATE TABLE `availability` (
  `ID` int(5) NOT NULL,
  `username` varchar(65) NOT NULL,
  `monday` varchar(9) DEFAULT NULL,
  `mondayNote` varchar(40) DEFAULT NULL,
  `tuesday` varchar(9) DEFAULT NULL,
  `tuesdayNote` varchar(40) DEFAULT NULL,
  `wednesday` varchar(9) DEFAULT NULL,
  `wednesdayNote` varchar(40) DEFAULT NULL,
  `thursday` varchar(9) DEFAULT NULL,
  `thursdayNote` varchar(40) DEFAULT NULL,
  `friday` varchar(9) DEFAULT NULL,
  `fridayNote` varchar(40) DEFAULT NULL,
  `saturday` varchar(9) DEFAULT NULL,
  `saturdayNote` varchar(40) DEFAULT NULL,
  `sunday` varchar(9) DEFAULT NULL,
  `sundayNote` varchar(40) DEFAULT NULL,
  `department` varchar(9) DEFAULT NULL,
  `location` varchar(65) NOT NULL,
  `weekStarting` date NOT NULL,
  Primary Key (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

ALTER TABLE `availability`
ADD KEY `username` (`username`),
ADD CONSTRAINT `usernameFK` FOREIGN KEY (`username`) REFERENCES `users` (`username`) ON UPDATE CASCADE;

/* create ISC table */
CREATE TABLE `isc` (
  `ID` int(4) NOT NULL,
  `shift_date` date NOT NULL,
  `start_time` time NOT NULL,
  `end_time` time NOT NULL,
  `location` varchar(65) NOT NULL,
  `staff1` varchar(65) NOT NULL,
  `staff2` varchar(65) NOT NULL,
  `staff3` varchar(65) NOT NULL,
  `staff4` varchar(65) NOT NULL,
  `onCall` varchar(65) NOT NULL,
  Primary Key (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

ALTER TABLE `ISC`
  ADD KEY `staff1` (`staff1`),
  ADD KEY `staff2` (`staff2`),
  ADD KEY `staff3` (`staff3`),
  ADD KEY `staff4` (`staff4`),
  ADD CONSTRAINT `staff4FK` FOREIGN KEY (`staff4`) REFERENCES `users` (`username`) ON UPDATE CASCADE,
  ADD CONSTRAINT `staff1FK` FOREIGN KEY (`staff1`) REFERENCES `users` (`username`) ON UPDATE CASCADE,
  ADD CONSTRAINT `staff2FK` FOREIGN KEY (`staff2`) REFERENCES `users` (`username`) ON UPDATE CASCADE,
  ADD CONSTRAINT `staff3FK` FOREIGN KEY (`staff3`) REFERENCES `users` (`username`) ON UPDATE CASCADE;

/* create new user
 change address and password to desired values */
create user 'staff'@'192.168.1.%' identified by 'password';

/* change address to desired value */
grant select, insert, delete, alter on staff.* to 'staff'@'192.168.1.%';
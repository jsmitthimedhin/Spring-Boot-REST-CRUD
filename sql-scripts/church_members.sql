CREATE DATABASE  IF NOT EXISTS `church_directory`;
USE `church_directory`;

--
-- Table structure for table `church`
--

DROP TABLE IF EXISTS `church`;

CREATE TABLE `church` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `church` VALUES 
	(1,'Emma','Stone','emma@test.com'),
	(2,'Henry','Cavil','henry@test.com'),
	(3,'Arundhati','Roy','arundhati@test.com'),
	(4,'Jane','Austen','jane@test.com'),
	(5,'Charles','Dickens','charles@test.com');


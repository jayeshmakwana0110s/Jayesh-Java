/*
SQLyog Ultimate v11.11 (32 bit)
MySQL - 5.1.44-community : Database - assessments
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`assessments` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `assessments`;

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Fisrt Name` varchar(30) NOT NULL,
  `Last Name` varchar(30) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Mobile` decimal(10,0) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=565 DEFAULT CHARSET=latin1;

/*Data for the table `employee` */

insert  into `employee`(`Id`,`Fisrt Name`,`Last Name`,`Email`,`Mobile`) values (1,'Jayesh','Makwana','jayesh@gmail.com',9328876344),(2,'Ajay','Makwana','ajay2@gmail.com',7635548621),(3,'Chetan','Makwana','chetan3@gmail.com',1597532648);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

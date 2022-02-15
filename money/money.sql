/*
SQLyog Ultimate v11.25 (64 bit)
MySQL - 5.7.35 : Database - money
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`money` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `money`;

/*Table structure for table `bills` */

DROP TABLE IF EXISTS `bills`;

CREATE TABLE `bills` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL,
  `billtime` date NOT NULL,
  `typeid` int(11) NOT NULL,
  `price` int(11) NOT NULL,
  `explains` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `typeid` (`typeid`),
  CONSTRAINT `bills_ibfk_1` FOREIGN KEY (`typeid`) REFERENCES `billtype` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `bills` */

insert  into `bills`(`id`,`title`,`billtime`,`typeid`,`price`,`explains`) values (1,'快递费','2021-12-01',1,-26,'快递费用'),(2,'早餐','2021-12-03',1,-10,'早餐费用'),(3,'工资','2021-12-03',2,8000,'工资收入'),(4,'1','2020-02-02',1,10,'1');

/*Table structure for table `billtype` */

DROP TABLE IF EXISTS `billtype`;

CREATE TABLE `billtype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `billtype` */

insert  into `billtype`(`id`,`name`) values (1,'支出'),(2,'收入');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

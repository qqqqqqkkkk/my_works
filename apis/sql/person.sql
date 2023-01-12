/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 8.0.27 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `person` (
	`id` int (5),
	`username` varchar (39),
	`password` varchar (39)
); 
insert into `person` (`id`, `username`, `password`) values('1','123456789','987654321');
insert into `person` (`id`, `username`, `password`) values('2','1234','4321');
insert into `person` (`id`, `username`, `password`) values('3','12345','54321');
insert into `person` (`id`, `username`, `password`) values('4','123456','654321');
insert into `person` (`id`, `username`, `password`) values('5','1234567','7654321');
insert into `person` (`id`, `username`, `password`) values('6','12345678','87654321');

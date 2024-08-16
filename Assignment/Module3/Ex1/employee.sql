/*
SQLyog Ultimate v11.11 (32 bit)
MySQL - 5.1.44-community 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `employees` (
	`Empno` int (4),
	`Ename` varchar (30),
	`Job` varchar (27),
	`Mgr` int (4),
	`Hiredate` date ,
	`Sal` Decimal (9),
	`Comm` Decimal (9),
	`Deptno` int (2)
); 

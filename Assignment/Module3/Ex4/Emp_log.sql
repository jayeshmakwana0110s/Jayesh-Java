/*
SQLyog Ultimate v11.11 (32 bit)
MySQL - 5.1.44-community 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `dept` (
	`Deptno` int (2),
	`Dname` varchar (42),
	`Loc` varchar (39)
); 
insert into `dept` (`Deptno`, `Dname`, `Loc`) values('10','ACCOUNTING','NEW YORK');
insert into `dept` (`Deptno`, `Dname`, `Loc`) values('20','RESEARCH','DALLAS');
insert into `dept` (`Deptno`, `Dname`, `Loc`) values('30','SALES','CHICAGO');
insert into `dept` (`Deptno`, `Dname`, `Loc`) values('40','OPERATIONS','BOSTON');

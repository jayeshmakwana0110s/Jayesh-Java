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
insert into `employees` (`Empno`, `Ename`, `Job`, `Mgr`, `Hiredate`, `Sal`, `Comm`, `Deptno`) values('7369','SMITH','CLERK','7902','1980-12-17','800.00',NULL,'20');
insert into `employees` (`Empno`, `Ename`, `Job`, `Mgr`, `Hiredate`, `Sal`, `Comm`, `Deptno`) values('7499','ALLEN','SALESMAN','7698','1981-02-20','1600.00','300.00','30');
insert into `employees` (`Empno`, `Ename`, `Job`, `Mgr`, `Hiredate`, `Sal`, `Comm`, `Deptno`) values('7521','WARD','SALESMAN','7698','1981-02-22','1250.00','500.00','30');
insert into `employees` (`Empno`, `Ename`, `Job`, `Mgr`, `Hiredate`, `Sal`, `Comm`, `Deptno`) values('7566','JONES','MANAGER','7839','1981-04-02','2975.00',NULL,'20');
insert into `employees` (`Empno`, `Ename`, `Job`, `Mgr`, `Hiredate`, `Sal`, `Comm`, `Deptno`) values('7654','MARTIN','SALESMAN','7698','1981-09-28','1250.00','1400.00','30');
insert into `employees` (`Empno`, `Ename`, `Job`, `Mgr`, `Hiredate`, `Sal`, `Comm`, `Deptno`) values('7698','BLAKE','MANAGER','7839','1981-05-01','2850.00',NULL,'30');
insert into `employees` (`Empno`, `Ename`, `Job`, `Mgr`, `Hiredate`, `Sal`, `Comm`, `Deptno`) values('7782','CLARK','MANAGER','7839','1981-06-09','2450.00',NULL,'10');
insert into `employees` (`Empno`, `Ename`, `Job`, `Mgr`, `Hiredate`, `Sal`, `Comm`, `Deptno`) values('7788','SCOTT','ANALYST','7566','1987-06-11','3000.00',NULL,'20');
insert into `employees` (`Empno`, `Ename`, `Job`, `Mgr`, `Hiredate`, `Sal`, `Comm`, `Deptno`) values('7839','KING','PRESIDENT',NULL,'1981-11-17','5000.00',NULL,'10');
insert into `employees` (`Empno`, `Ename`, `Job`, `Mgr`, `Hiredate`, `Sal`, `Comm`, `Deptno`) values('7844','TURNER','SALESMAN','7698','1981-08-09','1500.00','0.00','30');
insert into `employees` (`Empno`, `Ename`, `Job`, `Mgr`, `Hiredate`, `Sal`, `Comm`, `Deptno`) values('7876','ADAMS','CLERK','7788','1987-07-13','1100.00',NULL,'20');

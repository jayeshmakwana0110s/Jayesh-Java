SELECT DISTINCT Job FROM employees;

SELECT * FROM employees ORDER BY Deptno ASC, Job DESC;

SELECT DISTINCT Job FROM employees ORDER BY Job DESC;

SELECT * FROM employees WHERE hiredate < '1981-01-01';

SELECT Empno, Ename, Sal, 
       ROUND(Sal/30) AS "Daily Sal", 
       ROUND(Sal*12) AS "Annsal"
FROM employees 
ORDER BY "Annsal" ASC;

SELECT Empno, Ename, Sal, 
       (YEAR(CURDATE()) - YEAR(hiredate)) AS "Exp"
FROM employees 
WHERE Mgr = 7369;

SELECT * FROM employees WHERE Comm > Sal;

SELECT * FROM employees WHERE Job IN ('CLERK', 'ANALYST') ORDER BY Ename DESC;

SELECT * FROM employees WHERE (Sal * 12) BETWEEN 22000 AND 45000;

SELECT Ename FROM employees WHERE Ename LIKE 'S____';

SELECT * FROM employees WHERE Empno NOT LIKE '78%';

SELECT * FROM employees WHERE Job = 'CLERK' AND Deptno = 20;

SELECT e.* 
FROM employees e 
JOIN EMP m ON e.Mgr = m.Empno 
WHERE e.hiredate < m.hiredate;

SELECT * 
FROM employees 
WHERE Job IN (SELECT Job FROM EMP WHERE Deptno = 10) 
AND Deptno = 20;

SELECT * 
FROM employees 
WHERE Sal IN (SELECT Sal FROM EMP WHERE Ename IN ('FORD', 'SMITH')) 
ORDER BY Sal DESC;

SELECT * 
FROM employees 
WHERE Job IN (SELECT Job FROM EMP WHERE Ename IN ('SMITH', 'ALLEN'));

SELECT DISTINCT Job 
FROM employees 
WHERE Deptno = 10 
AND Job NOT IN (SELECT Job FROM EMP WHERE Deptno = 20);

SELECT MAX(Sal) AS Highest_Salary FROM EMP;

SELECT * 
FROM employees 
WHERE Sal = (SELECT MAX(Sal) FROM EMP);

SELECT SUM(Sal) AS Total_Salary 
FROM employees 
WHERE Empno IN (SELECT DISTINCT Mgr FROM EMP);

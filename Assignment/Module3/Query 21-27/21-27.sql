SELECT * FROM employees WHERE Ename LIKE '%A%';

SELECT Ename, Job, Sal 
FROM employees 
WHERE (Job, Sal) IN (SELECT Job, MIN(Sal) FROM EMP GROUP BY Job) 
ORDER BY Sal ASC;

SELECT * 
FROM employees 
WHERE Sal > (SELECT Sal FROM EMP WHERE Ename = 'BLAKE');

CREATE VIEW v1 AS 
SELECT e.Ename, e.Job, d.Dname, d.Loc 
FROM employees e 
JOIN DEPT d ON e.Deptno = d.Deptno;

CREATE PROCEDURE GetEmployeeDetails (@dno INT)
AS
BEGIN
    SELECT e.Ename, d.Dname 
    FROM employees e 
    JOIN DEPT d ON e.Deptno = d.Deptno 
    WHERE e.Deptno = @dno;
END;



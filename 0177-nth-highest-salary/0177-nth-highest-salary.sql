CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
SET N = N - 1;
  RETURN (
      # Write your MySQL query statement below.
    select (Select DISTINCT salary from Employee order by salary desc LIMIT 1 OFFSET N)
  );
END
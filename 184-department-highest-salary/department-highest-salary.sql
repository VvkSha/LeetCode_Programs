/* Write your PL/SQL query statement below */




select dep.name as Department , emp.name as Employee , emp.salary as Salary
from (select id,name,salary,departmentId , dense_rank() over (partition by departmentId  order by salary desc) as rnk
from employee) emp join Department dep on emp.departmentId = dep.id where emp.rnk = 1;





-- select dep.name as Department , emp.name as Employee , emp.salary as Salary
-- from Employee emp, Department dep where emp.departmentId = dep.id
-- and emp.salary = (
--     select max(e.salary) from 
--     employee e where e.departmentId = emp.departmentId);


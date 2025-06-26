/* Write your PL/SQL query statement below */

select NVL((select salary as SecondHighestSalary from 
    (select distinct salary, dense_RANK() over ( order by salary desc) as rnk  from employee) emp 
    where rnk = 2), null) as SecondHighestSalary  from dual;

-- select salary as SecondHighestSalary from 
--     (select salary, ROW_NUMBER() over ( order by salary desc) as rnk  from employee) emp 
--     where rnk = 2;


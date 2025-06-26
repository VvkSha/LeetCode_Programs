/* Write your PL/SQL query statement below */

select emp.name Employee  from
Employee emp,
Employee mang
where emp.managerId = mang.id and emp.salary>mang.salary;

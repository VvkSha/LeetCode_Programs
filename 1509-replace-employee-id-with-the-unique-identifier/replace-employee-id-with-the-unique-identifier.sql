/* Write your PL/SQL query statement below */

select empu.unique_id, emp.name
from Employees emp left join EmployeeUNI empu
on emp.id = empu.id
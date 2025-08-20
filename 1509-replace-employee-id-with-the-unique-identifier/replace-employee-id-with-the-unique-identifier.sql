/* Write your PL/SQL query statement below */

select empu.unique_id, emp.name
from Employees emp left outer join EmployeeUNI empu
on emp.id = empu.id
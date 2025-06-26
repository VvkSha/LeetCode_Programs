/* Write your PL/SQL query statement below */

-- select name as Customers from Customers c 
-- left join Orders o on o.customerId  = c.id where o.customerId is null;

select name as Customers from Customers c
where not exists (select 1 from Orders o where o.customerId = c.id)
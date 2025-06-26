/* Write your PL/SQL query statement below */

select name as Customers from Customers c 
left join Orders o on o.customerId  = c.id where o.customerId is null;
/* Write your PL/SQL query statement below */

select email as EMAIL from person
group by email having count(email)>1;
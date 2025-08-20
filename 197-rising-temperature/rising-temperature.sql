/* Write your PL/SQL query statement below */


select w1.id from weather w1 join weather w2
on w1.recordDate = w2.recordDate + 1
where w1.temperature > w2.temperature;
-- select temp_table.id as 'Id' from(
-- select id, temperature, LAG(temperature) over (order by recordDate) as prev_temp
-- from weather
-- ) temp_table where temperature > prev_temp;
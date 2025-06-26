/* Write your PL/SQL query statement below */


select player_id, min(to_char(event_date, 'yyyy-MM-dd')) as first_login from Activity
group by player_id;
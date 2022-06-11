# Write your MySQL query statement below
select employee_id
from(select employee_id from employees union all select employee_id from salaries)t
group by employee_id
having count(*)=1
order by 1
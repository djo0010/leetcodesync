# Write your MySQL query statement below
Select e.employee_id
From Employees e
where e.salary < 30000 and manager_id not in (Select e2.employee_id from Employees e2)
order by e.employee_id

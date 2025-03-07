# Write your MySQL query statement below
Select p.project_id, round(avg(e.experience_years),2) as average_years
From Project p, Employee e
where p.employee_id = e.employee_id
group by p.project_id


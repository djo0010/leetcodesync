# Write your MySQL query statement below
Select v.customer_id, count(v.visit_id) as count_no_trans 
From Visits v
Where v.visit_id not in (Select t.visit_id from Transactions t)
group by v.customer_id

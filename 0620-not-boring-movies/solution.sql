# Write your MySQL query statement below
Select *
From Cinema
Where Cinema.description != 'boring' and Cinema.id % 2 = 1
Group by Cinema.rating
order by -1 * Cinema.rating

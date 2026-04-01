# Write your MySQL query statement below

Select l1.user_id as user_id from
(select count(user_id) as c, user_id from Loans where loan_type="Mortgage" group by user_id having count(user_id)>0) as l1
inner join
(select count(user_id) as c, user_id from Loans where loan_type="Refinance" group by user_id having count(user_id)>0) as l2
on l1.user_id = l2.user_id  order by l1.user_id


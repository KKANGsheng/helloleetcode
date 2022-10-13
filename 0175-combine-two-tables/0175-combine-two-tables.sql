/* Write your T-SQL query statement below */
select Person.firstname,Person.lastname,Address.city,Address.State
from Person
left join Address
on Person.personId=Address.personId;
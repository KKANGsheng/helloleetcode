# Write your MySQL query statement below

SELECT world.name,world.population,world.area
from world
where world.population >=25000000
OR world.area>=3000000;
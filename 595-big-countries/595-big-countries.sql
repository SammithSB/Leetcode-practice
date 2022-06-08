# Write your MySQL query statement below
# select area, name, population from World where area >= 3000000 or population >= 25000000

# another solutio would be to use Union

select area, name, population from World where area >= 3000000 
UNION 
select area, name, population from World where population >= 25000000
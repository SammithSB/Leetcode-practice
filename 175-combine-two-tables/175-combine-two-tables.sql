# Write your MySQL query statement below
SELECT FirstName, LastName, City, State
FROM Person
LEFT JOIN Address
ON Person.PersonId = Address.PersonId

# left join because for left join only values from left table have to be there and if value not present in right table, it will be null
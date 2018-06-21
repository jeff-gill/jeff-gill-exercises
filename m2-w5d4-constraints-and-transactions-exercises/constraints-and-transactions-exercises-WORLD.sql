-- Write queries to return the following:
-- Make the following changes in the "world" database.

-- 1. Add Superman's hometown, Smallville, Kansas to the city table. The 
-- countrycode is 'USA', and population of 45001. (Yes, I looked it up on 
-- Wikipedia.)

insert into city (id, name, district, countrycode, population)
Values (4080, 'Smallville', 'Kansas', 'USA', 45001);

-- 2. Add Kryptonese to the countrylanguage table. Kryptonese is spoken by 0.0001
-- percentage of the 'USA' population.

insert into countrylanguage (countrycode, language, isofficial, percentage)
values ('USA', 'Kryptonese', false, 0.0001)

-- 3. After heated debate, "Kryptonese" was renamed to "Krypto-babble", change 
-- the appropriate record accordingly.

update countrylanguage set language = 'Krypto-babble'
where percentage = '0.0001' AND countrycode = 'USA'

-- 4. Set the US captial to Smallville, Kansas in the country table.

update country set capital = 4080

-- 5. Delete Smallville, Kansas from the city table. (Did it succeed? Why?)

Delete from city
where name = 'Smallville' 

NO. [Code: , SQL State: 23503]  ERROR: update or delete on table "city" violates foreign key constraint "country_capital_fkey" on table "country"
  Detail: Key (id)=(4080) is still referenced from table "country".
  
  need to remove it from the US capital field on the country table


-- 6. Return the US captial to Washington.

update country set capital = '3813'
where code = 'USA'

-- 7. Delete Smallville, Kansas from the city table. (Did it succeed? Why?)

delete from city 
where name = 'Smallville'

yes.it worked because it was not connected to any other foreign keys

-- 8. Reverse the "is the official language" setting for all languages where the
-- country's year of independence is within the range of 1800 and 1972 
-- (exclusive). 
-- (590 rows affected)

update countrylanguage set isofficial = not isofficial
where countrycode in (select code from country where indepyear Between 1800 and 1972)

-- 9. Convert population so it is expressed in 1,000s for all cities. (Round to
-- the nearest integer value greater than 0.)
-- (4079 rows affected)

update city set population = (population / 1000)

-- 10. Assuming a country's surfacearea is expressed in miles, convert it to 
-- meters for all countries where French is spoken by more than 20% of the 
-- population.

update country set  surfacearea = (surfacearea / 0.00062137)
where code in (select countrycode from countrylanguage where language = 'French' and percentage > 0.2)

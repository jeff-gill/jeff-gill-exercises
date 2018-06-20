-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)

Select film.title from actor
Join film_actor on actor.actor_id = film_actor.actor_id
join film on film.film_id = film_actor.film_id
Where first_name = 'NICK' and last_name = 'STALLONE'

-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)

select film.title from actor
join film_actor on actor.actor_id = film_actor.actor_id
join film on film_actor.film_id = film.film_id
where first_name = 'RITA' and last_name = 'REYNOLDS'

-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)

select film.title from actor
join film_actor on actor.actor_id = film_actor.actor_id
join film on film_actor.film_id = film.film_id
where last_name = 'DEAN' and (first_name = 'RIVER' or first_name = 'JUDY')

-- 4. All of the the ‘Documentary’ films
-- (68 rows)

select film.title from film
join film_category on film.film_id = film_category.film_id
join category on film_category.category_id = category.category_id
where category.name = 'Documentary'

-- 5. All of the ‘Comedy’ films
-- (58 rows)

select film.title from film
join film_category on film.film_id = film_category.film_id
join category on film_category.category_id = category.category_id
where category.name = 'Comedy'

-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)

select film.title from film
join film_category on film.film_id = film_category.film_id
join category on film_category.category_id = category.category_id
where category.name = 'Children' and film.rating = 'G'

-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)

select film.title from film
join film_category on film.film_id = film_category.film_id
join category on film_category.category_id = category.category_id
where category.name = 'Family' and film.rating = 'G' and film.length < 120

-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)

Select film.title from actor
Join film_actor on actor.actor_id = film_actor.actor_id
join film on film.film_id = film_actor.film_id
Where first_name = 'MATTHEW' and last_name = 'LEIGH' and film.rating = 'G'

-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)

Select film.title from film
join film_category on film.film_id = film_category.film_id
join category on film_category.category_id = category.category_id
where category.name = 'Sci-Fi' and film.release_year = 2006

-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)

select * from actor
join film_actor on actor.actor_id = film_actor.actor_id
join film on film_actor.film_id = film.film_id
join film_category on film.film_id = film_category.film_id
join category on film_category.category_id = category.category_id
where category.name = 'Action' and actor.first_name = 'NICK' and actor.last_name = 'STALLONE'


-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)

select (address.address || ', ' || city.city || ', ' || address.district || ', ' || country.country) from store
join address on store.address_id = address.address_id
join city on address.city_id = city.city_id
join country on city.country_id = country.country_id



-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)

-- 13. The first and last name of the top ten customers ranked by number of rentals 
-- (#1 should be “ELEANOR HUNT” with 46 rentals, #10 should have 39 rentals)

-- 14. The first and last name of the top ten customers ranked by dollars spent 
-- (#1 should be “KARL SEAL” with 221.55 spent, #10 should be “ANA BRADLEY” with 174.66 spent)

-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store 
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)

-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD” with 34 rentals and #10 should have 31 rentals)

-- 17. The top five film categories by number of rentals 
--(#1 should be “Sports” with 1179 rentals and #5 shouSelect category.name, count(rental.rental_id) as rental_count be “Family” with 1096 rentals)

select category.name from film
join inventory on film.film_id = inventory.film_id
join rental on inventory.inventory_id = rental.inventory_id
join film_category on film.film_id = film_category.film_id
join category on film_category.category_id = category.category_id
group by category.name
order by rental_inventory desc
Limit 5


-- 18. The top five Action film titles by number of rentals 
-- (#1 should have 30 rentals and #5 should have 28 rentals)

-- 19. The top 10 actors ranked by number of rentals of films starring that actor 
-- (#1 should be “GINA DEGENERES” with 753 rentals and #10 should be “SEAN GUINESS” with 599 rentals)

-- 20. The top 5 “Comedy” actors ranked by number of rentals of films in the “Comedy” category starring that actor 
-- (#1 should have 87 rentals and #5 should have 72 rentals)

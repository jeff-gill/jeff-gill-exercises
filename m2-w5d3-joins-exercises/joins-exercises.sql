-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)

Select film.title as nick_stallones_films from actor
Join film_actor on actor.actor_id = film_actor.actor_id
join film on film.film_id = film_actor.film_id
Where first_name = 'NICK' and last_name = 'STALLONE'

-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)

select film.title as rita_reynolds_films from actor
join film_actor on actor.actor_id = film_actor.actor_id
join film on film_actor.film_id = film.film_id
where first_name = 'RITA' and last_name = 'REYNOLDS'

-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)

select film.title as judy_dean_and_river_dean_films from actor
join film_actor on actor.actor_id = film_actor.actor_id
join film on film_actor.film_id = film.film_id
where last_name = 'DEAN' and (first_name = 'RIVER' or first_name = 'JUDY')

-- 4. All of the the ‘Documentary’ films
-- (68 rows)

select film.title as documentary_films from film
join film_category on film.film_id = film_category.film_id
join category on film_category.category_id = category.category_id
where category.name = 'Documentary'

-- 5. All of the ‘Comedy’ films
-- (58 rows)

select film.title as comedy_films from film
join film_category on film.film_id = film_category.film_id
join category on film_category.category_id = category.category_id
where category.name = 'Comedy'

-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)

select film.title as childrens_films_rated_g from film
join film_category on film.film_id = film_category.film_id
join category on film_category.category_id = category.category_id
where category.name = 'Children' and film.rating = 'G'

-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)

select film.title as childrens_films_rated_g_and_less_than_2_hours from film
join film_category on film.film_id = film_category.film_id
join category on film_category.category_id = category.category_id
where category.name = 'Family' and film.rating = 'G' and film.length < 120

-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)

Select film.title as matthew_leigh_films_rated_g from actor
Join film_actor on actor.actor_id = film_actor.actor_id
join film on film.film_id = film_actor.film_id
Where first_name = 'MATTHEW' and last_name = 'LEIGH' and film.rating = 'G'

-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)

Select film.title as sci_fi_films from film
join film_category on film.film_id = film_category.film_id
join category on film_category.category_id = category.category_id
where category.name = 'Sci-Fi' and film.release_year = 2006

-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)

select film.title as action_films from actor
join film_actor on actor.actor_id = film_actor.actor_id
join film on film_actor.film_id = film.film_id
join film_category on film.film_id = film_category.film_id
join category on film_category.category_id = category.category_id
where category.name = 'Action' and actor.first_name = 'NICK' and actor.last_name = 'STALLONE'


-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)

select address.address, city.city, address.district, country.country from store
join address on store.address_id = address.address_id
join city on address.city_id = city.city_id
join country on city.country_id = country.country_id



-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)

select store.store_id, address.address, city.city, address.district, (staff.first_name || ' ' || staff.last_name) as managers_name from address
join store on address.address_id = store.address_id
join staff on store.store_id = staff.store_id
join city on address.city_id = city.city_id

-- 13. The first and last name of the top ten customers ranked by number of rentals 
-- (#1 should be “ELEANOR HUNT” with 46 rentals, #10 should have 39 rentals)


select (customer.first_name || ' ' || customer.last_name) as actor_name, count(rental_date)  from customer
join rental on customer.customer_id = rental.customer_id
group by customer.first_name, customer.last_name
order by count(rental_date) desc
Limit 10

-- 14. The first and last name of the top ten customers ranked by dollars spent 
-- (#1 should be “KARL SEAL” with 221.55 spent, #10 should be “ANA BRADLEY” with 174.66 spent)

select (customer.first_name || ' ' || customer.last_name) as actor_name, sum(payment.amount) as dollars_spent  from customer
join rental on customer.customer_id = rental.customer_id
join payment on rental.rental_id = payment.rental_id
group by customer.first_name, customer.last_name
order by sum(payment.amount) desc
Limit 10

-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store 
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)

select store.store_id, address.address, count(payment.amount) as number_of_rentals , round(sum(payment.amount),2) as amount_of_sales, round(avg(payment.amount),2) as average_sale_per_store from address
join store on address.address_id = store.address_id
join inventory on store.store_id = inventory.store_id
join rental on inventory.inventory_id = rental.inventory_id
join payment on rental.rental_id = payment.rental_id
group by store.store_id, address.address

-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD” with 34 rentals and #10 should have 31 rentals)

select film.title, count(rental.rental_id) as count_of_rentals from film
join inventory on film.film_id = inventory.film_id 
join rental on inventory.inventory_id = rental.inventory_id
group by film.title
order by count(rental.rental_id) desc
limit 10

-- 17. The top five film categories by number of rentals 
--(#1 should be “Sports” with 1179 rentals and #5 shouSelect category.name, count(rental.rental_id) as rental_count be “Family” with 1096 rentals)

select category.name, count(category.category_id) as number_of_rentals from category
join film_category on category.category_id = film_category.category_id
join film on film_category.film_id = film.film_id
join inventory on film.film_id = inventory.film_id
join rental on inventory.inventory_id = rental.inventory_id
join payment on rental.rental_id = payment.rental_id
group by category.name
order by count(rental.rental_id) desc
limit 5

-- 18. The top five Action film titles by number of rentals 
-- (#1 should have 30 rentals and #5 should have 28 rentals)

select film.title, count(category.category_id) as number_of_rentals from category
join film_category on category.category_id = film_category.category_id
join film on film_category.film_id = film.film_id
join inventory on film.film_id = inventory.film_id
join rental on inventory.inventory_id = rental.inventory_id
join payment on rental.rental_id = payment.rental_id
where category.name = 'Action'
group by film.title, category.name
order by count(rental.rental_id) desc
limit 5

-- 19. The top 10 actors ranked by number of rentals of films starring that actor 
-- (#1 should be “GINA DEGENERES” with 753 rentals and #10 should be “SEAN GUINESS” with 599 rentals)

select (actor.first_name || ' ' || actor.last_name)  as actor_name , count(rental.rental_id) as number_of_rentals from actor
join film_actor on actor.actor_id = film_actor.actor_id
join film on film_actor.film_id = film.film_id
join inventory on film.film_id = inventory.film_id
join rental on inventory.inventory_id = rental.inventory_id
join payment on rental.rental_id = payment.rental_id
group by actor.actor_id
order by count(rental.rental_id) desc
limit 10

-- 20. The top 5 “Comedy” actors ranked by number of rentals of films in the “Comedy” category starring that actor 
-- (#1 should have 87 rentals and #5 should have 72 rentals)

select (actor.first_name || ' ' || actor.last_name)  as actor_name, count(rental.rental_id) as number_of_rentals from actor
join film_actor on actor.actor_id = film_actor.actor_id
join film on film_actor.film_id = film.film_id
join film_category on film.film_id = film_category.film_id
join category on film_category.category_id = category.category_id
join inventory on film.film_id = inventory.film_id
join rental on inventory.inventory_id = rental.inventory_id
join payment on rental.rental_id = payment.rental_id
where category.name ='Comedy'
group by actor.actor_id
order by count(rental.rental_id) desc
limit 5

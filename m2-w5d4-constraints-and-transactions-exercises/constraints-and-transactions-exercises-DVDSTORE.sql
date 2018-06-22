-- Write queries to return the following:
-- The following changes are applied to the "pagila" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.


insert into actor (actor_id, first_name, last_name)
Values (201, 'HAMPTON', 'AVENUE')

insert into actor (actor_id, first_name, last_name)
Values (202, 'LISA', 'BYWAY')

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece", to the film table. The movie was released in 2008 in English. 
-- Since its an epic, the run length is 3hrs and 18mins. There are no special 
-- features, the film speaks for itself, and doesn't need any gimmicks.	

insert into film (title, description, release_year, language_id, length)
values ('Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, 1, 198)

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly 
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.

insert into film_actor (actor_id, film_id)
values (201, 1001)

insert into film_actor (actor_id, film_id)
values (202, 1001)

-- 4. Add Mathmagical to the category table.

insert into category (name)
values ('Mathmagical')

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI", 
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

update film_category set category_id = 17
where film_id = 274 or film_id = 494 or film_id = 714 or film_id = 996 or film_id = 1001

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films 
-- accordingly.
-- (5 rows affected)

 update film set rating = 'G'
where film_id in (select film_id from category where category_id = 17) 

-- 7. Add a copy of "Euclidean PI" to all the stores.


insert into inventory (film_id, store_ID)
values (1001, 1)

insert into inventory (film_id, store_ID)
values (1001, 2)


-- 8. The Feds have stepped in and have impounded all copies of the pirated film, 
-- "Euclidean PI". The film has been seized from all stores, and needs to be 
-- deleted from the film table. Delete "Euclidean PI" from the film table. 
-- (Did it succeed? Why?)

Delete from film
where title = 'Euclidean PI'

no. because it is now tied to the film actor table and the inventory table

-- 9. Delete Mathmagical from the category table. 
-- (Did it succeed? Why?)

Delete from category
where category_id =  17

not at first. because it needed to be deleted from film_category first.
i did exercise 10, then came back and it worked.

-- 10. Delete all links to Mathmagical in the film_category tale. 
-- (Did it succeed? Why?


Delete from film_category
where category_id =  17

yes. 

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI". 
-- (Did either deletes succeed? Why?)


delete from category
where name = 'Mathmagical'

this worked above

delete from film
where title like 'Euclidean PI'

no. need to delete the key from fim_actor first


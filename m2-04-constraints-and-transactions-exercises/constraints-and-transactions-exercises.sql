-- Write queries to return the following:
-- The following changes are applied to the "pagila" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
insert into actor(actor_id, first_name, last_name) values (201, 'Hampton','Avenue');
insert into actor(actor_id, first_name, last_name) values (202, 'Lisa', 'Byway');

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece", to the film table. The movie was released in 2008 in English. 
-- Since its an epic, the run length is 3hrs and 18mins. There are no special 
-- features, the film speaks for itself, and doesn't need any gimmicks.	
select * from film where film_id > 990;
insert into film(title, description, release_year, language_id, length) values ('Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, 1, 198);

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly 
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
insert into film_actor (actor_id, film_id) values(201, 1001);
insert into film_actor (actor_id, film_id) values(202, 1001);
-- 4. Add Mathmagical to the category table.
insert into category(name) values('Mathmagical');


-- 5. Assign the Mathmagical category to the following films, "Euclidean PI", 
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
select * from film where title IS 'EGG IGBY' AND 'KARATE MOON' AND 'RANDOM GO' AND 'YOUNG LANGUAGE';
--274, 494, 714, 996
insert into film_category (film_id, category_id) values (274, 17);
insert into film_category (film_id, category_id) values (494, 17);
insert into film_category (film_id, category_id) values (714, 17);
insert into film_category (film_id, category_id) values (996, 17);

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films 
-- accordingly.
-- (5 rows affected)
select category_id, film_id
from film_category
where category_id = 17;


update film
set rating = 'G'
where film_id = 274;

update film
set rating = 'G'
where film_id = 274 and film_id = 494 and film_id = 714 and film_id = 996;

-- 7. Add a copy of "Euclidean PI" to all the stores.
insert into inventory(film_id, store_id) values (1001, 1);
insert into inventory(film_id, store_id) values (1001, 2);


-- 8. The Feds have stepped in and have impounded all copies of the pirated film, 
-- "Euclidean PI". The film has been seized from all stores, and needs to be 
-- deleted from the film table. Delete "Euclidean PI" from the film table. 
-- (Did it succeed? Why?)
DELETE FROM film WHERE title = 'Euclidean PI';
--no it did not delete because it violates foreign key constraint " on table film_actor

-- 9. Delete Mathmagical from the category table. 
-- (Did it succeed? Why?)
DELETE FROM category WHERE name = 'Mathmagical';
--no because it violates the foreign key constraint on gilm_category_category_id_fkey on table film_category

-- 10. Delete all links to Mathmagical in the film_category tale. 
-- (Did it succeed? Why?)
DELETE FROM film_category WHERE category_id = 17;
--this worked because it is not the only key in the category and all other field pull from film_category so you are deleting all other existing data.


-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI". 
-- (Did either deletes succeed? Why?)
DELETE FROM category WHERE name = 'Mathmagical';
--this worked because we deleted the category_id aka the key for this category name. so it needed to be updated. 
DELETE FROM film WHERE title = 'Euclidean PI';
--this did not work because again this violatees foreign ey constraints, we would also have to delete the film id

-- 12. Check database metadata to determine all constraints of the film id, and 
-- describe any remaining adjustments needed before the film "Euclidean PI" can 
-- be removed from the film table.
--we would need to delete the film_id key from film_category before deleting the title in the film category because film_id is the primary key.


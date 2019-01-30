-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)

--select f.title, fc.*
--from film f
--inner join film_category fc on f.film_id = fc.film_id
--inner join category c on fc.category_id = c.category_id
--order by title, name;

select f.title
from film f
inner join film_actor fa on f.film_id = fa.film_id
inner join actor a on fa.actor_id = a.actor_id
where a.first_name = 'NICK' and a.last_name = 'STALLONE'
order by f.title;


-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)
select f.title
from film f
inner join film_actor fa on f.film_id = fa.film_id
inner join actor a on fa.actor_id = a.actor_id
where first_name = 'RITA' and last_name = 'REYNOLDS'
order by f.title;

-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)

select f.title
from film f
inner join film_actor fa on f.film_id = fa.film_id
inner join actor a on fa.actor_id = a.actor_id
where first_name = 'JUDY' OR first_name = 'RIVER' and last_name = 'DEAN'
order by f.title;

-- 4. All of the the ‘Documentary’ films
-- (68 rows)
select f.title, fc.*
from film f
inner join film_category fc on f.film_id = fc.film_id
inner join category c on fc.category_id = c.category_id
where c.category_id = 6
order by title, name;



-- 5. All of the ‘Comedy’ films
-- (58 rows)

select f.title, fc.*
from film f
inner join film_category fc on f.film_id = fc.film_id
inner join category c on fc.category_id = c.category_id
where c.category_id = 5
order by title, name;

-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)
select f.title, fc.*
from film f
inner join film_category fc on f.film_id = fc.film_id
inner join category c on fc.category_id = c.category_id
where f.rating = 'G' and c.category_id = 3
order by title, name;

-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)

select f.title, fc.*
from film f
inner join film_category fc on f.film_id = fc.film_id
inner join category c on fc.category_id = c.category_id
where f.rating = 'G' and c.category_id = 8 and f.length < 120
order by title, name;


-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)

select f.title, fc.*
from film f
inner join film_category fc on f.film_id = fc.film_id
inner join category c on fc.category_id = c.category_id
inner join film_actor fa on f.film_id = fa.film_id
inner join actor a on fa.actor_id = a.actor_id
where f.rating = 'G' and a.first_name = 'MATTHEW' and a.last_name = 'LEIGH'
order by title, name;


-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)
select f.title, fc.*
from film f
inner join film_category fc on f.film_id = fc.film_id
inner join category c on fc.category_id = c.category_id
where c.category_id = '14' and release_year = 2006
order by title, name;

-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)
select f.title, fc.*
from film f
inner join film_category fc on f.film_id = fc.film_id
inner join category c on fc.category_id = c.category_id
inner join film_actor fa on f.film_id = fa.film_id
inner join actor a on fa.actor_id = a.actor_id
where c.category_id = 1 and a.first_name = 'NICK' and a.last_name = 'STALLONE'
order by title, name;

-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)

select a.address, c.city, cty.country
from store s
inner join address a on a.address_id = s.address_id
inner join city c on c.city_id = a.city_id
inner join country cty on c.country_id = cty.country_id
order by a.address, c.city_id, a.district, cty.country;

-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)
select s.store_id, a.address, c.city, cty.country
from store s
inner join address a on a.address_id = s.address_id
inner join city c on c.city_id = a.city_id
inner join country cty on c.country_id = cty.country_id
order by s.store_id, a.address, c.city, a.district, cty.country;

-- 13. The first and last name of the top ten customers ranked by number of rentals 
-- (#1 should be “ELEANOR HUNT” with 46 rentals, #10 should have 39 rentals)
SELECT c.first_name, c.last_name, count(rental.rental_id) as total_rentals
FROM customer c
JOIN rental on rental.customer_id = c.customer_id
group by c.first_name, c.last_name
order by total_rentals desc limit 10;

-- 14. The first and last name of the top ten customers ranked by dollars spent 
-- (#1 should be “KARL SEAL” with 221.55 spent, #10 should be “ANA BRADLEY” with 174.66 spent)
SELECT c.first_name, c.last_name, sum(p.amount) as total_amount
from customer c
join payment p on p.customer_id = c.customer_id
group by c.first_name, c.last_name
order by total_amount desc limit 10;

-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store 
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)
SELECT s.store_id, a.address, count(rental.rental_id) as total_rentals, sum(p.amount) as total_sales
from customer c
join store s on s.store_id = c.store_id
join payment p on p.customer_id = c.customer_id
join address a on a.address_id = s.address_id
JOIN rental on rental.customer_id = c.customer_id
group by s.store_id, a.address
order by total_rentals, total_sales;

-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD” with 34 rentals and #10 should have 31 rentals)
SELECT f.title, count(r.rental_id) as total_rentals
from film f
join inventory i on i.film_id = f.film_id
join rental r on r.inventory_id = i.inventory_id
GROUP BY f.title
order by total_rentals desc limit 10;

-- 17. The top five film categories by number of rentals 
-- (#1 should be “Sports” with 1179 rentals and #5 should be “Family” with 1096 rentals)
SELECT fc.category_id, cat.name, count(r.rental_id) as total_rentals
FROM film f 
join film_category fc on fc.film_id = f.film_id
join category cat on cat.category_id = fc.category_id
join inventory i on i.film_id = f.film_id
join rental r on r.inventory_id = i.inventory_id
group by fc.category_id, cat.name
order by total_rentals desc limit 5;

-- 18. The top five Action film titles by number of rentals 
-- (#1 should have 30 rentals and #5 should have 28 rentals)
SELECT f.title, cat.name, count(r.rental_id) as total_rentals
from film f
join film_category fc on fc.film_id = f.film_id
join category cat on cat.category_id = fc.category_id
join inventory i on i.film_id = f.film_id
join rental r on r.inventory_id = i.inventory_id 
where cat.category_id = 1
group by cat.name, f.title
order by total_rentals desc limit 5;

-- 19. The top 10 actors ranked by number of rentals of films starring that actor 
-- (#1 should be “GINA DEGENERES” with 753 rentals and #10 should be “SEAN GUINESS” with 599 rentals)
SELECT a.first_name, a.last_name, count(r.rental_id) as total_rentals
from film f
join film_actor fa on fa.film_id = f.film_id
join actor a on a.actor_id = fa.actor_id
join inventory i on i.film_id = f.film_id
join rental r on r.inventory_id = i.inventory_id
where a.actor_id = fa.actor_id
group by a.first_name, a.last_name
order by total_rentals desc limit 11;

-- 20. The top 5 “Comedy” actors ranked by number of rentals of films in the “Comedy” category starring that actor 
-- (#1 should have 87 rentals and #5 should have 72 rentals)
SELECT a.first_name, a.last_name, count(r.rental_id) as total_rentals, cat.name
from film f
join film_category fc on fc.film_id = f.film_id
join category cat on cat.category_id = fc.category_id
join inventory i on i.film_id = f.film_id
join rental r on r.inventory_id = i.inventory_id
join film_actor fa on fa.film_id = f.film_id
join actor a on a.actor_id = fa.actor_id
where a.actor_id = fa.actor_id and fc.category_id = 5
group by a.first_name, a.last_name, cat.name
order by total_rentals desc limit 5;






-- Write queries to return the following:
-- The following changes are applied to the "pagila" database.**
-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
INSERT INTO actor (first_name, last_name) VALUES ('Hampton', 'Avenue');
INSERT INTO actor (first_name, last_name) VALUES ('Lisa', 'Byway');
-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece", to the film table. The movie was released in 2008 in English. 
-- Since its an epic, the run length is 3hrs and 18mins. There are no special 
-- features, the film speaks for itself, and doesn't need any gimmicks.	
INSERT INTO film (title, description, release_year, language_id, rental_duration, rental_rate, replacement_cost)
VALUES ('Euclidean PI', 'The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece', 2008, 1, 7, 1.99, 14.99);
-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly 
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
SELECT title, film_id FROM film
WHERE title = 'Euclidean PI' ;
-- (1001)
SELECT first_name, last_name, actor_id FROM actor
WHERE first_name = 'Lisa';
-- (202)
SELECT first_name, last_name, actor_id FROM actor
WHERE first_name = 'Hampton';
-- (201)
INSERT INTO film_actor (actor_id, film_id) VALUES (202, 1001);
INSERT INTO film_actor (actor_id, film_id) VALUES (201, 1001);
-- 4. Add Mathmagical to the category table.
INSERT INTO category (name) VALUES ('Mathmagical');
-- 5. Assign the Mathmagical category to the following films, "Euclidean PI", 
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
SELECT category_id, name FROM category
WHERE name = 'Mathmagical';
-- (17)
SELECT title, film_id FROM film
WHERE title = 'Euclidean PI';
-- (1001)
SELECT title, film_id FROM film
WHERE title = 'EGG IGBY';
-- (274)
SELECT title, film_id FROM film
WHERE title = 'KARATE MOON';
-- (494)
SELECT title, film_id FROM film
WHERE title = 'RANDOM GO';
-- (714)
SELECT title, film_id FROM film
WHERE title = 'YOUNG LANGUAGE';
-- (996)

BEGIN TRANSACTION;
INSERT INTO film_category (category_id, film_id) VALUES (17, 1001);
UPDATE film_category SET category_id = 17 WHERE film_id = 274;
UPDATE film_category SET category_id = 17 WHERE film_id = 494;
UPDATE film_category SET category_id = 17 WHERE film_id = 714;
UPDATE film_category SET category_id = 17 WHERE film_id = 996;

SELECT title FROM film f
JOIN film_category fc ON f.film_id = fc.film_id
WHERE category_id = 17;
ROLLBACK;
COMMIT;
-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films 
-- accordingly.
-- (5 rows affected)
SELECT f.film_id, title FROM film f
JOIN film_category fc ON f.film_id = fc.film_id
WHERE category_id = 17;
-- (1001, 274, 494, 714, 996)

BEGIN TRANSACTION;
UPDATE film SET rating = 'G' WHERE film_id IN (1001, 274, 494, 714, 996);

SELECT rating FROM film
WHERE film_id IN (1001, 274, 494, 714, 996);
ROLLBACK;
COMMIT;
-- 7. Add a copy of "Euclidean PI" to all the stores.
BEGIN TRANSACTION;
INSERT INTO inventory (film_id, store_id) VALUES (1001, 1);
INSERT INTO inventory (film_id, store_id) VALUES (1001, 2);

SELECT film_id, inventory_id FROM inventory
WHERE film_id = 1001
ROLLBACK;
COMMIT;
-- 8. The Feds have stepped in and have impounded all copies of the pirated film, 
-- "Euclidean PI". The film has been seized from all stores, and needs to be 
-- deleted from the film table. Delete "Euclidean PI" from the film table. 
-- (Did it succeed? Why?)
BEGIN TRANSACTION;
DELETE FROM film WHERE film_id = 1001;
ROLLBACK;
COMMIT;
-- No it did not succeed becuase of a foreign key constraint.

-- 9. Delete Mathmagical from the category table. 
-- (Did it succeed? Why?)
BEGIN TRANSACTION;
DELETE FROM category WHERE category_id = 17;
ROLLBACK;
COMMIT;
-- No it did not succeed becuase of a foreign key constraint.

-- 10. Delete all links to Mathmagical in the film_category tale. 
-- (Did it succeed? Why?)
BEGIN TRANSACTION;
DELETE FROM film_category WHERE category_id = 17;
ROLLBACK;
COMMIT;
-- Yes! It succeeded because it essentially deleted the link from film_category and category

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI". 
-- (Did either deletes succeed? Why?)
BEGIN TRANSACTION;
DELETE FROM category WHERE category_id = 17;
DELETE FROM film WHERE title = 'Euclidean PI';
--DELETING the category would have worked (no other table is referencing it)
-- but attempting to delete the film aborted the BEGIN TRANSACTION so therefore everything failed to delete.
ROLLBACK;
COMMIT;

-- 12. Check database metadata to determine all constraints of the film id, and 
-- describe any remaining adjustments needed before the film "Euclidean PI" can 
-- be removed from the film table.
--We need to delete all the rows that contain the film_id of "Euclidean PI" from other tables that reference the film table
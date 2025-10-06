-- Retrieve a list of the "id" and "name" of all explicit tracks in the
-- database
SELECT t.id, t.name FROM tracks t WHERE t.explicit = 1;
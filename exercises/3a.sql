-- List the names of the 10 newest albums in the database
SELECT a.name FROM albums a ORDER BY a.release_date DESC LIMIT 10;
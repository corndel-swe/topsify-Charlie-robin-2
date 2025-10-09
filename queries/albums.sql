.mode json

--  sqlite3 db/db.sqlite < queries/albums.sql > reports/albums.json
SELECT albums.image_url, albums.name, albums.release_date, artists.name AS artist_id FROM albums
INNER JOIN artists ON albums.artist_id = artists.id
ORDER BY artists.name;
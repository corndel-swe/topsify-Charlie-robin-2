.mode json

--  sqlite3 db/db.sqlite < queries/albums.sql > reports/albums.json
SELECT * FROM albums;
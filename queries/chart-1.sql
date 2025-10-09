.mode json

SELECT artists.name as artist_name, COUNT(tracks.explicit) AS explicit_track_count
FROM artists
INNER JOIN albums ON albums.artist_id = artists.id
INNER JOIN tracks ON tracks.album_id = albums.id
WHERE trackS.explicit = 1
GROUP BY artists.name
ORDER BY explicit_track_count DESC;
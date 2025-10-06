-- Find the track_id of all tracks whose "speechiness" is greater than 0.5
-- but sort them by their danceability, with least danceable tracks first
-- (Hint: use the features table)
SELECT f.track_id FROM features f WHERE f.speechiness > .5 ORDER BY f.danceability;
-- Suppose we sort tracks by their duration (ascending) and into pages of length 5
-- 1 - 5, 6- 10, 11- 15, 15 - 20
-- Find the 4th page
-- Include all columns
SELECT * FROM tracks ORDER BY duration_ms ASC LIMIT 5 OFFSET 15;
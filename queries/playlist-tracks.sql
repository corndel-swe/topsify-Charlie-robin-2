SELECT playlists.name, tracks.name FROM tracks
INNER JOIN playlist_tracks
ON playlist_tracks.track_id = tracks.id
INNER JOIN playlists
ON playlists.id = playlist_tracks.playlist_id;
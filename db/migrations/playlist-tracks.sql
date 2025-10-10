CREATE TABLE playlist_tracks (
    playlist_id INTEGER,
    track_id TEXT,
    FOREIGN KEY (playlist_id) REFERENCES playlists(id),
    FOREIGN KEY (track_id) REFERENCES tracks(id)
);
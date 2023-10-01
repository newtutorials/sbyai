def create_playlist(songs, genre="Unknown", public=False):
    print("Creating playlist...")
    print(f"Genre: {genre}")
    print(f"Public: {public}")
    # Rest of the code

create_playlist(["Song 1", "Song 2"])  # Output: Genre: Unknown, Public: False
create_playlist(["Song 3", "Song 4"], "Pop")  # Output: Genre: Pop, Public: False
create_playlist(["Song 5", "Song 6"], "Rock", True)  # Output: Genre: Rock, Public: True

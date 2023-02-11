INSERT INTO club (id, name, address, city, date_of_creation, stade, created_at, updated_at)
    VALUES (100, 'US Bourbriac', 'pas loin du bourg', 'Bourbriac', '1964-08-14', 'Stade Bernard le Kelenec', now(), now());

INSERT INTO team (id, name, level, nb_players, created_at)
    VALUES (1, 'A', 'D1', 14, now());

INSERT INTO team (id, name, level, nb_players, created_at)
    VALUES (2, 'B', 'D4', 18, now());

INSERT INTO player (id, firstname, lastname, address, position, date_of_birth, created_at, club_id, team_id)
    VALUES (10, 'Vincent', 'NDOUMA', '1 rue du boucher', 'attaquant', '1998-08-23', now(), 100, 1);

INSERT INTO player (id, firstname, lastname, address, position, date_of_birth, created_at, club_id, team_id)
    VALUES (11, 'Jeanne', 'PELLE', '1 rue du boucher', 'attaquant', '2001-05-16', now(), 100, 2);

INSERT INTO coach (id, firstname, lastname, address, date_of_birth, created_at, club_id, team_id)
    VALUES (50, 'Bob', 'Lenon', '1 rue du boucher', '2001-05-16', now(), 100, 1);



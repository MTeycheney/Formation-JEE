-- route
-------------------------------------------------------
SELECT *
FROM abonne
WHERE ville = 'MONTPELLIER';
----------------------------
SELECT DISTINCT prenom
FROM abonne 
WHERE prenom LIKE 'L%';
------------------------
SELECT CONCAT(UPPER(nom),' ', prenom) as x
FROM abonne
WHERE ville = 'MONTPELLIER'
ORDER BY x;
------------------------------------------
SELECT nom, prenom, cast(date_fin_abo as timestamp) - current_timestamp as valide
FROM abonne
WHERE cast(date_fin_abo as timestamp) - current_timestamp > interval '0'
ORDER BY valide;
---------------------------------------------------------------------------------
SELECT nom, prenom, date_naissance
FROM abonne
WHERE age(date_naissance) < interval '20 years'
ORDER BY date_naissance
-----------------------------------------------
SELECT COUNT(*)
FROM abonne
---------------
SELECT COUNT(*)
FROM abonne
WHERE age(date_naissance) BETWEEN interval '30 years' AND interval '40 years';
------------------------------------------------------------------------------
SELECT UPPER(ville), COUNT(*)
FROM abonne
GROUP BY UPPER(ville)
ORDER BY COUNT(*) DESC;
-----------------------------
SELECT UPPER(ville), COUNT(*)
FROM abonne
GROUP BY UPPER(ville)
HAVING COUNT(*) >= 20
ORDER BY COUNT(*) DESC;
-----------------------------
SELECT nom, prenom, CASE
WHEN cast(date_fin_abo as timestamp) - current_timestamp > interval '0' THEN 'abonné jusqu''au: '||to_char(date_fin_abo, 'dd/mm/yyyy')
ELSE 'expiré' END
FROM abonne
--------------------------------------------------------------------------------------------------------------------------------------
SELECT COUNT(*), UPPER(nom), MIN(date_part('years', age(date_naissance))), MAX(date_part('years', age(date_naissance)))
FROM abonne
GROUP BY UPPER(nom)
-----------------------------------------------------------------------------------------------------------------------
SELECT COUNT(*), trunc(date_part('years',age(date_naissance))/10) as age_personne
FROM abonne
GROUP BY age_personne
ORDER BY age_personne
---------------------------------------------------------------------------------
-- JOINTURE --
SELECT DISTINCT a.nom, l.titre,
FROM auteur a, livre l
WHERE l.id_auteur = a.id
-------------------------------
SELECT DISTINCT a.nom as Auteur, l.titre, e.nom as Editeur
FROM auteur a, livre l, editeur e
WHERE l.id_auteur = a.id AND l.id_editeur = e.id
---------------------------------------------------------
SELECT DISTINCT e.nom, COUNT(l.id)
FROM editeur e, livre l
WHERE l.id_editeur = e.id
GROUP BY e.nom
---------- V2 -----------------------
SELECT e.nom, count(livre.id)
FROM editeur e
JOIN livre ON e.id = livre.id_editeur
GROUP BY e.id
ORDER BY e.nom;
-------------------------------------
SELECT l.titre, a.nom||' '||a.prenom as Emprunteur, em.date_retour
FROM livre l, emprunt em, abonne a
WHERE em.id_abonne = a.id AND em.id_livre = l.id
AND em.date_retour IS NOT null
------------------------------------------------------------------
SELECT a.nom||' '||a.prenom, CURRENT_TIMESTAMP - em.date_emprunt
FROM abonne a, emprunt em
WHERE em.id_abonne = a.id
AND CURRENT_TIMESTAMP - date_emprunt >= '2 months'
AND date_retour IS NULL
----------------------------------------------------------------
SELECT a.nom||' '||a.prenom as lecteur, COUNT(em.id_livre)
FROM abonne a, emprunt em, livre l
WHERE em.id_abonne = a.id AND em.id_livre = l.id
GROUP BY a.id
ORDER BY COUNT(em.id_livre) desc
LIMIT 10;
----------------------------------------------------------
SELECT nom||' '||prenom, (SELECT l.titre
						  FROM livre l, emprunt em
						  WHERE em.id_livre = l.id
						  AND em.id_abonne = abonne.id
						  ORDER BY em.date_emprunt DESC
						  LIMIT 1)
FROM abonne
-------------------------------------------------------
SELECT titre, (SELECT COUNT(*)
				FROM emprunt em
				WHERE em.id_livre = livre.id) as req
FROM livre
ORDER BY req DESC
LIMIT 10
----------------------------------------------------
SELECT DISTINCT l.titre, a.nom
FROM livre l, auteur a
WHERE l.id_auteur = a.id
AND (a.nom LIKE 'GUDULE' OR a.nom LIKE 'UBAC Claire')
ORDER BY a.nom 
---------------------------------------------------
-- WIP --
SELECT DISTINCT l.titre, a.nom
FROM livre l, auteur a
WHERE  (SELECT 
	  	FROM
	 	WHERE)
AND (a.nom LIKE 'GUDULE' OR a.nom LIKE 'UBAC Claire')
ORDER BY a.nom 
-----------------------------------------------------
INSERT INTO abonne (nom, prenom, date_naissance, adresse, code_postal, ville, date_inscription, date_fin_abo)
VALUES ('Maxime', 'Teycheney', '1992-07-28', 'RD806', '48700', 'Serverette', '2018-09-05', '2018-11-29')
-- 28 ------------------------------------------------------------------------------------------------------
UPDATE abonne SET date_fin_abo = current_date+ interval '1 year'
WHERE id = 3010
-- 29 ----------------------------------------------------------
DELETE FROM abonne
WHERE nom LIKE 'Maxime'
-- 30 ------------------
INSERT INTO livre (titre, categorie, id_auteur, id_editeur)
VALUES ('Bla', 'Bla', 123456789, 123456)
-- 31 -----------------------------------------------------
INSERT INTO genre (nom_genre) SELECT DISTINCT genre FROM livre
-- 32 -----------------------------------------------------
UPDATE livre
SET id_genre = (SELECT id
				FROM genre
				WHERE livre.genre = genre.nom_genre)
-- 33 -----------------------------------------------------
DELETE 
FROM genre
WHERE id = 4
-- 34 -----------------------------------------------------
-- 1
INSERT INTO genre (nom_genre)
VALUES ('humour')
-- 2
INSERT INTO livre (titre, id_genre, id_auteur, id_editeur)
VALUES ('One Piece', 6, 1, 2),
('Higurashi No Naku koro ni', 6, 1, 2),
('Trigun', 6, 1, 2)
-- 3
DELETE
FROM livre
WHERE id_genre = 6
-- 35 ------------------------------------------------------
CREATE TABLE categorie
(
	id SERIAL PRIMARY KEY,
	nom_categorie VARCHAR(100) NOT NULL
)
-- 36 ------------------------------------------------------
ALTER TABLE livre
ADD id_categorie int
CONSTRAINT fk_categ
REFERENCES categorie (id);
-- 37 -------------------------------------------------------
ALTER TABLE livre
DROP genre
-- 38 -------------------------------------------------------
CREATE VIEW exo38
	(id, titre, nom_editeur, nom_genre)
		AS SELECT l.id, l.titre, e.nom, g.nom_genre
		FROM livre l , editeur e , genre g
		WHERE l.id_editeur = e.id AND l.id_genre = g.id
-- 38-2 -----------------------------------------------------
SELECT *
FROM exo38
-- 39 -------------------------------------------------------
CREATE UNIQUE INDEX nom_index
ON abonne (nom, prenom, date_naissance);
-- 40 -------------------------------------------------------
BEGIN;
	UPDATE abonne SET prenom = 'Gary' WHERE prenom = 'Gay'
	SELECT * FROM abonne WHERE prenom = 'Gary' OR prenom = 'Gay'
COMMIT;


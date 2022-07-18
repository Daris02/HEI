-- Liste / nombre réservation faite sur place en un mois : // FAIT  
SELECT * FROM reservation
WHERE en_ligne = false 
AND date_reservarion = make_interval(months <= 1) ; 


-- Liste dépense voyage faite par un chauffeur en un mois : // FAIT NOT SURE
SELECT depense_regulier, nom_chauffeur FROM voyage v LEFT JOIN chauffeur c 
ON v.id_chauffeur = c.id_chauffeur
WHERE date_depart = make_interval(months <= 1)
LIMIT 1 ;

-- Liste dépense voyage faite par une voiture en un mois :  //FAIT NOT SURE
SELECT depense_regulier, immatriculation FROM
voyage vg LEFT JOIN voiture vt 
ON vg.id_voiture = vt.id_voiture
WHERE date_depart = make_interval(months <= 1)
LIMIT 1 ;

-- Liste de tous les dépenses en une semaine/ mois / trimestre : // FAIT
SELECT depense_regulier FROM voyage
WHERE date_trunc('days', current_date) = date_depart - interval '7 days' ;

SELECT depense_regulier FROM voyage
WHERE date_trunc('months', current_date) = date_depart - interval '1 months' ;

SELECT depense_regulier FROM voyage
WHERE date_trunc('months', current_date) = date_depart - interval '3 months' ;

          OR
SELECT depense_regulier FROM voyage
ORDER BY date_depart DESC --ou ASC
LIMIT date_depart = make_interval(days <= 7);

SELECT depense_regulier FROM voyage
ORDER BY date_depart DESC --ou ASC
LIMIT date_depart = make_interval(months <=1);

SELECT depense_regulier FROM voyage
ORDER BY date_depart DESC --ou ASC
LIMIT date_depart = make_interval(months <=3);

-- Liste voyage effectuer par un chauffeur en un mois : // FAIT NOT SURE
SELECT nom_chauffeur, id_voyage FROM chauffeur c LEFT JOIN voyage v 
ON c.id_chauffeur = v.id_chauffeur
WHERE date_depart BETWEEN make_interval(months <= 1) AND current_date ;

-- Afficher les places libre pour un voyage donné : MEDIUM/HARD 10
SELECT 


-- Afficher toutes les places des passager d'un voyage : MEDIUM 10

-- Afficher TOUS les détails d'un voyage(y compris le prix ave OU sans coefficient) : EASY/MEDIUM 10

-- Afficher TOUS les détails sur les payement d'unn client : EASY 9

-- Afficher TOUS les détails sur les voyages disponibles (y compris des places libre) à une date donnée : MEDIUM/HARD 9 

-- Afficher des dépenses de l'argent : salaire personnel (si c'est possible) ET maintenance ET incident : HARD 7

function chargeJSON()
{
    let requestURL = 'https://jsonplaceholder.typicode.com/posts';
    let request = new XMLHttpRequest();
    request.open('GET', requestURL);
    request.responseType = 'text';
    request.send();
    request.onload = function()
    {
        let res = request.response;

        let tableau = JSON.parse(res);

        // parcourir la structure du tableau et de donner seulement les postes avec user id = 1
        for(let i = 0; i < tableau.length; i++)
        {
            if(tableau[i].userId == 1)
            {
                console.log(tableau[i]);
            }
        }
    }
}


chargeJSON();


/*

Permettre à l’utilisateur de créer une note via le bouton « Ajouter une note » (une note est un simple texte court, de 128 caractères maximum).
On considère que le tableau des emprunts devient maintenant le tableau de tous les objets de la médiathèque. Ce tableau doit mentionner si l’objet est emprunté ou non en ce moment.
Utiliser votre fichier JSON préalablement créé pour peupler le tableau des objets de la médiathèque.

Depuis ce tableau, l’utilisateur doit pouvoir indiquer qu’un objet est emprunté et par qui (permettre la création d’un emprunt via un bouton qui permet de demander le nom de l’emprunteur)
L’utilisateur doit pouvoir :
-          ajouter des objets à la médiathèque,
-          les modifier et
-          les supprimer.

Ajouter un code qui permet d’identifier chaque objet de la médiathèque (exemple « 58967 »), générer les aléatoirement et rajouter une colonne « Code » dans le tableau des objets (la solution simple consiste à modifier la structure HTML du tableau pour ajouter cette colonne « Code » qui est vide au début ; la solution avancée est de modifier la structure du tableau dynamiquement via Javascript).

Remplacer les chiffres de la zone indicateurs par de « vrais » chiffres tenant compte de ce qu’il y a réellement dans le tableau des objets :
·        Nombre d’emprunts
·        Nombre d’emprunteurs différents
·        Nombre d’objets dans la médiathèque

Ajouter un champ de recherche au-dessus du tableau des objets qui permet de trouver un objet par son nom (recherche de type « contient » insensible à la casse ; exemple avec la recherche « route », je dois trouver « La vélo sur la Route »).

Tous les éléments trouvés dans le tableau devront s’afficher d’une façon personnalisée (en surbrillance par exemple).
En extra :
-          Utiliser un service en ligne pour récupérer des données JSON, dont on considérera qu’il s’agit d’objets de la médiathèque pour les injecter dans le tableau des objets
-          Permettre le tri des colonnes du tableau des objets (via les entêtes)


*/
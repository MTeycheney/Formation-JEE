/*
   1 Ecrire une fonction qui met le paragraphe en forme (margin et padding à 20px, couleur de texte en gris)
*/

/*function miseEnForme()
{
    let maDiv = document.querySelector(".paragraphe");

    maDiv.style.width = "80%"; // En CSS, la modification d'une balise style garde la priorité sur toute modification de CSS ultérieure
    maDiv.style.margin = "20px";
    maDiv.style.padding = "20px";
    maDiv.style.color = "grey";
}
miseEnForme();*/


/*
    2 Même exercice mais plutôt que d’affecter des styles en dur, attribuer au paragraphe une classe CSS (vous aurez préalablement défini une classe CSS dans votre fichier CSS)
*/
function modifClass()
{
    let maDiv = document.querySelector(".paragraphe");

    maDiv.setAttribute("class", "paraModif");
}

modifClass();

/*
    3 Ecrire une fonction qui compte le nombre de mots dans le texte de la page HTML et l’affiche dans la page HTML dans une zone spécifique au-dessus du texte
*/

function compteurMots()
{
    let maDiv = document.querySelector(".paraModif");

    let monText = maDiv.textContent;
    // On décortique la châine en la découpant à chaque espace ' ' rencontré.
    let tableauChaine = monText.toLowerCase().split(' ');



    console.log("Nombre de mots: "+tableauChaine.length);
}

compteurMots();

/*
    4 Ecrire une fonction qui retourne un tableau associatif avec pour chaque mot, son nombre d’occurrences dans le texte

    4-2 Afficher un tableau dans le document HTML représentant la répartition des mots que vous venez de calculer
*/

function occurenceMots()
{
    let maDiv = document.querySelector(".paraModif");
    let tableauFinal = document.querySelector(".occurenceMots");

    let monText = maDiv.textContent;

    let tableauCompteur = new Map();

    // On décortique la chaîne en la découpant à chaque espace ' ' rencontré.
    let tableauChaine = monText.toLowerCase().split(' ');

    for(let i = 0; i < tableauChaine.length; i++)
    {
        let motOccurence = tableauChaine[i];
        
        if(tableauCompteur.has(motOccurence)) //Vérifier si le mot est déjà présent dans tableau Chaine
        {
            tableauCompteur.set(motOccurence, tableauCompteur.get(motOccurence)+1);
        }
        else // Sinon, on l'ajoute
        {
            tableauCompteur.set(motOccurence, 1);
        }

        i++;
    }

    console.log(tableauCompteur);
    
}
occurenceMots();




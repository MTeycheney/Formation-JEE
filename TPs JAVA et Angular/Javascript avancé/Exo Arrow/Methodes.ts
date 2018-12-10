// Calculer la somme des entiers d'une liste d'entiers.
export function SommeEntiers(listEntiers: Array<number>): number
{
    let somme = listEntiers.reduce((som , e) => som += e);
    return somme;
}

// Calculer la moyenne de la somme des entiers d'une liste d'entiers.
export function Moyenne(listEntiers: Array<number>): number
{
    let somme = listEntiers.reduce((som , e) => som += e);
    return (somme / listEntiers.length);
}

// Ne sélectionner que les nombres supérieurs à 6.
export function SupSix(listEntiers: Array<number>): Array<number>
{
    // on déclare une fonction avec comme argument: 'élément'
    let newTab = listEntiers.filter((e) => e > 6); // Si l'élément est supérieur à 6, alors on retourne l'élément qui boucle sur le foreach natif du 'filter()'.

    return newTab;
}

// CLASSE PERSONNE ===============================================================

class Personne
{
    nom: string;
    prenom: string;

    constructor(nom: string, prenom: string)
    {
        this.nom = nom;
        this.prenom = prenom;
    }
}

// METHODES LISTE PERSONNES ==========================================================
let listePersonnes: Array<Personne> = [];
let pers1 = new Personne('Gillain','Nicolas');
let pers2 = new Personne('Schumascher','Nicolas');
let pers3 = new Personne('Merlin', 'Jonathan');
let test1 = new Personne('Merlin', 'Nahtanoj');
let test2 = new Personne('Merlin', 'Thanjona');
listePersonnes.push(pers1, pers2, pers3, test1, test2);

export function AfficheTri()
{
    // À chaque itération dans la liste de personne, la fonction de tri "sort()" est appliqué sur la valeur de retour de orderBy;
    let orderByNom = (a,b) => a.nom > b.nom ? 1 : ( a.nom < b.nom ? -1 : 0 ) ;
    let orderByPrenom = (a,b) => a.prenom > b.prenom ? 1 : ( a.prenom < b.prenom ? -1 : 0 ) ;
    console.log(listePersonnes.sort(orderByNom).sort(orderByPrenom));
    

}


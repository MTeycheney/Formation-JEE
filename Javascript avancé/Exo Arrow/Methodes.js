"use strict";
exports.__esModule = true;
// Calculer la somme des entiers d'une liste d'entiers.
function SommeEntiers(listEntiers) {
    var somme = listEntiers.reduce(function (som, e) { return som += e; });
    return somme;
}
exports.SommeEntiers = SommeEntiers;
// Calculer la moyenne de la somme des entiers d'une liste d'entiers.
function Moyenne(listEntiers) {
    var somme = listEntiers.reduce(function (som, e) { return som += e; });
    return (somme / listEntiers.length);
}
exports.Moyenne = Moyenne;
// Ne sélectionner que les nombres supérieurs à 6.
function SupSix(listEntiers) {
    // on déclare une fonction avec comme argument: 'élément'
    var newTab = listEntiers.filter(function (e) { return e > 6; }); // Si l'élément est supérieur à 6, alors on retourne l'élément qui boucle sur le foreach natif du 'filter()'.
    return newTab;
}
exports.SupSix = SupSix;
// CLASSE PERSONNE ===============================================================
var Personne = /** @class */ (function () {
    function Personne(nom, prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    return Personne;
}());
// METHODES LISTE PERSONNES ==========================================================
var listePersonnes = [];
var pers1 = new Personne('Gillain', 'Nicolas');
var pers2 = new Personne('Schumascher', 'Nicolas');
var pers3 = new Personne('Merlin', 'Jonathan');
var test1 = new Personne('Merlin', 'Nahtanoj');
var test2 = new Personne('Merlin', 'Thanjona');
listePersonnes.push(pers1, pers2, pers3, test1, test2);
function AfficheTri() {
    // À chaque itération dans la liste de personne, la fonction de tri "sort()" est appliqué sur la valeur de retour de orderBy;
    var orderByNom = function (a, b) { return a.nom > b.nom ? 1 : (a.nom < b.nom ? -1 : 0); };
    var orderByPrenom = function (a, b) { return a.prenom > b.prenom ? 1 : (a.prenom < b.prenom ? -1 : 0); };
    console.log(listePersonnes.sort(orderByNom).sort(orderByPrenom));
}
exports.AfficheTri = AfficheTri;

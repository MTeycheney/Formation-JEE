"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    }
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
var tabNotes = [11, 7, 17, 3, 5, 9, 10, 13, 19, 20, 0, 12];
// let loremJCVD = "Quand tu fais le calcul, premièrement, le cycle du cosmos dans la vie... c'est une grande roue et parfois c'est bon parfois c'est pas bon. C'est cette année que j'ai eu la révélation ! Je me souviens en fait, là on voit qu'on a beaucoup à travailler sur nous-mêmes car il faut toute la splendeur du aware car l'aboutissement de l'instinct, c'est l'amour ! Il y a un an, je t'aurais parlé de mes muscles. Je ne voudrais pas rentrer dans des choses trop dimensionnelles, mais, je sais que, grâce à ma propre vérité on est tous capables de donner des informations à chacun et ça, c'est très dur, et, et, et... c'est très facile en même temps. C'est cette année que j'ai eu la révélation ! Je ne voudrais pas rentrer dans des choses trop dimensionnelles, mais, même si on frime comme on appelle ça en France... il faut toute la splendeur du aware et c'est une sensation réelle qui se produit si on veut ! Donc on n'est jamais seul spirituellement ! Si je t'emmerde, tu me le dis, premièrement, le cycle du cosmos dans la vie... c'est une grande roue et finalement tout refaire depuis le début. Tu vas te dire : J'aurais jamais cru que le karaté guy pouvait parler comme ça !"
// Stocker un élément d'un enum dans une variable de type number lui attribue son index. 
var Color;
(function (Color) {
    Color[Color["rouge"] = 0] = "rouge";
    Color[Color["bleu"] = 1] = "bleu";
    Color[Color["blanc"] = 2] = "blanc";
    Color[Color["jaune"] = 3] = "jaune";
    Color[Color["vert"] = 4] = "vert";
})(Color || (Color = {}));
;
var maCouleur = Color.rouge;
var monAutreCouleur = Color.jaune;
var tabEntier;
var firstTab = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
var secondTab = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
var thirdTab = [1, true, "three"];
// FONCTIONS -------------------------------------
function Moyenne(tab) {
    var moyenne = 0;
    for (var _i = 0, tab_1 = tab; _i < tab_1.length; _i++) {
        var i = tab_1[_i];
        moyenne += i;
    }
    return (moyenne / tab.length);
}
function NoteMax(tab) {
    var noteMax = 0;
    for (var _i = 0, tab_2 = tab; _i < tab_2.length; _i++) {
        var i = tab_2[_i];
        if (i > noteMax) {
            noteMax = i;
        }
    }
    return noteMax;
}
function NoteMin(tab) {
    var noteMin = 0;
    for (var _i = 0, tab_3 = tab; _i < tab_3.length; _i++) {
        var i = tab_3[_i];
        if (i < noteMin) {
            noteMin = i;
        }
    }
    return noteMin;
}
function ChangeNotation(tab) {
    tab.forEach(function (element, indice) { return tab[indice] = (element / 2); });
    return tab;
}
function tabAvecLimites(tab, min, max) {
    var limiteMin = min;
    var limiteMax = max;
    var newTab = [];
    for (var i in tab) {
        if ((tab[i] <= max) && (tab[i] >= min)) {
            newTab.push(tab[i]);
        }
    }
    return newTab;
}
function AdditionneNombres(nb1, nb2) {
    return nb1 + nb2;
}
var Rond = /** @class */ (function () {
    function Rond(rayon) {
        this.rayon = rayon;
    }
    Rond.prototype.aire = function () {
        return (Math.PI * (Math.pow(this.rayon, 2)));
    };
    return Rond;
}());
var pet1 = { nom: 'chien', age: 2, poids: 7 };
var pet2 = { nom: 'chat', age: 3, poids: 4 };
var pet3 = { nom: 'oiseau', age: 1, poids: 0.024 };
var tabPet = [];
tabPet.push(pet1, pet2, pet3);
var ComparePet = function (pet1, pet2) {
    if (pet1.age >= pet2.age) {
        console.log("Le pet le plus âgé est ce " + pet1.nom);
    }
    else {
        console.log("Le pet le plus âgé est ce " + pet2.nom);
    }
};
// AFFICHAGE =============================================
console.log('moyenne des notes : ' + Moyenne(tabNotes));
console.log('Note la plus élevée : ' + NoteMax(tabNotes));
console.log('Note la plus basse : ' + NoteMin(tabNotes));
console.log('Note minimale "5" et maximale "17" : ' + tabAvecLimites(tabNotes, 5, 17));
console.log('Notes /10 : ' + ChangeNotation(tabNotes));
// console.log('ma chaîne splitée : ' + loremJCVD.split(' '));
// console.log('Des caractères splités : ' + loremJCVD.slice(10,12));
console.log(maCouleur);
console.log(monAutreCouleur);
console.log(Color[maCouleur]);
console.log(Color[monAutreCouleur]);
console.log(firstTab);
console.log(secondTab);
console.log(thirdTab);
console.log(AdditionneNombres(24, 18));
var myUnionVar;
console.log('myUnionVar before setting a value = ' + myUnionVar);
myUnionVar = "5";
console.log('typeof myUnionVar = ' + typeof myUnionVar);
var Export_1 = require("./Export");
var test = new Export_1.Export;
console.log(test.AddNombres(1, 2));
console.log(tabPet);
console.log(tabPet[1].nom);
ComparePet(pet2, pet1);
// COURS ===========================================================
// objet à la volée
var totoObjet = {
    nom: 'toto',
    prenom: 'titi',
    affiche: function () {
        console.log('Je m"appelle ' + this.prenom);
    }
};
// objet propre
var Personne = /** @class */ (function () {
    function Personne(nom, prenom, naiss) {
        this.nom = nom;
        this.prenom = prenom;
        this.datenaiss = naiss;
    }
    Personne.prototype.NomComplet = function () {
        return "Nom: " + this.nom + ", Prénom: " + this.prenom + ". Né(e) le: " + this.datenaiss + ".";
    };
    Personne.prototype.affiche = function () {
        console.log(this.nom + " " + this.prenom);
    };
    return Personne;
}());
totoObjet.affiche();
var mickey = new Personne('MOUSE', 'Mickey', '18 novembre 1928');
console.log(mickey.NomComplet());
var Rectangle = /** @class */ (function () {
    function Rectangle(largeur, longueur) {
        this.longueur = longueur;
    }
    Rectangle.prototype.aire = function () {
        return this.largeur * this.longueur;
    };
    return Rectangle;
}());
var Carre = /** @class */ (function (_super) {
    __extends(Carre, _super);
    function Carre(cote) {
        return _super.call(this, cote, cote) || this;
    }
    return Carre;
}(Rectangle));

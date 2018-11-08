"use strict";
exports.__esModule = true;
var Methodes_1 = require("./Methodes");
var Methodes_2 = require("./Methodes");
var Methodes_3 = require("./Methodes");
var Methodes_4 = require("./Methodes");
// EXERCICES LISTE D'ENTIERS =====================================================
var mesEntiers = [18, 2, 3, 4, 5, 6, 7, 8, 9, 10, 25, 50, 100, 150, 200, 42, 24, 48, 34, 94, 28, 7, 1992, 20, 8, 1955, 456, 78, 1, 486, 15, 46, 45, 7846, 489468, 7, 435, 44];
console.log("Voici le tableau initial: " + mesEntiers);
console.log("- Dans la liste, il y a: " + mesEntiers.length + " éléments.");
console.log("- Somme des nombres dans la liste: " + Methodes_1.SommeEntiers(mesEntiers));
console.log("- Moyenne des nombres dans la liste: " + Methodes_2.Moyenne(mesEntiers));
console.log("- Liste des nombres supérieurs à 6: " + Methodes_3.SupSix(mesEntiers));
// EXERCICES LISTE DE PERSONNES =================================================
Methodes_4.AfficheTri();

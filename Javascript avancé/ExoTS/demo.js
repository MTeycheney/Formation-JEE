"use strict";
exports.__esModule = true;
var e = 1;
var r = 1.2;
console.log('mon entier ' + e);
console.log('mon entier ' + r);
// ===============================================
var b = true;
var str = 'string';
var strNb = '123 est un chiffre';
console.log('result: ' + parseInt(strNb));
console.log(strNb.split(' '));
console.log(strNb.slice(3, 7));
console.log(strNb.slice(-3));
// TABLEAUX ET BOUCLES===============================================
var tab = [];
var tab1 = [];
var tabinit = [1, 2, 3, 4];
tab.push(0);
for (var index = 0; index < tabinit.length; index++) // Méthode dépréciée
 {
    var element = tabinit[index];
    console.log('for classique ' + element);
}
for (var i in tabinit) // Index
 {
    console.log(' let in ' + i);
}
for (var _i = 0, tabinit_1 = tabinit; _i < tabinit_1.length; _i++) {
    var i = tabinit_1[_i];
    console.log(' let in ' + i);
}
tabinit.forEach(function (e, i) { return console.log('for each ' + i + ' : ' + e); }); // For each, toujours elements,indice
tabinit.forEach(function (e) { return console.log('for each: ' + e); }); // indice facultatif
var carre = tabinit.map(function (e) { return Math.pow(e, 2); });
console.log(carre);
var somme = tabinit.reduce(function (a, e) { return a += e; });
console.log(somme);
// filter : lambda boolean
// sort : lambda : 0, -1 ou 1
// ENUMS ===============================================
var monEnum;
(function (monEnum) {
    monEnum[monEnum["A"] = 0] = "A";
    monEnum[monEnum["B"] = 1] = "B";
    monEnum[monEnum["C"] = 2] = "C";
})(monEnum || (monEnum = {}));
;
var eu = monEnum.A;
console.log(monEnum);
console.log(eu);
// FONCTIONS ===============================================
function carreFct(x) {
    return Math.pow(x, 2);
}
var carreLambda = function (x) { return Math.pow(x, 2); };
var puissance = function (x, p) {
    return p === undefined ? Math.pow(x, 2) : Math.pow(x, p);
};
var sommeLambda = function (x) {
    var autres = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        autres[_i - 1] = arguments[_i];
    }
    return autres.reduce(function (s, e) { return s += e; }) + x;
};
sommeLambda(1, 2, 3, 9, 8);
console.log(carreLambda(2));
// PROMISE ==========================================================================
var es6_promise_1 = require("es6-promise");
function Hello(onBefore, onAfter) {
    if (onBefore) {
        onBefore();
    }
    console.log('Hello');
    if (onAfter) {
        onAfter();
    }
}
Hello(function () { return console.log('avant'); }, function () { return console.log('après'); });
function doAsyncTask(cb) {
    setTimeout(function () {
        console.log("Async Task Calling Callback");
        cb();
    }, 1000);
}
doAsyncTask(function () { return console.log("Callback Called"); });
console.log("Toto");
// ======================================================
var prom = new es6_promise_1.Promise(function (resolve, reject) {
    resolve('Bravo');
});
prom.then(function (value) { return console.log(value); })["catch"](function (err) { return console.log(err); });
/*
Ecrire une fonction testNum qui prend en param un nombre et qui retourne une promise qui teste si le param est plus grand que 10.
*/
function TestNum(nombre) {
    return new es6_promise_1.Promise(function (resolve, reject) {
        if (nombre > 10) {
            resolve('Il est bien supérieur à 10.');
        }
        else {
            reject("Le nombre n'est pas supérieur à 10.");
        }
    });
}
TestNum(5).then(function (uneValeur) { return console.log(uneValeur); })["catch"](function (err) { return console.log("Error : " + err); });
/*
Créer et utiliser des Promises pour trier un tableau de string et l'afficher en majuscules. Si le tab ne contient pas que des string, on rejecte la Promise.
*/
var sortTabString = function (tab) { tab.sort(); };
var toutMaj = function (tab) {
    return new es6_promise_1.Promise(function (resolve, reject) {
        var maj = tab.map(function (e) {
            if (typeof e === "string") {
                return e.toUpperCase();
            }
            else {
                reject("Erreur: " + e + " n'est pas un string!");
            }
        });
        resolve(maj);
    });
};
var tabTestVrai = ['1', '2', 'Ballon', 'Cornemuse', 'Hippopotame'];
var tabTestFaux = ['1', 2, 'Ballon'];
toutMaj(tabTestVrai).
    then(function (result) { return console.log(result); })["catch"](function (err) { return console.log(err); });
toutMaj(tabTestFaux).
    then(function (result) { return console.log(result); })["catch"](function (err) { return console.log(err); });

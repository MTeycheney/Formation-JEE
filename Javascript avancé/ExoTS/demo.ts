let e: number = 1;
let r: number = 1.2;
console.log('mon entier ' + e);
console.log('mon entier ' + r);

// ===============================================
let b: boolean = true;
let str: string = 'string';
let strNb: string = '123 est un chiffre';
console.log('result: '+parseInt(strNb));
console.log(strNb.split(' '));
console.log(strNb.slice(3,7));
console.log(strNb.slice(-3));
// TABLEAUX ET BOUCLES===============================================
let tab: number[] = [];
let tab1: Array<number> = [];
let tabinit = [1,2,3,4];
tab.push(0);

for (let index = 0; index < tabinit.length; index++) // Méthode dépréciée
{
    const element = tabinit[index];
    console.log('for classique ' + element);
    
}

for(let i in tabinit) // Index
{
    console.log(' let in '+i);
}

for(let i of tabinit) // Valeurs
{
    console.log(' let in '+i);
}

tabinit.forEach((e,i) => console.log('for each ' + i + ' : ' + e)); // For each, toujours elements,indice
tabinit.forEach(e => console.log('for each: ' + e)); // indice facultatif

let carre = tabinit.map( e => Math.pow(e,2));
console.log(carre);
let somme = tabinit.reduce((a,e) => a += e);
console.log(somme);
// filter : lambda boolean
// sort : lambda : 0, -1 ou 1

// ENUMS ===============================================

enum monEnum {A, B, C};
let eu : monEnum = monEnum.A;
console.log(monEnum);
console.log(eu);

// FONCTIONS ===============================================

function carreFct(x: number): number
{
    return Math.pow(x,2);
}

let carreLambda = (x:number) => Math.pow(x,2);

let puissance = (x: number, p?: number) =>
    p === undefined ? Math.pow(x,2) : Math.pow(x,p);

let sommeLambda = (x: number, ...autres : number[]) => // ... indique TOUT le reste d'un tableau
    autres.reduce((s,e) => s+=e) + x; 

sommeLambda(1,2,3,9,8);

console.log(carreLambda(2));

// PROMISE ==========================================================================

import { Promise } from 'es6-promise';

function Hello(onBefore, onAfter)
{
    if(onBefore)
    {
        onBefore();
    }
    console.log('Hello');

    if(onAfter)
    {
        onAfter();
    }
}

Hello(() => console.log('avant'), ()=>console.log('après'));

function doAsyncTask(cb)
{
    setTimeout(() =>
    {
        console.log("Async Task Calling Callback");
        cb();
    },1000);
}

doAsyncTask(() => console.log("Callback Called"));
console.log("Toto");

// ======================================================

var prom = new Promise(function(resolve,reject)
    {
        resolve('Bravo');
    });
prom.then((value)=> console.log(value)).catch((err)=>console.log(err));

/*
Ecrire une fonction testNum qui prend en param un nombre et qui retourne une promise qui teste si le param est plus grand que 10.
*/

function TestNum(nombre: number)
{
    return new Promise((resolve,reject) =>
    {
        if(nombre > 10)
        {
        resolve('Il est bien supérieur à 10.');
        }
        else
        {
            reject("Le nombre n'est pas supérieur à 10.");
        }
    });
    
}

TestNum(5).then(uneValeur => console.log(uneValeur)).catch(err => console.log("Error : "+err));

/*
Créer et utiliser des Promises pour trier un tableau de string et l'afficher en majuscules. Si le tab ne contient pas que des string, on rejecte la Promise.
*/


const sortTabString = (tab) =>{tab.sort()};
const toutMaj = (tab) =>
{
    return new Promise((resolve, reject) =>
    {
        let maj = tab.map(e =>
            {
                if(typeof e === "string")
                {
                    return e.toUpperCase();
                }
                else
                {
                    reject("Erreur: "+e+" n'est pas un string!");
                }
            });
            resolve(maj);
       
    });
}

let tabTestVrai = ['1','2','Ballon','Cornemuse','Hippopotame'];
let tabTestFaux = ['1',2,'Ballon'];

toutMaj(tabTestVrai).
    then((result)=> console.log(result)).
    catch((err)=>console.log(err));
    
toutMaj(tabTestFaux).
    then((result)=> console.log(result)).
    catch((err)=>console.log(err));
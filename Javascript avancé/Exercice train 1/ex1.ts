let tabNotes = [11,7,17,3,5,9,10,13,19,20,0,12];

// let loremJCVD = "Quand tu fais le calcul, premièrement, le cycle du cosmos dans la vie... c'est une grande roue et parfois c'est bon parfois c'est pas bon. C'est cette année que j'ai eu la révélation ! Je me souviens en fait, là on voit qu'on a beaucoup à travailler sur nous-mêmes car il faut toute la splendeur du aware car l'aboutissement de l'instinct, c'est l'amour ! Il y a un an, je t'aurais parlé de mes muscles. Je ne voudrais pas rentrer dans des choses trop dimensionnelles, mais, je sais que, grâce à ma propre vérité on est tous capables de donner des informations à chacun et ça, c'est très dur, et, et, et... c'est très facile en même temps. C'est cette année que j'ai eu la révélation ! Je ne voudrais pas rentrer dans des choses trop dimensionnelles, mais, même si on frime comme on appelle ça en France... il faut toute la splendeur du aware et c'est une sensation réelle qui se produit si on veut ! Donc on n'est jamais seul spirituellement ! Si je t'emmerde, tu me le dis, premièrement, le cycle du cosmos dans la vie... c'est une grande roue et finalement tout refaire depuis le début. Tu vas te dire : J'aurais jamais cru que le karaté guy pouvait parler comme ça !"

// Stocker un élément d'un enum dans une variable de type number lui attribue son index. 
enum Color {"rouge", "bleu", "blanc", "jaune", "vert"};
let maCouleur:number = Color.rouge;
let monAutreCouleur:number = Color.jaune;

let tabEntier: Array<number>

let firstTab = [1,2,3,4,5,6,7,8,9,10];
let secondTab = [1,2,3,4,5,6,7,8,9,10];
let thirdTab = [1, true, "three"];

// FONCTIONS -------------------------------------

function Moyenne(tab: Array<number>): number
{
    let moyenne = 0;
    for(let i  of tab)
    {
        moyenne += i;
    }
    return (moyenne/tab.length);
}

function NoteMax(tab: Array<number>): number
{
    let noteMax = 0;
    for(let i  of tab)
    {
        if(i > noteMax)
        {
            noteMax = i;
        }
        
    }
    return noteMax;
}

function NoteMin(tab: Array<number>): number
{
    let noteMin = 0;
    for(let i of tab)
    {
        if(i < noteMin)
        {
            noteMin = i;
        }
        
    }
    return noteMin;
}

function ChangeNotation(tab: Array<number>): Array<number>
{
    tab.forEach((element,indice) => tab[indice] = (element / 2));

    return tab;
}

function tabAvecLimites(tab: Array<number>, min: number, max: number ): Array<number>
{
    let limiteMin = min;
    let limiteMax = max;
    let newTab = []

    for(let i in tab)
    {
        if((tab[i] <= max) && (tab[i] >= min))
        {
            newTab.push(tab[i]);
        }
        
    }
    return newTab;
}

function AdditionneNombres(nb1: number, nb2: number): number
{
    return nb1+nb2;
}

interface monCercle
{
    aire: () => number;
}

class Rond implements monCercle
{
    rayon: number;
    
    constructor(rayon: number)
    {
        this.rayon = rayon;
    }

    aire(): number
    {
        return (Math.PI * (Math.pow(this.rayon,2)));
    }
}

// EXERCICE INTERFACE ==================================

interface Pet
{
    nom: string;
    age: number;
    poids: number;   
}

let pet1 = {nom: 'chien', age: 2, poids: 7};
let pet2 = {nom: 'chat', age: 3, poids: 4};
let pet3 = {nom: 'oiseau', age: 1, poids: 0.024};
let tabPet: Pet[] = [];

tabPet.push(pet1, pet2, pet3);

let ComparePet = (pet1: Pet, pet2: Pet) =>
{
    if(pet1.age >= pet2.age)
    { 
        console.log("Le pet le plus âgé est ce " + pet1.nom);
    }
    else
    {
        console.log("Le pet le plus âgé est ce " + pet2.nom);
    }
}

// AFFICHAGE =============================================

console.log('moyenne des notes : ' + Moyenne(tabNotes));
console.log('Note la plus élevée : ' + NoteMax(tabNotes));
console.log('Note la plus basse : ' + NoteMin(tabNotes));
console.log('Note minimale "5" et maximale "17" : ' + tabAvecLimites(tabNotes,5,17));
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
console.log(AdditionneNombres(24,18));

var myUnionVar: string | number | boolean;
console.log('myUnionVar before setting a value = ' + myUnionVar);
myUnionVar = "5";
console.log('typeof myUnionVar = ' + typeof myUnionVar);

import {Export} from './Export';
let test = new Export;
console.log(test.AddNombres(1,2));

console.log(tabPet);
console.log(tabPet[1].nom);

ComparePet(pet2, pet1);

// COURS ===========================================================
// objet à la volée
let totoObjet = 
{
    nom: 'toto',
    prenom: 'titi',

    affiche: function()
    {
        console.log('Je m"appelle ' + this.prenom);
    }
}


// objet propre

class Personne
{
    nom: string;
    prenom: string;
    datenaiss: string;

    constructor(nom: string, prenom: string, naiss: string)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.datenaiss = naiss;
    }

    NomComplet(): string
    {
        return "Nom: "+this.nom+ ", Prénom: "+this.prenom+". Né(e) le: "+this.datenaiss+".";
    }

    affiche(): void
    {
        console.log(`${this.nom} ${this.prenom}`);
    }
}

totoObjet.affiche();

let mickey = new Personne('MOUSE', 'Mickey','18 novembre 1928');
console.log(mickey.NomComplet());

// HERITAGE ==============================

interface figure
{
    aire: () => number;
}

class Rectangle implements figure
{
    largeur: number;
    longueur: number;

    constructor(largeur: number, longueur: number)
    {
        this.longueur = longueur;
    }

    aire(): number
    {
        return this.largeur * this.longueur;
    }
}

class Carre extends Rectangle
{
    constructor(cote: number)
    {
        super(cote, cote);
    }
}
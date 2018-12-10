let monChar = "Hello World!";
let monCharNb1 = "40";
let monCharNb2 = "2";
let testChaine = "Oui alors écoute moi, après il faut s'intégrer tout ça dans les environnements et le cycle du cosmos dans la vie...";
let monNb = 15;
let monBool = true;
let monNull = null;
let monUndefined;
let today = Date.now();

function afficheType(maVar)
{
    return typeof(maVar);
}

function debutEtFin(charArg)
{
    let maChaine = charArg.charAt(0)+charArg.charAt(charArg.length-1);
    return maChaine;
}

function ajouteChars(nb1, nb2)
{
    let nbTotal = parseInt(nb1,10) + parseInt(nb2,10);
    return nbTotal;
}

function maFonctionReloue(charArg)
{
    
    // On décortique la châine en la découpant à chaque espace ' ' rencontré.
    let maChaine = charArg.toLowerCase().split(' ');    
    let i = 0;
    
    while(i < maChaine.length)
    {
        if((i % 2) == 0)
        {
            // Après modif, on remet la chaîne modifiée dans le tableau
            maChaine[i] = maChaine[i].charAt(0).toUpperCase() + maChaine[i].substring(1);
        }
        
        i++;
    }
    // On retourne les chaînes stockées, assemblées avec des espaces ' ' au milieu des mots.
    return maChaine.join(' ');
}

function ilEstQuelleHeure()
{
    let present = new Date();
    let jour = present.getDate();
    let mois = present.getMonth();
    let annee = present.getFullYear();
    let heure = present.getHours();
    let minute = present.getMinutes();
    
    let maChaine = "";
    
    return maChaine.concat("Date :",jour,'-',mois,'-',annee, ' - Heure: ',heure,':',minute);
}

function inverseNombre(monNombre)
{
    let maChaine = ""+monNombre;
    let envers = maChaine.split('').reverse().join('');
    return envers;
}

function tabSquare(monTab)
{
    let tableau = monTab;
    
    for(let i = 0; i<tableau.length; i++)
    {
        tableau[i] *= tableau[i];
    }
    
    return tableau;
}

// afficher le type de la variable donnée en argument.
console.log(afficheType(monChar));

// afficher la première et la dernière lettre de la chaine donnée en argument.
console.log(debutEtFin(monChar));

// afficher la somme de 2 chars donnés en paramètres.
console.log(ajouteChars(monCharNb1, monCharNb2));

console.log(maFonctionReloue(testChaine));
    
console.log(ilEstQuelleHeure());

console.log(inverseNombre(123465789));

let monTableau = [1,2,3,4,5,6,7,8,9,10];
console.log(tabSquare(monTableau));
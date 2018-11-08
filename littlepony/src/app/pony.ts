export class Pony {
    id: number;
    nom: string;
    weight: number;
    age: number;
    color: string;

    constructor(nom?: string, age?: number, weight?: number, color?: string)
    {
        this.id = 0;
        nom === undefined ? this.nom = 'nom' : this.nom = nom;
        age === undefined ? this.age = 0 : this.age = age;
        weight === undefined ? this.weight = 0 : this.weight = weight;
        color === undefined ? this.color = 'couleur' : this.color = color;
    }
}


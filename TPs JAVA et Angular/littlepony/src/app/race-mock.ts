import { Race } from "./race";
import { Pony } from "./pony";
import { PONIES } from './ponies-mock';

export const RACES: Array<Race> = [
    {id: 0, location: 'Montpellier', date: new Date("10/31/2018"), ponies: [PONIES[0], PONIES[1]]}, 
    {id: 1, location: 'Marseille', date: new Date('01/11/2018'), ponies: [PONIES[1],  PONIES[2]]}, 
    {id: 2, location: 'Paris', date: new Date('02/01/2018'), ponies: [PONIES[0],  PONIES[2]]}, 
    {id: 3, location: 'Lyon', date: new Date('03/05/2018'), ponies: [new Pony('Rarity', 2, 20, 'blanc'),new Pony('Pinkie Pie', 2, 20, 'rose'), new Pony('Applejack', 2, 20, 'jaune')]}
];

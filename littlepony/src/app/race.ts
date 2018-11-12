import { Pony } from './pony';

export class Race {
    id: number;
    location: string;
    date: Date;
    ponies: Array<Pony>;

    constructor(location?: string, date?: Date)
    {
        this.id = 0;
        this.ponies = [];
        location === undefined ? this.location = 'ville' : this.location = location;
        date === undefined ? this.date = new Date() : this.date = date;
    }
}

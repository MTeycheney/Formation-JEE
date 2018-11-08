import { Component, OnInit, Input } from '@angular/core';
import { Pony } from '../pony';
import { PonyService } from '../pony.service';

@Component({
  selector: 'app-ponies',
  templateUrl: './ponies.component.html',
  styleUrls: ['./ponies.component.css']
})

export class PoniesComponent implements OnInit {
  @Input() ponies: Array<Pony>;

  constructor(private service: PonyService) {
     // this.pony = new Pony() sera amene automatiquement dans lentree
     this.ponies = [];
     /*this.ponies.push(new Pony('Twilight Sparkle', 2, 20, 'violet'));
     this.ponies.push(new Pony('Applejack', 2, 20, 'jaune'));
     this.ponies.push(new Pony('Pinkie Pie', 2, 20, 'rose'));
     this.ponies.push(new Pony('Rarity', 2, 20, 'blanc'));*/
     this.service.getAllPonies().subscribe(p => this.ponies = p);
   }

  ngOnInit() {
  }

}

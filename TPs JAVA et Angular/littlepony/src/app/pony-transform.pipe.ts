import { Pipe, PipeTransform } from '@angular/core';
import { Pony } from './pony';

@Pipe({
  name: 'ponyTransform'
})
export class PonyTransformPipe implements PipeTransform
{

  transform(pony: Pony, args?: any): string
  {
    return '' + pony.id + ' : ' + pony.nom;
  }

}

// This file is required by karma.conf.js and loads recursively all the .spec and framework files

import 'zone.js/dist/zone-testing';
import { getTestBed } from '@angular/core/testing';
import { BrowserDynamicTestingModule, platformBrowserDynamicTesting } from '@angular/platform-browser-dynamic/testing';
import { Pony } from './app/pony';
import { race } from 'q';
import { Race } from './app/race';

declare const require: any;

// First, initialize the Angular testing environment.
getTestBed().initTestEnvironment(
  BrowserDynamicTestingModule,
  platformBrowserDynamicTesting()
  );
// Then we find all the tests.
const context = require.context('./', true, /\.spec\.ts$/);
// And load the modules.
context.keys().map(context);

it('test unit', () =>
{
  const s = 'real value';
  expect(s).toBe('real value');
});

it('test pony', () =>
{
  const p = new Pony();
  expect(p.id).toBe(0);
});

// vérifier qu'une course a bien un id
it('test race', () =>
{
  const r = new Race();
  expect(r.id).toBe(0);
});

// Vérifier qu'une course a bien une liste de pony instanciée
it('test race Ponylist doesnt exist', () =>
{
  const r = new Race();
  expect(r.ponies).toBe(undefined);
});

// vérifier qu'une course n'a pas de pony
it('test race Ponylist doesnt exist', () =>
{
  const r = new Race();
  expect(r.ponies.length).toBe(0);
});

// verifier le nom par defaut d'un poney
it('test Pony default name', () =>
{
  const p = new Pony();
  expect(p.nom).toBe('nom');
});

// verifier la date par defaut d'une course
it('test Pony default name', () =>
{
  const r = new Race();
  expect(r.date).toEqual(new Date());
});

// Karma moteur de test
// Jasmine (fonction expect) inclure avec Angular (ngtest) 
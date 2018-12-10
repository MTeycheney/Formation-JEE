package fr.dta.AngularEtSpring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.dta.AngularEtSpring.dao.PonyDAO;
import fr.dta.AngularEtSpring.model.Pony;

@RestController
@RequestMapping("/api/ponies")
public class PonyController
{
	@Autowired
	PonyDAO ponydao;
	
	@GetMapping("/")
	@CrossOrigin(origins = "*")
    public List<Pony> greeting()
	{
        return (List<Pony>) ponydao.findAll();
    }
	
	@CrossOrigin(origins = "*")
	@GetMapping("/{id}")
    public Optional<Pony> greeting(@PathVariable long id)
	{
        return ponydao.findById(id);
    }
	

	@CrossOrigin(origins = "*")
	@PostMapping("/addPony")
    public Pony insertPony(@RequestBody Pony pony)
	{
        return ponydao.save(pony);
    }
	

	@CrossOrigin(origins = "*")
	@PutMapping("/updatePony/{id}")
    public Pony updatePony(@RequestBody Pony pony, @PathVariable long id)
	{
		return ponydao.save(pony);
    }
	

	@CrossOrigin(origins = "*")
	@DeleteMapping("/deletePony/{id}")
    public void deletePony(@PathVariable long id)
	{
		ponydao.deleteById(id);
    }
}

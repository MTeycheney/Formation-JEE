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

import fr.dta.AngularEtSpring.dao.RaceDAO;
import fr.dta.AngularEtSpring.model.Race;

@RestController
@RequestMapping("/api/races")
public class RaceController
{
	@Autowired
	RaceDAO racedao;

	@CrossOrigin(origins = "*")
	@GetMapping("/")
    public List<Race> greeting()
	{
        return (List<Race>) racedao.findAll();
    }

	@CrossOrigin(origins = "*")
	@GetMapping("/{id}")
    public Optional<Race> greeting(@PathVariable long id)
	{
        return racedao.findById(id);
    }
	

	@CrossOrigin(origins = "*")
	@PostMapping("/addRace")
    public void insertPony(@RequestBody Race race)
	{
		racedao.save(race);
    }

	@CrossOrigin(origins = "*")
	@PutMapping("/updateRace/{id}")
    public void updatePony(@RequestBody Race race)
	{
		racedao.save(race);
    }

	@CrossOrigin(origins = "*")
	@DeleteMapping("/deleteRace/{id}")
    public void deletePony(@PathVariable long id)
	{
		racedao.deleteById(id);
    }
}

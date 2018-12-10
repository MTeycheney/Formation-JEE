package fr.dta.spring.jv.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Race extends IdEntity
{
	@Id
	@GeneratedValue
	private int id_race;

	@Column
	private String location;
	
	@Column
	private Date date_race;

	public Race(String location, Date date_race)
	{
		this.location = location;
		this.date_race = date_race;
	}
	
	public Race() throws ParseException
	{
		this.location = "ville";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date dateActu = sdf.parse("2002/02/02");
        this.date_race = dateActu;

	}
	
	
	public int getId_race() {
		return id_race;
	}

	public void setId_race(int id_race) {
		this.id_race = id_race;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getDate_race() {
		return date_race;
	}

	public void setDate_race(Date date_race) {
		this.date_race = date_race;
	}

	@Override
	public String toString() {
		return "Race: [Lieu= " + location + ", Date= " + date_race + "]";
	}

	
	
}

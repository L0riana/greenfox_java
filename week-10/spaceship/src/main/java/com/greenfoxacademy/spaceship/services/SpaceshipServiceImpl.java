package com.greenfoxacademy.spaceship.services;

import com.greenfoxacademy.spaceship.models.Planet;
import com.greenfoxacademy.spaceship.models.Spaceship;
import com.greenfoxacademy.spaceship.repositories.PlanetRepository;
import com.greenfoxacademy.spaceship.repositories.SpaceshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpaceshipServiceImpl implements SpaceshipService {

  private PlanetRepository planetRepository;
  private SpaceshipRepository spaceshipRepository;
  private Spaceship spaceship;

  public SpaceshipServiceImpl() {
  }

  @Autowired
  public SpaceshipServiceImpl(PlanetRepository planetRepository, SpaceshipRepository spaceshipRepository) {
    this.planetRepository = planetRepository;
    this.spaceshipRepository = spaceshipRepository;
    this.spaceship = spaceshipRepository.findOneById(1L);
  }

  @Override
  public List<Planet> getAllPlanet() {
    return planetRepository.findAll();
  }

  @Override
  public Spaceship getSpaceship() {
    return spaceship;
  }

  @Override
  public void moveShipToPlanet(Long id) {
    Planet planet = planetRepository.findById(id).get();
    spaceship.setPlanet(planet.getName());
    spaceshipRepository.save(spaceship);
  }

  @Override
  public void movePeopleToShip(Long id) {
    Planet planet = planetRepository.findById(id).get();
    if (checkFreeSpaceOnShip() <= planet.getPopulation()) {
      move60PeopleFromPlanetToShip(id);
    } else {
      moveAllPossiblePeopleFromPlanetToShip(id);
    }
    planetRepository.save(planet);
    spaceshipRepository.save(spaceship);
  }

  public int checkFreeSpaceOnShip() {
    int freeSpaceOnShip = spaceship.getMaxCapacity() - spaceship.getUtilization();
    if (freeSpaceOnShip == 0) {
      return 0;
    } else {
      return freeSpaceOnShip;
    }
  }

  public void move60PeopleFromPlanetToShip(Long id) {
    Planet planet = planetRepository.findById(id).get();
    planet.modifyPopulation(-checkFreeSpaceOnShip());
    spaceship.modifyMovingPeopleOnShip(checkFreeSpaceOnShip());
  }

  public void moveAllPossiblePeopleFromPlanetToShip(Long id) {
    Planet planet = planetRepository.findById(id).get();
    spaceship.setUtilization(planet.getPopulation().intValue());
    planet.setPopulation(0L);
  }

  @Override
  public void movePeopleToPlanet(Long id) {
    Planet planet = planetRepository.findById(id).get();
    planet.modifyPopulation(spaceship.getUtilization());
    spaceship.setUtilization(0);
    planetRepository.save(planet);
    spaceshipRepository.save(spaceship);
  }
}

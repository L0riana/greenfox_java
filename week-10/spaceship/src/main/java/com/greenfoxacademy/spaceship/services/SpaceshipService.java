package com.greenfoxacademy.spaceship.services;

import com.greenfoxacademy.spaceship.models.Planet;
import com.greenfoxacademy.spaceship.models.Spaceship;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SpaceshipService {

  List<Planet> getAllPlanet();

  Spaceship getSpaceship();

  void moveShipToPlanet(Long id);

  void movePeopleToShip(Long id);

  void movePeopleToPlanet(Long id);
}

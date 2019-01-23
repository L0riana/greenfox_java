package com.greenfoxacademy.traveloffice.services;

import com.greenfoxacademy.traveloffice.models.Attraction;
import com.greenfoxacademy.traveloffice.repositories.AttractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AttractionServiceImpl implements AttractionService {

  private AttractionRepository attractionRepository;

  @Autowired
  public AttractionServiceImpl(AttractionRepository attractionRepository) {
    this.attractionRepository = attractionRepository;
  }

  @Override
  public List<Attraction> findAll() {
    return (List<Attraction>) attractionRepository.findAll();
  }

  @Override
  public void save(Attraction attraction) {
    attractionRepository.save(attraction);
  }

  @Override
  public Attraction findById(int id) {
    return attractionRepository.findById(id);
  }

  @Override
  public List<Attraction> findAllByCityAndCategory(String city, String category) {
    if (city != null && category == null) {
      return attractionRepository.findAllByCity(city);
    } else if (category != null && city == null) {
      return attractionRepository.findAllByCategory(category);
    } else if (city != null && category != null)
      return attractionRepository.findAllByCityAndCategory(city, category);
    return (List<Attraction>) attractionRepository.findAll();
  }
}

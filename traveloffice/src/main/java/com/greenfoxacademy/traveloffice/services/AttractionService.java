package com.greenfoxacademy.traveloffice.services;

import com.greenfoxacademy.traveloffice.models.Attraction;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AttractionService {

  List<Attraction> findAll();

  void save(Attraction attraction);

  Attraction findById(int id);

  List<Attraction> findAllByCityAndCategory(String city, String category);
}

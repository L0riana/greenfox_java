package com.greenfoxacademy.licenceplate.services;

import com.greenfoxacademy.licenceplate.models.LicencePlate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LicencePlateService {

  List<LicencePlate> getAll();

  List<LicencePlate> getByBrand(String carBrand);

  boolean validateSearch(String plate);

  List<LicencePlate> getAllPolice();

  List<LicencePlate> getAllDiplomat();

  List<LicencePlate> getAllByPlate(String plate);

  List<LicencePlate> searchedPlate(String plate);

}

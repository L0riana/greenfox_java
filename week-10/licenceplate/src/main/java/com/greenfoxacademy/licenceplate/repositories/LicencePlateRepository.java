package com.greenfoxacademy.licenceplate.repositories;

import com.greenfoxacademy.licenceplate.models.LicencePlate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LicencePlateRepository extends CrudRepository<LicencePlate, String> {

  List<LicencePlate> findAll();

  List<LicencePlate> findAllByCarBrand(String brand);

  List<LicencePlate> findAllByPlateContaining(String plate);

  List<LicencePlate> findAllByPlateStartingWith(String plate);
}

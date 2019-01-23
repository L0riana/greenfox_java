package com.greenfoxacademy.traveloffice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "attractions")
public class Attraction {

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private Integer id;
  private String attrName;
  private String city;
  private String category;
  private int price;
  private float longitude;
  private float lattitude;
  private float recommendedAge;
  private int duration;

  public Integer getId() {
    return id;
  }

  public String getAttrName() {
    return attrName;
  }

  public String getCity() {
    return city;
  }

  public String getCategory() {
    return category;
  }

  public int getPrice() {
    return price;
  }

  public float getLongitude() {
    return longitude;
  }

  public float getLattitude() {
    return lattitude;
  }

  public float getRecommendedAge() {
    return recommendedAge;
  }

  public int getDuration() {
    return duration;
  }
}

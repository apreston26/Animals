package edu.cnm.deepdive.animals.model;

public class Animal {

  private String name;
  private Taxonmy taxonmy;
  private String location;
  private Speed speed;
  private String diet;
  private String lifespan;
  private String image;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Taxonmy getTaxonmy() {
    return taxonmy;
  }

  public void setTaxonmy(Taxonmy taxonmy) {
    this.taxonmy = taxonmy;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Speed getSpeed() {
    return speed;
  }

  public void setSpeed(Speed speed) {
    this.speed = speed;
  }

  public String getDiet() {
    return diet;
  }

  public void setDiet(String diet) {
    this.diet = diet;
  }

  public String getLifespan() {
    return lifespan;
  }

  public void setLifespan(String lifespan) {
    this.lifespan = lifespan;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }
}

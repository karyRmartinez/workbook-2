package org.example;

public class Donut {
  private String type;
  private int calories;
  private double price;
  private String description;

  public Donut(String type, int calories, double price, String description) {
      this.type = type;
      this.calories = calories;
      this.price = price;
      this.description = description;

    }


    public String toString() {
    return "Donut '" +
            "type: '" + type + '\'' +
            ", calories=" + calories +
            ", price=" + price +
            ", description='" + description + '\'' +
            '.';
    }
}
package hw.step.entity;

public class City {
  private int id;
  private String name;

  public City(String name)
  {
    this.name=name;
  }

  public City(int id, String name) {
    this.id = id;
    this.name = name;
  }



  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "City{" +
        "name='" + name + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof City)) return false;

    City city = (City) o;

    if (id != city.id) return false;
    return name != null ? name.equals(city.name) : city.name == null;
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    return result;
  }
}

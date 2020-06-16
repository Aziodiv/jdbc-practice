package com.bta;

public class Country {
    private long id;
    private String name;
    private int yearEstablish;
    private int population;
    private String description;

    public Country(String name, int yearEstablish, int population, String description) {
        this.name = name;
        this.yearEstablish = yearEstablish;
        this.population = population;
        this.description = description;
    }

    public Country(long id, String name, int yearEstablish, int population, String description) {
        this.id = id;
        this.name = name;
        this.yearEstablish = yearEstablish;
        this.population = population;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearEstablish() {
        return yearEstablish;
    }

    public void setYearEstablish(int yearEstablish) {
        this.yearEstablish = yearEstablish;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "\nCountry{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearEstablish=" + yearEstablish +
                ", population=" + population +
                ", description='" + description + '\'' +
                '}';
    }


}

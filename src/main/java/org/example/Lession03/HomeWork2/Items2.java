package org.example.Lession03.HomeWork2;

public class Items2 {
    private String name;
    private String countryName;
    private Double price;
    private Double weight;
    private Integer sort;

    public Items2(String name, String countryName, Double price, Double weight, Integer sort) {
        this.name = name;
        this.countryName = countryName;
        this.price = price;
        this.weight = weight;
        this.sort = sort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}

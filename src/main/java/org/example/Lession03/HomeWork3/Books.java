package org.example.Lession03.HomeWork3;

public class Books {
    private String name;
    private String author;
    private Double price;
    private Integer year;
    private Integer pgNum;

    public Books(String name, String author, Double price, Integer year, Integer pgNum) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.year = year;
        this.pgNum = pgNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getPgNum() {
        return pgNum;
    }

    public void setPgNum(Integer pgNum) {
        this.pgNum = pgNum;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", pgNum=" + pgNum +
                '}';
    }
}

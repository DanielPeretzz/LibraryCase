package com.homework.daniel.book.Model;

import java.util.Objects;

public class BestSeller extends Book implements Comparable <Book>{
    public BestSeller(int id, String name, double price, String summary, int worldCopies) {
        super(id, name, price);
        this.summary = summary;
        this.worldCopies = worldCopies;
    }

    private String summary;
    private int worldCopies;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getWorldCopies() {
        return worldCopies;
    }

    public void setWorldCopies(int worldCopies) {
        this.worldCopies = worldCopies;
    }
    @Override
    public int compareTo(Book o) {
        if(this.getPrice() == o.getPrice() && Objects.equals(this.getName(), o.getName()))
            return 1;
        else {
            return 0;
        }
    }

    @Override
    public String toString() {
        System.out.println("BestSeller{" +
                "summary='" + summary + '\'' +
                ", worldCopies=" + worldCopies +
                "} " + super.toString());
        return null;
    }
}

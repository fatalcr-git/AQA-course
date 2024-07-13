package org.aston.course;

import java.util.ArrayList;

public class Park {
    private String name;
    private String location;
    private ArrayList<Attraction> attractions = new ArrayList<Attraction>();

    private class Attraction {
        private String name;
        private float price;
        private String workTime;

        public Attraction(String name, float price, String workTime) {
            this.name = name;
            this.price = price;
            this.workTime = workTime;
        }

        public void printAttractionInfo() {
            System.out.println("AttractionName: " + name);
            System.out.println("AttractionPrice: " + price);
            System.out.println("AttractionWorkTime: " + workTime);
        }
    }

    public Park(String name, String location, ArrayList<Attraction> attractions) {
        this.name = name;
        this.location = location;
        this.attractions = attractions;
    }

    public Park(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void addAtraction(String name, float price, String workTime) {
        attractions.add(new Attraction(name, price, workTime));
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        for (Attraction attraction : attractions) {
            attraction.printAttractionInfo();
        }
    }
}

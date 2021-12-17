package com.example.demo.models;

import java.util.Objects;

public class Bag {
    private int destinationId;
    private int baggageId;

    public Bag(int destinationId, int baggageId) {
        this.destinationId = destinationId;
        this.baggageId = baggageId;
    }

    public int getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(int destinationId) {
        this.destinationId = destinationId;
    }

    public int getBaggageId() {
        return baggageId;
    }

    public void setBaggageId(int baggageId) {
        this.baggageId = baggageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bag bag = (Bag) o;
        return destinationId == bag.destinationId &&
                baggageId == bag.baggageId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(destinationId, baggageId);
    }
}

package edu.mrodrigochaves.lasagna;

public class Lasagna {

    // TODO: define the 'expectedMinutesInOven()' method
    private final int expectedTime = 40;

    public int expectedMinutesInOven() {
        return expectedTime;

    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int timeMinInOven) {
        return expectedMinutesInOven() - timeMinInOven;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numLayers) {
        return numLayers * 2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numLayers, int timeInOven) {
        return preparationTimeInMinutes(numLayers) + timeInOven;
    }
}

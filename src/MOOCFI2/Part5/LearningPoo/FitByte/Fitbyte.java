package MOOCFI2.Part5.LearningPoo.FitByte;

public class Fitbyte {

    private int age;
    private double restingHeartRate;
    private double maximumHeartRate;
    private double targetHeartRatePercentage;

    public Fitbyte(int age, double restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        return (maximumHeartRate - restingHeartRate) * (percentageOfMaximum + restingHeartRate);
    }
}

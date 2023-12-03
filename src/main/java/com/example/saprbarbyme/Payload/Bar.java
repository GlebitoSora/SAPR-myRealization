package com.example.saprbarbyme.Payload;


public class Bar {
    private double lengthOfBar;
    private double squareOfBar;
    private double elasticModuleOfBar;
    private double voltageOfBar;

    public Bar(double lengthOfBar, double squareOfBar, double elasticModuleOfBar, double voltageOfBar) {
        this.lengthOfBar = lengthOfBar;
        this.squareOfBar = squareOfBar;
        this.elasticModuleOfBar = elasticModuleOfBar;
        this.voltageOfBar = voltageOfBar;
    }

    public double getSquareOfBar() {
        return squareOfBar;
    }

    public double getLengthOfBar() {
        return lengthOfBar;
    }

    public void setLengthOfBar(int lengthOfBar) {
        this.lengthOfBar = lengthOfBar;
    }

    public void setSquareOfBar(double squareOfBar) {
        this.squareOfBar = squareOfBar;
    }

    public double getElasticModuleOfBar() {
        return elasticModuleOfBar;
    }

    public double getVoltageOfBar() {
        return voltageOfBar;
    }

    public void setElasticModuleOfBar(double elasticModuleOfBar) {
        this.elasticModuleOfBar = elasticModuleOfBar;
    }

    public void setVoltageOfBar(double voltageOfBar) {
        this.voltageOfBar = voltageOfBar;
    }
}



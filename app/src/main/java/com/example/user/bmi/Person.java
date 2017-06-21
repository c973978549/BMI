package com.example.user.bmi;


import java.io.Serializable;

public class Person implements Serializable {
    private double height,weight,BMI;

    public Person(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        BMI = weight/Math.pow(height,2);
        return String.valueOf(BMI);
    }

    public String judgeLevel(){
        BMI = weight/Math.pow(height,2);
        if(BMI<18.5){
            return "UnderWeight";
        }else if(BMI>=18.5 && BMI<25){
            return "Normal Weight";
        }else if(BMI>=25 && BMI <30){
            return "OverWeight";
        }else{
            return "Obese";
        }
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

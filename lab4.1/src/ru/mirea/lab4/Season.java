package ru.mirea.lab4;

public enum Season {
    WINTER(-15), SPRING(8), SUMMER(25){
        @Override
        public String getDescription() {
            return "Тёплое время года";
        }
    }, AUTUMN(10);

    private double temp;

    public double getTemp() {
        return temp;
    }

    Season(double temp) {
        this.temp = temp;
    }

    public String getDescription() {
        return "Холодное время года";
    }

}

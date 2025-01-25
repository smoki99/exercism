public class CarsAssemble {
    final static double CARS_PRODUCED_EACH_HOUR=221;
    
    public double productionRatePerHour(int speed) {
        return CARS_PRODUCED_EACH_HOUR * speed * getSuccessRate(speed);        
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed)/60;
    }

    private double getSuccessRate(int speed) {
        if (speed <=4) return 1;
        if (speed<=8)  return 0.9;
        if (speed==9)  return 0.8;
        return 0.77;
    }
}

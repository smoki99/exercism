public class CarsAssemble {
    final static double CARS_PRODUCED_EACH_HOUR=221;
    
    public double productionRatePerHour(int speed) {
        double successRate = 
            speed <=4 ? 1 : speed <= 8 ? .9 : speed == 9 ? .8 : .77;
        return CARS_PRODUCED_EACH_HOUR * speed * successRate;        
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed)/60;
    }
}

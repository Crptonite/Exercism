// public class JedliksToyCar {
//     public static JedliksToyCar buy() {
//         throw new UnsupportedOperationException("Please implement the (static) JedliksToyCar.buy()  method");
//     }

//     public String distanceDisplay() {
//         throw new UnsupportedOperationException("Please implement the JedliksToyCar.distanceDisplay()  method");
//     }

//     public String batteryDisplay() {
//         throw new UnsupportedOperationException("Please implement the JedliksToyCar.batteryDisplay()  method");
//     }

//     public void drive() {
//         throw new UnsupportedOperationException("Please implement the JedliksToyCar.drive()  method");
//     }
// }

public class JedliksToyCar {
    private int totalDistance = 0;
    private int batteryPercentage = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }
    public String distanceDisplay() {
        return "Driven " + this.totalDistance + " meters";
    }
    public String batteryDisplay() {
        return this.batteryPercentage > 0 ? "Battery at " + this.batteryPercentage + "%" : "Battery empty";
    } //Problem if batteryPercentage>100% then how?
    public void drive() {
        if(this.batteryPercentage > 0) {
            this.totalDistance += 20;
            this.batteryPercentage -= 1;
        }
    }
    
}


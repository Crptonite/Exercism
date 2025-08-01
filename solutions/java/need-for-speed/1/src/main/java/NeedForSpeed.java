// class NeedForSpeed {
//     NeedForSpeed(int speed, int batteryDrain) {
//         // throw new UnsupportedOperationException("Please implement the NeedForSpeed constructor");
//     }

//     public boolean batteryDrained() {
//         throw new UnsupportedOperationException("Please implement the NeedForSpeed.batteryDrained() method");
//     }

//     public int distanceDriven() {
//         throw new UnsupportedOperationException("Please implement the NeedForSpeed.distanceDriven() method");
//     }

//     public void drive() {
//         throw new UnsupportedOperationException("Please implement the NeedForSpeed.drive() method");
//     }

//     public static NeedForSpeed nitro() {
//         throw new UnsupportedOperationException("Please implement the (static) NeedForSpeed.nitro() method");
//     }
// }

// class RaceTrack {
//     RaceTrack(int distance) {
//         throw new UnsupportedOperationException("Please implement the RaceTrack constructor");
//     }

//     public boolean canFinishRace(NeedForSpeed car) {
//         throw new UnsupportedOperationException("Please implement the RaceTrack.canFinishRace() method");
//     }
// }



class NeedForSpeed {
    public int speed, batteryDrain;
    private int battery = 100;
    private int distance = 0;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }
    public boolean batteryDrained() {
        return this.battery - this.batteryDrain < 0;
    }
    public int distanceDriven() {
        return this.distance;
    }
    public void drive() {
        if (!batteryDrained()) {
            this.distance += this.speed;
            this.battery -= this.batteryDrain;
        }
    }
    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}
class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }
    public boolean canFinishRace(NeedForSpeed car) {
        return this.distance <= (100 / car.batteryDrain) * car.speed;
    }
}

// class BirdWatcher {
//     private final int[] birdsPerDay;

//     public BirdWatcher(int[] birdsPerDay) {
//         this.birdsPerDay = birdsPerDay.clone();
//     }

//     public int[] getLastWeek() {
//         // throw new UnsupportedOperationException("Please implement the BirdWatcher.getLastWeek() method");
//         return new int[]{0, 2, 5, 3, 7, 8, 4};
//     }

//     public int getToday() {
//         // throw new UnsupportedOperationException("Please implement the BirdWatcher.getToday() method");

//     }

//     public void incrementTodaysCount() {
//         // throw new UnsupportedOperationException("Please implement the BirdWatcher.incrementTodaysCount() method");
        
//     }

//     public boolean hasDayWithoutBirds() {
//         throw new UnsupportedOperationException("Please implement the BirdWatcher.hasDayWithoutBirds() method");
//     }

//     public int getCountForFirstDays(int numberOfDays) {
//         throw new UnsupportedOperationException("Please implement the BirdWatcher.getCountForFirstDays() method");
//     }

//     public int getBusyDays() {
//         throw new UnsupportedOperationException("Please implement the BirdWatcher.getBusyDays() method");
//     }
// }
import java.util.Arrays;
class BirdWatcher {
    private int[] birdsPerDay;
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }
    public int[] getLastWeek() {
        return birdsPerDay;
    }
    public int getToday() {
        return birdsPerDay.length == 0 ? 0 : birdsPerDay[birdsPerDay.length - 1];
    }
    public int incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] += 1;
        return getToday();
    }
    public boolean hasDayWithoutBirds() {
        Arrays.sort(birdsPerDay);
        return Arrays.binarySearch(birdsPerDay, 0) != -1;
    }
    public int getCountForFirstDays(int numberOfDays) {
        int count = birdsPerDay[0];
        if (numberOfDays > birdsPerDay.length) {
            numberOfDays = birdsPerDay.length;
        }
        
        for (int i = 1; i < numberOfDays; i++) {
            count += birdsPerDay[i];
        }
        
        return count;
    }
    public int getBusyDays() {
        int countBusy = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] >= 5) {
                countBusy++;
            }
        }
        
        return countBusy;
    }
}

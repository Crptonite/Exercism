// class AnnalynsInfiltration {

//     // A fast attack can only be made if the knight is NOT awake.
//     public static boolean canFastAttack(boolean knightIsAwake) {
//         return !knightIsAwake;
//     }

//     // The player can spy if at least one person (knight, archer, or prisoner) is awake.
//     public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
//         return knightIsAwake || archerIsAwake || prisonerIsAwake;
//     }

//     // The player can signal the prisoner if the prisoner is awake and the archer is NOT awake.
//     public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
//         return prisonerIsAwake && !archerIsAwake;
//     }

//     // The player can free the prisoner if:
//     // - The pet dog is present AND not everyone is awake
//     // OR
//     // - The prisoner is awake AND both the knight and archer are NOT awake.
//     public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
//         // If the pet dog is present but everyone is awake, return false
//         if (petDogIsPresent && knightIsAwake && archerIsAwake && prisonerIsAwake) {
//             return false;
//         }
//         // Otherwise, use the original logic
//         return petDogIsPresent || (prisonerIsAwake && !knightIsAwake && !archerIsAwake);
//     }

// public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
//     if (petDogIsPresent) {
//         return true;
//     } else {
//         return prisonerIsAwake && !knightIsAwake && !archerIsAwake;
//     }
// }
//     // Main method to test the logic
//     public static void main(String[] args) {
//         // Test cases
//         System.out.println(canFreePrisoner(true, true, true, true));  // Expected: true (pet dog is present)
//         System.out.println(canFreePrisoner(true, true, true, false)); // Expected: false (no pet dog, knight/archer awake)
//         System.out.println(canFreePrisoner(false, false, true, false)); // Expected: true (prisoner awake, knight/archer asleep)
//         System.out.println(canFreePrisoner(false, false, false, false)); // Expected: false (prisoner asleep)
//     }
// }

class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }
    // if (knightISAwake){ return false}, else{return true}

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return prisonerIsAwake && !archerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return (prisonerIsAwake && !archerIsAwake && !knightIsAwake) || (!archerIsAwake && petDogIsPresent);
    }
}
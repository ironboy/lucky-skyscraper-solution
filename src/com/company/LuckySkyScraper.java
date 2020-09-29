package com.company;

public class LuckySkyScraper {

    // BASIC LOGIC
    /*static public void floorList(int totalRealFloors){
        // loop through real floor numbers
        var fakeFloor = 1;
        for(var realFloor = 1; realFloor <= totalRealFloors; realFloor++){
            System.out.println("realFloor: " + realFloor + " fakeFloor: " + fakeFloor);
            // add 1 to fakeFloor and continue adding 1 as long as
            // fakeFloor ends with 4 or ends with 13
            do {
                fakeFloor++;
            } while(fakeFloor % 10 == 4 || fakeFloor % 100 == 13);
        }
    }*/

    static public int toRealFloor(int fakeFloorGoal){
        var fakeFloor = 1;
        for(var realFloor = 1; realFloor <= fakeFloorGoal; realFloor++){
           if(fakeFloorGoal == fakeFloor) {
               return realFloor; // this ends the loop and the method
           }
           do {
                fakeFloor++;
            } while(fakeFloor % 10 == 4 || fakeFloor % 100 == 13);
        }
        return -1; // could not find real floor number
    }

}

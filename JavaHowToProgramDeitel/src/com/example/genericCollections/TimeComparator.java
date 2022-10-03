package com.example.genericCollections;

import java.util.Comparator;

/**
  A class that implements Comparator must declare a compare method that receives two arguments
 and returns a negative integer if the first argument is less than the second, 0 if the arguments
 are equal or positive integer if the first argument is less than the second

* */



public class TimeComparator  implements Comparator<Time2> {

  @Override
  public int compare(Time2 time1, Time2 time2) {

    int hourDifference = time1.getHour() - time2.getHour();

    if(hourDifference != 0){
      return  hourDifference;
    }

    int minuteDifference = time1.getMinute() - time2.getMinute();
    if(minuteDifference != 0){
      return minuteDifference;
    }

    int secondDifference = time1.getSecond() - time2.getSecond();
    return secondDifference;
  }
}

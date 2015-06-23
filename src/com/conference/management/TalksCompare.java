package com.conference.management;

import java.util.Comparator;

/**
 * Created by eSumit on 6/14/15.
 * This talkscompare implements the comparator to sort the talks in descending order based on the talktime.
 */
public class TalksCompare implements Comparator<Talks>{

    @Override
    public int compare(Talks t1, Talks t2) {
        if(t1.getMinutes() < t2.getMinutes()){
            return 1;
        } else {
            return -1;
        }
    }
}

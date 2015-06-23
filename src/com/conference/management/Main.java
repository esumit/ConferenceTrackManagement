package com.conference.management;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eSumit on 6/14/15.
 * This is a  main driver function,it test the written functions of conference class which receive the talks input then process the input,
 * then it schedule talks into track, and then output of talks into tracks.
 */

public class Main {

    public static void main(String[] args) {

       // Create a new Conference Object.
        Conference conference = new Conference();

        // Process the received inout of Talks's Title and their time.
        conference.ProcessTalksInput(TrackConfiguration.TALKS_INPUT_FILE);

        // Get the no. of Tracks required to schedule all of these talks.
        int numberOfTracks = conference.getCountTrack();


        int startTalkIndex = 0;

        // Schedule the Talks into Tracks.
        for(int trackCount = 0; trackCount <numberOfTracks; trackCount++)
        {
            startTalkIndex = conference.ScheduleTalksIntoTracks(trackCount, conference.getTrackTalks(), conference.getCountTrack(), startTalkIndex, conference.getCountTalks());
        }

        // Output the schedule of Talks into tracks.
        conference.OutputOfTalksIntoTracks(conference.getTrackTalks());

    }
}

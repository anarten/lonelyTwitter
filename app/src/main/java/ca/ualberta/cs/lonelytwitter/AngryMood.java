/*
 * Class Name: AngryMood
 *
 * Version: 1.0
 *
 * Date: September 28, 2017
 *
 * Copyright (c) Team X, CMPUT301, University of Alberta - All Rights Reserverd. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behavior at the University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents an Angry Mood
 *
 * @author anarten
 * @version 1.0
 * @see CurrentMood
 * @see Tweet
 * @since 1.0
 */
public class AngryMood extends CurrentMood {

    /**
     * Constructor for an angry mood
     * @param mood the mood
     * @param date the date
     */
    public AngryMood(String mood, Date date) {
        super(mood, date);
    }

    /**
     * Constructor for an angry mood
     * @param mood
     */
    public AngryMood(String mood) {
        super(mood);
    }

    /**
     * Overrides the toString function
     * @return String representing mood
     */
    @Override
    public String format(){
        return ">:(";
    }

}

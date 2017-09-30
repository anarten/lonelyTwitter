/*
 * Class Name: CurrentMood
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
 * Represents a Mood
 *
 * @author anarten
 * @version 1.0
 * @see AngryMood
 * @see HappyMood
 * @see Tweet
 * @since 1.0
 */

public abstract class CurrentMood extends Object {
    private String mood;
    private Date date;

    /**
     * Constructor for CurrentMood
     * @param mood the mood
     * @param date the date
     */
    public CurrentMood(String mood, Date date) {
        this.setMood(mood);
        this.setDate(date);
    }

    /**
     * Constructor for CurrentMood
     * @param mood the mood
     */
    public CurrentMood(String mood) {
        this.setMood(mood);
        this.setDate(new Date());
    }

    /**
     * Fetches the mood
     * @return mood a string
     */
    public String getMood() {
        return mood;
    }

    /**
     * Sets the mood
     * @param mood String
     */
    public void setMood(String mood)  {
        this.mood = mood;
    }

    /**
     * Fetches the date
     * @return date Date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the date
     * @param date Date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Emoji string to be implemented
     * @return String
     */
    public abstract String format();

}

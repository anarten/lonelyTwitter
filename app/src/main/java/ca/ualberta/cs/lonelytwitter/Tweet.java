/*
 * Class Name: Tweet
 *
 * Version: 1.0
 *
 * Date: September 28, 2017
 *
 * Copyright (c) Team X, CMPUT301, University of Alberta - All Rights Reserverd. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behavior at the University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a Tweet
 *
 * @author anarten
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @see Tweetable
 * @see TweetTooLongException
 * @since 1.0
 */

public abstract class Tweet extends Object implements Tweetable {
    private String message;
    private Date date;
    private ArrayList<CurrentMood> moodList = new ArrayList<CurrentMood>();

    /**
     * Constructs Tweet Objects
     *
     * @param tweet
     * @param date
     * @throws TweetTooLongException
     */
    public Tweet(String tweet, Date date) throws TweetTooLongException {
        this.setMessage(tweet);
        this.date = date;
    }

    /**
     * Constructs Tweet Objects
     *
     * @param tweet
     * @throws TweetTooLongException
     */
    public Tweet(String tweet) throws TweetTooLongException {
        this.setMessage(tweet);
        this.date = new Date();
    }

    /**
     * Fetch the tweet message
     *
     * @return tweet message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets tweet messages
     *
     * @param message Tweet message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() <= 140) {
            this.message = message;
        } else {
            throw new TweetTooLongException();
        }
    }

    /**
     * Get the date of the tweet
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Set the date of the tweet
     * @param date the date of the tweet
     */
    public void setDate(Date date) {
        this.date = date;
    }


    /**
     * Sets the mood of the tweet
     * @param mood the mood of the tweet
     */
    public void setMoodList(ArrayList<CurrentMood> mood) {
        this.moodList = mood;
    }

    /**
     * Fetches the moodlist of the tweet
     * @return moodlist ArrayList<CurrentMood>
     */
    public ArrayList<CurrentMood> getMoodList() {
        return moodList;
    }

    /**
     * Indicates if a tweet is important
     * not implemented in this abstract class
     * @return
     */
    public abstract Boolean isImportant();

    /**
     * Overrides the toString method
     * @return String representing the tweet
     */
    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }

}

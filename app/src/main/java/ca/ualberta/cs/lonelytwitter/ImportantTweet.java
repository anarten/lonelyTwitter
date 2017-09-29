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

import java.util.Date;

/**
 * Represents an ImportantTweet
 *
 * @author anarten
 * @version 1.0
 * @see Tweet
 * @see NormalTweet
 * @see Tweetable
 * @see TweetTooLongException
 * @since 1.0
 */
public class ImportantTweet extends Tweet {
    /**
     * Constructor for Important Tweet
     * @param tweet tweet message
     * @param date tweet date
     * @throws TweetTooLongException exception (greater than 140 chars)
     */
    public ImportantTweet(String tweet, Date date) throws TweetTooLongException {
        super(tweet, date);
    }

    /**
     * Constructor for ImportantTweet
     * @param tweet tweet message
     * @throws TweetTooLongException exception (greater than 140 chars)
     */
    public ImportantTweet(String tweet) throws TweetTooLongException {
        super(tweet);
    }

    /**
     * Decalres a tweet as important
     * @return BOOLEAN TRUE
     */
    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }

    /**
     * Adds "!!!" to the string of a tweet
     * @return !!!+getMessage()
     */
    @Override
    public String getMessage() {
        return "!!!" + super.getMessage();
    }

}

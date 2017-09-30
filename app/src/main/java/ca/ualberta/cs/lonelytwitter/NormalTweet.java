/*
 * Class Name: NormalTweet
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
 * Represents an NormalTweet
 *
 * @author anarten
 * @version 1.0
 * @see Tweet
 * @see ImportantTweet
 * @see Tweetable
 * @see TweetTooLongException
 * @since 1.0
 */
public class NormalTweet extends Tweet {
    /**
     * Constructor for Normal tweet
     * @param tweet tweet message
     * @param date the date
     * @throws TweetTooLongException exception if greater than 140 chars
     */
    public NormalTweet(String tweet, Date date) throws TweetTooLongException {
        super(tweet, date);
    }

    /**
     * Constructor for Normal Tweet
     * @param tweet tweet message
     * @throws TweetTooLongException exception if greater than 140 chars
     */
    public NormalTweet(String tweet) throws TweetTooLongException {
        super(tweet);
    }

    /**
     * Declares the tweet as not important
     * @return BOOLEAN FALSE
     */
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}

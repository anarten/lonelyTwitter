/*
 * Class Name: Tweetable
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
 * Represents a Tweetable
 *
 * @author anarten
 * @version 1.0
 * @see Tweet
 * @see ImportantTweet
 * @see NormalTweet
 * @since 1.0
 */
public interface Tweetable {
    /**
     * Defines a get message functionality
     * @return message String representing message
     */
    public String getMessage();

    /**
     * Defines a get date functionality
     * @return date Date of tweet
     */
    public Date getDate();
}

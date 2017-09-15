package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.Date;

/**
 * Created by anarten on 9/14/17.
 */
public abstract class Tweet extends Object implements Tweetable {
    private String message;
    protected Date date;

    public Tweet(String tweet, Date date) throws TweetTooLongException {
        this.setMessage(tweet);
        this.date = date;
    }

    public Tweet(String tweet) throws TweetTooLongException {
        this.setMessage(tweet);
        this.date = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String text) throws TweetTooLongException {
        if (text.length() <= 140) {
            this.message = text;
        } else {
            throw new TweetTooLongException();
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract Boolean isImportant();

}

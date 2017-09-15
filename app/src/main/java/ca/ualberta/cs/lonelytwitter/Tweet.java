package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by anarten on 9/14/17.
 */
public abstract class Tweet extends Object implements Tweetable {
    private String message;
    private Date date;
    private ArrayList<CurrentMood> moodList = new ArrayList<CurrentMood>();

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

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() <= 140) {
            this.message = message;
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

    public void setMoodList(ArrayList<CurrentMood> mood) {
        this.moodList = mood;
    }

    public ArrayList<CurrentMood> getMoodList() {
        return moodList;
    }


    public abstract Boolean isImportant();

}

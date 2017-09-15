package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by anarten on 9/14/17.
 */

public abstract class CurrentMood extends Object {
    private String mood;
    private Date date;

    public CurrentMood(String mood, Date date) {
        this.setMood(mood);
        this.setDate(date);
    }

    public CurrentMood(String mood) {
        this.setMood(mood);
        this.setDate(new Date());
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood)  {
        this.mood = mood;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}

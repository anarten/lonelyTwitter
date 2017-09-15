package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by anarten on 9/14/17.
 */

public class AngryMood extends CurrentMood {
    public AngryMood(String mood, Date date) {
        super(mood, date);
    }

    public AngryMood(String mood) {
        super(mood);
    }

    @Override
    public String format(){
        return ">:(";
    }

}

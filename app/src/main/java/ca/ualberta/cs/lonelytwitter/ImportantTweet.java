package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by anarten on 9/14/17.
 */
public class ImportantTweet extends Tweet {
    public ImportantTweet(String tweet, Date date) throws TweetTooLongException {
        super(tweet, date);
    }

    public ImportantTweet(String tweet) throws TweetTooLongException {
        super(tweet);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }

    @Override
    public String getMessage() {
        return "!!!" + super.getMessage();
    }

}

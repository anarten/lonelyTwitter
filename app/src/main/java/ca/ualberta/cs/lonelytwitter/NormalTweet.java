package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by anarten on 9/14/17.
 */
public class NormalTweet extends Tweet {
    public NormalTweet(String tweet, Date date) throws TweetTooLongException {
        super(tweet, date);
    }

    public NormalTweet(String tweet) throws TweetTooLongException {
        super(tweet);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}

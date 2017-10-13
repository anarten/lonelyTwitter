package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by anarten on 10/12/17.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList(){

    }

    public void addTweet(Tweet tweet) throws IllegalArgumentException {
        if (tweets.contains(tweet)){
            throw new IllegalArgumentException();
        } else {
            tweets.add(tweet);
        }
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public ArrayList<Tweet> getTweets(){
        Collections.sort(tweets, new Comparator<Tweet>() {
            public int compare(Tweet lhs, Tweet rhs) {
                return lhs.getDate().compareTo(rhs.getDate());
            }
        });
        return tweets;
    }

    public int getCount() {
        return 1;
    }
}

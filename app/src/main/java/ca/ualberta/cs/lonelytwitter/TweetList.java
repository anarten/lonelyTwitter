package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

class TweetList { // removed public modifier to make Tweetable package private. Classes outside of the current package do not need to access this class
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList(){

    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public void add(Tweet tweet) {
        tweets.add(tweet);
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }
}

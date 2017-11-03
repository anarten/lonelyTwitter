package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

interface Tweetable { // removed public modifier to make Tweetable package private. Classes outside of the current package do not need to access this class
    // removed unnecessary public modifiers in front of getMessage and getDate methods.
    // I made this fix because public is redundant for interface methods
    String getMessage();

    Date getDate();

}

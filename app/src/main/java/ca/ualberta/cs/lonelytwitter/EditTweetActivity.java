package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class EditTweetActivity extends Activity {

    private static final String FILENAME = "file.sav";
    private ArrayList<Tweet> tweetList = new ArrayList<Tweet>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
    }

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        loadFromFile();

        Bundle extras = getIntent().getExtras();
        int position = extras.getInt("position");
        Tweet tweet = (Tweet) tweetList.get(position);

        TextView date = (TextView) findViewById(R.id.textView);
        TextView message = (TextView) findViewById(R.id.textView2);

        date.setText(tweet.getDate().toString());
        message.setText(tweet.getMessage());

    }

    private void loadFromFile() {
        try {
            FileInputStream fis = openFileInput(FILENAME);
            BufferedReader in = new BufferedReader(new InputStreamReader(fis));
            Gson gson = new Gson();
            //Code taken from http://stackoverflow.com/questions/12384064/gson-convert-from-json-to-a-typed-arraylistt Sept.22,2016
            Type listType = new TypeToken<ArrayList<NormalTweet>>(){}.getType();
            tweetList = gson.fromJson(in, listType);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            tweetList = new ArrayList<Tweet>();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            throw new RuntimeException();
        }
    }
}

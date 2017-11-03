package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.widget.EditText;
import android.widget.ListView;

import com.robotium.solo.Solo;
// removed unused imports because this makes the code cleaner and easier to follow.

public class LonelyTwitterActivityTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {
    private Solo solo;

    public LonelyTwitterActivityTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
        Log.d("SETUP", "setUp()");
    }

    public void testStart() throws Exception {
        Activity activity = getActivity();

    }

    public void testTweet() {
        solo.assertCurrentActivity("wrong activity", LonelyTwitterActivity.class);
        solo.clickOnButton("Clear");

        solo.enterText((EditText) solo.getView(R.id.body), "Test Tweet!");
        solo.clickOnButton("Save");
        solo.clearEditText((EditText) solo.getView(R.id.body));
        assertTrue(solo.waitForText("Test Tweet!"));

        solo.clickOnButton("Clear");
        assertFalse(solo.waitForText("Test Tweet!", 1, 1000));
    }

    /**
     * My test for the lab exercise
     */
    public void testEditTweetActivity() {
        LonelyTwitterActivity activity = (LonelyTwitterActivity) solo.getCurrentActivity();

        solo.assertCurrentActivity("wrong activity", LonelyTwitterActivity.class);
        solo.clickOnButton("Clear");

        solo.enterText((EditText) solo.getView(R.id.body), "Test Tweet!");
        solo.clickOnButton("Save");
        solo.clearEditText((EditText) solo.getView(R.id.body));
        assertTrue(solo.waitForText("Test Tweet!"));

        final ListView oldTweetsList = activity.getOldTweetsList();
        Tweet tweet = (Tweet) oldTweetsList.getItemAtPosition(0);
        assertEquals("Test Tweet!", tweet.getMessage());

        solo.clickInList(0);
        solo.assertCurrentActivity("wrong activity", EditTweetActivity.class);

        assertTrue(solo.waitForText("Test Tweet!"));
        solo.goBack();
        solo.assertCurrentActivity("wrong activity", LonelyTwitterActivity.class);

    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }
}
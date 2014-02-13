package ca.ualberta.cs.lonelytwitter.test;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Instrumentation;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ViewAsserts;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;

/*
 * generate this class with new.. JUnit Test Case
 * set superclass to ActivityInstrumentationTestCase2
 */
@SuppressLint("NewApi")
public class LonelyTwitterActivityUITest extends
		ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	Instrumentation instrumentation;
	Activity activity;
	EditText textInput;
	
	public LonelyTwitterActivityUITest() {
		super(LonelyTwitterActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		instrumentation = getInstrumentation();
		activity = getActivity();

		textInput = ((EditText) activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.body));
	}
	
	public void testMakeTweet() throws Throwable{
		runTestOnUiThread(new Runnable()
		{
			
			@Override
			public void run() {
				ListView listView = (ListView)activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.oldTweetsList);
				Adapter adapter = listView.getAdapter();
				int original_size = adapter.getCount();
				original_size++;
				String tweet = "TDD 4 LYFE #YOLO";
				makeTweet(tweet);
				int new_size = adapter.getCount();
				assertEquals("Size of original adapter should be increased by 1", original_size, new_size);
				
				
			}
		});
	}
	
	public void testIsNormalTweetModel() throws Throwable{
		runTestOnUiThread(new Runnable()
		{
			
			@Override
			public void run() {
				ListView listView = (ListView)activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.oldTweetsList);
				Adapter adapter = listView.getAdapter();
				String tweet = "TDD 4 LYFE #YOLO";
				makeTweet(tweet);
				NormalTweetModel normal = new NormalTweetModel();
				Boolean isNormal = normal.equals(adapter.getItem(adapter.getCount()-1));
				assertTrue(isNormal);
				
				
			}
		});
	}
	/*
	 * fills in the input text field and clicks the 'save'
	 * button for the activity under test
	 */
	private void makeTweet(String text) {
		assertNotNull(activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.save));
		textInput.setText(text);
		((Button) activity.findViewById(ca.ualberta.cs.lonelytwitter.R.id.save)).performClick();
	}
}

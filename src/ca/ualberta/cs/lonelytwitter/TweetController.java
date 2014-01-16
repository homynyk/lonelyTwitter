package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;


public class TweetController implements TweetControllerInterface
{
	private TweetListModel tweetListModel;
	
	public void addTweet(String text)
	{
		ArrayList<AbstractTweetModel> list = tweetListModel.getTweetList();
		list.add(new NormalTweetModel(text));
	}

	public TweetController()
	{
		super();
		tweetListModel = new TweetListModel();
	}

}

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;


public class TweetListModel
{
	private static ArrayList<LonelyTweetModel> tweetList;

	public ArrayList<LonelyTweetModel> getTweetList()
	{
		return tweetList;
	}

	
	public void setTweetList(ArrayList<LonelyTweetModel> tweetList)
	{
	
		this.tweetList = tweetList;
	}


	public TweetListModel()
	{
		super();
		tweetList = new ArrayList<LonelyTweetModel>();
	}
	
}

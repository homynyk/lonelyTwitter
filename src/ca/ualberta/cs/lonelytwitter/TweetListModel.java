package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;


public class TweetListModel
{
	private static ArrayList<AbstractTweetModel> tweetList;

	public ArrayList<AbstractTweetModel> getTweetList()
	{
		return tweetList;
	}

	
	public void setTweetList(ArrayList<AbstractTweetModel> tweetList)
	{
	
		this.tweetList = tweetList;
	}


	public TweetListModel()
	{
		super();
		tweetList = new ArrayList<AbstractTweetModel>();
	}
	
}

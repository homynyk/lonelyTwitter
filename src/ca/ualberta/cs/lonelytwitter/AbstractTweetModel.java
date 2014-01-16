package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class AbstractTweetModel
{
	private String text;
	protected Date timestamp;
	
	public AbstractTweetModel(String text, Date timestamp)
	{
		
		super();
		this.text = text;
		this.timestamp = timestamp;
		
	}

	public AbstractTweetModel(String text)
	{
	
		super();
		this.text = text;
		timestamp = new Date();
		
	}
	
	public String getText()
	{
	
		return text;
	}
	
	public void setText(String text) throws Exception
	{
		if (text.length() > 140) {
			throw new IllegalArgumentException();
		}
		this.text = text;
	}
	
	public abstract Date getTimestamp();
	
	public abstract String getStatus();
	
	public abstract boolean isImportant();
	
	public void setTimestamp(Date timestamp)
	{
	
		this.timestamp = timestamp;
	}


	
}

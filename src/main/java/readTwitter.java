package main.java;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

//import twitter4j.AccountSettings;

public class readTwitter {
	
	   //Complete code here to read from Twitter API  for Keyword Taekwondo
    //and print
	static int n = 20;
	static String keyword = "startup";
	static String access = "taekwondo";
	public static void main(String args[]) throws TwitterException{
    ConfigurationBuilder cb = new ConfigurationBuilder();
    cb.setDebugEnabled(true)
          .setOAuthConsumerKey("OlkcSblmsWdFiUlxmsbzXA")
          .setOAuthConsumerSecret("KTN9oHHY0nxVND8mbwEB4OGU44q0jDVdjqCbBbCy9vM")
          .setOAuthAccessToken("1621819165-4smTxoDwwgvVozYepwHFFVmoLLoW0m2BcSgGfG6")
          .setOAuthAccessTokenSecret("oBlDSqT1oc8TujVTgzm9StoF9kfMPmsAqmVKY7Rm0DY");
    TwitterFactory tf = new TwitterFactory(cb.build());
    Twitter twitter = tf.getInstance();
    Query query = new Query(keyword);
    query.setLang("en");
    query.setCount(n);
    QueryResult result = twitter.search(query);
    for (Status status : result.getTweets()) {
        System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText()
        		+ " [" +status.getGeoLocation() +"]");
    }
	System.out.println("\n\n************\n\n");
	query = new Query(access);
	result = twitter.search(query);
    for (Status status : result.getTweets()) {
        System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText()
        		+ " [" +status.getGeoLocation() +"]");
    }
	}
    //Look at the structure of the json document  returned from Twitter
    //And see if any other attributes are interested


}

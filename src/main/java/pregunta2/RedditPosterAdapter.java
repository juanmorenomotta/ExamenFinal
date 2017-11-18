package pregunta2;

public class RedditPosterAdapter implements Sharing {
	RedditPoster reddit = null;
	
	RedditPosterAdapter(RedditPoster reddit){
		this.reddit = reddit;
	}
	
	@Override
	public void share(String message) {
		this.reddit.post(message);
	}

}

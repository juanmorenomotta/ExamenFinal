package pregunta2;

public class RedditPosterAdapterObject extends RedditPoster implements Sharing {

	@Override
	public void share(String message) {
		post(message);
	}
}

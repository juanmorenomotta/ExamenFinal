package pregunta4;

public class SelfDestructingEZMessenger implements Message {
	 private Messaging message;

    public SelfDestructingEZMessenger(Messaging message) {
        this.message = message;
    }	

    public void sendMessage(String message) {
        message = "☠" + message + "☠";
        this.message.send(message);
    }
}

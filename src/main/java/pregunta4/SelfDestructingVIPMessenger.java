package pregunta4;

public class SelfDestructingVIPMessenger implements Message {
	 private Messaging message;

    public SelfDestructingVIPMessenger(Messaging message) {
        this.message = message;
    }	

    public void sendMessage(String message) {
        message = "☠" + message + "☠";
        this.message.send(message);
    }
}

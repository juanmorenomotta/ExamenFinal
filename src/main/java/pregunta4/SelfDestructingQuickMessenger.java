package pregunta4;

public class SelfDestructingQuickMessenger implements Message {
	 private Messaging message;

    public SelfDestructingQuickMessenger(Messaging message) {
        this.message = message;
    }	

    public void sendMessage(String message) {
        message = "☠" + message + "☠";
        this.message.send(message);
    }
}

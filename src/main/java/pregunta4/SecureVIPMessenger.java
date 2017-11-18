package pregunta4;

public class SecureVIPMessenger implements Message {
	 private Messaging message;

    public SecureVIPMessenger(Messaging message) {
        this.message = message;
    }
	 
    private String encrypt(String message) {
        message = message.substring(message.length() - 1) + message.substring(0, message.length() - 1);
        return message;
    }
    
    public void sendMessage(String message) {
        message = encrypt(message);
        this.message.send(message);
    }
}

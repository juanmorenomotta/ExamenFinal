package pregunta4;

public class Client {

    public static void main(String[] args) {
        String message = "Hello";
       
        
        QuickMessenger quickMessenger = new QuickMessenger();
        Message SecureQuickMessenger = new SecureQuickMessenger(quickMessenger);
        SecureQuickMessenger.sendMessage(message);
        
        Message selfDestructingQuickMessenger = new SelfDestructingQuickMessenger(quickMessenger);
        selfDestructingQuickMessenger.sendMessage(message);
        
        VIPMessenger vipMessenger = new VIPMessenger();
        Message secureVIPMessenger = new SecureVIPMessenger(vipMessenger);
        secureVIPMessenger.sendMessage(message);
        
        Message selfDestructingVIPMessenger = new SelfDestructingVIPMessenger(vipMessenger);
        selfDestructingVIPMessenger.sendMessage(message);
        
        EZMessenger ezMessenger = new EZMessenger();
        Message secureEZMessenger = new SecureEZMessenger(ezMessenger);
        secureEZMessenger.sendMessage(message);
        
        Message selfDestructingEZMessenger = new SelfDestructingEZMessenger(ezMessenger);
        selfDestructingEZMessenger.sendMessage(message);
    }
}

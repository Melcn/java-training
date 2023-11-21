package WOtraining;

import java.util.ArrayList;

public class MessagingService {

    private ArrayList<String> messages = new ArrayList<>();


    public MessagingService() {
        this.messages = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() < 280) {
            messages.add(message.toString());
        }
    }

    public ArrayList<String> getMessage() {
        return messages;
    }
}

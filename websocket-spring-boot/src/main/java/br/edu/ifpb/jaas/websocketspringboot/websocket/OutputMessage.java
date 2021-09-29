package br.edu.ifpb.jaas.websocketspringboot.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OutputMessage {
    private String sender;
    private String text;
    private String time;

    public OutputMessage(String sender, String text, String time) {
        this.sender = sender;
        this.text = text;
        this.time = time;
    }

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public OutputMessage send(Message message) throws Exception {
        String time = new SimpleDateFormat("HH:mm").format(new Date());
        return new OutputMessage(message.getFrom(), message.getText(), time);
    }
}

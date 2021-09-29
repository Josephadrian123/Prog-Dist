package br.edu.ifpb.jaas.websocketspringboot.websocket;

/*
    O endpoint aceitará mensagens contendo o nome do remetente e um texto numa mensagem STOMP
    cujo corpo é um objeto JSON.
    Por padrão, o Spring usará a biblioteca Jackson para converter o Model Object de/para JSON.

    A mensagem se parecerá com isso:

                        {
                        "from": "John",
                        "text": "Hello!"
                        }
*/
public class Message {
    private String from;
    private String text;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

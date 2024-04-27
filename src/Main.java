public class Main {
    public static void main(String[] args) {


        /*
        I dette scenario er applikationen direkte koblet til en specifik tjeneste,
        EmailService. Dette gør det svært at ændre sendingstjenesten uden at
        ændre selve MessageSender-klassen.
         */
        MessageSender sender = new MessageSender();
        sender.sendMessage("Hello World!", "magnus@zealand.dk");
    }
}
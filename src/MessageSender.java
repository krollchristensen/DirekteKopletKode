public class MessageSender {
    private EmailService emailService;

    public MessageSender() {

        this.emailService = new EmailService();
    }

    public void sendMessage(String message, String recipient) {
        emailService.sendEmail(message, recipient);
    }
}
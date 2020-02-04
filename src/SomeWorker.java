public class SomeWorker implements MailService {

    @Override
    public Sendable processMail(Sendable mail) {
        System.out.println("SomeWorker processMail");
        return mail;
    }
}

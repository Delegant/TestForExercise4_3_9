// Задача 4.3 для курса Java

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyClass {
    public static final String AUSTIN_POWERS = "Austin Powers";
    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";


    public static void main(String[] args) {
        MailService[] arrSomeWorkers = {new SomeWorker(), new SomeWorker(), new SomeWorker()};

        UntrustworthyMailWorker messenger = new UntrustworthyMailWorker(arrSomeWorkers);
        for (int i = 0; i < 10; i++) {
            messenger.processMail(SomeSendable.generateSendable());
        }
    }

    // implement UntrustworthyMailWorker, Spy, Inspector, Thief, StolenPackageException, IllegalPackageException as public static classes here

}



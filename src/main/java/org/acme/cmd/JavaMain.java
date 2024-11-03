package org.acme.cmd;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class JavaMain {
    public static void main(String... args) {
        if (args.length == 0) {
            // Run REST API Server
            Quarkus.run(args);
            return;
        }
        switch (args[0]) {
            case "server":
                // Run REST API Server
                Quarkus.run(args);
                break;
            case "custom":
                // Run REST API Server with custom
                Quarkus.run(CustomMain.class, args);
                break;
            case "hello":
                // Run a command then exit.
                Quarkus.run(GreetingMain.class, args);
                break;
            case "bye":
                // Run another command then exit.
                Quarkus.run(GoodbyeMain.class, args);
                break;
            default:
                // Just show message.
                System.out.println("BOOM!");
                break;
        }
    }
}

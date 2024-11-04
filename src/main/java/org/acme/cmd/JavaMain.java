package org.acme.cmd;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

// This annotation is needed to run this class as a Quarkus application.
// https://quarkus.io/guides/command-mode-reference#quarkusmain
// But I believe that we should use Picocli's @Command annotation instead.
// @ref: LaunchCommand.java
//@QuarkusMain
public class JavaMain {
    public static void mainNN(String... args) {
        System.out.println("I'm JavaMain");
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

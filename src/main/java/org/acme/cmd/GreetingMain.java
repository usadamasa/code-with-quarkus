package org.acme.cmd;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import picocli.CommandLine;

/**
 * Run as a simple CLI.
 */
@CommandLine.Command(name = "hello", description = "Greet World!")
public class GreetingMain implements QuarkusApplication, Runnable {
    @Override
    public int run(String... args) throws Exception {
        System.out.println("Hello World");
        return 0;
    }

    @Override
    public void run() {
        System.out.println("Hello World at run()");
    }
}

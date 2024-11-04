package org.acme.cmd;

import io.quarkus.runtime.QuarkusApplication;
import picocli.CommandLine;

/**
 * Run as a simple CLI.
 */
@CommandLine.Command(name = "bye", description = "Sayonara World!")
public class GoodbyeMain implements QuarkusApplication, Runnable {
    @Override
    public int run(String... args) throws Exception {
        System.out.println("Goodbye");
        return 0;
    }

    @Override
    public void run() {
        System.out.println("Goodbye at run()");
    }
}

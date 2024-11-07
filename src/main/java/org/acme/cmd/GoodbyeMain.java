package org.acme.cmd;

import io.quarkus.runtime.QuarkusApplication;
import picocli.CommandLine;

import java.util.concurrent.Callable;

/**
 * Run as a simple CLI.
 */
@CommandLine.Command(name = "bye", description = "Sayonara World!")
public class GoodbyeMain implements QuarkusApplication, Callable<Integer> {
    @Override
    public int run(String... args) throws Exception {
        System.out.println("Goodbye");
        return 0;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("Goodbye at run()");
        return 0;
    }
}

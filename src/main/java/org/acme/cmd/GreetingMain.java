package org.acme.cmd;

import io.quarkus.runtime.QuarkusApplication;
import picocli.CommandLine;

import java.util.concurrent.Callable;

/**
 * Run as a simple CLI.
 */
@CommandLine.Command(name = "hello", description = "Greet World!")
public class GreetingMain implements QuarkusApplication, Callable<Integer> {

    private String name;

    @CommandLine.Option(names = {"-n", "--name"}, defaultValue = "${COUNT:-123}")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int run(String... args) throws Exception {
        System.out.println("Hello World");
        return 0;
    }

    @Override
    public Integer call() throws Exception {
        System.out.printf("Hello World %s !!!%n", name);
        return 0;
    }
}

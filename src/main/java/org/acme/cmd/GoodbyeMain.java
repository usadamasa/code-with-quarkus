package org.acme.cmd;

import io.quarkus.runtime.QuarkusApplication;

/**
 * Run as a simple CLI.
 */
public class GoodbyeMain implements QuarkusApplication {
    @Override
    public int run(String... args) throws Exception {
        System.out.println("Goodbye");
        return 0;
    }
}

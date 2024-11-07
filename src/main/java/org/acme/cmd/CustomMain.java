package org.acme.cmd;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import picocli.CommandLine;

import java.util.concurrent.Callable;

@CommandLine.Command(name = "server", description = "run server")
public class CustomMain implements QuarkusApplication, Callable<Integer> {

    /**
     * Run via QuarkusMain.
     */
    @Override
    public int run(String... args) throws Exception {
        System.out.println("Hello Quarkus Server!");
        // if you want to run some logic on startup and then run it like
        // a normal application (i.e., not exit),
        // then you should call Quarkus.waitForExit from the main thread.
        // https://ja.quarkus.io/guides/lifecycle
        Quarkus.waitForExit();
        return 0;
    }

    /**
     * Run via PicoCLI.
     */
    @Override
    public Integer call() throws Exception {
        System.out.println("Hello Quarkus Server via PicoCLI!");
        Quarkus.waitForExit();
        return 0;
    }
}

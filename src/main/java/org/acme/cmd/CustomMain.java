package org.acme.cmd;

import com.sun.tools.javac.Main;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

public class CustomMain implements QuarkusApplication {
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
}

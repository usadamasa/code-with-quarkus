package org.acme.command;

import io.quarkus.picocli.runtime.annotations.TopCommand;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.cmd.CustomMain;
import org.acme.cmd.GoodbyeMain;
import org.acme.cmd.GreetingMain;
import picocli.CommandLine;

// https://ja.quarkus.io/guides/picocli#command-line-application-with-multiple-commands
@TopCommand
@ApplicationScoped
@CommandLine.Command(
        mixinStandardHelpOptions = true,
        subcommands = {
                GreetingMain.class,
                GoodbyeMain.class,
                CustomMain.class
        }
)
public class LaunchCommand {}

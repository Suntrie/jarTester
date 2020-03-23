package com.company;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
public class Main {

    public static void main(String[] args) {
        CommandLineArgument values = new CommandLineArgument(args);
        System.out.println(values.name);
        System.out.println(values.age);
    }
}
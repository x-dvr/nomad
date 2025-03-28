/*
 * Copyright (c) HashiCorp, Inc.
 * SPDX-License-Identifier: BUSL-1.1
 */

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, the current working directory is: " + System.getProperty("user.dir"));
        int seconds = 5;
        if (args.length != 0) {
            seconds = Integer.parseInt(args[0]);
        }
        try {
            Thread.sleep(1000*seconds); //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}

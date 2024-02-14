package com.android.p023dx.command;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/* renamed from: com.android.dx.command.DxConsole */
public class DxConsole {
    public static PrintStream err = System.err;
    public static final PrintStream noop = new PrintStream(new OutputStream() {
        public void write(int i) throws IOException {
        }
    });
    public static PrintStream out = System.out;
}

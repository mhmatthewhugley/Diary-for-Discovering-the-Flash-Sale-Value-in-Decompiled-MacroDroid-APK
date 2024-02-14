package com.android.p023dx.p026io.instructions;

import java.io.EOFException;

/* renamed from: com.android.dx.io.instructions.CodeInput */
public interface CodeInput extends CodeCursor {
    boolean hasMore();

    int read() throws EOFException;

    int readInt() throws EOFException;

    long readLong() throws EOFException;
}

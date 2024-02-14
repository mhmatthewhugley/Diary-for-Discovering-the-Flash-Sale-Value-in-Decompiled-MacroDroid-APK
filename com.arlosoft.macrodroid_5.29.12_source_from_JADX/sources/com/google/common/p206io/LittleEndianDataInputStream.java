package com.google.common.p206io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
@Beta
/* renamed from: com.google.common.io.LittleEndianDataInputStream */
public final class LittleEndianDataInputStream extends FilterInputStream implements DataInput {
    /* renamed from: b */
    private byte m73455b() throws IOException, EOFException {
        int read = this.in.read();
        if (-1 != read) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @CanIgnoreReturnValue
    public boolean readBoolean() throws IOException {
        return readUnsignedByte() != 0;
    }

    @CanIgnoreReturnValue
    public byte readByte() throws IOException {
        return (byte) readUnsignedByte();
    }

    @CanIgnoreReturnValue
    public char readChar() throws IOException {
        return (char) readUnsignedShort();
    }

    @CanIgnoreReturnValue
    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readLong());
    }

    @CanIgnoreReturnValue
    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readInt());
    }

    public void readFully(byte[] bArr) throws IOException {
        ByteStreams.m73413f(this, bArr);
    }

    @CanIgnoreReturnValue
    public int readInt() throws IOException {
        byte b = m73455b();
        byte b2 = m73455b();
        return Ints.m73617f(m73455b(), m73455b(), b2, b);
    }

    @CanIgnoreReturnValue
    @DoNotCall
    public String readLine() {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    @CanIgnoreReturnValue
    public long readLong() throws IOException {
        byte b = m73455b();
        byte b2 = m73455b();
        byte b3 = m73455b();
        byte b4 = m73455b();
        byte b5 = m73455b();
        byte b6 = m73455b();
        return Longs.m73634d(m73455b(), m73455b(), b6, b5, b4, b3, b2, b);
    }

    @CanIgnoreReturnValue
    public short readShort() throws IOException {
        return (short) readUnsignedShort();
    }

    @CanIgnoreReturnValue
    public String readUTF() throws IOException {
        return new DataInputStream(this.in).readUTF();
    }

    @CanIgnoreReturnValue
    public int readUnsignedByte() throws IOException {
        int read = this.in.read();
        if (read >= 0) {
            return read;
        }
        throw new EOFException();
    }

    @CanIgnoreReturnValue
    public int readUnsignedShort() throws IOException {
        return Ints.m73617f((byte) 0, (byte) 0, m73455b(), m73455b());
    }

    public int skipBytes(int i) throws IOException {
        return (int) this.in.skip((long) i);
    }

    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        ByteStreams.m73414g(this, bArr, i, i2);
    }
}

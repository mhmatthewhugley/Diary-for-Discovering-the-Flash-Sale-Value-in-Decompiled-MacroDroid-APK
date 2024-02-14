package org.apache.http.impl.conn;

import java.io.IOException;
import org.apache.http.annotation.Immutable;
import org.apache.http.p355io.HttpTransportMetrics;
import org.apache.http.p355io.SessionInputBuffer;
import org.apache.http.util.CharArrayBuffer;

@Immutable
public class LoggingSessionInputBuffer implements SessionInputBuffer {

    /* renamed from: in */
    private final SessionInputBuffer f66003in;
    private final Wire wire;

    public LoggingSessionInputBuffer(SessionInputBuffer sessionInputBuffer, Wire wire2) {
        this.f66003in = sessionInputBuffer;
        this.wire = wire2;
    }

    public HttpTransportMetrics getMetrics() {
        return this.f66003in.getMetrics();
    }

    public boolean isDataAvailable(int i) throws IOException {
        return this.f66003in.isDataAvailable(i);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.f66003in.read(bArr, i, i2);
        if (this.wire.enabled() && read > 0) {
            this.wire.input(bArr, i, read);
        }
        return read;
    }

    public String readLine() throws IOException {
        String readLine = this.f66003in.readLine();
        if (this.wire.enabled() && readLine != null) {
            Wire wire2 = this.wire;
            wire2.input(readLine + "[EOL]");
        }
        return readLine;
    }

    public int read() throws IOException {
        int read = this.f66003in.read();
        if (this.wire.enabled() && read != -1) {
            this.wire.input(read);
        }
        return read;
    }

    public int readLine(CharArrayBuffer charArrayBuffer) throws IOException {
        int readLine = this.f66003in.readLine(charArrayBuffer);
        if (this.wire.enabled() && readLine >= 0) {
            String str = new String(charArrayBuffer.buffer(), charArrayBuffer.length() - readLine, readLine);
            Wire wire2 = this.wire;
            wire2.input(str + "[EOL]");
        }
        return readLine;
    }

    public int read(byte[] bArr) throws IOException {
        int read = this.f66003in.read(bArr);
        if (this.wire.enabled() && read > 0) {
            this.wire.input(bArr, 0, read);
        }
        return read;
    }
}

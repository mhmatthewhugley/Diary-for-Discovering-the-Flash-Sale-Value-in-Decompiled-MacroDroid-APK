package org.apache.http.impl.p354io;

import java.io.IOException;
import java.net.Socket;
import org.apache.http.params.HttpParams;

/* renamed from: org.apache.http.impl.io.SocketOutputBuffer */
public class SocketOutputBuffer extends AbstractSessionOutputBuffer {
    public SocketOutputBuffer(Socket socket, int i, HttpParams httpParams) throws IOException {
        if (socket != null) {
            i = i < 0 ? socket.getSendBufferSize() : i;
            init(socket.getOutputStream(), i < 1024 ? 1024 : i, httpParams);
            return;
        }
        throw new IllegalArgumentException("Socket may not be null");
    }
}

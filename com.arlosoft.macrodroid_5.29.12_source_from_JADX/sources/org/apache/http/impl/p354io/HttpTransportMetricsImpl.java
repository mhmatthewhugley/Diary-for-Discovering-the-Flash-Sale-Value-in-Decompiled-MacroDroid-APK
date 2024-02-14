package org.apache.http.impl.p354io;

import org.apache.http.p355io.HttpTransportMetrics;

/* renamed from: org.apache.http.impl.io.HttpTransportMetricsImpl */
public class HttpTransportMetricsImpl implements HttpTransportMetrics {
    private long bytesTransferred = 0;

    public long getBytesTransferred() {
        return this.bytesTransferred;
    }

    public void incrementBytesTransferred(long j) {
        this.bytesTransferred += j;
    }

    public void reset() {
        this.bytesTransferred = 0;
    }

    public void setBytesTransferred(long j) {
        this.bytesTransferred = j;
    }
}

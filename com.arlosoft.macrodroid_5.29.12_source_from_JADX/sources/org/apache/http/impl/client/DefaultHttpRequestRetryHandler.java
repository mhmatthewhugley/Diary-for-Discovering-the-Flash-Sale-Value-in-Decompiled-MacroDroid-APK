package org.apache.http.impl.client;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.NoHttpResponseException;
import org.apache.http.annotation.Immutable;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.protocol.ExecutionContext;
import org.apache.http.protocol.HttpContext;

@Immutable
public class DefaultHttpRequestRetryHandler implements HttpRequestRetryHandler {
    private final boolean requestSentRetryEnabled;
    private final int retryCount;

    public DefaultHttpRequestRetryHandler(int i, boolean z) {
        this.retryCount = i;
        this.requestSentRetryEnabled = z;
    }

    public int getRetryCount() {
        return this.retryCount;
    }

    public boolean isRequestSentRetryEnabled() {
        return this.requestSentRetryEnabled;
    }

    public boolean retryRequest(IOException iOException, int i, HttpContext httpContext) {
        if (iOException == null) {
            throw new IllegalArgumentException("Exception parameter may not be null");
        } else if (httpContext == null) {
            throw new IllegalArgumentException("HTTP context may not be null");
        } else if (i > this.retryCount) {
            return false;
        } else {
            if (iOException instanceof NoHttpResponseException) {
                return true;
            }
            if ((iOException instanceof InterruptedIOException) || (iOException instanceof UnknownHostException) || (iOException instanceof ConnectException) || (iOException instanceof SSLHandshakeException)) {
                return false;
            }
            if (!(((HttpRequest) httpContext.getAttribute(ExecutionContext.HTTP_REQUEST)) instanceof HttpEntityEnclosingRequest)) {
                return true;
            }
            Boolean bool = (Boolean) httpContext.getAttribute(ExecutionContext.HTTP_REQ_SENT);
            if (!(bool != null && bool.booleanValue()) || this.requestSentRetryEnabled) {
                return true;
            }
            return false;
        }
    }

    public DefaultHttpRequestRetryHandler() {
        this(3, false);
    }
}

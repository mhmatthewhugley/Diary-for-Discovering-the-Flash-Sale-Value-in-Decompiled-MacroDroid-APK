package org.apache.http.impl.client;

import java.net.URI;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpRequestBase;

@NotThreadSafe
class HttpRedirect extends HttpRequestBase {
    private String method;

    public HttpRedirect(String str, URI uri) {
        if (str.equalsIgnoreCase(HttpHead.METHOD_NAME)) {
            this.method = HttpHead.METHOD_NAME;
        } else {
            this.method = "GET";
        }
        setURI(uri);
    }

    public String getMethod() {
        return this.method;
    }
}

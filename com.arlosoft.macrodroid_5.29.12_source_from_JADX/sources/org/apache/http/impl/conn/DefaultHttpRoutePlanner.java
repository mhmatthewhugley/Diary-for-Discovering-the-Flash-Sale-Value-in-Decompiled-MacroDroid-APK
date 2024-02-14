package org.apache.http.impl.conn;

import java.net.InetAddress;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.annotation.ThreadSafe;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.protocol.HttpContext;

@ThreadSafe
public class DefaultHttpRoutePlanner implements HttpRoutePlanner {
    protected final SchemeRegistry schemeRegistry;

    public DefaultHttpRoutePlanner(SchemeRegistry schemeRegistry2) {
        if (schemeRegistry2 != null) {
            this.schemeRegistry = schemeRegistry2;
            return;
        }
        throw new IllegalArgumentException("SchemeRegistry must not be null.");
    }

    public HttpRoute determineRoute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws HttpException {
        if (httpRequest != null) {
            HttpRoute forcedRoute = ConnRouteParams.getForcedRoute(httpRequest.getParams());
            if (forcedRoute != null) {
                return forcedRoute;
            }
            if (httpHost != null) {
                InetAddress localAddress = ConnRouteParams.getLocalAddress(httpRequest.getParams());
                HttpHost defaultProxy = ConnRouteParams.getDefaultProxy(httpRequest.getParams());
                boolean isLayered = this.schemeRegistry.getScheme(httpHost.getSchemeName()).isLayered();
                if (defaultProxy == null) {
                    return new HttpRoute(httpHost, localAddress, isLayered);
                }
                return new HttpRoute(httpHost, localAddress, defaultProxy, isLayered);
            }
            throw new IllegalStateException("Target host must not be null.");
        }
        throw new IllegalStateException("Request must not be null.");
    }
}

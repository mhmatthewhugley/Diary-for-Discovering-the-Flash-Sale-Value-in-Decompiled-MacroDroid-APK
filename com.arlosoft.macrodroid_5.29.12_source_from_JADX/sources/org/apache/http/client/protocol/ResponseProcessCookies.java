package org.apache.http.client.protocol;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.annotation.Immutable;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.C16050SM;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.protocol.HttpContext;

@Immutable
public class ResponseProcessCookies implements HttpResponseInterceptor {
    private final Log log = LogFactory.getLog((Class) getClass());

    private void processCookies(HeaderIterator headerIterator, CookieSpec cookieSpec, CookieOrigin cookieOrigin, CookieStore cookieStore) {
        while (headerIterator.hasNext()) {
            Header nextHeader = headerIterator.nextHeader();
            try {
                for (Cookie next : cookieSpec.parse(nextHeader, cookieOrigin)) {
                    try {
                        cookieSpec.validate(next, cookieOrigin);
                        cookieStore.addCookie(next);
                        if (this.log.isDebugEnabled()) {
                            Log log2 = this.log;
                            log2.debug("Cookie accepted: \"" + next + "\". ");
                        }
                    } catch (MalformedCookieException e) {
                        if (this.log.isWarnEnabled()) {
                            Log log3 = this.log;
                            log3.warn("Cookie rejected: \"" + next + "\". " + e.getMessage());
                        }
                    }
                }
            } catch (MalformedCookieException e2) {
                if (this.log.isWarnEnabled()) {
                    Log log4 = this.log;
                    log4.warn("Invalid cookie header: \"" + nextHeader + "\". " + e2.getMessage());
                }
            }
        }
    }

    public void process(HttpResponse httpResponse, HttpContext httpContext) throws HttpException, IOException {
        if (httpResponse == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (httpContext != null) {
            CookieSpec cookieSpec = (CookieSpec) httpContext.getAttribute(ClientContext.COOKIE_SPEC);
            if (cookieSpec != null) {
                CookieStore cookieStore = (CookieStore) httpContext.getAttribute(ClientContext.COOKIE_STORE);
                if (cookieStore == null) {
                    this.log.info("CookieStore not available in HTTP context");
                    return;
                }
                CookieOrigin cookieOrigin = (CookieOrigin) httpContext.getAttribute(ClientContext.COOKIE_ORIGIN);
                if (cookieOrigin == null) {
                    this.log.info("CookieOrigin not available in HTTP context");
                    return;
                }
                processCookies(httpResponse.headerIterator(C16050SM.SET_COOKIE), cookieSpec, cookieOrigin, cookieStore);
                if (cookieSpec.getVersion() > 0) {
                    processCookies(httpResponse.headerIterator(C16050SM.SET_COOKIE2), cookieSpec, cookieOrigin, cookieStore);
                }
            }
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }
}

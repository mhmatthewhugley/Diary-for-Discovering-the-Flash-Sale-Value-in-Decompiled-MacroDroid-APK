package org.apache.http.impl.cookie;

import org.apache.http.annotation.Immutable;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;

@Immutable
public class BasicPathHandler implements CookieAttributeHandler {
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (cookieOrigin != null) {
            String path = cookieOrigin.getPath();
            String path2 = cookie.getPath();
            if (path2 == null) {
                path2 = "/";
            }
            boolean z = false;
            if (path2.length() > 1 && path2.endsWith("/")) {
                path2 = path2.substring(0, path2.length() - 1);
            }
            boolean startsWith = path.startsWith(path2);
            if (!startsWith || path.length() == path2.length() || path2.endsWith("/")) {
                return startsWith;
            }
            if (path.charAt(path2.length()) == '/') {
                z = true;
            }
            return z;
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }

    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        if (setCookie != null) {
            if (str == null || str.trim().length() == 0) {
                str = "/";
            }
            setCookie.setPath(str);
            return;
        }
        throw new IllegalArgumentException("Cookie may not be null");
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) throws MalformedCookieException {
        if (!match(cookie, cookieOrigin)) {
            throw new MalformedCookieException("Illegal path attribute \"" + cookie.getPath() + "\". Path of origin: \"" + cookieOrigin.getPath() + "\"");
        }
    }
}

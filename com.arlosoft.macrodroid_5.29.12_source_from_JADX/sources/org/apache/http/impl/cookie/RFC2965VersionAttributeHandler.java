package org.apache.http.impl.cookie;

import org.apache.http.annotation.Immutable;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.cookie.SetCookie2;

@Immutable
public class RFC2965VersionAttributeHandler implements CookieAttributeHandler {
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        return true;
    }

    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        int i;
        if (setCookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (str != null) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                i = -1;
            }
            if (i >= 0) {
                setCookie.setVersion(i);
                return;
            }
            throw new MalformedCookieException("Invalid cookie version.");
        } else {
            throw new MalformedCookieException("Missing value for version attribute");
        }
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) throws MalformedCookieException {
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if ((cookie instanceof SetCookie2) && (cookie instanceof ClientCookie) && !((ClientCookie) cookie).containsAttribute(ClientCookie.VERSION_ATTR)) {
            throw new MalformedCookieException("Violates RFC 2965. Version attribute is required.");
        }
    }
}

package org.apache.http.impl.cookie;

import java.util.Locale;
import org.apache.http.annotation.Immutable;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;

@Immutable
public class RFC2109DomainHandler implements CookieAttributeHandler {
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (cookieOrigin != null) {
            String host = cookieOrigin.getHost();
            String domain = cookie.getDomain();
            if (domain == null) {
                return false;
            }
            if (host.equals(domain) || (domain.startsWith(".") && host.endsWith(domain))) {
                return true;
            }
            return false;
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }

    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        if (setCookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (str == null) {
            throw new MalformedCookieException("Missing value for domain attribute");
        } else if (str.trim().length() != 0) {
            setCookie.setDomain(str);
        } else {
            throw new MalformedCookieException("Blank value for domain attribute");
        }
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) throws MalformedCookieException {
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (cookieOrigin != null) {
            String host = cookieOrigin.getHost();
            String domain = cookie.getDomain();
            if (domain == null) {
                throw new MalformedCookieException("Cookie domain may not be null");
            } else if (domain.equals(host)) {
            } else {
                if (domain.indexOf(46) == -1) {
                    throw new MalformedCookieException("Domain attribute \"" + domain + "\" does not match the host \"" + host + "\"");
                } else if (domain.startsWith(".")) {
                    int indexOf = domain.indexOf(46, 1);
                    if (indexOf < 0 || indexOf == domain.length() - 1) {
                        throw new MalformedCookieException("Domain attribute \"" + domain + "\" violates RFC 2109: domain must contain an embedded dot");
                    }
                    String lowerCase = host.toLowerCase(Locale.ENGLISH);
                    if (!lowerCase.endsWith(domain)) {
                        throw new MalformedCookieException("Illegal domain attribute \"" + domain + "\". Domain of origin: \"" + lowerCase + "\"");
                    } else if (lowerCase.substring(0, lowerCase.length() - domain.length()).indexOf(46) != -1) {
                        throw new MalformedCookieException("Domain attribute \"" + domain + "\" violates RFC 2109: host minus domain may not contain any dots");
                    }
                } else {
                    throw new MalformedCookieException("Domain attribute \"" + domain + "\" violates RFC 2109: domain must start with a dot");
                }
            }
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }
}

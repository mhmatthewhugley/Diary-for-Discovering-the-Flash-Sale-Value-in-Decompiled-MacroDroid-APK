package org.apache.http.impl.cookie;

import java.util.List;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.client.params.CookiePolicy;
import org.apache.http.cookie.C16050SM;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie2;

@NotThreadSafe
public class BestMatchSpec implements CookieSpec {
    private BrowserCompatSpec compat;
    private final String[] datepatterns;
    private NetscapeDraftSpec netscape;
    private RFC2109Spec obsoleteStrict;
    private final boolean oneHeader;
    private RFC2965Spec strict;

    public BestMatchSpec(String[] strArr, boolean z) {
        String[] strArr2;
        if (strArr == null) {
            strArr2 = null;
        } else {
            strArr2 = (String[]) strArr.clone();
        }
        this.datepatterns = strArr2;
        this.oneHeader = z;
    }

    private BrowserCompatSpec getCompat() {
        if (this.compat == null) {
            this.compat = new BrowserCompatSpec(this.datepatterns);
        }
        return this.compat;
    }

    private NetscapeDraftSpec getNetscape() {
        if (this.netscape == null) {
            this.netscape = new NetscapeDraftSpec(this.datepatterns);
        }
        return this.netscape;
    }

    private RFC2109Spec getObsoleteStrict() {
        if (this.obsoleteStrict == null) {
            this.obsoleteStrict = new RFC2109Spec(this.datepatterns, this.oneHeader);
        }
        return this.obsoleteStrict;
    }

    private RFC2965Spec getStrict() {
        if (this.strict == null) {
            this.strict = new RFC2965Spec(this.datepatterns, this.oneHeader);
        }
        return this.strict;
    }

    public List<Header> formatCookies(List<Cookie> list) {
        if (list != null) {
            int i = Integer.MAX_VALUE;
            boolean z = true;
            for (Cookie next : list) {
                if (!(next instanceof SetCookie2)) {
                    z = false;
                }
                if (next.getVersion() < i) {
                    i = next.getVersion();
                }
            }
            if (i <= 0) {
                return getCompat().formatCookies(list);
            }
            if (z) {
                return getStrict().formatCookies(list);
            }
            return getObsoleteStrict().formatCookies(list);
        }
        throw new IllegalArgumentException("List of cookie may not be null");
    }

    public int getVersion() {
        return getStrict().getVersion();
    }

    public Header getVersionHeader() {
        return getStrict().getVersionHeader();
    }

    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (cookieOrigin == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        } else if (cookie.getVersion() <= 0) {
            return getCompat().match(cookie, cookieOrigin);
        } else {
            if (cookie instanceof SetCookie2) {
                return getStrict().match(cookie, cookieOrigin);
            }
            return getObsoleteStrict().match(cookie, cookieOrigin);
        }
    }

    public List<Cookie> parse(Header header, CookieOrigin cookieOrigin) throws MalformedCookieException {
        if (header == null) {
            throw new IllegalArgumentException("Header may not be null");
        } else if (cookieOrigin != null) {
            HeaderElement[] elements = header.getElements();
            boolean z = false;
            boolean z2 = false;
            for (HeaderElement headerElement : elements) {
                if (headerElement.getParameterByName(ClientCookie.VERSION_ATTR) != null) {
                    z = true;
                }
                if (headerElement.getParameterByName(ClientCookie.EXPIRES_ATTR) != null) {
                    z2 = true;
                }
            }
            if (z) {
                if (C16050SM.SET_COOKIE2.equals(header.getName())) {
                    return getStrict().parse(elements, cookieOrigin);
                }
                return getObsoleteStrict().parse(elements, cookieOrigin);
            } else if (z2) {
                return getNetscape().parse(header, cookieOrigin);
            } else {
                return getCompat().parse(elements, cookieOrigin);
            }
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }

    public String toString() {
        return CookiePolicy.BEST_MATCH;
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) throws MalformedCookieException {
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (cookieOrigin == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        } else if (cookie.getVersion() <= 0) {
            getCompat().validate(cookie, cookieOrigin);
        } else if (cookie instanceof SetCookie2) {
            getStrict().validate(cookie, cookieOrigin);
        } else {
            getObsoleteStrict().validate(cookie, cookieOrigin);
        }
    }

    public BestMatchSpec() {
        this((String[]) null, false);
    }
}

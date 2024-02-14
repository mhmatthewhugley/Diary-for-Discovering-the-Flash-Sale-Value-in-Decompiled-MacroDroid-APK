package org.apache.http.impl.cookie;

import org.apache.http.annotation.Immutable;
import org.apache.http.cookie.CookieSpecFactory;

@Immutable
public class BrowserCompatSpecFactory implements CookieSpecFactory {
    /* JADX WARNING: type inference failed for: r3v5, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.apache.http.cookie.CookieSpec newInstance(org.apache.http.params.HttpParams r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0020
            r0 = 0
            java.lang.String r1 = "http.protocol.cookie-datepatterns"
            java.lang.Object r3 = r3.getParameter(r1)
            java.util.Collection r3 = (java.util.Collection) r3
            if (r3 == 0) goto L_0x001a
            int r0 = r3.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r3 = r3.toArray(r0)
            r0 = r3
            java.lang.String[] r0 = (java.lang.String[]) r0
        L_0x001a:
            org.apache.http.impl.cookie.BrowserCompatSpec r3 = new org.apache.http.impl.cookie.BrowserCompatSpec
            r3.<init>(r0)
            return r3
        L_0x0020:
            org.apache.http.impl.cookie.BrowserCompatSpec r3 = new org.apache.http.impl.cookie.BrowserCompatSpec
            r3.<init>()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.cookie.BrowserCompatSpecFactory.newInstance(org.apache.http.params.HttpParams):org.apache.http.cookie.CookieSpec");
    }
}

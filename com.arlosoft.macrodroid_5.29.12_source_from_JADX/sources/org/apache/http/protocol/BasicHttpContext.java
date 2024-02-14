package org.apache.http.protocol;

import java.util.HashMap;
import java.util.Map;

public class BasicHttpContext implements HttpContext {
    private Map map;
    private final HttpContext parentContext;

    public BasicHttpContext() {
        this((HttpContext) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        r1 = r2.parentContext;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getAttribute(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0016
            r0 = 0
            java.util.Map r1 = r2.map
            if (r1 == 0) goto L_0x000b
            java.lang.Object r0 = r1.get(r3)
        L_0x000b:
            if (r0 != 0) goto L_0x0015
            org.apache.http.protocol.HttpContext r1 = r2.parentContext
            if (r1 == 0) goto L_0x0015
            java.lang.Object r0 = r1.getAttribute(r3)
        L_0x0015:
            return r0
        L_0x0016:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Id may not be null"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.protocol.BasicHttpContext.getAttribute(java.lang.String):java.lang.Object");
    }

    public Object removeAttribute(String str) {
        if (str != null) {
            Map map2 = this.map;
            if (map2 != null) {
                return map2.remove(str);
            }
            return null;
        }
        throw new IllegalArgumentException("Id may not be null");
    }

    public void setAttribute(String str, Object obj) {
        if (str != null) {
            if (this.map == null) {
                this.map = new HashMap();
            }
            this.map.put(str, obj);
            return;
        }
        throw new IllegalArgumentException("Id may not be null");
    }

    public BasicHttpContext(HttpContext httpContext) {
        this.map = null;
        this.parentContext = httpContext;
    }
}

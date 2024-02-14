package org.apache.http.impl.client;

import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.params.AbstractHttpParams;
import org.apache.http.params.HttpParams;

@NotThreadSafe
public class ClientParamsStack extends AbstractHttpParams {
    protected final HttpParams applicationParams;
    protected final HttpParams clientParams;
    protected final HttpParams overrideParams;
    protected final HttpParams requestParams;

    public ClientParamsStack(HttpParams httpParams, HttpParams httpParams2, HttpParams httpParams3, HttpParams httpParams4) {
        this.applicationParams = httpParams;
        this.clientParams = httpParams2;
        this.requestParams = httpParams3;
        this.overrideParams = httpParams4;
    }

    public HttpParams copy() {
        return this;
    }

    public final HttpParams getApplicationParams() {
        return this.applicationParams;
    }

    public final HttpParams getClientParams() {
        return this.clientParams;
    }

    public final HttpParams getOverrideParams() {
        return this.overrideParams;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        r1 = r2.applicationParams;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getParameter(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x002a
            r0 = 0
            org.apache.http.params.HttpParams r1 = r2.overrideParams
            if (r1 == 0) goto L_0x000b
            java.lang.Object r0 = r1.getParameter(r3)
        L_0x000b:
            if (r0 != 0) goto L_0x0015
            org.apache.http.params.HttpParams r1 = r2.requestParams
            if (r1 == 0) goto L_0x0015
            java.lang.Object r0 = r1.getParameter(r3)
        L_0x0015:
            if (r0 != 0) goto L_0x001f
            org.apache.http.params.HttpParams r1 = r2.clientParams
            if (r1 == 0) goto L_0x001f
            java.lang.Object r0 = r1.getParameter(r3)
        L_0x001f:
            if (r0 != 0) goto L_0x0029
            org.apache.http.params.HttpParams r1 = r2.applicationParams
            if (r1 == 0) goto L_0x0029
            java.lang.Object r0 = r1.getParameter(r3)
        L_0x0029:
            return r0
        L_0x002a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Parameter name must not be null."
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.client.ClientParamsStack.getParameter(java.lang.String):java.lang.Object");
    }

    public final HttpParams getRequestParams() {
        return this.requestParams;
    }

    public boolean removeParameter(String str) {
        throw new UnsupportedOperationException("Removing parameters in a stack is not supported.");
    }

    public HttpParams setParameter(String str, Object obj) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Setting parameters in a stack is not supported.");
    }

    public ClientParamsStack(ClientParamsStack clientParamsStack) {
        this(clientParamsStack.getApplicationParams(), clientParamsStack.getClientParams(), clientParamsStack.getRequestParams(), clientParamsStack.getOverrideParams());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ClientParamsStack(ClientParamsStack clientParamsStack, HttpParams httpParams, HttpParams httpParams2, HttpParams httpParams3, HttpParams httpParams4) {
        this(httpParams == null ? clientParamsStack.getApplicationParams() : httpParams, httpParams2 == null ? clientParamsStack.getClientParams() : httpParams2, httpParams3 == null ? clientParamsStack.getRequestParams() : httpParams3, httpParams4 == null ? clientParamsStack.getOverrideParams() : httpParams4);
    }
}

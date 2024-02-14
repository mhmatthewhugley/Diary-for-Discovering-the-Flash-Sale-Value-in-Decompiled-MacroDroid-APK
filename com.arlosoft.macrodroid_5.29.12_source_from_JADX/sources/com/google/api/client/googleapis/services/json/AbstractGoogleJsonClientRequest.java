package com.google.api.client.googleapis.services.json;

import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.http.HttpResponse;

public abstract class AbstractGoogleJsonClientRequest<T> extends AbstractGoogleClientRequest<T> {

    /* renamed from: E */
    private final Object f52378E;

    /* JADX WARNING: type inference failed for: r0v2, types: [com.google.api.client.http.json.JsonHttpContent] */
    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.api.client.http.HttpContent] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected AbstractGoogleJsonClientRequest(com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient r8, java.lang.String r9, java.lang.String r10, java.lang.Object r11, java.lang.Class<T> r12) {
        /*
            r7 = this;
            r0 = 0
            if (r11 != 0) goto L_0x0005
        L_0x0003:
            r5 = r0
            goto L_0x0024
        L_0x0005:
            com.google.api.client.http.json.JsonHttpContent r1 = new com.google.api.client.http.json.JsonHttpContent
            com.google.api.client.json.JsonFactory r2 = r8.mo60323j()
            r1.<init>(r2, r11)
            com.google.api.client.json.JsonObjectParser r2 = r8.mo60306d()
            java.util.Set r2 = r2.mo60527c()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            java.lang.String r0 = "data"
        L_0x001f:
            com.google.api.client.http.json.JsonHttpContent r0 = r1.mo60513g(r0)
            goto L_0x0003
        L_0x0024:
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f52378E = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest.<init>(com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient, java.lang.String, java.lang.String, java.lang.Object, java.lang.Class):void");
    }

    /* renamed from: q */
    public AbstractGoogleJsonClient mo60318n() {
        return (AbstractGoogleJsonClient) super.mo60318n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public GoogleJsonResponseException mo60319o(HttpResponse httpResponse) {
        return GoogleJsonResponseException.m71865c(mo60318n().mo60323j(), httpResponse);
    }

    /* renamed from: s */
    public AbstractGoogleJsonClientRequest<T> mo60320p(String str, Object obj) {
        return (AbstractGoogleJsonClientRequest) super.mo60078d(str, obj);
    }
}

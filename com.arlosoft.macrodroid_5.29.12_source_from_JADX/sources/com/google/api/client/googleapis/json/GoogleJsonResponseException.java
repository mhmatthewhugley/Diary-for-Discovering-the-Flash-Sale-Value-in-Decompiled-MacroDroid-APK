package com.google.api.client.googleapis.json;

import com.google.api.client.http.HttpResponseException;

public class GoogleJsonResponseException extends HttpResponseException {
    private static final long serialVersionUID = 409811126989994864L;

    /* renamed from: c */
    private final transient GoogleJsonError f52295c;

    public GoogleJsonResponseException(HttpResponseException.Builder builder, GoogleJsonError googleJsonError) {
        super(builder);
        this.f52295c = googleJsonError;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x006b A[SYNTHETIC, Splitter:B:27:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0083 A[SYNTHETIC, Splitter:B:41:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008b A[Catch:{ IOException -> 0x0087 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0096 A[Catch:{ IOException -> 0x0087 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x009c A[Catch:{ IOException -> 0x0087 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00b4  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.api.client.googleapis.json.GoogleJsonResponseException m71865c(com.google.api.client.json.JsonFactory r5, com.google.api.client.http.HttpResponse r6) {
        /*
            com.google.api.client.http.HttpResponseException$Builder r0 = new com.google.api.client.http.HttpResponseException$Builder
            int r1 = r6.mo60454g()
            java.lang.String r2 = r6.mo60455h()
            com.google.api.client.http.HttpHeaders r3 = r6.mo60452e()
            r0.<init>(r1, r2, r3)
            com.google.api.client.util.Preconditions.m72716d(r5)
            r1 = 0
            boolean r2 = r6.mo60457k()     // Catch:{ IOException -> 0x00a5 }
            if (r2 != 0) goto L_0x00a0
            java.lang.String r2 = "application/json; charset=UTF-8"
            java.lang.String r3 = r6.mo60451d()     // Catch:{ IOException -> 0x00a5 }
            boolean r2 = com.google.api.client.http.HttpMediaType.m72055c(r2, r3)     // Catch:{ IOException -> 0x00a5 }
            if (r2 == 0) goto L_0x00a0
            java.io.InputStream r2 = r6.mo60449b()     // Catch:{ IOException -> 0x00a5 }
            if (r2 == 0) goto L_0x00a0
            java.io.InputStream r2 = r6.mo60449b()     // Catch:{ IOException -> 0x007b, all -> 0x0077 }
            com.google.api.client.json.JsonParser r5 = r5.mo60172b(r2)     // Catch:{ IOException -> 0x007b, all -> 0x0077 }
            com.google.api.client.json.JsonToken r2 = r5.mo60203f()     // Catch:{ IOException -> 0x0074, all -> 0x0071 }
            if (r2 != 0) goto L_0x003f
            com.google.api.client.json.JsonToken r2 = r5.mo60212o()     // Catch:{ IOException -> 0x0074, all -> 0x0071 }
        L_0x003f:
            if (r2 == 0) goto L_0x0068
            java.lang.String r2 = "error"
            r5.mo60532D(r2)     // Catch:{ IOException -> 0x0074, all -> 0x0071 }
            com.google.api.client.json.JsonToken r2 = r5.mo60203f()     // Catch:{ IOException -> 0x0074, all -> 0x0071 }
            com.google.api.client.json.JsonToken r3 = com.google.api.client.json.JsonToken.END_OBJECT     // Catch:{ IOException -> 0x0074, all -> 0x0071 }
            if (r2 == r3) goto L_0x0068
            java.lang.Class<com.google.api.client.googleapis.json.GoogleJsonError> r2 = com.google.api.client.googleapis.json.GoogleJsonError.class
            java.lang.Object r2 = r5.mo60536t(r2)     // Catch:{ IOException -> 0x0074, all -> 0x0071 }
            com.google.api.client.googleapis.json.GoogleJsonError r2 = (com.google.api.client.googleapis.json.GoogleJsonError) r2     // Catch:{ IOException -> 0x0074, all -> 0x0071 }
            java.lang.String r1 = r2.mo60519h()     // Catch:{ IOException -> 0x0063, all -> 0x005e }
            r4 = r2
            r2 = r1
            r1 = r4
            goto L_0x0069
        L_0x005e:
            r3 = move-exception
            r4 = r3
            r3 = r2
            r2 = r4
            goto L_0x0094
        L_0x0063:
            r3 = move-exception
            r4 = r3
            r3 = r2
            r2 = r4
            goto L_0x007e
        L_0x0068:
            r2 = r1
        L_0x0069:
            if (r1 != 0) goto L_0x00aa
            r5.mo60199a()     // Catch:{ IOException -> 0x006f }
            goto L_0x00aa
        L_0x006f:
            r5 = move-exception
            goto L_0x00a7
        L_0x0071:
            r2 = move-exception
            r3 = r1
            goto L_0x0094
        L_0x0074:
            r2 = move-exception
            r3 = r1
            goto L_0x007e
        L_0x0077:
            r2 = move-exception
            r5 = r1
            r3 = r5
            goto L_0x0094
        L_0x007b:
            r2 = move-exception
            r5 = r1
            r3 = r5
        L_0x007e:
            r2.printStackTrace()     // Catch:{ all -> 0x0093 }
            if (r5 != 0) goto L_0x008b
            r6.mo60456j()     // Catch:{ IOException -> 0x0087 }
            goto L_0x0090
        L_0x0087:
            r5 = move-exception
            r2 = r1
            r1 = r3
            goto L_0x00a7
        L_0x008b:
            if (r3 != 0) goto L_0x0090
            r5.mo60199a()     // Catch:{ IOException -> 0x0087 }
        L_0x0090:
            r2 = r1
            r1 = r3
            goto L_0x00aa
        L_0x0093:
            r2 = move-exception
        L_0x0094:
            if (r5 == 0) goto L_0x009c
            if (r3 != 0) goto L_0x009f
            r5.mo60199a()     // Catch:{ IOException -> 0x0087 }
            goto L_0x009f
        L_0x009c:
            r6.mo60456j()     // Catch:{ IOException -> 0x0087 }
        L_0x009f:
            throw r2     // Catch:{ IOException -> 0x0087 }
        L_0x00a0:
            java.lang.String r2 = r6.mo60459m()     // Catch:{ IOException -> 0x00a5 }
            goto L_0x00aa
        L_0x00a5:
            r5 = move-exception
            r2 = r1
        L_0x00a7:
            r5.printStackTrace()
        L_0x00aa:
            java.lang.StringBuilder r5 = com.google.api.client.http.HttpResponseException.m72116a(r6)
            boolean r6 = com.google.api.client.util.Strings.m72728a(r2)
            if (r6 != 0) goto L_0x00bf
            java.lang.String r6 = com.google.api.client.util.StringUtils.f52835a
            r5.append(r6)
            r5.append(r2)
            r0.mo60461a(r2)
        L_0x00bf:
            java.lang.String r5 = r5.toString()
            r0.mo60463c(r5)
            com.google.api.client.googleapis.json.GoogleJsonResponseException r5 = new com.google.api.client.googleapis.json.GoogleJsonResponseException
            r5.<init>(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.googleapis.json.GoogleJsonResponseException.m71865c(com.google.api.client.json.JsonFactory, com.google.api.client.http.HttpResponse):com.google.api.client.googleapis.json.GoogleJsonResponseException");
    }
}

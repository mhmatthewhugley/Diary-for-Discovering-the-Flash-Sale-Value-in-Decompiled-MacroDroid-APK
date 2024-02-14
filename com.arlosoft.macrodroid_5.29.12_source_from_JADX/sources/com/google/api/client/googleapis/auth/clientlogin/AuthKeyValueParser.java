package com.google.api.client.googleapis.auth.clientlogin;

import com.google.api.client.util.Beta;
import com.google.api.client.util.ObjectParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

@Beta
final class AuthKeyValueParser implements ObjectParser {

    /* renamed from: a */
    public static final AuthKeyValueParser f52234a = new AuthKeyValueParser();

    private AuthKeyValueParser() {
    }

    /* renamed from: a */
    public <T> T mo60213a(InputStream inputStream, Charset charset, Class<T> cls) throws IOException {
        return mo60214b(new InputStreamReader(inputStream, charset), cls);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (r5 == java.lang.Boolean.class) goto L_0x003a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T mo60214b(java.io.Reader r8, java.lang.Class<T> r9) throws java.io.IOException {
        /*
            r7 = this;
            com.google.api.client.util.ClassInfo r0 = com.google.api.client.util.ClassInfo.m72640f(r9)     // Catch:{ all -> 0x0060 }
            java.lang.Object r1 = com.google.api.client.util.Types.m72742m(r9)     // Catch:{ all -> 0x0060 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0060 }
            r2.<init>(r8)     // Catch:{ all -> 0x0060 }
        L_0x000d:
            java.lang.String r3 = r2.readLine()     // Catch:{ all -> 0x0060 }
            if (r3 != 0) goto L_0x0017
            r8.close()
            return r1
        L_0x0017:
            r4 = 61
            int r4 = r3.indexOf(r4)     // Catch:{ all -> 0x0060 }
            r5 = 0
            java.lang.String r5 = r3.substring(r5, r4)     // Catch:{ all -> 0x0060 }
            int r4 = r4 + 1
            java.lang.String r3 = r3.substring(r4)     // Catch:{ all -> 0x0060 }
            java.lang.reflect.Field r4 = r0.mo60708a(r5)     // Catch:{ all -> 0x0060 }
            if (r4 == 0) goto L_0x0042
            java.lang.Class r5 = r4.getType()     // Catch:{ all -> 0x0060 }
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0060 }
            if (r5 == r6) goto L_0x003a
            java.lang.Class<java.lang.Boolean> r6 = java.lang.Boolean.class
            if (r5 != r6) goto L_0x003e
        L_0x003a:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0060 }
        L_0x003e:
            com.google.api.client.util.FieldInfo.m72677l(r4, r1, r3)     // Catch:{ all -> 0x0060 }
            goto L_0x000d
        L_0x0042:
            java.lang.Class<com.google.api.client.util.GenericData> r4 = com.google.api.client.util.GenericData.class
            boolean r4 = r4.isAssignableFrom(r9)     // Catch:{ all -> 0x0060 }
            if (r4 == 0) goto L_0x0051
            r4 = r1
            com.google.api.client.util.GenericData r4 = (com.google.api.client.util.GenericData) r4     // Catch:{ all -> 0x0060 }
            r4.mo60078d(r5, r3)     // Catch:{ all -> 0x0060 }
            goto L_0x000d
        L_0x0051:
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            boolean r4 = r4.isAssignableFrom(r9)     // Catch:{ all -> 0x0060 }
            if (r4 == 0) goto L_0x000d
            r4 = r1
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ all -> 0x0060 }
            r4.put(r5, r3)     // Catch:{ all -> 0x0060 }
            goto L_0x000d
        L_0x0060:
            r9 = move-exception
            r8.close()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.googleapis.auth.clientlogin.AuthKeyValueParser.mo60214b(java.io.Reader, java.lang.Class):java.lang.Object");
    }
}

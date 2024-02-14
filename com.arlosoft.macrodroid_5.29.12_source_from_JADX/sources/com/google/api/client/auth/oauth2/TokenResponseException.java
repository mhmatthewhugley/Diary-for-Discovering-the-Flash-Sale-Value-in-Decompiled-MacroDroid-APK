package com.google.api.client.auth.oauth2;

import com.google.api.client.http.HttpResponseException;

public class TokenResponseException extends HttpResponseException {
    private static final long serialVersionUID = 4020689092957439244L;

    /* renamed from: c */
    private final transient TokenErrorResponse f52210c;

    TokenResponseException(HttpResponseException.Builder builder, TokenErrorResponse tokenErrorResponse) {
        super(builder);
        this.f52210c = tokenErrorResponse;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.google.api.client.auth.oauth2.TokenErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: com.google.api.client.auth.oauth2.TokenErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: com.google.api.client.auth.oauth2.TokenErrorResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r6v9, types: [com.google.api.client.auth.oauth2.TokenErrorResponse, com.google.api.client.json.GenericJson] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.api.client.auth.oauth2.TokenResponseException m71614c(com.google.api.client.json.JsonFactory r6, com.google.api.client.http.HttpResponse r7) {
        /*
            com.google.api.client.http.HttpResponseException$Builder r0 = new com.google.api.client.http.HttpResponseException$Builder
            int r1 = r7.mo60454g()
            java.lang.String r2 = r7.mo60455h()
            com.google.api.client.http.HttpHeaders r3 = r7.mo60452e()
            r0.<init>(r1, r2, r3)
            com.google.api.client.util.Preconditions.m72716d(r6)
            java.lang.String r1 = r7.mo60451d()
            r2 = 0
            boolean r3 = r7.mo60457k()     // Catch:{ IOException -> 0x0055 }
            if (r3 != 0) goto L_0x004d
            if (r1 == 0) goto L_0x004d
            java.io.InputStream r3 = r7.mo60449b()     // Catch:{ IOException -> 0x0055 }
            if (r3 == 0) goto L_0x004d
            java.lang.String r3 = "application/json; charset=UTF-8"
            boolean r1 = com.google.api.client.http.HttpMediaType.m72055c(r3, r1)     // Catch:{ IOException -> 0x0055 }
            if (r1 == 0) goto L_0x004d
            com.google.api.client.json.JsonObjectParser r1 = new com.google.api.client.json.JsonObjectParser     // Catch:{ IOException -> 0x0055 }
            r1.<init>((com.google.api.client.json.JsonFactory) r6)     // Catch:{ IOException -> 0x0055 }
            java.io.InputStream r6 = r7.mo60449b()     // Catch:{ IOException -> 0x0055 }
            java.nio.charset.Charset r3 = r7.mo60450c()     // Catch:{ IOException -> 0x0055 }
            java.lang.Class<com.google.api.client.auth.oauth2.TokenErrorResponse> r4 = com.google.api.client.auth.oauth2.TokenErrorResponse.class
            java.lang.Object r6 = r1.mo60213a(r6, r3, r4)     // Catch:{ IOException -> 0x0055 }
            com.google.api.client.auth.oauth2.TokenErrorResponse r6 = (com.google.api.client.auth.oauth2.TokenErrorResponse) r6     // Catch:{ IOException -> 0x0055 }
            java.lang.String r1 = r6.mo60519h()     // Catch:{ IOException -> 0x004b }
            r2 = r6
            r6 = r1
            goto L_0x0051
        L_0x004b:
            r1 = move-exception
            goto L_0x0057
        L_0x004d:
            java.lang.String r6 = r7.mo60459m()     // Catch:{ IOException -> 0x0055 }
        L_0x0051:
            r5 = r2
            r2 = r6
            r6 = r5
            goto L_0x005a
        L_0x0055:
            r1 = move-exception
            r6 = r2
        L_0x0057:
            r1.printStackTrace()
        L_0x005a:
            java.lang.StringBuilder r7 = com.google.api.client.http.HttpResponseException.m72116a(r7)
            boolean r1 = com.google.api.client.util.Strings.m72728a(r2)
            if (r1 != 0) goto L_0x006f
            java.lang.String r1 = com.google.api.client.util.StringUtils.f52835a
            r7.append(r1)
            r7.append(r2)
            r0.mo60461a(r2)
        L_0x006f:
            java.lang.String r7 = r7.toString()
            r0.mo60463c(r7)
            com.google.api.client.auth.oauth2.TokenResponseException r7 = new com.google.api.client.auth.oauth2.TokenResponseException
            r7.<init>(r0, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.auth.oauth2.TokenResponseException.m71614c(com.google.api.client.json.JsonFactory, com.google.api.client.http.HttpResponse):com.google.api.client.auth.oauth2.TokenResponseException");
    }

    /* renamed from: d */
    public final TokenErrorResponse mo60151d() {
        return this.f52210c;
    }
}

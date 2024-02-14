package com.google.api.client.http;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.api.client.util.Beta;
import com.google.api.client.util.ObjectParser;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Sleeper;
import java.util.concurrent.Callable;

public final class HttpRequest {

    /* renamed from: a */
    private HttpExecuteInterceptor f52436a;

    /* renamed from: b */
    private HttpHeaders f52437b = new HttpHeaders();

    /* renamed from: c */
    private HttpHeaders f52438c = new HttpHeaders();

    /* renamed from: d */
    private int f52439d = 10;

    /* renamed from: e */
    private int f52440e = 16384;

    /* renamed from: f */
    private boolean f52441f = true;

    /* renamed from: g */
    private boolean f52442g = true;

    /* renamed from: h */
    private HttpContent f52443h;

    /* renamed from: i */
    private final HttpTransport f52444i;

    /* renamed from: j */
    private String f52445j;

    /* renamed from: k */
    private GenericUrl f52446k;

    /* renamed from: l */
    private int f52447l = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;

    /* renamed from: m */
    private int f52448m = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;

    /* renamed from: n */
    private HttpUnsuccessfulResponseHandler f52449n;
    @Beta

    /* renamed from: o */
    private HttpIOExceptionHandler f52450o;

    /* renamed from: p */
    private HttpResponseInterceptor f52451p;

    /* renamed from: q */
    private ObjectParser f52452q;

    /* renamed from: r */
    private HttpEncoding f52453r;
    @Beta
    @Deprecated

    /* renamed from: s */
    private BackOffPolicy f52454s;

    /* renamed from: t */
    private boolean f52455t = true;

    /* renamed from: u */
    private boolean f52456u = true;
    @Beta
    @Deprecated

    /* renamed from: v */
    private boolean f52457v = false;

    /* renamed from: w */
    private boolean f52458w;

    /* renamed from: x */
    private Sleeper f52459x = Sleeper.f52834a;

    /* renamed from: com.google.api.client.http.HttpRequest$1 */
    class C108341 implements Callable<HttpResponse> {

        /* renamed from: a */
        final /* synthetic */ HttpRequest f52460a;

        /* renamed from: a */
        public HttpResponse call() throws Exception {
            return this.f52460a.mo60416a();
        }
    }

    HttpRequest(HttpTransport httpTransport, String str) {
        this.f52444i = httpTransport;
        mo60438w(str);
    }

    /* renamed from: A */
    public HttpRequest mo60415A(GenericUrl genericUrl) {
        this.f52446k = (GenericUrl) Preconditions.m72716d(genericUrl);
        return this;
    }

    /* JADX WARNING: type inference failed for: r4v19, types: [com.google.api.client.http.HttpEncodingStreamingContent, com.google.api.client.util.StreamingContent] */
    /* JADX WARNING: type inference failed for: r3v19, types: [com.google.api.client.util.LoggingStreamingContent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0251 A[SYNTHETIC, Splitter:B:116:0x0251] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02a3  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x02cc A[LOOP:0: B:8:0x0022->B:167:0x02cc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x02ab A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01e7  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.api.client.http.HttpResponse mo60416a() throws java.io.IOException {
        /*
            r20 = this;
            r1 = r20
            int r0 = r1.f52439d
            r3 = 1
            if (r0 < 0) goto L_0x0009
            r0 = 1
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            com.google.api.client.util.Preconditions.m72713a(r0)
            int r0 = r1.f52439d
            com.google.api.client.http.BackOffPolicy r4 = r1.f52454s
            if (r4 == 0) goto L_0x0016
            r4.reset()
        L_0x0016:
            java.lang.String r4 = r1.f52445j
            com.google.api.client.util.Preconditions.m72716d(r4)
            com.google.api.client.http.GenericUrl r4 = r1.f52446k
            com.google.api.client.util.Preconditions.m72716d(r4)
            r5 = r0
            r0 = 0
        L_0x0022:
            if (r0 == 0) goto L_0x0027
            r0.mo60456j()
        L_0x0027:
            com.google.api.client.http.HttpExecuteInterceptor r0 = r1.f52436a
            if (r0 == 0) goto L_0x002e
            r0.mo60066b(r1)
        L_0x002e:
            com.google.api.client.http.GenericUrl r0 = r1.f52446k
            java.lang.String r0 = r0.mo60360h()
            com.google.api.client.http.HttpTransport r6 = r1.f52444i
            java.lang.String r7 = r1.f52445j
            com.google.api.client.http.LowLevelHttpRequest r6 = r6.mo60266b(r7, r0)
            java.util.logging.Logger r7 = com.google.api.client.http.HttpTransport.f52480a
            boolean r8 = r1.f52441f
            if (r8 == 0) goto L_0x004c
            java.util.logging.Level r8 = java.util.logging.Level.CONFIG
            boolean r8 = r7.isLoggable(r8)
            if (r8 == 0) goto L_0x004c
            r8 = 1
            goto L_0x004d
        L_0x004c:
            r8 = 0
        L_0x004d:
            if (r8 == 0) goto L_0x008e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "-------------- REQUEST  --------------"
            r9.append(r10)
            java.lang.String r10 = com.google.api.client.util.StringUtils.f52835a
            r9.append(r10)
            java.lang.String r11 = r1.f52445j
            r9.append(r11)
            r11 = 32
            r9.append(r11)
            r9.append(r0)
            r9.append(r10)
            boolean r10 = r1.f52442g
            if (r10 == 0) goto L_0x008f
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "curl -v --compressed"
            r10.<init>(r11)
            java.lang.String r11 = r1.f52445j
            java.lang.String r12 = "GET"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0090
            java.lang.String r11 = " -X "
            r10.append(r11)
            java.lang.String r11 = r1.f52445j
            r10.append(r11)
            goto L_0x0090
        L_0x008e:
            r9 = 0
        L_0x008f:
            r10 = 0
        L_0x0090:
            com.google.api.client.http.HttpHeaders r11 = r1.f52437b
            java.lang.String r11 = r11.mo60397s()
            boolean r12 = r1.f52458w
            if (r12 != 0) goto L_0x00c8
            java.lang.String r12 = "Google-HTTP-Java-Client/1.23.0 (gzip)"
            if (r11 != 0) goto L_0x00a4
            com.google.api.client.http.HttpHeaders r13 = r1.f52437b
            r13.mo60388R(r12)
            goto L_0x00c8
        L_0x00a4:
            com.google.api.client.http.HttpHeaders r13 = r1.f52437b
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            int r15 = r11.length()
            int r15 = r15 + r3
            int r16 = r12.length()
            int r15 = r15 + r16
            r14.<init>(r15)
            r14.append(r11)
            java.lang.String r15 = " "
            r14.append(r15)
            r14.append(r12)
            java.lang.String r12 = r14.toString()
            r13.mo60388R(r12)
        L_0x00c8:
            com.google.api.client.http.HttpHeaders r12 = r1.f52437b
            com.google.api.client.http.HttpHeaders.m72021v(r12, r9, r10, r7, r6)
            boolean r12 = r1.f52458w
            if (r12 != 0) goto L_0x00d6
            com.google.api.client.http.HttpHeaders r12 = r1.f52437b
            r12.mo60388R(r11)
        L_0x00d6:
            com.google.api.client.http.HttpContent r11 = r1.f52443h
            if (r11 == 0) goto L_0x00e3
            boolean r12 = r11.mo60338a()
            if (r12 == 0) goto L_0x00e1
            goto L_0x00e3
        L_0x00e1:
            r12 = 0
            goto L_0x00e4
        L_0x00e3:
            r12 = 1
        L_0x00e4:
            java.lang.String r15 = "'"
            if (r11 == 0) goto L_0x01e1
            com.google.api.client.http.HttpContent r2 = r1.f52443h
            java.lang.String r2 = r2.getType()
            if (r8 == 0) goto L_0x00fa
            com.google.api.client.util.LoggingStreamingContent r3 = new com.google.api.client.util.LoggingStreamingContent
            java.util.logging.Level r4 = java.util.logging.Level.CONFIG
            int r13 = r1.f52440e
            r3.<init>(r11, r7, r4, r13)
            r11 = r3
        L_0x00fa:
            com.google.api.client.http.HttpEncoding r3 = r1.f52453r
            if (r3 != 0) goto L_0x0107
            com.google.api.client.http.HttpContent r3 = r1.f52443h
            long r3 = r3.mo60339b()
            r13 = r3
            r3 = 0
            goto L_0x011c
        L_0x0107:
            java.lang.String r3 = r3.getName()
            com.google.api.client.http.HttpEncodingStreamingContent r4 = new com.google.api.client.http.HttpEncodingStreamingContent
            com.google.api.client.http.HttpEncoding r13 = r1.f52453r
            r4.<init>(r11, r13)
            if (r12 == 0) goto L_0x0119
            long r13 = com.google.api.client.util.IOUtils.m72692a(r4)
            goto L_0x011b
        L_0x0119:
            r13 = -1
        L_0x011b:
            r11 = r4
        L_0x011c:
            if (r8 == 0) goto L_0x01c9
            java.lang.String r4 = " -H '"
            if (r2 == 0) goto L_0x0165
            java.lang.String r1 = "Content-Type: "
            int r17 = r2.length()
            if (r17 == 0) goto L_0x0131
            java.lang.String r1 = r1.concat(r2)
            r17 = r5
            goto L_0x0139
        L_0x0131:
            r17 = r5
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1)
            r1 = r5
        L_0x0139:
            r9.append(r1)
            java.lang.String r5 = com.google.api.client.util.StringUtils.f52835a
            r9.append(r5)
            if (r10 == 0) goto L_0x0167
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r18 = r1.length()
            r19 = r12
            int r12 = r18 + 6
            r5.<init>(r12)
            r5.append(r4)
            r5.append(r1)
            r5.append(r15)
            java.lang.String r1 = r5.toString()
            r10.append(r1)
            goto L_0x0169
        L_0x0165:
            r17 = r5
        L_0x0167:
            r19 = r12
        L_0x0169:
            if (r3 == 0) goto L_0x01a7
            java.lang.String r1 = "Content-Encoding: "
            int r5 = r3.length()
            if (r5 == 0) goto L_0x0178
            java.lang.String r1 = r1.concat(r3)
            goto L_0x017e
        L_0x0178:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1)
            r1 = r5
        L_0x017e:
            r9.append(r1)
            java.lang.String r5 = com.google.api.client.util.StringUtils.f52835a
            r9.append(r5)
            if (r10 == 0) goto L_0x01a7
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r12 = r1.length()
            int r12 = r12 + 6
            r5.<init>(r12)
            r5.append(r4)
            r5.append(r1)
            r5.append(r15)
            java.lang.String r1 = r5.toString()
            r10.append(r1)
        L_0x01a7:
            r4 = 0
            int r1 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r1 < 0) goto L_0x01cd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r4 = 36
            r1.<init>(r4)
            java.lang.String r4 = "Content-Length: "
            r1.append(r4)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            r9.append(r1)
            java.lang.String r1 = com.google.api.client.util.StringUtils.f52835a
            r9.append(r1)
            goto L_0x01cd
        L_0x01c9:
            r17 = r5
            r19 = r12
        L_0x01cd:
            if (r10 == 0) goto L_0x01d4
            java.lang.String r1 = " -d '@-'"
            r10.append(r1)
        L_0x01d4:
            r6.mo60480i(r2)
            r6.mo60478g(r3)
            r6.mo60479h(r13)
            r6.mo60481j(r11)
            goto L_0x01e5
        L_0x01e1:
            r17 = r5
            r19 = r12
        L_0x01e5:
            if (r8 == 0) goto L_0x020f
            java.lang.String r1 = r9.toString()
            r7.config(r1)
            if (r10 == 0) goto L_0x020f
            java.lang.String r1 = " -- '"
            r10.append(r1)
            java.lang.String r1 = "'\"'\"'"
            java.lang.String r0 = r0.replaceAll(r15, r1)
            r10.append(r0)
            r10.append(r15)
            if (r11 == 0) goto L_0x0208
            java.lang.String r0 = " << $$$"
            r10.append(r0)
        L_0x0208:
            java.lang.String r0 = r10.toString()
            r7.config(r0)
        L_0x020f:
            if (r19 == 0) goto L_0x0215
            if (r17 <= 0) goto L_0x0215
            r2 = 1
            goto L_0x0216
        L_0x0215:
            r2 = 0
        L_0x0216:
            r1 = r20
            int r0 = r1.f52447l
            int r3 = r1.f52448m
            r6.mo60482k(r0, r3)
            com.google.api.client.http.LowLevelHttpResponse r3 = r6.mo60256b()     // Catch:{ IOException -> 0x0236 }
            com.google.api.client.http.HttpResponse r0 = new com.google.api.client.http.HttpResponse     // Catch:{ all -> 0x022b }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x022b }
            r3 = r0
            r0 = 0
            goto L_0x024f
        L_0x022b:
            r0 = move-exception
            java.io.InputStream r3 = r3.mo60257b()     // Catch:{ IOException -> 0x0236 }
            if (r3 == 0) goto L_0x0235
            r3.close()     // Catch:{ IOException -> 0x0236 }
        L_0x0235:
            throw r0     // Catch:{ IOException -> 0x0236 }
        L_0x0236:
            r0 = move-exception
            boolean r3 = r1.f52457v
            if (r3 != 0) goto L_0x0247
            com.google.api.client.http.HttpIOExceptionHandler r3 = r1.f52450o
            if (r3 == 0) goto L_0x0246
            boolean r3 = r3.mo60292b(r1, r2)
            if (r3 == 0) goto L_0x0246
            goto L_0x0247
        L_0x0246:
            throw r0
        L_0x0247:
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r4 = "exception thrown while executing request"
            r7.log(r3, r4, r0)
            r3 = 0
        L_0x024f:
            if (r3 == 0) goto L_0x02a1
            boolean r4 = r3.mo60457k()     // Catch:{ all -> 0x029c }
            if (r4 != 0) goto L_0x02a1
            com.google.api.client.http.HttpUnsuccessfulResponseHandler r4 = r1.f52449n     // Catch:{ all -> 0x029c }
            if (r4 == 0) goto L_0x0260
            boolean r4 = r4.mo60096a(r1, r3, r2)     // Catch:{ all -> 0x029c }
            goto L_0x0261
        L_0x0260:
            r4 = 0
        L_0x0261:
            if (r4 != 0) goto L_0x0295
            int r5 = r3.mo60454g()     // Catch:{ all -> 0x029c }
            com.google.api.client.http.HttpHeaders r6 = r3.mo60452e()     // Catch:{ all -> 0x029c }
            boolean r5 = r1.mo60431p(r5, r6)     // Catch:{ all -> 0x029c }
            if (r5 == 0) goto L_0x0273
        L_0x0271:
            r4 = 1
            goto L_0x0295
        L_0x0273:
            if (r2 == 0) goto L_0x0295
            com.google.api.client.http.BackOffPolicy r5 = r1.f52454s     // Catch:{ all -> 0x029c }
            if (r5 == 0) goto L_0x0295
            int r6 = r3.mo60454g()     // Catch:{ all -> 0x029c }
            boolean r5 = r5.mo60349b(r6)     // Catch:{ all -> 0x029c }
            if (r5 == 0) goto L_0x0295
            com.google.api.client.http.BackOffPolicy r5 = r1.f52454s     // Catch:{ all -> 0x029c }
            long r5 = r5.mo60348a()     // Catch:{ all -> 0x029c }
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0295
            com.google.api.client.util.Sleeper r4 = r1.f52459x     // Catch:{ InterruptedException -> 0x0271 }
            r4.mo60665a(r5)     // Catch:{ InterruptedException -> 0x0271 }
            goto L_0x0271
        L_0x0295:
            r2 = r2 & r4
            if (r2 == 0) goto L_0x02a7
            r3.mo60456j()     // Catch:{ all -> 0x029c }
            goto L_0x02a7
        L_0x029c:
            r0 = move-exception
            r3.mo60448a()
            throw r0
        L_0x02a1:
            if (r3 != 0) goto L_0x02a5
            r4 = 1
            goto L_0x02a6
        L_0x02a5:
            r4 = 0
        L_0x02a6:
            r2 = r2 & r4
        L_0x02a7:
            int r5 = r17 + -1
            if (r2 != 0) goto L_0x02cc
            if (r3 == 0) goto L_0x02cb
            com.google.api.client.http.HttpResponseInterceptor r0 = r1.f52451p
            if (r0 == 0) goto L_0x02b4
            r0.mo60321a(r3)
        L_0x02b4:
            boolean r0 = r1.f52456u
            if (r0 == 0) goto L_0x02ca
            boolean r0 = r3.mo60457k()
            if (r0 == 0) goto L_0x02bf
            goto L_0x02ca
        L_0x02bf:
            com.google.api.client.http.HttpResponseException r0 = new com.google.api.client.http.HttpResponseException     // Catch:{ all -> 0x02c5 }
            r0.<init>((com.google.api.client.http.HttpResponse) r3)     // Catch:{ all -> 0x02c5 }
            throw r0     // Catch:{ all -> 0x02c5 }
        L_0x02c5:
            r0 = move-exception
            r3.mo60448a()
            throw r0
        L_0x02ca:
            return r3
        L_0x02cb:
            throw r0
        L_0x02cc:
            r0 = r3
            r3 = 1
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.http.HttpRequest.mo60416a():com.google.api.client.http.HttpResponse");
    }

    /* renamed from: b */
    public HttpContent mo60417b() {
        return this.f52443h;
    }

    /* renamed from: c */
    public int mo60418c() {
        return this.f52440e;
    }

    /* renamed from: d */
    public boolean mo60419d() {
        return this.f52455t;
    }

    /* renamed from: e */
    public HttpHeaders mo60420e() {
        return this.f52437b;
    }

    @Beta
    /* renamed from: f */
    public HttpIOExceptionHandler mo60421f() {
        return this.f52450o;
    }

    /* renamed from: g */
    public HttpExecuteInterceptor mo60422g() {
        return this.f52436a;
    }

    /* renamed from: h */
    public final ObjectParser mo60423h() {
        return this.f52452q;
    }

    /* renamed from: i */
    public String mo60424i() {
        return this.f52445j;
    }

    /* renamed from: j */
    public HttpHeaders mo60425j() {
        return this.f52438c;
    }

    /* renamed from: k */
    public HttpResponseInterceptor mo60426k() {
        return this.f52451p;
    }

    /* renamed from: l */
    public boolean mo60427l() {
        return this.f52456u;
    }

    /* renamed from: m */
    public HttpTransport mo60428m() {
        return this.f52444i;
    }

    /* renamed from: n */
    public HttpUnsuccessfulResponseHandler mo60429n() {
        return this.f52449n;
    }

    /* renamed from: o */
    public GenericUrl mo60430o() {
        return this.f52446k;
    }

    /* renamed from: p */
    public boolean mo60431p(int i, HttpHeaders httpHeaders) {
        String q = httpHeaders.mo60395q();
        if (!mo60419d() || !HttpStatusCodes.m72124a(i) || q == null) {
            return false;
        }
        mo60415A(new GenericUrl(this.f52446k.mo60358D(q)));
        if (i == 303) {
            mo60438w("GET");
            mo60433r((HttpContent) null);
        }
        this.f52437b.mo60376B((String) null);
        this.f52437b.mo60383L((String) null);
        this.f52437b.mo60385N((String) null);
        this.f52437b.mo60384M((String) null);
        this.f52437b.mo60387P((String) null);
        this.f52437b.mo60386O((String) null);
        return true;
    }

    /* renamed from: q */
    public boolean mo60432q() {
        return this.f52441f;
    }

    /* renamed from: r */
    public HttpRequest mo60433r(HttpContent httpContent) {
        this.f52443h = httpContent;
        return this;
    }

    /* renamed from: s */
    public HttpRequest mo60434s(HttpEncoding httpEncoding) {
        this.f52453r = httpEncoding;
        return this;
    }

    @Beta
    /* renamed from: t */
    public HttpRequest mo60435t(HttpIOExceptionHandler httpIOExceptionHandler) {
        this.f52450o = httpIOExceptionHandler;
        return this;
    }

    /* renamed from: u */
    public HttpRequest mo60436u(HttpExecuteInterceptor httpExecuteInterceptor) {
        this.f52436a = httpExecuteInterceptor;
        return this;
    }

    /* renamed from: v */
    public HttpRequest mo60437v(ObjectParser objectParser) {
        this.f52452q = objectParser;
        return this;
    }

    /* renamed from: w */
    public HttpRequest mo60438w(String str) {
        Preconditions.m72713a(str == null || HttpMediaType.m72057i(str));
        this.f52445j = str;
        return this;
    }

    /* renamed from: x */
    public HttpRequest mo60439x(HttpResponseInterceptor httpResponseInterceptor) {
        this.f52451p = httpResponseInterceptor;
        return this;
    }

    /* renamed from: y */
    public HttpRequest mo60440y(boolean z) {
        this.f52456u = z;
        return this;
    }

    /* renamed from: z */
    public HttpRequest mo60441z(HttpUnsuccessfulResponseHandler httpUnsuccessfulResponseHandler) {
        this.f52449n = httpUnsuccessfulResponseHandler;
        return this;
    }
}

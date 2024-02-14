package com.google.android.gms.internal.mlkit_translate;

import android.content.Context;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
final class zzql {

    /* renamed from: f */
    private static final Pattern f44465f = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a */
    private final Context f44466a;

    /* renamed from: b */
    private final String f44467b;

    /* renamed from: c */
    private final String f44468c;

    /* renamed from: d */
    private final String f44469d;

    /* renamed from: e */
    private final zzqw f44470e;

    public zzql(Context context, String str, String str2, String str3, long j, long j2, zzqw zzqw) {
        this.f44466a = context;
        this.f44467b = str;
        this.f44468c = str2;
        Matcher matcher = f44465f.matcher(str);
        this.f44469d = matcher.matches() ? matcher.group(1) : null;
        this.f44470e = zzqw;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(31:56|57|(1:59)(3:60|(4:63|(2:66|64)|161|61)|160)|67|68|69|(2:70|(1:72)(1:162))|73|74|75|76|77|78|79|80|(4:82|83|104|105)|84|85|86|87|88|(2:92|93)|94|95|96|(2:99|100)|101|102|103|104|105) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x0303 */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x036a A[Catch:{ IOException -> 0x0400, JSONException -> 0x0359, IOException -> 0x0348, all -> 0x0409 }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00a6 A[LOOP:0: B:10:0x00a0->B:12:0x00a6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0431  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0251 A[SYNTHETIC, Splitter:B:56:0x0251] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0316 A[SYNTHETIC, Splitter:B:92:0x0316] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0323 A[SYNTHETIC, Splitter:B:99:0x0323] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.mlkit_translate.zzqn mo52456a(java.net.HttpURLConnection r17, java.lang.String r18, java.lang.String r19, java.util.Map r20, java.lang.String r21, java.util.Map r22, java.util.Date r23, java.lang.String r24, @androidx.annotation.Nullable java.lang.String r25, com.google.android.gms.internal.mlkit_translate.zzox r26) throws com.google.android.gms.internal.mlkit_translate.zzqv {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r26
            java.lang.String r5 = "MLKitRemoteConfigFetch"
            r6 = 1
            r2.setDoOutput(r6)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r7 = 5
            long r9 = r0.toMillis(r7)
            int r10 = (int) r9
            r2.setConnectTimeout(r10)
            long r7 = r0.toMillis(r7)
            int r0 = (int) r7
            r2.setReadTimeout(r0)
            java.lang.String r0 = "If-None-Match"
            r7 = 0
            r2.setRequestProperty(r0, r7)
            java.lang.String r0 = r1.f44468c
            java.lang.String r8 = "X-Goog-Api-Key"
            r2.setRequestProperty(r8, r0)
            android.content.Context r0 = r1.f44466a
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r8 = "X-Android-Package"
            r2.setRequestProperty(r8, r0)
            r8 = 0
            android.content.Context r0 = r1.f44466a     // Catch:{ NameNotFoundException -> 0x0067 }
            java.lang.String r9 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x0067 }
            byte[] r0 = com.google.android.gms.common.util.AndroidUtilsLight.m4839a(r0, r9)     // Catch:{ NameNotFoundException -> 0x0067 }
            if (r0 != 0) goto L_0x0062
            android.content.Context r0 = r1.f44466a     // Catch:{ NameNotFoundException -> 0x0067 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x0067 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x0067 }
            r9.<init>()     // Catch:{ NameNotFoundException -> 0x0067 }
            java.lang.String r10 = "Could not get fingerprint hash for package: "
            r9.append(r10)     // Catch:{ NameNotFoundException -> 0x0067 }
            r9.append(r0)     // Catch:{ NameNotFoundException -> 0x0067 }
            java.lang.String r0 = r9.toString()     // Catch:{ NameNotFoundException -> 0x0067 }
            android.util.Log.e(r5, r0)     // Catch:{ NameNotFoundException -> 0x0067 }
            goto L_0x007b
        L_0x0062:
            java.lang.String r0 = com.google.android.gms.common.util.Hex.m4886c(r0, r8)     // Catch:{ NameNotFoundException -> 0x0067 }
            goto L_0x007c
        L_0x0067:
            r0 = move-exception
            android.content.Context r9 = r1.f44466a
            java.lang.String r9 = r9.getPackageName()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r10 = "No such package: "
            java.lang.String r9 = r10.concat(r9)
            android.util.Log.e(r5, r9, r0)
        L_0x007b:
            r0 = r7
        L_0x007c:
            java.lang.String r9 = "X-Android-Cert"
            r2.setRequestProperty(r9, r0)
            java.lang.String r0 = "X-Google-GFE-Can-Retry"
            java.lang.String r9 = "yes"
            r2.setRequestProperty(r0, r9)
            java.lang.String r0 = "Content-Type"
            java.lang.String r9 = "application/json"
            r2.setRequestProperty(r0, r9)
            java.lang.String r0 = "Accept"
            r2.setRequestProperty(r0, r9)
            r0 = r22
            com.google.android.gms.internal.mlkit_translate.zzy r0 = (com.google.android.gms.internal.mlkit_translate.zzy) r0
            com.google.android.gms.internal.mlkit_translate.zzaa r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x00a0:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x00bc
            java.lang.Object r9 = r0.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r10 = r9.getKey()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r9.getValue()
            java.lang.String r9 = (java.lang.String) r9
            r2.setRequestProperty(r10, r9)
            goto L_0x00a0
        L_0x00bc:
            r0 = 3
            boolean r9 = android.util.Log.isLoggable(r5, r0)
            java.lang.String r10 = ": "
            if (r9 != 0) goto L_0x00c6
            goto L_0x0126
        L_0x00c6:
            java.util.Map r9 = r17.getRequestProperties()
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x00d2:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0126
            java.lang.Object r11 = r9.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r12 = r11.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = com.google.android.gms.internal.mlkit_translate.zzb.m61607a(r12)
            java.lang.String r14 = "api-key"
            boolean r13 = r13.contains(r14)
            if (r13 != 0) goto L_0x00d2
            java.lang.String r13 = com.google.android.gms.internal.mlkit_translate.zzb.m61607a(r12)
            java.lang.String r14 = "android-cert"
            boolean r13 = r13.contains(r14)
            if (r13 != 0) goto L_0x00d2
            java.lang.Object r11 = r11.getValue()
            java.util.List r11 = (java.util.List) r11
            java.util.Iterator r11 = r11.iterator()
        L_0x0106:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x00d2
            java.lang.Object r13 = r11.next()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "HTTP Request Header: "
            r14.append(r15)
            r14.append(r12)
            r14.append(r10)
            r14.append(r13)
            goto L_0x0106
        L_0x0126:
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            if (r3 == 0) goto L_0x0431
            java.lang.String r11 = "appInstanceId"
            r9.put(r11, r3)
            java.lang.String r3 = "appInstanceIdToken"
            r11 = r19
            r9.put(r3, r11)
            java.lang.String r11 = r1.f44467b
            java.lang.String r12 = "appId"
            r9.put(r12, r11)
            android.content.Context r11 = r1.f44466a
            android.content.res.Resources r11 = r11.getResources()
            android.content.res.Configuration r11 = r11.getConfiguration()
            java.util.Locale r11 = r11.locale
            java.lang.String r12 = r11.getCountry()
            java.lang.String r13 = "countryCode"
            r9.put(r13, r12)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "languageCode"
            r9.put(r12, r11)
            int r11 = android.os.Build.VERSION.SDK_INT
            java.lang.String r11 = java.lang.Integer.toString(r11)
            java.lang.String r12 = "platformVersion"
            r9.put(r12, r11)
            java.util.TimeZone r11 = java.util.TimeZone.getDefault()
            java.lang.String r11 = r11.getID()
            java.lang.String r12 = "timeZone"
            r9.put(r12, r11)
            android.content.Context r11 = r1.f44466a     // Catch:{ NameNotFoundException -> 0x018b }
            android.content.pm.PackageManager r11 = r11.getPackageManager()     // Catch:{ NameNotFoundException -> 0x018b }
            android.content.Context r12 = r1.f44466a     // Catch:{ NameNotFoundException -> 0x018b }
            java.lang.String r12 = r12.getPackageName()     // Catch:{ NameNotFoundException -> 0x018b }
            android.content.pm.PackageInfo r11 = r11.getPackageInfo(r12, r8)     // Catch:{ NameNotFoundException -> 0x018b }
            if (r11 == 0) goto L_0x018b
            java.lang.String r11 = r11.versionName     // Catch:{ NameNotFoundException -> 0x018b }
            goto L_0x018c
        L_0x018b:
            r11 = r7
        L_0x018c:
            r12 = 2
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r12[r8] = r11
            r12[r6] = r7
            java.lang.String r6 = "%s-MLKit-%s"
            java.lang.String r6 = java.lang.String.format(r6, r12)
            java.lang.String r8 = java.lang.String.valueOf(r6)
            java.lang.String r11 = "APP_VERSION: "
            r11.concat(r8)
            java.lang.String r8 = "appVersion"
            r9.put(r8, r6)
            android.content.Context r6 = r1.f44466a
            java.lang.String r6 = r6.getPackageName()
            java.lang.String r8 = "packageName"
            r9.put(r8, r6)
            java.lang.String r6 = "sdkVersion"
            java.lang.String r8 = "o:a:mlkit:1.0.0"
            r9.put(r6, r8)
            org.json.JSONObject r6 = new org.json.JSONObject
            r8 = r20
            r6.<init>(r8)
            java.lang.String r8 = "analyticsUserProperties"
            r9.put(r8, r6)
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>(r9)
            boolean r8 = android.util.Log.isLoggable(r5, r0)
            if (r8 != 0) goto L_0x01d1
            goto L_0x0203
        L_0x01d1:
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.util.Iterator r9 = r6.keys()
        L_0x01da:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x01f7
            java.lang.Object r11 = r9.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r6.get(r11)     // Catch:{ JSONException -> 0x01ee }
            r8.put(r11, r12)     // Catch:{ JSONException -> 0x01ee }
            goto L_0x01da
        L_0x01ee:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "shallowCopyJsonObject: concurrent mutation?"
            r2.<init>(r3, r0)
            throw r2
        L_0x01f7:
            r8.remove(r3)
            java.lang.String r3 = r8.toString()
            java.lang.String r8 = "HTTP Request Body: "
            r8.concat(r3)
        L_0x0203:
            java.lang.String r3 = r6.toString()
            java.nio.charset.Charset r6 = com.google.android.gms.internal.mlkit_translate.zzc.f43169c
            byte[] r3 = r3.getBytes(r6)
            com.google.android.gms.internal.mlkit_translate.zzox r6 = new com.google.android.gms.internal.mlkit_translate.zzox
            r6.<init>()
            r6.mo52391g()
            java.lang.String r8 = "Connecting: "
            java.lang.String r9 = java.lang.String.valueOf(r17)     // Catch:{ all -> 0x0427 }
            r8.concat(r9)     // Catch:{ all -> 0x0427 }
            int r8 = r3.length     // Catch:{ IOException -> 0x040e }
            r2.setFixedLengthStreamingMode(r8)     // Catch:{ IOException -> 0x040e }
            java.io.BufferedOutputStream r8 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x040e }
            java.io.OutputStream r9 = r17.getOutputStream()     // Catch:{ IOException -> 0x040e }
            r8.<init>(r9)     // Catch:{ IOException -> 0x040e }
            r8.write(r3)     // Catch:{ IOException -> 0x040e }
            r8.flush()     // Catch:{ IOException -> 0x040e }
            r8.close()     // Catch:{ IOException -> 0x040e }
            r17.connect()     // Catch:{ IOException -> 0x040e }
            int r3 = r17.getResponseCode()     // Catch:{ IOException -> 0x040e }
            r6.mo52390f(r3)     // Catch:{ all -> 0x0409 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            r8.<init>()     // Catch:{ all -> 0x0409 }
            java.lang.String r9 = "Remote config: got response code "
            r8.append(r9)     // Catch:{ all -> 0x0409 }
            r8.append(r3)     // Catch:{ all -> 0x0409 }
            r8 = 200(0xc8, float:2.8E-43)
            java.lang.String r9 = "HTTP Response Header: "
            if (r3 != r8) goto L_0x036a
            boolean r0 = android.util.Log.isLoggable(r5, r0)     // Catch:{ all -> 0x0409 }
            if (r0 != 0) goto L_0x0258
            goto L_0x029e
        L_0x0258:
            java.util.Map r0 = r17.getHeaderFields()     // Catch:{ all -> 0x0409 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0409 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0409 }
        L_0x0264:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0409 }
            if (r3 == 0) goto L_0x029e
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0409 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0409 }
            java.lang.Object r5 = r3.getValue()     // Catch:{ all -> 0x0409 }
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x0409 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0409 }
        L_0x027a:
            boolean r8 = r5.hasNext()     // Catch:{ all -> 0x0409 }
            if (r8 == 0) goto L_0x0264
            java.lang.Object r8 = r5.next()     // Catch:{ all -> 0x0409 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0409 }
            java.lang.Object r11 = r3.getKey()     // Catch:{ all -> 0x0409 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0409 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            r12.<init>()     // Catch:{ all -> 0x0409 }
            r12.append(r9)     // Catch:{ all -> 0x0409 }
            r12.append(r11)     // Catch:{ all -> 0x0409 }
            r12.append(r10)     // Catch:{ all -> 0x0409 }
            r12.append(r8)     // Catch:{ all -> 0x0409 }
            goto L_0x027a
        L_0x029e:
            java.lang.String r0 = "ETag"
            java.lang.String r0 = r2.getHeaderField(r0)     // Catch:{ all -> 0x0409 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ JSONException -> 0x0359, IOException -> 0x0348 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ JSONException -> 0x0359, IOException -> 0x0348 }
            java.io.InputStream r8 = r17.getInputStream()     // Catch:{ JSONException -> 0x0359, IOException -> 0x0348 }
            java.nio.charset.Charset r9 = com.google.android.gms.internal.mlkit_translate.zzc.f43169c     // Catch:{ JSONException -> 0x0359, IOException -> 0x0348 }
            r5.<init>(r8, r9)     // Catch:{ JSONException -> 0x0359, IOException -> 0x0348 }
            r3.<init>(r5)     // Catch:{ JSONException -> 0x0359, IOException -> 0x0348 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0359, IOException -> 0x0348 }
            r5.<init>()     // Catch:{ JSONException -> 0x0359, IOException -> 0x0348 }
        L_0x02b9:
            int r8 = r3.read()     // Catch:{ JSONException -> 0x0359, IOException -> 0x0348 }
            r9 = -1
            if (r8 == r9) goto L_0x02c5
            char r8 = (char) r8     // Catch:{ JSONException -> 0x0359, IOException -> 0x0348 }
            r5.append(r8)     // Catch:{ JSONException -> 0x0359, IOException -> 0x0348 }
            goto L_0x02b9
        L_0x02c5:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0359, IOException -> 0x0348 }
            java.lang.String r5 = r5.toString()     // Catch:{ JSONException -> 0x0359, IOException -> 0x0348 }
            r3.<init>(r5)     // Catch:{ JSONException -> 0x0359, IOException -> 0x0348 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            r5.<init>()     // Catch:{ all -> 0x0409 }
            java.lang.String r8 = "Remote config: got response ETag: "
            r5.append(r8)     // Catch:{ all -> 0x0409 }
            r5.append(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x0409 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            r8.<init>()     // Catch:{ all -> 0x0409 }
            java.lang.String r9 = "Remote config: got response: "
            r8.append(r9)     // Catch:{ all -> 0x0409 }
            r8.append(r5)     // Catch:{ all -> 0x0409 }
            r17.disconnect()     // Catch:{ all -> 0x0427 }
            java.lang.String r2 = "state"
            java.lang.Object r2 = r3.get(r2)     // Catch:{ JSONException -> 0x0303 }
            java.lang.String r5 = "NO_CHANGE"
            boolean r2 = r2.equals(r5)     // Catch:{ JSONException -> 0x0303 }
            if (r2 != 0) goto L_0x02fe
            goto L_0x0303
        L_0x02fe:
            com.google.android.gms.internal.mlkit_translate.zzqn r0 = com.google.android.gms.internal.mlkit_translate.zzqn.m62213b(r23)     // Catch:{ all -> 0x0427 }
            goto L_0x032e
        L_0x0303:
            com.google.android.gms.internal.mlkit_translate.zzqj r2 = com.google.android.gms.internal.mlkit_translate.zzqk.m62206a()     // Catch:{ JSONException -> 0x0337 }
            r5 = r23
            r2.mo52451c(r5)     // Catch:{ JSONException -> 0x0337 }
            java.lang.String r5 = "entries"
            org.json.JSONObject r5 = r3.getJSONObject(r5)     // Catch:{ JSONException -> 0x0313 }
            goto L_0x0314
        L_0x0313:
            r5 = r7
        L_0x0314:
            if (r5 == 0) goto L_0x0319
            r2.mo52449a(r5)     // Catch:{ JSONException -> 0x0337 }
        L_0x0319:
            java.lang.String r5 = "experimentDescriptions"
            org.json.JSONArray r7 = r3.getJSONArray(r5)     // Catch:{ JSONException -> 0x0320 }
            goto L_0x0321
        L_0x0320:
        L_0x0321:
            if (r7 == 0) goto L_0x0326
            r2.mo52450b(r7)     // Catch:{ JSONException -> 0x0337 }
        L_0x0326:
            com.google.android.gms.internal.mlkit_translate.zzqk r2 = r2.mo52452d()     // Catch:{ JSONException -> 0x0337 }
            com.google.android.gms.internal.mlkit_translate.zzqn r0 = com.google.android.gms.internal.mlkit_translate.zzqn.m62214c(r2, r0)     // Catch:{ all -> 0x0427 }
        L_0x032e:
            r6.mo52389e()
            com.google.android.gms.internal.mlkit_translate.zzqw r2 = r1.f44470e
            r2.mo52470d(r6)
            return r0
        L_0x0337:
            r0 = move-exception
            com.google.android.gms.internal.mlkit_translate.zznk r2 = com.google.android.gms.internal.mlkit_translate.zznk.RPC_RETURNED_INVALID_RESULT     // Catch:{ all -> 0x0427 }
            r6.mo52388d(r2)     // Catch:{ all -> 0x0427 }
            r4.mo52386b(r2)     // Catch:{ all -> 0x0427 }
            com.google.android.gms.internal.mlkit_translate.zzqu r2 = new com.google.android.gms.internal.mlkit_translate.zzqu     // Catch:{ all -> 0x0427 }
            java.lang.String r3 = "Fetch failed: fetch response could not be parsed."
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0427 }
            throw r2     // Catch:{ all -> 0x0427 }
        L_0x0348:
            r0 = move-exception
            com.google.android.gms.internal.mlkit_translate.zznk r3 = com.google.android.gms.internal.mlkit_translate.zznk.RPC_ERROR     // Catch:{ all -> 0x0409 }
            r6.mo52388d(r3)     // Catch:{ all -> 0x0409 }
            r4.mo52386b(r3)     // Catch:{ all -> 0x0409 }
            com.google.android.gms.internal.mlkit_translate.zzqu r3 = new com.google.android.gms.internal.mlkit_translate.zzqu     // Catch:{ all -> 0x0409 }
            java.lang.String r4 = "The client had an error while calling the backend!"
            r3.<init>(r4, r0)     // Catch:{ all -> 0x0409 }
            throw r3     // Catch:{ all -> 0x0409 }
        L_0x0359:
            r0 = move-exception
            com.google.android.gms.internal.mlkit_translate.zznk r3 = com.google.android.gms.internal.mlkit_translate.zznk.RPC_RETURNED_MALFORMED_RESULT     // Catch:{ all -> 0x0409 }
            r6.mo52388d(r3)     // Catch:{ all -> 0x0409 }
            r4.mo52386b(r3)     // Catch:{ all -> 0x0409 }
            com.google.android.gms.internal.mlkit_translate.zzqu r3 = new com.google.android.gms.internal.mlkit_translate.zzqu     // Catch:{ all -> 0x0409 }
            java.lang.String r4 = "Error parsing the server output"
            r3.<init>(r4, r0)     // Catch:{ all -> 0x0409 }
            throw r3     // Catch:{ all -> 0x0409 }
        L_0x036a:
            com.google.android.gms.internal.mlkit_translate.zznk r0 = com.google.android.gms.internal.mlkit_translate.zznk.RPC_ERROR     // Catch:{ all -> 0x0409 }
            r6.mo52388d(r0)     // Catch:{ all -> 0x0409 }
            r4.mo52386b(r0)     // Catch:{ all -> 0x0409 }
            r0 = 4
            boolean r0 = android.util.Log.isLoggable(r5, r0)     // Catch:{ all -> 0x0409 }
            if (r0 != 0) goto L_0x037a
            goto L_0x03c7
        L_0x037a:
            java.util.Map r0 = r17.getHeaderFields()     // Catch:{ all -> 0x0409 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0409 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0409 }
        L_0x0386:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0409 }
            if (r4 == 0) goto L_0x03c7
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0409 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x0409 }
            java.lang.Object r7 = r4.getValue()     // Catch:{ all -> 0x0409 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x0409 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0409 }
        L_0x039c:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0409 }
            if (r8 == 0) goto L_0x0386
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0409 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0409 }
            java.lang.Object r11 = r4.getKey()     // Catch:{ all -> 0x0409 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0409 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0409 }
            r12.<init>()     // Catch:{ all -> 0x0409 }
            r12.append(r9)     // Catch:{ all -> 0x0409 }
            r12.append(r11)     // Catch:{ all -> 0x0409 }
            r12.append(r10)     // Catch:{ all -> 0x0409 }
            r12.append(r8)     // Catch:{ all -> 0x0409 }
            java.lang.String r8 = r12.toString()     // Catch:{ all -> 0x0409 }
            android.util.Log.i(r5, r8)     // Catch:{ all -> 0x0409 }
            goto L_0x039c
        L_0x03c7:
            r0 = 5
            boolean r0 = android.util.Log.isLoggable(r5, r0)     // Catch:{ all -> 0x0409 }
            if (r0 == 0) goto L_0x03f6
            java.io.InputStream r0 = r17.getErrorStream()     // Catch:{ all -> 0x0409 }
            if (r0 == 0) goto L_0x03f6
            java.util.Scanner r4 = new java.util.Scanner     // Catch:{ all -> 0x0409 }
            r4.<init>(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = "\\A"
            java.util.Scanner r0 = r4.useDelimiter(r0)     // Catch:{ all -> 0x0409 }
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0409 }
            if (r4 == 0) goto L_0x03f6
            java.lang.String r4 = "HTTP Error Stream: "
            java.lang.String r0 = r0.next()     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = r4.concat(r0)     // Catch:{ all -> 0x0409 }
            android.util.Log.w(r5, r0)     // Catch:{ all -> 0x0409 }
        L_0x03f6:
            com.google.android.gms.internal.mlkit_translate.zzqz r0 = new com.google.android.gms.internal.mlkit_translate.zzqz     // Catch:{ IOException -> 0x0400 }
            java.lang.String r4 = r17.getResponseMessage()     // Catch:{ IOException -> 0x0400 }
            r0.<init>(r3, r4)     // Catch:{ IOException -> 0x0400 }
            throw r0     // Catch:{ IOException -> 0x0400 }
        L_0x0400:
            r0 = move-exception
            com.google.android.gms.internal.mlkit_translate.zzqz r4 = new com.google.android.gms.internal.mlkit_translate.zzqz     // Catch:{ all -> 0x0409 }
            java.lang.String r5 = "<error reading HTTP response>"
            r4.<init>(r3, r5, r0)     // Catch:{ all -> 0x0409 }
            throw r4     // Catch:{ all -> 0x0409 }
        L_0x0409:
            r0 = move-exception
            r17.disconnect()     // Catch:{ all -> 0x0427 }
            throw r0     // Catch:{ all -> 0x0427 }
        L_0x040e:
            r0 = move-exception
            com.google.android.gms.internal.mlkit_translate.zznk r3 = com.google.android.gms.internal.mlkit_translate.zznk.NO_CONNECTION     // Catch:{ all -> 0x0427 }
            r6.mo52388d(r3)     // Catch:{ all -> 0x0427 }
            r4.mo52386b(r3)     // Catch:{ all -> 0x0427 }
            com.google.android.gms.internal.mlkit_translate.zzqu r3 = new com.google.android.gms.internal.mlkit_translate.zzqu     // Catch:{ all -> 0x0427 }
            java.lang.String r4 = "Error connecting to "
            java.lang.String r2 = java.lang.String.valueOf(r17)     // Catch:{ all -> 0x0427 }
            java.lang.String r2 = r4.concat(r2)     // Catch:{ all -> 0x0427 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x0427 }
            throw r3     // Catch:{ all -> 0x0427 }
        L_0x0427:
            r0 = move-exception
            r6.mo52389e()
            com.google.android.gms.internal.mlkit_translate.zzqw r2 = r1.f44470e
            r2.mo52470d(r6)
            throw r0
        L_0x0431:
            com.google.android.gms.internal.mlkit_translate.zzqu r0 = new com.google.android.gms.internal.mlkit_translate.zzqu
            java.lang.String r2 = "Fetch failed: Firebase instance id is null."
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_translate.zzql.mo52456a(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.Map, java.util.Date, java.lang.String, java.lang.String, com.google.android.gms.internal.mlkit_translate.zzox):com.google.android.gms.internal.mlkit_translate.zzqn");
    }

    /* renamed from: b */
    public final HttpURLConnection mo52457b() throws zzqv {
        try {
            return (HttpURLConnection) new URL(String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", new Object[]{this.f44469d, "firebase"})).openConnection();
        } catch (IOException e) {
            throw new zzqv(e.getMessage());
        }
    }
}

package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzclm extends zzer implements zzfu {

    /* renamed from: u */
    private static final Pattern f28865u = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: v */
    private static final AtomicReference f28866v = new AtomicReference();

    /* renamed from: e */
    private final SSLSocketFactory f28867e = new zzcll(this);

    /* renamed from: f */
    private final int f28868f;

    /* renamed from: g */
    private final int f28869g;

    /* renamed from: h */
    private final String f28870h;

    /* renamed from: i */
    private final zzft f28871i;

    /* renamed from: j */
    private zzfc f28872j;

    /* renamed from: k */
    private HttpURLConnection f28873k;

    /* renamed from: l */
    private InputStream f28874l;

    /* renamed from: m */
    private boolean f28875m;

    /* renamed from: n */
    private int f28876n;

    /* renamed from: o */
    private long f28877o;

    /* renamed from: p */
    private long f28878p;

    /* renamed from: q */
    private long f28879q;

    /* renamed from: r */
    private long f28880r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f28881s;

    /* renamed from: t */
    private final Set f28882t = new HashSet();

    zzclm(String str, zzfz zzfz, int i, int i2, int i3) {
        super(true);
        zzdd.m47209c(str);
        this.f28870h = str;
        this.f28871i = new zzft();
        this.f28868f = i;
        this.f28869g = i2;
        this.f28881s = i3;
        if (zzfz != null) {
            mo43952k(zzfz);
        }
    }

    /* renamed from: u */
    private final void m45712u() {
        HttpURLConnection httpURLConnection = this.f28873k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzcgp.m45227e("Unexpected error while disconnecting", e);
            }
            this.f28873k = null;
        }
    }

    @Nullable
    /* renamed from: a */
    public final Uri mo43924a() {
        HttpURLConnection httpURLConnection = this.f28873k;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Nullable
    /* renamed from: b */
    public final Map mo43925b() {
        HttpURLConnection httpURLConnection = this.f28873k;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:4|(1:6)(1:7)|8|9|(5:13|14|(2:16|(1:18))(2:19|(1:21))|22|(1:26))|27|28) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0067 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo43926d() throws com.google.android.gms.internal.ads.zzfq {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.f28874l     // Catch:{ all -> 0x008d }
            if (r2 == 0) goto L_0x0079
            java.net.HttpURLConnection r2 = r9.f28873k     // Catch:{ all -> 0x008d }
            long r3 = r9.f28878p     // Catch:{ all -> 0x008d }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0011
            goto L_0x0014
        L_0x0011:
            long r7 = r9.f28880r     // Catch:{ all -> 0x008d }
            long r3 = r3 - r7
        L_0x0014:
            int r7 = com.google.android.gms.internal.ads.zzen.f34500a     // Catch:{ all -> 0x008d }
            r8 = 19
            if (r7 == r8) goto L_0x001f
            r8 = 20
            if (r7 == r8) goto L_0x001f
            goto L_0x0067
        L_0x001f:
            java.io.InputStream r2 = r2.getInputStream()     // Catch:{ Exception -> 0x0067 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x002f
            int r3 = r2.read()     // Catch:{ Exception -> 0x0067 }
            r4 = -1
            if (r3 == r4) goto L_0x0067
            goto L_0x0036
        L_0x002f:
            r5 = 2048(0x800, double:1.0118E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0036
            goto L_0x0067
        L_0x0036:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r3.equals(r4)     // Catch:{ Exception -> 0x0067 }
            if (r4 != 0) goto L_0x004e
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x0067 }
            if (r3 == 0) goto L_0x0067
        L_0x004e:
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x0067 }
            java.lang.Class r3 = r3.getSuperclass()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0067 }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x0067 }
            r4 = 1
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x0067 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0067 }
            r3.invoke(r2, r4)     // Catch:{ Exception -> 0x0067 }
        L_0x0067:
            java.io.InputStream r2 = r9.f28874l     // Catch:{ IOException -> 0x006d }
            r2.close()     // Catch:{ IOException -> 0x006d }
            goto L_0x0079
        L_0x006d:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzfq r3 = new com.google.android.gms.internal.ads.zzfq     // Catch:{ all -> 0x008d }
            com.google.android.gms.internal.ads.zzfc r4 = r9.f28872j     // Catch:{ all -> 0x008d }
            r5 = 2000(0x7d0, float:2.803E-42)
            r6 = 3
            r3.<init>((java.io.IOException) r2, (com.google.android.gms.internal.ads.zzfc) r4, (int) r5, (int) r6)     // Catch:{ all -> 0x008d }
            throw r3     // Catch:{ all -> 0x008d }
        L_0x0079:
            r9.f28874l = r0
            r9.m45712u()
            boolean r0 = r9.f28875m
            if (r0 == 0) goto L_0x0087
            r9.f28875m = r1
            r9.mo45436o()
        L_0x0087:
            java.util.Set r0 = r9.f28882t
            r0.clear()
            return
        L_0x008d:
            r2 = move-exception
            r9.f28874l = r0
            r9.m45712u()
            boolean r0 = r9.f28875m
            if (r0 == 0) goto L_0x009c
            r9.f28875m = r1
            r9.mo45436o()
        L_0x009c:
            java.util.Set r0 = r9.f28882t
            r0.clear()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzclm.mo43926d():void");
    }

    /* renamed from: e */
    public final int mo43927e(byte[] bArr, int i, int i2) throws zzfq {
        try {
            if (this.f28879q != this.f28877o) {
                byte[] bArr2 = (byte[]) f28866v.getAndSet((Object) null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.f28879q;
                    long j2 = this.f28877o;
                    if (j == j2) {
                        f28866v.set(bArr2);
                        break;
                    }
                    int read = this.f28874l.read(bArr2, 0, (int) Math.min(j2 - j, (long) bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.f28879q += (long) read;
                        mo45439x(read);
                    } else {
                        throw new EOFException();
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.f28878p;
            if (j3 != -1) {
                long j4 = j3 - this.f28880r;
                if (j4 != 0) {
                    i2 = (int) Math.min((long) i2, j4);
                }
                return -1;
            }
            int read2 = this.f28874l.read(bArr, i, i2);
            if (read2 != -1) {
                this.f28880r += (long) read2;
                mo45439x(read2);
                return read2;
            } else if (this.f28878p == -1) {
                return -1;
            } else {
                throw new EOFException();
            }
        } catch (IOException e) {
            throw new zzfq(e, this.f28872j, 2000, 2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0100, code lost:
        if (r2 != 0) goto L_0x0105;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x00e6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b7 A[Catch:{ IOException -> 0x0291 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e4 A[Catch:{ IOException -> 0x0291 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c0  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo43928g(com.google.android.gms.internal.ads.zzfc r21) throws com.google.android.gms.internal.ads.zzfq {
        /*
            r20 = this;
            r1 = r20
            r7 = r21
            java.lang.String r2 = "Unable to connect to "
            r1.f28872j = r7
            r3 = 0
            r1.f28880r = r3
            r1.f28879q = r3
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x0291 }
            android.net.Uri r5 = r7.f35396a     // Catch:{ IOException -> 0x0291 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x0291 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x0291 }
            long r5 = r7.f35401f     // Catch:{ IOException -> 0x0291 }
            long r8 = r7.f35402g     // Catch:{ IOException -> 0x0291 }
            r10 = 1
            boolean r11 = r7.mo45582b(r10)     // Catch:{ IOException -> 0x0291 }
            r13 = 0
        L_0x0023:
            int r14 = r13 + 1
            r15 = 20
            if (r13 > r15) goto L_0x027a
            java.net.URLConnection r13 = r0.openConnection()     // Catch:{ IOException -> 0x0291 }
            java.net.HttpURLConnection r13 = (java.net.HttpURLConnection) r13     // Catch:{ IOException -> 0x0291 }
            boolean r15 = r13 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ IOException -> 0x0291 }
            if (r15 == 0) goto L_0x003b
            r15 = r13
            javax.net.ssl.HttpsURLConnection r15 = (javax.net.ssl.HttpsURLConnection) r15     // Catch:{ IOException -> 0x0291 }
            javax.net.ssl.SSLSocketFactory r10 = r1.f28867e     // Catch:{ IOException -> 0x0291 }
            r15.setSSLSocketFactory(r10)     // Catch:{ IOException -> 0x0291 }
        L_0x003b:
            int r10 = r1.f28868f     // Catch:{ IOException -> 0x0291 }
            r13.setConnectTimeout(r10)     // Catch:{ IOException -> 0x0291 }
            int r10 = r1.f28869g     // Catch:{ IOException -> 0x0291 }
            r13.setReadTimeout(r10)     // Catch:{ IOException -> 0x0291 }
            com.google.android.gms.internal.ads.zzft r10 = r1.f28871i     // Catch:{ IOException -> 0x0291 }
            java.util.Map r10 = r10.mo46172a()     // Catch:{ IOException -> 0x0291 }
            java.util.Set r10 = r10.entrySet()     // Catch:{ IOException -> 0x0291 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ IOException -> 0x0291 }
        L_0x0053:
            boolean r15 = r10.hasNext()     // Catch:{ IOException -> 0x0291 }
            if (r15 == 0) goto L_0x0071
            java.lang.Object r15 = r10.next()     // Catch:{ IOException -> 0x0291 }
            java.util.Map$Entry r15 = (java.util.Map.Entry) r15     // Catch:{ IOException -> 0x0291 }
            java.lang.Object r16 = r15.getKey()     // Catch:{ IOException -> 0x0291 }
            r12 = r16
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ IOException -> 0x0291 }
            java.lang.Object r15 = r15.getValue()     // Catch:{ IOException -> 0x0291 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ IOException -> 0x0291 }
            r13.setRequestProperty(r12, r15)     // Catch:{ IOException -> 0x0291 }
            goto L_0x0053
        L_0x0071:
            r18 = -1
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 != 0) goto L_0x007c
            int r10 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r10 == 0) goto L_0x00ae
            goto L_0x007d
        L_0x007c:
            r3 = r5
        L_0x007d:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0291 }
            r10.<init>()     // Catch:{ IOException -> 0x0291 }
            java.lang.String r12 = "bytes="
            r10.append(r12)     // Catch:{ IOException -> 0x0291 }
            r10.append(r3)     // Catch:{ IOException -> 0x0291 }
            java.lang.String r12 = "-"
            r10.append(r12)     // Catch:{ IOException -> 0x0291 }
            java.lang.String r10 = r10.toString()     // Catch:{ IOException -> 0x0291 }
            int r12 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r12 == 0) goto L_0x00a9
            long r3 = r3 + r8
            long r3 = r3 + r18
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0291 }
            r12.<init>()     // Catch:{ IOException -> 0x0291 }
            r12.append(r10)     // Catch:{ IOException -> 0x0291 }
            r12.append(r3)     // Catch:{ IOException -> 0x0291 }
            java.lang.String r10 = r12.toString()     // Catch:{ IOException -> 0x0291 }
        L_0x00a9:
            java.lang.String r3 = "Range"
            r13.setRequestProperty(r3, r10)     // Catch:{ IOException -> 0x0291 }
        L_0x00ae:
            java.lang.String r3 = "User-Agent"
            java.lang.String r4 = r1.f28870h     // Catch:{ IOException -> 0x0291 }
            r13.setRequestProperty(r3, r4)     // Catch:{ IOException -> 0x0291 }
            if (r11 != 0) goto L_0x00be
            java.lang.String r3 = "Accept-Encoding"
            java.lang.String r4 = "identity"
            r13.setRequestProperty(r3, r4)     // Catch:{ IOException -> 0x0291 }
        L_0x00be:
            r3 = 0
            r13.setInstanceFollowRedirects(r3)     // Catch:{ IOException -> 0x0291 }
            r13.setDoOutput(r3)     // Catch:{ IOException -> 0x0291 }
            r13.connect()     // Catch:{ IOException -> 0x0291 }
            int r4 = r13.getResponseCode()     // Catch:{ IOException -> 0x0291 }
            r10 = 300(0x12c, float:4.2E-43)
            if (r4 == r10) goto L_0x0233
            r10 = 301(0x12d, float:4.22E-43)
            if (r4 == r10) goto L_0x0233
            r10 = 302(0x12e, float:4.23E-43)
            if (r4 == r10) goto L_0x0233
            r10 = 303(0x12f, float:4.25E-43)
            if (r4 == r10) goto L_0x0233
            r10 = 307(0x133, float:4.3E-43)
            if (r4 == r10) goto L_0x0233
            r10 = 308(0x134, float:4.32E-43)
            if (r4 != r10) goto L_0x00e6
            goto L_0x0233
        L_0x00e6:
            r1.f28873k = r13     // Catch:{ IOException -> 0x0291 }
            int r0 = r13.getResponseCode()     // Catch:{ IOException -> 0x0213 }
            r1.f28876n = r0     // Catch:{ IOException -> 0x0213 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 < r2) goto L_0x01eb
            r3 = 299(0x12b, float:4.19E-43)
            if (r0 <= r3) goto L_0x00f8
            goto L_0x01eb
        L_0x00f8:
            if (r0 != r2) goto L_0x0103
            long r2 = r7.f35401f
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0103
            goto L_0x0105
        L_0x0103:
            r2 = 0
        L_0x0105:
            r1.f28877o = r2
            r2 = 1
            boolean r0 = r7.mo45582b(r2)
            if (r0 != 0) goto L_0x01c9
            long r2 = r7.f35402g
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x0118
            r1.f28878p = r2
            goto L_0x01cd
        L_0x0118:
            java.net.HttpURLConnection r0 = r1.f28873k
            java.lang.String r2 = "Content-Length"
            java.lang.String r2 = r0.getHeaderField(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r4 = "]"
            if (r3 != 0) goto L_0x0144
            long r5 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x012d }
            goto L_0x0146
        L_0x012d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Unexpected Content-Length ["
            r3.append(r5)
            r3.append(r2)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.google.android.gms.internal.ads.zzcgp.m45226d(r3)
        L_0x0144:
            r5 = r18
        L_0x0146:
            java.lang.String r3 = "Content-Range"
            java.lang.String r0 = r0.getHeaderField(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x01bc
            java.util.regex.Pattern r3 = f28865u
            java.util.regex.Matcher r3 = r3.matcher(r0)
            boolean r8 = r3.find()
            if (r8 == 0) goto L_0x01bc
            r8 = 2
            java.lang.String r8 = r3.group(r8)     // Catch:{ NumberFormatException -> 0x01a5 }
            long r8 = java.lang.Long.parseLong(r8)     // Catch:{ NumberFormatException -> 0x01a5 }
            r10 = 1
            java.lang.String r3 = r3.group(r10)     // Catch:{ NumberFormatException -> 0x01a5 }
            long r10 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x01a5 }
            long r8 = r8 - r10
            r10 = 1
            long r8 = r8 + r10
            r16 = 0
            int r3 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r3 >= 0) goto L_0x017c
            r5 = r8
            goto L_0x01bc
        L_0x017c:
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x01bc
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x01a5 }
            r3.<init>()     // Catch:{ NumberFormatException -> 0x01a5 }
            java.lang.String r10 = "Inconsistent headers ["
            r3.append(r10)     // Catch:{ NumberFormatException -> 0x01a5 }
            r3.append(r2)     // Catch:{ NumberFormatException -> 0x01a5 }
            java.lang.String r2 = "] ["
            r3.append(r2)     // Catch:{ NumberFormatException -> 0x01a5 }
            r3.append(r0)     // Catch:{ NumberFormatException -> 0x01a5 }
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x01a5 }
            java.lang.String r2 = r3.toString()     // Catch:{ NumberFormatException -> 0x01a5 }
            com.google.android.gms.internal.ads.zzcgp.m45229g(r2)     // Catch:{ NumberFormatException -> 0x01a5 }
            long r2 = java.lang.Math.max(r5, r8)     // Catch:{ NumberFormatException -> 0x01a5 }
            r5 = r2
            goto L_0x01bc
        L_0x01a5:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected Content-Range ["
            r2.append(r3)
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.internal.ads.zzcgp.m45226d(r0)
        L_0x01bc:
            int r0 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x01c4
            long r2 = r1.f28877o
            long r18 = r5 - r2
        L_0x01c4:
            r2 = r18
            r1.f28878p = r2
            goto L_0x01cd
        L_0x01c9:
            long r2 = r7.f35402g
            r1.f28878p = r2
        L_0x01cd:
            java.net.HttpURLConnection r0 = r1.f28873k     // Catch:{ IOException -> 0x01de }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x01de }
            r1.f28874l = r0     // Catch:{ IOException -> 0x01de }
            r2 = 1
            r1.f28875m = r2
            r20.mo45438q(r21)
            long r2 = r1.f28878p
            return r2
        L_0x01de:
            r0 = move-exception
            r20.m45712u()
            com.google.android.gms.internal.ads.zzfq r2 = new com.google.android.gms.internal.ads.zzfq
            r3 = 2000(0x7d0, float:2.803E-42)
            r4 = 1
            r2.<init>((java.io.IOException) r0, (com.google.android.gms.internal.ads.zzfc) r7, (int) r3, (int) r4)
            throw r2
        L_0x01eb:
            java.net.HttpURLConnection r0 = r1.f28873k
            java.util.Map r6 = r0.getHeaderFields()
            r20.m45712u()
            com.google.android.gms.internal.ads.zzfs r0 = new com.google.android.gms.internal.ads.zzfs
            int r3 = r1.f28876n
            r4 = 0
            r5 = 0
            byte[] r8 = com.google.android.gms.internal.ads.zzen.f34505f
            r2 = r0
            r7 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8)
            int r2 = r1.f28876n
            r3 = 416(0x1a0, float:5.83E-43)
            if (r2 != r3) goto L_0x0212
            com.google.android.gms.internal.ads.zzey r2 = new com.google.android.gms.internal.ads.zzey
            r3 = 2008(0x7d8, float:2.814E-42)
            r2.<init>(r3)
            r0.initCause(r2)
        L_0x0212:
            throw r0
        L_0x0213:
            r0 = move-exception
            r4 = r0
            r20.m45712u()
            com.google.android.gms.internal.ads.zzfq r0 = new com.google.android.gms.internal.ads.zzfq
            android.net.Uri r3 = r7.f35396a
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r2.concat(r3)
            r6 = 2000(0x7d0, float:2.803E-42)
            r8 = 1
            r2 = r0
            r5 = r21
            r7 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            throw r0
        L_0x0233:
            r4 = 1
            r16 = 0
            java.lang.String r10 = "Location"
            java.lang.String r10 = r13.getHeaderField(r10)     // Catch:{ IOException -> 0x0291 }
            r13.disconnect()     // Catch:{ IOException -> 0x0291 }
            if (r10 == 0) goto L_0x0272
            java.net.URL r12 = new java.net.URL     // Catch:{ IOException -> 0x0291 }
            r12.<init>(r0, r10)     // Catch:{ IOException -> 0x0291 }
            java.lang.String r0 = r12.getProtocol()     // Catch:{ IOException -> 0x0291 }
            java.lang.String r10 = "https"
            boolean r10 = r10.equals(r0)     // Catch:{ IOException -> 0x0291 }
            if (r10 != 0) goto L_0x026b
            java.lang.String r10 = "http"
            boolean r10 = r10.equals(r0)     // Catch:{ IOException -> 0x0291 }
            if (r10 == 0) goto L_0x025b
            goto L_0x026b
        L_0x025b:
            java.net.ProtocolException r3 = new java.net.ProtocolException     // Catch:{ IOException -> 0x0291 }
            java.lang.String r4 = "Unsupported protocol redirect: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0291 }
            java.lang.String r0 = r4.concat(r0)     // Catch:{ IOException -> 0x0291 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x0291 }
            throw r3     // Catch:{ IOException -> 0x0291 }
        L_0x026b:
            r0 = r12
            r13 = r14
            r3 = r16
            r10 = 1
            goto L_0x0023
        L_0x0272:
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x0291 }
            java.lang.String r3 = "Null location redirect"
            r0.<init>(r3)     // Catch:{ IOException -> 0x0291 }
            throw r0     // Catch:{ IOException -> 0x0291 }
        L_0x027a:
            java.net.NoRouteToHostException r0 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x0291 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0291 }
            r3.<init>()     // Catch:{ IOException -> 0x0291 }
            java.lang.String r4 = "Too many redirects: "
            r3.append(r4)     // Catch:{ IOException -> 0x0291 }
            r3.append(r14)     // Catch:{ IOException -> 0x0291 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0291 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0291 }
            throw r0     // Catch:{ IOException -> 0x0291 }
        L_0x0291:
            r0 = move-exception
            r4 = r0
            com.google.android.gms.internal.ads.zzfq r0 = new com.google.android.gms.internal.ads.zzfq
            android.net.Uri r3 = r7.f35396a
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r2.concat(r3)
            r6 = 2000(0x7d0, float:2.803E-42)
            r8 = 1
            r2 = r0
            r5 = r21
            r7 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzclm.mo43928g(com.google.android.gms.internal.ads.zzfc):long");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo43929t(int i) {
        this.f28881s = i;
        for (Socket socket : this.f28882t) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.f28881s);
                } catch (SocketException e) {
                    zzcgp.m45230h("Failed to update receive buffer size.", e);
                }
            }
        }
    }
}

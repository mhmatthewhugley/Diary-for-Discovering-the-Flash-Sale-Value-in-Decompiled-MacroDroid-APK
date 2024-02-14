package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzakz implements zzajn {

    /* renamed from: a */
    private final Map f24933a = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: b */
    private long f24934b = 0;

    /* renamed from: c */
    private final zzaky f24935c;

    /* renamed from: d */
    private final int f24936d;

    public zzakz(zzaky zzaky, int i) {
        this.f24935c = zzaky;
        this.f24936d = 5242880;
    }

    /* renamed from: a */
    static int m41674a(InputStream inputStream) throws IOException {
        return (m41681j(inputStream) << 24) | m41681j(inputStream) | (m41681j(inputStream) << 8) | (m41681j(inputStream) << 16);
    }

    /* renamed from: b */
    static long m41675b(InputStream inputStream) throws IOException {
        return (((long) m41681j(inputStream)) & 255) | ((((long) m41681j(inputStream)) & 255) << 8) | ((((long) m41681j(inputStream)) & 255) << 16) | ((((long) m41681j(inputStream)) & 255) << 24) | ((((long) m41681j(inputStream)) & 255) << 32) | ((((long) m41681j(inputStream)) & 255) << 40) | ((((long) m41681j(inputStream)) & 255) << 48) | ((255 & ((long) m41681j(inputStream))) << 56);
    }

    /* renamed from: d */
    static String m41676d(zzakx zzakx) throws IOException {
        return new String(m41680i(zzakx, m41675b(zzakx)), "UTF-8");
    }

    /* renamed from: f */
    static void m41677f(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    /* renamed from: g */
    static void m41678g(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) ((int) j));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    /* renamed from: h */
    static void m41679h(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        m41678g(outputStream, (long) length);
        outputStream.write(bytes, 0, length);
    }

    @VisibleForTesting
    /* renamed from: i */
    static byte[] m41680i(zzakx zzakx, long j) throws IOException {
        long b = zzakx.mo41616b();
        if (j >= 0 && j <= b) {
            int i = (int) j;
            if (((long) i) == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(zzakx).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + b);
    }

    /* renamed from: j */
    private static int m41681j(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    /* renamed from: k */
    private final void m41682k(String str, zzakw zzakw) {
        if (!this.f24933a.containsKey(str)) {
            this.f24934b += zzakw.f24923a;
        } else {
            this.f24934b += zzakw.f24923a - ((zzakw) this.f24933a.get(str)).f24923a;
        }
        this.f24933a.put(str, zzakw);
    }

    /* renamed from: l */
    private final void m41683l(String str) {
        zzakw zzakw = (zzakw) this.f24933a.remove(str);
        if (zzakw != null) {
            this.f24934b -= zzakw.f24923a;
        }
    }

    /* renamed from: m */
    private static final String m41684m(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    /* renamed from: c */
    public final File mo41619c(String str) {
        return new File(this.f24935c.zza(), m41684m(str));
    }

    /* renamed from: e */
    public final synchronized void mo41620e(String str) {
        boolean delete = mo41619c(str).delete();
        m41683l(str);
        if (!delete) {
            zzakp.m41660a("Could not delete cache entry for key=%s, filename=%s", str, m41684m(str));
        }
    }

    /* renamed from: o */
    public final synchronized zzajm mo41555o(String str) {
        zzakx zzakx;
        zzakw zzakw = (zzakw) this.f24933a.get(str);
        if (zzakw == null) {
            return null;
        }
        File c = mo41619c(str);
        try {
            zzakx = new zzakx(new BufferedInputStream(new FileInputStream(c)), c.length());
            zzakw a = zzakw.m41672a(zzakx);
            if (!TextUtils.equals(str, a.f24924b)) {
                zzakp.m41660a("%s: key=%s, found=%s", c.getAbsolutePath(), str, a.f24924b);
                m41683l(str);
                zzakx.close();
                return null;
            }
            byte[] i = m41680i(zzakx, zzakx.mo41616b());
            zzajm zzajm = new zzajm();
            zzajm.f24835a = i;
            zzajm.f24836b = zzakw.f24925c;
            zzajm.f24837c = zzakw.f24926d;
            zzajm.f24838d = zzakw.f24927e;
            zzajm.f24839e = zzakw.f24928f;
            zzajm.f24840f = zzakw.f24929g;
            List<zzajv> list = zzakw.f24930h;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (zzajv zzajv : list) {
                treeMap.put(zzajv.mo41569a(), zzajv.mo41570b());
            }
            zzajm.f24841g = treeMap;
            zzajm.f24842h = Collections.unmodifiableList(zzakw.f24930h);
            zzakx.close();
            return zzajm;
        } catch (IOException e) {
            zzakp.m41660a("%s: %s", c.getAbsolutePath(), e.toString());
            mo41620e(str);
            return null;
        } catch (Throwable th) {
            zzakx.close();
            throw th;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x016e */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo41556p(java.lang.String r16, com.google.android.gms.internal.ads.zzajm r17) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r2 = r17
            monitor-enter(r15)
            long r3 = r1.f24934b     // Catch:{ all -> 0x01a4 }
            byte[] r5 = r2.f24835a     // Catch:{ all -> 0x01a4 }
            int r5 = r5.length     // Catch:{ all -> 0x01a4 }
            int r6 = r1.f24936d     // Catch:{ all -> 0x01a4 }
            long r7 = (long) r5
            long r3 = r3 + r7
            long r7 = (long) r6
            r9 = 1063675494(0x3f666666, float:0.9)
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 <= 0) goto L_0x0022
            float r3 = (float) r5
            float r4 = (float) r6
            float r4 = r4 * r9
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            monitor-exit(r15)
            return
        L_0x0022:
            java.io.File r3 = r15.mo41619c(r16)     // Catch:{ all -> 0x01a4 }
            r4 = 1
            r5 = 0
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x016e }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x016e }
            r7.<init>(r3)     // Catch:{ IOException -> 0x016e }
            r6.<init>(r7)     // Catch:{ IOException -> 0x016e }
            com.google.android.gms.internal.ads.zzakw r7 = new com.google.android.gms.internal.ads.zzakw     // Catch:{ IOException -> 0x016e }
            r7.<init>(r0, r2)     // Catch:{ IOException -> 0x016e }
            r8 = 538247942(0x20150306, float:1.2621791E-19)
            m41677f(r6, r8)     // Catch:{ IOException -> 0x014a }
            java.lang.String r8 = r7.f24924b     // Catch:{ IOException -> 0x014a }
            m41679h(r6, r8)     // Catch:{ IOException -> 0x014a }
            java.lang.String r8 = r7.f24925c     // Catch:{ IOException -> 0x014a }
            if (r8 != 0) goto L_0x0048
            java.lang.String r8 = ""
        L_0x0048:
            m41679h(r6, r8)     // Catch:{ IOException -> 0x014a }
            long r10 = r7.f24926d     // Catch:{ IOException -> 0x014a }
            m41678g(r6, r10)     // Catch:{ IOException -> 0x014a }
            long r10 = r7.f24927e     // Catch:{ IOException -> 0x014a }
            m41678g(r6, r10)     // Catch:{ IOException -> 0x014a }
            long r10 = r7.f24928f     // Catch:{ IOException -> 0x014a }
            m41678g(r6, r10)     // Catch:{ IOException -> 0x014a }
            long r10 = r7.f24929g     // Catch:{ IOException -> 0x014a }
            m41678g(r6, r10)     // Catch:{ IOException -> 0x014a }
            java.util.List r8 = r7.f24930h     // Catch:{ IOException -> 0x014a }
            if (r8 == 0) goto L_0x0089
            int r10 = r8.size()     // Catch:{ IOException -> 0x014a }
            m41677f(r6, r10)     // Catch:{ IOException -> 0x014a }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ IOException -> 0x014a }
        L_0x006e:
            boolean r10 = r8.hasNext()     // Catch:{ IOException -> 0x014a }
            if (r10 == 0) goto L_0x008c
            java.lang.Object r10 = r8.next()     // Catch:{ IOException -> 0x014a }
            com.google.android.gms.internal.ads.zzajv r10 = (com.google.android.gms.internal.ads.zzajv) r10     // Catch:{ IOException -> 0x014a }
            java.lang.String r11 = r10.mo41569a()     // Catch:{ IOException -> 0x014a }
            m41679h(r6, r11)     // Catch:{ IOException -> 0x014a }
            java.lang.String r10 = r10.mo41570b()     // Catch:{ IOException -> 0x014a }
            m41679h(r6, r10)     // Catch:{ IOException -> 0x014a }
            goto L_0x006e
        L_0x0089:
            m41677f(r6, r5)     // Catch:{ IOException -> 0x014a }
        L_0x008c:
            r6.flush()     // Catch:{ IOException -> 0x014a }
            byte[] r2 = r2.f24835a     // Catch:{ IOException -> 0x016e }
            r6.write(r2)     // Catch:{ IOException -> 0x016e }
            r6.close()     // Catch:{ IOException -> 0x016e }
            long r10 = r3.length()     // Catch:{ IOException -> 0x016e }
            r7.f24923a = r10     // Catch:{ IOException -> 0x016e }
            r15.m41682k(r0, r7)     // Catch:{ IOException -> 0x016e }
            long r6 = r1.f24934b     // Catch:{ IOException -> 0x016e }
            int r0 = r1.f24936d     // Catch:{ IOException -> 0x016e }
            long r10 = (long) r0     // Catch:{ IOException -> 0x016e }
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ab
            goto L_0x01a2
        L_0x00ab:
            boolean r0 = com.google.android.gms.internal.ads.zzakp.f24909b     // Catch:{ IOException -> 0x016e }
            if (r0 == 0) goto L_0x00b6
            java.lang.String r0 = "Pruning old cache entries."
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x016e }
            com.google.android.gms.internal.ads.zzakp.m41663d(r0, r2)     // Catch:{ IOException -> 0x016e }
        L_0x00b6:
            long r6 = r1.f24934b     // Catch:{ IOException -> 0x016e }
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x016e }
            java.util.Map r0 = r1.f24933a     // Catch:{ IOException -> 0x016e }
            java.util.Set r0 = r0.entrySet()     // Catch:{ IOException -> 0x016e }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x016e }
            r2 = 0
        L_0x00c7:
            boolean r8 = r0.hasNext()     // Catch:{ IOException -> 0x016e }
            r12 = 2
            if (r8 == 0) goto L_0x011e
            java.lang.Object r8 = r0.next()     // Catch:{ IOException -> 0x016e }
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch:{ IOException -> 0x016e }
            java.lang.Object r8 = r8.getValue()     // Catch:{ IOException -> 0x016e }
            com.google.android.gms.internal.ads.zzakw r8 = (com.google.android.gms.internal.ads.zzakw) r8     // Catch:{ IOException -> 0x016e }
            java.lang.String r13 = r8.f24924b     // Catch:{ IOException -> 0x016e }
            java.io.File r13 = r15.mo41619c(r13)     // Catch:{ IOException -> 0x016e }
            boolean r13 = r13.delete()     // Catch:{ IOException -> 0x016e }
            if (r13 == 0) goto L_0x00f0
            long r13 = r1.f24934b     // Catch:{ IOException -> 0x016e }
            r16 = r10
            long r9 = r8.f24923a     // Catch:{ IOException -> 0x016e }
            long r13 = r13 - r9
            r1.f24934b = r13     // Catch:{ IOException -> 0x016e }
            goto L_0x0103
        L_0x00f0:
            r16 = r10
            java.lang.String r9 = "Could not delete cache entry for key=%s, filename=%s"
            java.lang.Object[] r10 = new java.lang.Object[r12]     // Catch:{ IOException -> 0x016e }
            java.lang.String r8 = r8.f24924b     // Catch:{ IOException -> 0x016e }
            r10[r5] = r8     // Catch:{ IOException -> 0x016e }
            java.lang.String r8 = m41684m(r8)     // Catch:{ IOException -> 0x016e }
            r10[r4] = r8     // Catch:{ IOException -> 0x016e }
            com.google.android.gms.internal.ads.zzakp.m41660a(r9, r10)     // Catch:{ IOException -> 0x016e }
        L_0x0103:
            r0.remove()     // Catch:{ IOException -> 0x016e }
            int r2 = r2 + 1
            long r8 = r1.f24934b     // Catch:{ IOException -> 0x016e }
            float r8 = (float) r8     // Catch:{ IOException -> 0x016e }
            int r9 = r1.f24936d     // Catch:{ IOException -> 0x016e }
            float r9 = (float) r9     // Catch:{ IOException -> 0x016e }
            r10 = 1063675494(0x3f666666, float:0.9)
            float r9 = r9 * r10
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x0118
            goto L_0x0120
        L_0x0118:
            r10 = r16
            r9 = 1063675494(0x3f666666, float:0.9)
            goto L_0x00c7
        L_0x011e:
            r16 = r10
        L_0x0120:
            boolean r0 = com.google.android.gms.internal.ads.zzakp.f24909b     // Catch:{ IOException -> 0x016e }
            if (r0 == 0) goto L_0x01a2
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IOException -> 0x016e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x016e }
            r0[r5] = r2     // Catch:{ IOException -> 0x016e }
            long r8 = r1.f24934b     // Catch:{ IOException -> 0x016e }
            long r8 = r8 - r6
            java.lang.Long r2 = java.lang.Long.valueOf(r8)     // Catch:{ IOException -> 0x016e }
            r0[r4] = r2     // Catch:{ IOException -> 0x016e }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x016e }
            r8 = r16
            long r6 = r6 - r8
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ IOException -> 0x016e }
            r0[r12] = r2     // Catch:{ IOException -> 0x016e }
            java.lang.String r2 = "pruned %d files, %d bytes, %d ms"
            com.google.android.gms.internal.ads.zzakp.m41663d(r2, r0)     // Catch:{ IOException -> 0x016e }
            monitor-exit(r15)
            return
        L_0x014a:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x016e }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x016e }
            r2[r5] = r0     // Catch:{ IOException -> 0x016e }
            java.lang.String r0 = "%s"
            com.google.android.gms.internal.ads.zzakp.m41660a(r0, r2)     // Catch:{ IOException -> 0x016e }
            r6.close()     // Catch:{ IOException -> 0x016e }
            java.lang.String r0 = "Failed to write header for %s"
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x016e }
            java.lang.String r6 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x016e }
            r2[r5] = r6     // Catch:{ IOException -> 0x016e }
            com.google.android.gms.internal.ads.zzakp.m41660a(r0, r2)     // Catch:{ IOException -> 0x016e }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x016e }
            r0.<init>()     // Catch:{ IOException -> 0x016e }
            throw r0     // Catch:{ IOException -> 0x016e }
        L_0x016e:
            boolean r0 = r3.delete()     // Catch:{ all -> 0x01a4 }
            if (r0 != 0) goto L_0x0181
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x01a4 }
            java.lang.String r2 = r3.getAbsolutePath()     // Catch:{ all -> 0x01a4 }
            r0[r5] = r2     // Catch:{ all -> 0x01a4 }
            java.lang.String r2 = "Could not clean up file %s"
            com.google.android.gms.internal.ads.zzakp.m41660a(r2, r0)     // Catch:{ all -> 0x01a4 }
        L_0x0181:
            com.google.android.gms.internal.ads.zzaky r0 = r1.f24935c     // Catch:{ all -> 0x01a4 }
            java.io.File r0 = r0.zza()     // Catch:{ all -> 0x01a4 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x01a4 }
            if (r0 != 0) goto L_0x01a2
            java.lang.String r0 = "Re-initializing cache after external clearing."
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x01a4 }
            com.google.android.gms.internal.ads.zzakp.m41660a(r0, r2)     // Catch:{ all -> 0x01a4 }
            java.util.Map r0 = r1.f24933a     // Catch:{ all -> 0x01a4 }
            r0.clear()     // Catch:{ all -> 0x01a4 }
            r2 = 0
            r1.f24934b = r2     // Catch:{ all -> 0x01a4 }
            r15.zzb()     // Catch:{ all -> 0x01a4 }
            monitor-exit(r15)
            return
        L_0x01a2:
            monitor-exit(r15)
            return
        L_0x01a4:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakz.mo41556p(java.lang.String, com.google.android.gms.internal.ads.zzajm):void");
    }

    /* renamed from: q */
    public final synchronized void mo41557q(String str, boolean z) {
        zzajm o = mo41555o(str);
        if (o != null) {
            o.f24840f = 0;
            o.f24839e = 0;
            mo41556p(str, o);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x005a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzb() {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzaky r0 = r9.f24935c     // Catch:{ all -> 0x0062 }
            java.io.File r0 = r0.zza()     // Catch:{ all -> 0x0062 }
            boolean r1 = r0.exists()     // Catch:{ all -> 0x0062 }
            r2 = 0
            if (r1 != 0) goto L_0x0026
            boolean r1 = r0.mkdirs()     // Catch:{ all -> 0x0062 }
            if (r1 != 0) goto L_0x0024
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x0062 }
            r1[r2] = r0     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = "Unable to create cache dir %s"
            com.google.android.gms.internal.ads.zzakp.m41661b(r0, r1)     // Catch:{ all -> 0x0062 }
            monitor-exit(r9)
            return
        L_0x0024:
            monitor-exit(r9)
            return
        L_0x0026:
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x0062 }
            if (r0 != 0) goto L_0x002e
            monitor-exit(r9)
            return
        L_0x002e:
            int r1 = r0.length     // Catch:{ all -> 0x0062 }
        L_0x002f:
            if (r2 >= r1) goto L_0x0060
            r3 = r0[r2]     // Catch:{ all -> 0x0062 }
            long r4 = r3.length()     // Catch:{ IOException -> 0x005a }
            com.google.android.gms.internal.ads.zzakx r6 = new com.google.android.gms.internal.ads.zzakx     // Catch:{ IOException -> 0x005a }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x005a }
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ IOException -> 0x005a }
            r8.<init>(r3)     // Catch:{ IOException -> 0x005a }
            r7.<init>(r8)     // Catch:{ IOException -> 0x005a }
            r6.<init>(r7, r4)     // Catch:{ IOException -> 0x005a }
            com.google.android.gms.internal.ads.zzakw r7 = com.google.android.gms.internal.ads.zzakw.m41672a(r6)     // Catch:{ all -> 0x0055 }
            r7.f24923a = r4     // Catch:{ all -> 0x0055 }
            java.lang.String r4 = r7.f24924b     // Catch:{ all -> 0x0055 }
            r9.m41682k(r4, r7)     // Catch:{ all -> 0x0055 }
            r6.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x005d
        L_0x0055:
            r4 = move-exception
            r6.close()     // Catch:{ IOException -> 0x005a }
            throw r4     // Catch:{ IOException -> 0x005a }
        L_0x005a:
            r3.delete()     // Catch:{ all -> 0x0062 }
        L_0x005d:
            int r2 = r2 + 1
            goto L_0x002f
        L_0x0060:
            monitor-exit(r9)
            return
        L_0x0062:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakz.zzb():void");
    }

    public zzakz(File file, int i) {
        this.f24935c = new zzakv(this, file);
        this.f24936d = 20971520;
    }
}

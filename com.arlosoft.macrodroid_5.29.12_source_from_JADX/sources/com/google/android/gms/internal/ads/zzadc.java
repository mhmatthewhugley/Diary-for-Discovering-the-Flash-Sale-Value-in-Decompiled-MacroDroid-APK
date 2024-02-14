package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Locale;
import org.apache.http.protocol.HTTP;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzadc {

    /* renamed from: a */
    public static final zzada f23987a = zzacz.f23954a;

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00af A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b0  */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.google.android.gms.internal.ads.zzbq m41114a(byte[] r11, int r12, com.google.android.gms.internal.ads.zzada r13, com.google.android.gms.internal.ads.zzacd r14) {
        /*
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            com.google.android.gms.internal.ads.zzef r0 = new com.google.android.gms.internal.ads.zzef
            r0.<init>(r11, r12)
            int r11 = r0.mo45233i()
            r12 = 2
            r1 = 10
            r2 = 4
            r3 = 0
            r4 = 1
            java.lang.String r5 = "Id3Decoder"
            r6 = 0
            if (r11 >= r1) goto L_0x0021
            java.lang.String r11 = "Data too short to be an ID3 tag"
            com.google.android.gms.internal.ads.zzdw.m48255e(r5, r11)
        L_0x001e:
            r9 = r6
            goto L_0x00ad
        L_0x0021:
            int r11 = r0.mo45245u()
            r7 = 4801587(0x494433, float:6.728456E-39)
            if (r11 == r7) goto L_0x0046
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r7[r3] = r11
            java.lang.String r11 = "%06X"
            java.lang.String r11 = java.lang.String.format(r11, r7)
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r7 = "Unexpected first three bytes of ID3 tag header: 0x"
            java.lang.String r11 = r7.concat(r11)
            com.google.android.gms.internal.ads.zzdw.m48255e(r5, r11)
            goto L_0x001e
        L_0x0046:
            int r11 = r0.mo45243s()
            r0.mo45231g(r4)
            int r7 = r0.mo45243s()
            int r8 = r0.mo45242r()
            if (r11 != r12) goto L_0x0061
            r9 = r7 & 64
            if (r9 == 0) goto L_0x0088
            java.lang.String r11 = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme"
            com.google.android.gms.internal.ads.zzdw.m48255e(r5, r11)
            goto L_0x001e
        L_0x0061:
            r9 = 3
            if (r11 != r9) goto L_0x0072
            r9 = r7 & 64
            if (r9 == 0) goto L_0x0088
            int r9 = r0.mo45237m()
            r0.mo45231g(r9)
            int r9 = r9 + r2
            int r8 = r8 - r9
            goto L_0x0088
        L_0x0072:
            if (r11 != r2) goto L_0x0097
            r9 = r7 & 64
            if (r9 == 0) goto L_0x0082
            int r9 = r0.mo45242r()
            int r10 = r9 + -4
            r0.mo45231g(r10)
            int r8 = r8 - r9
        L_0x0082:
            r9 = r7 & 16
            if (r9 == 0) goto L_0x0088
            int r8 = r8 + -10
        L_0x0088:
            if (r11 >= r2) goto L_0x0090
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0090
            r7 = 1
            goto L_0x0091
        L_0x0090:
            r7 = 0
        L_0x0091:
            com.google.android.gms.internal.ads.zzadb r9 = new com.google.android.gms.internal.ads.zzadb
            r9.<init>(r11, r7, r8)
            goto L_0x00ad
        L_0x0097:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Skipped ID3 tag with unsupported majorVersion="
            r7.append(r8)
            r7.append(r11)
            java.lang.String r11 = r7.toString()
            com.google.android.gms.internal.ads.zzdw.m48255e(r5, r11)
            goto L_0x001e
        L_0x00ad:
            if (r9 != 0) goto L_0x00b0
            return r6
        L_0x00b0:
            int r11 = r0.mo45235k()
            int r7 = r9.f23984a
            if (r7 != r12) goto L_0x00bb
            r1 = 6
        L_0x00bb:
            int r12 = r9.f23986c
            boolean r7 = r9.f23985b
            if (r7 == 0) goto L_0x00cd
            int r12 = r9.f23986c
            int r12 = m41118e(r0, r12)
        L_0x00cd:
            int r11 = r11 + r12
            r0.mo45229e(r11)
            int r11 = r9.f23984a
            boolean r11 = m41123j(r0, r11, r1, r3)
            if (r11 != 0) goto L_0x0102
            int r11 = r9.f23984a
            if (r11 != r2) goto L_0x00e9
            boolean r11 = m41123j(r0, r2, r1, r4)
            if (r11 == 0) goto L_0x00e9
            r3 = 1
            goto L_0x0102
        L_0x00e9:
            int r11 = r9.f23984a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Failed to validate ID3 tag with majorVersion="
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            com.google.android.gms.internal.ads.zzdw.m48255e(r5, r11)
            return r6
        L_0x0102:
            int r11 = r0.mo45233i()
            if (r11 < r1) goto L_0x0116
            int r11 = r9.f23984a
            com.google.android.gms.internal.ads.zzadd r11 = m41119f(r11, r0, r3, r1, r13)
            if (r11 == 0) goto L_0x0102
            r14.add(r11)
            goto L_0x0102
        L_0x0116:
            com.google.android.gms.internal.ads.zzbq r11 = new com.google.android.gms.internal.ads.zzbq
            r11.<init>((java.util.List) r14)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadc.m41114a(byte[], int, com.google.android.gms.internal.ads.zzada, com.google.android.gms.internal.ads.zzacd):com.google.android.gms.internal.ads.zzbq");
    }

    /* renamed from: b */
    private static int m41115b(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* renamed from: c */
    private static int m41116c(byte[] bArr, int i, int i2) {
        int d = m41117d(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return d;
        }
        while (true) {
            int length = bArr.length;
            if (d >= length - 1) {
                return length;
            }
            if ((d - i) % 2 == 0 && bArr[d + 1] == 0) {
                return d;
            }
            d = m41117d(bArr, d + 1);
        }
    }

    /* renamed from: d */
    private static int m41117d(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    /* renamed from: e */
    private static int m41118e(zzef zzef, int i) {
        byte[] h = zzef.mo45232h();
        int k = zzef.mo45235k();
        int i2 = k;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= k + i) {
                return i;
            }
            if ((h[i2] & 255) == 255 && h[i3] == 0) {
                System.arraycopy(h, i2 + 2, h, i3, (i - (i2 - k)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARNING: type inference failed for: r3v17, types: [com.google.android.gms.internal.ads.zzacw] */
    /* JADX WARNING: type inference failed for: r3v20, types: [com.google.android.gms.internal.ads.zzaco] */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0273, code lost:
        if (r9 == 67) goto L_0x0275;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x052f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0530, code lost:
        r14 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0533, code lost:
        r2 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x053e, code lost:
        r14 = r21;
        r2 = r22;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:121:0x0220, B:149:0x02d2] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0353 A[Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x03c6 A[Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x050a  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x052f A[ExcHandler: all (th java.lang.Throwable), PHI: r21 
      PHI: (r21v1 int) = (r21v2 int), (r21v2 int), (r21v2 int), (r21v5 int), (r21v8 int) binds: [B:229:0x050c, B:232:0x052b, B:233:?, B:149:0x02d2, B:121:0x0220] A[DONT_GENERATE, DONT_INLINE], Splitter:B:121:0x0220] */
    @androidx.annotation.Nullable
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.ads.zzadd m41119f(int r34, com.google.android.gms.internal.ads.zzef r35, boolean r36, int r37, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzada r38) {
        /*
            r0 = r34
            r1 = r35
            r2 = r36
            r3 = r37
            int r4 = r35.mo45243s()
            int r5 = r35.mo45243s()
            int r6 = r35.mo45243s()
            r7 = 3
            if (r0 < r7) goto L_0x001c
            int r9 = r35.mo45243s()
            goto L_0x001d
        L_0x001c:
            r9 = 0
        L_0x001d:
            r10 = 4
            if (r0 != r10) goto L_0x003c
            int r11 = r35.mo45246v()
            if (r2 != 0) goto L_0x0047
            r12 = r11 & 255(0xff, float:3.57E-43)
            int r13 = r11 >> 8
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 7
            r12 = r12 | r13
            int r13 = r11 >> 16
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 14
            r12 = r12 | r13
            int r11 = r11 >> 24
            int r11 = r11 << 21
            r11 = r11 | r12
            goto L_0x0047
        L_0x003c:
            if (r0 != r7) goto L_0x0043
            int r11 = r35.mo45246v()
            goto L_0x0047
        L_0x0043:
            int r11 = r35.mo45245u()
        L_0x0047:
            if (r0 < r7) goto L_0x004e
            int r12 = r35.mo45247w()
            goto L_0x004f
        L_0x004e:
            r12 = 0
        L_0x004f:
            r13 = 0
            if (r4 != 0) goto L_0x0065
            if (r5 != 0) goto L_0x0065
            if (r6 != 0) goto L_0x0065
            if (r9 != 0) goto L_0x0065
            if (r11 != 0) goto L_0x0065
            if (r12 == 0) goto L_0x005d
            goto L_0x0065
        L_0x005d:
            int r0 = r35.mo45236l()
            r1.mo45230f(r0)
            return r13
        L_0x0065:
            int r14 = r35.mo45235k()
            int r14 = r14 + r11
            int r15 = r35.mo45236l()
            java.lang.String r8 = "Id3Decoder"
            if (r14 <= r15) goto L_0x007f
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            com.google.android.gms.internal.ads.zzdw.m48255e(r8, r0)
            int r0 = r35.mo45236l()
            r1.mo45230f(r0)
            return r13
        L_0x007f:
            if (r38 != 0) goto L_0x055b
            r15 = 1
            if (r0 != r7) goto L_0x00a2
            r7 = r12 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x008a
            r7 = 1
            goto L_0x008b
        L_0x008a:
            r7 = 0
        L_0x008b:
            r17 = r12 & 64
            if (r17 == 0) goto L_0x0092
            r17 = 1
            goto L_0x0094
        L_0x0092:
            r17 = 0
        L_0x0094:
            r12 = r12 & 32
            if (r12 == 0) goto L_0x009a
            r12 = 1
            goto L_0x009b
        L_0x009a:
            r12 = 0
        L_0x009b:
            r18 = r17
            r19 = 0
            r17 = r7
            goto L_0x00d5
        L_0x00a2:
            if (r0 != r10) goto L_0x00cd
            r7 = r12 & 64
            if (r7 == 0) goto L_0x00aa
            r7 = 1
            goto L_0x00ab
        L_0x00aa:
            r7 = 0
        L_0x00ab:
            r17 = r12 & 8
            if (r17 == 0) goto L_0x00b2
            r17 = 1
            goto L_0x00b4
        L_0x00b2:
            r17 = 0
        L_0x00b4:
            r18 = r12 & 4
            if (r18 == 0) goto L_0x00bb
            r18 = 1
            goto L_0x00bd
        L_0x00bb:
            r18 = 0
        L_0x00bd:
            r19 = r12 & 2
            if (r19 == 0) goto L_0x00c4
            r19 = 1
            goto L_0x00c6
        L_0x00c4:
            r19 = 0
        L_0x00c6:
            r12 = r12 & r15
            r33 = r12
            r12 = r7
            r7 = r33
            goto L_0x00d5
        L_0x00cd:
            r7 = 0
            r12 = 0
            r17 = 0
            r18 = 0
            r19 = 0
        L_0x00d5:
            if (r17 != 0) goto L_0x0550
            if (r18 == 0) goto L_0x00db
            goto L_0x0550
        L_0x00db:
            if (r12 == 0) goto L_0x00e2
            int r11 = r11 + -1
            r1.mo45231g(r15)
        L_0x00e2:
            if (r7 == 0) goto L_0x00e9
            int r11 = r11 + -4
            r1.mo45231g(r10)
        L_0x00e9:
            if (r19 == 0) goto L_0x00ef
            int r11 = m41118e(r1, r11)
        L_0x00ef:
            r7 = 84
            r12 = 88
            r10 = 2
            if (r4 != r7) goto L_0x012f
            if (r5 != r12) goto L_0x012f
            if (r6 != r12) goto L_0x012f
            if (r0 == r10) goto L_0x00fe
            if (r9 != r12) goto L_0x012f
        L_0x00fe:
            if (r11 > 0) goto L_0x0101
            goto L_0x0137
        L_0x0101:
            int r2 = r35.mo45243s()     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            java.lang.String r3 = m41121h(r2)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            int r7 = r11 + -1
            byte[] r10 = new byte[r7]     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            r12 = 0
            r1.mo45226b(r10, r12, r7)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            int r7 = m41116c(r10, r12, r2)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            java.lang.String r15 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            r15.<init>(r10, r12, r7, r3)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            int r12 = m41115b(r2)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            int r7 = r7 + r12
            int r2 = m41116c(r10, r7, r2)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            java.lang.String r2 = m41120g(r10, r7, r2, r3)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            com.google.android.gms.internal.ads.zzadl r3 = new com.google.android.gms.internal.ads.zzadl     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            java.lang.String r7 = "TXXX"
            r3.<init>(r7, r15, r2)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            goto L_0x0160
        L_0x012f:
            if (r4 != r7) goto L_0x0168
            java.lang.String r2 = m41122i(r0, r7, r5, r6, r9)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            if (r11 > 0) goto L_0x0142
        L_0x0137:
            r23 = r4
            r3 = r5
            r4 = r6
            r22 = r8
            r8 = r9
            r21 = r14
            goto L_0x0508
        L_0x0142:
            int r3 = r35.mo45243s()     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            java.lang.String r7 = m41121h(r3)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            int r10 = r11 + -1
            byte[] r12 = new byte[r10]     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            r15 = 0
            r1.mo45226b(r12, r15, r10)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            int r3 = m41116c(r12, r15, r3)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            java.lang.String r10 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            r10.<init>(r12, r15, r3, r7)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            com.google.android.gms.internal.ads.zzadl r3 = new com.google.android.gms.internal.ads.zzadl     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            r3.<init>(r2, r13, r10)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
        L_0x0160:
            r13 = r3
            goto L_0x0137
        L_0x0162:
            r0 = move-exception
            goto L_0x054c
        L_0x0165:
            r2 = r8
            goto L_0x0542
        L_0x0168:
            r7 = 87
            java.lang.String r15 = "ISO-8859-1"
            if (r4 != r7) goto L_0x01aa
            if (r5 != r12) goto L_0x01a7
            if (r6 != r12) goto L_0x01a7
            if (r0 == r10) goto L_0x0176
            if (r9 != r12) goto L_0x01a7
        L_0x0176:
            if (r11 > 0) goto L_0x0179
            goto L_0x0137
        L_0x0179:
            int r2 = r35.mo45243s()     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            java.lang.String r3 = m41121h(r2)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            int r7 = r11 + -1
            byte[] r10 = new byte[r7]     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            r12 = 0
            r1.mo45226b(r10, r12, r7)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            int r7 = m41116c(r10, r12, r2)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            java.lang.String r13 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            r13.<init>(r10, r12, r7, r3)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            int r2 = m41115b(r2)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            int r7 = r7 + r2
            int r2 = m41117d(r10, r7)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            java.lang.String r2 = m41120g(r10, r7, r2, r15)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            com.google.android.gms.internal.ads.zzadn r3 = new com.google.android.gms.internal.ads.zzadn     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            java.lang.String r7 = "WXXX"
            r3.<init>(r7, r13, r2)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            goto L_0x0160
        L_0x01a7:
            r12 = 87
            goto L_0x01ab
        L_0x01aa:
            r12 = r4
        L_0x01ab:
            if (r12 != r7) goto L_0x01c7
            java.lang.String r2 = m41122i(r0, r7, r5, r6, r9)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            byte[] r3 = new byte[r11]     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            r7 = 0
            r1.mo45226b(r3, r7, r11)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            int r10 = m41117d(r3, r7)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            java.lang.String r12 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            r12.<init>(r3, r7, r10, r15)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            com.google.android.gms.internal.ads.zzadn r3 = new com.google.android.gms.internal.ads.zzadn     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            r7 = 0
            r3.<init>(r2, r7, r12)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            goto L_0x0160
        L_0x01c7:
            r7 = 73
            r13 = 80
            if (r12 != r13) goto L_0x01f5
            r12 = 82
            if (r5 != r12) goto L_0x01f3
            if (r6 != r7) goto L_0x01f3
            r12 = 86
            if (r9 != r12) goto L_0x01f3
            byte[] r2 = new byte[r11]     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            r3 = 0
            r1.mo45226b(r2, r3, r11)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            int r7 = m41117d(r2, r3)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            java.lang.String r10 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            r10.<init>(r2, r3, r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            r3 = 1
            int r7 = r7 + r3
            byte[] r2 = m41124k(r2, r7, r11)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            com.google.android.gms.internal.ads.zzadj r3 = new com.google.android.gms.internal.ads.zzadj     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            r3.<init>(r10, r2)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            goto L_0x0160
        L_0x01f3:
            r12 = 80
        L_0x01f5:
            r7 = 79
            r13 = 71
            if (r12 != r13) goto L_0x0256
            r12 = 69
            if (r5 != r12) goto L_0x0251
            if (r6 != r7) goto L_0x0251
            r12 = 66
            if (r9 == r12) goto L_0x0207
            if (r0 != r10) goto L_0x0251
        L_0x0207:
            int r2 = r35.mo45243s()     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            java.lang.String r3 = m41121h(r2)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            int r7 = r11 + -1
            byte[] r10 = new byte[r7]     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            r12 = 0
            r1.mo45226b(r10, r12, r7)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            int r13 = m41117d(r10, r12)     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            java.lang.String r12 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0165 }
            r21 = r14
            r14 = 0
            r12.<init>(r10, r14, r13, r15)     // Catch:{ UnsupportedEncodingException -> 0x02ea, all -> 0x052f }
            r14 = 1
            int r13 = r13 + r14
            int r14 = m41116c(r10, r13, r2)     // Catch:{ UnsupportedEncodingException -> 0x02ea, all -> 0x052f }
            java.lang.String r13 = m41120g(r10, r13, r14, r3)     // Catch:{ UnsupportedEncodingException -> 0x02ea, all -> 0x052f }
            int r15 = m41115b(r2)     // Catch:{ UnsupportedEncodingException -> 0x02ea, all -> 0x052f }
            int r14 = r14 + r15
            int r15 = m41116c(r10, r14, r2)     // Catch:{ UnsupportedEncodingException -> 0x02ea, all -> 0x052f }
            java.lang.String r3 = m41120g(r10, r14, r15, r3)     // Catch:{ UnsupportedEncodingException -> 0x02ea, all -> 0x052f }
            int r2 = m41115b(r2)     // Catch:{ UnsupportedEncodingException -> 0x02ea, all -> 0x052f }
            int r15 = r15 + r2
            byte[] r2 = m41124k(r10, r15, r7)     // Catch:{ UnsupportedEncodingException -> 0x02ea, all -> 0x052f }
            com.google.android.gms.internal.ads.zzacy r7 = new com.google.android.gms.internal.ads.zzacy     // Catch:{ UnsupportedEncodingException -> 0x02ea, all -> 0x052f }
            r7.<init>(r12, r13, r3, r2)     // Catch:{ UnsupportedEncodingException -> 0x02ea, all -> 0x052f }
            r23 = r4
            r3 = r5
            r4 = r6
            r13 = r7
            r22 = r8
            goto L_0x0342
        L_0x0251:
            r21 = r14
            r12 = 71
            goto L_0x0258
        L_0x0256:
            r21 = r14
        L_0x0258:
            r13 = 67
            if (r0 != r10) goto L_0x0267
            r14 = 80
            if (r12 != r14) goto L_0x02ed
            r7 = 73
            if (r5 != r7) goto L_0x02ed
            if (r6 != r13) goto L_0x02ed
            goto L_0x0275
        L_0x0267:
            r7 = 73
            r14 = 80
            r10 = 65
            if (r12 != r10) goto L_0x02ed
            if (r5 != r14) goto L_0x02ed
            if (r6 != r7) goto L_0x02ed
            if (r9 != r13) goto L_0x02ed
        L_0x0275:
            int r2 = r35.mo45243s()     // Catch:{ UnsupportedEncodingException -> 0x02ea, all -> 0x052f }
            java.lang.String r3 = m41121h(r2)     // Catch:{ UnsupportedEncodingException -> 0x02ea, all -> 0x052f }
            int r7 = r11 + -1
            byte[] r10 = new byte[r7]     // Catch:{ UnsupportedEncodingException -> 0x02ea, all -> 0x052f }
            r12 = 0
            r1.mo45226b(r10, r12, r7)     // Catch:{ UnsupportedEncodingException -> 0x02ea, all -> 0x052f }
            r13 = 2
            if (r0 != r13) goto L_0x02a8
            java.lang.String r13 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x02ea, all -> 0x052f }
            r14 = 3
            r13.<init>(r10, r12, r14, r15)     // Catch:{ UnsupportedEncodingException -> 0x02ea, all -> 0x052f }
            java.lang.String r12 = "image/"
            java.lang.String r13 = com.google.android.gms.internal.ads.zzfse.m50915a(r13)     // Catch:{ UnsupportedEncodingException -> 0x02ea, all -> 0x052f }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ UnsupportedEncodingException -> 0x02ea, all -> 0x052f }
            java.lang.String r12 = r12.concat(r13)     // Catch:{ UnsupportedEncodingException -> 0x02ea, all -> 0x052f }
            java.lang.String r13 = "image/jpg"
            boolean r13 = r13.equals(r12)     // Catch:{ UnsupportedEncodingException -> 0x02ea, all -> 0x052f }
            if (r13 == 0) goto L_0x02a6
            java.lang.String r12 = "image/jpeg"
        L_0x02a6:
            r13 = 2
            goto L_0x02c4
        L_0x02a8:
            int r13 = m41117d(r10, r12)     // Catch:{ UnsupportedEncodingException -> 0x02ea, all -> 0x052f }
            java.lang.String r14 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x02ea, all -> 0x052f }
            r14.<init>(r10, r12, r13, r15)     // Catch:{ UnsupportedEncodingException -> 0x02ea, all -> 0x052f }
            java.lang.String r12 = com.google.android.gms.internal.ads.zzfse.m50915a(r14)     // Catch:{ UnsupportedEncodingException -> 0x02ea, all -> 0x052f }
            r14 = 47
            int r14 = r12.indexOf(r14)     // Catch:{ UnsupportedEncodingException -> 0x02ea, all -> 0x052f }
            r15 = -1
            if (r14 != r15) goto L_0x02c4
            java.lang.String r14 = "image/"
            java.lang.String r12 = r14.concat(r12)     // Catch:{ UnsupportedEncodingException -> 0x02ea, all -> 0x052f }
        L_0x02c4:
            int r14 = r13 + 1
            byte r14 = r10[r14]     // Catch:{ UnsupportedEncodingException -> 0x02ea, all -> 0x052f }
            r14 = r14 & 255(0xff, float:3.57E-43)
            r15 = 2
            int r13 = r13 + r15
            int r15 = m41116c(r10, r13, r2)     // Catch:{ UnsupportedEncodingException -> 0x02ea, all -> 0x052f }
            r22 = r8
            java.lang.String r8 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r23 = r4
            int r4 = r15 - r13
            r8.<init>(r10, r13, r4, r3)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            int r2 = m41115b(r2)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            int r15 = r15 + r2
            byte[] r2 = m41124k(r10, r15, r7)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            com.google.android.gms.internal.ads.zzaco r3 = new com.google.android.gms.internal.ads.zzaco     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r3.<init>(r12, r8, r14, r2)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            goto L_0x033f
        L_0x02ea:
            r2 = r8
            goto L_0x0535
        L_0x02ed:
            r23 = r4
            r22 = r8
            r4 = 77
            if (r12 != r13) goto L_0x0345
            r7 = 79
            if (r5 != r7) goto L_0x0345
            if (r6 != r4) goto L_0x0345
            if (r9 == r4) goto L_0x0300
            r7 = 2
            if (r0 != r7) goto L_0x0345
        L_0x0300:
            r2 = 4
            if (r11 >= r2) goto L_0x0309
            r3 = r5
            r4 = r6
            r8 = r9
            r13 = 0
            goto L_0x0508
        L_0x0309:
            int r2 = r35.mo45243s()     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            java.lang.String r3 = m41121h(r2)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r4 = 3
            byte[] r7 = new byte[r4]     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r8 = 0
            r1.mo45226b(r7, r8, r4)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            java.lang.String r10 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r10.<init>(r7, r8, r4)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            int r4 = r11 + -4
            byte[] r7 = new byte[r4]     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r1.mo45226b(r7, r8, r4)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            int r4 = m41116c(r7, r8, r2)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            java.lang.String r12 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r12.<init>(r7, r8, r4, r3)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            int r8 = m41115b(r2)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            int r4 = r4 + r8
            int r2 = m41116c(r7, r4, r2)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            java.lang.String r2 = m41120g(r7, r4, r2, r3)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            com.google.android.gms.internal.ads.zzacw r3 = new com.google.android.gms.internal.ads.zzacw     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r3.<init>(r10, r12, r2)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
        L_0x033f:
            r13 = r3
            r3 = r5
            r4 = r6
        L_0x0342:
            r8 = r9
            goto L_0x0508
        L_0x0345:
            if (r12 != r13) goto L_0x03c6
            r7 = 72
            if (r5 != r7) goto L_0x03c6
            r7 = 65
            if (r6 != r7) goto L_0x03c6
            r7 = 80
            if (r9 != r7) goto L_0x03c6
            int r4 = r35.mo45235k()     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            byte[] r7 = r35.mo45232h()     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            int r7 = m41117d(r7, r4)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            java.lang.String r8 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            byte[] r10 = r35.mo45232h()     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            int r12 = r7 - r4
            r8.<init>(r10, r4, r12, r15)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r10 = 1
            int r7 = r7 + r10
            r1.mo45230f(r7)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            int r26 = r35.mo45237m()     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            int r27 = r35.mo45237m()     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            long r12 = r35.mo45217A()     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r7 != 0) goto L_0x0386
            r12 = -1
        L_0x0386:
            r28 = r12
            long r12 = r35.mo45217A()     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r7 != 0) goto L_0x0397
            r12 = -1
        L_0x0397:
            r30 = r12
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r7.<init>()     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            int r4 = r4 + r11
        L_0x039f:
            int r10 = r35.mo45235k()     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            if (r10 >= r4) goto L_0x03b0
            r10 = 0
            com.google.android.gms.internal.ads.zzadd r12 = m41119f(r0, r1, r2, r3, r10)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            if (r12 == 0) goto L_0x039f
            r7.add(r12)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            goto L_0x039f
        L_0x03b0:
            r2 = 0
            com.google.android.gms.internal.ads.zzadd[] r2 = new com.google.android.gms.internal.ads.zzadd[r2]     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            java.lang.Object[] r2 = r7.toArray(r2)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r32 = r2
            com.google.android.gms.internal.ads.zzadd[] r32 = (com.google.android.gms.internal.ads.zzadd[]) r32     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            com.google.android.gms.internal.ads.zzacs r3 = new com.google.android.gms.internal.ads.zzacs     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r24 = r3
            r25 = r8
            r24.<init>(r25, r26, r27, r28, r30, r32)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            goto L_0x033f
        L_0x03c6:
            if (r12 != r13) goto L_0x047c
            r7 = 84
            if (r5 != r7) goto L_0x047c
            r7 = 79
            if (r6 != r7) goto L_0x047c
            if (r9 != r13) goto L_0x047c
            int r4 = r35.mo45235k()     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            byte[] r7 = r35.mo45232h()     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            int r7 = m41117d(r7, r4)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            java.lang.String r8 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            byte[] r10 = r35.mo45232h()     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            int r12 = r7 - r4
            r8.<init>(r10, r4, r12, r15)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r10 = 1
            int r7 = r7 + r10
            r1.mo45230f(r7)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            int r7 = r35.mo45243s()     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r10 = r7 & 2
            if (r10 == 0) goto L_0x03fa
            r10 = 1
            r26 = 1
            goto L_0x03fd
        L_0x03fa:
            r10 = 1
            r26 = 0
        L_0x03fd:
            r7 = r7 & r10
            int r10 = r35.mo45243s()     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            java.lang.String[] r12 = new java.lang.String[r10]     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r13 = 0
        L_0x0405:
            if (r13 >= r10) goto L_0x0438
            int r14 = r35.mo45235k()     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r38 = r10
            byte[] r10 = r35.mo45232h()     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            int r10 = m41117d(r10, r14)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r16 = r9
            java.lang.String r9 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r17 = r6
            byte[] r6 = r35.mo45232h()     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r20 = r5
            int r5 = r10 - r14
            r9.<init>(r6, r14, r5, r15)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r12[r13] = r9     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            int r10 = r10 + 1
            r1.mo45230f(r10)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            int r13 = r13 + 1
            r10 = r38
            r9 = r16
            r6 = r17
            r5 = r20
            goto L_0x0405
        L_0x0438:
            r20 = r5
            r17 = r6
            r16 = r9
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r5.<init>()     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            int r4 = r4 + r11
        L_0x0444:
            int r6 = r35.mo45235k()     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            if (r6 >= r4) goto L_0x0455
            r6 = 0
            com.google.android.gms.internal.ads.zzadd r9 = m41119f(r0, r1, r2, r3, r6)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            if (r9 == 0) goto L_0x0444
            r5.add(r9)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            goto L_0x0444
        L_0x0455:
            r2 = 0
            com.google.android.gms.internal.ads.zzadd[] r3 = new com.google.android.gms.internal.ads.zzadd[r2]     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            java.lang.Object[] r2 = r5.toArray(r3)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r29 = r2
            com.google.android.gms.internal.ads.zzadd[] r29 = (com.google.android.gms.internal.ads.zzadd[]) r29     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            com.google.android.gms.internal.ads.zzacu r3 = new com.google.android.gms.internal.ads.zzacu     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r2 = 1
            if (r2 == r7) goto L_0x0468
            r27 = 0
            goto L_0x046a
        L_0x0468:
            r27 = 1
        L_0x046a:
            r24 = r3
            r25 = r8
            r28 = r12
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r13 = r3
            r8 = r16
            r4 = r17
            r3 = r20
            goto L_0x0508
        L_0x047c:
            r20 = r5
            r17 = r6
            r16 = r9
            if (r12 != r4) goto L_0x04f2
            r2 = 76
            r3 = r20
            if (r3 != r2) goto L_0x04ed
            r2 = 76
            r4 = r17
            r8 = r16
            if (r4 != r2) goto L_0x04f8
            r2 = 84
            if (r8 != r2) goto L_0x04f8
            int r25 = r35.mo45247w()     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            int r26 = r35.mo45245u()     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            int r27 = r35.mo45245u()     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            int r2 = r35.mo45243s()     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            int r5 = r35.mo45243s()     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            com.google.android.gms.internal.ads.zzee r6 = new com.google.android.gms.internal.ads.zzee     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r6.<init>()     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            byte[] r7 = r35.mo45232h()     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            int r9 = r35.mo45236l()     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r6.mo45202g(r7, r9)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            int r7 = r35.mo45235k()     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            int r7 = r7 * 8
            r6.mo45203h(r7)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            int r7 = r11 + -10
            int r7 = r7 * 8
            int r9 = r2 + r5
            int r7 = r7 / r9
            int[] r9 = new int[r7]     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            int[] r10 = new int[r7]     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r12 = 0
        L_0x04cf:
            if (r12 >= r7) goto L_0x04e0
            int r13 = r6.mo45198c(r2)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            int r14 = r6.mo45198c(r5)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r9[r12] = r13     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r10[r12] = r14     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            int r12 = r12 + 1
            goto L_0x04cf
        L_0x04e0:
            com.google.android.gms.internal.ads.zzadh r2 = new com.google.android.gms.internal.ads.zzadh     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r24 = r2
            r28 = r9
            r29 = r10
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r13 = r2
            goto L_0x0508
        L_0x04ed:
            r8 = r16
            r4 = r17
            goto L_0x04f8
        L_0x04f2:
            r8 = r16
            r4 = r17
            r3 = r20
        L_0x04f8:
            java.lang.String r2 = m41122i(r0, r12, r3, r4, r8)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            byte[] r5 = new byte[r11]     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r6 = 0
            r1.mo45226b(r5, r6, r11)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            com.google.android.gms.internal.ads.zzacq r6 = new com.google.android.gms.internal.ads.zzacq     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r6.<init>(r2, r5)     // Catch:{ UnsupportedEncodingException -> 0x053e, all -> 0x052f }
            r13 = r6
        L_0x0508:
            if (r13 != 0) goto L_0x0538
            r2 = r23
            java.lang.String r0 = m41122i(r0, r2, r3, r4, r8)     // Catch:{ UnsupportedEncodingException -> 0x0533, all -> 0x052f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0533, all -> 0x052f }
            r2.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0533, all -> 0x052f }
            java.lang.String r3 = "Failed to decode frame: id="
            r2.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x0533, all -> 0x052f }
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0533, all -> 0x052f }
            java.lang.String r0 = ", frameSize="
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0533, all -> 0x052f }
            r2.append(r11)     // Catch:{ UnsupportedEncodingException -> 0x0533, all -> 0x052f }
            java.lang.String r0 = r2.toString()     // Catch:{ UnsupportedEncodingException -> 0x0533, all -> 0x052f }
            r2 = r22
            com.google.android.gms.internal.ads.zzdw.m48255e(r2, r0)     // Catch:{ UnsupportedEncodingException -> 0x0535, all -> 0x052f }
            goto L_0x0538
        L_0x052f:
            r0 = move-exception
            r14 = r21
            goto L_0x054c
        L_0x0533:
            r2 = r22
        L_0x0535:
            r14 = r21
            goto L_0x0542
        L_0x0538:
            r14 = r21
            r1.mo45230f(r14)
            return r13
        L_0x053e:
            r14 = r21
            r2 = r22
        L_0x0542:
            java.lang.String r0 = "Unsupported character encoding"
            com.google.android.gms.internal.ads.zzdw.m48255e(r2, r0)     // Catch:{ all -> 0x0162 }
            r1.mo45230f(r14)
            r0 = 0
            return r0
        L_0x054c:
            r1.mo45230f(r14)
            throw r0
        L_0x0550:
            r2 = r8
            r0 = r13
            java.lang.String r3 = "Skipping unsupported compressed or encrypted frame"
            com.google.android.gms.internal.ads.zzdw.m48255e(r2, r3)
            r1.mo45230f(r14)
            return r0
        L_0x055b:
            r0 = r13
            r1.mo45230f(r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadc.m41119f(int, com.google.android.gms.internal.ads.zzef, boolean, int, com.google.android.gms.internal.ads.zzada):com.google.android.gms.internal.ads.zzadd");
    }

    /* renamed from: g */
    private static String m41120g(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    /* renamed from: h */
    private static String m41121h(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : HTTP.UTF_16;
    }

    /* renamed from: i */
    private static String m41122i(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        if ((r10 & 128) != 0) goto L_0x008a;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m41123j(com.google.android.gms.internal.ads.zzef r19, int r20, int r21, boolean r22) {
        /*
            r1 = r19
            r0 = r20
            int r2 = r19.mo45235k()
        L_0x0008:
            int r3 = r19.mo45233i()     // Catch:{ all -> 0x00ae }
            r4 = 1
            r5 = r21
            if (r3 < r5) goto L_0x00aa
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0022
            int r7 = r19.mo45237m()     // Catch:{ all -> 0x00ae }
            long r8 = r19.mo45217A()     // Catch:{ all -> 0x00ae }
            int r10 = r19.mo45247w()     // Catch:{ all -> 0x00ae }
            goto L_0x002c
        L_0x0022:
            int r7 = r19.mo45245u()     // Catch:{ all -> 0x00ae }
            int r8 = r19.mo45245u()     // Catch:{ all -> 0x00ae }
            long r8 = (long) r8
            r10 = 0
        L_0x002c:
            r11 = 0
            if (r7 != 0) goto L_0x003b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x003b
            if (r10 == 0) goto L_0x0037
            goto L_0x003b
        L_0x0037:
            r1.mo45230f(r2)
            return r4
        L_0x003b:
            r7 = 4
            if (r0 != r7) goto L_0x006a
            if (r22 != 0) goto L_0x006a
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x004c
            r1.mo45230f(r2)
            return r6
        L_0x004c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r11 = r11 & r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 24
            long r8 = r8 >> r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L_0x006a:
            if (r0 != r7) goto L_0x007a
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r4 = 0
        L_0x0072:
            r3 = r10 & 1
            r18 = r4
            r4 = r3
            r3 = r18
            goto L_0x008a
        L_0x007a:
            if (r0 != r3) goto L_0x0088
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0082
            r3 = 1
            goto L_0x0083
        L_0x0082:
            r3 = 0
        L_0x0083:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0089
            goto L_0x008a
        L_0x0088:
            r3 = 0
        L_0x0089:
            r4 = 0
        L_0x008a:
            if (r4 == 0) goto L_0x008e
            int r3 = r3 + 4
        L_0x008e:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0097
            r1.mo45230f(r2)
            return r6
        L_0x0097:
            int r3 = r19.mo45233i()     // Catch:{ all -> 0x00ae }
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a4
            r1.mo45230f(r2)
            return r6
        L_0x00a4:
            int r3 = (int) r8
            r1.mo45231g(r3)     // Catch:{ all -> 0x00ae }
            goto L_0x0008
        L_0x00aa:
            r1.mo45230f(r2)
            return r4
        L_0x00ae:
            r0 = move-exception
            r1.mo45230f(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzadc.m41123j(com.google.android.gms.internal.ads.zzef, int, int, boolean):boolean");
    }

    /* renamed from: k */
    private static byte[] m41124k(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return zzen.f34505f;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }
}

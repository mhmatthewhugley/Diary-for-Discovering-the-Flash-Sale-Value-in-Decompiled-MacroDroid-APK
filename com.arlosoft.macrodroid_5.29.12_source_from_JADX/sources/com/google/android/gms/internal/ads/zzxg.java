package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.work.WorkRequest;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzxg extends zzqq {

    /* renamed from: x1 */
    private static final int[] f38857x1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: y1 */
    private static boolean f38858y1;

    /* renamed from: z1 */
    private static boolean f38859z1;

    /* renamed from: S0 */
    private final Context f38860S0;

    /* renamed from: T0 */
    private final zzxr f38861T0;

    /* renamed from: U0 */
    private final zzyc f38862U0;

    /* renamed from: V0 */
    private final boolean f38863V0 = "NVIDIA".equals(zzen.f34502c);

    /* renamed from: W0 */
    private zzxf f38864W0;

    /* renamed from: X0 */
    private boolean f38865X0;

    /* renamed from: Y0 */
    private boolean f38866Y0;
    @Nullable

    /* renamed from: Z0 */
    private Surface f38867Z0;
    @Nullable

    /* renamed from: a1 */
    private zzxj f38868a1;

    /* renamed from: b1 */
    private boolean f38869b1;

    /* renamed from: c1 */
    private int f38870c1 = 1;

    /* renamed from: d1 */
    private boolean f38871d1;

    /* renamed from: e1 */
    private boolean f38872e1;

    /* renamed from: f1 */
    private boolean f38873f1;

    /* renamed from: g1 */
    private long f38874g1;

    /* renamed from: h1 */
    private long f38875h1 = -9223372036854775807L;

    /* renamed from: i1 */
    private long f38876i1;

    /* renamed from: j1 */
    private int f38877j1;

    /* renamed from: k1 */
    private int f38878k1;

    /* renamed from: l1 */
    private int f38879l1;

    /* renamed from: m1 */
    private long f38880m1;

    /* renamed from: n1 */
    private long f38881n1;

    /* renamed from: o1 */
    private long f38882o1;

    /* renamed from: p1 */
    private int f38883p1;

    /* renamed from: q1 */
    private int f38884q1 = -1;

    /* renamed from: r1 */
    private int f38885r1 = -1;

    /* renamed from: s1 */
    private int f38886s1;

    /* renamed from: t1 */
    private float f38887t1 = -1.0f;
    @Nullable

    /* renamed from: u1 */
    private zzda f38888u1 = null;

    /* renamed from: v1 */
    private int f38889v1 = 0;
    @Nullable

    /* renamed from: w1 */
    private zzxk f38890w1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzxg(Context context, zzqk zzqk, zzqs zzqs, long j, boolean z, @Nullable Handler handler, @Nullable zzyd zzyd, int i, float f) {
        super(2, zzqk, zzqs, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f38860S0 = applicationContext;
        this.f38861T0 = new zzxr(applicationContext);
        Handler handler2 = handler;
        zzyd zzyd2 = zzyd;
        this.f38862U0 = new zzyc(handler, zzyd);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0060, code lost:
        if (r3.equals("video/mp4v-es") != false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r11 = ((java.lang.Integer) r11.first).intValue();
     */
    /* renamed from: J0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m55320J0(com.google.android.gms.internal.ads.zzqn r10, com.google.android.gms.internal.ads.zzaf r11) {
        /*
            int r0 = r11.f24218q
            int r1 = r11.f24219r
            r2 = -1
            if (r0 == r2) goto L_0x00c7
            if (r1 != r2) goto L_0x000b
            goto L_0x00c7
        L_0x000b:
            java.lang.String r3 = r11.f24213l
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            r5 = 1
            java.lang.String r6 = "video/avc"
            java.lang.String r7 = "video/hevc"
            r8 = 2
            if (r4 == 0) goto L_0x0034
            android.util.Pair r11 = com.google.android.gms.internal.ads.zzrf.m54723b(r11)
            if (r11 == 0) goto L_0x0033
            java.lang.Object r11 = r11.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r3 = 512(0x200, float:7.175E-43)
            if (r11 == r3) goto L_0x0031
            if (r11 == r5) goto L_0x0031
            if (r11 != r8) goto L_0x0033
        L_0x0031:
            r3 = r6
            goto L_0x0034
        L_0x0033:
            r3 = r7
        L_0x0034:
            int r11 = r3.hashCode()
            r4 = 4
            r9 = 3
            switch(r11) {
                case -1664118616: goto L_0x0075;
                case -1662735862: goto L_0x006b;
                case -1662541442: goto L_0x0063;
                case 1187890754: goto L_0x005a;
                case 1331836730: goto L_0x0052;
                case 1599127256: goto L_0x0048;
                case 1599127257: goto L_0x003e;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x007f
        L_0x003e:
            java.lang.String r11 = "video/x-vnd.on2.vp9"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L_0x007f
            r5 = 6
            goto L_0x0080
        L_0x0048:
            java.lang.String r11 = "video/x-vnd.on2.vp8"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L_0x007f
            r5 = 4
            goto L_0x0080
        L_0x0052:
            boolean r11 = r3.equals(r6)
            if (r11 == 0) goto L_0x007f
            r5 = 2
            goto L_0x0080
        L_0x005a:
            java.lang.String r11 = "video/mp4v-es"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L_0x007f
            goto L_0x0080
        L_0x0063:
            boolean r11 = r3.equals(r7)
            if (r11 == 0) goto L_0x007f
            r5 = 5
            goto L_0x0080
        L_0x006b:
            java.lang.String r11 = "video/av01"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L_0x007f
            r5 = 3
            goto L_0x0080
        L_0x0075:
            java.lang.String r11 = "video/3gpp"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L_0x007f
            r5 = 0
            goto L_0x0080
        L_0x007f:
            r5 = -1
        L_0x0080:
            switch(r5) {
                case 0: goto L_0x00c0;
                case 1: goto L_0x00c0;
                case 2: goto L_0x0088;
                case 3: goto L_0x00c0;
                case 4: goto L_0x00c0;
                case 5: goto L_0x0084;
                case 6: goto L_0x0084;
                default: goto L_0x0083;
            }
        L_0x0083:
            return r2
        L_0x0084:
            int r0 = r0 * r1
            r8 = 4
            goto L_0x00c2
        L_0x0088:
            java.lang.String r11 = com.google.android.gms.internal.ads.zzen.f34503d
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L_0x00bf
            java.lang.String r3 = com.google.android.gms.internal.ads.zzen.f34502c
            java.lang.String r4 = "Amazon"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x00b0
            java.lang.String r3 = "KFSOWI"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto L_0x00bf
            java.lang.String r3 = "AFTS"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto L_0x00b0
            boolean r10 = r10.f38262f
            if (r10 != 0) goto L_0x00bf
        L_0x00b0:
            r10 = 16
            int r11 = com.google.android.gms.internal.ads.zzen.m49140O(r0, r10)
            int r10 = com.google.android.gms.internal.ads.zzen.m49140O(r1, r10)
            int r11 = r11 * r10
            int r0 = r11 * 256
            goto L_0x00c2
        L_0x00bf:
            return r2
        L_0x00c0:
            int r0 = r0 * r1
        L_0x00c2:
            int r0 = r0 * 3
            int r8 = r8 + r8
            int r0 = r0 / r8
            return r0
        L_0x00c7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxg.m55320J0(com.google.android.gms.internal.ads.zzqn, com.google.android.gms.internal.ads.zzaf):int");
    }

    /* renamed from: K0 */
    protected static int m55321K0(zzqn zzqn, zzaf zzaf) {
        if (zzaf.f24214m == -1) {
            return m55320J0(zzqn, zzaf);
        }
        int size = zzaf.f24215n.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((byte[]) zzaf.f24215n.get(i2)).length;
        }
        return zzaf.f24214m + i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x04c0, code lost:
        if (r0.equals("deb") != false) goto L_0x078a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x07a0, code lost:
        if (r10 != 0) goto L_0x07a2;
     */
    /* renamed from: M0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static final boolean m55322M0(java.lang.String r17) {
        /*
            java.lang.String r0 = "OMX.google"
            r1 = r17
            boolean r0 = r1.startsWith(r0)
            r1 = 0
            if (r0 == 0) goto L_0x000c
            return r1
        L_0x000c:
            java.lang.Class<com.google.android.gms.internal.ads.zzxg> r2 = com.google.android.gms.internal.ads.zzxg.class
            monitor-enter(r2)
            boolean r0 = f38858y1     // Catch:{ all -> 0x07aa }
            if (r0 != 0) goto L_0x07a6
            int r0 = com.google.android.gms.internal.ads.zzen.f34500a     // Catch:{ all -> 0x07aa }
            r3 = 28
            r4 = 5
            r5 = 6
            r6 = 4
            r7 = 7
            r8 = 2
            r9 = 3
            r10 = -1
            r11 = 1
            if (r0 > r3) goto L_0x0083
            java.lang.String r12 = com.google.android.gms.internal.ads.zzen.f34501b     // Catch:{ all -> 0x07aa }
            int r13 = r12.hashCode()     // Catch:{ all -> 0x07aa }
            switch(r13) {
                case -1339091551: goto L_0x0071;
                case -1220081023: goto L_0x0067;
                case -1220066608: goto L_0x005d;
                case -1012436106: goto L_0x0053;
                case -760312546: goto L_0x0049;
                case -64886864: goto L_0x003f;
                case 3415681: goto L_0x0035;
                case 825323514: goto L_0x002b;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x007b
        L_0x002b:
            java.lang.String r13 = "machuca"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x007b
            r12 = 5
            goto L_0x007c
        L_0x0035:
            java.lang.String r13 = "once"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x007b
            r12 = 6
            goto L_0x007c
        L_0x003f:
            java.lang.String r13 = "magnolia"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x007b
            r12 = 4
            goto L_0x007c
        L_0x0049:
            java.lang.String r13 = "aquaman"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x007b
            r12 = 0
            goto L_0x007c
        L_0x0053:
            java.lang.String r13 = "oneday"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x007b
            r12 = 7
            goto L_0x007c
        L_0x005d:
            java.lang.String r13 = "dangalUHD"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x007b
            r12 = 2
            goto L_0x007c
        L_0x0067:
            java.lang.String r13 = "dangalFHD"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x007b
            r12 = 3
            goto L_0x007c
        L_0x0071:
            java.lang.String r13 = "dangal"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x007b
            r12 = 1
            goto L_0x007c
        L_0x007b:
            r12 = -1
        L_0x007c:
            switch(r12) {
                case 0: goto L_0x0080;
                case 1: goto L_0x0080;
                case 2: goto L_0x0080;
                case 3: goto L_0x0080;
                case 4: goto L_0x0080;
                case 5: goto L_0x0080;
                case 6: goto L_0x0080;
                case 7: goto L_0x0080;
                default: goto L_0x007f;
            }
        L_0x007f:
            goto L_0x0083
        L_0x0080:
            r1 = 1
            goto L_0x07a2
        L_0x0083:
            r12 = 27
            if (r0 > r12) goto L_0x0092
            java.lang.String r13 = "HWEML"
            java.lang.String r14 = com.google.android.gms.internal.ads.zzen.f34501b     // Catch:{ all -> 0x07aa }
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x07aa }
            if (r13 == 0) goto L_0x0092
            goto L_0x0080
        L_0x0092:
            java.lang.String r13 = com.google.android.gms.internal.ads.zzen.f34503d     // Catch:{ all -> 0x07aa }
            int r14 = r13.hashCode()     // Catch:{ all -> 0x07aa }
            r15 = 8
            switch(r14) {
                case -349662828: goto L_0x00ef;
                case -321033677: goto L_0x00e5;
                case 2006354: goto L_0x00db;
                case 2006367: goto L_0x00d1;
                case 2006371: goto L_0x00c7;
                case 1785421873: goto L_0x00bd;
                case 1785421876: goto L_0x00b3;
                case 1798172390: goto L_0x00a8;
                case 2119412532: goto L_0x009e;
                default: goto L_0x009d;
            }
        L_0x009d:
            goto L_0x00f9
        L_0x009e:
            java.lang.String r14 = "AFTEUFF014"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00f9
            r14 = 5
            goto L_0x00fa
        L_0x00a8:
            java.lang.String r14 = "AFTSO001"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00f9
            r14 = 8
            goto L_0x00fa
        L_0x00b3:
            java.lang.String r14 = "AFTEU014"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00f9
            r14 = 4
            goto L_0x00fa
        L_0x00bd:
            java.lang.String r14 = "AFTEU011"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00f9
            r14 = 3
            goto L_0x00fa
        L_0x00c7:
            java.lang.String r14 = "AFTR"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00f9
            r14 = 2
            goto L_0x00fa
        L_0x00d1:
            java.lang.String r14 = "AFTN"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00f9
            r14 = 1
            goto L_0x00fa
        L_0x00db:
            java.lang.String r14 = "AFTA"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00f9
            r14 = 0
            goto L_0x00fa
        L_0x00e5:
            java.lang.String r14 = "AFTKMST12"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00f9
            r14 = 7
            goto L_0x00fa
        L_0x00ef:
            java.lang.String r14 = "AFTJMST12"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L_0x00f9
            r14 = 6
            goto L_0x00fa
        L_0x00f9:
            r14 = -1
        L_0x00fa:
            switch(r14) {
                case 0: goto L_0x0080;
                case 1: goto L_0x0080;
                case 2: goto L_0x0080;
                case 3: goto L_0x0080;
                case 4: goto L_0x0080;
                case 5: goto L_0x0080;
                case 6: goto L_0x0080;
                case 7: goto L_0x0080;
                case 8: goto L_0x0080;
                default: goto L_0x00fd;
            }
        L_0x00fd:
            r14 = 26
            if (r0 > r14) goto L_0x07a2
            java.lang.String r0 = com.google.android.gms.internal.ads.zzen.f34501b     // Catch:{ all -> 0x07aa }
            int r16 = r0.hashCode()     // Catch:{ all -> 0x07aa }
            switch(r16) {
                case -2144781245: goto L_0x077e;
                case -2144781185: goto L_0x0773;
                case -2144781160: goto L_0x0768;
                case -2097309513: goto L_0x075d;
                case -2022874474: goto L_0x0752;
                case -1978993182: goto L_0x0747;
                case -1978990237: goto L_0x073c;
                case -1936688988: goto L_0x0731;
                case -1936688066: goto L_0x0726;
                case -1936688065: goto L_0x071a;
                case -1931988508: goto L_0x070e;
                case -1885099851: goto L_0x0702;
                case -1696512866: goto L_0x06f6;
                case -1680025915: goto L_0x06ea;
                case -1615810839: goto L_0x06de;
                case -1600724499: goto L_0x06d2;
                case -1554255044: goto L_0x06c6;
                case -1481772737: goto L_0x06ba;
                case -1481772730: goto L_0x06ae;
                case -1481772729: goto L_0x06a2;
                case -1320080169: goto L_0x0696;
                case -1217592143: goto L_0x068a;
                case -1180384755: goto L_0x067e;
                case -1139198265: goto L_0x0672;
                case -1052835013: goto L_0x0666;
                case -993250464: goto L_0x065b;
                case -993250458: goto L_0x0650;
                case -965403638: goto L_0x0644;
                case -958336948: goto L_0x0638;
                case -879245230: goto L_0x062c;
                case -842500323: goto L_0x0620;
                case -821392978: goto L_0x0614;
                case -797483286: goto L_0x0608;
                case -794946968: goto L_0x05fc;
                case -788334647: goto L_0x05f0;
                case -782144577: goto L_0x05e4;
                case -575125681: goto L_0x05d8;
                case -521118391: goto L_0x05cc;
                case -430914369: goto L_0x05c0;
                case -290434366: goto L_0x05b4;
                case -282781963: goto L_0x05a8;
                case -277133239: goto L_0x059c;
                case -173639913: goto L_0x0590;
                case -56598463: goto L_0x0584;
                case 2126: goto L_0x0578;
                case 2564: goto L_0x056c;
                case 2715: goto L_0x0560;
                case 2719: goto L_0x0554;
                case 3091: goto L_0x0548;
                case 3483: goto L_0x053c;
                case 73405: goto L_0x0530;
                case 75537: goto L_0x0524;
                case 75739: goto L_0x0518;
                case 76779: goto L_0x050c;
                case 78669: goto L_0x0500;
                case 79305: goto L_0x04f4;
                case 80618: goto L_0x04e8;
                case 88274: goto L_0x04dc;
                case 98846: goto L_0x04d0;
                case 98848: goto L_0x04c4;
                case 99329: goto L_0x04ba;
                case 101481: goto L_0x04ae;
                case 1513190: goto L_0x04a3;
                case 1514184: goto L_0x0498;
                case 1514185: goto L_0x048d;
                case 2133089: goto L_0x0481;
                case 2133091: goto L_0x0475;
                case 2133120: goto L_0x0469;
                case 2133151: goto L_0x045d;
                case 2133182: goto L_0x0451;
                case 2133184: goto L_0x0445;
                case 2436959: goto L_0x0439;
                case 2463773: goto L_0x042d;
                case 2464648: goto L_0x0421;
                case 2689555: goto L_0x0415;
                case 3154429: goto L_0x0409;
                case 3284551: goto L_0x03fd;
                case 3351335: goto L_0x03f1;
                case 3386211: goto L_0x03e5;
                case 41325051: goto L_0x03d9;
                case 51349633: goto L_0x03ce;
                case 51350594: goto L_0x03c3;
                case 55178625: goto L_0x03b7;
                case 61542055: goto L_0x03ac;
                case 65355429: goto L_0x03a0;
                case 66214468: goto L_0x0394;
                case 66214470: goto L_0x0388;
                case 66214473: goto L_0x037c;
                case 66215429: goto L_0x0370;
                case 66215431: goto L_0x0364;
                case 66215433: goto L_0x0358;
                case 66216390: goto L_0x034c;
                case 76402249: goto L_0x0340;
                case 76404105: goto L_0x0334;
                case 76404911: goto L_0x0328;
                case 80963634: goto L_0x031c;
                case 82882791: goto L_0x0310;
                case 98715550: goto L_0x0304;
                case 101370885: goto L_0x02f8;
                case 102844228: goto L_0x02ec;
                case 165221241: goto L_0x02e0;
                case 182191441: goto L_0x02d4;
                case 245388979: goto L_0x02c8;
                case 287431619: goto L_0x02bc;
                case 307593612: goto L_0x02b0;
                case 308517133: goto L_0x02a4;
                case 316215098: goto L_0x0298;
                case 316215116: goto L_0x028c;
                case 316246811: goto L_0x0280;
                case 316246818: goto L_0x0274;
                case 407160593: goto L_0x0268;
                case 507412548: goto L_0x025c;
                case 793982701: goto L_0x0250;
                case 794038622: goto L_0x0244;
                case 794040393: goto L_0x0238;
                case 835649806: goto L_0x022c;
                case 917340916: goto L_0x0220;
                case 958008161: goto L_0x0214;
                case 1060579533: goto L_0x0208;
                case 1150207623: goto L_0x01fc;
                case 1176899427: goto L_0x01f0;
                case 1280332038: goto L_0x01e4;
                case 1306947716: goto L_0x01d8;
                case 1349174697: goto L_0x01cc;
                case 1522194893: goto L_0x01c0;
                case 1691543273: goto L_0x01b4;
                case 1691544261: goto L_0x01a8;
                case 1709443163: goto L_0x019c;
                case 1865889110: goto L_0x0190;
                case 1906253259: goto L_0x0184;
                case 1977196784: goto L_0x0178;
                case 2006372676: goto L_0x016c;
                case 2019281702: goto L_0x0160;
                case 2029784656: goto L_0x0154;
                case 2030379515: goto L_0x0148;
                case 2033393791: goto L_0x013c;
                case 2047190025: goto L_0x0130;
                case 2047252157: goto L_0x0124;
                case 2048319463: goto L_0x0118;
                case 2048855701: goto L_0x010c;
                default: goto L_0x010a;
            }
        L_0x010a:
            goto L_0x0789
        L_0x010c:
            java.lang.String r3 = "HWWAS-H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 66
            goto L_0x078a
        L_0x0118:
            java.lang.String r3 = "HWVNS-H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 65
            goto L_0x078a
        L_0x0124:
            java.lang.String r3 = "ELUGA_Prim"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 33
            goto L_0x078a
        L_0x0130:
            java.lang.String r3 = "ELUGA_Note"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 32
            goto L_0x078a
        L_0x013c:
            java.lang.String r3 = "ASUS_X00AD_2"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 14
            goto L_0x078a
        L_0x0148:
            java.lang.String r3 = "HWCAM-H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 64
            goto L_0x078a
        L_0x0154:
            java.lang.String r3 = "HWBLN-H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 63
            goto L_0x078a
        L_0x0160:
            java.lang.String r3 = "DM-01K"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 29
            goto L_0x078a
        L_0x016c:
            java.lang.String r3 = "BRAVIA_ATV3_4K"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 19
            goto L_0x078a
        L_0x0178:
            java.lang.String r3 = "Infinix-X572"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 69
            goto L_0x078a
        L_0x0184:
            java.lang.String r3 = "PB2-670M"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 100
            goto L_0x078a
        L_0x0190:
            java.lang.String r3 = "santoni"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 117(0x75, float:1.64E-43)
            goto L_0x078a
        L_0x019c:
            java.lang.String r3 = "iball8735_9806"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 68
            goto L_0x078a
        L_0x01a8:
            java.lang.String r3 = "CPH1715"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 24
            goto L_0x078a
        L_0x01b4:
            java.lang.String r3 = "CPH1609"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 23
            goto L_0x078a
        L_0x01c0:
            java.lang.String r3 = "woods_f"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 133(0x85, float:1.86E-43)
            goto L_0x078a
        L_0x01cc:
            java.lang.String r3 = "htc_e56ml_dtul"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 61
            goto L_0x078a
        L_0x01d8:
            java.lang.String r3 = "EverStar_S"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 35
            goto L_0x078a
        L_0x01e4:
            java.lang.String r3 = "hwALE-H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 62
            goto L_0x078a
        L_0x01f0:
            java.lang.String r3 = "itel_S41"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 71
            goto L_0x078a
        L_0x01fc:
            java.lang.String r3 = "LS-5017"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 78
            goto L_0x078a
        L_0x0208:
            java.lang.String r3 = "panell_d"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 96
            goto L_0x078a
        L_0x0214:
            java.lang.String r3 = "j2xlteins"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 72
            goto L_0x078a
        L_0x0220:
            java.lang.String r3 = "A7000plus"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 10
            goto L_0x078a
        L_0x022c:
            java.lang.String r3 = "manning"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 81
            goto L_0x078a
        L_0x0238:
            java.lang.String r3 = "GIONEE_WBL7519"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 59
            goto L_0x078a
        L_0x0244:
            java.lang.String r3 = "GIONEE_WBL7365"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 58
            goto L_0x078a
        L_0x0250:
            java.lang.String r3 = "GIONEE_WBL5708"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 57
            goto L_0x078a
        L_0x025c:
            java.lang.String r3 = "QM16XE_U"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 114(0x72, float:1.6E-43)
            goto L_0x078a
        L_0x0268:
            java.lang.String r3 = "Pixi5-10_4G"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 106(0x6a, float:1.49E-43)
            goto L_0x078a
        L_0x0274:
            java.lang.String r3 = "TB3-850M"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 125(0x7d, float:1.75E-43)
            goto L_0x078a
        L_0x0280:
            java.lang.String r3 = "TB3-850F"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 124(0x7c, float:1.74E-43)
            goto L_0x078a
        L_0x028c:
            java.lang.String r3 = "TB3-730X"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 123(0x7b, float:1.72E-43)
            goto L_0x078a
        L_0x0298:
            java.lang.String r3 = "TB3-730F"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 122(0x7a, float:1.71E-43)
            goto L_0x078a
        L_0x02a4:
            java.lang.String r3 = "A7020a48"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 12
            goto L_0x078a
        L_0x02b0:
            java.lang.String r3 = "A7010a48"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 11
            goto L_0x078a
        L_0x02bc:
            java.lang.String r3 = "griffin"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 60
            goto L_0x078a
        L_0x02c8:
            java.lang.String r3 = "marino_f"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 82
            goto L_0x078a
        L_0x02d4:
            java.lang.String r3 = "CPY83_I00"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 25
            goto L_0x078a
        L_0x02e0:
            java.lang.String r3 = "A2016a40"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 8
            goto L_0x078a
        L_0x02ec:
            java.lang.String r3 = "le_x6"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 77
            goto L_0x078a
        L_0x02f8:
            java.lang.String r3 = "l5460"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 76
            goto L_0x078a
        L_0x0304:
            java.lang.String r3 = "i9031"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 67
            goto L_0x078a
        L_0x0310:
            java.lang.String r3 = "X3_HK"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 135(0x87, float:1.89E-43)
            goto L_0x078a
        L_0x031c:
            java.lang.String r3 = "V23GB"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 128(0x80, float:1.794E-43)
            goto L_0x078a
        L_0x0328:
            java.lang.String r3 = "Q4310"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 112(0x70, float:1.57E-43)
            goto L_0x078a
        L_0x0334:
            java.lang.String r3 = "Q4260"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 110(0x6e, float:1.54E-43)
            goto L_0x078a
        L_0x0340:
            java.lang.String r3 = "PRO7S"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 108(0x6c, float:1.51E-43)
            goto L_0x078a
        L_0x034c:
            java.lang.String r3 = "F3311"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 48
            goto L_0x078a
        L_0x0358:
            java.lang.String r3 = "F3215"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 47
            goto L_0x078a
        L_0x0364:
            java.lang.String r3 = "F3213"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 46
            goto L_0x078a
        L_0x0370:
            java.lang.String r3 = "F3211"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 45
            goto L_0x078a
        L_0x037c:
            java.lang.String r3 = "F3116"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 44
            goto L_0x078a
        L_0x0388:
            java.lang.String r3 = "F3113"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 43
            goto L_0x078a
        L_0x0394:
            java.lang.String r3 = "F3111"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 42
            goto L_0x078a
        L_0x03a0:
            java.lang.String r3 = "E5643"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 30
            goto L_0x078a
        L_0x03ac:
            java.lang.String r3 = "A1601"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 7
            goto L_0x078a
        L_0x03b7:
            java.lang.String r3 = "Aura_Note_2"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 15
            goto L_0x078a
        L_0x03c3:
            java.lang.String r3 = "602LV"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 4
            goto L_0x078a
        L_0x03ce:
            java.lang.String r3 = "601LV"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 3
            goto L_0x078a
        L_0x03d9:
            java.lang.String r3 = "MEIZU_M5"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 83
            goto L_0x078a
        L_0x03e5:
            java.lang.String r3 = "p212"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 92
            goto L_0x078a
        L_0x03f1:
            java.lang.String r3 = "mido"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 85
            goto L_0x078a
        L_0x03fd:
            java.lang.String r3 = "kate"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 75
            goto L_0x078a
        L_0x0409:
            java.lang.String r3 = "fugu"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 50
            goto L_0x078a
        L_0x0415:
            java.lang.String r3 = "XE2X"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 136(0x88, float:1.9E-43)
            goto L_0x078a
        L_0x0421:
            java.lang.String r3 = "Q427"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 111(0x6f, float:1.56E-43)
            goto L_0x078a
        L_0x042d:
            java.lang.String r3 = "Q350"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 109(0x6d, float:1.53E-43)
            goto L_0x078a
        L_0x0439:
            java.lang.String r3 = "P681"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 93
            goto L_0x078a
        L_0x0445:
            java.lang.String r3 = "F04J"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 41
            goto L_0x078a
        L_0x0451:
            java.lang.String r3 = "F04H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 40
            goto L_0x078a
        L_0x045d:
            java.lang.String r3 = "F03H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 39
            goto L_0x078a
        L_0x0469:
            java.lang.String r3 = "F02H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 38
            goto L_0x078a
        L_0x0475:
            java.lang.String r3 = "F01J"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 37
            goto L_0x078a
        L_0x0481:
            java.lang.String r3 = "F01H"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 36
            goto L_0x078a
        L_0x048d:
            java.lang.String r3 = "1714"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 2
            goto L_0x078a
        L_0x0498:
            java.lang.String r3 = "1713"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 1
            goto L_0x078a
        L_0x04a3:
            java.lang.String r3 = "1601"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 0
            goto L_0x078a
        L_0x04ae:
            java.lang.String r3 = "flo"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 49
            goto L_0x078a
        L_0x04ba:
            java.lang.String r4 = "deb"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0789
            goto L_0x078a
        L_0x04c4:
            java.lang.String r3 = "cv3"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 27
            goto L_0x078a
        L_0x04d0:
            java.lang.String r3 = "cv1"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 26
            goto L_0x078a
        L_0x04dc:
            java.lang.String r3 = "Z80"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 139(0x8b, float:1.95E-43)
            goto L_0x078a
        L_0x04e8:
            java.lang.String r3 = "QX1"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 115(0x73, float:1.61E-43)
            goto L_0x078a
        L_0x04f4:
            java.lang.String r3 = "PLE"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 107(0x6b, float:1.5E-43)
            goto L_0x078a
        L_0x0500:
            java.lang.String r3 = "P85"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 94
            goto L_0x078a
        L_0x050c:
            java.lang.String r3 = "MX6"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 86
            goto L_0x078a
        L_0x0518:
            java.lang.String r3 = "M5c"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 80
            goto L_0x078a
        L_0x0524:
            java.lang.String r3 = "M04"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 79
            goto L_0x078a
        L_0x0530:
            java.lang.String r3 = "JGZ"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 73
            goto L_0x078a
        L_0x053c:
            java.lang.String r3 = "mh"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 84
            goto L_0x078a
        L_0x0548:
            java.lang.String r3 = "b5"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 16
            goto L_0x078a
        L_0x0554:
            java.lang.String r3 = "V5"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 129(0x81, float:1.81E-43)
            goto L_0x078a
        L_0x0560:
            java.lang.String r3 = "V1"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 127(0x7f, float:1.78E-43)
            goto L_0x078a
        L_0x056c:
            java.lang.String r3 = "Q5"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 113(0x71, float:1.58E-43)
            goto L_0x078a
        L_0x0578:
            java.lang.String r3 = "C1"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 20
            goto L_0x078a
        L_0x0584:
            java.lang.String r3 = "woods_fn"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 134(0x86, float:1.88E-43)
            goto L_0x078a
        L_0x0590:
            java.lang.String r3 = "ELUGA_A3_Pro"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 31
            goto L_0x078a
        L_0x059c:
            java.lang.String r3 = "Z12_PRO"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 138(0x8a, float:1.93E-43)
            goto L_0x078a
        L_0x05a8:
            java.lang.String r3 = "BLACK-1X"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 17
            goto L_0x078a
        L_0x05b4:
            java.lang.String r3 = "taido_row"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 121(0x79, float:1.7E-43)
            goto L_0x078a
        L_0x05c0:
            java.lang.String r3 = "Pixi4-7_3G"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 105(0x69, float:1.47E-43)
            goto L_0x078a
        L_0x05cc:
            java.lang.String r3 = "GIONEE_GBL7360"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 53
            goto L_0x078a
        L_0x05d8:
            java.lang.String r3 = "GiONEE_CBL7513"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 51
            goto L_0x078a
        L_0x05e4:
            java.lang.String r3 = "OnePlus5T"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 91
            goto L_0x078a
        L_0x05f0:
            java.lang.String r3 = "whyred"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 132(0x84, float:1.85E-43)
            goto L_0x078a
        L_0x05fc:
            java.lang.String r3 = "watson"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 131(0x83, float:1.84E-43)
            goto L_0x078a
        L_0x0608:
            java.lang.String r3 = "SVP-DTV15"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 119(0x77, float:1.67E-43)
            goto L_0x078a
        L_0x0614:
            java.lang.String r3 = "A7000-a"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 9
            goto L_0x078a
        L_0x0620:
            java.lang.String r3 = "nicklaus_f"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 88
            goto L_0x078a
        L_0x062c:
            java.lang.String r3 = "tcl_eu"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 126(0x7e, float:1.77E-43)
            goto L_0x078a
        L_0x0638:
            java.lang.String r3 = "ELUGA_Ray_X"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 34
            goto L_0x078a
        L_0x0644:
            java.lang.String r3 = "s905x018"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 120(0x78, float:1.68E-43)
            goto L_0x078a
        L_0x0650:
            java.lang.String r3 = "A10-70L"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 6
            goto L_0x078a
        L_0x065b:
            java.lang.String r3 = "A10-70F"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 5
            goto L_0x078a
        L_0x0666:
            java.lang.String r3 = "namath"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 87
            goto L_0x078a
        L_0x0672:
            java.lang.String r3 = "Slate_Pro"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 118(0x76, float:1.65E-43)
            goto L_0x078a
        L_0x067e:
            java.lang.String r3 = "iris60"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 70
            goto L_0x078a
        L_0x068a:
            java.lang.String r3 = "BRAVIA_ATV2"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 18
            goto L_0x078a
        L_0x0696:
            java.lang.String r3 = "GiONEE_GBL7319"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 52
            goto L_0x078a
        L_0x06a2:
            java.lang.String r3 = "panell_dt"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 99
            goto L_0x078a
        L_0x06ae:
            java.lang.String r3 = "panell_ds"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 98
            goto L_0x078a
        L_0x06ba:
            java.lang.String r3 = "panell_dl"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 97
            goto L_0x078a
        L_0x06c6:
            java.lang.String r3 = "vernee_M5"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 130(0x82, float:1.82E-43)
            goto L_0x078a
        L_0x06d2:
            java.lang.String r3 = "pacificrim"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 95
            goto L_0x078a
        L_0x06de:
            java.lang.String r3 = "Phantom6"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 104(0x68, float:1.46E-43)
            goto L_0x078a
        L_0x06ea:
            java.lang.String r3 = "ComioS1"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 21
            goto L_0x078a
        L_0x06f6:
            java.lang.String r3 = "XT1663"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 137(0x89, float:1.92E-43)
            goto L_0x078a
        L_0x0702:
            java.lang.String r3 = "RAIJIN"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 116(0x74, float:1.63E-43)
            goto L_0x078a
        L_0x070e:
            java.lang.String r3 = "AquaPowerM"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 13
            goto L_0x078a
        L_0x071a:
            java.lang.String r3 = "PGN611"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 103(0x67, float:1.44E-43)
            goto L_0x078a
        L_0x0726:
            java.lang.String r3 = "PGN610"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 102(0x66, float:1.43E-43)
            goto L_0x078a
        L_0x0731:
            java.lang.String r3 = "PGN528"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 101(0x65, float:1.42E-43)
            goto L_0x078a
        L_0x073c:
            java.lang.String r3 = "NX573J"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 90
            goto L_0x078a
        L_0x0747:
            java.lang.String r3 = "NX541J"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 89
            goto L_0x078a
        L_0x0752:
            java.lang.String r3 = "CP8676_I02"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 22
            goto L_0x078a
        L_0x075d:
            java.lang.String r3 = "K50a40"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 74
            goto L_0x078a
        L_0x0768:
            java.lang.String r3 = "GIONEE_SWW1631"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 56
            goto L_0x078a
        L_0x0773:
            java.lang.String r3 = "GIONEE_SWW1627"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 55
            goto L_0x078a
        L_0x077e:
            java.lang.String r3 = "GIONEE_SWW1609"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0789
            r3 = 54
            goto L_0x078a
        L_0x0789:
            r3 = -1
        L_0x078a:
            switch(r3) {
                case 0: goto L_0x0080;
                case 1: goto L_0x0080;
                case 2: goto L_0x0080;
                case 3: goto L_0x0080;
                case 4: goto L_0x0080;
                case 5: goto L_0x0080;
                case 6: goto L_0x0080;
                case 7: goto L_0x0080;
                case 8: goto L_0x0080;
                case 9: goto L_0x0080;
                case 10: goto L_0x0080;
                case 11: goto L_0x0080;
                case 12: goto L_0x0080;
                case 13: goto L_0x0080;
                case 14: goto L_0x0080;
                case 15: goto L_0x0080;
                case 16: goto L_0x0080;
                case 17: goto L_0x0080;
                case 18: goto L_0x0080;
                case 19: goto L_0x0080;
                case 20: goto L_0x0080;
                case 21: goto L_0x0080;
                case 22: goto L_0x0080;
                case 23: goto L_0x0080;
                case 24: goto L_0x0080;
                case 25: goto L_0x0080;
                case 26: goto L_0x0080;
                case 27: goto L_0x0080;
                case 28: goto L_0x0080;
                case 29: goto L_0x0080;
                case 30: goto L_0x0080;
                case 31: goto L_0x0080;
                case 32: goto L_0x0080;
                case 33: goto L_0x0080;
                case 34: goto L_0x0080;
                case 35: goto L_0x0080;
                case 36: goto L_0x0080;
                case 37: goto L_0x0080;
                case 38: goto L_0x0080;
                case 39: goto L_0x0080;
                case 40: goto L_0x0080;
                case 41: goto L_0x0080;
                case 42: goto L_0x0080;
                case 43: goto L_0x0080;
                case 44: goto L_0x0080;
                case 45: goto L_0x0080;
                case 46: goto L_0x0080;
                case 47: goto L_0x0080;
                case 48: goto L_0x0080;
                case 49: goto L_0x0080;
                case 50: goto L_0x0080;
                case 51: goto L_0x0080;
                case 52: goto L_0x0080;
                case 53: goto L_0x0080;
                case 54: goto L_0x0080;
                case 55: goto L_0x0080;
                case 56: goto L_0x0080;
                case 57: goto L_0x0080;
                case 58: goto L_0x0080;
                case 59: goto L_0x0080;
                case 60: goto L_0x0080;
                case 61: goto L_0x0080;
                case 62: goto L_0x0080;
                case 63: goto L_0x0080;
                case 64: goto L_0x0080;
                case 65: goto L_0x0080;
                case 66: goto L_0x0080;
                case 67: goto L_0x0080;
                case 68: goto L_0x0080;
                case 69: goto L_0x0080;
                case 70: goto L_0x0080;
                case 71: goto L_0x0080;
                case 72: goto L_0x0080;
                case 73: goto L_0x0080;
                case 74: goto L_0x0080;
                case 75: goto L_0x0080;
                case 76: goto L_0x0080;
                case 77: goto L_0x0080;
                case 78: goto L_0x0080;
                case 79: goto L_0x0080;
                case 80: goto L_0x0080;
                case 81: goto L_0x0080;
                case 82: goto L_0x0080;
                case 83: goto L_0x0080;
                case 84: goto L_0x0080;
                case 85: goto L_0x0080;
                case 86: goto L_0x0080;
                case 87: goto L_0x0080;
                case 88: goto L_0x0080;
                case 89: goto L_0x0080;
                case 90: goto L_0x0080;
                case 91: goto L_0x0080;
                case 92: goto L_0x0080;
                case 93: goto L_0x0080;
                case 94: goto L_0x0080;
                case 95: goto L_0x0080;
                case 96: goto L_0x0080;
                case 97: goto L_0x0080;
                case 98: goto L_0x0080;
                case 99: goto L_0x0080;
                case 100: goto L_0x0080;
                case 101: goto L_0x0080;
                case 102: goto L_0x0080;
                case 103: goto L_0x0080;
                case 104: goto L_0x0080;
                case 105: goto L_0x0080;
                case 106: goto L_0x0080;
                case 107: goto L_0x0080;
                case 108: goto L_0x0080;
                case 109: goto L_0x0080;
                case 110: goto L_0x0080;
                case 111: goto L_0x0080;
                case 112: goto L_0x0080;
                case 113: goto L_0x0080;
                case 114: goto L_0x0080;
                case 115: goto L_0x0080;
                case 116: goto L_0x0080;
                case 117: goto L_0x0080;
                case 118: goto L_0x0080;
                case 119: goto L_0x0080;
                case 120: goto L_0x0080;
                case 121: goto L_0x0080;
                case 122: goto L_0x0080;
                case 123: goto L_0x0080;
                case 124: goto L_0x0080;
                case 125: goto L_0x0080;
                case 126: goto L_0x0080;
                case 127: goto L_0x0080;
                case 128: goto L_0x0080;
                case 129: goto L_0x0080;
                case 130: goto L_0x0080;
                case 131: goto L_0x0080;
                case 132: goto L_0x0080;
                case 133: goto L_0x0080;
                case 134: goto L_0x0080;
                case 135: goto L_0x0080;
                case 136: goto L_0x0080;
                case 137: goto L_0x0080;
                case 138: goto L_0x0080;
                case 139: goto L_0x0080;
                default: goto L_0x078d;
            }
        L_0x078d:
            int r0 = r13.hashCode()     // Catch:{ all -> 0x07aa }
            r3 = -594534941(0xffffffffdc901de3, float:-3.2452206E17)
            if (r0 == r3) goto L_0x0797
            goto L_0x07a0
        L_0x0797:
            java.lang.String r0 = "JSN-L21"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x07a0
            r10 = 0
        L_0x07a0:
            if (r10 == 0) goto L_0x0080
        L_0x07a2:
            f38859z1 = r1     // Catch:{ all -> 0x07aa }
            f38858y1 = r11     // Catch:{ all -> 0x07aa }
        L_0x07a6:
            monitor-exit(r2)     // Catch:{ all -> 0x07aa }
            boolean r0 = f38859z1
            return r0
        L_0x07aa:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x07aa }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxg.m55322M0(java.lang.String):boolean");
    }

    /* renamed from: N0 */
    private static List m55323N0(zzqs zzqs, zzaf zzaf, boolean z, boolean z2) throws zzqz {
        String str = zzaf.f24213l;
        if (str == null) {
            return zzfvn.m51135w();
        }
        List f = zzrf.m54727f(str, z, z2);
        String e = zzrf.m54726e(zzaf);
        if (e == null) {
            return zzfvn.m51133t(f);
        }
        List f2 = zzrf.m54727f(e, z, z2);
        zzfvk m = zzfvn.m51129m();
        m.mo46429g(f);
        m.mo46429g(f2);
        return m.mo46430h();
    }

    /* renamed from: O0 */
    private final void m55324O0() {
        int i = this.f38884q1;
        if (i == -1) {
            if (this.f38885r1 != -1) {
                i = -1;
            } else {
                return;
            }
        }
        zzda zzda = this.f38888u1;
        if (zzda == null || zzda.f31941a != i || zzda.f31942b != this.f38885r1 || zzda.f31943c != this.f38886s1 || zzda.f31944d != this.f38887t1) {
            zzda zzda2 = new zzda(i, this.f38885r1, this.f38886s1, this.f38887t1);
            this.f38888u1 = zzda2;
            this.f38862U0.mo48442t(zzda2);
        }
    }

    /* renamed from: P0 */
    private final void m55325P0() {
        zzda zzda = this.f38888u1;
        if (zzda != null) {
            this.f38862U0.mo48442t(zzda);
        }
    }

    @RequiresApi(17)
    /* renamed from: Q0 */
    private final void m55326Q0() {
        Surface surface = this.f38867Z0;
        zzxj zzxj = this.f38868a1;
        if (surface == zzxj) {
            this.f38867Z0 = null;
        }
        zzxj.release();
        this.f38868a1 = null;
    }

    /* renamed from: R0 */
    private static boolean m55327R0(long j) {
        return j < -30000;
    }

    /* renamed from: S0 */
    private final boolean m55328S0(zzqn zzqn) {
        if (zzen.f34500a < 23 || m55322M0(zzqn.f38257a) || (zzqn.f38262f && !zzxj.m55366b(this.f38860S0))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo47300A() {
        this.f38875h1 = -9223372036854775807L;
        if (this.f38877j1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f38862U0.mo48426d(this.f38877j1, elapsedRealtime - this.f38876i1);
            this.f38877j1 = 0;
            this.f38876i1 = elapsedRealtime;
        }
        int i = this.f38883p1;
        if (i != 0) {
            this.f38862U0.mo48440r(this.f38882o1, i);
            this.f38882o1 = 0;
            this.f38883p1 = 0;
        }
        this.f38861T0.mo48408h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final float mo47982C(float f, zzaf zzaf, zzaf[] zzafArr) {
        float f2 = -1.0f;
        for (zzaf zzaf2 : zzafArr) {
            float f3 = zzaf2.f24220s;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final int mo47983D(zzqs zzqs, zzaf zzaf) throws zzqz {
        boolean z;
        int i = 128;
        if (!zzbt.m44095h(zzaf.f24213l)) {
            return 128;
        }
        int i2 = 0;
        boolean z2 = zzaf.f24216o != null;
        List N0 = m55323N0(zzqs, zzaf, z2, false);
        if (z2 && N0.isEmpty()) {
            N0 = m55323N0(zzqs, zzaf, false, false);
        }
        if (N0.isEmpty()) {
            return 129;
        }
        if (!zzqq.m54649E0(zzaf)) {
            return 130;
        }
        zzqn zzqn = (zzqn) N0.get(0);
        boolean d = zzqn.mo48068d(zzaf);
        if (!d) {
            int i3 = 1;
            while (true) {
                if (i3 >= N0.size()) {
                    break;
                }
                zzqn zzqn2 = (zzqn) N0.get(i3);
                if (zzqn2.mo48068d(zzaf)) {
                    zzqn = zzqn2;
                    z = false;
                    d = true;
                    break;
                }
                i3++;
            }
        }
        z = true;
        int i4 = true != d ? 3 : 4;
        int i5 = true != zzqn.mo48069e(zzaf) ? 8 : 16;
        int i6 = true != zzqn.f38263g ? 0 : 64;
        if (true != z) {
            i = 0;
        }
        if (d) {
            List N02 = m55323N0(zzqs, zzaf, z2, true);
            if (!N02.isEmpty()) {
                zzqn zzqn3 = (zzqn) zzrf.m54728g(N02, zzaf).get(0);
                if (zzqn3.mo48068d(zzaf) && zzqn3.mo48069e(zzaf)) {
                    i2 = 32;
                }
            }
        }
        return i4 | i5 | i2 | i6 | i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public final boolean mo48076D0(zzqn zzqn) {
        return this.f38867Z0 != null || m55328S0(zzqn);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final zzgt mo47984E(zzqn zzqn, zzaf zzaf, zzaf zzaf2) {
        int i;
        int i2;
        zzgt b = zzqn.mo48067b(zzaf, zzaf2);
        int i3 = b.f37255e;
        int i4 = zzaf2.f24218q;
        zzxf zzxf = this.f38864W0;
        if (i4 > zzxf.f38854a || zzaf2.f24219r > zzxf.f38855b) {
            i3 |= 256;
        }
        if (m55321K0(zzqn, zzaf2) > this.f38864W0.f38856c) {
            i3 |= 64;
        }
        String str = zzqn.f38257a;
        if (i3 != 0) {
            i = i3;
            i2 = 0;
        } else {
            i2 = b.f37254d;
            i = 0;
        }
        return new zzgt(str, zzaf, zzaf2, i2, i);
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: G */
    public final zzgt mo47985G(zzjg zzjg) throws zzha {
        zzgt G = super.mo47985G(zzjg);
        this.f38862U0.mo48428f(zzjg.f37624a, G);
        return G;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012f, code lost:
        r20 = r9;
        r21 = r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0236  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzqj mo47986K(com.google.android.gms.internal.ads.zzqn r23, com.google.android.gms.internal.ads.zzaf r24, @androidx.annotation.Nullable android.media.MediaCrypto r25, float r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r26
            com.google.android.gms.internal.ads.zzxj r4 = r0.f38868a1
            if (r4 == 0) goto L_0x0015
            boolean r4 = r4.f38898a
            boolean r5 = r1.f38262f
            if (r4 == r5) goto L_0x0015
            r22.m55326Q0()
        L_0x0015:
            java.lang.String r4 = r1.f38259c
            com.google.android.gms.internal.ads.zzaf[] r5 = r22.mo47318j()
            int r6 = r2.f24218q
            int r7 = r2.f24219r
            int r8 = m55321K0(r23, r24)
            int r9 = r5.length
            r10 = -1
            r13 = 1
            if (r9 != r13) goto L_0x0043
            if (r8 == r10) goto L_0x003a
            int r5 = m55320J0(r23, r24)
            if (r5 == r10) goto L_0x003a
            float r8 = (float) r8
            r9 = 1069547520(0x3fc00000, float:1.5)
            float r8 = r8 * r9
            int r8 = (int) r8
            int r8 = java.lang.Math.min(r8, r5)
        L_0x003a:
            com.google.android.gms.internal.ads.zzxf r5 = new com.google.android.gms.internal.ads.zzxf
            r5.<init>(r6, r7, r8)
            r16 = r4
            goto L_0x017e
        L_0x0043:
            r14 = 0
            r15 = 0
        L_0x0045:
            if (r14 >= r9) goto L_0x0089
            r11 = r5[r14]
            com.google.android.gms.internal.ads.zzq r13 = r2.f24225x
            if (r13 == 0) goto L_0x005e
            com.google.android.gms.internal.ads.zzq r13 = r11.f24225x
            if (r13 != 0) goto L_0x005e
            com.google.android.gms.internal.ads.zzad r11 = r11.mo41422b()
            com.google.android.gms.internal.ads.zzq r13 = r2.f24225x
            r11.mo41330g0(r13)
            com.google.android.gms.internal.ads.zzaf r11 = r11.mo41349y()
        L_0x005e:
            com.google.android.gms.internal.ads.zzgt r13 = r1.mo48067b(r2, r11)
            int r13 = r13.f37254d
            if (r13 == 0) goto L_0x0085
            int r13 = r11.f24218q
            if (r13 == r10) goto L_0x0071
            int r12 = r11.f24219r
            if (r12 != r10) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r12 = 0
            goto L_0x0072
        L_0x0071:
            r12 = 1
        L_0x0072:
            r15 = r15 | r12
            int r6 = java.lang.Math.max(r6, r13)
            int r12 = r11.f24219r
            int r7 = java.lang.Math.max(r7, r12)
            int r11 = m55321K0(r1, r11)
            int r8 = java.lang.Math.max(r8, r11)
        L_0x0085:
            int r14 = r14 + 1
            r13 = 1
            goto L_0x0045
        L_0x0089:
            if (r15 == 0) goto L_0x0177
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "Resolutions unknown. Codec max resolution: "
            r5.append(r9)
            r5.append(r6)
            java.lang.String r9 = "x"
            r5.append(r9)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r10 = "MediaCodecVideoRenderer"
            com.google.android.gms.internal.ads.zzdw.m48255e(r10, r5)
            int r5 = r2.f24219r
            int r11 = r2.f24218q
            if (r5 <= r11) goto L_0x00b1
            r12 = r5
            goto L_0x00b2
        L_0x00b1:
            r12 = r11
        L_0x00b2:
            if (r5 > r11) goto L_0x00b6
            r13 = r5
            goto L_0x00b7
        L_0x00b6:
            r13 = r11
        L_0x00b7:
            float r14 = (float) r13
            float r15 = (float) r12
            float r14 = r14 / r15
            int[] r15 = f38857x1
            r16 = r4
            r3 = 0
        L_0x00bf:
            r4 = 9
            if (r3 >= r4) goto L_0x012f
            r4 = r15[r3]
            r17 = r15
            float r15 = (float) r4
            float r15 = r15 * r14
            int r15 = (int) r15
            if (r4 <= r12) goto L_0x012f
            if (r15 > r13) goto L_0x00d1
            goto L_0x012f
        L_0x00d1:
            r18 = r12
            int r12 = com.google.android.gms.internal.ads.zzen.f34500a
            r19 = r13
            r13 = 21
            if (r12 < r13) goto L_0x00f9
            if (r5 > r11) goto L_0x00df
            r12 = r4
            goto L_0x00e0
        L_0x00df:
            r12 = r15
        L_0x00e0:
            if (r5 > r11) goto L_0x00e3
            r4 = r15
        L_0x00e3:
            android.graphics.Point r4 = r1.mo48066a(r12, r4)
            float r12 = r2.f24220s
            int r13 = r4.x
            int r15 = r4.y
            r20 = r9
            r21 = r10
            double r9 = (double) r12
            boolean r9 = r1.mo48070f(r13, r15, r9)
            if (r9 == 0) goto L_0x0122
            goto L_0x0134
        L_0x00f9:
            r20 = r9
            r21 = r10
            r9 = 16
            int r4 = com.google.android.gms.internal.ads.zzen.m49140O(r4, r9)     // Catch:{ zzqz -> 0x0133 }
            int r4 = r4 * 16
            int r10 = com.google.android.gms.internal.ads.zzen.m49140O(r15, r9)     // Catch:{ zzqz -> 0x0133 }
            int r10 = r10 * 16
            int r9 = r4 * r10
            int r12 = com.google.android.gms.internal.ads.zzrf.m54722a()     // Catch:{ zzqz -> 0x0133 }
            if (r9 > r12) goto L_0x0122
            android.graphics.Point r3 = new android.graphics.Point     // Catch:{ zzqz -> 0x0133 }
            if (r5 > r11) goto L_0x0119
            r9 = r4
            goto L_0x011a
        L_0x0119:
            r9 = r10
        L_0x011a:
            if (r5 > r11) goto L_0x011d
            r4 = r10
        L_0x011d:
            r3.<init>(r9, r4)     // Catch:{ zzqz -> 0x0133 }
            r4 = r3
            goto L_0x0134
        L_0x0122:
            int r3 = r3 + 1
            r15 = r17
            r12 = r18
            r13 = r19
            r9 = r20
            r10 = r21
            goto L_0x00bf
        L_0x012f:
            r20 = r9
            r21 = r10
        L_0x0133:
            r4 = 0
        L_0x0134:
            if (r4 == 0) goto L_0x0179
            int r3 = r4.x
            int r6 = java.lang.Math.max(r6, r3)
            int r3 = r4.y
            int r7 = java.lang.Math.max(r7, r3)
            com.google.android.gms.internal.ads.zzad r3 = r24.mo41422b()
            r3.mo41348x(r6)
            r3.mo41327f(r7)
            com.google.android.gms.internal.ads.zzaf r3 = r3.mo41349y()
            int r3 = m55320J0(r1, r3)
            int r8 = java.lang.Math.max(r8, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Codec max resolution adjusted to: "
            r3.append(r4)
            r3.append(r6)
            r4 = r20
            r3.append(r4)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            r4 = r21
            com.google.android.gms.internal.ads.zzdw.m48255e(r4, r3)
            goto L_0x0179
        L_0x0177:
            r16 = r4
        L_0x0179:
            com.google.android.gms.internal.ads.zzxf r5 = new com.google.android.gms.internal.ads.zzxf
            r5.<init>(r6, r7, r8)
        L_0x017e:
            r0.f38864W0 = r5
            boolean r3 = r0.f38863V0
            android.media.MediaFormat r4 = new android.media.MediaFormat
            r4.<init>()
            java.lang.String r6 = "mime"
            r7 = r16
            r4.setString(r6, r7)
            int r6 = r2.f24218q
            java.lang.String r7 = "width"
            r4.setInteger(r7, r6)
            int r6 = r2.f24219r
            java.lang.String r7 = "height"
            r4.setInteger(r7, r6)
            java.util.List r6 = r2.f24215n
            com.google.android.gms.internal.ads.zzdy.m48350b(r4, r6)
            float r6 = r2.f24220s
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x01ae
            java.lang.String r8 = "frame-rate"
            r4.setFloat(r8, r6)
        L_0x01ae:
            int r6 = r2.f24221t
            java.lang.String r8 = "rotation-degrees"
            com.google.android.gms.internal.ads.zzdy.m48349a(r4, r8, r6)
            com.google.android.gms.internal.ads.zzq r6 = r2.f24225x
            if (r6 == 0) goto L_0x01db
            int r8 = r6.f38208c
            java.lang.String r9 = "color-transfer"
            com.google.android.gms.internal.ads.zzdy.m48349a(r4, r9, r8)
            int r8 = r6.f38206a
            java.lang.String r9 = "color-standard"
            com.google.android.gms.internal.ads.zzdy.m48349a(r4, r9, r8)
            int r8 = r6.f38207b
            java.lang.String r9 = "color-range"
            com.google.android.gms.internal.ads.zzdy.m48349a(r4, r9, r8)
            byte[] r6 = r6.f38209d
            if (r6 == 0) goto L_0x01db
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            java.lang.String r8 = "hdr-static-info"
            r4.setByteBuffer(r8, r6)
        L_0x01db:
            java.lang.String r6 = r2.f24213l
            java.lang.String r8 = "video/dolby-vision"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x01f8
            android.util.Pair r6 = com.google.android.gms.internal.ads.zzrf.m54723b(r24)
            if (r6 == 0) goto L_0x01f8
            java.lang.Object r6 = r6.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.String r8 = "profile"
            com.google.android.gms.internal.ads.zzdy.m48349a(r4, r8, r6)
        L_0x01f8:
            int r6 = r5.f38854a
            java.lang.String r8 = "max-width"
            r4.setInteger(r8, r6)
            int r6 = r5.f38855b
            java.lang.String r8 = "max-height"
            r4.setInteger(r8, r6)
            int r5 = r5.f38856c
            java.lang.String r6 = "max-input-size"
            com.google.android.gms.internal.ads.zzdy.m48349a(r4, r6, r5)
            int r5 = com.google.android.gms.internal.ads.zzen.f34500a
            r6 = 23
            if (r5 < r6) goto L_0x0224
            java.lang.String r5 = "priority"
            r6 = 0
            r4.setInteger(r5, r6)
            r5 = r26
            int r6 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0224
            java.lang.String r6 = "operating-rate"
            r4.setFloat(r6, r5)
        L_0x0224:
            if (r3 == 0) goto L_0x0232
            java.lang.String r3 = "no-post-process"
            r5 = 1
            r4.setInteger(r3, r5)
            java.lang.String r3 = "auto-frc"
            r5 = 0
            r4.setInteger(r3, r5)
        L_0x0232:
            android.view.Surface r3 = r0.f38867Z0
            if (r3 != 0) goto L_0x0255
            boolean r3 = r22.m55328S0(r23)
            if (r3 == 0) goto L_0x024f
            com.google.android.gms.internal.ads.zzxj r3 = r0.f38868a1
            if (r3 != 0) goto L_0x024a
            android.content.Context r3 = r0.f38860S0
            boolean r5 = r1.f38262f
            com.google.android.gms.internal.ads.zzxj r3 = com.google.android.gms.internal.ads.zzxj.m55365a(r3, r5)
            r0.f38868a1 = r3
        L_0x024a:
            com.google.android.gms.internal.ads.zzxj r3 = r0.f38868a1
            r0.f38867Z0 = r3
            goto L_0x0255
        L_0x024f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0255:
            android.view.Surface r3 = r0.f38867Z0
            r5 = 0
            com.google.android.gms.internal.ads.zzqj r1 = com.google.android.gms.internal.ads.zzqj.m54622b(r1, r4, r2, r3, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxg.mo47986K(com.google.android.gms.internal.ads.zzqn, com.google.android.gms.internal.ads.zzaf, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zzqj");
    }

    /* renamed from: L */
    public final String mo47770L() {
        return "MediaCodecVideoRenderer";
    }

    /* access modifiers changed from: protected */
    /* renamed from: L0 */
    public final void mo48384L0(long j) {
        zzgs zzgs = this.f38286L0;
        zzgs.f37204k += j;
        zzgs.f37205l++;
        this.f38882o1 += j;
        this.f38883p1++;
    }

    /* renamed from: M */
    public final boolean mo47771M() {
        zzxj zzxj;
        if (super.mo47771M() && (this.f38871d1 || (((zzxj = this.f38868a1) != null && this.f38867Z0 == zzxj) || mo48079s0() == null))) {
            this.f38875h1 = -9223372036854775807L;
            return true;
        } else if (this.f38875h1 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f38875h1) {
                return true;
            }
            this.f38875h1 = -9223372036854775807L;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final List mo47987N(zzqs zzqs, zzaf zzaf, boolean z) throws zzqz {
        return zzrf.m54728g(m55323N0(zzqs, zzaf, false, false), zzaf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final void mo47988O(Exception exc) {
        zzdw.m48253c("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f38862U0.mo48441s(exc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: T0 */
    public final void mo48385T0(zzql zzql, int i, long j) {
        m55324O0();
        int i2 = zzen.f34500a;
        Trace.beginSection("releaseOutputBuffer");
        zzql.mo48026m(i, true);
        Trace.endSection();
        this.f38881n1 = SystemClock.elapsedRealtime() * 1000;
        this.f38286L0.f37198e++;
        this.f38878k1 = 0;
        mo47992k0();
    }

    /* renamed from: U */
    public final void mo47308U(float f, float f2) throws zzha {
        super.mo47308U(f, f2);
        this.f38861T0.mo48405e(f);
    }

    /* access modifiers changed from: protected */
    @RequiresApi(21)
    /* renamed from: U0 */
    public final void mo48386U0(zzql zzql, int i, long j, long j2) {
        m55324O0();
        int i2 = zzen.f34500a;
        Trace.beginSection("releaseOutputBuffer");
        zzql.mo48019f(i, j2);
        Trace.endSection();
        this.f38881n1 = SystemClock.elapsedRealtime() * 1000;
        this.f38286L0.f37198e++;
        this.f38878k1 = 0;
        mo47992k0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: V0 */
    public final void mo48387V0(zzql zzql, int i, long j) {
        int i2 = zzen.f34500a;
        Trace.beginSection("skipVideoBuffer");
        zzql.mo48026m(i, false);
        Trace.endSection();
        this.f38286L0.f37199f++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W0 */
    public final void mo48388W0(int i, int i2) {
        zzgs zzgs = this.f38286L0;
        zzgs.f37201h += i;
        int i3 = i + i2;
        zzgs.f37200g += i3;
        this.f38877j1 += i3;
        int i4 = this.f38878k1 + i3;
        this.f38878k1 = i4;
        zzgs.f37202i = Math.max(i4, zzgs.f37202i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public final void mo47989Z(String str, zzqj zzqj, long j, long j2) {
        this.f38862U0.mo48423a(str, j, j2);
        this.f38865X0 = m55322M0(str);
        zzqn u0 = mo48081u0();
        Objects.requireNonNull(u0);
        boolean z = false;
        if (zzen.f34500a >= 29 && "video/x-vnd.on2.vp9".equals(u0.f38258b)) {
            MediaCodecInfo.CodecProfileLevel[] g = u0.mo48071g();
            int length = g.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (g[i].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f38866Y0 = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public final void mo47990a0(String str) {
        this.f38862U0.mo48424b(str);
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47314e(int r6, @androidx.annotation.Nullable java.lang.Object r7) throws com.google.android.gms.internal.ads.zzha {
        /*
            r5 = this;
            r0 = 1
            if (r6 == r0) goto L_0x0042
            r0 = 7
            if (r6 == r0) goto L_0x003d
            r0 = 10
            if (r6 == r0) goto L_0x0030
            r0 = 4
            if (r6 == r0) goto L_0x001e
            r0 = 5
            if (r6 == r0) goto L_0x0012
            goto L_0x00ca
        L_0x0012:
            com.google.android.gms.internal.ads.zzxr r6 = r5.f38861T0
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r6.mo48410j(r7)
            return
        L_0x001e:
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r6 = r7.intValue()
            r5.f38870c1 = r6
            com.google.android.gms.internal.ads.zzql r7 = r5.mo48079s0()
            if (r7 == 0) goto L_0x00ca
            r7.mo48025l(r6)
            return
        L_0x0030:
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r6 = r7.intValue()
            int r7 = r5.f38889v1
            if (r7 == r6) goto L_0x00ca
            r5.f38889v1 = r6
            return
        L_0x003d:
            com.google.android.gms.internal.ads.zzxk r7 = (com.google.android.gms.internal.ads.zzxk) r7
            r5.f38890w1 = r7
            return
        L_0x0042:
            boolean r6 = r7 instanceof android.view.Surface
            r0 = 0
            if (r6 == 0) goto L_0x004a
            android.view.Surface r7 = (android.view.Surface) r7
            goto L_0x004b
        L_0x004a:
            r7 = r0
        L_0x004b:
            if (r7 != 0) goto L_0x0069
            com.google.android.gms.internal.ads.zzxj r6 = r5.f38868a1
            if (r6 == 0) goto L_0x0053
            r7 = r6
            goto L_0x0069
        L_0x0053:
            com.google.android.gms.internal.ads.zzqn r6 = r5.mo48081u0()
            if (r6 == 0) goto L_0x0069
            boolean r1 = r5.m55328S0(r6)
            if (r1 == 0) goto L_0x0069
            android.content.Context r7 = r5.f38860S0
            boolean r6 = r6.f38262f
            com.google.android.gms.internal.ads.zzxj r7 = com.google.android.gms.internal.ads.zzxj.m55365a(r7, r6)
            r5.f38868a1 = r7
        L_0x0069:
            android.view.Surface r6 = r5.f38867Z0
            if (r6 == r7) goto L_0x00b6
            r5.f38867Z0 = r7
            com.google.android.gms.internal.ads.zzxr r6 = r5.f38861T0
            r6.mo48409i(r7)
            r6 = 0
            r5.f38869b1 = r6
            int r1 = r5.mo47305Q()
            com.google.android.gms.internal.ads.zzql r2 = r5.mo48079s0()
            if (r2 == 0) goto L_0x0097
            int r3 = com.google.android.gms.internal.ads.zzen.f34500a
            r4 = 23
            if (r3 < r4) goto L_0x0091
            if (r7 == 0) goto L_0x0091
            boolean r3 = r5.f38865X0
            if (r3 != 0) goto L_0x0091
            r2.mo48022i(r7)
            goto L_0x0097
        L_0x0091:
            r5.mo48085y0()
            r5.mo48083w0()
        L_0x0097:
            if (r7 == 0) goto L_0x00af
            com.google.android.gms.internal.ads.zzxj r2 = r5.f38868a1
            if (r7 == r2) goto L_0x00af
            r5.m55325P0()
            r5.f38871d1 = r6
            int r6 = com.google.android.gms.internal.ads.zzen.f34500a
            r6 = 2
            if (r1 != r6) goto L_0x00ca
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f38875h1 = r6
            return
        L_0x00af:
            r5.f38888u1 = r0
            r5.f38871d1 = r6
            int r6 = com.google.android.gms.internal.ads.zzen.f34500a
            return
        L_0x00b6:
            if (r7 == 0) goto L_0x00ca
            com.google.android.gms.internal.ads.zzxj r6 = r5.f38868a1
            if (r7 == r6) goto L_0x00ca
            r5.m55325P0()
            boolean r6 = r5.f38869b1
            if (r6 == 0) goto L_0x00ca
            com.google.android.gms.internal.ads.zzyc r6 = r5.f38862U0
            android.view.Surface r7 = r5.f38867Z0
            r6.mo48439q(r7)
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxg.mo47314e(int, java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public final void mo47991i0(zzaf zzaf, @Nullable MediaFormat mediaFormat) {
        int i;
        int i2;
        zzql s0 = mo48079s0();
        if (s0 != null) {
            s0.mo48025l(this.f38870c1);
        }
        Objects.requireNonNull(mediaFormat);
        boolean z = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        }
        if (z) {
            i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        this.f38884q1 = i;
        if (z) {
            i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        this.f38885r1 = i2;
        float f = zzaf.f24222u;
        this.f38887t1 = f;
        if (zzen.f34500a >= 21) {
            int i3 = zzaf.f24221t;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.f38884q1;
                this.f38884q1 = i2;
                this.f38885r1 = i4;
                this.f38887t1 = 1.0f / f;
            }
        } else {
            this.f38886s1 = zzaf.f24221t;
        }
        this.f38861T0.mo48403c(zzaf.f24220s);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public final void mo47992k0() {
        this.f38873f1 = true;
        if (!this.f38871d1) {
            this.f38871d1 = true;
            this.f38862U0.mo48439q(this.f38867Z0);
            this.f38869b1 = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public final void mo47993l0() {
        this.f38871d1 = false;
        int i = zzen.f34500a;
    }

    /* access modifiers changed from: protected */
    @CallSuper
    /* renamed from: m0 */
    public final void mo47994m0(zzgi zzgi) throws zzha {
        this.f38879l1++;
        int i = zzen.f34500a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o0 */
    public final boolean mo47996o0(long j, long j2, @Nullable zzql zzql, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzaf zzaf) throws zzha {
        boolean z3;
        int p;
        long j4 = j;
        zzql zzql2 = zzql;
        int i4 = i;
        long j5 = j3;
        Objects.requireNonNull(zzql);
        if (this.f38874g1 == -9223372036854775807L) {
            this.f38874g1 = j4;
        }
        if (j5 != this.f38880m1) {
            this.f38861T0.mo48404d(j5);
            this.f38880m1 = j5;
        }
        long r0 = mo48078r0();
        long j6 = j5 - r0;
        if (!z || z2) {
            float q0 = mo48077q0();
            int Q = mo47305Q();
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            long j7 = (long) (((double) (j5 - j4)) / ((double) q0));
            if (Q == 2) {
                j7 -= elapsedRealtime - j2;
            }
            if (this.f38867Z0 != this.f38868a1) {
                long j8 = elapsedRealtime - this.f38881n1;
                boolean z4 = this.f38873f1 ? !this.f38871d1 : !(Q != 2 && !this.f38872e1);
                if (this.f38875h1 == -9223372036854775807L && j4 >= r0 && (z4 || (Q == 2 && m55327R0(j7) && j8 > 100000))) {
                    long nanoTime = System.nanoTime();
                    if (zzen.f34500a >= 21) {
                        mo48386U0(zzql, i, j6, nanoTime);
                    } else {
                        mo48385T0(zzql2, i4, j6);
                    }
                    mo48384L0(j7);
                    return true;
                } else if (Q != 2 || j4 == this.f38874g1) {
                    return false;
                } else {
                    long nanoTime2 = System.nanoTime();
                    long a = this.f38861T0.mo48402a((j7 * 1000) + nanoTime2);
                    long j9 = (a - nanoTime2) / 1000;
                    long j10 = this.f38875h1;
                    if (j9 < -500000 && !z2 && (p = mo47324p(j)) != 0) {
                        if (j10 != -9223372036854775807L) {
                            zzgs zzgs = this.f38286L0;
                            zzgs.f37197d += p;
                            zzgs.f37199f += this.f38879l1;
                        } else {
                            this.f38286L0.f37203j++;
                            mo48388W0(p, this.f38879l1);
                        }
                        mo48074B0();
                        return false;
                    } else if (m55327R0(j9) && !z2) {
                        if (j10 != -9223372036854775807L) {
                            mo48387V0(zzql2, i4, j6);
                            z3 = true;
                        } else {
                            int i5 = zzen.f34500a;
                            Trace.beginSection("dropVideoBuffer");
                            zzql2.mo48026m(i4, false);
                            Trace.endSection();
                            z3 = true;
                            mo48388W0(0, 1);
                        }
                        mo48384L0(j9);
                        return z3;
                    } else if (zzen.f34500a >= 21) {
                        if (j9 >= 50000) {
                            return false;
                        }
                        mo48386U0(zzql, i, j6, a);
                        mo48384L0(j9);
                        return true;
                    } else if (j9 >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                        return false;
                    } else {
                        if (j9 > 11000) {
                            try {
                                Thread.sleep((-10000 + j9) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        mo48385T0(zzql2, i4, j6);
                        mo48384L0(j9);
                        return true;
                    }
                }
            } else if (!m55327R0(j7)) {
                return false;
            } else {
                mo48387V0(zzql2, i4, j6);
                mo48384L0(j7);
                return true;
            }
        } else {
            mo48387V0(zzql2, i4, j6);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t0 */
    public final zzqm mo48080t0(Throwable th, @Nullable zzqn zzqn) {
        return new zzxe(th, zzqn, this.f38867Z0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo47330v() {
        this.f38888u1 = null;
        this.f38871d1 = false;
        int i = zzen.f34500a;
        this.f38869b1 = false;
        try {
            super.mo47330v();
        } finally {
            this.f38862U0.mo48425c(this.f38286L0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public final void mo48082v0(zzgi zzgi) throws zzha {
        if (this.f38866Y0) {
            ByteBuffer byteBuffer = zzgi.f36864f;
            Objects.requireNonNull(byteBuffer);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b != -75 || s != 60 || s2 != 1 || b2 != 4) {
                    return;
                }
                if (b3 == 0 || b3 == 1) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    zzql s0 = mo48079s0();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    s0.mo48028n0(bundle);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo47331w(boolean z, boolean z2) throws zzha {
        super.mo47331w(z, z2);
        mo47327s();
        this.f38862U0.mo48427e(this.f38286L0);
        this.f38872e1 = z2;
        this.f38873f1 = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo47332x(long j, boolean z) throws zzha {
        super.mo47332x(j, z);
        this.f38871d1 = false;
        int i = zzen.f34500a;
        this.f38861T0.mo48406f();
        this.f38880m1 = -9223372036854775807L;
        this.f38874g1 = -9223372036854775807L;
        this.f38878k1 = 0;
        this.f38875h1 = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    @CallSuper
    /* renamed from: x0 */
    public final void mo48084x0(long j) {
        super.mo48084x0(j);
        this.f38879l1--;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo47333y() {
        try {
            super.mo47333y();
            if (this.f38868a1 != null) {
                m55326Q0();
            }
        } catch (Throwable th) {
            if (this.f38868a1 != null) {
                m55326Q0();
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo47334z() {
        this.f38877j1 = 0;
        this.f38876i1 = SystemClock.elapsedRealtime();
        this.f38881n1 = SystemClock.elapsedRealtime() * 1000;
        this.f38882o1 = 0;
        this.f38883p1 = 0;
        this.f38861T0.mo48407g();
    }

    /* access modifiers changed from: protected */
    @CallSuper
    /* renamed from: z0 */
    public final void mo48086z0() {
        super.mo48086z0();
        this.f38879l1 = 0;
    }
}

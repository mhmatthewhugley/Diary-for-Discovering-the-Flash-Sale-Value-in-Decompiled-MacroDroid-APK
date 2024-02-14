package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzqn {

    /* renamed from: a */
    public final String f38257a;

    /* renamed from: b */
    public final String f38258b;

    /* renamed from: c */
    public final String f38259c;
    @Nullable

    /* renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f38260d;

    /* renamed from: e */
    public final boolean f38261e;

    /* renamed from: f */
    public final boolean f38262f;

    /* renamed from: g */
    public final boolean f38263g;

    /* renamed from: h */
    private final boolean f38264h;

    @VisibleForTesting
    zzqn(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Objects.requireNonNull(str);
        this.f38257a = str;
        this.f38258b = str2;
        this.f38259c = str3;
        this.f38260d = codecCapabilities;
        this.f38263g = z;
        this.f38261e = z4;
        this.f38262f = z6;
        this.f38264h = zzbt.m44095h(str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r12) == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if ("Nexus 10".equals(r3) == false) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzqn m54637c(java.lang.String r12, java.lang.String r13, java.lang.String r14, @androidx.annotation.Nullable android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r1 = r12
            r4 = r15
            com.google.android.gms.internal.ads.zzqn r11 = new com.google.android.gms.internal.ads.zzqn
            r0 = 1
            r2 = 0
            if (r4 == 0) goto L_0x003b
            int r3 = com.google.android.gms.internal.ads.zzen.f34500a
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L_0x003b
            r5 = 22
            if (r3 > r5) goto L_0x0039
            java.lang.String r3 = com.google.android.gms.internal.ads.zzen.f34503d
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L_0x0028
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0039
        L_0x0028:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L_0x003b
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r8 = 1
            goto L_0x003c
        L_0x003b:
            r8 = 0
        L_0x003c:
            r3 = 21
            if (r4 == 0) goto L_0x004e
            int r5 = com.google.android.gms.internal.ads.zzen.f34500a
            if (r5 < r3) goto L_0x004e
            java.lang.String r5 = "tunneled-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L_0x004e
            r9 = 1
            goto L_0x004f
        L_0x004e:
            r9 = 0
        L_0x004f:
            if (r20 != 0) goto L_0x0062
            if (r4 == 0) goto L_0x0060
            int r5 = com.google.android.gms.internal.ads.zzen.f34500a
            if (r5 < r3) goto L_0x0060
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L_0x0060
            goto L_0x0062
        L_0x0060:
            r10 = 0
            goto L_0x0063
        L_0x0062:
            r10 = 1
        L_0x0063:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqn.m54637c(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.zzqn");
    }

    @RequiresApi(21)
    /* renamed from: h */
    private static Point m54638h(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(zzen.m49140O(i, widthAlignment) * widthAlignment, zzen.m49140O(i2, heightAlignment) * heightAlignment);
    }

    /* renamed from: i */
    private final void m54639i(String str) {
        String str2 = this.f38257a;
        String str3 = this.f38258b;
        String str4 = zzen.f34504e;
        zzdw.m48251a("MediaCodecInfo", "NoSupport [" + str + "] [" + str2 + ", " + str3 + "] [" + str4 + "]");
    }

    @RequiresApi(21)
    /* renamed from: j */
    private static boolean m54640j(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point h = m54638h(videoCapabilities, i, i2);
        int i3 = h.x;
        int i4 = h.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    @RequiresApi(21)
    @Nullable
    /* renamed from: a */
    public final Point mo48066a(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f38260d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return m54638h(videoCapabilities, i, i2);
    }

    /* renamed from: b */
    public final zzgt mo48067b(zzaf zzaf, zzaf zzaf2) {
        int i = true != zzen.m49181t(zzaf.f24213l, zzaf2.f24213l) ? 8 : 0;
        if (this.f38264h) {
            if (zzaf.f24221t != zzaf2.f24221t) {
                i |= 1024;
            }
            if (!this.f38261e && !(zzaf.f24218q == zzaf2.f24218q && zzaf.f24219r == zzaf2.f24219r)) {
                i |= 512;
            }
            if (!zzen.m49181t(zzaf.f24225x, zzaf2.f24225x)) {
                i |= 2048;
            }
            String str = this.f38257a;
            if (zzen.f34503d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzaf.mo41424d(zzaf2)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzgt(this.f38257a, zzaf, zzaf2, true != zzaf.mo41424d(zzaf2) ? 2 : 3, 0);
            }
        } else {
            if (zzaf.f24226y != zzaf2.f24226y) {
                i |= 4096;
            }
            if (zzaf.f24227z != zzaf2.f24227z) {
                i |= 8192;
            }
            if (zzaf.f24196A != zzaf2.f24196A) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.f38258b)) {
                Pair b = zzrf.m54723b(zzaf);
                Pair b2 = zzrf.m54723b(zzaf2);
                if (!(b == null || b2 == null)) {
                    int intValue = ((Integer) b.first).intValue();
                    int intValue2 = ((Integer) b2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new zzgt(this.f38257a, zzaf, zzaf2, 3, 0);
                    }
                }
            }
            if (!zzaf.mo41424d(zzaf2)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.f38258b)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzgt(this.f38257a, zzaf, zzaf2, 1, 0);
            }
        }
        return new zzgt(this.f38257a, zzaf, zzaf2, 0, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0084, code lost:
        r5 = r5.getVideoCapabilities();
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo48068d(com.google.android.gms.internal.ads.zzaf r13) throws com.google.android.gms.internal.ads.zzqz {
        /*
            r12 = this;
            java.lang.String r0 = r12.f38258b
            java.lang.String r1 = r13.f24213l
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = r12.f38258b
            java.lang.String r2 = com.google.android.gms.internal.ads.zzrf.m54726e(r13)
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            return r1
        L_0x0019:
            java.lang.String r0 = r13.f24210i
            r2 = 16
            r3 = 1
            if (r0 != 0) goto L_0x0022
            goto L_0x0143
        L_0x0022:
            android.util.Pair r0 = com.google.android.gms.internal.ads.zzrf.m54723b(r13)
            if (r0 == 0) goto L_0x0143
            java.lang.Object r4 = r0.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.String r5 = r13.f24213l
            java.lang.String r6 = "video/dolby-vision"
            boolean r5 = r6.equals(r5)
            r6 = 8
            java.lang.String r7 = "video/hevc"
            r8 = 2
            if (r5 == 0) goto L_0x005f
            java.lang.String r5 = r12.f38258b
            java.lang.String r9 = "video/avc"
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x0055
            r0 = 0
            r4 = 8
            goto L_0x005f
        L_0x0055:
            java.lang.String r5 = r12.f38258b
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x005f
            r0 = 0
            r4 = 2
        L_0x005f:
            boolean r5 = r12.f38264h
            r9 = 42
            if (r5 != 0) goto L_0x0069
            if (r4 != r9) goto L_0x0143
            r4 = 42
        L_0x0069:
            android.media.MediaCodecInfo$CodecProfileLevel[] r5 = r12.mo48071g()
            int r9 = com.google.android.gms.internal.ads.zzen.f34500a
            r10 = 23
            if (r9 > r10) goto L_0x00f5
            java.lang.String r9 = r12.f38258b
            java.lang.String r10 = "video/x-vnd.on2.vp9"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x00f5
            int r9 = r5.length
            if (r9 != 0) goto L_0x00f5
            android.media.MediaCodecInfo$CodecCapabilities r5 = r12.f38260d
            if (r5 == 0) goto L_0x0099
            android.media.MediaCodecInfo$VideoCapabilities r5 = r5.getVideoCapabilities()
            if (r5 == 0) goto L_0x0099
            android.util.Range r5 = r5.getBitrateRange()
            java.lang.Comparable r5 = r5.getUpper()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L_0x009a
        L_0x0099:
            r5 = 0
        L_0x009a:
            r9 = 180000000(0xaba9500, float:1.7967196E-32)
            if (r5 < r9) goto L_0x00a2
            r6 = 1024(0x400, float:1.435E-42)
            goto L_0x00e7
        L_0x00a2:
            r9 = 120000000(0x7270e00, float:1.2567798E-34)
            if (r5 < r9) goto L_0x00aa
            r6 = 512(0x200, float:7.175E-43)
            goto L_0x00e7
        L_0x00aa:
            r9 = 60000000(0x3938700, float:8.670878E-37)
            if (r5 < r9) goto L_0x00b2
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x00e7
        L_0x00b2:
            r9 = 30000000(0x1c9c380, float:7.411627E-38)
            if (r5 < r9) goto L_0x00ba
            r6 = 128(0x80, float:1.794E-43)
            goto L_0x00e7
        L_0x00ba:
            r9 = 18000000(0x112a880, float:2.6936858E-38)
            if (r5 < r9) goto L_0x00c2
            r6 = 64
            goto L_0x00e7
        L_0x00c2:
            r9 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r5 < r9) goto L_0x00ca
            r6 = 32
            goto L_0x00e7
        L_0x00ca:
            r9 = 7200000(0x6ddd00, float:1.0089349E-38)
            if (r5 < r9) goto L_0x00d2
            r6 = 16
            goto L_0x00e7
        L_0x00d2:
            r9 = 3600000(0x36ee80, float:5.044674E-39)
            if (r5 < r9) goto L_0x00d8
            goto L_0x00e7
        L_0x00d8:
            r6 = 1800000(0x1b7740, float:2.522337E-39)
            if (r5 < r6) goto L_0x00df
            r6 = 4
            goto L_0x00e7
        L_0x00df:
            r6 = 800000(0xc3500, float:1.121039E-39)
            if (r5 < r6) goto L_0x00e6
            r6 = 2
            goto L_0x00e7
        L_0x00e6:
            r6 = 1
        L_0x00e7:
            android.media.MediaCodecInfo$CodecProfileLevel r5 = new android.media.MediaCodecInfo$CodecProfileLevel
            r5.<init>()
            r5.profile = r3
            r5.level = r6
            android.media.MediaCodecInfo$CodecProfileLevel[] r6 = new android.media.MediaCodecInfo.CodecProfileLevel[r3]
            r6[r1] = r5
            r5 = r6
        L_0x00f5:
            int r6 = r5.length
            r9 = 0
        L_0x00f7:
            if (r9 >= r6) goto L_0x0122
            r10 = r5[r9]
            int r11 = r10.profile
            if (r11 != r4) goto L_0x011f
            int r10 = r10.level
            if (r10 < r0) goto L_0x011f
            java.lang.String r10 = r12.f38258b
            boolean r10 = r7.equals(r10)
            if (r10 == 0) goto L_0x0143
            if (r4 != r8) goto L_0x0143
            java.lang.String r10 = com.google.android.gms.internal.ads.zzen.f34501b
            java.lang.String r11 = "sailfish"
            boolean r11 = r11.equals(r10)
            if (r11 != 0) goto L_0x011f
            java.lang.String r11 = "marlin"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x0143
        L_0x011f:
            int r9 = r9 + 1
            goto L_0x00f7
        L_0x0122:
            java.lang.String r13 = r13.f24210i
            java.lang.String r0 = r12.f38259c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "codec.profileLevel, "
            r2.append(r3)
            r2.append(r13)
            java.lang.String r13 = ", "
            r2.append(r13)
            r2.append(r0)
            java.lang.String r13 = r2.toString()
            r12.m54639i(r13)
            return r1
        L_0x0143:
            boolean r0 = r12.f38264h
            r4 = 21
            if (r0 == 0) goto L_0x018b
            int r0 = r13.f24218q
            if (r0 <= 0) goto L_0x018a
            int r2 = r13.f24219r
            if (r2 > 0) goto L_0x0152
            goto L_0x018a
        L_0x0152:
            int r5 = com.google.android.gms.internal.ads.zzen.f34500a
            if (r5 < r4) goto L_0x015e
            float r13 = r13.f24220s
            double r3 = (double) r13
            boolean r13 = r12.mo48070f(r0, r2, r3)
            return r13
        L_0x015e:
            int r0 = r0 * r2
            int r2 = com.google.android.gms.internal.ads.zzrf.m54722a()
            if (r0 > r2) goto L_0x0167
            r1 = 1
        L_0x0167:
            if (r1 != 0) goto L_0x0189
            int r0 = r13.f24218q
            int r13 = r13.f24219r
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "legacyFrameSize, "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "x"
            r2.append(r0)
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            r12.m54639i(r13)
        L_0x0189:
            return r1
        L_0x018a:
            return r3
        L_0x018b:
            int r0 = com.google.android.gms.internal.ads.zzen.f34500a
            if (r0 < r4) goto L_0x02a7
            int r4 = r13.f24227z
            r5 = -1
            if (r4 == r5) goto L_0x01c8
            android.media.MediaCodecInfo$CodecCapabilities r6 = r12.f38260d
            if (r6 != 0) goto L_0x019f
            java.lang.String r13 = "sampleRate.caps"
            r12.m54639i(r13)
            goto L_0x02a8
        L_0x019f:
            android.media.MediaCodecInfo$AudioCapabilities r6 = r6.getAudioCapabilities()
            if (r6 != 0) goto L_0x01ac
            java.lang.String r13 = "sampleRate.aCaps"
            r12.m54639i(r13)
            goto L_0x02a8
        L_0x01ac:
            boolean r6 = r6.isSampleRateSupported(r4)
            if (r6 != 0) goto L_0x01c8
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "sampleRate.support, "
            r13.append(r0)
            r13.append(r4)
            java.lang.String r13 = r13.toString()
            r12.m54639i(r13)
            goto L_0x02a8
        L_0x01c8:
            int r13 = r13.f24226y
            if (r13 == r5) goto L_0x02a7
            android.media.MediaCodecInfo$CodecCapabilities r4 = r12.f38260d
            if (r4 != 0) goto L_0x01d7
            java.lang.String r13 = "channelCount.caps"
            r12.m54639i(r13)
            goto L_0x02a6
        L_0x01d7:
            android.media.MediaCodecInfo$AudioCapabilities r4 = r4.getAudioCapabilities()
            if (r4 != 0) goto L_0x01e4
            java.lang.String r13 = "channelCount.aCaps"
            r12.m54639i(r13)
            goto L_0x02a6
        L_0x01e4:
            java.lang.String r5 = r12.f38257a
            java.lang.String r6 = r12.f38258b
            int r4 = r4.getMaxInputChannelCount()
            if (r4 > r3) goto L_0x0290
            r7 = 26
            if (r0 < r7) goto L_0x01f6
            if (r4 <= 0) goto L_0x01f6
            goto L_0x0290
        L_0x01f6:
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0290
            java.lang.String r0 = "audio/3gpp"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0290
            java.lang.String r0 = "audio/amr-wb"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0290
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0290
            java.lang.String r0 = "audio/vorbis"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0290
            java.lang.String r0 = "audio/opus"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0290
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0290
            java.lang.String r0 = "audio/flac"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0290
            java.lang.String r0 = "audio/g711-alaw"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0290
            java.lang.String r0 = "audio/g711-mlaw"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0290
            java.lang.String r0 = "audio/gsm"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x024f
            goto L_0x0290
        L_0x024f:
            java.lang.String r0 = "audio/ac3"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0259
            r2 = 6
            goto L_0x0264
        L_0x0259:
            java.lang.String r0 = "audio/eac3"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0262
            goto L_0x0264
        L_0x0262:
            r2 = 30
        L_0x0264:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "AssumedMaxChannelAdjustment: "
            r0.append(r6)
            r0.append(r5)
            java.lang.String r5 = ", ["
            r0.append(r5)
            r0.append(r4)
            java.lang.String r4 = " to "
            r0.append(r4)
            r0.append(r2)
            java.lang.String r4 = "]"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "MediaCodecInfo"
            com.google.android.gms.internal.ads.zzdw.m48255e(r4, r0)
            r4 = r2
        L_0x0290:
            if (r4 >= r13) goto L_0x02a7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "channelCount.support, "
            r0.append(r2)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.m54639i(r13)
        L_0x02a6:
            return r1
        L_0x02a7:
            r1 = 1
        L_0x02a8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqn.mo48068d(com.google.android.gms.internal.ads.zzaf):boolean");
    }

    /* renamed from: e */
    public final boolean mo48069e(zzaf zzaf) {
        if (this.f38264h) {
            return this.f38261e;
        }
        Pair b = zzrf.m54723b(zzaf);
        return b != null && ((Integer) b.first).intValue() == 42;
    }

    @RequiresApi(21)
    /* renamed from: f */
    public final boolean mo48070f(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f38260d;
        if (codecCapabilities == null) {
            m54639i("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m54639i("sizeAndRate.vCaps");
            return false;
        } else if (m54640j(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i >= i2 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.f38257a) && "mcv5a".equals(zzen.f34501b)) || !m54640j(videoCapabilities, i2, i, d))) {
                m54639i("sizeAndRate.support, " + i + "x" + i2 + "x" + d);
                return false;
            }
            String str = this.f38257a;
            String str2 = this.f38258b;
            String str3 = zzen.f34504e;
            StringBuilder sb = new StringBuilder();
            sb.append("AssumedSupport [");
            sb.append("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d);
            sb.append("] [");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            sb.append("] [");
            sb.append(str3);
            sb.append("]");
            zzdw.m48251a("MediaCodecInfo", sb.toString());
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.profileLevels;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.media.MediaCodecInfo.CodecProfileLevel[] mo48071g() {
        /*
            r1 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r1.f38260d
            if (r0 == 0) goto L_0x0008
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            if (r0 != 0) goto L_0x000b
        L_0x0008:
            r0 = 0
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r0]
        L_0x000b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqn.mo48071g():android.media.MediaCodecInfo$CodecProfileLevel[]");
    }

    public final String toString() {
        return this.f38257a;
    }
}

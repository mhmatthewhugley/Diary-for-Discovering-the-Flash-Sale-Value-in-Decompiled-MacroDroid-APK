package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaws {

    /* renamed from: a */
    public final String f26116a;

    /* renamed from: b */
    public final boolean f26117b;

    /* renamed from: c */
    public final boolean f26118c;

    /* renamed from: d */
    public final boolean f26119d;

    /* renamed from: e */
    private final String f26120e;

    /* renamed from: f */
    private final MediaCodecInfo.CodecCapabilities f26121f;

    private zzaws(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        Objects.requireNonNull(str);
        this.f26116a = str;
        this.f26120e = str2;
        this.f26121f = codecCapabilities;
        boolean z3 = true;
        this.f26117b = !z && codecCapabilities != null && zzbar.f26418a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
        this.f26118c = codecCapabilities != null && zzbar.f26418a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback");
        if (!z2 && (codecCapabilities == null || zzbar.f26418a < 21 || !codecCapabilities.isFeatureSupported("secure-playback"))) {
            z3 = false;
        }
        this.f26119d = z3;
    }

    /* renamed from: a */
    public static zzaws m42678a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new zzaws(str, str2, codecCapabilities, z, z2);
    }

    /* renamed from: b */
    public static zzaws m42679b(String str) {
        return new zzaws("OMX.google.raw.decoder", (String) null, (MediaCodecInfo.CodecCapabilities) null, false, false);
    }

    /* renamed from: h */
    private final void m42680h(String str) {
        String str2 = this.f26116a;
        String str3 = this.f26120e;
        String str4 = zzbar.f26422e;
        StringBuilder sb = new StringBuilder();
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str4);
        sb.append("]");
    }

    /* renamed from: i */
    private static boolean m42681i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (d == -1.0d || d <= 0.0d) {
            return videoCapabilities.isSizeSupported(i, i2);
        }
        return videoCapabilities.areSizeAndRateSupported(i, i2, d);
    }

    /* renamed from: c */
    public final boolean mo42148c(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f26121f;
        if (codecCapabilities == null) {
            m42680h("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m42680h("channelCount.aCaps");
            return false;
        } else if (audioCapabilities.getMaxInputChannelCount() >= i) {
            return true;
        } else {
            m42680h("channelCount.support, " + i);
            return false;
        }
    }

    /* renamed from: d */
    public final boolean mo42149d(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f26121f;
        if (codecCapabilities == null) {
            m42680h("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m42680h("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        } else {
            m42680h("sampleRate.support, " + i);
            return false;
        }
    }

    /* renamed from: e */
    public final boolean mo42150e(String str) {
        if (str == null || this.f26120e == null) {
            return true;
        }
        String trim = str.trim();
        String str2 = (trim.startsWith("avc1") || trim.startsWith("avc3")) ? "video/avc" : (trim.startsWith("hev1") || trim.startsWith("hvc1")) ? "video/hevc" : trim.startsWith("vp9") ? "video/x-vnd.on2.vp9" : trim.startsWith("vp8") ? "video/x-vnd.on2.vp8" : trim.startsWith("mp4a") ? "audio/mp4a-latm" : (trim.startsWith("ac-3") || trim.startsWith("dac3")) ? "audio/ac3" : (trim.startsWith("ec-3") || trim.startsWith("dec3")) ? "audio/eac3" : (trim.startsWith("dtsc") || trim.startsWith("dtse")) ? "audio/vnd.dts" : (trim.startsWith("dtsh") || trim.startsWith("dtsl")) ? "audio/vnd.dts.hd" : trim.startsWith("opus") ? "audio/opus" : trim.startsWith("vorbis") ? "audio/vorbis" : null;
        if (str2 == null) {
            return true;
        }
        if (!this.f26120e.equals(str2)) {
            m42680h("codec.mime " + str + ", " + str2);
            return false;
        }
        Pair b = zzaxe.m42723b(str);
        if (b == null) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mo42152g()) {
            if (codecProfileLevel.profile == ((Integer) b.first).intValue() && codecProfileLevel.level >= ((Integer) b.second).intValue()) {
                return true;
            }
        }
        m42680h("codec.profileLevel, " + str + ", " + str2);
        return false;
    }

    /* renamed from: f */
    public final boolean mo42151f(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f26121f;
        if (codecCapabilities == null) {
            m42680h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m42680h("sizeAndRate.vCaps");
            return false;
        } else if (m42681i(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i >= i2 || !m42681i(videoCapabilities, i2, i, d)) {
                m42680h("sizeAndRate.support, " + i + "x" + i2 + "x" + d);
                return false;
            }
            String str = this.f26116a;
            String str2 = this.f26120e;
            String str3 = zzbar.f26422e;
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
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.profileLevels;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.media.MediaCodecInfo.CodecProfileLevel[] mo42152g() {
        /*
            r1 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r1.f26121f
            if (r0 == 0) goto L_0x0008
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            if (r0 != 0) goto L_0x000b
        L_0x0008:
            r0 = 0
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r0]
        L_0x000b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaws.mo42152g():android.media.MediaCodecInfo$CodecProfileLevel[]");
    }
}

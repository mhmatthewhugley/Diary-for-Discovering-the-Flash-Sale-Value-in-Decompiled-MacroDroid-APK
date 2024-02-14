package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.Objects;

@RequiresApi(29)
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zznc {

    /* renamed from: a */
    private static final AudioAttributes f37938a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    @DoNotInline
    /* renamed from: a */
    public static int m54298a(int i, int i2) {
        for (int i3 = 8; i3 > 0; i3--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(zzen.m49145T(i3)).build(), f37938a)) {
                return i3;
            }
        }
        return 0;
    }

    @DoNotInline
    /* renamed from: b */
    public static int[] m54299b() {
        zzfvk m = zzfvn.m51129m();
        zzfxm i = zznd.f37941e.keySet().iterator();
        while (i.hasNext()) {
            int intValue = ((Integer) i.next()).intValue();
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), f37938a)) {
                m.mo46428f(Integer.valueOf(intValue));
            }
        }
        m.mo46428f(2);
        Object[] array = m.mo46430h().toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = array[i2];
            Objects.requireNonNull(obj);
            iArr[i2] = ((Number) obj).intValue();
        }
        return iArr;
    }
}

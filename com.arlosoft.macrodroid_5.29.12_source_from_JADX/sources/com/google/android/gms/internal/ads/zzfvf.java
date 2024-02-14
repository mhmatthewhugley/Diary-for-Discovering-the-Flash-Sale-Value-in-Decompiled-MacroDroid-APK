package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfvf {
    /* renamed from: a */
    static int m51100a(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    /* renamed from: b */
    static int m51101b(Object obj) {
        return m51100a(obj == null ? 0 : obj.hashCode());
    }
}

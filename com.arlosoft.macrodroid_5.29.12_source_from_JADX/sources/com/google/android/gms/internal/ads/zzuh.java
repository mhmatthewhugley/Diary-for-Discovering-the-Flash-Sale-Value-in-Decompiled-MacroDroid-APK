package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzuh {

    /* renamed from: d */
    public static final zzuh f38622d = new zzuh(new zzcp[0]);

    /* renamed from: e */
    public static final zzn f38623e = zzug.f38621a;

    /* renamed from: a */
    public final int f38624a;

    /* renamed from: b */
    private final zzfvn f38625b;

    /* renamed from: c */
    private int f38626c;

    public zzuh(zzcp... zzcpArr) {
        this.f38625b = zzfvn.m51134u(zzcpArr);
        this.f38624a = zzcpArr.length;
        int i = 0;
        while (i < this.f38625b.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f38625b.size(); i3++) {
                if (((zzcp) this.f38625b.get(i)).equals(this.f38625b.get(i3))) {
                    zzdw.m48253c("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    /* renamed from: a */
    public final int mo48264a(zzcp zzcp) {
        int indexOf = this.f38625b.indexOf(zzcp);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    /* renamed from: b */
    public final zzcp mo48265b(int i) {
        return (zzcp) this.f38625b.get(i);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzuh.class == obj.getClass()) {
            zzuh zzuh = (zzuh) obj;
            return this.f38624a == zzuh.f38624a && this.f38625b.equals(zzuh.f38625b);
        }
    }

    public final int hashCode() {
        int i = this.f38626c;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f38625b.hashCode();
        this.f38626c = hashCode;
        return hashCode;
    }
}

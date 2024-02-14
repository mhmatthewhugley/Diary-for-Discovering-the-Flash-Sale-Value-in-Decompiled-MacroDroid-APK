package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzayt {

    /* renamed from: d */
    public static final zzayt f26314d = new zzayt(new zzays[0]);

    /* renamed from: a */
    public final int f26315a;

    /* renamed from: b */
    private final zzays[] f26316b;

    /* renamed from: c */
    private int f26317c;

    public zzayt(zzays... zzaysArr) {
        this.f26316b = zzaysArr;
        this.f26315a = zzaysArr.length;
    }

    /* renamed from: a */
    public final int mo42257a(zzays zzays) {
        for (int i = 0; i < this.f26315a; i++) {
            if (this.f26316b[i] == zzays) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final zzays mo42258b(int i) {
        return this.f26316b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzayt.class == obj.getClass()) {
            zzayt zzayt = (zzayt) obj;
            return this.f26315a == zzayt.f26315a && Arrays.equals(this.f26316b, zzayt.f26316b);
        }
    }

    public final int hashCode() {
        int i = this.f26317c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f26316b);
        this.f26317c = hashCode;
        return hashCode;
    }
}

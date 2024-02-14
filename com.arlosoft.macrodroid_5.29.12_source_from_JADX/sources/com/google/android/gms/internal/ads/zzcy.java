package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcy {

    /* renamed from: b */
    public static final zzcy f31829b = new zzcy(zzfvn.m51135w());

    /* renamed from: c */
    public static final zzn f31830c = zzcv.f31627a;

    /* renamed from: a */
    private final zzfvn f31831a;

    public zzcy(List list) {
        this.f31831a = zzfvn.m51133t(list);
    }

    /* renamed from: a */
    public final zzfvn mo44475a() {
        return this.f31831a;
    }

    /* renamed from: b */
    public final boolean mo44476b(int i) {
        for (int i2 = 0; i2 < this.f31831a.size(); i2++) {
            zzcx zzcx = (zzcx) this.f31831a.get(i2);
            if (zzcx.mo44447c() && zzcx.mo44445a() == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzcy.class != obj.getClass()) {
            return false;
        }
        return this.f31831a.equals(((zzcy) obj).f31831a);
    }

    public final int hashCode() {
        return this.f31831a.hashCode();
    }
}

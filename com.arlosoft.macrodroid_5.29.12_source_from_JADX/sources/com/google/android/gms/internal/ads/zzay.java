package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class zzay {

    /* renamed from: a */
    public final Uri f26234a;
    @Nullable

    /* renamed from: b */
    public final String f26235b = null;
    @Nullable

    /* renamed from: c */
    public final zzas f26236c = null;
    @Nullable

    /* renamed from: d */
    public final zzai f26237d = null;

    /* renamed from: e */
    public final List f26238e;
    @Nullable

    /* renamed from: f */
    public final String f26239f;

    /* renamed from: g */
    public final zzfvn f26240g;
    @Deprecated

    /* renamed from: h */
    public final List f26241h;
    @Nullable

    /* renamed from: i */
    public final Object f26242i;

    /* synthetic */ zzay(Uri uri, String str, zzas zzas, zzai zzai, List list, String str2, zzfvn zzfvn, Object obj, zzax zzax) {
        this.f26234a = uri;
        this.f26238e = list;
        this.f26239f = null;
        this.f26240g = zzfvn;
        zzfvk m = zzfvn.m51129m();
        if (zzfvn.size() <= 0) {
            this.f26241h = m.mo46430h();
            this.f26242i = null;
            return;
        }
        zzbe zzbe = (zzbe) zzfvn.get(0);
        throw null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzay)) {
            return false;
        }
        zzay zzay = (zzay) obj;
        return this.f26234a.equals(zzay.f26234a) && zzen.m49181t((Object) null, (Object) null) && zzen.m49181t((Object) null, (Object) null) && zzen.m49181t((Object) null, (Object) null) && this.f26238e.equals(zzay.f26238e) && zzen.m49181t((Object) null, (Object) null) && this.f26240g.equals(zzay.f26240g) && zzen.m49181t((Object) null, (Object) null);
    }

    public final int hashCode() {
        return ((((this.f26234a.hashCode() * 923521) + this.f26238e.hashCode()) * 961) + this.f26240g.hashCode()) * 31;
    }
}

package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzdtm implements zzbpu {

    /* renamed from: a */
    private final WeakReference f33060a;

    /* renamed from: b */
    private final String f33061b;

    /* renamed from: c */
    private final zzbpu f33062c;

    /* renamed from: d */
    final /* synthetic */ zzdtn f33063d;

    /* synthetic */ zzdtm(zzdtn zzdtn, WeakReference weakReference, String str, zzbpu zzbpu, zzdtl zzdtl) {
        this.f33063d = zzdtn;
        this.f33060a = weakReference;
        this.f33061b = str;
        this.f33062c = zzbpu;
    }

    /* renamed from: a */
    public final void mo42867a(Object obj, Map map) {
        Object obj2 = this.f33060a.get();
        if (obj2 == null) {
            this.f33063d.mo44982k(this.f33061b, this);
        } else {
            this.f33062c.mo42867a(obj2, map);
        }
    }
}

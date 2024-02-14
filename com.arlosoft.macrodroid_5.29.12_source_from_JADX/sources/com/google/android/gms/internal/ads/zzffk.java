package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zze;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzffk implements zzddd {

    /* renamed from: a */
    private final HashSet f35689a = new HashSet();

    /* renamed from: c */
    private final Context f35690c;

    /* renamed from: d */
    private final zzcgc f35691d;

    public zzffk(Context context, zzcgc zzcgc) {
        this.f35690c = context;
        this.f35691d = zzcgc;
    }

    /* renamed from: a */
    public final Bundle mo45675a() {
        return this.f35691d.mo43544j(this.f35690c, this);
    }

    /* renamed from: b */
    public final synchronized void mo45676b(HashSet hashSet) {
        this.f35689a.clear();
        this.f35689a.addAll(hashSet);
    }

    /* renamed from: r */
    public final synchronized void mo44382r(zze zze) {
        if (zze.f1934a != 3) {
            this.f35691d.mo43542h(this.f35689a);
        }
    }
}

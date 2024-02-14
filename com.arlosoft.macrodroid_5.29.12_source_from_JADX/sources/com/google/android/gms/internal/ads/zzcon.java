package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcon {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public zzcgv f29157a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f29158b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public WeakReference f29159c;

    /* renamed from: c */
    public final zzcon mo44217c(Context context) {
        this.f29159c = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f29158b = context;
        return this;
    }

    /* renamed from: d */
    public final zzcon mo44218d(zzcgv zzcgv) {
        this.f29157a = zzcgv;
        return this;
    }
}

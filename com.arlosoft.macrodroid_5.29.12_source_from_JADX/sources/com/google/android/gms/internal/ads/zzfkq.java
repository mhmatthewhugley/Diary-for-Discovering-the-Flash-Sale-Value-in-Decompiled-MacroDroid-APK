package com.google.android.gms.internal.ads;

import android.app.Application;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfkq {

    /* renamed from: a */
    private boolean f35991a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo45864a(Context context) {
        zzfly.m50528b(context, "Application Context cannot be null");
        if (!this.f35991a) {
            this.f35991a = true;
            zzflm.m50485b().mo45922c(context);
            zzflh a = zzflh.m50465a();
            if (context instanceof Application) {
                ((Application) context).registerActivityLifecycleCallbacks(a);
            }
            zzflw.m50521g(context);
            zzflj.m50475b().mo45913c(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo45865b() {
        return this.f35991a;
    }
}

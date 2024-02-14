package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzfio {

    /* renamed from: a */
    private final Executor f35845a;

    /* renamed from: b */
    private final zzcgu f35846b;

    public zzfio(Executor executor, zzcgu zzcgu) {
        this.f35845a = executor;
        this.f35846b = zzcgu;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo45772a(String str) {
        this.f35846b.mo20399o(str);
    }

    /* renamed from: b */
    public final void mo45773b(String str) {
        this.f35845a.execute(new zzfin(this, str));
    }
}

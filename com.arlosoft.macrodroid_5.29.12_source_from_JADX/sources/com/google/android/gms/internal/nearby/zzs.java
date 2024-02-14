package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.nearby.exposurenotification.DailySummariesConfig;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final /* synthetic */ class zzs implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ zzax f45094a;

    /* renamed from: b */
    public final /* synthetic */ DailySummariesConfig f45095b;

    /* renamed from: a */
    public final void mo21401a(Object obj, Object obj2) {
        zzax zzax = this.f45094a;
        DailySummariesConfig dailySummariesConfig = this.f45095b;
        zzaj zzaj = new zzaj(zzax, (TaskCompletionSource) obj2);
        zzbc zzbc = new zzbc();
        zzbc.mo52547b(zzaj);
        zzbc.mo52546a(dailySummariesConfig);
        ((zzdr) ((zzn) obj).mo21626I()).mo52617Q7(zzbc.mo52548c());
    }
}

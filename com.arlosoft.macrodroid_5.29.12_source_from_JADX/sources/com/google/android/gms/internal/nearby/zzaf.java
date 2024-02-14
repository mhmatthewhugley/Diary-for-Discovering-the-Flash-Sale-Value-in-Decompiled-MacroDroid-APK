package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.nearby.exposurenotification.DiagnosisKeyFileProvider;
import com.google.android.gms.nearby.exposurenotification.ExposureConfiguration;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final /* synthetic */ class zzaf implements RemoteCall {

    /* renamed from: a */
    public final /* synthetic */ zzax f44537a;

    /* renamed from: b */
    public final /* synthetic */ ExposureConfiguration f44538b;

    /* renamed from: c */
    public final /* synthetic */ DiagnosisKeyFileProvider f44539c;

    /* renamed from: d */
    public final /* synthetic */ String f44540d;

    public /* synthetic */ zzaf(zzax zzax, ExposureConfiguration exposureConfiguration, DiagnosisKeyFileProvider diagnosisKeyFileProvider, String str) {
        this.f44537a = zzax;
        this.f44538b = exposureConfiguration;
        this.f44539c = diagnosisKeyFileProvider;
        this.f44540d = str;
    }

    /* renamed from: a */
    public final void mo21401a(Object obj, Object obj2) {
        zzax zzax = this.f44537a;
        ExposureConfiguration exposureConfiguration = this.f44538b;
        DiagnosisKeyFileProvider diagnosisKeyFileProvider = this.f44539c;
        String str = this.f44540d;
        zzed zzed = new zzed();
        zzed.mo52638b(exposureConfiguration);
        zzed.mo52637a(new zzat(zzax, diagnosisKeyFileProvider));
        zzed.mo52640d(new zzao((TaskCompletionSource) obj2));
        zzed.mo52641e(str);
        ((zzdr) ((zzn) obj).mo21626I()).mo52628x9(zzed.mo52642f());
    }
}

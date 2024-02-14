package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.exposurenotification.DiagnosisKeysDataMapping;

@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzep {

    /* renamed from: a */
    private final zzer f44608a = new zzer((zzeq) null);

    /* renamed from: a */
    public final zzep mo52663a(DiagnosisKeysDataMapping diagnosisKeysDataMapping) {
        this.f44608a.f44610c = diagnosisKeysDataMapping;
        return this;
    }

    /* renamed from: b */
    public final zzep mo52664b(IStatusCallback iStatusCallback) {
        this.f44608a.f44609a = iStatusCallback;
        return this;
    }

    /* renamed from: c */
    public final zzer mo52665c() {
        return this.f44608a;
    }
}

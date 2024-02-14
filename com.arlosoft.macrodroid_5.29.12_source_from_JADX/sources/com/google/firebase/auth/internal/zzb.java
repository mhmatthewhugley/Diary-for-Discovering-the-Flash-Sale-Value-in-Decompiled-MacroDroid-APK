package com.google.firebase.auth.internal;

import android.app.Activity;
import com.google.android.gms.safetynet.SafetyNetApi;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzb implements OnSuccessListener {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f4629a;

    /* renamed from: b */
    final /* synthetic */ FirebaseAuth f4630b;

    /* renamed from: c */
    final /* synthetic */ zzbm f4631c;

    /* renamed from: d */
    final /* synthetic */ Activity f4632d;

    /* renamed from: e */
    final /* synthetic */ zzf f4633e;

    zzb(zzf zzf, TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, zzbm zzbm, Activity activity) {
        this.f4633e = zzf;
        this.f4629a = taskCompletionSource;
        this.f4630b = firebaseAuth;
        this.f4631c = zzbm;
        this.f4632d = activity;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo22751b(Object obj) {
        SafetyNetApi.AttestationResponse attestationResponse = (SafetyNetApi.AttestationResponse) obj;
        if (zzbf.m6212a(attestationResponse)) {
            this.f4629a.mo56139c(new zze(attestationResponse.mo56072h(), (String) null));
        } else {
            this.f4633e.m6249e(this.f4630b, this.f4631c, this.f4632d, this.f4629a);
        }
    }
}

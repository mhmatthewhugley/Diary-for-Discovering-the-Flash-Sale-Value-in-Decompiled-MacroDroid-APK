package com.google.android.gms.internal.p204firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzya */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzya {

    /* renamed from: a */
    private final zzyb f40618a;

    /* renamed from: b */
    private final TaskCompletionSource f40619b;

    public zzya(zzyb zzyb, TaskCompletionSource taskCompletionSource) {
        this.f40618a = zzyb;
        this.f40619b = taskCompletionSource;
    }

    /* renamed from: a */
    public final void mo50065a(Object obj, Status status) {
        Preconditions.m4489l(this.f40619b, "completion source cannot be null");
        if (status != null) {
            zzyb zzyb = this.f40618a;
            if (zzyb.f40637r != null) {
                TaskCompletionSource taskCompletionSource = this.f40619b;
                FirebaseAuth instance = FirebaseAuth.getInstance(zzyb.f40622c);
                zzyb zzyb2 = this.f40618a;
                taskCompletionSource.mo56138b(zzxc.m58361c(instance, zzyb2.f40637r, ("reauthenticateWithCredential".equals(zzyb2.zza()) || "reauthenticateWithCredentialWithData".equals(this.f40618a.zza())) ? this.f40618a.f40623d : null));
                return;
            }
            AuthCredential authCredential = zzyb.f40634o;
            if (authCredential != null) {
                this.f40619b.mo56138b(zzxc.m58360b(status, authCredential, zzyb.f40635p, zzyb.f40636q));
            } else {
                this.f40619b.mo56138b(zzxc.m58359a(status));
            }
        } else {
            this.f40619b.mo56139c(obj);
        }
    }
}

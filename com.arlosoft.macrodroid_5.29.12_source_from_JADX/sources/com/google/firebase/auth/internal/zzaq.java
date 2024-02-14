package com.google.firebase.auth.internal;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthResult;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzaq implements OnSuccessListener {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f4606a;

    /* renamed from: b */
    final /* synthetic */ Context f4607b;

    zzaq(zzax zzax, TaskCompletionSource taskCompletionSource, Context context) {
        this.f4606a = taskCompletionSource;
        this.f4607b = context;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo22751b(Object obj) {
        this.f4606a.mo56139c((AuthResult) obj);
        zzax.m6189e(this.f4607b);
    }
}

package com.google.android.gms.internal.p204firebaseauthapi;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnFailureListener;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyr */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzyr implements OnFailureListener {
    zzyr(zzyv zzyv) {
    }

    /* renamed from: c */
    public final void mo22733c(@NonNull Exception exc) {
        zzyv.f40669d.mo21839c("SmsRetrieverClient failed to start: ".concat(String.valueOf(exc.getMessage())), new Object[0]);
    }
}

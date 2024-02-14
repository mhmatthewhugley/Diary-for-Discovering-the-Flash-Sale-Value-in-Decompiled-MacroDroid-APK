package com.google.firebase.appindexing.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.appindexing.FirebaseAppIndexingException;
import com.google.firebase.appindexing.FirebaseAppIndexingInvalidArgumentException;
import com.google.firebase.appindexing.FirebaseAppIndexingTooManyArgumentsException;
import com.google.firebase.appindexing.zza;
import com.google.firebase.appindexing.zzb;

/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class zzaf {
    /* renamed from: a */
    public static FirebaseAppIndexingException m74511a(@NonNull Status status, String str) {
        Preconditions.m4488k(status);
        String o2 = status.mo21295o2();
        if (o2 != null && !o2.isEmpty()) {
            str = o2;
        }
        switch (status.mo21294n2()) {
            case 17510:
                return new FirebaseAppIndexingInvalidArgumentException(str);
            case 17511:
                return new FirebaseAppIndexingTooManyArgumentsException(str);
            case 17513:
                return new zzb(str);
            case 17514:
                return new zza(str);
            default:
                return new FirebaseAppIndexingException(str);
        }
    }
}

package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.IntentSender;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class ResolvingResultCallbacks<R extends Result> extends ResultCallbacks<R> {

    /* renamed from: a */
    private final Activity f3128a;

    /* renamed from: c */
    private final int f3129c;

    @KeepForSdk
    /* renamed from: a */
    public final void mo21276a(@NonNull Status status) {
        if (status.mo21296p2()) {
            try {
                status.mo21298r2(this.f3128a, this.f3129c);
            } catch (IntentSender.SendIntentException e) {
                Log.e("ResolvingResultCallback", "Failed to start resolution", e);
                mo21277c(new Status(8));
            }
        } else {
            mo21277c(status);
        }
    }

    /* renamed from: c */
    public abstract void mo21277c(@NonNull Status status);
}

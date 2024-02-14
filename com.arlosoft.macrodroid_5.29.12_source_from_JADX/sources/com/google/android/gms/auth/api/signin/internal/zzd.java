package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.util.Log;
import androidx.loader.content.AsyncTaskLoader;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zzd extends AsyncTaskLoader<Void> implements SignInConnectionListener {

    /* renamed from: a */
    private Semaphore f2929a = new Semaphore(0);

    /* renamed from: b */
    private Set<GoogleApiClient> f2930b;

    public zzd(Context context, Set<GoogleApiClient> set) {
        super(context);
        this.f2930b = set;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Void loadInBackground() {
        int i = 0;
        for (GoogleApiClient n : this.f2930b) {
            if (n.mo21257n(this)) {
                i++;
            }
        }
        try {
            this.f2929a.tryAcquire(i, 5, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    public final void onComplete() {
        this.f2929a.release();
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        this.f2929a.drainPermits();
        forceLoad();
    }
}

package com.google.firebase.storage.internal;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.appcheck.interop.InternalAppCheckTokenProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.storage.network.NetworkRequest;
import java.util.Random;

public class ExponentialBackoffSender {

    /* renamed from: f */
    private static final Random f55493f = new Random();

    /* renamed from: g */
    static Sleeper f55494g = new SleeperImpl();

    /* renamed from: h */
    static Clock f55495h = DefaultClock.m4871d();

    /* renamed from: a */
    private final Context f55496a;
    @Nullable

    /* renamed from: b */
    private final InternalAuthProvider f55497b;
    @Nullable

    /* renamed from: c */
    private final InternalAppCheckTokenProvider f55498c;

    /* renamed from: d */
    private long f55499d;

    /* renamed from: e */
    private volatile boolean f55500e;

    public ExponentialBackoffSender(Context context, @Nullable InternalAuthProvider internalAuthProvider, @Nullable InternalAppCheckTokenProvider internalAppCheckTokenProvider, long j) {
        this.f55496a = context;
        this.f55497b = internalAuthProvider;
        this.f55498c = internalAppCheckTokenProvider;
        this.f55499d = j;
    }

    /* renamed from: a */
    public void mo63714a() {
        this.f55500e = true;
    }

    /* renamed from: b */
    public boolean mo63715b(int i) {
        return (i >= 500 && i < 600) || i == -2 || i == 429 || i == 408;
    }

    /* renamed from: c */
    public void mo63716c() {
        this.f55500e = false;
    }

    /* renamed from: d */
    public void mo63717d(@NonNull NetworkRequest networkRequest) {
        mo63718e(networkRequest, true);
    }

    /* renamed from: e */
    public void mo63718e(@NonNull NetworkRequest networkRequest, boolean z) {
        Preconditions.m4488k(networkRequest);
        long c = f55495h.mo21952c() + this.f55499d;
        if (z) {
            networkRequest.mo63728C(Util.m77615c(this.f55497b), Util.m77614b(this.f55498c), this.f55496a);
        } else {
            networkRequest.mo63730E(Util.m77615c(this.f55497b), Util.m77614b(this.f55498c));
        }
        int i = 1000;
        while (f55495h.mo21952c() + ((long) i) <= c && !networkRequest.mo63747w() && mo63715b(networkRequest.mo63741p())) {
            try {
                f55494g.mo63719a(f55493f.nextInt(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) + i);
                if (i < 30000) {
                    if (networkRequest.mo63741p() != -2) {
                        i *= 2;
                        Log.w("ExponenentialBackoff", "network error occurred, backing off/sleeping.");
                    } else {
                        Log.w("ExponenentialBackoff", "network unavailable, sleeping.");
                        i = 1000;
                    }
                }
                if (!this.f55500e) {
                    networkRequest.mo63731G();
                    if (z) {
                        networkRequest.mo63728C(Util.m77615c(this.f55497b), Util.m77614b(this.f55498c), this.f55496a);
                    } else {
                        networkRequest.mo63730E(Util.m77615c(this.f55497b), Util.m77614b(this.f55498c));
                    }
                } else {
                    return;
                }
            } catch (InterruptedException unused) {
                Log.w("ExponenentialBackoff", "thread interrupted during exponential backoff.");
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}

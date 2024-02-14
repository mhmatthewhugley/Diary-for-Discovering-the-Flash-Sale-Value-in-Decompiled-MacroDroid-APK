package com.google.android.gms.internal.mlkit_translate;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzov {
    @Nullable

    /* renamed from: e */
    private static zzov f44372e;

    /* renamed from: a */
    private final zzot f44373a;

    /* renamed from: b */
    private final zzpa f44374b;

    /* renamed from: c */
    private final zzoy f44375c;
    @Nullable

    /* renamed from: d */
    private zzpb f44376d;

    @VisibleForTesting
    public zzov(Context context, zzou zzou) {
        zzoy zzoy = new zzoy(context);
        this.f44375c = zzoy;
        this.f44374b = new zzpa(context);
        this.f44373a = new zzot(zzou, zzoy);
    }

    /* renamed from: b */
    public static synchronized zzov m62099b(Context context) {
        zzov zzov;
        synchronized (zzov.class) {
            if (f44372e == null) {
                f44372e = new zzov(context, zzpc.f44397a);
            }
            zzov = f44372e;
        }
        return zzov;
    }

    /* renamed from: a */
    public final zzop mo52382a() {
        Preconditions.m4493p(this.f44376d != null);
        return this.f44376d.mo52399b();
    }

    /* renamed from: c */
    public final String mo52383c() throws InterruptedException {
        boolean z = true;
        Preconditions.m4493p(this.f44376d != null);
        Preconditions.m4493p(this.f44376d != null);
        if (this.f44376d.mo52402e()) {
            zzox zzox = new zzox();
            zzox.mo52391g();
            try {
                if (this.f44373a.mo52377c(zzox)) {
                    this.f44376d = this.f44373a.mo52375a();
                }
            } finally {
                zzox.mo52389e();
                this.f44375c.mo52393a(zzle.INSTALLATION_ID_REFRESH_TEMPORARY_TOKEN, zzox);
            }
        }
        if (this.f44376d == null) {
            z = false;
        }
        Preconditions.m4493p(z);
        return this.f44376d.mo52401d();
    }

    /* renamed from: d */
    public final void mo52384d() throws IOException, InterruptedException {
        zzox zzox;
        zzoy zzoy;
        zzle zzle;
        zzox zzox2 = new zzox();
        zzox2.mo52391g();
        try {
            zzpb a = this.f44374b.mo52395a(zzox2);
            if (a != null) {
                this.f44376d = a;
            } else {
                zzox = new zzox();
                zzox.mo52391g();
                if (!zzrd.m62241a(new zzos(this.f44373a, new zzop(zzow.m62103a()), zzox))) {
                    zzox.mo52388d(zznk.RPC_EXPONENTIAL_BACKOFF_FAILED);
                    zzox.mo52388d(zznk.RPC_ERROR);
                    zzox.mo52389e();
                    zzoy = this.f44375c;
                    zzle = zzle.INSTALLATION_ID_REGISTER_NEW_ID;
                } else {
                    zzpb a2 = this.f44373a.mo52375a();
                    this.f44376d = a2;
                    if (a2 != null) {
                        this.f44374b.mo52397c(a2, zzox);
                    }
                    zzox.mo52389e();
                    zzoy = this.f44375c;
                    zzle = zzle.INSTALLATION_ID_REGISTER_NEW_ID;
                }
                zzoy.mo52393a(zzle, zzox);
            }
            zzox2.mo52389e();
            this.f44375c.mo52393a(zzle.INSTALLATION_ID_INIT, zzox2);
        } catch (Throwable th) {
            zzox2.mo52389e();
            this.f44375c.mo52393a(zzle.INSTALLATION_ID_INIT, zzox2);
            throw th;
        }
    }
}

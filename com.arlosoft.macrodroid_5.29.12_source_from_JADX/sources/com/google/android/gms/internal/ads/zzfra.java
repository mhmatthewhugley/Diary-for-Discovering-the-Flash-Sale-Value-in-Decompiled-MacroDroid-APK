package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzfra {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final zzfrn f36299c = new zzfrn("OverlayDisplayService");

    /* renamed from: d */
    private static final Intent f36300d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    @VisibleForTesting
    @Nullable

    /* renamed from: a */
    final zzfry f36301a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f36302b;

    zzfra(Context context) {
        if (zzfsb.m50910a(context)) {
            this.f36301a = new zzfry(context.getApplicationContext(), f36299c, "OverlayDisplayService", f36300d, zzfqv.f36283a, (zzfrt) null, (byte[]) null);
        } else {
            this.f36301a = null;
        }
        this.f36302b = context.getPackageName();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo46133c() {
        if (this.f36301a != null) {
            f36299c.mo46143d("unbind LMD display overlay service", new Object[0]);
            this.f36301a.mo46156r();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo46134d(zzfqr zzfqr, zzfrf zzfrf) {
        if (this.f36301a == null) {
            f36299c.mo46141b("error: %s", "Play Store not found.");
            return;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f36301a.mo46154p(new zzfqx(this, taskCompletionSource, zzfqr, zzfrf, taskCompletionSource), taskCompletionSource);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo46135e(zzfrc zzfrc, zzfrf zzfrf) {
        if (this.f36301a == null) {
            f36299c.mo46141b("error: %s", "Play Store not found.");
        } else if (zzfrc.mo46106g() == null) {
            f36299c.mo46141b("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
            zzfrd c = zzfre.m50856c();
            c.mo46112b(8160);
            zzfrf.mo20228a(c.mo46113c());
        } else {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f36301a.mo46154p(new zzfqw(this, taskCompletionSource, zzfrc, zzfrf, taskCompletionSource), taskCompletionSource);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo46136f(zzfrh zzfrh, zzfrf zzfrf, int i) {
        if (this.f36301a == null) {
            f36299c.mo46141b("error: %s", "Play Store not found.");
            return;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f36301a.mo46154p(new zzfqy(this, taskCompletionSource, zzfrh, i, zzfrf, taskCompletionSource), taskCompletionSource);
    }
}

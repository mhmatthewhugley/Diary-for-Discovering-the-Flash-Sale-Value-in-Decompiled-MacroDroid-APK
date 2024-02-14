package com.google.firebase.appindexing.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.TaskCompletionSource;

@VisibleForTesting
/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
final class zzn {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzz f53871a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final TaskCompletionSource<Void> f53872b;

    /* renamed from: c */
    final /* synthetic */ zzo f53873c;

    /* renamed from: a */
    public final void mo62032a() {
        synchronized (this.f53873c.f53876d) {
            Preconditions.m4493p(this.f53873c.f53877f == 0);
            int unused = this.f53873c.f53877f = 1;
        }
        this.f53873c.f53874a.mo21235u(new zzm(this, (zzi) null)).mo23706g(this.f53873c, new zzk(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo62033b(Exception exc) {
        zzn zzn;
        synchronized (this.f53873c.f53876d) {
            if (this.f53873c.f53876d.peek() == this) {
                this.f53873c.f53876d.remove();
                int unused = this.f53873c.f53877f = 0;
                zzn = (zzn) this.f53873c.f53876d.peek();
            } else {
                zzn = null;
            }
        }
        this.f53872b.mo56140d(exc);
        if (zzn != null) {
            zzn.mo62032a();
        }
    }
}

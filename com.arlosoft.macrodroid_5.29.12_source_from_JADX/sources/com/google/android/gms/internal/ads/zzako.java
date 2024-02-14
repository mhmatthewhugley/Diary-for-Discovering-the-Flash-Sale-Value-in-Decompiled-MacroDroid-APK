package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzako {

    /* renamed from: c */
    public static final boolean f24905c = zzakp.f24909b;

    /* renamed from: a */
    private final List f24906a = new ArrayList();

    /* renamed from: b */
    private boolean f24907b = false;

    zzako() {
    }

    /* renamed from: a */
    public final synchronized void mo41608a(String str, long j) {
        if (!this.f24907b) {
            this.f24906a.add(new zzakn(str, j, SystemClock.elapsedRealtime()));
        } else {
            throw new IllegalStateException("Marker added to finished log");
        }
    }

    /* renamed from: b */
    public final synchronized void mo41609b(String str) {
        long j;
        this.f24907b = true;
        if (this.f24906a.size() == 0) {
            j = 0;
        } else {
            long j2 = ((zzakn) this.f24906a.get(0)).f24904c;
            List list = this.f24906a;
            j = ((zzakn) list.get(list.size() - 1)).f24904c - j2;
        }
        if (j > 0) {
            long j3 = ((zzakn) this.f24906a.get(0)).f24904c;
            zzakp.m41660a("(%-4d ms) %s", Long.valueOf(j), str);
            for (zzakn zzakn : this.f24906a) {
                long j4 = zzakn.f24904c;
                zzakp.m41660a("(+%-4d) [%2d] %s", Long.valueOf(j4 - j3), Long.valueOf(zzakn.f24903b), zzakn.f24902a);
                j3 = j4;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        if (!this.f24907b) {
            mo41609b("Request on the loose");
            zzakp.m41661b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }
}

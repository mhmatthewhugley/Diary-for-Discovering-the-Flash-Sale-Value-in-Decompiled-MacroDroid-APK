package com.google.android.play.core.tasks;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzq implements zzp {

    /* renamed from: a */
    private final Object f51983a;

    /* renamed from: b */
    private final int f51984b;

    /* renamed from: c */
    private final zzm f51985c;
    @GuardedBy("lock")

    /* renamed from: d */
    private int f51986d;
    @GuardedBy("lock")

    /* renamed from: e */
    private int f51987e;
    @GuardedBy("lock")

    /* renamed from: f */
    private Exception f51988f;

    @GuardedBy("lock")
    /* renamed from: a */
    private final void m71290a() {
        if (this.f51986d + this.f51987e != this.f51984b) {
            return;
        }
        if (this.f51988f != null) {
            zzm zzm = this.f51985c;
            int i = this.f51987e;
            int i2 = this.f51984b;
            StringBuilder sb = new StringBuilder(54);
            sb.append(i);
            sb.append(" out of ");
            sb.append(i2);
            sb.append(" underlying tasks failed");
            zzm.mo60037j(new ExecutionException(sb.toString(), this.f51988f));
            return;
        }
        this.f51985c.mo60038k((Object) null);
    }

    /* renamed from: b */
    public final void mo32242b(Object obj) {
        synchronized (this.f51983a) {
            this.f51986d++;
            m71290a();
        }
    }

    /* renamed from: c */
    public final void mo32241c(@NonNull Exception exc) {
        synchronized (this.f51983a) {
            this.f51987e++;
            this.f51988f = exc;
            m71290a();
        }
    }
}

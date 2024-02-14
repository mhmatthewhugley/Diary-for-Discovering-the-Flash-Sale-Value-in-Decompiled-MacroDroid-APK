package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class zzaf<T> implements zzae<T> {

    /* renamed from: a */
    private final Object f48002a = new Object();

    /* renamed from: b */
    private final int f48003b;

    /* renamed from: c */
    private final zzw f48004c;

    /* renamed from: d */
    private int f48005d;

    /* renamed from: e */
    private int f48006e;

    /* renamed from: f */
    private int f48007f;

    /* renamed from: g */
    private Exception f48008g;

    /* renamed from: h */
    private boolean f48009h;

    public zzaf(int i, zzw zzw) {
        this.f48003b = i;
        this.f48004c = zzw;
    }

    /* renamed from: a */
    private final void m66683a() {
        if (this.f48005d + this.f48006e + this.f48007f != this.f48003b) {
            return;
        }
        if (this.f48008g != null) {
            zzw zzw = this.f48004c;
            int i = this.f48006e;
            int i2 = this.f48003b;
            zzw.mo56160w(new ExecutionException(i + " out of " + i2 + " underlying tasks failed", this.f48008g));
        } else if (this.f48009h) {
            this.f48004c.mo56162y();
        } else {
            this.f48004c.mo56161x((Object) null);
        }
    }

    /* renamed from: b */
    public final void mo22751b(T t) {
        synchronized (this.f48002a) {
            this.f48005d++;
            m66683a();
        }
    }

    /* renamed from: c */
    public final void mo22733c(@NonNull Exception exc) {
        synchronized (this.f48002a) {
            this.f48006e++;
            this.f48008g = exc;
            m66683a();
        }
    }

    /* renamed from: d */
    public final void mo30644d() {
        synchronized (this.f48002a) {
            this.f48007f++;
            this.f48009h = true;
            m66683a();
        }
    }
}

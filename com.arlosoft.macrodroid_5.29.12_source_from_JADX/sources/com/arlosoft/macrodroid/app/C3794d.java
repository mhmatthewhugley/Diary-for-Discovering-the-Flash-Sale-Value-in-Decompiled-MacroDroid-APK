package com.arlosoft.macrodroid.app;

import kotlin.jvm.internal.C13706o;
import p292io.reactivex.subjects.C13244c;
import p414v9.C16727a;
import p414v9.C16732f;

/* renamed from: com.arlosoft.macrodroid.app.d */
/* compiled from: ServiceInitialisation.kt */
public final class C3794d {

    /* renamed from: a */
    private final C13244c<Boolean> f9917a;

    public C3794d() {
        C13244c<Boolean> i0 = C13244c.m85607i0();
        C13706o.m87928e(i0, "create()");
        this.f9917a = i0;
    }

    /* renamed from: a */
    public final C16732f<Boolean> mo27319a() {
        C16732f<Boolean> d0 = this.f9917a.mo79699d0(C16727a.BUFFER);
        C13706o.m87928e(d0, "serviceInitSubject.toFlo…kpressureStrategy.BUFFER)");
        return d0;
    }

    /* renamed from: b */
    public final void mo27320b() {
        this.f9917a.onNext(Boolean.TRUE);
    }
}

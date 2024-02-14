package com.arlosoft.macrodroid.templatestore.p071ui.upload;

import kotlin.jvm.internal.C13706o;
import p292io.reactivex.subjects.C13244c;
import p414v9.C16727a;
import p414v9.C16732f;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.upload.a */
/* compiled from: TemplateRefreshNotifier.kt */
public final class C5496a {

    /* renamed from: a */
    private final C13244c<Boolean> f13442a;

    public C5496a() {
        C13244c<Boolean> i0 = C13244c.m85607i0();
        C13706o.m87928e(i0, "create()");
        this.f13442a = i0;
    }

    /* renamed from: a */
    public final void mo30747a() {
        this.f13442a.onNext(Boolean.TRUE);
    }

    /* renamed from: b */
    public final C16732f<Boolean> mo30748b() {
        C16732f<Boolean> d0 = this.f13442a.mo79699d0(C16727a.LATEST);
        C13706o.m87928e(d0, "templateRefreshSubject.t…kpressureStrategy.LATEST)");
        return d0;
    }
}

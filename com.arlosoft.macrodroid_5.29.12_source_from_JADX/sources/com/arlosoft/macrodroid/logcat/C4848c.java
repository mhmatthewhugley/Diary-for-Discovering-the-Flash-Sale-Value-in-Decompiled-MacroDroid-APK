package com.arlosoft.macrodroid.logcat;

import java.util.List;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.logcat.c */
/* compiled from: LogcatMessageRepository.kt */
public final class C4848c {

    /* renamed from: a */
    private List<LogcatMessage> f12200a = C13614t.m87748j();

    /* renamed from: a */
    public final void mo29390a() {
        this.f12200a = C13614t.m87748j();
    }

    /* renamed from: b */
    public final List<LogcatMessage> mo29391b() {
        return this.f12200a;
    }

    /* renamed from: c */
    public final void mo29392c(List<LogcatMessage> list) {
        C13706o.m87929f(list, "logcatMessageList");
        this.f12200a = list;
    }
}

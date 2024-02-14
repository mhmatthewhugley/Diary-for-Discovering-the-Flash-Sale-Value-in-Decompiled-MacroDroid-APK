package org.mockito.internal.exceptions.stacktrace;

import java.io.Serializable;
import p409ud.C16699b;
import p427wd.C16842b;

/* renamed from: org.mockito.internal.exceptions.stacktrace.a */
/* compiled from: ConditionalStackTraceFilter */
public class C16075a implements Serializable {
    private static final long serialVersionUID = -8085849703510292641L;
    private final C16699b config = new C16842b();
    private final C16077c filter = new C16077c();

    /* renamed from: a */
    public void mo78408a(Throwable th) {
        if (this.config.mo79606a()) {
            th.setStackTrace(this.filter.mo78409a(th.getStackTrace(), true));
        }
    }
}

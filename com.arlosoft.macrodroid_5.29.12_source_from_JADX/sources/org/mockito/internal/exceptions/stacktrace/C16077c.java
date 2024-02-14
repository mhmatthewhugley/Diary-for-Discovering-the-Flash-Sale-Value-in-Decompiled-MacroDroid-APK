package org.mockito.internal.exceptions.stacktrace;

import java.io.Serializable;
import java.util.ArrayList;
import p418vd.C16770a;
import p436xd.C16935g;

/* renamed from: org.mockito.internal.exceptions.stacktrace.c */
/* compiled from: StackTraceFilter */
public class C16077c implements Serializable {

    /* renamed from: a */
    private static final C16770a f66038a = C16935g.m100060b().getStackTraceCleaner(new C16076b());
    static final long serialVersionUID = -5499819791513105700L;

    /* renamed from: a */
    public StackTraceElement[] mo78409a(StackTraceElement[] stackTraceElementArr, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (f66038a.isIn(stackTraceElement)) {
                arrayList.add(stackTraceElement);
            }
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[arrayList.size()]);
    }
}

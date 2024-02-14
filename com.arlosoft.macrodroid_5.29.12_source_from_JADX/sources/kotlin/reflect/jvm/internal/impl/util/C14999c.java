package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import kotlin.jvm.internal.C13695i;
import p379ra.C16368a;

/* renamed from: kotlin.reflect.jvm.internal.impl.util.c */
/* compiled from: ArrayMap.kt */
public abstract class C14999c<T> implements Iterable<T>, C16368a {
    private C14999c() {
    }

    public /* synthetic */ C14999c(C13695i iVar) {
        this();
    }

    /* renamed from: c */
    public abstract int mo74260c();

    /* renamed from: d */
    public abstract void mo74261d(int i, T t);

    public abstract T get(int i);

    public abstract Iterator<T> iterator();
}

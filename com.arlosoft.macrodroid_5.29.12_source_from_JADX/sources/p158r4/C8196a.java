package p158r4;

import androidx.annotation.NonNull;
import p090f5.C7315j;
import p120k4.C7587c;

/* renamed from: r4.a */
/* compiled from: SimpleResource */
public class C8196a<T> implements C7587c<T> {

    /* renamed from: a */
    protected final T f19868a;

    public C8196a(@NonNull T t) {
        this.f19868a = C7315j.m30204d(t);
    }

    @NonNull
    /* renamed from: b */
    public Class<T> mo33103b() {
        return this.f19868a.getClass();
    }

    @NonNull
    public final T get() {
        return this.f19868a;
    }

    public final int getSize() {
        return 1;
    }

    public void recycle() {
    }
}

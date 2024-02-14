package p382rd;

import java.util.ArrayList;

/* renamed from: rd.e */
/* compiled from: ParseErrorList */
public class C16412e extends ArrayList<C16411d> {
    private final int initialCapacity;
    private final int maxSize;

    C16412e(int i, int i2) {
        super(i);
        this.initialCapacity = i;
        this.maxSize = i2;
    }

    /* renamed from: f */
    public static C16412e m98321f() {
        return new C16412e(0, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo79191c() {
        return size() < this.maxSize;
    }

    public Object clone() {
        return super.clone();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo79193d() {
        return this.maxSize;
    }
}

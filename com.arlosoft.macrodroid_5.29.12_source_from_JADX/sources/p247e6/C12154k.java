package p247e6;

import androidx.annotation.NonNull;

/* renamed from: e6.k */
/* compiled from: ItemDraggableRange */
public class C12154k {

    /* renamed from: a */
    private final int f58508a;

    /* renamed from: b */
    private final int f58509b;

    public C12154k(int i, int i2) {
        if (i <= i2) {
            this.f58508a = i;
            this.f58509b = i2;
            return;
        }
        throw new IllegalArgumentException("end position (= " + i2 + ") is smaller than start position (=" + i + ")");
    }

    /* renamed from: a */
    public boolean mo68395a(int i) {
        return i >= this.f58508a && i <= this.f58509b;
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: b */
    public String mo68396b() {
        return "ItemDraggableRange";
    }

    /* renamed from: c */
    public int mo68397c() {
        return this.f58509b;
    }

    /* renamed from: d */
    public int mo68398d() {
        return this.f58508a;
    }

    @NonNull
    public String toString() {
        return mo68396b() + "{mStart=" + this.f58508a + ", mEnd=" + this.f58509b + '}';
    }
}

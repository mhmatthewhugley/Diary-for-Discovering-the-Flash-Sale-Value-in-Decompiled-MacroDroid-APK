package p067c5;

import androidx.annotation.NonNull;
import p090f5.C7316k;

@Deprecated
/* renamed from: c5.f */
/* compiled from: SimpleTarget */
public abstract class C2276f<Z> extends C2271a<Z> {

    /* renamed from: b */
    private final int f6980b;

    /* renamed from: c */
    private final int f6981c;

    public C2276f() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: a */
    public final void mo24595a(@NonNull C2277g gVar) {
        if (C7316k.m30223r(this.f6980b, this.f6981c)) {
            gVar.mo24546d(this.f6980b, this.f6981c);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.f6980b + " and height: " + this.f6981c + ", either provide dimensions in the constructor or call override()");
    }

    /* renamed from: f */
    public void mo24596f(@NonNull C2277g gVar) {
    }

    public C2276f(int i, int i2) {
        this.f6980b = i;
        this.f6981c = i2;
    }
}

package p292io.grpc.internal;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;

/* renamed from: io.grpc.internal.l0 */
/* compiled from: ForwardingReadableBuffer */
public abstract class C12732l0 implements C12798s1 {

    /* renamed from: a */
    private final C12798s1 f59991a;

    public C12732l0(C12798s1 s1Var) {
        this.f59991a = (C12798s1) Preconditions.m5393t(s1Var, "buf");
    }

    /* renamed from: M1 */
    public void mo69460M1(byte[] bArr, int i, int i2) {
        this.f59991a.mo69460M1(bArr, i, i2);
    }

    /* renamed from: Y */
    public C12798s1 mo69461Y(int i) {
        return this.f59991a.mo69461Y(i);
    }

    /* renamed from: l */
    public int mo69462l() {
        return this.f59991a.mo69462l();
    }

    public int readUnsignedByte() {
        return this.f59991a.readUnsignedByte();
    }

    public String toString() {
        return MoreObjects.m5334c(this).mo22194d("delegate", this.f59991a).toString();
    }
}

package p360p9;

import p226cd.C11179b;
import p292io.grpc.internal.C12734l2;

/* renamed from: p9.n */
/* compiled from: OkHttpWritableBuffer */
class C16140n implements C12734l2 {

    /* renamed from: a */
    private final C11179b f66261a;

    /* renamed from: b */
    private int f66262b;

    /* renamed from: c */
    private int f66263c;

    C16140n(C11179b bVar, int i) {
        this.f66261a = bVar;
        this.f66262b = i;
    }

    /* renamed from: a */
    public int mo69465a() {
        return this.f66262b;
    }

    /* renamed from: b */
    public void mo69466b(byte b) {
        this.f66261a.writeByte(b);
        this.f66262b--;
        this.f66263c++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C11179b mo78521c() {
        return this.f66261a;
    }

    /* renamed from: l */
    public int mo69467l() {
        return this.f66263c;
    }

    public void release() {
    }

    public void write(byte[] bArr, int i, int i2) {
        this.f66261a.write(bArr, i, i2);
        this.f66262b -= i2;
        this.f66263c += i2;
    }
}

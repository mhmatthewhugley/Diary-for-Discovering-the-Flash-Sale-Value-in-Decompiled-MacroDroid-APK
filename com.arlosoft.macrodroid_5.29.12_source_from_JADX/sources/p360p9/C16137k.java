package p360p9;

import p226cd.C11179b;
import p292io.grpc.internal.C12614c;
import p292io.grpc.internal.C12798s1;

/* renamed from: p9.k */
/* compiled from: OkHttpReadableBuffer */
class C16137k extends C12614c {

    /* renamed from: a */
    private final C11179b f66259a;

    C16137k(C11179b bVar) {
        this.f66259a = bVar;
    }

    /* renamed from: M1 */
    public void mo69460M1(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            int read = this.f66259a.read(bArr, i, i2);
            if (read != -1) {
                i2 -= read;
                i += read;
            } else {
                throw new IndexOutOfBoundsException("EOF trying to read " + i2 + " bytes");
            }
        }
    }

    /* renamed from: Y */
    public C12798s1 mo69461Y(int i) {
        C11179b bVar = new C11179b();
        bVar.mo62384X(this.f66259a, (long) i);
        return new C16137k(bVar);
    }

    public void close() {
        this.f66259a.mo62424b();
    }

    /* renamed from: l */
    public int mo69462l() {
        return (int) this.f66259a.mo62399D();
    }

    public int readUnsignedByte() {
        return this.f66259a.readByte() & 255;
    }
}

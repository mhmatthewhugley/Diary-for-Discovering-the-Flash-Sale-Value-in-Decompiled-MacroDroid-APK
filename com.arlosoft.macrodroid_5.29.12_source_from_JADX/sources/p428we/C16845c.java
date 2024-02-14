package p428we;

/* renamed from: we.c */
/* compiled from: UnrecognizedExtraField */
public class C16845c implements C16846d {

    /* renamed from: a */
    private C16848f f68028a;

    /* renamed from: c */
    private byte[] f68029c;

    /* renamed from: e */
    private static byte[] m99844e(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    /* renamed from: a */
    public C16848f mo79958a() {
        return this.f68028a;
    }

    /* renamed from: b */
    public byte[] mo79959b() {
        return m99844e(this.f68029c);
    }

    /* renamed from: c */
    public C16848f mo79960c() {
        return new C16848f(this.f68029c.length);
    }

    /* renamed from: d */
    public void mo79962d(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        mo79973g(bArr2);
    }

    /* renamed from: f */
    public void mo79972f(C16848f fVar) {
        this.f68028a = fVar;
    }

    /* renamed from: g */
    public void mo79973g(byte[] bArr) {
        this.f68029c = m99844e(bArr);
    }
}

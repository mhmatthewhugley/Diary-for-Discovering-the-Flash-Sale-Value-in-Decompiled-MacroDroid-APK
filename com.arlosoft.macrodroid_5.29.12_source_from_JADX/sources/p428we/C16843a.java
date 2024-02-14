package p428we;

import androidx.core.app.FrameMetricsAggregator;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* renamed from: we.a */
/* compiled from: AsiExtraField */
public class C16843a implements C16846d, Cloneable {

    /* renamed from: E */
    private static final C16848f f68013E = new C16848f(30062);

    /* renamed from: A */
    private int f68014A = 0;

    /* renamed from: B */
    private String f68015B = "";

    /* renamed from: C */
    private boolean f68016C = false;

    /* renamed from: D */
    private CRC32 f68017D = new CRC32();

    /* renamed from: a */
    final int f68018a = 4095;

    /* renamed from: c */
    final int f68019c = 40960;

    /* renamed from: d */
    final int f68020d = 32768;

    /* renamed from: f */
    final int f68021f = 16384;

    /* renamed from: g */
    final int f68022g = FrameMetricsAggregator.EVERY_DURATION;

    /* renamed from: o */
    final int f68023o = 493;

    /* renamed from: p */
    final int f68024p = 420;

    /* renamed from: s */
    private int f68025s = 0;

    /* renamed from: z */
    private int f68026z = 0;

    /* renamed from: a */
    public C16848f mo79958a() {
        return f68013E;
    }

    /* renamed from: b */
    public byte[] mo79959b() {
        int c = mo79960c().mo79980c() - 4;
        byte[] bArr = new byte[c];
        System.arraycopy(C16848f.m99858b(mo79965g()), 0, bArr, 0, 2);
        byte[] bytes = mo79964f().getBytes();
        System.arraycopy(C16847e.m99855a((long) bytes.length), 0, bArr, 2, 4);
        System.arraycopy(C16848f.m99858b(mo79967k()), 0, bArr, 6, 2);
        System.arraycopy(C16848f.m99858b(mo79963e()), 0, bArr, 8, 2);
        System.arraycopy(bytes, 0, bArr, 10, bytes.length);
        this.f68017D.reset();
        this.f68017D.update(bArr);
        byte[] bArr2 = new byte[(c + 4)];
        System.arraycopy(C16847e.m99855a(this.f68017D.getValue()), 0, bArr2, 0, 4);
        System.arraycopy(bArr, 0, bArr2, 4, c);
        return bArr2;
    }

    /* renamed from: c */
    public C16848f mo79960c() {
        return new C16848f(mo79964f().getBytes().length + 14);
    }

    public Object clone() {
        try {
            C16843a aVar = (C16843a) super.clone();
            aVar.f68017D = new CRC32();
            return aVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public void mo79962d(byte[] bArr, int i, int i2) throws ZipException {
        long c = C16847e.m99856c(bArr, i);
        int i3 = i2 - 4;
        byte[] bArr2 = new byte[i3];
        boolean z = false;
        System.arraycopy(bArr, i + 4, bArr2, 0, i3);
        this.f68017D.reset();
        this.f68017D.update(bArr2);
        long value = this.f68017D.getValue();
        if (c == value) {
            int d = C16848f.m99859d(bArr2, 0);
            int c2 = (int) C16847e.m99856c(bArr2, 2);
            byte[] bArr3 = new byte[c2];
            this.f68026z = C16848f.m99859d(bArr2, 6);
            this.f68014A = C16848f.m99859d(bArr2, 8);
            if (c2 == 0) {
                this.f68015B = "";
            } else {
                System.arraycopy(bArr2, 10, bArr3, 0, c2);
                this.f68015B = new String(bArr3);
            }
            if ((d & 16384) != 0) {
                z = true;
            }
            mo79970o(z);
            mo79971p(d);
            return;
        }
        throw new ZipException("bad CRC checksum " + Long.toHexString(c) + " instead of " + Long.toHexString(value));
    }

    /* renamed from: e */
    public int mo79963e() {
        return this.f68014A;
    }

    /* renamed from: f */
    public String mo79964f() {
        return this.f68015B;
    }

    /* renamed from: g */
    public int mo79965g() {
        return this.f68025s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo79966h(int i) {
        int i2;
        if (mo79969n()) {
            i2 = 40960;
        } else {
            i2 = mo79968l() ? 16384 : 32768;
        }
        return (i & 4095) | i2;
    }

    /* renamed from: k */
    public int mo79967k() {
        return this.f68026z;
    }

    /* renamed from: l */
    public boolean mo79968l() {
        return this.f68016C && !mo79969n();
    }

    /* renamed from: n */
    public boolean mo79969n() {
        return mo79964f().length() != 0;
    }

    /* renamed from: o */
    public void mo79970o(boolean z) {
        this.f68016C = z;
        this.f68025s = mo79966h(this.f68025s);
    }

    /* renamed from: p */
    public void mo79971p(int i) {
        this.f68025s = mo79966h(i);
    }
}

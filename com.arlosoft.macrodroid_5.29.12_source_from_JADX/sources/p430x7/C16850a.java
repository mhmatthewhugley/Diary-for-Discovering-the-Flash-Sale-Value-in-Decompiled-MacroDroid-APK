package p430x7;

import java.io.ByteArrayInputStream;

/* renamed from: x7.a */
/* compiled from: ByteArray */
public class C16850a {

    /* renamed from: a */
    private byte[] f68040a;

    /* renamed from: b */
    private int f68041b;

    /* renamed from: c */
    private int f68042c;

    public C16850a(byte[] bArr, int i, int i2) {
        this.f68040a = bArr;
        this.f68041b = i;
        this.f68042c = i2;
    }

    /* renamed from: a */
    public byte[] mo79985a() {
        return this.f68040a;
    }

    /* renamed from: b */
    public int mo79986b() {
        return this.f68042c;
    }

    /* renamed from: c */
    public int mo79987c() {
        return this.f68041b;
    }

    /* renamed from: d */
    public ByteArrayInputStream mo79988d() {
        return new ByteArrayInputStream(this.f68040a, this.f68041b, this.f68042c);
    }

    public C16850a(int i) {
        this(new byte[i], 0, i);
    }
}

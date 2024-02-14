package p428we;

import androidx.core.view.MotionEventCompat;

/* renamed from: we.f */
/* compiled from: ZipShort */
public final class C16848f implements Cloneable {

    /* renamed from: a */
    private final int f68035a;

    public C16848f(int i) {
        this.f68035a = i;
    }

    /* renamed from: b */
    public static byte[] m99858b(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8)};
    }

    /* renamed from: d */
    public static int m99859d(byte[] bArr, int i) {
        return ((bArr[i + 1] << 8) & 65280) + (bArr[i] & 255);
    }

    /* renamed from: a */
    public byte[] mo79979a() {
        int i = this.f68035a;
        return new byte[]{(byte) (i & 255), (byte) ((i & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8)};
    }

    /* renamed from: c */
    public int mo79980c() {
        return this.f68035a;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C16848f) || this.f68035a != ((C16848f) obj).mo79980c()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f68035a;
    }

    public String toString() {
        return "ZipShort value: " + this.f68035a;
    }

    public C16848f(byte[] bArr, int i) {
        this.f68035a = m99859d(bArr, i);
    }
}

package p115j5;

/* renamed from: j5.g */
/* compiled from: NameN */
public final class C7466g extends C7465f {

    /* renamed from: c */
    final int[] f18314c;

    /* renamed from: d */
    final int f18315d;

    C7466g(String str, int i, int[] iArr, int i2) {
        super(str, i);
        if (i2 >= 3) {
            this.f18314c = iArr;
            this.f18315d = i2;
            return;
        }
        throw new IllegalArgumentException("Qlen must >= 3");
    }

    /* renamed from: a */
    public boolean mo37614a(int i) {
        return false;
    }

    /* renamed from: b */
    public boolean mo37615b(int i, int i2) {
        return false;
    }

    /* renamed from: c */
    public boolean mo37616c(int[] iArr, int i) {
        if (i != this.f18315d) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != this.f18314c[i2]) {
                return false;
            }
        }
        return true;
    }
}

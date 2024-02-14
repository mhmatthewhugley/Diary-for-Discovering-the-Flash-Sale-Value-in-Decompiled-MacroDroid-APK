package p292io.reactivex.internal.util;

/* renamed from: io.reactivex.internal.util.j */
/* compiled from: OpenHashSet */
public final class C13228j<T> {

    /* renamed from: a */
    final float f61119a;

    /* renamed from: b */
    int f61120b;

    /* renamed from: c */
    int f61121c;

    /* renamed from: d */
    int f61122d;

    /* renamed from: e */
    T[] f61123e;

    public C13228j() {
        this(16, 0.75f);
    }

    /* renamed from: c */
    static int m85561c(int i) {
        int i2 = i * -1640531527;
        return i2 ^ (i2 >>> 16);
    }

    /* renamed from: a */
    public boolean mo70056a(T t) {
        T t2;
        T[] tArr = this.f61123e;
        int i = this.f61120b;
        int c = m85561c(t.hashCode()) & i;
        T t3 = tArr[c];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                c = (c + 1) & i;
                t2 = tArr[c];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[c] = t;
        int i2 = this.f61121c + 1;
        this.f61121c = i2;
        if (i2 >= this.f61122d) {
            mo70058d();
        }
        return true;
    }

    /* renamed from: b */
    public Object[] mo70057b() {
        return this.f61123e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo70058d() {
        T[] tArr = this.f61123e;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = new Object[i];
        int i3 = this.f61121c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 != 0) {
                do {
                    length--;
                } while (tArr[length] == null);
                int c = m85561c(tArr[length].hashCode()) & i2;
                if (tArr2[c] != null) {
                    do {
                        c = (c + 1) & i2;
                    } while (tArr2[c] != null);
                }
                tArr2[c] = tArr[length];
                i3 = i4;
            } else {
                this.f61120b = i2;
                this.f61122d = (int) (((float) i) * this.f61119a);
                this.f61123e = tArr2;
                return;
            }
        }
    }

    /* renamed from: e */
    public boolean mo70059e(T t) {
        T t2;
        T[] tArr = this.f61123e;
        int i = this.f61120b;
        int c = m85561c(t.hashCode()) & i;
        T t3 = tArr[c];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return mo70060f(c, tArr, i);
        }
        do {
            c = (c + 1) & i;
            t2 = tArr[c];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return mo70060f(c, tArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo70060f(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.f61121c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int c = m85561c(t.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= c || c > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else {
                    if (i >= c && c > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    public C13228j(int i, float f) {
        this.f61119a = f;
        int a = C13229k.m85567a(i);
        this.f61120b = a - 1;
        this.f61122d = (int) (f * ((float) a));
        this.f61123e = new Object[a];
    }
}

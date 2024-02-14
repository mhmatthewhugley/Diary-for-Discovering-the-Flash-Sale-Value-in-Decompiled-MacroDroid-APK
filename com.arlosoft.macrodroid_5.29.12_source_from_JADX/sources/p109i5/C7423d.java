package p109i5;

import com.fasterxml.jackson.core.C6804f;

/* renamed from: i5.d */
/* compiled from: JsonWriteContext */
public class C7423d extends C6804f {

    /* renamed from: c */
    protected final C7423d f18145c;

    /* renamed from: d */
    protected String f18146d;

    /* renamed from: e */
    protected C7423d f18147e = null;

    protected C7423d(int i, C7423d dVar) {
        this.f15790a = i;
        this.f18145c = dVar;
        this.f15791b = -1;
    }

    /* renamed from: j */
    public static C7423d m30651j() {
        return new C7423d(0, (C7423d) null);
    }

    /* renamed from: l */
    private C7423d m30652l(int i) {
        this.f15790a = i;
        this.f15791b = -1;
        this.f18146d = null;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo37484g(StringBuilder sb) {
        int i = this.f15790a;
        if (i == 2) {
            sb.append('{');
            if (this.f18146d != null) {
                sb.append('\"');
                sb.append(this.f18146d);
                sb.append('\"');
            } else {
                sb.append('?');
            }
            sb.append('}');
        } else if (i == 1) {
            sb.append('[');
            sb.append(mo33878a());
            sb.append(']');
        } else {
            sb.append("/");
        }
    }

    /* renamed from: h */
    public final C7423d mo37485h() {
        C7423d dVar = this.f18147e;
        if (dVar != null) {
            return dVar.m30652l(1);
        }
        C7423d dVar2 = new C7423d(1, this);
        this.f18147e = dVar2;
        return dVar2;
    }

    /* renamed from: i */
    public final C7423d mo37486i() {
        C7423d dVar = this.f18147e;
        if (dVar != null) {
            return dVar.m30652l(2);
        }
        C7423d dVar2 = new C7423d(2, this);
        this.f18147e = dVar2;
        return dVar2;
    }

    /* renamed from: k */
    public final C7423d mo37487k() {
        return this.f18145c;
    }

    /* renamed from: m */
    public final int mo37488m(String str) {
        if (this.f15790a != 2 || this.f18146d != null) {
            return 4;
        }
        this.f18146d = str;
        return this.f15791b < 0 ? 0 : 1;
    }

    /* renamed from: n */
    public final int mo37489n() {
        int i = this.f15790a;
        if (i == 2) {
            if (this.f18146d == null) {
                return 5;
            }
            this.f18146d = null;
            this.f15791b++;
            return 2;
        } else if (i == 1) {
            int i2 = this.f15791b;
            this.f15791b = i2 + 1;
            if (i2 < 0) {
                return 0;
            }
            return 1;
        } else {
            int i3 = this.f15791b + 1;
            this.f15791b = i3;
            if (i3 == 0) {
                return 0;
            }
            return 3;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        mo37484g(sb);
        return sb.toString();
    }
}

package p109i5;

import com.fasterxml.jackson.core.C6801d;
import com.fasterxml.jackson.core.C6804f;
import com.fasterxml.jackson.core.p072io.C6809b;

/* renamed from: i5.c */
/* compiled from: JsonReadContext */
public final class C7422c extends C6804f {

    /* renamed from: c */
    protected final C7422c f18140c;

    /* renamed from: d */
    protected int f18141d;

    /* renamed from: e */
    protected int f18142e;

    /* renamed from: f */
    protected String f18143f;

    /* renamed from: g */
    protected C7422c f18144g = null;

    public C7422c(C7422c cVar, int i, int i2, int i3) {
        this.f15790a = i;
        this.f18140c = cVar;
        this.f18141d = i2;
        this.f18142e = i3;
        this.f15791b = -1;
    }

    /* renamed from: i */
    public static C7422c m30642i() {
        return new C7422c((C7422c) null, 0, 1, 0);
    }

    /* renamed from: g */
    public C7422c mo37475g(int i, int i2) {
        C7422c cVar = this.f18144g;
        if (cVar == null) {
            C7422c cVar2 = new C7422c(this, 1, i, i2);
            this.f18144g = cVar2;
            return cVar2;
        }
        cVar.mo37481n(1, i, i2);
        return cVar;
    }

    /* renamed from: h */
    public C7422c mo37476h(int i, int i2) {
        C7422c cVar = this.f18144g;
        if (cVar == null) {
            C7422c cVar2 = new C7422c(this, 2, i, i2);
            this.f18144g = cVar2;
            return cVar2;
        }
        cVar.mo37481n(2, i, i2);
        return cVar;
    }

    /* renamed from: j */
    public boolean mo37477j() {
        int i = this.f15791b + 1;
        this.f15791b = i;
        if (this.f15790a == 0 || i <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public String mo37478k() {
        return this.f18143f;
    }

    /* renamed from: l */
    public C7422c mo37479l() {
        return this.f18140c;
    }

    /* renamed from: m */
    public C6801d mo37480m(Object obj) {
        return new C6801d(obj, -1, this.f18141d, this.f18142e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo37481n(int i, int i2, int i3) {
        this.f15790a = i;
        this.f15791b = -1;
        this.f18141d = i2;
        this.f18142e = i3;
        this.f18143f = null;
    }

    /* renamed from: o */
    public void mo37482o(String str) {
        this.f18143f = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        int i = this.f15790a;
        if (i == 0) {
            sb.append("/");
        } else if (i == 1) {
            sb.append('[');
            sb.append(mo33878a());
            sb.append(']');
        } else if (i == 2) {
            sb.append('{');
            if (this.f18143f != null) {
                sb.append('\"');
                C6809b.m25586a(sb, this.f18143f);
                sb.append('\"');
            } else {
                sb.append('?');
            }
            sb.append('}');
        }
        return sb.toString();
    }
}

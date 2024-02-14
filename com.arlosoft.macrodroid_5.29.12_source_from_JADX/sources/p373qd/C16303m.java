package p373qd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.jsoup.SerializationException;
import p351od.C15852c;
import p364pd.C16171b;
import p373qd.C16288f;
import p391sd.C16538d;
import p391sd.C16539e;

/* renamed from: qd.m */
/* compiled from: Node */
public abstract class C16303m implements Cloneable {

    /* renamed from: d */
    static final List<C16303m> f66695d = Collections.emptyList();

    /* renamed from: a */
    C16303m f66696a;

    /* renamed from: c */
    int f66697c;

    /* renamed from: qd.m$a */
    /* compiled from: Node */
    private static class C16304a implements C16539e {

        /* renamed from: a */
        private final Appendable f66698a;

        /* renamed from: b */
        private final C16288f.C16289a f66699b;

        C16304a(Appendable appendable, C16288f.C16289a aVar) {
            this.f66698a = appendable;
            this.f66699b = aVar;
            aVar.mo78849k();
        }

        /* renamed from: a */
        public void mo78886a(C16303m mVar, int i) {
            try {
                mVar.mo78813C(this.f66698a, i, this.f66699b);
            } catch (IOException e) {
                throw new SerializationException(e);
            }
        }

        /* renamed from: b */
        public void mo78887b(C16303m mVar, int i) {
            if (!mVar.mo78819y().equals("#text")) {
                try {
                    mVar.mo78814D(this.f66698a, i, this.f66699b);
                } catch (IOException e) {
                    throw new SerializationException(e);
                }
            }
        }
    }

    protected C16303m() {
    }

    /* renamed from: K */
    private void m97868K(int i) {
        int k = mo78825k();
        if (k != 0) {
            List<C16303m> r = mo78878r();
            while (i < k) {
                r.get(i).mo78903S(i);
                i++;
            }
        }
    }

    /* renamed from: A */
    public String mo78830A() {
        StringBuilder b = C16171b.m97071b();
        mo78895B(b);
        return C16171b.m97079j(b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo78895B(Appendable appendable) {
        C16538d.m98664a(new C16304a(appendable, C16305n.m97910a(this)), this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public abstract void mo78813C(Appendable appendable, int i, C16288f.C16289a aVar) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public abstract void mo78814D(Appendable appendable, int i, C16288f.C16289a aVar) throws IOException;

    /* renamed from: E */
    public C16288f mo78896E() {
        C16303m O = mo78861O();
        if (O instanceof C16288f) {
            return (C16288f) O;
        }
        return null;
    }

    /* renamed from: G */
    public C16303m mo78857G() {
        return this.f66696a;
    }

    /* renamed from: H */
    public final C16303m mo78897H() {
        return this.f66696a;
    }

    /* renamed from: J */
    public C16303m mo78898J() {
        C16303m mVar = this.f66696a;
        if (mVar != null && this.f66697c > 0) {
            return mVar.mo78878r().get(this.f66697c - 1);
        }
        return null;
    }

    /* renamed from: L */
    public void mo78899L() {
        C15852c.m95479h(this.f66696a);
        this.f66696a.mo78892M(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo78892M(C16303m mVar) {
        C15852c.m95474c(mVar.f66696a == this);
        int i = mVar.f66697c;
        mo78878r().remove(i);
        m97868K(i);
        mVar.f66696a = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public void mo78900N(C16303m mVar) {
        mVar.mo78902R(this);
    }

    /* renamed from: O */
    public C16303m mo78861O() {
        C16303m mVar = this;
        while (true) {
            C16303m mVar2 = mVar.f66696a;
            if (mVar2 == null) {
                return mVar;
            }
            mVar = mVar2;
        }
    }

    /* renamed from: P */
    public void mo78901P(String str) {
        C15852c.m95479h(str);
        mo78876p(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public void mo78902R(C16303m mVar) {
        C15852c.m95479h(mVar);
        C16303m mVar2 = this.f66696a;
        if (mVar2 != null) {
            mVar2.mo78892M(this);
        }
        this.f66696a = mVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo78903S(int i) {
        this.f66697c = i;
    }

    /* renamed from: T */
    public int mo78904T() {
        return this.f66697c;
    }

    /* renamed from: U */
    public List<C16303m> mo78905U() {
        C16303m mVar = this.f66696a;
        if (mVar == null) {
            return Collections.emptyList();
        }
        List<C16303m> r = mVar.mo78878r();
        ArrayList arrayList = new ArrayList(r.size() - 1);
        for (C16303m next : r) {
            if (next != this) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public String mo78821a(String str) {
        C15852c.m95478g(str);
        return (!mo78881t() || !mo78867e().mo78808z(str)) ? "" : C16171b.m97080k(mo78824f(), mo78867e().mo78805t(str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo78906b(int i, C16303m... mVarArr) {
        boolean z;
        boolean z2;
        C15852c.m95479h(mVarArr);
        if (mVarArr.length != 0) {
            List<C16303m> r = mo78878r();
            C16303m G = mVarArr[0].mo78857G();
            if (G != null && G.mo78825k() == mVarArr.length) {
                List<C16303m> r2 = G.mo78878r();
                int length = mVarArr.length;
                while (true) {
                    int i2 = length - 1;
                    z = true;
                    if (length <= 0) {
                        z2 = true;
                        break;
                    } else if (mVarArr[i2] != r2.get(i2)) {
                        z2 = false;
                        break;
                    } else {
                        length = i2;
                    }
                }
                if (z2) {
                    if (mo78825k() != 0) {
                        z = false;
                    }
                    G.mo78826q();
                    r.addAll(i, Arrays.asList(mVarArr));
                    int length2 = mVarArr.length;
                    while (true) {
                        int i3 = length2 - 1;
                        if (length2 <= 0) {
                            break;
                        }
                        mVarArr[i3].f66696a = this;
                        length2 = i3;
                    }
                    if (!z || mVarArr[0].f66697c != 0) {
                        m97868K(i);
                        return;
                    }
                    return;
                }
            }
            C15852c.m95476e(mVarArr);
            for (C16303m N : mVarArr) {
                mo78900N(N);
            }
            r.addAll(i, Arrays.asList(mVarArr));
            m97868K(i);
        }
    }

    /* renamed from: c */
    public String mo78823c(String str) {
        C15852c.m95479h(str);
        if (!mo78881t()) {
            return "";
        }
        String t = mo78867e().mo78805t(str);
        if (t.length() > 0) {
            return t;
        }
        if (str.startsWith("abs:")) {
            return mo78821a(str.substring(4));
        }
        return "";
    }

    /* renamed from: d */
    public C16303m mo78853d(String str, String str2) {
        mo78867e().mo78792T(C16305n.m97911b(this).mo79202f().mo79194b(str), str2);
        return this;
    }

    /* renamed from: e */
    public abstract C16283b mo78867e();

    public boolean equals(Object obj) {
        return this == obj;
    }

    /* renamed from: f */
    public abstract String mo78824f();

    /* renamed from: g */
    public C16303m mo78908g(C16303m mVar) {
        C15852c.m95479h(mVar);
        C15852c.m95479h(this.f66696a);
        this.f66696a.mo78906b(this.f66697c, mVar);
        return this;
    }

    /* renamed from: h */
    public C16303m mo78909h(int i) {
        return mo78878r().get(i);
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* renamed from: k */
    public abstract int mo78825k();

    /* renamed from: l */
    public List<C16303m> mo78911l() {
        if (mo78825k() == 0) {
            return f66695d;
        }
        List<C16303m> r = mo78878r();
        ArrayList arrayList = new ArrayList(r.size());
        arrayList.addAll(r);
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: n */
    public C16303m clone() {
        C16303m o = mo78874o((C16303m) null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(o);
        while (!linkedList.isEmpty()) {
            C16303m mVar = (C16303m) linkedList.remove();
            int k = mVar.mo78825k();
            for (int i = 0; i < k; i++) {
                List<C16303m> r = mVar.mo78878r();
                C16303m o2 = r.get(i).mo78874o(mVar);
                r.set(i, o2);
                linkedList.add(o2);
            }
        }
        return o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C16303m mo78874o(C16303m mVar) {
        int i;
        C16288f E;
        try {
            C16303m mVar2 = (C16303m) super.clone();
            mVar2.f66696a = mVar;
            if (mVar == null) {
                i = 0;
            } else {
                i = this.f66697c;
            }
            mVar2.f66697c = i;
            if (mVar == null && !(this instanceof C16288f) && (E = mo78896E()) != null) {
                C16288f R0 = E.mo78838R0();
                mVar2.f66696a = R0;
                R0.mo78878r().add(mVar2);
            }
            return mVar2;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract void mo78876p(String str);

    /* renamed from: q */
    public abstract C16303m mo78826q();

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract List<C16303m> mo78878r();

    /* renamed from: s */
    public boolean mo78912s(String str) {
        C15852c.m95479h(str);
        if (!mo78881t()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String substring = str.substring(4);
            if (mo78867e().mo78808z(substring) && !mo78821a(substring).isEmpty()) {
                return true;
            }
        }
        return mo78867e().mo78808z(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract boolean mo78881t();

    public String toString() {
        return mo78830A();
    }

    /* renamed from: u */
    public boolean mo78913u() {
        return this.f66696a != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo78914v(Appendable appendable, int i, C16288f.C16289a aVar) throws IOException {
        appendable.append(10).append(C16171b.m97078i(i * aVar.mo78846f(), aVar.mo78847g()));
    }

    /* renamed from: x */
    public C16303m mo78915x() {
        C16303m mVar = this.f66696a;
        if (mVar == null) {
            return null;
        }
        List<C16303m> r = mVar.mo78878r();
        int i = this.f66697c + 1;
        if (r.size() > i) {
            return r.get(i);
        }
        return null;
    }

    /* renamed from: y */
    public abstract String mo78819y();

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo78884z() {
    }
}

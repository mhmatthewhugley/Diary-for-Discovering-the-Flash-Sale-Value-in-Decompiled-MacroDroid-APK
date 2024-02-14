package p373qd;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import org.jsoup.SerializationException;
import p351od.C15852c;
import p364pd.C16170a;
import p364pd.C16171b;
import p373qd.C16288f;
import p382rd.C16413f;

/* renamed from: qd.b */
/* compiled from: Attributes */
public class C16283b implements Iterable<C16282a>, Cloneable {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f66642a = 0;

    /* renamed from: c */
    String[] f66643c = new String[3];

    /* renamed from: d */
    Object[] f66644d = new Object[3];

    /* renamed from: qd.b$a */
    /* compiled from: Attributes */
    class C16284a implements Iterator<C16282a> {

        /* renamed from: a */
        int f66645a = 0;

        C16284a() {
        }

        /* renamed from: a */
        public C16282a next() {
            C16283b bVar = C16283b.this;
            String[] strArr = bVar.f66643c;
            int i = this.f66645a;
            C16282a aVar = new C16282a(strArr[i], (String) bVar.f66644d[i], bVar);
            this.f66645a++;
            return aVar;
        }

        public boolean hasNext() {
            while (this.f66645a < C16283b.this.f66642a) {
                C16283b bVar = C16283b.this;
                if (!bVar.m97687O(bVar.f66643c[this.f66645a])) {
                    break;
                }
                this.f66645a++;
            }
            if (this.f66645a < C16283b.this.f66642a) {
                return true;
            }
            return false;
        }

        public void remove() {
            C16283b bVar = C16283b.this;
            int i = this.f66645a - 1;
            this.f66645a = i;
            bVar.m97688X(i);
        }
    }

    /* renamed from: K */
    private int m97685K(String str) {
        C15852c.m95479h(str);
        for (int i = 0; i < this.f66642a; i++) {
            if (str.equalsIgnoreCase(this.f66643c[i])) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: M */
    static String m97686M(String str) {
        return '/' + str;
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public boolean m97687O(String str) {
        return str != null && str.length() > 1 && str.charAt(0) == '/';
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m97688X(int i) {
        C15852c.m95473b(i >= this.f66642a);
        int i2 = (this.f66642a - i) - 1;
        if (i2 > 0) {
            String[] strArr = this.f66643c;
            int i3 = i + 1;
            System.arraycopy(strArr, i3, strArr, i, i2);
            Object[] objArr = this.f66644d;
            System.arraycopy(objArr, i3, objArr, i, i2);
        }
        int i4 = this.f66642a - 1;
        this.f66642a = i4;
        this.f66643c[i4] = null;
        this.f66644d[i4] = null;
    }

    /* renamed from: l */
    private void m97692l(String str, Object obj) {
        m97693n(this.f66642a + 1);
        String[] strArr = this.f66643c;
        int i = this.f66642a;
        strArr[i] = str;
        this.f66644d[i] = obj;
        this.f66642a = i + 1;
    }

    /* renamed from: n */
    private void m97693n(int i) {
        C15852c.m95474c(i >= this.f66642a);
        String[] strArr = this.f66643c;
        int length = strArr.length;
        if (length < i) {
            int i2 = 3;
            if (length >= 3) {
                i2 = this.f66642a * 2;
            }
            if (i <= i2) {
                i = i2;
            }
            this.f66643c = (String[]) Arrays.copyOf(strArr, i);
            this.f66644d = Arrays.copyOf(this.f66644d, i);
        }
    }

    /* renamed from: o */
    static String m97694o(Object obj) {
        return obj == null ? "" : (String) obj;
    }

    /* renamed from: B */
    public String mo78786B() {
        StringBuilder b = C16171b.m97071b();
        try {
            mo78787D(b, new C16288f("").mo78833M0());
            return C16171b.m97079j(b);
        } catch (IOException e) {
            throw new SerializationException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final void mo78787D(Appendable appendable, C16288f.C16289a aVar) throws IOException {
        String c;
        int i = this.f66642a;
        for (int i2 = 0; i2 < i; i2++) {
            if (!m97687O(this.f66643c[i2]) && (c = C16282a.m97674c(this.f66643c[i2], aVar.mo78851n())) != null) {
                C16282a.m97676h(c, (String) this.f66644d[i2], appendable.append(' '), aVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public int mo78788J(String str) {
        C15852c.m95479h(str);
        for (int i = 0; i < this.f66642a; i++) {
            if (str.equals(this.f66643c[i])) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: P */
    public void mo78789P() {
        for (int i = 0; i < this.f66642a; i++) {
            String[] strArr = this.f66643c;
            strArr[i] = C16170a.m97068a(strArr[i]);
        }
    }

    /* renamed from: R */
    public C16283b mo78790R(String str, String str2) {
        C15852c.m95479h(str);
        int J = mo78788J(str);
        if (J != -1) {
            this.f66644d[J] = str2;
        } else {
            mo78796h(str, str2);
        }
        return this;
    }

    /* renamed from: S */
    public C16283b mo78791S(C16282a aVar) {
        C15852c.m95479h(aVar);
        mo78790R(aVar.getKey(), aVar.getValue());
        aVar.f66641d = this;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo78792T(String str, String str2) {
        int K = m97685K(str);
        if (K != -1) {
            this.f66644d[K] = str2;
            if (!this.f66643c[K].equals(str)) {
                this.f66643c[K] = str;
                return;
            }
            return;
        }
        mo78796h(str, str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public C16283b mo78793V(String str, Object obj) {
        C15852c.m95479h(str);
        if (!m97687O(str)) {
            str = m97686M(str);
        }
        C15852c.m95479h(obj);
        int J = mo78788J(str);
        if (J != -1) {
            this.f66644d[J] = obj;
        } else {
            m97692l(str, obj);
        }
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C16283b bVar = (C16283b) obj;
        if (this.f66642a != bVar.f66642a) {
            return false;
        }
        for (int i = 0; i < this.f66642a; i++) {
            int J = bVar.mo78788J(this.f66643c[i]);
            if (J == -1) {
                return false;
            }
            Object obj2 = this.f66644d[i];
            Object obj3 = bVar.f66644d[J];
            if (obj2 == null) {
                if (obj3 != null) {
                    return false;
                }
            } else if (!obj2.equals(obj3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public C16283b mo78796h(String str, String str2) {
        m97692l(str, str2);
        return this;
    }

    public int hashCode() {
        return (((this.f66642a * 31) + Arrays.hashCode(this.f66643c)) * 31) + Arrays.hashCode(this.f66644d);
    }

    public boolean isEmpty() {
        return this.f66642a == 0;
    }

    public Iterator<C16282a> iterator() {
        return new C16284a();
    }

    /* renamed from: k */
    public void mo78800k(C16283b bVar) {
        if (bVar.size() != 0) {
            m97693n(this.f66642a + bVar.f66642a);
            boolean z = this.f66642a != 0;
            Iterator<C16282a> it = bVar.iterator();
            while (it.hasNext()) {
                C16282a next = it.next();
                if (z) {
                    mo78791S(next);
                } else {
                    mo78796h(next.getKey(), next.getValue());
                }
            }
        }
    }

    /* renamed from: p */
    public C16283b clone() {
        try {
            C16283b bVar = (C16283b) super.clone();
            bVar.f66642a = this.f66642a;
            bVar.f66643c = (String[]) Arrays.copyOf(this.f66643c, this.f66642a);
            bVar.f66644d = Arrays.copyOf(this.f66644d, this.f66642a);
            return bVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: q */
    public int mo78802q(C16413f fVar) {
        int i = 0;
        if (isEmpty()) {
            return 0;
        }
        boolean e = fVar.mo79197e();
        int i2 = 0;
        while (i < this.f66643c.length) {
            int i3 = i + 1;
            int i4 = i3;
            while (true) {
                String[] strArr = this.f66643c;
                if (i4 >= strArr.length || strArr[i4] == null) {
                    i = i3;
                } else {
                    if (!e || !strArr[i].equals(strArr[i4])) {
                        if (!e) {
                            String[] strArr2 = this.f66643c;
                            if (!strArr2[i].equalsIgnoreCase(strArr2[i4])) {
                            }
                        }
                        i4++;
                    }
                    i2++;
                    m97688X(i4);
                    i4--;
                    i4++;
                }
            }
            i = i3;
        }
        return i2;
    }

    /* renamed from: s */
    public String mo78803s(String str) {
        int J = mo78788J(str);
        if (J == -1) {
            return "";
        }
        return m97694o(this.f66644d[J]);
    }

    public int size() {
        return this.f66642a;
    }

    /* renamed from: t */
    public String mo78805t(String str) {
        int K = m97685K(str);
        if (K == -1) {
            return "";
        }
        return m97694o(this.f66644d[K]);
    }

    public String toString() {
        return mo78786B();
    }

    /* renamed from: u */
    public boolean mo78807u(String str) {
        return mo78788J(str) != -1;
    }

    /* renamed from: z */
    public boolean mo78808z(String str) {
        return m97685K(str) != -1;
    }
}

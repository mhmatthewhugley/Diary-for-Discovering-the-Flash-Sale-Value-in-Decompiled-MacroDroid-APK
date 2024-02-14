package p327mb;

import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import p297ja.C13336r;
import p308kb.C13497o;
import p308kb.C13505p;
import p370qa.C16265l;

/* renamed from: mb.d */
/* compiled from: NameResolverImpl.kt */
public final class C15720d implements C15719c {

    /* renamed from: a */
    private final C13505p f65069a;

    /* renamed from: b */
    private final C13497o f65070b;

    /* renamed from: mb.d$a */
    /* compiled from: NameResolverImpl.kt */
    public /* synthetic */ class C15721a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f65071a;

        static {
            int[] iArr = new int[C13497o.C13500c.C13503c.values().length];
            iArr[C13497o.C13500c.C13503c.CLASS.ordinal()] = 1;
            iArr[C13497o.C13500c.C13503c.PACKAGE.ordinal()] = 2;
            iArr[C13497o.C13500c.C13503c.LOCAL.ordinal()] = 3;
            f65071a = iArr;
        }
    }

    public C15720d(C13505p pVar, C13497o oVar) {
        C13706o.m87929f(pVar, "strings");
        C13706o.m87929f(oVar, "qualifiedNames");
        this.f65069a = pVar;
        this.f65070b = oVar;
    }

    /* renamed from: c */
    private final C13336r<List<String>, List<String>, Boolean> m95023c(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            C13497o.C13500c x = this.f65070b.mo71394x(i);
            String x2 = this.f65069a.mo71422x(x.mo71403B());
            C13497o.C13500c.C13503c z2 = x.mo71409z();
            C13706o.m87926c(z2);
            int i2 = C15721a.f65071a[z2.ordinal()];
            if (i2 == 1) {
                linkedList2.addFirst(x2);
            } else if (i2 == 2) {
                linkedList.addFirst(x2);
            } else if (i2 == 3) {
                linkedList2.addFirst(x2);
                z = true;
            }
            i = x.mo71402A();
        }
        return new C13336r<>(linkedList, linkedList2, Boolean.valueOf(z));
    }

    /* renamed from: a */
    public boolean mo75163a(int i) {
        return m95023c(i).mo70173d().booleanValue();
    }

    /* renamed from: b */
    public String mo75164b(int i) {
        C13336r<List<String>, List<String>, Boolean> c = m95023c(i);
        List a = c.mo70170a();
        String g0 = C13566b0.m87432g0(c.mo70171b(), ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C16265l) null, 62, (Object) null);
        if (a.isEmpty()) {
            return g0;
        }
        return C13566b0.m87432g0(a, "/", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C16265l) null, 62, (Object) null) + '/' + g0;
    }

    public String getString(int i) {
        String x = this.f65069a.mo71422x(i);
        C13706o.m87928e(x, "strings.getString(index)");
        return x;
    }
}

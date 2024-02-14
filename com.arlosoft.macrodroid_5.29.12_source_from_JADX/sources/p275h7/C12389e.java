package p275h7;

import com.miguelbcr.p231ui.rx_paparazzo2.entities.PermissionDeniedException;
import java.util.List;
import p215b8.C11101a;
import p215b8.C11102b;
import p216ba.C11114e;
import p259f7.C12243c;
import p259f7.C12246f;
import p414v9.C16735i;
import p414v9.C16739l;
import p414v9.C16747p;
import p414v9.C16749r;

/* renamed from: h7.e */
/* compiled from: GrantPermissions */
public final class C12389e extends C12405m<C12243c> {

    /* renamed from: a */
    private final C12246f f59093a;

    /* renamed from: b */
    private String[] f59094b;

    /* renamed from: h7.e$a */
    /* compiled from: GrantPermissions */
    class C12390a implements C11114e<List<Integer>, C16749r<C12243c>> {
        C12390a() {
        }

        /* renamed from: a */
        public C16749r<C12243c> apply(List<Integer> list) throws Exception {
            int i = -1;
            for (Integer intValue : list) {
                int intValue2 = intValue.intValue();
                if (intValue2 > i) {
                    i = intValue2;
                }
            }
            if (i == -1) {
                return C16747p.m99412k(C12243c.Get);
            }
            return C16747p.m99409g(new PermissionDeniedException(i));
        }
    }

    /* renamed from: h7.e$b */
    /* compiled from: GrantPermissions */
    class C12391b implements C11114e<C11101a, C16739l<Integer>> {
        C12391b() {
        }

        /* renamed from: a */
        public C16739l<Integer> apply(C11101a aVar) throws Exception {
            if (aVar.f54019b) {
                return C16735i.m99342F(-1);
            }
            if (aVar.f54020c) {
                return C16735i.m99342F(2);
            }
            return C16735i.m99342F(3);
        }
    }

    /* renamed from: h7.e$c */
    /* compiled from: GrantPermissions */
    class C12392c implements C11114e<List<C11101a>, Iterable<C11101a>> {
        C12392c() {
        }

        /* renamed from: a */
        public Iterable<C11101a> apply(List<C11101a> list) throws Exception {
            return list;
        }
    }

    public C12389e(C12246f fVar) {
        this.f59093a = fVar;
    }

    /* renamed from: a */
    public C16735i<C12243c> mo68728a() {
        if (this.f59094b.length == 0) {
            return C16735i.m99342F(C12243c.Get);
        }
        return new C11102b(this.f59093a.mo68559a()).mo62232p(this.f59094b).mo79696b(this.f59094b.length).mo79716y(new C12392c()).mo79703i(new C12391b()).mo79700e0().mo79725i(new C12390a()).mo79732s();
    }

    /* renamed from: b */
    public C12389e mo68729b(String... strArr) {
        this.f59094b = strArr;
        return this;
    }
}

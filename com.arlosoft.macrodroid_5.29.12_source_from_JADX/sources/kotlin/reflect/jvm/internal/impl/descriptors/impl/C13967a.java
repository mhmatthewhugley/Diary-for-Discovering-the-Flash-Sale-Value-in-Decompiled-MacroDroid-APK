package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C13947d1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14071o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.resolve.C14650d;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14689f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14702m;
import kotlin.reflect.jvm.internal.impl.types.C14906f0;
import kotlin.reflect.jvm.internal.impl.types.C14936j1;
import kotlin.reflect.jvm.internal.impl.types.C14945l1;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14956n1;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
import p362pb.C16157f;
import p370qa.C16254a;
import p370qa.C16265l;
import p389sb.C16519a;
import p442yb.C17006i;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.a */
/* compiled from: AbstractClassDescriptor */
public abstract class C13967a extends C14032t {

    /* renamed from: c */
    private final C16157f f62435c;

    /* renamed from: d */
    protected final C17006i<C14951m0> f62436d;

    /* renamed from: f */
    private final C17006i<C14692h> f62437f;

    /* renamed from: g */
    private final C17006i<C14146w0> f62438g;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.a$a */
    /* compiled from: AbstractClassDescriptor */
    class C13968a implements C16254a<C14951m0> {

        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.a$a$a */
        /* compiled from: AbstractClassDescriptor */
        class C13969a implements C16265l<C14849g, C14951m0> {
            C13969a() {
            }

            /* renamed from: a */
            public C14951m0 invoke(C14849g gVar) {
                C13961h f = gVar.mo74068f(C13967a.this);
                if (f == null) {
                    return (C14951m0) C13967a.this.f62436d.invoke();
                }
                if (f instanceof C13947d1) {
                    return C14906f0.m92814b((C13947d1) f, C14956n1.m92992g(f.mo62171j().getParameters()));
                }
                if (f instanceof C14032t) {
                    return C14956n1.m93006u(f.mo62171j().mo72368a(gVar), ((C14032t) f).mo62174k0(gVar), this);
                }
                return f.mo72274p();
            }
        }

        C13968a() {
        }

        /* renamed from: a */
        public C14951m0 invoke() {
            C13967a aVar = C13967a.this;
            return C14956n1.m93005t(aVar, aVar.mo72285X(), new C13969a());
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.a$b */
    /* compiled from: AbstractClassDescriptor */
    class C13970b implements C16254a<C14692h> {
        C13970b() {
        }

        /* renamed from: a */
        public C14692h invoke() {
            return new C14689f(C13967a.this.mo72285X());
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.a$c */
    /* compiled from: AbstractClassDescriptor */
    class C13971c implements C16254a<C14146w0> {
        C13971c() {
        }

        /* renamed from: a */
        public C14146w0 invoke() {
            return new C14024q(C13967a.this);
        }
    }

    public C13967a(C17012n nVar, C16157f fVar) {
        if (nVar == null) {
            m88618E0(0);
        }
        if (fVar == null) {
            m88618E0(1);
        }
        this.f62435c = fVar;
        this.f62436d = nVar.mo80221f(new C13968a());
        this.f62437f = nVar.mo80221f(new C13970b());
        this.f62438g = nVar.mo80221f(new C13971c());
    }

    /* renamed from: E0 */
    private static /* synthetic */ void m88618E0(int i) {
        int i2 = i;
        String str = (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 9 || i2 == 12 || i2 == 14 || i2 == 16 || i2 == 17 || i2 == 19 || i2 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 9 || i2 == 12 || i2 == 14 || i2 == 16 || i2 == 17 || i2 == 19 || i2 == 20) ? 2 : 3)];
        switch (i2) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i2 == 2) {
            objArr[1] = "getName";
        } else if (i2 == 3) {
            objArr[1] = "getOriginal";
        } else if (i2 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i2 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i2 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i2 == 9 || i2 == 12 || i2 == 14 || i2 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i2 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i2 == 19) {
            objArr[1] = "substitute";
        } else if (i2 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6 || i2 == 9 || i2 == 12 || i2 == 14 || i2 == 16 || i2 == 17 || i2 == 19 || i2 == 20) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: G0 */
    public C13948e mo72267c(C14945l1 l1Var) {
        if (l1Var == null) {
            m88618E0(18);
        }
        if (l1Var.mo74212k()) {
            return this;
        }
        return new C14029s(this, l1Var);
    }

    /* renamed from: J0 */
    public C14146w0 mo72283J0() {
        C14146w0 w0Var = (C14146w0) this.f62438g.invoke();
        if (w0Var == null) {
            m88618E0(5);
        }
        return w0Var;
    }

    /* renamed from: T */
    public C14692h mo72284T() {
        C14692h hVar = (C14692h) this.f62437f.invoke();
        if (hVar == null) {
            m88618E0(4);
        }
        return hVar;
    }

    /* renamed from: X */
    public C14692h mo72285X() {
        C14692h k0 = mo62174k0(C16519a.m98618k(C14650d.m91620g(this)));
        if (k0 == null) {
            m88618E0(17);
        }
        return k0;
    }

    /* renamed from: Z */
    public List<C14146w0> mo72286Z() {
        List<C14146w0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m88618E0(6);
        }
        return emptyList;
    }

    /* renamed from: a */
    public C13948e m88626a() {
        return this;
    }

    public C16157f getName() {
        C16157f fVar = this.f62435c;
        if (fVar == null) {
            m88618E0(2);
        }
        return fVar;
    }

    /* renamed from: h0 */
    public C14692h mo72309h0(C14936j1 j1Var, C14849g gVar) {
        if (j1Var == null) {
            m88618E0(10);
        }
        if (gVar == null) {
            m88618E0(11);
        }
        if (j1Var.mo72942f()) {
            C14692h k0 = mo62174k0(gVar);
            if (k0 == null) {
                m88618E0(12);
            }
            return k0;
        }
        return new C14702m(mo62174k0(gVar), C14945l1.m92939g(j1Var));
    }

    /* renamed from: p */
    public C14951m0 mo72274p() {
        C14951m0 m0Var = (C14951m0) this.f62436d.invoke();
        if (m0Var == null) {
            m88618E0(20);
        }
        return m0Var;
    }

    /* renamed from: q0 */
    public C14692h mo72287q0(C14936j1 j1Var) {
        if (j1Var == null) {
            m88618E0(15);
        }
        C14692h h0 = mo72309h0(j1Var, C16519a.m98618k(C14650d.m91620g(this)));
        if (h0 == null) {
            m88618E0(16);
        }
        return h0;
    }

    /* renamed from: x */
    public <R, D> R mo72277x(C14071o<R, D> oVar, D d) {
        return oVar.mo72426a(this, d);
    }
}

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13944d;
import kotlin.reflect.jvm.internal.impl.descriptors.C13945d0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13951f;
import kotlin.reflect.jvm.internal.impl.descriptors.C13960g1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14127t;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14141u;
import kotlin.reflect.jvm.internal.impl.descriptors.C14156y0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.resolve.C14656h;
import kotlin.reflect.jvm.internal.impl.resolve.C14658j;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14683d;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14696i;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14901e1;
import kotlin.reflect.jvm.internal.impl.types.C14943l;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
import p263fb.C12253b;
import p263fb.C12256d;
import p297ja.C13339u;
import p362pb.C16157f;
import p370qa.C16254a;
import p370qa.C16265l;
import p442yb.C17004g;
import p442yb.C17006i;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.n */
/* compiled from: EnumEntrySyntheticClassDescriptor */
public class C14012n extends C13993g {

    /* renamed from: A */
    private final C14692h f62547A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final C17006i<Set<C16157f>> f62548B;

    /* renamed from: C */
    private final C13921g f62549C;

    /* renamed from: z */
    private final C14901e1 f62550z;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.n$a */
    /* compiled from: EnumEntrySyntheticClassDescriptor */
    private class C14013a extends C14696i {

        /* renamed from: b */
        private final C17004g<C16157f, Collection<? extends C14156y0>> f62551b;

        /* renamed from: c */
        private final C17004g<C16157f, Collection<? extends C14140t0>> f62552c;

        /* renamed from: d */
        private final C17006i<Collection<C14064m>> f62553d;

        /* renamed from: e */
        final /* synthetic */ C14012n f62554e;

        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.n$a$a */
        /* compiled from: EnumEntrySyntheticClassDescriptor */
        class C14014a implements C16265l<C16157f, Collection<? extends C14156y0>> {

            /* renamed from: a */
            final /* synthetic */ C14012n f62555a;

            C14014a(C14012n nVar) {
                this.f62555a = nVar;
            }

            /* renamed from: a */
            public Collection<? extends C14156y0> invoke(C16157f fVar) {
                return C14013a.this.m89026m(fVar);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.n$a$b */
        /* compiled from: EnumEntrySyntheticClassDescriptor */
        class C14015b implements C16265l<C16157f, Collection<? extends C14140t0>> {

            /* renamed from: a */
            final /* synthetic */ C14012n f62557a;

            C14015b(C14012n nVar) {
                this.f62557a = nVar;
            }

            /* renamed from: a */
            public Collection<? extends C14140t0> invoke(C16157f fVar) {
                return C14013a.this.m89027n(fVar);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.n$a$c */
        /* compiled from: EnumEntrySyntheticClassDescriptor */
        class C14016c implements C16254a<Collection<C14064m>> {

            /* renamed from: a */
            final /* synthetic */ C14012n f62559a;

            C14016c(C14012n nVar) {
                this.f62559a = nVar;
            }

            /* renamed from: a */
            public Collection<C14064m> invoke() {
                return C14013a.this.m89025l();
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.n$a$d */
        /* compiled from: EnumEntrySyntheticClassDescriptor */
        class C14017d extends C14656h {

            /* renamed from: a */
            final /* synthetic */ Set f62561a;

            C14017d(Set set) {
                this.f62561a = set;
            }

            /* renamed from: f */
            private static /* synthetic */ void m89039f(int i) {
                Object[] objArr = new Object[3];
                if (i == 1) {
                    objArr[0] = "fromSuper";
                } else if (i != 2) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "fromCurrent";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                if (i == 1 || i == 2) {
                    objArr[2] = "conflict";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            /* renamed from: a */
            public void mo72455a(C13936b bVar) {
                if (bVar == null) {
                    m89039f(0);
                }
                C14658j.m91664K(bVar, (C16265l<C13936b, C13339u>) null);
                this.f62561a.add(bVar);
            }

            /* access modifiers changed from: protected */
            /* renamed from: e */
            public void mo72456e(C13936b bVar, C13936b bVar2) {
                if (bVar == null) {
                    m89039f(1);
                }
                if (bVar2 == null) {
                    m89039f(2);
                }
            }
        }

        public C14013a(C14012n nVar, C17012n nVar2) {
            if (nVar2 == null) {
                m89021h(0);
            }
            this.f62554e = nVar;
            this.f62551b = nVar2.mo80223h(new C14014a(nVar));
            this.f62552c = nVar2.mo80223h(new C14015b(nVar));
            this.f62553d = nVar2.mo80221f(new C14016c(nVar));
        }

        /* renamed from: h */
        private static /* synthetic */ void m89021h(int i) {
            String str;
            int i2;
            Throwable th;
            if (!(i == 3 || i == 7 || i == 9 || i == 12)) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            }
            str = "@NotNull method %s.%s must not return null";
            if (!(i == 3 || i == 7 || i == 9 || i == 12)) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
            }
            i2 = 2;
            Object[] objArr = new Object[i2];
            switch (i) {
                case 1:
                case 4:
                case 5:
                case 8:
                case 10:
                    objArr[0] = "name";
                    break;
                case 2:
                case 6:
                    objArr[0] = "location";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
                case 11:
                    objArr[0] = "fromSupertypes";
                    break;
                case 13:
                    objArr[0] = "kindFilter";
                    break;
                case 14:
                    objArr[0] = "nameFilter";
                    break;
                case 20:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 3) {
                objArr[1] = "getContributedVariables";
            } else if (i == 7) {
                objArr[1] = "getContributedFunctions";
            } else if (i == 9) {
                objArr[1] = "getSupertypeScope";
            } else if (i != 12) {
                switch (i) {
                    case 15:
                        objArr[1] = "getContributedDescriptors";
                        break;
                    case 16:
                        objArr[1] = "computeAllDeclarations";
                        break;
                    case 17:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 18:
                        objArr[1] = "getClassifierNames";
                        break;
                    case 19:
                        objArr[1] = "getVariableNames";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                        break;
                }
            } else {
                objArr[1] = "resolveFakeOverrides";
            }
            switch (i) {
                case 1:
                case 2:
                    objArr[2] = "getContributedVariables";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                case 4:
                    objArr[2] = "computeProperties";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 8:
                    objArr[2] = "computeFunctions";
                    break;
                case 10:
                case 11:
                    objArr[2] = "resolveFakeOverrides";
                    break;
                case 13:
                case 14:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 20:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            if (!(i == 3 || i == 7 || i == 9 || i == 12)) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        th = new IllegalArgumentException(format);
                        break;
                }
            }
            th = new IllegalStateException(format);
            throw th;
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public Collection<C14064m> m89025l() {
            HashSet hashSet = new HashSet();
            for (C16157f fVar : (Set) this.f62554e.f62548B.invoke()) {
                C12256d dVar = C12256d.FOR_NON_TRACKED_SCOPE;
                hashSet.addAll(mo72450c(fVar, dVar));
                hashSet.addAll(mo72451d(fVar, dVar));
            }
            return hashSet;
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public Collection<? extends C14156y0> m89026m(C16157f fVar) {
            if (fVar == null) {
                m89021h(8);
            }
            return m89029p(fVar, m89028o().mo72450c(fVar, C12256d.FOR_NON_TRACKED_SCOPE));
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public Collection<? extends C14140t0> m89027n(C16157f fVar) {
            if (fVar == null) {
                m89021h(4);
            }
            return m89029p(fVar, m89028o().mo72451d(fVar, C12256d.FOR_NON_TRACKED_SCOPE));
        }

        /* renamed from: o */
        private C14692h m89028o() {
            C14692h n = this.f62554e.mo62171j().mo72370l().iterator().next().mo72955n();
            if (n == null) {
                m89021h(9);
            }
            return n;
        }

        /* renamed from: p */
        private <D extends C13936b> Collection<? extends D> m89029p(C16157f fVar, Collection<? extends D> collection) {
            if (fVar == null) {
                m89021h(10);
            }
            if (collection == null) {
                m89021h(11);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C14658j.f63654f.mo73771v(fVar, collection, Collections.emptySet(), this.f62554e, new C14017d(linkedHashSet));
            return linkedHashSet;
        }

        /* renamed from: a */
        public Set<C16157f> mo72448a() {
            Set<C16157f> set = (Set) this.f62554e.f62548B.invoke();
            if (set == null) {
                m89021h(19);
            }
            return set;
        }

        /* renamed from: b */
        public Set<C16157f> mo72449b() {
            Set<C16157f> set = (Set) this.f62554e.f62548B.invoke();
            if (set == null) {
                m89021h(17);
            }
            return set;
        }

        /* renamed from: c */
        public Collection<? extends C14156y0> mo72450c(C16157f fVar, C12253b bVar) {
            if (fVar == null) {
                m89021h(5);
            }
            if (bVar == null) {
                m89021h(6);
            }
            Collection<? extends C14156y0> invoke = this.f62551b.invoke(fVar);
            if (invoke == null) {
                m89021h(7);
            }
            return invoke;
        }

        /* renamed from: d */
        public Collection<? extends C14140t0> mo72451d(C16157f fVar, C12253b bVar) {
            if (fVar == null) {
                m89021h(1);
            }
            if (bVar == null) {
                m89021h(2);
            }
            Collection<? extends C14140t0> invoke = this.f62552c.invoke(fVar);
            if (invoke == null) {
                m89021h(3);
            }
            return invoke;
        }

        /* renamed from: f */
        public Set<C16157f> mo72404f() {
            Set<C16157f> emptySet = Collections.emptySet();
            if (emptySet == null) {
                m89021h(18);
            }
            return emptySet;
        }

        /* renamed from: g */
        public Collection<C14064m> mo72405g(C14683d dVar, C16265l<? super C16157f, Boolean> lVar) {
            if (dVar == null) {
                m89021h(13);
            }
            if (lVar == null) {
                m89021h(14);
            }
            Collection<C14064m> collection = (Collection) this.f62553d.invoke();
            if (collection == null) {
                m89021h(15);
            }
            return collection;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C14012n(C17012n nVar, C13948e eVar, C14900e0 e0Var, C16157f fVar, C17006i<Set<C16157f>> iVar, C13921g gVar, C14158z0 z0Var) {
        super(nVar, eVar, fVar, z0Var, false);
        if (nVar == null) {
            m89000E0(6);
        }
        if (eVar == null) {
            m89000E0(7);
        }
        if (e0Var == null) {
            m89000E0(8);
        }
        if (fVar == null) {
            m89000E0(9);
        }
        if (iVar == null) {
            m89000E0(10);
        }
        if (gVar == null) {
            m89000E0(11);
        }
        if (z0Var == null) {
            m89000E0(12);
        }
        this.f62549C = gVar;
        this.f62550z = new C14943l(this, Collections.emptyList(), Collections.singleton(e0Var), nVar);
        this.f62547A = new C14013a(this, nVar);
        this.f62548B = iVar;
    }

    /* renamed from: E0 */
    private static /* synthetic */ void m89000E0(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: L0 */
    public static C14012n m89002L0(C17012n nVar, C13948e eVar, C16157f fVar, C17006i<Set<C16157f>> iVar, C13921g gVar, C14158z0 z0Var) {
        if (nVar == null) {
            m89000E0(0);
        }
        if (eVar == null) {
            m89000E0(1);
        }
        if (fVar == null) {
            m89000E0(2);
        }
        if (iVar == null) {
            m89000E0(3);
        }
        if (gVar == null) {
            m89000E0(4);
        }
        if (z0Var == null) {
            m89000E0(5);
        }
        return new C14012n(nVar, eVar, eVar.mo72274p(), fVar, iVar, gVar, z0Var);
    }

    /* renamed from: D */
    public C13944d mo62149D() {
        return null;
    }

    /* renamed from: I0 */
    public boolean mo62150I0() {
        return false;
    }

    /* renamed from: U */
    public C13960g1<C14951m0> mo62155U() {
        return null;
    }

    /* renamed from: Y */
    public boolean mo62160Y() {
        return false;
    }

    /* renamed from: a0 */
    public boolean mo62162a0() {
        return false;
    }

    /* renamed from: e0 */
    public boolean mo62164e0() {
        return false;
    }

    public C13921g getAnnotations() {
        C13921g gVar = this.f62549C;
        if (gVar == null) {
            m89000E0(21);
        }
        return gVar;
    }

    public C14141u getVisibility() {
        C14141u uVar = C14127t.f62754e;
        if (uVar == null) {
            m89000E0(20);
        }
        return uVar;
    }

    /* renamed from: h */
    public C13951f mo62168h() {
        C13951f fVar = C13951f.ENUM_ENTRY;
        if (fVar == null) {
            m89000E0(18);
        }
        return fVar;
    }

    public boolean isInline() {
        return false;
    }

    /* renamed from: j */
    public C14901e1 mo62171j() {
        C14901e1 e1Var = this.f62550z;
        if (e1Var == null) {
            m89000E0(17);
        }
        return e1Var;
    }

    /* renamed from: j0 */
    public boolean mo62172j0() {
        return false;
    }

    /* renamed from: k */
    public Collection<C13944d> mo62173k() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            m89000E0(16);
        }
        return emptyList;
    }

    /* renamed from: k0 */
    public C14692h mo62174k0(C14849g gVar) {
        if (gVar == null) {
            m89000E0(13);
        }
        C14692h hVar = this.f62547A;
        if (hVar == null) {
            m89000E0(14);
        }
        return hVar;
    }

    /* renamed from: l0 */
    public boolean mo62175l0() {
        return false;
    }

    /* renamed from: m0 */
    public C14692h mo62176m0() {
        C14692h.C14695b bVar = C14692h.C14695b.f63726b;
        if (bVar == null) {
            m89000E0(15);
        }
        return bVar;
    }

    /* renamed from: n0 */
    public C13948e mo62177n0() {
        return null;
    }

    /* renamed from: q */
    public List<C13950e1> mo62178q() {
        List<C13950e1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m89000E0(22);
        }
        return emptyList;
    }

    /* renamed from: r */
    public C13945d0 mo62179r() {
        C13945d0 d0Var = C13945d0.FINAL;
        if (d0Var == null) {
            m89000E0(19);
        }
        return d0Var;
    }

    public String toString() {
        return "enum entry " + getName();
    }

    /* renamed from: w */
    public Collection<C13948e> mo62181w() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            m89000E0(23);
        }
        return emptyList;
    }

    /* renamed from: y */
    public boolean mo62182y() {
        return false;
    }
}

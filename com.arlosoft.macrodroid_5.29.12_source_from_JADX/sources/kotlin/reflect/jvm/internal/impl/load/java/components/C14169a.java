package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13944d;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.resolve.C14656h;
import kotlin.reflect.jvm.internal.impl.resolve.C14658j;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14806r;
import p297ja.C13339u;
import p362pb.C16157f;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.a */
/* compiled from: DescriptorResolverUtils */
public final class C14169a {

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.a$a */
    /* compiled from: DescriptorResolverUtils */
    static class C14170a extends C14656h {

        /* renamed from: a */
        final /* synthetic */ C14806r f62839a;

        /* renamed from: b */
        final /* synthetic */ Set f62840b;

        /* renamed from: c */
        final /* synthetic */ boolean f62841c;

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.components.a$a$a */
        /* compiled from: DescriptorResolverUtils */
        class C14171a implements C16265l<C13936b, C13339u> {
            C14171a() {
            }

            /* renamed from: a */
            private static /* synthetic */ void m89667a(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"}));
            }

            /* renamed from: b */
            public C13339u invoke(C13936b bVar) {
                if (bVar == null) {
                    m89667a(0);
                }
                C14170a.this.f62839a.mo67439a(bVar);
                return C13339u.f61331a;
            }
        }

        C14170a(C14806r rVar, Set set, boolean z) {
            this.f62839a = rVar;
            this.f62840b = set;
            this.f62841c = z;
        }

        /* renamed from: f */
        private static /* synthetic */ void m89663f(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "fromSuper";
            } else if (i == 2) {
                objArr[0] = "fromCurrent";
            } else if (i == 3) {
                objArr[0] = "member";
            } else if (i != 4) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "overridden";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
            if (i == 1 || i == 2) {
                objArr[2] = "conflict";
            } else if (i == 3 || i == 4) {
                objArr[2] = "setOverriddenDescriptors";
            } else {
                objArr[2] = "addFakeOverride";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public void mo72455a(C13936b bVar) {
            if (bVar == null) {
                m89663f(0);
            }
            C14658j.m91664K(bVar, new C14171a());
            this.f62840b.add(bVar);
        }

        /* renamed from: d */
        public void mo72684d(C13936b bVar, Collection<? extends C13936b> collection) {
            if (bVar == null) {
                m89663f(3);
            }
            if (collection == null) {
                m89663f(4);
            }
            if (!this.f62841c || bVar.mo72264h() == C13936b.C13937a.FAKE_OVERRIDE) {
                super.mo72684d(bVar, collection);
            }
        }

        /* renamed from: e */
        public void mo72456e(C13936b bVar, C13936b bVar2) {
            if (bVar == null) {
                m89663f(1);
            }
            if (bVar2 == null) {
                m89663f(2);
            }
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m89658a(int i) {
        String str = i != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 18 ? 3 : 2)];
        switch (i) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
            default:
                objArr[0] = "name";
                break;
        }
        if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String format = String.format(str, objArr);
        throw (i != 18 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    /* renamed from: b */
    public static C13966i1 m89659b(C16157f fVar, C13948e eVar) {
        if (fVar == null) {
            m89658a(19);
        }
        if (eVar == null) {
            m89658a(20);
        }
        Collection<C13944d> k = eVar.mo62173k();
        if (k.size() != 1) {
            return null;
        }
        for (C13966i1 next : k.iterator().next().mo72235g()) {
            if (next.getName().equals(fVar)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: c */
    private static <D extends C13936b> Collection<D> m89660c(C16157f fVar, Collection<D> collection, Collection<D> collection2, C13948e eVar, C14806r rVar, C14658j jVar, boolean z) {
        if (fVar == null) {
            m89658a(12);
        }
        if (collection == null) {
            m89658a(13);
        }
        if (collection2 == null) {
            m89658a(14);
        }
        if (eVar == null) {
            m89658a(15);
        }
        if (rVar == null) {
            m89658a(16);
        }
        if (jVar == null) {
            m89658a(17);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        jVar.mo73771v(fVar, collection, collection2, eVar, new C14170a(rVar, linkedHashSet, z));
        return linkedHashSet;
    }

    /* renamed from: d */
    public static <D extends C13936b> Collection<D> m89661d(C16157f fVar, Collection<D> collection, Collection<D> collection2, C13948e eVar, C14806r rVar, C14658j jVar) {
        if (fVar == null) {
            m89658a(0);
        }
        if (collection == null) {
            m89658a(1);
        }
        if (collection2 == null) {
            m89658a(2);
        }
        if (eVar == null) {
            m89658a(3);
        }
        if (rVar == null) {
            m89658a(4);
        }
        if (jVar == null) {
            m89658a(5);
        }
        return m89660c(fVar, collection, collection2, eVar, rVar, jVar, false);
    }

    /* renamed from: e */
    public static <D extends C13936b> Collection<D> m89662e(C16157f fVar, Collection<D> collection, Collection<D> collection2, C13948e eVar, C14806r rVar, C14658j jVar) {
        if (fVar == null) {
            m89658a(6);
        }
        if (collection == null) {
            m89658a(7);
        }
        if (collection2 == null) {
            m89658a(8);
        }
        if (eVar == null) {
            m89658a(9);
        }
        if (rVar == null) {
            m89658a(10);
        }
        if (jVar == null) {
            m89658a(11);
        }
        return m89660c(fVar, collection, collection2, eVar, rVar, jVar, true);
    }
}

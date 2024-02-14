package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13941c0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13945d0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14075q;
import kotlin.reflect.jvm.internal.impl.descriptors.C14126s0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14127t;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14141u;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13976b0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13978c0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C14020p;
import kotlin.reflect.jvm.internal.impl.resolve.C14651e;
import kotlin.reflect.jvm.internal.impl.types.C14833b0;
import kotlin.reflect.jvm.internal.impl.types.C14889d1;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14901e1;
import kotlin.reflect.jvm.internal.impl.types.C14902f;
import kotlin.reflect.jvm.internal.impl.types.C14925g0;
import kotlin.reflect.jvm.internal.impl.types.checker.C14844e;
import kotlin.reflect.jvm.internal.impl.types.checker.C14846f;
import kotlin.reflect.jvm.internal.impl.types.checker.C14849g;
import p272gc.C12359f;
import p297ja.C13328m;
import p297ja.C13339u;
import p362pb.C16157f;
import p370qa.C16254a;
import p370qa.C16265l;
import p370qa.C16269p;
import p389sb.C16519a;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.j */
/* compiled from: OverridingUtil */
public class C14658j {

    /* renamed from: e */
    private static final List<C14651e> f63653e;

    /* renamed from: f */
    public static final C14658j f63654f;

    /* renamed from: g */
    private static final C14844e.C14845a f63655g;

    /* renamed from: a */
    private final C14849g f63656a;

    /* renamed from: b */
    private final C14846f f63657b;

    /* renamed from: c */
    private final C14844e.C14845a f63658c;

    /* renamed from: d */
    private final C16269p<C14900e0, C14900e0, Boolean> f63659d;

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.j$a */
    /* compiled from: OverridingUtil */
    static class C14659a implements C14844e.C14845a {
        C14659a() {
        }

        /* renamed from: b */
        private static /* synthetic */ void m91695b(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public boolean mo73697a(C14901e1 e1Var, C14901e1 e1Var2) {
            if (e1Var == null) {
                m91695b(0);
            }
            if (e1Var2 == null) {
                m91695b(1);
            }
            return e1Var.equals(e1Var2);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.j$b */
    /* compiled from: OverridingUtil */
    static class C14660b implements C16269p<D, D, C13328m<C13908a, C13908a>> {
        C14660b() {
        }

        /* renamed from: a */
        public C13328m<C13908a, C13908a> invoke(D d, D d2) {
            return new C13328m<>(d, d2);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.j$c */
    /* compiled from: OverridingUtil */
    static class C14661c implements C16265l<C13936b, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C14064m f63660a;

        C14661c(C14064m mVar) {
            this.f63660a = mVar;
        }

        /* renamed from: a */
        public Boolean invoke(C13936b bVar) {
            return Boolean.valueOf(bVar.mo62163b() == this.f63660a);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.j$d */
    /* compiled from: OverridingUtil */
    static class C14662d implements C16265l<C13936b, C13908a> {
        C14662d() {
        }

        /* renamed from: a */
        public C13936b invoke(C13936b bVar) {
            return bVar;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.j$e */
    /* compiled from: OverridingUtil */
    static class C14663e implements C16265l<C13936b, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C13948e f63661a;

        C14663e(C13948e eVar) {
            this.f63661a = eVar;
        }

        /* renamed from: a */
        public Boolean invoke(C13936b bVar) {
            boolean z = false;
            if (!C14127t.m89525g(bVar.getVisibility()) && C14127t.m89526h(bVar, this.f63661a, false)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.j$f */
    /* compiled from: OverridingUtil */
    static class C14664f implements C16265l<C13936b, C13908a> {
        C14664f() {
        }

        /* renamed from: a */
        public C13908a invoke(C13936b bVar) {
            return bVar;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.j$g */
    /* compiled from: OverridingUtil */
    static class C14665g implements C16265l<C13936b, C13339u> {

        /* renamed from: a */
        final /* synthetic */ C14657i f63662a;

        /* renamed from: c */
        final /* synthetic */ C13936b f63663c;

        C14665g(C14657i iVar, C13936b bVar) {
            this.f63662a = iVar;
            this.f63663c = bVar;
        }

        /* renamed from: a */
        public C13339u invoke(C13936b bVar) {
            this.f63662a.mo73766b(this.f63663c, bVar);
            return C13339u.f61331a;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.j$h */
    /* compiled from: OverridingUtil */
    static /* synthetic */ class C14666h {

        /* renamed from: a */
        static final /* synthetic */ int[] f63664a;

        /* renamed from: b */
        static final /* synthetic */ int[] f63665b;

        /* renamed from: c */
        static final /* synthetic */ int[] f63666c;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007d */
        static {
            /*
                kotlin.reflect.jvm.internal.impl.descriptors.d0[] r0 = kotlin.reflect.jvm.internal.impl.descriptors.C13945d0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f63666c = r0
                r1 = 1
                kotlin.reflect.jvm.internal.impl.descriptors.d0 r2 = kotlin.reflect.jvm.internal.impl.descriptors.C13945d0.FINAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f63666c     // Catch:{ NoSuchFieldError -> 0x001d }
                kotlin.reflect.jvm.internal.impl.descriptors.d0 r3 = kotlin.reflect.jvm.internal.impl.descriptors.C13945d0.SEALED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f63666c     // Catch:{ NoSuchFieldError -> 0x0028 }
                kotlin.reflect.jvm.internal.impl.descriptors.d0 r4 = kotlin.reflect.jvm.internal.impl.descriptors.C13945d0.OPEN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f63666c     // Catch:{ NoSuchFieldError -> 0x0033 }
                kotlin.reflect.jvm.internal.impl.descriptors.d0 r5 = kotlin.reflect.jvm.internal.impl.descriptors.C13945d0.ABSTRACT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                kotlin.reflect.jvm.internal.impl.resolve.j$i$a[] r4 = kotlin.reflect.jvm.internal.impl.resolve.C14658j.C14667i.C14668a.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f63665b = r4
                kotlin.reflect.jvm.internal.impl.resolve.j$i$a r5 = kotlin.reflect.jvm.internal.impl.resolve.C14658j.C14667i.C14668a.OVERRIDABLE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r4 = f63665b     // Catch:{ NoSuchFieldError -> 0x004e }
                kotlin.reflect.jvm.internal.impl.resolve.j$i$a r5 = kotlin.reflect.jvm.internal.impl.resolve.C14658j.C14667i.C14668a.CONFLICT     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r4 = f63665b     // Catch:{ NoSuchFieldError -> 0x0058 }
                kotlin.reflect.jvm.internal.impl.resolve.j$i$a r5 = kotlin.reflect.jvm.internal.impl.resolve.C14658j.C14667i.C14668a.INCOMPATIBLE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                kotlin.reflect.jvm.internal.impl.resolve.e$b[] r4 = kotlin.reflect.jvm.internal.impl.resolve.C14651e.C14653b.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f63664a = r4
                kotlin.reflect.jvm.internal.impl.resolve.e$b r5 = kotlin.reflect.jvm.internal.impl.resolve.C14651e.C14653b.OVERRIDABLE     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r1 = f63664a     // Catch:{ NoSuchFieldError -> 0x0073 }
                kotlin.reflect.jvm.internal.impl.resolve.e$b r4 = kotlin.reflect.jvm.internal.impl.resolve.C14651e.C14653b.CONFLICT     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r0 = f63664a     // Catch:{ NoSuchFieldError -> 0x007d }
                kotlin.reflect.jvm.internal.impl.resolve.e$b r1 = kotlin.reflect.jvm.internal.impl.resolve.C14651e.C14653b.INCOMPATIBLE     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                int[] r0 = f63664a     // Catch:{ NoSuchFieldError -> 0x0087 }
                kotlin.reflect.jvm.internal.impl.resolve.e$b r1 = kotlin.reflect.jvm.internal.impl.resolve.C14651e.C14653b.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.C14658j.C14666h.<clinit>():void");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.j$i */
    /* compiled from: OverridingUtil */
    public static class C14667i {

        /* renamed from: c */
        private static final C14667i f63667c = new C14667i(C14668a.OVERRIDABLE, "SUCCESS");

        /* renamed from: a */
        private final C14668a f63668a;

        /* renamed from: b */
        private final String f63669b;

        /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.j$i$a */
        /* compiled from: OverridingUtil */
        public enum C14668a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public C14667i(C14668a aVar, String str) {
            if (aVar == null) {
                m91703a(3);
            }
            if (str == null) {
                m91703a(4);
            }
            this.f63668a = aVar;
            this.f63669b = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x003b  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x005a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static /* synthetic */ void m91703a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto L_0x000f
                if (r10 == r2) goto L_0x000f
                if (r10 == r1) goto L_0x000f
                if (r10 == r0) goto L_0x000f
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L_0x0011
            L_0x000f:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L_0x0011:
                if (r10 == r3) goto L_0x001b
                if (r10 == r2) goto L_0x001b
                if (r10 == r1) goto L_0x001b
                if (r10 == r0) goto L_0x001b
                r5 = 2
                goto L_0x001c
            L_0x001b:
                r5 = 3
            L_0x001c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L_0x0031
                if (r10 == r2) goto L_0x0031
                if (r10 == r1) goto L_0x002e
                if (r10 == r0) goto L_0x0031
                r5[r8] = r7
                goto L_0x0035
            L_0x002e:
                r5[r8] = r6
                goto L_0x0035
            L_0x0031:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L_0x0035:
                switch(r10) {
                    case 1: goto L_0x0045;
                    case 2: goto L_0x0045;
                    case 3: goto L_0x0045;
                    case 4: goto L_0x0045;
                    case 5: goto L_0x0040;
                    case 6: goto L_0x003b;
                    default: goto L_0x0038;
                }
            L_0x0038:
                r5[r3] = r6
                goto L_0x0047
            L_0x003b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L_0x0047
            L_0x0040:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L_0x0047
            L_0x0045:
                r5[r3] = r7
            L_0x0047:
                if (r10 == r3) goto L_0x005a
                if (r10 == r2) goto L_0x0055
                if (r10 == r1) goto L_0x0050
                if (r10 == r0) goto L_0x0050
                goto L_0x005e
            L_0x0050:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L_0x005e
            L_0x0055:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L_0x005e
            L_0x005a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L_0x005e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L_0x0070
                if (r10 == r2) goto L_0x0070
                if (r10 == r1) goto L_0x0070
                if (r10 == r0) goto L_0x0070
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L_0x0075
            L_0x0070:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L_0x0075:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.C14658j.C14667i.m91703a(int):void");
        }

        /* renamed from: b */
        public static C14667i m91704b(String str) {
            if (str == null) {
                m91703a(2);
            }
            return new C14667i(C14668a.CONFLICT, str);
        }

        /* renamed from: d */
        public static C14667i m91705d(String str) {
            if (str == null) {
                m91703a(1);
            }
            return new C14667i(C14668a.INCOMPATIBLE, str);
        }

        /* renamed from: e */
        public static C14667i m91706e() {
            C14667i iVar = f63667c;
            if (iVar == null) {
                m91703a(0);
            }
            return iVar;
        }

        /* renamed from: c */
        public C14668a mo73778c() {
            C14668a aVar = this.f63668a;
            if (aVar == null) {
                m91703a(5);
            }
            return aVar;
        }
    }

    static {
        Class<C14651e> cls = C14651e.class;
        f63653e = C13566b0.m87402F0(ServiceLoader.load(cls, cls.getClassLoader()));
        C14659a aVar = new C14659a();
        f63655g = aVar;
        f63654f = new C14658j(aVar, C14849g.C14850a.f63969a, C14846f.C14847a.f63968a, (C16269p<C14900e0, C14900e0, Boolean>) null);
    }

    private C14658j(C14844e.C14845a aVar, C14849g gVar, C14846f fVar, C16269p<C14900e0, C14900e0, Boolean> pVar) {
        if (aVar == null) {
            m91666a(5);
        }
        if (gVar == null) {
            m91666a(6);
        }
        if (fVar == null) {
            m91666a(7);
        }
        this.f63658c = aVar;
        this.f63656a = gVar;
        this.f63657b = fVar;
        this.f63659d = pVar;
    }

    /* renamed from: A */
    private static boolean m91657A(C14126s0 s0Var, C14126s0 s0Var2) {
        if (s0Var == null || s0Var2 == null) {
            return true;
        }
        return m91661H(s0Var, s0Var2);
    }

    /* renamed from: B */
    public static boolean m91658B(C13908a aVar, C13908a aVar2) {
        if (aVar == null) {
            m91666a(67);
        }
        if (aVar2 == null) {
            m91666a(68);
        }
        C14900e0 returnType = aVar.getReturnType();
        C14900e0 returnType2 = aVar2.getReturnType();
        if (!m91661H(aVar, aVar2)) {
            return false;
        }
        C14889d1 l = f63654f.m91677l(aVar.getTypeParameters(), aVar2.getTypeParameters());
        if (aVar instanceof C14154y) {
            return m91660G(aVar, returnType, aVar2, returnType2, l);
        }
        if (aVar instanceof C14140t0) {
            C14140t0 t0Var = (C14140t0) aVar;
            C14140t0 t0Var2 = (C14140t0) aVar2;
            if (!m91657A(t0Var.mo72334H(), t0Var2.mo72334H())) {
                return false;
            }
            if (t0Var.mo72440N() && t0Var2.mo72440N()) {
                return C14902f.f64032a.mo74149k(l, returnType.mo74145Q0(), returnType2.mo74145Q0());
            }
            if ((t0Var.mo72440N() || !t0Var2.mo72440N()) && m91660G(aVar, returnType, aVar2, returnType2, l)) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Unexpected callable: " + aVar.getClass());
    }

    /* renamed from: C */
    private static boolean m91659C(C13908a aVar, Collection<C13908a> collection) {
        if (aVar == null) {
            m91666a(71);
        }
        if (collection == null) {
            m91666a(72);
        }
        for (C13908a B : collection) {
            if (!m91658B(aVar, B)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: G */
    private static boolean m91660G(C13908a aVar, C14900e0 e0Var, C13908a aVar2, C14900e0 e0Var2, C14889d1 d1Var) {
        if (aVar == null) {
            m91666a(73);
        }
        if (e0Var == null) {
            m91666a(74);
        }
        if (aVar2 == null) {
            m91666a(75);
        }
        if (e0Var2 == null) {
            m91666a(76);
        }
        if (d1Var == null) {
            m91666a(77);
        }
        return C14902f.f64032a.mo74152r(d1Var, e0Var.mo74145Q0(), e0Var2.mo74145Q0());
    }

    /* renamed from: H */
    private static boolean m91661H(C14075q qVar, C14075q qVar2) {
        if (qVar == null) {
            m91666a(69);
        }
        if (qVar2 == null) {
            m91666a(70);
        }
        Integer d = C14127t.m89522d(qVar.getVisibility(), qVar2.getVisibility());
        return d == null || d.intValue() >= 0;
    }

    /* renamed from: I */
    public static boolean m91662I(C13941c0 c0Var, C13941c0 c0Var2, boolean z) {
        if (c0Var == null) {
            m91666a(57);
        }
        if (c0Var2 == null) {
            m91666a(58);
        }
        return !C14127t.m89525g(c0Var2.getVisibility()) && C14127t.m89526h(c0Var2, c0Var, z);
    }

    /* renamed from: J */
    public static <D extends C13908a> boolean m91663J(D d, D d2, boolean z, boolean z2) {
        if (d == null) {
            m91666a(13);
        }
        if (d2 == null) {
            m91666a(14);
        }
        if (!d.equals(d2) && C14597b.f63599a.mo73693d(d.mo72233a(), d2.mo72233a(), z, z2)) {
            return true;
        }
        C13908a a = d2.mo72233a();
        for (C13908a d3 : C14650d.m91617d(d)) {
            if (C14597b.f63599a.mo73693d(a, d3, z, z2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: K */
    public static void m91664K(C13936b bVar, C16265l<C13936b, C13339u> lVar) {
        C14141u uVar;
        if (bVar == null) {
            m91666a(107);
        }
        for (C13936b bVar2 : bVar.mo72234d()) {
            if (bVar2.getVisibility() == C14127t.f62756g) {
                m91664K(bVar2, lVar);
            }
        }
        if (bVar.getVisibility() == C14127t.f62756g) {
            C14141u h = m91673h(bVar);
            if (h == null) {
                if (lVar != null) {
                    lVar.invoke(bVar);
                }
                uVar = C14127t.f62754e;
            } else {
                uVar = h;
            }
            if (bVar instanceof C13978c0) {
                ((C13978c0) bVar).mo72345c1(uVar);
                for (C14126s0 K : ((C14140t0) bVar).mo72347u()) {
                    m91664K(K, h == null ? null : lVar);
                }
            } else if (bVar instanceof C14020p) {
                ((C14020p) bVar).mo72470j1(uVar);
            } else {
                C13976b0 b0Var = (C13976b0) bVar;
                b0Var.mo72326O0(uVar);
                if (uVar != b0Var.mo72327W().getVisibility()) {
                    b0Var.mo72324M0(false);
                }
            }
        }
    }

    /* renamed from: L */
    public static <H> H m91665L(Collection<H> collection, C16265l<H, C13908a> lVar) {
        if (collection == null) {
            m91666a(78);
        }
        if (lVar == null) {
            m91666a(79);
        }
        if (collection.size() == 1) {
            H V = C13566b0.m87421V(collection);
            if (V == null) {
                m91666a(80);
            }
            return V;
        }
        ArrayList arrayList = new ArrayList(2);
        List l0 = C13566b0.m87437l0(collection, lVar);
        H V2 = C13566b0.m87421V(collection);
        C13908a invoke = lVar.invoke(V2);
        for (H next : collection) {
            C13908a invoke2 = lVar.invoke(next);
            if (m91659C(invoke2, l0)) {
                arrayList.add(next);
            }
            if (m91658B(invoke2, invoke) && !m91658B(invoke, invoke2)) {
                V2 = next;
            }
        }
        if (arrayList.isEmpty()) {
            if (V2 == null) {
                m91666a(81);
            }
            return V2;
        } else if (arrayList.size() == 1) {
            H V3 = C13566b0.m87421V(arrayList);
            if (V3 == null) {
                m91666a(82);
            }
            return V3;
        } else {
            H h = null;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                H next2 = it.next();
                if (!C14833b0.m92415b(lVar.invoke(next2).getReturnType())) {
                    h = next2;
                    break;
                }
            }
            if (h != null) {
                return h;
            }
            H V4 = C13566b0.m87421V(arrayList);
            if (V4 == null) {
                m91666a(84);
            }
            return V4;
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m91666a(int i) {
        String str;
        int i2;
        Throwable th;
        int i3 = i;
        if (!(i3 == 11 || i3 == 12 || i3 == 16 || i3 == 21 || i3 == 95 || i3 == 98 || i3 == 103 || i3 == 44 || i3 == 45)) {
            switch (i3) {
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    break;
                default:
                    switch (i3) {
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            break;
                        default:
                            switch (i3) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    break;
                                default:
                                    switch (i3) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                            }
                    }
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i3 == 11 || i3 == 12 || i3 == 16 || i3 == 21 || i3 == 95 || i3 == 98 || i3 == 103 || i3 == 44 || i3 == 45)) {
            switch (i3) {
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    break;
                default:
                    switch (i3) {
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            break;
                        default:
                            switch (i3) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    break;
                                default:
                                    switch (i3) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                            }
                    }
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i3) {
            case 1:
            case 7:
                objArr[0] = "kotlinTypePreparator";
                break;
            case 2:
                objArr[0] = "customSubtype";
                break;
            case 4:
                objArr[0] = "equalityAxioms";
                break;
            case 5:
                objArr[0] = "axioms";
                break;
            case 8:
            case 9:
                objArr[0] = "candidateSet";
                break;
            case 10:
                objArr[0] = "transformFirst";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 44:
            case 45:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 90:
            case 91:
            case 92:
            case 95:
            case 98:
            case 103:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 13:
                objArr[0] = "f";
                break;
            case 14:
                objArr[0] = "g";
                break;
            case 15:
            case 17:
                objArr[0] = "descriptor";
                break;
            case 18:
                objArr[0] = "result";
                break;
            case 19:
            case 22:
            case 30:
            case 40:
                objArr[0] = "superDescriptor";
                break;
            case 20:
            case 23:
            case 31:
            case 41:
                objArr[0] = "subDescriptor";
                break;
            case 42:
                objArr[0] = "firstParameters";
                break;
            case 43:
                objArr[0] = "secondParameters";
                break;
            case 46:
                objArr[0] = "typeInSuper";
                break;
            case 47:
                objArr[0] = "typeInSub";
                break;
            case 48:
            case 51:
            case 77:
                objArr[0] = "typeCheckerState";
                break;
            case 49:
                objArr[0] = "superTypeParameter";
                break;
            case 50:
                objArr[0] = "subTypeParameter";
                break;
            case 52:
                objArr[0] = "name";
                break;
            case 53:
                objArr[0] = "membersFromSupertypes";
                break;
            case 54:
                objArr[0] = "membersFromCurrent";
                break;
            case 55:
            case 61:
            case 64:
            case 86:
            case 89:
            case 96:
                objArr[0] = "current";
                break;
            case 56:
            case 62:
            case 66:
            case 87:
            case 106:
                objArr[0] = "strategy";
                break;
            case 57:
                objArr[0] = "overriding";
                break;
            case 58:
                objArr[0] = "fromSuper";
                break;
            case 59:
                objArr[0] = "fromCurrent";
                break;
            case 60:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 63:
            case 65:
                objArr[0] = "notOverridden";
                break;
            case 67:
            case 69:
            case 73:
                objArr[0] = "a";
                break;
            case 68:
            case 70:
            case 75:
                objArr[0] = "b";
                break;
            case 71:
                objArr[0] = "candidate";
                break;
            case 72:
            case 88:
            case 93:
            case 109:
                objArr[0] = "descriptors";
                break;
            case 74:
                objArr[0] = "aReturnType";
                break;
            case 76:
                objArr[0] = "bReturnType";
                break;
            case 78:
            case 85:
                objArr[0] = "overridables";
                break;
            case 79:
            case 101:
                objArr[0] = "descriptorByHandle";
                break;
            case 94:
                objArr[0] = "classModality";
                break;
            case 97:
                objArr[0] = "toFilter";
                break;
            case 99:
            case 104:
                objArr[0] = "overrider";
                break;
            case 100:
            case 105:
                objArr[0] = "extractFrom";
                break;
            case 102:
                objArr[0] = "onConflict";
                break;
            case 107:
            case 108:
                objArr[0] = "memberDescriptor";
                break;
            default:
                objArr[0] = "kotlinTypeRefiner";
                break;
        }
        if (i3 == 11 || i3 == 12) {
            objArr[1] = "filterOverrides";
        } else if (i3 != 16) {
            if (i3 != 21) {
                if (i3 == 95) {
                    objArr[1] = "getMinimalModality";
                } else if (i3 == 98) {
                    objArr[1] = "filterVisibleFakeOverrides";
                } else if (i3 != 103) {
                    if (i3 != 44 && i3 != 45) {
                        switch (i3) {
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                                break;
                            default:
                                switch (i3) {
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                        objArr[1] = "isOverridableByWithoutExternalConditions";
                                        break;
                                    default:
                                        switch (i3) {
                                            case 80:
                                            case 81:
                                            case 82:
                                            case 83:
                                            case 84:
                                                objArr[1] = "selectMostSpecificMember";
                                                break;
                                            default:
                                                switch (i3) {
                                                    case 90:
                                                    case 91:
                                                    case 92:
                                                        objArr[1] = "determineModalityForFakeOverride";
                                                        break;
                                                    default:
                                                        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                                        break;
                                                }
                                        }
                                }
                        }
                    } else {
                        objArr[1] = "createTypeCheckerState";
                    }
                } else {
                    objArr[1] = "extractMembersOverridableInBothWays";
                }
            }
            objArr[1] = "isOverridableBy";
        } else {
            objArr[1] = "getOverriddenDeclarations";
        }
        switch (i3) {
            case 1:
            case 2:
                objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            case 3:
            case 4:
                objArr[2] = "create";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "<init>";
                break;
            case 8:
                objArr[2] = "filterOutOverridden";
                break;
            case 9:
            case 10:
                objArr[2] = "filterOverrides";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 44:
            case 45:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 90:
            case 91:
            case 92:
            case 95:
            case 98:
            case 103:
                break;
            case 13:
            case 14:
                objArr[2] = "overrides";
                break;
            case 15:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 17:
            case 18:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 19:
            case 20:
            case 22:
            case 23:
                objArr[2] = "isOverridableBy";
                break;
            case 30:
            case 31:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 40:
            case 41:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 42:
            case 43:
                objArr[2] = "createTypeCheckerState";
                break;
            case 46:
            case 47:
            case 48:
                objArr[2] = "areTypesEquivalent";
                break;
            case 49:
            case 50:
            case 51:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 57:
            case 58:
                objArr[2] = "isVisibleForOverride";
                break;
            case 59:
            case 60:
            case 61:
            case 62:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 63:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 64:
            case 65:
            case 66:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 67:
            case 68:
                objArr[2] = "isMoreSpecific";
                break;
            case 69:
            case 70:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 71:
            case 72:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 78:
            case 79:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 85:
            case 86:
            case 87:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 88:
            case 89:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 93:
            case 94:
                objArr[2] = "getMinimalModality";
                break;
            case 96:
            case 97:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 99:
            case 100:
            case 101:
            case 102:
            case 104:
            case 105:
            case 106:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 107:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 108:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 109:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithTypeRefiner";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i3 == 11 || i3 == 12 || i3 == 16 || i3 == 21 || i3 == 95 || i3 == 98 || i3 == 103 || i3 == 44 || i3 == 45)) {
            switch (i3) {
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    break;
                default:
                    switch (i3) {
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            break;
                        default:
                            switch (i3) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    break;
                                default:
                                    switch (i3) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            break;
                                        default:
                                            th = new IllegalArgumentException(format);
                                            break;
                                    }
                            }
                    }
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    /* renamed from: b */
    private static boolean m91667b(Collection<C13936b> collection) {
        if (collection == null) {
            m91666a(63);
        }
        if (collection.size() < 2) {
            return true;
        }
        return C13566b0.m87408L(collection, new C14661c(collection.iterator().next().mo62163b()));
    }

    /* renamed from: c */
    private static boolean m91668c(C13950e1 e1Var, C13950e1 e1Var2, C14889d1 d1Var) {
        if (e1Var == null) {
            m91666a(49);
        }
        if (e1Var2 == null) {
            m91666a(50);
        }
        if (d1Var == null) {
            m91666a(51);
        }
        List<C14900e0> upperBounds = e1Var.getUpperBounds();
        ArrayList arrayList = new ArrayList(e1Var2.getUpperBounds());
        if (upperBounds.size() != arrayList.size()) {
            return false;
        }
        for (C14900e0 next : upperBounds) {
            ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (m91669d(next, (C14900e0) listIterator.next(), d1Var)) {
                    listIterator.remove();
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m91669d(C14900e0 e0Var, C14900e0 e0Var2, C14889d1 d1Var) {
        if (e0Var == null) {
            m91666a(46);
        }
        if (e0Var2 == null) {
            m91666a(47);
        }
        if (d1Var == null) {
            m91666a(48);
        }
        if (C14925g0.m92873a(e0Var) && C14925g0.m92873a(e0Var2)) {
            return true;
        }
        return C14902f.f64032a.mo74149k(d1Var, e0Var.mo74145Q0(), e0Var2.mo74145Q0());
    }

    /* renamed from: e */
    private static C14667i m91670e(C13908a aVar, C13908a aVar2) {
        boolean z = true;
        boolean z2 = aVar.mo72232P() == null;
        if (aVar2.mo72232P() != null) {
            z = false;
        }
        if (z2 != z) {
            return C14667i.m91705d("Receiver presence mismatch");
        }
        if (aVar.mo72235g().size() != aVar2.mo72235g().size()) {
            return C14667i.m91705d("Value parameter number mismatch");
        }
        return null;
    }

    /* renamed from: f */
    private static void m91671f(C13936b bVar, Set<C13936b> set) {
        if (bVar == null) {
            m91666a(17);
        }
        if (set == null) {
            m91666a(18);
        }
        if (bVar.mo72264h().mo72265b()) {
            set.add(bVar);
        } else if (!bVar.mo72234d().isEmpty()) {
            for (C13936b f : bVar.mo72234d()) {
                m91671f(f, set);
            }
        } else {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + bVar);
        }
    }

    /* renamed from: g */
    private static List<C14900e0> m91672g(C13908a aVar) {
        C14146w0 P = aVar.mo72232P();
        ArrayList arrayList = new ArrayList();
        if (P != null) {
            arrayList.add(P.getType());
        }
        for (C13966i1 type : aVar.mo72235g()) {
            arrayList.add(type.getType());
        }
        return arrayList;
    }

    /* renamed from: h */
    private static C14141u m91673h(C13936b bVar) {
        if (bVar == null) {
            m91666a(108);
        }
        Collection<? extends C13936b> d = bVar.mo72234d();
        C14141u u = m91686u(d);
        if (u == null) {
            return null;
        }
        if (bVar.mo72264h() != C13936b.C13937a.FAKE_OVERRIDE) {
            return u.mo72572f();
        }
        for (C13936b bVar2 : d) {
            if (bVar2.mo62179r() != C13945d0.ABSTRACT && !bVar2.getVisibility().equals(u)) {
                return null;
            }
        }
        return u;
    }

    /* renamed from: i */
    public static C14658j m91674i(C14849g gVar, C14844e.C14845a aVar) {
        if (gVar == null) {
            m91666a(3);
        }
        if (aVar == null) {
            m91666a(4);
        }
        return new C14658j(aVar, gVar, C14846f.C14847a.f63968a, (C16269p<C14900e0, C14900e0, Boolean>) null);
    }

    /* renamed from: j */
    private static void m91675j(Collection<C13936b> collection, C13948e eVar, C14657i iVar) {
        if (collection == null) {
            m91666a(85);
        }
        if (eVar == null) {
            m91666a(86);
        }
        if (iVar == null) {
            m91666a(87);
        }
        Collection<C13936b> t = m91685t(eVar, collection);
        boolean isEmpty = t.isEmpty();
        if (!isEmpty) {
            collection = t;
        }
        C13936b O = ((C13936b) m91665L(collection, new C14662d())).mo72263O(eVar, m91679n(collection, eVar), isEmpty ? C14127t.f62757h : C14127t.f62756g, C13936b.C13937a.FAKE_OVERRIDE, false);
        iVar.mo72684d(O, collection);
        iVar.mo72455a(O);
    }

    /* renamed from: k */
    private static void m91676k(C13948e eVar, Collection<C13936b> collection, C14657i iVar) {
        if (eVar == null) {
            m91666a(64);
        }
        if (collection == null) {
            m91666a(65);
        }
        if (iVar == null) {
            m91666a(66);
        }
        if (m91667b(collection)) {
            for (C13936b singleton : collection) {
                m91675j(Collections.singleton(singleton), eVar, iVar);
            }
            return;
        }
        LinkedList linkedList = new LinkedList(collection);
        while (!linkedList.isEmpty()) {
            m91675j(m91682q(C14676p.m91799a(linkedList), linkedList, iVar), eVar, iVar);
        }
    }

    /* renamed from: l */
    private C14889d1 m91677l(List<C13950e1> list, List<C13950e1> list2) {
        if (list == null) {
            m91666a(42);
        }
        if (list2 == null) {
            m91666a(43);
        }
        if (list.isEmpty()) {
            C14889d1 H0 = new C14669k((Map<C14901e1, ? extends C14901e1>) null, this.f63658c, this.f63656a, this.f63657b, this.f63659d).mo73779H0(true, true);
            if (H0 == null) {
                m91666a(44);
            }
            return H0;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            hashMap.put(list.get(i).mo62171j(), list2.get(i).mo62171j());
        }
        C14889d1 H02 = new C14669k(hashMap, this.f63658c, this.f63656a, this.f63657b, this.f63659d).mo73779H0(true, true);
        if (H02 == null) {
            m91666a(45);
        }
        return H02;
    }

    /* renamed from: m */
    public static C14658j m91678m(C14849g gVar) {
        if (gVar == null) {
            m91666a(0);
        }
        return new C14658j(f63655g, gVar, C14846f.C14847a.f63968a, (C16269p<C14900e0, C14900e0, Boolean>) null);
    }

    /* renamed from: n */
    private static C13945d0 m91679n(Collection<C13936b> collection, C13948e eVar) {
        if (collection == null) {
            m91666a(88);
        }
        if (eVar == null) {
            m91666a(89);
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (C13936b next : collection) {
            int i = C14666h.f63666c[next.mo62179r().ordinal()];
            if (i == 1) {
                C13945d0 d0Var = C13945d0.FINAL;
                if (d0Var == null) {
                    m91666a(90);
                }
                return d0Var;
            } else if (i == 2) {
                throw new IllegalStateException("Member cannot have SEALED modality: " + next);
            } else if (i == 3) {
                z2 = true;
            } else if (i == 4) {
                z3 = true;
            }
        }
        if (!(!eVar.mo62175l0() || eVar.mo62179r() == C13945d0.ABSTRACT || eVar.mo62179r() == C13945d0.SEALED)) {
            z = true;
        }
        if (z2 && !z3) {
            C13945d0 d0Var2 = C13945d0.OPEN;
            if (d0Var2 == null) {
                m91666a(91);
            }
            return d0Var2;
        } else if (z2 || !z3) {
            HashSet hashSet = new HashSet();
            for (C13936b z4 : collection) {
                hashSet.addAll(m91690z(z4));
            }
            return m91689y(m91683r(hashSet), z, eVar.mo62179r());
        } else {
            C13945d0 r = z ? eVar.mo62179r() : C13945d0.ABSTRACT;
            if (r == null) {
                m91666a(92);
            }
            return r;
        }
    }

    /* renamed from: o */
    private Collection<C13936b> m91680o(C13936b bVar, Collection<? extends C13936b> collection, C13948e eVar, C14657i iVar) {
        if (bVar == null) {
            m91666a(59);
        }
        if (collection == null) {
            m91666a(60);
        }
        if (eVar == null) {
            m91666a(61);
        }
        if (iVar == null) {
            m91666a(62);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        C12359f c = C12359f.m83113c();
        for (C13936b bVar2 : collection) {
            C14667i.C14668a c2 = mo73768D(bVar2, bVar, eVar).mo73778c();
            boolean I = m91662I(bVar, bVar2, false);
            int i = C14666h.f63665b[c2.ordinal()];
            if (i == 1) {
                if (I) {
                    c.add(bVar2);
                }
                arrayList.add(bVar2);
            } else if (i == 2) {
                if (I) {
                    iVar.mo73767c(bVar2, bVar);
                }
                arrayList.add(bVar2);
            }
        }
        iVar.mo72684d(bVar, c);
        return arrayList;
    }

    /* renamed from: p */
    public static <H> Collection<H> m91681p(H h, Collection<H> collection, C16265l<H, C13908a> lVar, C16265l<H, C13339u> lVar2) {
        if (h == null) {
            m91666a(99);
        }
        if (collection == null) {
            m91666a(100);
        }
        if (lVar == null) {
            m91666a(101);
        }
        if (lVar2 == null) {
            m91666a(102);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(h);
        C13908a invoke = lVar.invoke(h);
        Iterator<H> it = collection.iterator();
        while (it.hasNext()) {
            H next = it.next();
            C13908a invoke2 = lVar.invoke(next);
            if (h == next) {
                it.remove();
            } else {
                C14667i.C14668a x = m91688x(invoke, invoke2);
                if (x == C14667i.C14668a.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (x == C14667i.C14668a.CONFLICT) {
                    lVar2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    /* renamed from: q */
    private static Collection<C13936b> m91682q(C13936b bVar, Queue<C13936b> queue, C14657i iVar) {
        if (bVar == null) {
            m91666a(104);
        }
        if (queue == null) {
            m91666a(105);
        }
        if (iVar == null) {
            m91666a(106);
        }
        return m91681p(bVar, queue, new C14664f(), new C14665g(iVar, bVar));
    }

    /* renamed from: r */
    public static <D extends C13908a> Set<D> m91683r(Set<D> set) {
        if (set == null) {
            m91666a(8);
        }
        return m91684s(set, !set.isEmpty() && C16519a.m98624q(C16519a.m98619l((C14064m) set.iterator().next())), (C16254a<?>) null, new C14660b());
    }

    /* renamed from: s */
    public static <D> Set<D> m91684s(Set<D> set, boolean z, C16254a<?> aVar, C16269p<? super D, ? super D, C13328m<C13908a, C13908a>> pVar) {
        if (set == null) {
            m91666a(9);
        }
        if (pVar == null) {
            m91666a(10);
        }
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (D next : set) {
            if (aVar != null) {
                aVar.invoke();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(next);
                    break;
                }
                C13328m invoke = pVar.invoke(next, it.next());
                C13908a aVar2 = (C13908a) invoke.mo70152a();
                C13908a aVar3 = (C13908a) invoke.mo70153b();
                if (m91663J(aVar2, aVar3, z, true)) {
                    it.remove();
                } else if (m91663J(aVar3, aVar2, z, true)) {
                    break;
                }
            }
        }
        return linkedHashSet;
    }

    /* renamed from: t */
    private static Collection<C13936b> m91685t(C13948e eVar, Collection<C13936b> collection) {
        if (eVar == null) {
            m91666a(96);
        }
        if (collection == null) {
            m91666a(97);
        }
        List S = C13566b0.m87418S(collection, new C14663e(eVar));
        if (S == null) {
            m91666a(98);
        }
        return S;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static kotlin.reflect.jvm.internal.impl.descriptors.C14141u m91686u(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.C13936b> r5) {
        /*
            if (r5 != 0) goto L_0x0007
            r0 = 109(0x6d, float:1.53E-43)
            m91666a(r0)
        L_0x0007:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0010
            kotlin.reflect.jvm.internal.impl.descriptors.u r5 = kotlin.reflect.jvm.internal.impl.descriptors.C14127t.f62761l
            return r5
        L_0x0010:
            java.util.Iterator r0 = r5.iterator()
            r1 = 0
        L_0x0015:
            r2 = r1
        L_0x0016:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0038
            java.lang.Object r3 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.b r3 = (kotlin.reflect.jvm.internal.impl.descriptors.C13936b) r3
            kotlin.reflect.jvm.internal.impl.descriptors.u r3 = r3.getVisibility()
            if (r2 != 0) goto L_0x002a
        L_0x0028:
            r2 = r3
            goto L_0x0016
        L_0x002a:
            java.lang.Integer r4 = kotlin.reflect.jvm.internal.impl.descriptors.C14127t.m89522d(r3, r2)
            if (r4 != 0) goto L_0x0031
            goto L_0x0015
        L_0x0031:
            int r4 = r4.intValue()
            if (r4 <= 0) goto L_0x0016
            goto L_0x0028
        L_0x0038:
            if (r2 != 0) goto L_0x003b
            return r1
        L_0x003b:
            java.util.Iterator r5 = r5.iterator()
        L_0x003f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x005c
            java.lang.Object r0 = r5.next()
            kotlin.reflect.jvm.internal.impl.descriptors.b r0 = (kotlin.reflect.jvm.internal.impl.descriptors.C13936b) r0
            kotlin.reflect.jvm.internal.impl.descriptors.u r0 = r0.getVisibility()
            java.lang.Integer r0 = kotlin.reflect.jvm.internal.impl.descriptors.C14127t.m89522d(r2, r0)
            if (r0 == 0) goto L_0x005b
            int r0 = r0.intValue()
            if (r0 >= 0) goto L_0x003f
        L_0x005b:
            return r1
        L_0x005c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.C14658j.m91686u(java.util.Collection):kotlin.reflect.jvm.internal.impl.descriptors.u");
    }

    /* renamed from: w */
    public static C14667i m91687w(C13908a aVar, C13908a aVar2) {
        boolean z;
        if (aVar == null) {
            m91666a(40);
        }
        if (aVar2 == null) {
            m91666a(41);
        }
        boolean z2 = aVar instanceof C14154y;
        if ((z2 && !(aVar2 instanceof C14154y)) || (((z = aVar instanceof C14140t0)) && !(aVar2 instanceof C14140t0))) {
            return C14667i.m91705d("Member kind mismatch");
        }
        if (!z2 && !z) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + aVar);
        } else if (!aVar.getName().equals(aVar2.getName())) {
            return C14667i.m91705d("Name mismatch");
        } else {
            C14667i e = m91670e(aVar, aVar2);
            if (e != null) {
                return e;
            }
            return null;
        }
    }

    /* renamed from: x */
    public static C14667i.C14668a m91688x(C13908a aVar, C13908a aVar2) {
        C14658j jVar = f63654f;
        C14667i.C14668a c = jVar.mo73768D(aVar2, aVar, (C13948e) null).mo73778c();
        C14667i.C14668a c2 = jVar.mo73768D(aVar, aVar2, (C13948e) null).mo73778c();
        C14667i.C14668a aVar3 = C14667i.C14668a.OVERRIDABLE;
        if (c == aVar3 && c2 == aVar3) {
            return aVar3;
        }
        C14667i.C14668a aVar4 = C14667i.C14668a.CONFLICT;
        return (c == aVar4 || c2 == aVar4) ? aVar4 : C14667i.C14668a.INCOMPATIBLE;
    }

    /* renamed from: y */
    private static C13945d0 m91689y(Collection<C13936b> collection, boolean z, C13945d0 d0Var) {
        if (collection == null) {
            m91666a(93);
        }
        if (d0Var == null) {
            m91666a(94);
        }
        C13945d0 d0Var2 = C13945d0.ABSTRACT;
        for (C13936b next : collection) {
            C13945d0 r = (!z || next.mo62179r() != C13945d0.ABSTRACT) ? next.mo62179r() : d0Var;
            if (r.compareTo(d0Var2) < 0) {
                d0Var2 = r;
            }
        }
        if (d0Var2 == null) {
            m91666a(95);
        }
        return d0Var2;
    }

    /* renamed from: z */
    public static Set<C13936b> m91690z(C13936b bVar) {
        if (bVar == null) {
            m91666a(15);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m91671f(bVar, linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: D */
    public C14667i mo73768D(C13908a aVar, C13908a aVar2, C13948e eVar) {
        if (aVar == null) {
            m91666a(19);
        }
        if (aVar2 == null) {
            m91666a(20);
        }
        C14667i E = mo73769E(aVar, aVar2, eVar, false);
        if (E == null) {
            m91666a(21);
        }
        return E;
    }

    /* renamed from: E */
    public C14667i mo73769E(C13908a aVar, C13908a aVar2, C13948e eVar, boolean z) {
        if (aVar == null) {
            m91666a(22);
        }
        if (aVar2 == null) {
            m91666a(23);
        }
        C14667i F = mo73770F(aVar, aVar2, z);
        boolean z2 = F.mo73778c() == C14667i.C14668a.OVERRIDABLE;
        for (C14651e next : f63653e) {
            if (next.mo72758a() != C14651e.C14652a.CONFLICTS_ONLY && (!z2 || next.mo72758a() != C14651e.C14652a.SUCCESS_ONLY)) {
                int i = C14666h.f63664a[next.mo72759b(aVar, aVar2, eVar).ordinal()];
                if (i == 1) {
                    z2 = true;
                } else if (i == 2) {
                    C14667i b = C14667i.m91704b("External condition failed");
                    if (b == null) {
                        m91666a(24);
                    }
                    return b;
                } else if (i == 3) {
                    C14667i d = C14667i.m91705d("External condition");
                    if (d == null) {
                        m91666a(25);
                    }
                    return d;
                }
            }
        }
        if (!z2) {
            return F;
        }
        for (C14651e next2 : f63653e) {
            if (next2.mo72758a() == C14651e.C14652a.CONFLICTS_ONLY) {
                int i2 = C14666h.f63664a[next2.mo72759b(aVar, aVar2, eVar).ordinal()];
                if (i2 == 1) {
                    throw new IllegalStateException("Contract violation in " + next2.getClass().getName() + " condition. It's not supposed to end with success");
                } else if (i2 == 2) {
                    C14667i b2 = C14667i.m91704b("External condition failed");
                    if (b2 == null) {
                        m91666a(27);
                    }
                    return b2;
                } else if (i2 == 3) {
                    C14667i d2 = C14667i.m91705d("External condition");
                    if (d2 == null) {
                        m91666a(28);
                    }
                    return d2;
                }
            }
        }
        C14667i e = C14667i.m91706e();
        if (e == null) {
            m91666a(29);
        }
        return e;
    }

    /* renamed from: F */
    public C14667i mo73770F(C13908a aVar, C13908a aVar2, boolean z) {
        if (aVar == null) {
            m91666a(30);
        }
        if (aVar2 == null) {
            m91666a(31);
        }
        C14667i w = m91687w(aVar, aVar2);
        if (w != null) {
            return w;
        }
        List<C14900e0> g = m91672g(aVar);
        List<C14900e0> g2 = m91672g(aVar2);
        List<C13950e1> typeParameters = aVar.getTypeParameters();
        List<C13950e1> typeParameters2 = aVar2.getTypeParameters();
        int i = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i < g.size()) {
                if (!C14844e.f63967a.mo74059b(g.get(i), g2.get(i))) {
                    C14667i d = C14667i.m91705d("Type parameter number mismatch");
                    if (d == null) {
                        m91666a(33);
                    }
                    return d;
                }
                i++;
            }
            C14667i b = C14667i.m91704b("Type parameter number mismatch");
            if (b == null) {
                m91666a(34);
            }
            return b;
        }
        C14889d1 l = m91677l(typeParameters, typeParameters2);
        for (int i2 = 0; i2 < typeParameters.size(); i2++) {
            if (!m91668c(typeParameters.get(i2), typeParameters2.get(i2), l)) {
                C14667i d2 = C14667i.m91705d("Type parameter bounds mismatch");
                if (d2 == null) {
                    m91666a(35);
                }
                return d2;
            }
        }
        for (int i3 = 0; i3 < g.size(); i3++) {
            if (!m91669d(g.get(i3), g2.get(i3), l)) {
                C14667i d3 = C14667i.m91705d("Value parameter type mismatch");
                if (d3 == null) {
                    m91666a(36);
                }
                return d3;
            }
        }
        if (!(aVar instanceof C14154y) || !(aVar2 instanceof C14154y) || ((C14154y) aVar).isSuspend() == ((C14154y) aVar2).isSuspend()) {
            if (z) {
                C14900e0 returnType = aVar.getReturnType();
                C14900e0 returnType2 = aVar2.getReturnType();
                if (!(returnType == null || returnType2 == null)) {
                    if (C14925g0.m92873a(returnType2) && C14925g0.m92873a(returnType)) {
                        i = 1;
                    }
                    if (i == 0 && !C14902f.f64032a.mo74152r(l, returnType2.mo74145Q0(), returnType.mo74145Q0())) {
                        C14667i b2 = C14667i.m91704b("Return type mismatch");
                        if (b2 == null) {
                            m91666a(38);
                        }
                        return b2;
                    }
                }
            }
            C14667i e = C14667i.m91706e();
            if (e == null) {
                m91666a(39);
            }
            return e;
        }
        C14667i b3 = C14667i.m91704b("Incompatible suspendability");
        if (b3 == null) {
            m91666a(37);
        }
        return b3;
    }

    /* renamed from: v */
    public void mo73771v(C16157f fVar, Collection<? extends C13936b> collection, Collection<? extends C13936b> collection2, C13948e eVar, C14657i iVar) {
        if (fVar == null) {
            m91666a(52);
        }
        if (collection == null) {
            m91666a(53);
        }
        if (collection2 == null) {
            m91666a(54);
        }
        if (eVar == null) {
            m91666a(55);
        }
        if (iVar == null) {
            m91666a(56);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        for (C13936b o : collection2) {
            linkedHashSet.removeAll(m91680o(o, collection, eVar, iVar));
        }
        m91676k(eVar, linkedHashSet, iVar);
    }
}

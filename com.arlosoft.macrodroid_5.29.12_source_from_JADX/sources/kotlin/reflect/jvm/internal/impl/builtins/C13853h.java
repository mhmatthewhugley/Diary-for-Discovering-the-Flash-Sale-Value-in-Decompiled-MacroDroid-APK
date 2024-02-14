package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13961h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14050k0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14074p0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14125s;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14142u0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14144v0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14147x;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C14037x;
import kotlin.reflect.jvm.internal.impl.resolve.C14650d;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14692h;
import kotlin.reflect.jvm.internal.impl.types.C14834b1;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14901e1;
import kotlin.reflect.jvm.internal.impl.types.C14906f0;
import kotlin.reflect.jvm.internal.impl.types.C14933i1;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import kotlin.reflect.jvm.internal.impl.types.C14956n1;
import kotlin.reflect.jvm.internal.impl.types.C14970r1;
import p210ab.C11079a;
import p217bb.C11117a;
import p217bb.C11119b;
import p217bb.C11120c;
import p263fb.C12256d;
import p362pb.C16151b;
import p362pb.C16152c;
import p362pb.C16153d;
import p362pb.C16157f;
import p370qa.C16254a;
import p370qa.C16265l;
import p371qb.C16277a;
import p389sb.C16519a;
import p442yb.C17004g;
import p442yb.C17006i;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.h */
/* compiled from: KotlinBuiltIns */
public abstract class C13853h {

    /* renamed from: g */
    public static final C16157f f62069g = C16157f.m97021l("<built-ins module>");
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C14037x f62070a;

    /* renamed from: b */
    private C17006i<C14037x> f62071b;

    /* renamed from: c */
    private final C17006i<C13858e> f62072c;

    /* renamed from: d */
    private final C17006i<Collection<C14074p0>> f62073d;

    /* renamed from: e */
    private final C17004g<C16157f, C13948e> f62074e;

    /* renamed from: f */
    private final C17012n f62075f;

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.h$a */
    /* compiled from: KotlinBuiltIns */
    class C13854a implements C16254a<Collection<C14074p0>> {
        C13854a() {
        }

        /* renamed from: a */
        public Collection<C14074p0> invoke() {
            return Arrays.asList(new C14074p0[]{C13853h.this.mo72143r().mo72295V(C13902k.f62196r), C13853h.this.mo72143r().mo72295V(C13902k.f62198t), C13853h.this.mo72143r().mo72295V(C13902k.f62199u), C13853h.this.mo72143r().mo72295V(C13902k.f62197s)});
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.h$b */
    /* compiled from: KotlinBuiltIns */
    class C13855b implements C16254a<C13858e> {
        C13855b() {
        }

        /* renamed from: a */
        public C13858e invoke() {
            EnumMap enumMap = new EnumMap(C13859i.class);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            for (C13859i iVar : C13859i.values()) {
                C14951m0 b = C13853h.this.m88272q(iVar.mo72159g().mo78583d());
                C14951m0 b2 = C13853h.this.m88272q(iVar.mo72157e().mo78583d());
                enumMap.put(iVar, b2);
                hashMap.put(b, b2);
                hashMap2.put(b2, b);
            }
            return new C13858e(enumMap, hashMap, hashMap2, (C13854a) null);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.h$c */
    /* compiled from: KotlinBuiltIns */
    class C13856c implements C16265l<C16157f, C13948e> {
        C13856c() {
        }

        /* renamed from: a */
        public C13948e invoke(C16157f fVar) {
            C13961h e = C13853h.this.mo72144s().mo72800e(fVar, C12256d.FROM_BUILTINS);
            if (e == null) {
                throw new AssertionError("Built-in class " + C13902k.f62196r.mo78557c(fVar) + " is not found");
            } else if (e instanceof C13948e) {
                return (C13948e) e;
            } else {
                throw new AssertionError("Must be a class descriptor " + fVar + ", but was " + e);
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.h$d */
    /* compiled from: KotlinBuiltIns */
    class C13857d implements C16254a<Void> {

        /* renamed from: a */
        final /* synthetic */ C14037x f62079a;

        C13857d(C14037x xVar) {
            this.f62079a = xVar;
        }

        /* renamed from: a */
        public Void invoke() {
            if (C13853h.this.f62070a == null) {
                C14037x unused = C13853h.this.f62070a = this.f62079a;
                return null;
            }
            throw new AssertionError("Built-ins module is already set: " + C13853h.this.f62070a + " (attempting to reset to " + this.f62079a + ")");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.h$e */
    /* compiled from: KotlinBuiltIns */
    private static class C13858e {

        /* renamed from: a */
        public final Map<C13859i, C14951m0> f62081a;

        /* renamed from: b */
        public final Map<C14900e0, C14951m0> f62082b;

        /* renamed from: c */
        public final Map<C14951m0, C14951m0> f62083c;

        /* synthetic */ C13858e(Map map, Map map2, Map map3, C13854a aVar) {
            this(map, map2, map3);
        }

        /* renamed from: a */
        private static /* synthetic */ void m88328a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private C13858e(Map<C13859i, C14951m0> map, Map<C14900e0, C14951m0> map2, Map<C14951m0, C14951m0> map3) {
            if (map == null) {
                m88328a(0);
            }
            if (map2 == null) {
                m88328a(1);
            }
            if (map3 == null) {
                m88328a(2);
            }
            this.f62081a = map;
            this.f62082b = map2;
            this.f62083c = map3;
        }
    }

    protected C13853h(C17012n nVar) {
        if (nVar == null) {
            m88250a(0);
        }
        this.f62075f = nVar;
        this.f62073d = nVar.mo80221f(new C13854a());
        this.f62072c = nVar.mo80221f(new C13855b());
        this.f62074e = nVar.mo80223h(new C13856c());
    }

    /* renamed from: A */
    private static C14900e0 m88242A(C14900e0 e0Var, C13958g0 g0Var) {
        C16151b g;
        C16151b a;
        C13948e a2;
        if (e0Var == null) {
            m88250a(71);
        }
        if (g0Var == null) {
            m88250a(72);
        }
        C13961h c = e0Var.mo73702N0().mo62183c();
        if (c == null) {
            return null;
        }
        C13907o oVar = C13907o.f62302a;
        if (!oVar.mo72229b(c.getName()) || (g = C16519a.m98614g(c)) == null || (a = oVar.mo72228a(g)) == null || (a2 = C14147x.m89564a(g0Var, a)) == null) {
            return null;
        }
        return a2.mo72274p();
    }

    /* renamed from: A0 */
    public static boolean m88243A0(C14064m mVar) {
        if (mVar == null) {
            m88250a(10);
        }
        while (mVar != null) {
            if (mVar instanceof C14050k0) {
                return ((C14050k0) mVar).mo72551e().mo78565i(C13902k.f62195q);
            }
            mVar = mVar.mo62163b();
        }
        return false;
    }

    /* renamed from: B0 */
    public static boolean m88244B0(C14900e0 e0Var) {
        if (e0Var == null) {
            m88250a(142);
        }
        return m88266l0(e0Var, C13902k.C13903a.f62249f);
    }

    /* renamed from: C0 */
    public static boolean m88245C0(C14900e0 e0Var) {
        if (e0Var == null) {
            m88250a(132);
        }
        return m88279w0(e0Var) || m88282z0(e0Var) || m88280x0(e0Var) || m88281y0(e0Var);
    }

    /* renamed from: N */
    public static C13859i m88246N(C14900e0 e0Var) {
        if (e0Var == null) {
            m88250a(92);
        }
        C13961h c = e0Var.mo73702N0().mo62183c();
        if (c == null) {
            return null;
        }
        return m88247P(c);
    }

    /* renamed from: P */
    public static C13859i m88247P(C14064m mVar) {
        if (mVar == null) {
            m88250a(77);
        }
        if (C13902k.C13903a.f62218H0.contains(mVar.getName())) {
            return C13902k.C13903a.f62222J0.get(C14650d.m91626m(mVar));
        }
        return null;
    }

    /* renamed from: Q */
    private C13948e m88248Q(C13859i iVar) {
        if (iVar == null) {
            m88250a(16);
        }
        return m88270p(iVar.mo72159g().mo78583d());
    }

    /* renamed from: S */
    public static C13859i m88249S(C14064m mVar) {
        if (mVar == null) {
            m88250a(76);
        }
        if (C13902k.C13903a.f62216G0.contains(mVar.getName())) {
            return C13902k.C13903a.f62220I0.get(C14650d.m91626m(mVar));
        }
        return null;
    }

    /* renamed from: a */
    private static /* synthetic */ void m88250a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case 96:
            case 103:
            case 107:
            case 108:
            case 145:
            case 146:
            case 148:
            case 156:
            case 157:
            case 158:
            case 159:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 53:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 147:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 161:
                objArr[0] = "type";
                break;
            case 46:
                objArr[0] = "classSimpleName";
                break;
            case 67:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 160:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKCallable";
                break;
            case 23:
                objArr[1] = "getKProperty";
                break;
            case 24:
                objArr[1] = "getKProperty0";
                break;
            case 25:
                objArr[1] = "getKProperty1";
                break;
            case 26:
                objArr[1] = "getKProperty2";
                break;
            case 27:
                objArr[1] = "getKMutableProperty0";
                break;
            case 28:
                objArr[1] = "getKMutableProperty1";
                break;
            case 29:
                objArr[1] = "getKMutableProperty2";
                break;
            case 30:
                objArr[1] = "getIterator";
                break;
            case 31:
                objArr[1] = "getIterable";
                break;
            case 32:
                objArr[1] = "getMutableIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterator";
                break;
            case 34:
                objArr[1] = "getCollection";
                break;
            case 35:
                objArr[1] = "getMutableCollection";
                break;
            case 36:
                objArr[1] = "getList";
                break;
            case 37:
                objArr[1] = "getMutableList";
                break;
            case 38:
                objArr[1] = "getSet";
                break;
            case 39:
                objArr[1] = "getMutableSet";
                break;
            case 40:
                objArr[1] = "getMap";
                break;
            case 41:
                objArr[1] = "getMutableMap";
                break;
            case 42:
                objArr[1] = "getMapEntry";
                break;
            case 43:
                objArr[1] = "getMutableMapEntry";
                break;
            case 44:
                objArr[1] = "getListIterator";
                break;
            case 45:
                objArr[1] = "getMutableListIterator";
                break;
            case 47:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 48:
                objArr[1] = "getNothingType";
                break;
            case 49:
                objArr[1] = "getNullableNothingType";
                break;
            case 50:
                objArr[1] = "getAnyType";
                break;
            case 51:
                objArr[1] = "getNullableAnyType";
                break;
            case 52:
                objArr[1] = "getDefaultBound";
                break;
            case 54:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 55:
                objArr[1] = "getNumberType";
                break;
            case 56:
                objArr[1] = "getByteType";
                break;
            case 57:
                objArr[1] = "getShortType";
                break;
            case 58:
                objArr[1] = "getIntType";
                break;
            case 59:
                objArr[1] = "getLongType";
                break;
            case 60:
                objArr[1] = "getFloatType";
                break;
            case 61:
                objArr[1] = "getDoubleType";
                break;
            case 62:
                objArr[1] = "getCharType";
                break;
            case 63:
                objArr[1] = "getBooleanType";
                break;
            case 64:
                objArr[1] = "getUnitType";
                break;
            case 65:
                objArr[1] = "getStringType";
                break;
            case 66:
                objArr[1] = "getIterableType";
                break;
            case 68:
            case 69:
            case 70:
                objArr[1] = "getArrayElementType";
                break;
            case 74:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 81:
            case 84:
                objArr[1] = "getArrayType";
                break;
            case 86:
                objArr[1] = "getEnumType";
                break;
            case 87:
                objArr[1] = "getAnnotationType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 46:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 53:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 67:
                objArr[2] = "getArrayElementType";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 144:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 145:
                objArr[2] = "isMemberOfAny";
                break;
            case 146:
            case 147:
                objArr[2] = "isEnum";
                break;
            case 148:
            case 149:
                objArr[2] = "isComparable";
                break;
            case 150:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 151:
                objArr[2] = "isListOrNullableList";
                break;
            case 152:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 153:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 154:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 155:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 156:
                objArr[2] = "isThrowable";
                break;
            case 157:
                objArr[2] = "isKClass";
                break;
            case 158:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 159:
                objArr[2] = "isCloneable";
                break;
            case 160:
                objArr[2] = "isDeprecated";
                break;
            case 161:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: a0 */
    public static boolean m88251a0(C13948e eVar) {
        if (eVar == null) {
            m88250a(108);
        }
        return m88258e(eVar, C13902k.C13903a.f62241b);
    }

    /* renamed from: b0 */
    public static boolean m88253b0(C14900e0 e0Var) {
        if (e0Var == null) {
            m88250a(139);
        }
        return m88261g0(e0Var, C13902k.C13903a.f62241b);
    }

    /* renamed from: c0 */
    public static boolean m88255c0(C14900e0 e0Var) {
        if (e0Var == null) {
            m88250a(88);
        }
        return m88261g0(e0Var, C13902k.C13903a.f62255i);
    }

    /* renamed from: d0 */
    public static boolean m88257d0(C13948e eVar) {
        if (eVar == null) {
            m88250a(89);
        }
        return m88258e(eVar, C13902k.C13903a.f62255i) || m88247P(eVar) != null;
    }

    /* renamed from: e */
    private static boolean m88258e(C13961h hVar, C16153d dVar) {
        if (hVar == null) {
            m88250a(103);
        }
        if (dVar == null) {
            m88250a(104);
        }
        return hVar.getName().equals(dVar.mo78576i()) && dVar.equals(C14650d.m91626m(hVar));
    }

    /* renamed from: e0 */
    public static boolean m88259e0(C14900e0 e0Var) {
        if (e0Var == null) {
            m88250a(90);
        }
        return m88255c0(e0Var) || m88271p0(e0Var);
    }

    /* renamed from: f0 */
    public static boolean m88260f0(C14064m mVar) {
        if (mVar == null) {
            m88250a(9);
        }
        return C14650d.m91631r(mVar, C13846b.class, false) != null;
    }

    /* renamed from: g0 */
    private static boolean m88261g0(C14900e0 e0Var, C16153d dVar) {
        if (e0Var == null) {
            m88250a(97);
        }
        if (dVar == null) {
            m88250a(98);
        }
        return m88278v0(e0Var.mo73702N0(), dVar);
    }

    /* renamed from: h0 */
    private static boolean m88262h0(C14900e0 e0Var, C16153d dVar) {
        if (e0Var == null) {
            m88250a(134);
        }
        if (dVar == null) {
            m88250a(135);
        }
        return m88261g0(e0Var, dVar) && !e0Var.mo73021O0();
    }

    /* renamed from: i0 */
    public static boolean m88263i0(C14900e0 e0Var) {
        if (e0Var == null) {
            m88250a(141);
        }
        return m88269o0(e0Var);
    }

    /* renamed from: j0 */
    public static boolean m88264j0(C14064m mVar) {
        if (mVar == null) {
            m88250a(160);
        }
        if (mVar.mo72233a().getAnnotations().mo72249n1(C13902k.C13903a.f62287y)) {
            return true;
        }
        if (!(mVar instanceof C14140t0)) {
            return false;
        }
        C14140t0 t0Var = (C14140t0) mVar;
        boolean N = t0Var.mo72440N();
        C14142u0 f = t0Var.mo72346f();
        C14144v0 H = t0Var.mo72334H();
        if (f != null && m88264j0(f)) {
            if (!N) {
                return true;
            }
            if (H == null || !m88264j0(H)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: k0 */
    public static boolean m88265k0(C13948e eVar) {
        if (eVar == null) {
            m88250a(157);
        }
        return m88258e(eVar, C13902k.C13903a.f62256i0);
    }

    /* renamed from: l0 */
    private static boolean m88266l0(C14900e0 e0Var, C16153d dVar) {
        if (e0Var == null) {
            m88250a(105);
        }
        if (dVar == null) {
            m88250a(106);
        }
        return !e0Var.mo73021O0() && m88261g0(e0Var, dVar);
    }

    /* renamed from: m0 */
    public static boolean m88267m0(C14900e0 e0Var) {
        if (e0Var == null) {
            m88250a(136);
        }
        return m88268n0(e0Var) && !C14956n1.m92997l(e0Var);
    }

    /* renamed from: n0 */
    public static boolean m88268n0(C14900e0 e0Var) {
        if (e0Var == null) {
            m88250a(138);
        }
        return m88261g0(e0Var, C13902k.C13903a.f62243c);
    }

    /* renamed from: o0 */
    public static boolean m88269o0(C14900e0 e0Var) {
        if (e0Var == null) {
            m88250a(140);
        }
        return m88253b0(e0Var) && e0Var.mo73021O0();
    }

    /* renamed from: p */
    private C13948e m88270p(String str) {
        if (str == null) {
            m88250a(14);
        }
        C13948e invoke = this.f62074e.invoke(C16157f.m97019i(str));
        if (invoke == null) {
            m88250a(15);
        }
        return invoke;
    }

    /* renamed from: p0 */
    public static boolean m88271p0(C14900e0 e0Var) {
        if (e0Var == null) {
            m88250a(91);
        }
        C13961h c = e0Var.mo73702N0().mo62183c();
        return (c == null || m88247P(c) == null) ? false : true;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public C14951m0 m88272q(String str) {
        if (str == null) {
            m88250a(46);
        }
        C14951m0 p = m88270p(str).mo72274p();
        if (p == null) {
            m88250a(47);
        }
        return p;
    }

    /* renamed from: q0 */
    public static boolean m88273q0(C13948e eVar) {
        if (eVar == null) {
            m88250a(96);
        }
        return m88249S(eVar) != null;
    }

    /* renamed from: r0 */
    public static boolean m88274r0(C14900e0 e0Var) {
        if (e0Var == null) {
            m88250a(94);
        }
        return !e0Var.mo73021O0() && m88275s0(e0Var);
    }

    /* renamed from: s0 */
    public static boolean m88275s0(C14900e0 e0Var) {
        if (e0Var == null) {
            m88250a(95);
        }
        C13961h c = e0Var.mo73702N0().mo62183c();
        return (c instanceof C13948e) && m88273q0((C13948e) c);
    }

    /* renamed from: t0 */
    public static boolean m88276t0(C13948e eVar) {
        if (eVar == null) {
            m88250a(107);
        }
        return m88258e(eVar, C13902k.C13903a.f62241b) || m88258e(eVar, C13902k.C13903a.f62243c);
    }

    /* renamed from: u0 */
    public static boolean m88277u0(C14900e0 e0Var) {
        return e0Var != null && m88266l0(e0Var, C13902k.C13903a.f62253h);
    }

    /* renamed from: v0 */
    public static boolean m88278v0(C14901e1 e1Var, C16153d dVar) {
        if (e1Var == null) {
            m88250a(101);
        }
        if (dVar == null) {
            m88250a(102);
        }
        C13961h c = e1Var.mo62183c();
        return (c instanceof C13948e) && m88258e(c, dVar);
    }

    /* renamed from: w0 */
    public static boolean m88279w0(C14900e0 e0Var) {
        if (e0Var == null) {
            m88250a(128);
        }
        return m88262h0(e0Var, C13902k.C13903a.f62208C0.mo78566j());
    }

    /* renamed from: x0 */
    public static boolean m88280x0(C14900e0 e0Var) {
        if (e0Var == null) {
            m88250a(130);
        }
        return m88262h0(e0Var, C13902k.C13903a.f62212E0.mo78566j());
    }

    /* renamed from: y0 */
    public static boolean m88281y0(C14900e0 e0Var) {
        if (e0Var == null) {
            m88250a(131);
        }
        return m88262h0(e0Var, C13902k.C13903a.f62214F0.mo78566j());
    }

    /* renamed from: z0 */
    public static boolean m88282z0(C14900e0 e0Var) {
        if (e0Var == null) {
            m88250a(129);
        }
        return m88262h0(e0Var, C13902k.C13903a.f62210D0.mo78566j());
    }

    /* renamed from: B */
    public C14951m0 mo72111B() {
        C14951m0 R = mo72125R(C13859i.FLOAT);
        if (R == null) {
            m88250a(60);
        }
        return R;
    }

    /* renamed from: C */
    public C13948e mo72112C(int i) {
        return m88270p(C13902k.m88455b(i));
    }

    /* renamed from: D */
    public C14951m0 mo72113D() {
        C14951m0 R = mo72125R(C13859i.INT);
        if (R == null) {
            m88250a(58);
        }
        return R;
    }

    /* renamed from: D0 */
    public void mo72114D0(C14037x xVar) {
        if (xVar == null) {
            m88250a(1);
        }
        this.f62075f.mo80222g(new C13857d(xVar));
    }

    /* renamed from: E */
    public C13948e mo72115E() {
        C13948e o = mo72142o(C13902k.C13903a.f62256i0.mo78579l());
        if (o == null) {
            m88250a(21);
        }
        return o;
    }

    /* renamed from: F */
    public C14951m0 mo72116F() {
        C14951m0 R = mo72125R(C13859i.LONG);
        if (R == null) {
            m88250a(59);
        }
        return R;
    }

    /* renamed from: G */
    public C13948e mo72117G() {
        return m88270p("Nothing");
    }

    /* renamed from: H */
    public C14951m0 mo72118H() {
        C14951m0 p = mo72117G().mo72274p();
        if (p == null) {
            m88250a(48);
        }
        return p;
    }

    /* renamed from: I */
    public C14951m0 mo72119I() {
        C14951m0 U0 = mo72136i().mo73022U0(true);
        if (U0 == null) {
            m88250a(51);
        }
        return U0;
    }

    /* renamed from: J */
    public C14951m0 mo72120J() {
        C14951m0 U0 = mo72118H().mo73022U0(true);
        if (U0 == null) {
            m88250a(49);
        }
        return U0;
    }

    /* renamed from: K */
    public C13948e mo72121K() {
        return m88270p("Number");
    }

    /* renamed from: L */
    public C14951m0 mo72122L() {
        C14951m0 p = mo72121K().mo72274p();
        if (p == null) {
            m88250a(55);
        }
        return p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public C11120c mo72123M() {
        C11120c.C11122b bVar = C11120c.C11122b.f54038a;
        if (bVar == null) {
            m88250a(4);
        }
        return bVar;
    }

    /* renamed from: O */
    public C14951m0 mo72124O(C13859i iVar) {
        if (iVar == null) {
            m88250a(73);
        }
        C14951m0 m0Var = ((C13858e) this.f62072c.invoke()).f62081a.get(iVar);
        if (m0Var == null) {
            m88250a(74);
        }
        return m0Var;
    }

    /* renamed from: R */
    public C14951m0 mo72125R(C13859i iVar) {
        if (iVar == null) {
            m88250a(53);
        }
        C14951m0 p = m88248Q(iVar).mo72274p();
        if (p == null) {
            m88250a(54);
        }
        return p;
    }

    /* renamed from: T */
    public C14951m0 mo72126T() {
        C14951m0 R = mo72125R(C13859i.SHORT);
        if (R == null) {
            m88250a(57);
        }
        return R;
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public C17012n mo72127U() {
        C17012n nVar = this.f62075f;
        if (nVar == null) {
            m88250a(6);
        }
        return nVar;
    }

    /* renamed from: V */
    public C13948e mo72128V() {
        return m88270p("String");
    }

    /* renamed from: W */
    public C14951m0 mo72129W() {
        C14951m0 p = mo72128V().mo72274p();
        if (p == null) {
            m88250a(65);
        }
        return p;
    }

    /* renamed from: X */
    public C13948e mo72130X(int i) {
        C13948e o = mo72142o(C13902k.f62188j.mo78557c(C16157f.m97019i(C13902k.m88457d(i))));
        if (o == null) {
            m88250a(18);
        }
        return o;
    }

    /* renamed from: Y */
    public C13948e mo72131Y() {
        return m88270p("Unit");
    }

    /* renamed from: Z */
    public C14951m0 mo72132Z() {
        C14951m0 p = mo72131Y().mo72274p();
        if (p == null) {
            m88250a(64);
        }
        return p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo72133f(boolean z) {
        C14037x xVar = new C14037x(f62069g, this.f62075f, this, (C16277a) null);
        this.f62070a = xVar;
        xVar.mo72537S0(C13843a.f62061a.mo72106a().mo72105a(this.f62075f, this.f62070a, mo72147v(), mo72123M(), mo72134g(), z));
        C14037x xVar2 = this.f62070a;
        xVar2.mo72542Y0(xVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C11117a mo72134g() {
        C11117a.C11118a aVar = C11117a.C11118a.f54036a;
        if (aVar == null) {
            m88250a(3);
        }
        return aVar;
    }

    /* renamed from: h */
    public C13948e mo72135h() {
        return m88270p("Any");
    }

    /* renamed from: i */
    public C14951m0 mo72136i() {
        C14951m0 p = mo72135h().mo72274p();
        if (p == null) {
            m88250a(50);
        }
        return p;
    }

    /* renamed from: j */
    public C13948e mo72137j() {
        return m88270p("Array");
    }

    /* renamed from: k */
    public C14900e0 mo72138k(C14900e0 e0Var) {
        C14900e0 A;
        if (e0Var == null) {
            m88250a(67);
        }
        if (!m88255c0(e0Var)) {
            C14900e0 n = C14956n1.m92999n(e0Var);
            C14900e0 e0Var2 = ((C13858e) this.f62072c.invoke()).f62083c.get(n);
            if (e0Var2 != null) {
                return e0Var2;
            }
            C13958g0 i = C14650d.m91622i(n);
            if (i != null && (A = m88242A(n, i)) != null) {
                return A;
            }
            throw new IllegalStateException("not array: " + e0Var);
        } else if (e0Var.mo73700L0().size() == 1) {
            C14900e0 type = e0Var.mo73700L0().get(0).getType();
            if (type == null) {
                m88250a(68);
            }
            return type;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: l */
    public C14951m0 mo72139l(C14970r1 r1Var, C14900e0 e0Var) {
        if (r1Var == null) {
            m88250a(82);
        }
        if (e0Var == null) {
            m88250a(83);
        }
        C14951m0 m = mo72140m(r1Var, e0Var, C13921g.f62330v.mo72251b());
        if (m == null) {
            m88250a(84);
        }
        return m;
    }

    /* renamed from: m */
    public C14951m0 mo72140m(C14970r1 r1Var, C14900e0 e0Var, C13921g gVar) {
        if (r1Var == null) {
            m88250a(78);
        }
        if (e0Var == null) {
            m88250a(79);
        }
        if (gVar == null) {
            m88250a(80);
        }
        C14951m0 g = C14906f0.m92819g(C14834b1.m92419b(gVar), mo72137j(), Collections.singletonList(new C14933i1(r1Var, e0Var)));
        if (g == null) {
            m88250a(81);
        }
        return g;
    }

    /* renamed from: n */
    public C14951m0 mo72141n() {
        C14951m0 R = mo72125R(C13859i.BOOLEAN);
        if (R == null) {
            m88250a(63);
        }
        return R;
    }

    /* renamed from: o */
    public C13948e mo72142o(C16152c cVar) {
        if (cVar == null) {
            m88250a(12);
        }
        C13948e c = C14125s.m89516c(mo72143r(), cVar, C12256d.FROM_BUILTINS);
        if (c == null) {
            m88250a(13);
        }
        return c;
    }

    /* renamed from: r */
    public C14037x mo72143r() {
        if (this.f62070a == null) {
            this.f62070a = (C14037x) this.f62071b.invoke();
        }
        C14037x xVar = this.f62070a;
        if (xVar == null) {
            m88250a(7);
        }
        return xVar;
    }

    /* renamed from: s */
    public C14692h mo72144s() {
        C14692h n = mo72143r().mo72295V(C13902k.f62196r).mo72524n();
        if (n == null) {
            m88250a(11);
        }
        return n;
    }

    /* renamed from: t */
    public C14951m0 mo72145t() {
        C14951m0 R = mo72125R(C13859i.BYTE);
        if (R == null) {
            m88250a(56);
        }
        return R;
    }

    /* renamed from: u */
    public C14951m0 mo72146u() {
        C14951m0 R = mo72125R(C13859i.CHAR);
        if (R == null) {
            m88250a(62);
        }
        return R;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Iterable<C11119b> mo72147v() {
        List singletonList = Collections.singletonList(new C11079a(this.f62075f, mo72143r()));
        if (singletonList == null) {
            m88250a(5);
        }
        return singletonList;
    }

    /* renamed from: w */
    public C13948e mo72148w() {
        C13948e o = mo72142o(C13902k.C13903a.f62233U);
        if (o == null) {
            m88250a(34);
        }
        return o;
    }

    /* renamed from: x */
    public C13948e mo72149x() {
        return m88270p("Comparable");
    }

    /* renamed from: y */
    public C14951m0 mo72150y() {
        C14951m0 I = mo72119I();
        if (I == null) {
            m88250a(52);
        }
        return I;
    }

    /* renamed from: z */
    public C14951m0 mo72151z() {
        C14951m0 R = mo72125R(C13859i.DOUBLE);
        if (R == null) {
            m88250a(61);
        }
        return R;
    }
}

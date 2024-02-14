package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.builtins.C13859i;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.h */
/* compiled from: ConstantValueFactory.kt */
public final class C14618h {

    /* renamed from: a */
    public static final C14618h f63618a = new C14618h();

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.h$a */
    /* compiled from: ConstantValueFactory.kt */
    static final class C14619a extends C13708q implements C16265l<C13958g0, C14900e0> {
        final /* synthetic */ C14900e0 $type;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14619a(C14900e0 e0Var) {
            super(1);
            this.$type = e0Var;
        }

        /* renamed from: a */
        public final C14900e0 invoke(C13958g0 g0Var) {
            C13706o.m87929f(g0Var, "it");
            return this.$type;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.h$b */
    /* compiled from: ConstantValueFactory.kt */
    static final class C14620b extends C13708q implements C16265l<C13958g0, C14900e0> {
        final /* synthetic */ C13859i $componentType;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14620b(C13859i iVar) {
            super(1);
            this.$componentType = iVar;
        }

        /* renamed from: a */
        public final C14900e0 invoke(C13958g0 g0Var) {
            C13706o.m87929f(g0Var, "module");
            C14951m0 O = g0Var.mo72296m().mo72124O(this.$componentType);
            C13706o.m87928e(O, "module.builtIns.getPrimi…KotlinType(componentType)");
            return O;
        }
    }

    private C14618h() {
    }

    /* renamed from: a */
    private final C14612b m91536a(List<?> list, C13859i iVar) {
        List<Object> F0 = C13566b0.m87402F0(list);
        ArrayList arrayList = new ArrayList();
        for (Object c : F0) {
            C14617g<?> c2 = mo73731c(c);
            if (c2 != null) {
                arrayList.add(c2);
            }
        }
        return new C14612b(arrayList, new C14620b(iVar));
    }

    /* renamed from: b */
    public final C14612b mo73730b(List<? extends C14617g<?>> list, C14900e0 e0Var) {
        C13706o.m87929f(list, "value");
        C13706o.m87929f(e0Var, "type");
        return new C14612b(list, new C14619a(e0Var));
    }

    /* renamed from: c */
    public final C14617g<?> mo73731c(Object obj) {
        if (obj instanceof Byte) {
            return new C14614d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new C14644u(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new C14627m(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new C14641r(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new C14615e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new C14626l(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new C14621i(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new C14613c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new C14645v((String) obj);
        }
        if (obj instanceof byte[]) {
            return m91536a(C13596m.m87604c0((byte[]) obj), C13859i.BYTE);
        }
        if (obj instanceof short[]) {
            return m91536a(C13596m.m87611j0((short[]) obj), C13859i.SHORT);
        }
        if (obj instanceof int[]) {
            return m91536a(C13596m.m87608g0((int[]) obj), C13859i.INT);
        }
        if (obj instanceof long[]) {
            return m91536a(C13596m.m87609h0((long[]) obj), C13859i.LONG);
        }
        if (obj instanceof char[]) {
            return m91536a(C13596m.m87605d0((char[]) obj), C13859i.CHAR);
        }
        if (obj instanceof float[]) {
            return m91536a(C13596m.m87607f0((float[]) obj), C13859i.FLOAT);
        }
        if (obj instanceof double[]) {
            return m91536a(C13596m.m87606e0((double[]) obj), C13859i.DOUBLE);
        }
        if (obj instanceof boolean[]) {
            return m91536a(C13596m.m87612k0((boolean[]) obj), C13859i.BOOLEAN);
        }
        if (obj == null) {
            return new C14642s();
        }
        return null;
    }
}

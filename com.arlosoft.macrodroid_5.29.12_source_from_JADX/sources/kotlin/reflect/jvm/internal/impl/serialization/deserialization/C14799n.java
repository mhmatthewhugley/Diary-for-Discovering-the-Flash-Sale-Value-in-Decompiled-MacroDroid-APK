package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14612b;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14617g;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.n */
/* compiled from: DeserializedArrayValue.kt */
public final class C14799n extends C14612b {

    /* renamed from: c */
    private final C14900e0 f63923c;

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.n$a */
    /* compiled from: DeserializedArrayValue.kt */
    static final class C14800a extends C13708q implements C16265l<C13958g0, C14900e0> {
        final /* synthetic */ C14900e0 $type;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14800a(C14900e0 e0Var) {
            super(1);
            this.$type = e0Var;
        }

        /* renamed from: a */
        public final C14900e0 invoke(C13958g0 g0Var) {
            C13706o.m87929f(g0Var, "it");
            return this.$type;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14799n(List<? extends C14617g<?>> list, C14900e0 e0Var) {
        super(list, new C14800a(e0Var));
        C13706o.m87929f(list, "value");
        C13706o.m87929f(e0Var, "type");
        this.f63923c = e0Var;
    }

    /* renamed from: c */
    public final C14900e0 mo73997c() {
        return this.f63923c;
    }
}

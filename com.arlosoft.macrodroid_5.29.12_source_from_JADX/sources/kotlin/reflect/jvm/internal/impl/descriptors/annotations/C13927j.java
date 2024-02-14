package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14617g;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import kotlin.reflect.jvm.internal.impl.types.C14951m0;
import p297ja.C13321g;
import p297ja.C13326k;
import p362pb.C16152c;
import p362pb.C16157f;
import p370qa.C16254a;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.j */
/* compiled from: BuiltInAnnotationDescriptor.kt */
public final class C13927j implements C13915c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C13853h f62334a;

    /* renamed from: b */
    private final C16152c f62335b;

    /* renamed from: c */
    private final Map<C16157f, C14617g<?>> f62336c;

    /* renamed from: d */
    private final C13321g f62337d = C13323i.m85668a(C13326k.PUBLICATION, new C13928a(this));

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.j$a */
    /* compiled from: BuiltInAnnotationDescriptor.kt */
    static final class C13928a extends C13708q implements C16254a<C14951m0> {
        final /* synthetic */ C13927j this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13928a(C13927j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* renamed from: a */
        public final C14951m0 invoke() {
            return this.this$0.f62334a.mo72142o(this.this$0.mo72241e()).mo72274p();
        }
    }

    public C13927j(C13853h hVar, C16152c cVar, Map<C16157f, ? extends C14617g<?>> map) {
        C13706o.m87929f(hVar, "builtIns");
        C13706o.m87929f(cVar, "fqName");
        C13706o.m87929f(map, "allValueArguments");
        this.f62334a = hVar;
        this.f62335b = cVar;
        this.f62336c = map;
    }

    /* renamed from: a */
    public Map<C16157f, C14617g<?>> mo72240a() {
        return this.f62336c;
    }

    /* renamed from: e */
    public C16152c mo72241e() {
        return this.f62335b;
    }

    public C14158z0 getSource() {
        C14158z0 z0Var = C14158z0.f62778a;
        C13706o.m87928e(z0Var, "NO_SOURCE");
        return z0Var;
    }

    public C14900e0 getType() {
        Object value = this.f62337d.getValue();
        C13706o.m87928e(value, "<get-type>(...)");
        return (C14900e0) value;
    }
}

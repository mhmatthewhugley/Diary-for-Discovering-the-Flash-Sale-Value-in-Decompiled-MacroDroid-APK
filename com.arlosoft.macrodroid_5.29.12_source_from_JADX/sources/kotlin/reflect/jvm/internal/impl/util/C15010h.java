package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.util.C15006g;
import kotlin.text.C15159j;
import p362pb.C16157f;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.util.h */
/* compiled from: modifierChecks.kt */
public final class C15010h {

    /* renamed from: a */
    private final C16157f f64134a;

    /* renamed from: b */
    private final C15159j f64135b;

    /* renamed from: c */
    private final Collection<C16157f> f64136c;

    /* renamed from: d */
    private final C16265l<C14154y, String> f64137d;

    /* renamed from: e */
    private final C15004f[] f64138e;

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.h$a */
    /* compiled from: modifierChecks.kt */
    static final class C15011a extends C13708q implements C16265l {

        /* renamed from: a */
        public static final C15011a f64139a = new C15011a();

        C15011a() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(C14154y yVar) {
            C13706o.m87929f(yVar, "$this$null");
            return null;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.h$b */
    /* compiled from: modifierChecks.kt */
    static final class C15012b extends C13708q implements C16265l {

        /* renamed from: a */
        public static final C15012b f64140a = new C15012b();

        C15012b() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(C14154y yVar) {
            C13706o.m87929f(yVar, "$this$null");
            return null;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.util.h$c */
    /* compiled from: modifierChecks.kt */
    static final class C15013c extends C13708q implements C16265l {

        /* renamed from: a */
        public static final C15013c f64141a = new C15013c();

        C15013c() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(C14154y yVar) {
            C13706o.m87929f(yVar, "$this$null");
            return null;
        }
    }

    private C15010h(C16157f fVar, C15159j jVar, Collection<C16157f> collection, C16265l<? super C14154y, String> lVar, C15004f... fVarArr) {
        this.f64134a = fVar;
        this.f64135b = jVar;
        this.f64136c = collection;
        this.f64137d = lVar;
        this.f64138e = fVarArr;
    }

    /* renamed from: a */
    public final C15006g mo74269a(C14154y yVar) {
        C13706o.m87929f(yVar, "functionDescriptor");
        for (C15004f a : this.f64138e) {
            String a2 = a.mo74265a(yVar);
            if (a2 != null) {
                return new C15006g.C15008b(a2);
            }
        }
        String invoke = this.f64137d.invoke(yVar);
        if (invoke != null) {
            return new C15006g.C15008b(invoke);
        }
        return C15006g.C15009c.f64133b;
    }

    /* renamed from: b */
    public final boolean mo74270b(C14154y yVar) {
        C13706o.m87929f(yVar, "functionDescriptor");
        if (this.f64134a != null && !C13706o.m87924a(yVar.getName(), this.f64134a)) {
            return false;
        }
        if (this.f64135b != null) {
            String d = yVar.getName().mo78583d();
            C13706o.m87928e(d, "functionDescriptor.name.asString()");
            if (!this.f64135b.mo74468c(d)) {
                return false;
            }
        }
        Collection<C16157f> collection = this.f64136c;
        if (collection == null || collection.contains(yVar.getName())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15010h(C16157f fVar, C15004f[] fVarArr, C16265l lVar, int i, C13695i iVar) {
        this(fVar, fVarArr, (C16265l<? super C14154y, String>) (i & 4) != 0 ? C15011a.f64139a : lVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C15010h(C16157f fVar, C15004f[] fVarArr, C16265l<? super C14154y, String> lVar) {
        this(fVar, (C15159j) null, (Collection<C16157f>) null, lVar, (C15004f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        C13706o.m87929f(fVar, "name");
        C13706o.m87929f(fVarArr, "checks");
        C13706o.m87929f(lVar, "additionalChecks");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15010h(C15159j jVar, C15004f[] fVarArr, C16265l lVar, int i, C13695i iVar) {
        this(jVar, fVarArr, (C16265l<? super C14154y, String>) (i & 4) != 0 ? C15012b.f64140a : lVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C15010h(C15159j jVar, C15004f[] fVarArr, C16265l<? super C14154y, String> lVar) {
        this((C16157f) null, jVar, (Collection<C16157f>) null, lVar, (C15004f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        C13706o.m87929f(jVar, "regex");
        C13706o.m87929f(fVarArr, "checks");
        C13706o.m87929f(lVar, "additionalChecks");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15010h(Collection collection, C15004f[] fVarArr, C16265l lVar, int i, C13695i iVar) {
        this((Collection<C16157f>) collection, fVarArr, (C16265l<? super C14154y, String>) (i & 4) != 0 ? C15013c.f64141a : lVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C15010h(Collection<C16157f> collection, C15004f[] fVarArr, C16265l<? super C14154y, String> lVar) {
        this((C16157f) null, (C15159j) null, collection, lVar, (C15004f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        C13706o.m87929f(collection, "nameList");
        C13706o.m87929f(fVarArr, "checks");
        C13706o.m87929f(lVar, "additionalChecks");
    }
}

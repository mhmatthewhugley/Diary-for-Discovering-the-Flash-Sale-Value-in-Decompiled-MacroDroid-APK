package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.jvm.internal.C13716y;
import kotlin.reflect.jvm.internal.impl.builtins.C13853h;
import kotlin.reflect.jvm.internal.impl.descriptors.C13958g0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C14037x;
import p217bb.C11117a;
import p217bb.C11119b;
import p217bb.C11120c;
import p370qa.C16254a;
import p370qa.C16265l;
import p433xa.C16887m;
import p442yb.C17006i;
import p442yb.C17011m;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.f */
/* compiled from: JvmBuiltIns.kt */
public final class C13878f extends C13853h {

    /* renamed from: k */
    static final /* synthetic */ C16887m<Object>[] f62142k = {C13687e0.m87873g(new C13716y(C13687e0.m87868b(C13878f.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};

    /* renamed from: h */
    private final C13879a f62143h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C16254a<C13880b> f62144i;

    /* renamed from: j */
    private final C17006i f62145j;

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.f$a */
    /* compiled from: JvmBuiltIns.kt */
    public enum C13879a {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.f$b */
    /* compiled from: JvmBuiltIns.kt */
    public static final class C13880b {

        /* renamed from: a */
        private final C13958g0 f62150a;

        /* renamed from: b */
        private final boolean f62151b;

        public C13880b(C13958g0 g0Var, boolean z) {
            C13706o.m87929f(g0Var, "ownerModuleDescriptor");
            this.f62150a = g0Var;
            this.f62151b = z;
        }

        /* renamed from: a */
        public final C13958g0 mo72197a() {
            return this.f62150a;
        }

        /* renamed from: b */
        public final boolean mo72198b() {
            return this.f62151b;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.f$c */
    /* compiled from: JvmBuiltIns.kt */
    public /* synthetic */ class C13881c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f62152a;

        static {
            int[] iArr = new int[C13879a.values().length];
            iArr[C13879a.FROM_DEPENDENCIES.ordinal()] = 1;
            iArr[C13879a.FROM_CLASS_LOADER.ordinal()] = 2;
            iArr[C13879a.FALLBACK.ordinal()] = 3;
            f62152a = iArr;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.f$d */
    /* compiled from: JvmBuiltIns.kt */
    static final class C13882d extends C13708q implements C16254a<C13885g> {
        final /* synthetic */ C17012n $storageManager;
        final /* synthetic */ C13878f this$0;

        /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.f$d$a */
        /* compiled from: JvmBuiltIns.kt */
        static final class C13883a extends C13708q implements C16254a<C13880b> {
            final /* synthetic */ C13878f this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13883a(C13878f fVar) {
                super(0);
                this.this$0 = fVar;
            }

            /* renamed from: a */
            public final C13880b invoke() {
                C16254a E0 = this.this$0.f62144i;
                if (E0 != null) {
                    C13880b bVar = (C13880b) E0.invoke();
                    this.this$0.f62144i = null;
                    return bVar;
                }
                throw new AssertionError("JvmBuiltins instance has not been initialized properly");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13882d(C13878f fVar, C17012n nVar) {
            super(0);
            this.this$0 = fVar;
            this.$storageManager = nVar;
        }

        /* renamed from: a */
        public final C13885g invoke() {
            C14037x r = this.this$0.mo72143r();
            C13706o.m87928e(r, "builtInsModule");
            return new C13885g(r, this.$storageManager, new C13883a(this.this$0));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.f$e */
    /* compiled from: JvmBuiltIns.kt */
    static final class C13884e extends C13708q implements C16254a<C13880b> {
        final /* synthetic */ boolean $isAdditionalBuiltInsFeatureSupported;
        final /* synthetic */ C13958g0 $moduleDescriptor;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13884e(C13958g0 g0Var, boolean z) {
            super(0);
            this.$moduleDescriptor = g0Var;
            this.$isAdditionalBuiltInsFeatureSupported = z;
        }

        /* renamed from: a */
        public final C13880b invoke() {
            return new C13880b(this.$moduleDescriptor, this.$isAdditionalBuiltInsFeatureSupported);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13878f(C17012n nVar, C13879a aVar) {
        super(nVar);
        C13706o.m87929f(nVar, "storageManager");
        C13706o.m87929f(aVar, "kind");
        this.f62143h = aVar;
        this.f62145j = nVar.mo80221f(new C13882d(this, nVar));
        int i = C13881c.f62152a[aVar.ordinal()];
        if (i == 2) {
            mo72133f(false);
        } else if (i == 3) {
            mo72133f(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G0 */
    public List<C11119b> mo72147v() {
        Iterable<C11119b> v = super.mo72147v();
        C13706o.m87928e(v, "super.getClassDescriptorFactories()");
        C17012n U = mo72127U();
        C13706o.m87928e(U, "storageManager");
        C14037x r = mo72143r();
        C13706o.m87928e(r, "builtInsModule");
        return C13566b0.m87441p0(v, new C13874e(U, r, (C16265l) null, 4, (C13695i) null));
    }

    /* renamed from: H0 */
    public final C13885g mo72194H0() {
        return (C13885g) C17011m.m100276a(this.f62145j, this, f62142k[0]);
    }

    /* renamed from: I0 */
    public final void mo72195I0(C13958g0 g0Var, boolean z) {
        C13706o.m87929f(g0Var, "moduleDescriptor");
        mo72196J0(new C13884e(g0Var, z));
    }

    /* renamed from: J0 */
    public final void mo72196J0(C16254a<C13880b> aVar) {
        C13706o.m87929f(aVar, "computation");
        this.f62144i = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public C11120c mo72123M() {
        return mo72194H0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C11117a mo72134g() {
        return mo72194H0();
    }
}

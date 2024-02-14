package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13975b;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14720d0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14798m;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import p308kb.C13508q;
import p308kb.C13519s;
import p327mb.C15723f;
import p370qa.C16254a;
import p389sb.C16519a;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.m */
/* compiled from: DeserializedTypeParameterDescriptor.kt */
public final class C14778m extends C13975b {
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final C14798m f63872B;

    /* renamed from: C */
    private final C13519s f63873C;

    /* renamed from: D */
    private final C14727a f63874D;

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.m$a */
    /* compiled from: DeserializedTypeParameterDescriptor.kt */
    static final class C14779a extends C13708q implements C16254a<List<? extends C13915c>> {
        final /* synthetic */ C14778m this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14779a(C14778m mVar) {
            super(0);
            this.this$0 = mVar;
        }

        /* renamed from: a */
        public final List<C13915c> invoke() {
            return C13566b0.m87402F0(this.this$0.f63872B.mo73988c().mo73962d().mo73139h(this.this$0.mo73938O0(), this.this$0.f63872B.mo73992g()));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14778m(kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14798m r12, p308kb.C13519s r13, int r14) {
        /*
            r11 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.C13706o.m87929f(r12, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.C13706o.m87929f(r13, r0)
            yb.n r2 = r12.mo73993h()
            kotlin.reflect.jvm.internal.impl.descriptors.m r3 = r12.mo73990e()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g.f62330v
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4 = r0.mo72251b()
            mb.c r0 = r12.mo73992g()
            int r1 = r13.mo71535Q()
            pb.f r5 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14823x.m92359b(r0, r1)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.a0 r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14711a0.f63745a
            kb.s$c r1 = r13.mo71541X()
            java.lang.String r6 = "proto.variance"
            kotlin.jvm.internal.C13706o.m87928e(r1, r6)
            kotlin.reflect.jvm.internal.impl.types.r1 r6 = r0.mo73842d(r1)
            boolean r7 = r13.mo71536R()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r9 = kotlin.reflect.jvm.internal.impl.descriptors.C14158z0.f62778a
            kotlin.reflect.jvm.internal.impl.descriptors.c1$a r10 = kotlin.reflect.jvm.internal.impl.descriptors.C13942c1.C13943a.f62415a
            r1 = r11
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.f63872B = r12
            r11.f63873C = r13
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.a r13 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.a
            yb.n r12 = r12.mo73993h()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.m$a r14 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.m$a
            r14.<init>(r11)
            r13.<init>(r12, r14)
            r11.f63874D = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14778m.<init>(kotlin.reflect.jvm.internal.impl.serialization.deserialization.m, kb.s, int):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: L0 */
    public List<C14900e0> mo72377L0() {
        List<C13508q> p = C15723f.m95043p(this.f63873C, this.f63872B.mo73995j());
        if (p.isEmpty()) {
            return C13612s.m87736e(C16519a.m98613f(this).mo72150y());
        }
        C14720d0 i = this.f63872B.mo73994i();
        ArrayList arrayList = new ArrayList(C13616u.m87774u(p, 10));
        for (C13508q q : p) {
            arrayList.add(i.mo73847q(q));
        }
        return arrayList;
    }

    /* renamed from: N0 */
    public C14727a getAnnotations() {
        return this.f63874D;
    }

    /* renamed from: O0 */
    public final C13519s mo73938O0() {
        return this.f63873C;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public Void mo72376K0(C14900e0 e0Var) {
        C13706o.m87929f(e0Var, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}

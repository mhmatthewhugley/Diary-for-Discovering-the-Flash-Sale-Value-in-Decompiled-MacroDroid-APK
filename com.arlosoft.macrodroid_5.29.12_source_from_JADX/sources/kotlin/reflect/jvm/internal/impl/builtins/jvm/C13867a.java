package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13945d0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C14127t;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14154y;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13994g0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.C14686e;
import p362pb.C16157f;
import p389sb.C16519a;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.a */
/* compiled from: CloneableClassScope.kt */
public final class C13867a extends C14686e {

    /* renamed from: e */
    public static final C13868a f62108e = new C13868a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C16157f f62109f;

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.a$a */
    /* compiled from: CloneableClassScope.kt */
    public static final class C13868a {
        private C13868a() {
        }

        public /* synthetic */ C13868a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C16157f mo72166a() {
            return C13867a.f62109f;
        }
    }

    static {
        C16157f i = C16157f.m97019i("clone");
        C13706o.m87928e(i, "identifier(\"clone\")");
        f62109f = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13867a(C17012n nVar, C13948e eVar) {
        super(nVar, eVar);
        C13706o.m87929f(nVar, "storageManager");
        C13706o.m87929f(eVar, "containingClass");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public List<C14154y> mo62203i() {
        C13994g0 l1 = C13994g0.m88864l1(mo73817l(), C13921g.f62330v.mo72251b(), f62109f, C13936b.C13937a.DECLARATION, C14158z0.f62778a);
        l1.mo72397R0((C14146w0) null, mo73817l().mo72283J0(), C13614t.m87748j(), C13614t.m87748j(), C13614t.m87748j(), C16519a.m98613f(mo73817l()).mo72136i(), C13945d0.OPEN, C14127t.f62752c);
        return C13612s.m87736e(l1);
    }
}

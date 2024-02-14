package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import p308kb.C13455c;
import p327mb.C15714b;
import p327mb.C15719c;
import p327mb.C15724g;
import p362pb.C16151b;
import p362pb.C16152c;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.z */
/* compiled from: ProtoContainer.kt */
public abstract class C14825z {

    /* renamed from: a */
    private final C15719c f63946a;

    /* renamed from: b */
    private final C15724g f63947b;

    /* renamed from: c */
    private final C14158z0 f63948c;

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.z$a */
    /* compiled from: ProtoContainer.kt */
    public static final class C14826a extends C14825z {

        /* renamed from: d */
        private final C13455c f63949d;

        /* renamed from: e */
        private final C14826a f63950e;

        /* renamed from: f */
        private final C16151b f63951f;

        /* renamed from: g */
        private final C13455c.C13458c f63952g;

        /* renamed from: h */
        private final boolean f63953h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14826a(C13455c cVar, C15719c cVar2, C15724g gVar, C14158z0 z0Var, C14826a aVar) {
            super(cVar2, gVar, z0Var, (C13695i) null);
            C13706o.m87929f(cVar, "classProto");
            C13706o.m87929f(cVar2, "nameResolver");
            C13706o.m87929f(gVar, "typeTable");
            this.f63949d = cVar;
            this.f63950e = aVar;
            this.f63951f = C14823x.m92358a(cVar2, cVar.mo71105L0());
            C13455c.C13458c d = C15714b.f65045f.mo75157d(cVar.mo71104K0());
            this.f63952g = d == null ? C13455c.C13458c.CLASS : d;
            Boolean g = C15714b.f65046g.mo75157d(cVar.mo71104K0());
            C13706o.m87928e(g, "IS_INNER.get(classProto.flags)");
            this.f63953h = g.booleanValue();
        }

        /* renamed from: a */
        public C16152c mo74022a() {
            C16152c b = this.f63951f.mo78544b();
            C13706o.m87928e(b, "classId.asSingleFqName()");
            return b;
        }

        /* renamed from: e */
        public final C16151b mo74027e() {
            return this.f63951f;
        }

        /* renamed from: f */
        public final C13455c mo74028f() {
            return this.f63949d;
        }

        /* renamed from: g */
        public final C13455c.C13458c mo74029g() {
            return this.f63952g;
        }

        /* renamed from: h */
        public final C14826a mo74030h() {
            return this.f63950e;
        }

        /* renamed from: i */
        public final boolean mo74031i() {
            return this.f63953h;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.z$b */
    /* compiled from: ProtoContainer.kt */
    public static final class C14827b extends C14825z {

        /* renamed from: d */
        private final C16152c f63954d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14827b(C16152c cVar, C15719c cVar2, C15724g gVar, C14158z0 z0Var) {
            super(cVar2, gVar, z0Var, (C13695i) null);
            C13706o.m87929f(cVar, "fqName");
            C13706o.m87929f(cVar2, "nameResolver");
            C13706o.m87929f(gVar, "typeTable");
            this.f63954d = cVar;
        }

        /* renamed from: a */
        public C16152c mo74022a() {
            return this.f63954d;
        }
    }

    private C14825z(C15719c cVar, C15724g gVar, C14158z0 z0Var) {
        this.f63946a = cVar;
        this.f63947b = gVar;
        this.f63948c = z0Var;
    }

    public /* synthetic */ C14825z(C15719c cVar, C15724g gVar, C14158z0 z0Var, C13695i iVar) {
        this(cVar, gVar, z0Var);
    }

    /* renamed from: a */
    public abstract C16152c mo74022a();

    /* renamed from: b */
    public final C15719c mo74023b() {
        return this.f63946a;
    }

    /* renamed from: c */
    public final C14158z0 mo74024c() {
        return this.f63948c;
    }

    /* renamed from: d */
    public final C15724g mo74025d() {
        return this.f63947b;
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + mo74022a();
    }
}

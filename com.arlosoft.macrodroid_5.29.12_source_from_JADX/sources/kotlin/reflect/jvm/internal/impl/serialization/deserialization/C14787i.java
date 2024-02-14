package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Set;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.builtins.C13902k;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import p362pb.C16151b;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.i */
/* compiled from: ClassDeserializer.kt */
public final class C14787i {

    /* renamed from: c */
    public static final C14789b f63883c = new C14789b((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Set<C16151b> f63884d = C13625y0.m87800c(C16151b.m96975m(C13902k.C13903a.f62245d.mo78579l()));

    /* renamed from: a */
    private final C14794k f63885a;

    /* renamed from: b */
    private final C16265l<C14788a, C13948e> f63886b;

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.i$a */
    /* compiled from: ClassDeserializer.kt */
    private static final class C14788a {

        /* renamed from: a */
        private final C16151b f63887a;

        /* renamed from: b */
        private final C14785g f63888b;

        public C14788a(C16151b bVar, C14785g gVar) {
            C13706o.m87929f(bVar, "classId");
            this.f63887a = bVar;
            this.f63888b = gVar;
        }

        /* renamed from: a */
        public final C14785g mo73951a() {
            return this.f63888b;
        }

        /* renamed from: b */
        public final C16151b mo73952b() {
            return this.f63887a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C14788a) && C13706o.m87924a(this.f63887a, ((C14788a) obj).f63887a);
        }

        public int hashCode() {
            return this.f63887a.hashCode();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.i$b */
    /* compiled from: ClassDeserializer.kt */
    public static final class C14789b {
        private C14789b() {
        }

        public /* synthetic */ C14789b(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final Set<C16151b> mo73955a() {
            return C14787i.f63884d;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.i$c */
    /* compiled from: ClassDeserializer.kt */
    static final class C14790c extends C13708q implements C16265l<C14788a, C13948e> {
        final /* synthetic */ C14787i this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14790c(C14787i iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* renamed from: a */
        public final C13948e invoke(C14788a aVar) {
            C13706o.m87929f(aVar, "key");
            return this.this$0.m92251c(aVar);
        }
    }

    public C14787i(C14794k kVar) {
        C13706o.m87929f(kVar, "components");
        this.f63885a = kVar;
        this.f63886b = kVar.mo73979u().mo80217b(new C14790c(this));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b8 A[EDGE_INSN: B:45:0x00b8->B:37:0x00b8 ?: BREAK  , SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.reflect.jvm.internal.impl.descriptors.C13948e m92251c(kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14787i.C14788a r13) {
        /*
            r12 = this;
            pb.b r0 = r13.mo73952b()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.k r1 = r12.f63885a
            java.lang.Iterable r1 = r1.mo73969k()
            java.util.Iterator r1 = r1.iterator()
        L_0x000e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0021
            java.lang.Object r2 = r1.next()
            bb.b r2 = (p217bb.C11119b) r2
            kotlin.reflect.jvm.internal.impl.descriptors.e r2 = r2.mo62147b(r0)
            if (r2 == 0) goto L_0x000e
            return r2
        L_0x0021:
            java.util.Set<pb.b> r1 = f63884d
            boolean r1 = r1.contains(r0)
            r2 = 0
            if (r1 == 0) goto L_0x002b
            return r2
        L_0x002b:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.g r13 = r13.mo73951a()
            if (r13 != 0) goto L_0x003e
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.k r13 = r12.f63885a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.h r13 = r13.mo73963e()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.g r13 = r13.mo73168a(r0)
            if (r13 != 0) goto L_0x003e
            return r2
        L_0x003e:
            mb.c r1 = r13.mo73943a()
            kb.c r10 = r13.mo73944b()
            mb.a r11 = r13.mo73945c()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r13 = r13.mo73946d()
            pb.b r3 = r0.mo78548g()
            java.lang.String r4 = "classId.shortClassName"
            if (r3 == 0) goto L_0x0079
            r5 = 2
            kotlin.reflect.jvm.internal.impl.descriptors.e r3 = m92252e(r12, r3, r2, r5, r2)
            boolean r5 = r3 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14730d
            if (r5 == 0) goto L_0x0062
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d r3 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14730d) r3
            goto L_0x0063
        L_0x0062:
            r3 = r2
        L_0x0063:
            if (r3 != 0) goto L_0x0066
            return r2
        L_0x0066:
            pb.f r0 = r0.mo78552j()
            kotlin.jvm.internal.C13706o.m87928e(r0, r4)
            boolean r0 = r3.mo73868g1(r0)
            if (r0 != 0) goto L_0x0074
            return r2
        L_0x0074:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = r3.mo73863a1()
            goto L_0x00e4
        L_0x0079:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.k r3 = r12.f63885a
            kotlin.reflect.jvm.internal.impl.descriptors.l0 r3 = r3.mo73976r()
            pb.c r5 = r0.mo78549h()
            java.lang.String r6 = "classId.packageFqName"
            kotlin.jvm.internal.C13706o.m87928e(r5, r6)
            java.util.List r3 = kotlin.reflect.jvm.internal.impl.descriptors.C14070n0.m89333c(r3, r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x0090:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00b7
            java.lang.Object r5 = r3.next()
            r6 = r5
            kotlin.reflect.jvm.internal.impl.descriptors.k0 r6 = (kotlin.reflect.jvm.internal.impl.descriptors.C14050k0) r6
            boolean r7 = r6 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14802p
            if (r7 == 0) goto L_0x00b3
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.p r6 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14802p) r6
            pb.f r7 = r0.mo78552j()
            kotlin.jvm.internal.C13706o.m87928e(r7, r4)
            boolean r6 = r6.mo74000K0(r7)
            if (r6 == 0) goto L_0x00b1
            goto L_0x00b3
        L_0x00b1:
            r6 = 0
            goto L_0x00b4
        L_0x00b3:
            r6 = 1
        L_0x00b4:
            if (r6 == 0) goto L_0x0090
            goto L_0x00b8
        L_0x00b7:
            r5 = r2
        L_0x00b8:
            r4 = r5
            kotlin.reflect.jvm.internal.impl.descriptors.k0 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.C14050k0) r4
            if (r4 != 0) goto L_0x00be
            return r2
        L_0x00be:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.k r3 = r12.f63885a
            mb.g r6 = new mb.g
            kb.t r0 = r10.mo71135o1()
            java.lang.String r2 = "classProto.typeTable"
            kotlin.jvm.internal.C13706o.m87928e(r0, r2)
            r6.<init>(r0)
            mb.h$a r0 = p327mb.C15725h.f65073b
            kb.w r2 = r10.mo71137q1()
            java.lang.String r5 = "classProto.versionRequirementTable"
            kotlin.jvm.internal.C13706o.m87928e(r2, r5)
            mb.h r7 = r0.mo75167a(r2)
            r9 = 0
            r5 = r1
            r8 = r11
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = r3.mo73959a(r4, r5, r6, r7, r8, r9)
        L_0x00e4:
            r4 = r0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d
            r3 = r0
            r5 = r10
            r6 = r1
            r7 = r11
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14787i.m92251c(kotlin.reflect.jvm.internal.impl.serialization.deserialization.i$a):kotlin.reflect.jvm.internal.impl.descriptors.e");
    }

    /* renamed from: e */
    public static /* synthetic */ C13948e m92252e(C14787i iVar, C16151b bVar, C14785g gVar, int i, Object obj) {
        if ((i & 2) != 0) {
            gVar = null;
        }
        return iVar.mo73950d(bVar, gVar);
    }

    /* renamed from: d */
    public final C13948e mo73950d(C16151b bVar, C14785g gVar) {
        C13706o.m87929f(bVar, "classId");
        return this.f63886b.invoke(new C14788a(bVar, gVar));
    }
}

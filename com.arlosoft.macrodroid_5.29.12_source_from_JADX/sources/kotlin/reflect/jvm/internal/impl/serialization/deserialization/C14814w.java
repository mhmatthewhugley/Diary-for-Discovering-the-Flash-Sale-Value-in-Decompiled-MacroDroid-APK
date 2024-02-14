package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.descriptors.C13908a;
import kotlin.reflect.jvm.internal.impl.descriptors.C13936b;
import kotlin.reflect.jvm.internal.impl.descriptors.C13944d;
import kotlin.reflect.jvm.internal.impl.descriptors.C13945d0;
import kotlin.reflect.jvm.internal.impl.descriptors.C13947d1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C13950e1;
import kotlin.reflect.jvm.internal.impl.descriptors.C13951f;
import kotlin.reflect.jvm.internal.impl.descriptors.C13966i1;
import kotlin.reflect.jvm.internal.impl.descriptors.C14050k0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14052l;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14141u;
import kotlin.reflect.jvm.internal.impl.descriptors.C14142u0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14144v0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14146w0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14156y0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14158z0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13915c;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13984d0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C13990e0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C14019o;
import kotlin.reflect.jvm.internal.impl.protobuf.C14516o;
import kotlin.reflect.jvm.internal.impl.resolve.C14602c;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C14617g;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14825z;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14727a;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14729c;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14730d;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14775j;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14776k;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14777l;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14780n;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import p297ja.C13328m;
import p308kb.C13444b;
import p308kb.C13460d;
import p308kb.C13481i;
import p308kb.C13486k;
import p308kb.C13494n;
import p308kb.C13508q;
import p308kb.C13516r;
import p308kb.C13519s;
import p308kb.C13527u;
import p308kb.C13540x;
import p327mb.C15712a;
import p327mb.C15714b;
import p327mb.C15719c;
import p327mb.C15723f;
import p327mb.C15724g;
import p327mb.C15725h;
import p362pb.C16157f;
import p370qa.C16254a;
import p389sb.C16519a;
import p442yb.C17007j;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.w */
/* compiled from: MemberDeserializer.kt */
public final class C14814w {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C14798m f63939a;

    /* renamed from: b */
    private final C14781e f63940b;

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.w$a */
    /* compiled from: MemberDeserializer.kt */
    static final class C14815a extends C13708q implements C16254a<List<? extends C13915c>> {
        final /* synthetic */ C14713b $kind;
        final /* synthetic */ C14516o $proto;
        final /* synthetic */ C14814w this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14815a(C14814w wVar, C14516o oVar, C14713b bVar) {
            super(0);
            this.this$0 = wVar;
            this.$proto = oVar;
            this.$kind = bVar;
        }

        /* renamed from: a */
        public final List<C13915c> invoke() {
            List<C13915c> list;
            C14814w wVar = this.this$0;
            C14825z a = wVar.m92337c(wVar.f63939a.mo73990e());
            if (a != null) {
                list = C13566b0.m87402F0(this.this$0.f63939a.mo73988c().mo73962d().mo73138g(a, this.$proto, this.$kind));
            } else {
                list = null;
            }
            return list == null ? C13614t.m87748j() : list;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.w$b */
    /* compiled from: MemberDeserializer.kt */
    static final class C14816b extends C13708q implements C16254a<List<? extends C13915c>> {
        final /* synthetic */ boolean $isDelegate;
        final /* synthetic */ C13494n $proto;
        final /* synthetic */ C14814w this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14816b(C14814w wVar, boolean z, C13494n nVar) {
            super(0);
            this.this$0 = wVar;
            this.$isDelegate = z;
            this.$proto = nVar;
        }

        /* renamed from: a */
        public final List<C13915c> invoke() {
            List<C13915c> list;
            C14814w wVar = this.this$0;
            C14825z a = wVar.m92337c(wVar.f63939a.mo73990e());
            if (a != null) {
                boolean z = this.$isDelegate;
                C14814w wVar2 = this.this$0;
                C13494n nVar = this.$proto;
                list = z ? C13566b0.m87402F0(wVar2.f63939a.mo73988c().mo73962d().mo73134a(a, nVar)) : C13566b0.m87402F0(wVar2.f63939a.mo73988c().mo73962d().mo73142k(a, nVar));
            } else {
                list = null;
            }
            return list == null ? C13614t.m87748j() : list;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.w$c */
    /* compiled from: MemberDeserializer.kt */
    static final class C14817c extends C13708q implements C16254a<List<? extends C13915c>> {
        final /* synthetic */ C14713b $kind;
        final /* synthetic */ C14516o $proto;
        final /* synthetic */ C14814w this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14817c(C14814w wVar, C14516o oVar, C14713b bVar) {
            super(0);
            this.this$0 = wVar;
            this.$proto = oVar;
            this.$kind = bVar;
        }

        /* renamed from: a */
        public final List<C13915c> invoke() {
            List<C13915c> list;
            C14814w wVar = this.this$0;
            C14825z a = wVar.m92337c(wVar.f63939a.mo73990e());
            if (a != null) {
                list = this.this$0.f63939a.mo73988c().mo73962d().mo73140i(a, this.$proto, this.$kind);
            } else {
                list = null;
            }
            return list == null ? C13614t.m87748j() : list;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.w$d */
    /* compiled from: MemberDeserializer.kt */
    static final class C14818d extends C13708q implements C16254a<C17007j<? extends C14617g<?>>> {
        final /* synthetic */ C14775j $property;
        final /* synthetic */ C13494n $proto;
        final /* synthetic */ C14814w this$0;

        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.w$d$a */
        /* compiled from: MemberDeserializer.kt */
        static final class C14819a extends C13708q implements C16254a<C14617g<?>> {
            final /* synthetic */ C14775j $property;
            final /* synthetic */ C13494n $proto;
            final /* synthetic */ C14814w this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14819a(C14814w wVar, C13494n nVar, C14775j jVar) {
                super(0);
                this.this$0 = wVar;
                this.$proto = nVar;
                this.$property = jVar;
            }

            /* renamed from: a */
            public final C14617g<?> invoke() {
                C14814w wVar = this.this$0;
                C14825z a = wVar.m92337c(wVar.f63939a.mo73990e());
                C13706o.m87926c(a);
                C14716c<C13915c, C14617g<?>> d = this.this$0.f63939a.mo73988c().mo73962d();
                C13494n nVar = this.$proto;
                C14900e0 returnType = this.$property.getReturnType();
                C13706o.m87928e(returnType, "property.returnType");
                return d.mo73114e(a, nVar, returnType);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14818d(C14814w wVar, C13494n nVar, C14775j jVar) {
            super(0);
            this.this$0 = wVar;
            this.$proto = nVar;
            this.$property = jVar;
        }

        /* renamed from: a */
        public final C17007j<C14617g<?>> invoke() {
            return this.this$0.f63939a.mo73993h().mo80219d(new C14819a(this.this$0, this.$proto, this.$property));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.w$e */
    /* compiled from: MemberDeserializer.kt */
    static final class C14820e extends C13708q implements C16254a<C17007j<? extends C14617g<?>>> {
        final /* synthetic */ C14775j $property;
        final /* synthetic */ C13494n $proto;
        final /* synthetic */ C14814w this$0;

        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.w$e$a */
        /* compiled from: MemberDeserializer.kt */
        static final class C14821a extends C13708q implements C16254a<C14617g<?>> {
            final /* synthetic */ C14775j $property;
            final /* synthetic */ C13494n $proto;
            final /* synthetic */ C14814w this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C14821a(C14814w wVar, C13494n nVar, C14775j jVar) {
                super(0);
                this.this$0 = wVar;
                this.$proto = nVar;
                this.$property = jVar;
            }

            /* renamed from: a */
            public final C14617g<?> invoke() {
                C14814w wVar = this.this$0;
                C14825z a = wVar.m92337c(wVar.f63939a.mo73990e());
                C13706o.m87926c(a);
                C14716c<C13915c, C14617g<?>> d = this.this$0.f63939a.mo73988c().mo73962d();
                C13494n nVar = this.$proto;
                C14900e0 returnType = this.$property.getReturnType();
                C13706o.m87928e(returnType, "property.returnType");
                return d.mo73113b(a, nVar, returnType);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14820e(C14814w wVar, C13494n nVar, C14775j jVar) {
            super(0);
            this.this$0 = wVar;
            this.$proto = nVar;
            this.$property = jVar;
        }

        /* renamed from: a */
        public final C17007j<C14617g<?>> invoke() {
            return this.this$0.f63939a.mo73993h().mo80219d(new C14821a(this.this$0, this.$proto, this.$property));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.w$f */
    /* compiled from: MemberDeserializer.kt */
    static final class C14822f extends C13708q implements C16254a<List<? extends C13915c>> {
        final /* synthetic */ C14516o $callable;
        final /* synthetic */ C14825z $containerOfCallable;

        /* renamed from: $i */
        final /* synthetic */ int f63941$i;
        final /* synthetic */ C14713b $kind;
        final /* synthetic */ C13527u $proto;
        final /* synthetic */ C14814w this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14822f(C14814w wVar, C14825z zVar, C14516o oVar, C14713b bVar, int i, C13527u uVar) {
            super(0);
            this.this$0 = wVar;
            this.$containerOfCallable = zVar;
            this.$callable = oVar;
            this.$kind = bVar;
            this.f63941$i = i;
            this.$proto = uVar;
        }

        /* renamed from: a */
        public final List<C13915c> invoke() {
            return C13566b0.m87402F0(this.this$0.f63939a.mo73988c().mo73962d().mo73141j(this.$containerOfCallable, this.$callable, this.$kind, this.f63941$i, this.$proto));
        }
    }

    public C14814w(C14798m mVar) {
        C13706o.m87929f(mVar, "c");
        this.f63939a = mVar;
        this.f63940b = new C14781e(mVar.mo73988c().mo73974p(), mVar.mo73988c().mo73975q());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final C14825z m92337c(C14064m mVar) {
        if (mVar instanceof C14050k0) {
            return new C14825z.C14827b(((C14050k0) mVar).mo72551e(), this.f63939a.mo73992g(), this.f63939a.mo73995j(), this.f63939a.mo73989d());
        }
        if (mVar instanceof C14730d) {
            return ((C14730d) mVar).mo73867f1();
        }
        return null;
    }

    /* renamed from: d */
    private final C13921g m92338d(C14516o oVar, int i, C14713b bVar) {
        if (!C15714b.f65042c.mo75157d(i).booleanValue()) {
            return C13921g.f62330v.mo72251b();
        }
        return new C14780n(this.f63939a.mo73993h(), new C14815a(this, oVar, bVar));
    }

    /* renamed from: e */
    private final C14146w0 m92339e() {
        C14064m e = this.f63939a.mo73990e();
        C13948e eVar = e instanceof C13948e ? (C13948e) e : null;
        if (eVar != null) {
            return eVar.mo72283J0();
        }
        return null;
    }

    /* renamed from: f */
    private final C13921g m92340f(C13494n nVar, boolean z) {
        if (!C15714b.f65042c.mo75157d(nVar.mo71357e0()).booleanValue()) {
            return C13921g.f62330v.mo72251b();
        }
        return new C14780n(this.f63939a.mo73993h(), new C14816b(this, z, nVar));
    }

    /* renamed from: g */
    private final C13921g m92341g(C14516o oVar, C14713b bVar) {
        return new C14727a(this.f63939a.mo73993h(), new C14817c(this, oVar, bVar));
    }

    /* renamed from: h */
    private final void m92342h(C14776k kVar, C14146w0 w0Var, C14146w0 w0Var2, List<? extends C14146w0> list, List<? extends C13950e1> list2, List<? extends C13966i1> list3, C14900e0 e0Var, C13945d0 d0Var, C14141u uVar, Map<? extends C13908a.C13909a<?>, ?> map) {
        kVar.mo68658o1(w0Var, w0Var2, list, list2, list3, e0Var, d0Var, uVar, map);
    }

    /* renamed from: k */
    private final int m92343k(int i) {
        return (i & 63) + ((i >> 8) << 6);
    }

    /* renamed from: n */
    private final C14146w0 m92344n(C13508q qVar, C14798m mVar, C13908a aVar) {
        return C14602c.m91470b(aVar, mVar.mo73994i().mo73847q(qVar), C13921g.f62330v.mo72251b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00f1  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.C13966i1> m92345o(java.util.List<p308kb.C13527u> r26, kotlin.reflect.jvm.internal.impl.protobuf.C14516o r27, kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14713b r28) {
        /*
            r25 = this;
            r7 = r25
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = r7.f63939a
            kotlin.reflect.jvm.internal.impl.descriptors.m r0 = r0.mo73990e()
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor"
            kotlin.jvm.internal.C13706o.m87927d(r0, r1)
            r20 = r0
            kotlin.reflect.jvm.internal.impl.descriptors.a r20 = (kotlin.reflect.jvm.internal.impl.descriptors.C13908a) r20
            kotlin.reflect.jvm.internal.impl.descriptors.m r0 = r20.mo62163b()
            java.lang.String r1 = "callableDescriptor.containingDeclaration"
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.z r21 = r7.m92337c(r0)
            java.util.ArrayList r15 = new java.util.ArrayList
            r0 = 10
            r1 = r26
            int r0 = kotlin.collections.C13616u.m87774u(r1, r0)
            r15.<init>(r0)
            java.util.Iterator r22 = r26.iterator()
            r23 = 0
            r11 = 0
        L_0x0032:
            boolean r0 = r22.hasNext()
            if (r0 == 0) goto L_0x010f
            java.lang.Object r0 = r22.next()
            int r24 = r11 + 1
            if (r11 >= 0) goto L_0x0043
            kotlin.collections.C13614t.m87758t()
        L_0x0043:
            r8 = r0
            kb.u r8 = (p308kb.C13527u) r8
            boolean r0 = r8.mo71580U()
            if (r0 == 0) goto L_0x0052
            int r0 = r8.mo71574N()
            r9 = r0
            goto L_0x0053
        L_0x0052:
            r9 = 0
        L_0x0053:
            if (r21 == 0) goto L_0x0083
            mb.b$b r0 = p327mb.C15714b.f65042c
            java.lang.Boolean r0 = r0.mo75157d(r9)
            java.lang.String r1 = "HAS_ANNOTATIONS.get(flags)"
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0083
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n r10 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.n
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = r7.f63939a
            yb.n r12 = r0.mo73993h()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.w$f r13 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.w$f
            r0 = r13
            r1 = r25
            r2 = r21
            r3 = r27
            r4 = r28
            r5 = r11
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r10.<init>(r12, r13)
            r12 = r10
            goto L_0x008a
        L_0x0083:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.C13921g.f62330v
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r0.mo72251b()
            r12 = r0
        L_0x008a:
            r10 = 0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = r7.f63939a
            mb.c r0 = r0.mo73992g()
            int r1 = r8.mo71575O()
            pb.f r13 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14823x.m92359b(r0, r1)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = r7.f63939a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.d0 r0 = r0.mo73994i()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r1 = r7.f63939a
            mb.g r1 = r1.mo73995j()
            kb.q r1 = p327mb.C15723f.m95041n(r8, r1)
            kotlin.reflect.jvm.internal.impl.types.e0 r14 = r0.mo73847q(r1)
            mb.b$b r0 = p327mb.C15714b.f65031G
            java.lang.Boolean r0 = r0.mo75157d(r9)
            java.lang.String r1 = "DECLARES_DEFAULT_VALUE.get(flags)"
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            boolean r0 = r0.booleanValue()
            mb.b$b r1 = p327mb.C15714b.f65032H
            java.lang.Boolean r1 = r1.mo75157d(r9)
            java.lang.String r2 = "IS_CROSSINLINE.get(flags)"
            kotlin.jvm.internal.C13706o.m87928e(r1, r2)
            boolean r16 = r1.booleanValue()
            mb.b$b r1 = p327mb.C15714b.f65033I
            java.lang.Boolean r1 = r1.mo75157d(r9)
            java.lang.String r2 = "IS_NOINLINE.get(flags)"
            kotlin.jvm.internal.C13706o.m87928e(r1, r2)
            boolean r17 = r1.booleanValue()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r1 = r7.f63939a
            mb.g r1 = r1.mo73995j()
            kb.q r1 = p327mb.C15723f.m95044q(r8, r1)
            if (r1 == 0) goto L_0x00f1
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r2 = r7.f63939a
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.d0 r2 = r2.mo73994i()
            kotlin.reflect.jvm.internal.impl.types.e0 r1 = r2.mo73847q(r1)
            goto L_0x00f2
        L_0x00f1:
            r1 = 0
        L_0x00f2:
            r18 = r1
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r1 = kotlin.reflect.jvm.internal.impl.descriptors.C14158z0.f62778a
            java.lang.String r2 = "NO_SOURCE"
            kotlin.jvm.internal.C13706o.m87928e(r1, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.l0 r2 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.l0
            r8 = r2
            r9 = r20
            r3 = r15
            r15 = r0
            r19 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r3.add(r2)
            r15 = r3
            r11 = r24
            goto L_0x0032
        L_0x010f:
            r3 = r15
            java.util.List r0 = kotlin.collections.C13566b0.m87402F0(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14814w.m92345o(java.util.List, kotlin.reflect.jvm.internal.impl.protobuf.o, kotlin.reflect.jvm.internal.impl.serialization.deserialization.b):java.util.List");
    }

    /* renamed from: i */
    public final C13944d mo74009i(C13460d dVar, boolean z) {
        C13460d dVar2 = dVar;
        C13706o.m87929f(dVar2, "proto");
        C14064m e = this.f63939a.mo73990e();
        C13706o.m87927d(e, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        C13948e eVar = (C13948e) e;
        int M = dVar.mo71165M();
        C14713b bVar = C14713b.FUNCTION;
        C14729c cVar = r1;
        C14729c cVar2 = new C14729c(eVar, (C14052l) null, m92338d(dVar2, M, bVar), z, C13936b.C13937a.DECLARATION, dVar, this.f63939a.mo73992g(), this.f63939a.mo73995j(), this.f63939a.mo73996k(), this.f63939a.mo73989d(), (C14158z0) null, 1024, (C13695i) null);
        C14814w f = C14798m.m92301b(this.f63939a, cVar, C13614t.m87748j(), (C15719c) null, (C15724g) null, (C15725h) null, (C15712a) null, 60, (Object) null).mo73991f();
        List<C13527u> P = dVar.mo71168P();
        C13706o.m87928e(P, "proto.valueParameterList");
        C14729c cVar3 = cVar;
        cVar3.mo72394q1(f.m92345o(P, dVar2, bVar), C14714b0.m91934a(C14711a0.f63745a, C15714b.f65043d.mo75157d(dVar.mo71165M())));
        cVar3.mo72467g1(eVar.mo72274p());
        cVar3.mo72462W0(eVar.mo62175l0());
        cVar3.mo68651Y0(!C15714b.f65053n.mo75157d(dVar.mo71165M()).booleanValue());
        return cVar3;
    }

    /* renamed from: j */
    public final C14156y0 mo74010j(C13481i iVar) {
        C13921g gVar;
        C15725h hVar;
        C14900e0 q;
        C13481i iVar2 = iVar;
        C13706o.m87929f(iVar2, "proto");
        int g0 = iVar.mo71282z0() ? iVar.mo71266g0() : m92343k(iVar.mo71268k0());
        C14713b bVar = C14713b.FUNCTION;
        C13921g d = m92338d(iVar2, g0, bVar);
        if (C15723f.m95031d(iVar)) {
            gVar = m92341g(iVar2, bVar);
        } else {
            gVar = C13921g.f62330v.mo72251b();
        }
        if (C13706o.m87924a(C16519a.m98615h(this.f63939a.mo73990e()).mo78557c(C14823x.m92359b(this.f63939a.mo73992g(), iVar.mo71267i0())), C14717c0.f63762a)) {
            hVar = C15725h.f65073b.mo75168b();
        } else {
            hVar = this.f63939a.mo73996k();
        }
        C14776k kVar = new C14776k(this.f63939a.mo73990e(), (C14156y0) null, d, C14823x.m92359b(this.f63939a.mo73992g(), iVar.mo71267i0()), C14714b0.m91935b(C14711a0.f63745a, C15714b.f65054o.mo75157d(g0)), iVar, this.f63939a.mo73992g(), this.f63939a.mo73995j(), hVar, this.f63939a.mo73989d(), (C14158z0) null, 1024, (C13695i) null);
        C14798m mVar = this.f63939a;
        List<C13519s> s0 = iVar.mo71275s0();
        C13706o.m87928e(s0, "proto.typeParameterList");
        C14798m b = C14798m.m92301b(mVar, kVar, s0, (C15719c) null, (C15724g) null, (C15725h) null, (C15712a) null, 60, (Object) null);
        C13508q h = C15723f.m95035h(iVar2, this.f63939a.mo73995j());
        C14146w0 h2 = (h == null || (q = b.mo73994i().mo73847q(h)) == null) ? null : C14602c.m91476h(kVar, q, gVar);
        C14146w0 e = m92339e();
        List<C13508q> c0 = iVar.mo71263c0();
        C13706o.m87928e(c0, "proto.contextReceiverTypeList");
        ArrayList arrayList = new ArrayList();
        for (C13508q qVar : c0) {
            C13706o.m87928e(qVar, "it");
            C14146w0 n = m92344n(qVar, b, kVar);
            if (n != null) {
                arrayList.add(n);
            }
        }
        List<C13950e1> j = b.mo73994i().mo73845j();
        C14814w f = b.mo73991f();
        List<C13527u> w0 = iVar.mo71279w0();
        C13706o.m87928e(w0, "proto.valueParameterList");
        List<C13966i1> o = f.m92345o(w0, iVar2, C14713b.FUNCTION);
        C14900e0 q2 = b.mo73994i().mo73847q(C15723f.m95037j(iVar2, this.f63939a.mo73995j()));
        C14711a0 a0Var = C14711a0.f63745a;
        C14776k kVar2 = kVar;
        C14798m mVar2 = b;
        C14776k kVar3 = kVar;
        int i = g0;
        m92342h(kVar2, h2, e, arrayList, j, o, q2, a0Var.mo73840b(C15714b.f65044e.mo75157d(g0)), C14714b0.m91934a(a0Var, C15714b.f65043d.mo75157d(g0)), C13615t0.m87759i());
        Boolean g = C15714b.f65055p.mo75157d(i);
        C13706o.m87928e(g, "IS_OPERATOR.get(flags)");
        kVar3.mo72466f1(g.booleanValue());
        Boolean g2 = C15714b.f65056q.mo75157d(i);
        C13706o.m87928e(g2, "IS_INFIX.get(flags)");
        kVar3.mo72464c1(g2.booleanValue());
        Boolean g3 = C15714b.f65059t.mo75157d(i);
        C13706o.m87928e(g3, "IS_EXTERNAL_FUNCTION.get(flags)");
        kVar3.mo72463X0(g3.booleanValue());
        Boolean g4 = C15714b.f65057r.mo75157d(i);
        C13706o.m87928e(g4, "IS_INLINE.get(flags)");
        kVar3.mo72465e1(g4.booleanValue());
        Boolean g5 = C15714b.f65058s.mo75157d(i);
        C13706o.m87928e(g5, "IS_TAILREC.get(flags)");
        kVar3.mo72469i1(g5.booleanValue());
        Boolean g6 = C15714b.f65060u.mo75157d(i);
        C13706o.m87928e(g6, "IS_SUSPEND.get(flags)");
        kVar3.mo72468h1(g6.booleanValue());
        Boolean g7 = C15714b.f65061v.mo75157d(i);
        C13706o.m87928e(g7, "IS_EXPECT_FUNCTION.get(flags)");
        kVar3.mo72462W0(g7.booleanValue());
        kVar3.mo68651Y0(!C15714b.f65062w.mo75157d(i).booleanValue());
        C13328m<C13908a.C13909a<?>, Object> a = this.f63939a.mo73988c().mo73966h().mo73957a(iVar2, kVar3, this.f63939a.mo73995j(), mVar2.mo73994i());
        if (a != null) {
            kVar3.mo72460U0(a.mo70154c(), a.mo70155d());
        }
        return kVar3;
    }

    /* renamed from: l */
    public final C14140t0 mo74011l(C13494n nVar) {
        C13494n nVar2;
        C13921g gVar;
        C14775j jVar;
        C14146w0 w0Var;
        C15714b.C15718d<C13540x> dVar;
        C14798m mVar;
        C15714b.C15718d<C13486k> dVar2;
        C13984d0 d0Var;
        C13984d0 d0Var2;
        C13990e0 e0Var;
        int i;
        boolean z;
        C13494n nVar3;
        C14775j jVar2;
        C13984d0 d0Var3;
        C14900e0 q;
        C13494n nVar4 = nVar;
        C13706o.m87929f(nVar4, "proto");
        int e0 = nVar.mo71371v0() ? nVar.mo71357e0() : m92343k(nVar.mo71360i0());
        C14064m e = this.f63939a.mo73990e();
        C13921g d = m92338d(nVar4, e0, C14713b.PROPERTY);
        C14711a0 a0Var = C14711a0.f63745a;
        C13945d0 b = a0Var.mo73840b(C15714b.f65044e.mo75157d(e0));
        C14141u a = C14714b0.m91934a(a0Var, C15714b.f65043d.mo75157d(e0));
        Boolean g = C15714b.f65063x.mo75157d(e0);
        C13706o.m87928e(g, "IS_VAR.get(flags)");
        boolean booleanValue = g.booleanValue();
        C16157f b2 = C14823x.m92359b(this.f63939a.mo73992g(), nVar.mo71359g0());
        C13936b.C13937a b3 = C14714b0.m91935b(a0Var, C15714b.f65054o.mo75157d(e0));
        Boolean g2 = C15714b.f65026B.mo75157d(e0);
        C13706o.m87928e(g2, "IS_LATEINIT.get(flags)");
        boolean booleanValue2 = g2.booleanValue();
        Boolean g3 = C15714b.f65025A.mo75157d(e0);
        C13706o.m87928e(g3, "IS_CONST.get(flags)");
        boolean booleanValue3 = g3.booleanValue();
        Boolean g4 = C15714b.f65028D.mo75157d(e0);
        C13706o.m87928e(g4, "IS_EXTERNAL_PROPERTY.get(flags)");
        boolean booleanValue4 = g4.booleanValue();
        Boolean g5 = C15714b.f65029E.mo75157d(e0);
        C13706o.m87928e(g5, "IS_DELEGATED.get(flags)");
        boolean booleanValue5 = g5.booleanValue();
        C14775j jVar3 = r1;
        Boolean g6 = C15714b.f65030F.mo75157d(e0);
        C13706o.m87928e(g6, "IS_EXPECT_PROPERTY.get(flags)");
        C13494n nVar5 = nVar4;
        C14775j jVar4 = new C14775j(e, (C14140t0) null, d, b, a, booleanValue, b2, b3, booleanValue2, booleanValue3, booleanValue4, booleanValue5, g6.booleanValue(), nVar, this.f63939a.mo73992g(), this.f63939a.mo73995j(), this.f63939a.mo73996k(), this.f63939a.mo73989d());
        C14798m mVar2 = this.f63939a;
        List<C13519s> t0 = nVar.mo71369t0();
        C13706o.m87928e(t0, "proto.typeParameterList");
        C14798m b4 = C14798m.m92301b(mVar2, jVar3, t0, (C15719c) null, (C15724g) null, (C15725h) null, (C15712a) null, 60, (Object) null);
        int i2 = e0;
        Boolean g7 = C15714b.f65064y.mo75157d(i2);
        C13706o.m87928e(g7, "HAS_GETTER.get(flags)");
        boolean booleanValue6 = g7.booleanValue();
        if (!booleanValue6 || !C15723f.m95032e(nVar)) {
            nVar2 = nVar;
            gVar = C13921g.f62330v.mo72251b();
        } else {
            nVar2 = nVar;
            gVar = m92341g(nVar2, C14713b.PROPERTY_GETTER);
        }
        C14900e0 q2 = b4.mo73994i().mo73847q(C15723f.m95038k(nVar2, this.f63939a.mo73995j()));
        List<C13950e1> j = b4.mo73994i().mo73845j();
        C14146w0 e2 = m92339e();
        C13508q i3 = C15723f.m95036i(nVar2, this.f63939a.mo73995j());
        C13951f fVar = null;
        if (i3 == null || (q = b4.mo73994i().mo73847q(i3)) == null) {
            jVar = jVar3;
            w0Var = null;
        } else {
            jVar = jVar3;
            w0Var = C14602c.m91476h(jVar, q, gVar);
        }
        List<C13508q> b0 = nVar.mo71355b0();
        C13706o.m87928e(b0, "proto.contextReceiverTypeList");
        ArrayList arrayList = new ArrayList(C13616u.m87774u(b0, 10));
        for (C13508q qVar : b0) {
            C13706o.m87928e(qVar, "it");
            arrayList.add(m92344n(qVar, b4, jVar));
        }
        jVar.mo72344b1(q2, j, e2, w0Var, arrayList);
        Boolean g8 = C15714b.f65042c.mo75157d(i2);
        C13706o.m87928e(g8, "HAS_ANNOTATIONS.get(flags)");
        boolean booleanValue7 = g8.booleanValue();
        C15714b.C15718d<C13540x> dVar3 = C15714b.f65043d;
        C15714b.C15718d<C13486k> dVar4 = C15714b.f65044e;
        int b5 = C15714b.m95004b(booleanValue7, dVar3.mo75157d(i2), dVar4.mo75157d(i2), false, false, false);
        if (booleanValue6) {
            int f0 = nVar.mo71372w0() ? nVar.mo71358f0() : b5;
            Boolean g9 = C15714b.f65034J.mo75157d(f0);
            C13706o.m87928e(g9, "IS_NOT_DEFAULT.get(getterFlags)");
            boolean booleanValue8 = g9.booleanValue();
            Boolean g10 = C15714b.f65035K.mo75157d(f0);
            C13706o.m87928e(g10, "IS_EXTERNAL_ACCESSOR.get(getterFlags)");
            boolean booleanValue9 = g10.booleanValue();
            Boolean g11 = C15714b.f65036L.mo75157d(f0);
            C13706o.m87928e(g11, "IS_INLINE_ACCESSOR.get(getterFlags)");
            boolean booleanValue10 = g11.booleanValue();
            C13921g d2 = m92338d(nVar2, f0, C14713b.PROPERTY_GETTER);
            if (booleanValue8) {
                C14711a0 a0Var2 = C14711a0.f63745a;
                mVar = b4;
                dVar2 = dVar4;
                dVar = dVar3;
                d0Var3 = new C13984d0(jVar, d2, a0Var2.mo73840b(dVar4.mo75157d(f0)), C14714b0.m91934a(a0Var2, dVar3.mo75157d(f0)), !booleanValue8, booleanValue9, booleanValue10, jVar.mo72264h(), (C14142u0) null, C14158z0.f62778a);
            } else {
                dVar = dVar3;
                mVar = b4;
                dVar2 = dVar4;
                d0Var3 = C14602c.m91472d(jVar, d2);
                C13706o.m87928e(d0Var3, "{\n                Descri…nnotations)\n            }");
            }
            d0Var3.mo72374Q0(jVar.getReturnType());
            d0Var = d0Var3;
        } else {
            dVar = dVar3;
            mVar = b4;
            dVar2 = dVar4;
            d0Var = null;
        }
        Boolean g12 = C15714b.f65065z.mo75157d(i2);
        C13706o.m87928e(g12, "HAS_SETTER.get(flags)");
        if (g12.booleanValue()) {
            if (nVar.mo71348D0()) {
                b5 = nVar.mo71365o0();
            }
            int i4 = b5;
            Boolean g13 = C15714b.f65034J.mo75157d(i4);
            C13706o.m87928e(g13, "IS_NOT_DEFAULT.get(setterFlags)");
            boolean booleanValue11 = g13.booleanValue();
            Boolean g14 = C15714b.f65035K.mo75157d(i4);
            C13706o.m87928e(g14, "IS_EXTERNAL_ACCESSOR.get(setterFlags)");
            boolean booleanValue12 = g14.booleanValue();
            Boolean g15 = C15714b.f65036L.mo75157d(i4);
            C13706o.m87928e(g15, "IS_INLINE_ACCESSOR.get(setterFlags)");
            boolean booleanValue13 = g15.booleanValue();
            C14713b bVar = C14713b.PROPERTY_SETTER;
            C13921g d3 = m92338d(nVar2, i4, bVar);
            if (booleanValue11) {
                C14711a0 a0Var3 = C14711a0.f63745a;
                C13990e0 e0Var2 = r1;
                d0Var2 = d0Var;
                C13990e0 e0Var3 = new C13990e0(jVar, d3, a0Var3.mo73840b(dVar2.mo75157d(i4)), C14714b0.m91934a(a0Var3, dVar.mo75157d(i4)), !booleanValue11, booleanValue12, booleanValue13, jVar.mo72264h(), (C14144v0) null, C14158z0.f62778a);
                z = true;
                jVar2 = jVar;
                nVar3 = nVar2;
                i = i2;
                C13990e0 e0Var4 = e0Var2;
                e0Var4.mo72387R0((C13966i1) C13566b0.m87446u0(C14798m.m92301b(mVar, e0Var2, C13614t.m87748j(), (C15719c) null, (C15724g) null, (C15725h) null, (C15712a) null, 60, (Object) null).mo73991f().m92345o(C13612s.m87736e(nVar.mo71366q0()), nVar3, bVar)));
                e0Var = e0Var4;
            } else {
                d0Var2 = d0Var;
                jVar2 = jVar;
                nVar3 = nVar2;
                i = i2;
                z = true;
                e0Var = C14602c.m91473e(jVar2, d3, C13921g.f62330v.mo72251b());
                C13706o.m87928e(e0Var, "{\n                Descri…          )\n            }");
            }
        } else {
            d0Var2 = d0Var;
            jVar2 = jVar;
            nVar3 = nVar2;
            i = i2;
            z = true;
            e0Var = null;
        }
        Boolean g16 = C15714b.f65027C.mo75157d(i);
        C13706o.m87928e(g16, "HAS_CONSTANT.get(flags)");
        if (g16.booleanValue()) {
            jVar2.mo72458L0(new C14818d(this, nVar3, jVar2));
        }
        C14064m e3 = this.f63939a.mo73990e();
        C13948e eVar = e3 instanceof C13948e ? (C13948e) e3 : null;
        if (eVar != null) {
            fVar = eVar.mo62168h();
        }
        if (fVar == C13951f.ANNOTATION_CLASS) {
            jVar2.mo72458L0(new C14820e(this, nVar3, jVar2));
        }
        jVar2.mo72340V0(d0Var2, e0Var, new C14019o(m92340f(nVar3, false), jVar2), new C14019o(m92340f(nVar3, z), jVar2));
        return jVar2;
    }

    /* renamed from: m */
    public final C13947d1 mo74012m(C13516r rVar) {
        C13516r rVar2 = rVar;
        C13706o.m87929f(rVar2, "proto");
        C13921g.C13922a aVar = C13921g.f62330v;
        List<C13444b> U = rVar.mo71501U();
        C13706o.m87928e(U, "proto.annotationList");
        ArrayList arrayList = new ArrayList(C13616u.m87774u(U, 10));
        for (C13444b bVar : U) {
            C14781e eVar = this.f63940b;
            C13706o.m87928e(bVar, "it");
            arrayList.add(eVar.mo73941a(bVar, this.f63939a.mo73992g()));
        }
        C14777l lVar = new C14777l(this.f63939a.mo73993h(), this.f63939a.mo73990e(), aVar.mo72250a(arrayList), C14823x.m92359b(this.f63939a.mo73992g(), rVar.mo71506a0()), C14714b0.m91934a(C14711a0.f63745a, C15714b.f65043d.mo75157d(rVar.mo71505Z())), rVar, this.f63939a.mo73992g(), this.f63939a.mo73995j(), this.f63939a.mo73996k(), this.f63939a.mo73989d());
        C14798m mVar = this.f63939a;
        List<C13519s> d0 = rVar.mo71509d0();
        C13706o.m87928e(d0, "proto.typeParameterList");
        C14777l lVar2 = lVar;
        C14798m b = C14798m.m92301b(mVar, lVar, d0, (C15719c) null, (C15724g) null, (C15725h) null, (C15712a) null, 60, (Object) null);
        lVar2.mo73935Q0(b.mo73994i().mo73845j(), b.mo73994i().mo73846l(C15723f.m95042o(rVar2, this.f63939a.mo73995j()), false), b.mo73994i().mo73846l(C15723f.m95029b(rVar2, this.f63939a.mo73995j()), false));
        return lVar2;
    }
}

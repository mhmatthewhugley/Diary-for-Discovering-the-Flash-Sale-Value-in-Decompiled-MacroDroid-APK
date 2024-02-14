package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C14064m;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14750f;
import p308kb.C13519s;
import p327mb.C15712a;
import p327mb.C15719c;
import p327mb.C15724g;
import p327mb.C15725h;
import p327mb.C15727i;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.m */
/* compiled from: context.kt */
public final class C14798m {

    /* renamed from: a */
    private final C14794k f63914a;

    /* renamed from: b */
    private final C15719c f63915b;

    /* renamed from: c */
    private final C14064m f63916c;

    /* renamed from: d */
    private final C15724g f63917d;

    /* renamed from: e */
    private final C15725h f63918e;

    /* renamed from: f */
    private final C15712a f63919f;

    /* renamed from: g */
    private final C14750f f63920g;

    /* renamed from: h */
    private final C14720d0 f63921h;

    /* renamed from: i */
    private final C14814w f63922i;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0052, code lost:
        r2 = r8.mo73170a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C14798m(kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14794k r2, p327mb.C15719c r3, kotlin.reflect.jvm.internal.impl.descriptors.C14064m r4, p327mb.C15724g r5, p327mb.C15725h r6, p327mb.C15712a r7, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C14750f r8, kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14720d0 r9, java.util.List<p308kb.C13519s> r10) {
        /*
            r1 = this;
            java.lang.String r0 = "components"
            kotlin.jvm.internal.C13706o.m87929f(r2, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.C13706o.m87929f(r3, r0)
            java.lang.String r0 = "containingDeclaration"
            kotlin.jvm.internal.C13706o.m87929f(r4, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.C13706o.m87929f(r5, r0)
            java.lang.String r0 = "versionRequirementTable"
            kotlin.jvm.internal.C13706o.m87929f(r6, r0)
            java.lang.String r0 = "metadataVersion"
            kotlin.jvm.internal.C13706o.m87929f(r7, r0)
            java.lang.String r0 = "typeParameters"
            kotlin.jvm.internal.C13706o.m87929f(r10, r0)
            r1.<init>()
            r1.f63914a = r2
            r1.f63915b = r3
            r1.f63916c = r4
            r1.f63917d = r5
            r1.f63918e = r6
            r1.f63919f = r7
            r1.f63920g = r8
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.d0 r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.d0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Deserializer for \""
            r2.append(r3)
            pb.f r3 = r4.getName()
            r2.append(r3)
            r3 = 34
            r2.append(r3)
            java.lang.String r6 = r2.toString()
            if (r8 == 0) goto L_0x0058
            java.lang.String r2 = r8.mo73170a()
            if (r2 != 0) goto L_0x005a
        L_0x0058:
            java.lang.String r2 = "[container not found]"
        L_0x005a:
            r7 = r2
            r2 = r0
            r3 = r1
            r4 = r9
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r1.f63921h = r0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.w r2 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.w
            r2.<init>(r1)
            r1.f63922i = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14798m.<init>(kotlin.reflect.jvm.internal.impl.serialization.deserialization.k, mb.c, kotlin.reflect.jvm.internal.impl.descriptors.m, mb.g, mb.h, mb.a, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f, kotlin.reflect.jvm.internal.impl.serialization.deserialization.d0, java.util.List):void");
    }

    /* renamed from: b */
    public static /* synthetic */ C14798m m92301b(C14798m mVar, C14064m mVar2, List list, C15719c cVar, C15724g gVar, C15725h hVar, C15712a aVar, int i, Object obj) {
        if ((i & 4) != 0) {
            cVar = mVar.f63915b;
        }
        C15719c cVar2 = cVar;
        if ((i & 8) != 0) {
            gVar = mVar.f63917d;
        }
        C15724g gVar2 = gVar;
        if ((i & 16) != 0) {
            hVar = mVar.f63918e;
        }
        C15725h hVar2 = hVar;
        if ((i & 32) != 0) {
            aVar = mVar.f63919f;
        }
        return mVar.mo73987a(mVar2, list, cVar2, gVar2, hVar2, aVar);
    }

    /* renamed from: a */
    public final C14798m mo73987a(C14064m mVar, List<C13519s> list, C15719c cVar, C15724g gVar, C15725h hVar, C15712a aVar) {
        C14064m mVar2 = mVar;
        C13706o.m87929f(mVar, "descriptor");
        List<C13519s> list2 = list;
        C13706o.m87929f(list, "typeParameterProtos");
        C15719c cVar2 = cVar;
        C13706o.m87929f(cVar, "nameResolver");
        C13706o.m87929f(gVar, "typeTable");
        C15725h hVar2 = hVar;
        C13706o.m87929f(hVar2, "versionRequirementTable");
        C13706o.m87929f(aVar, "metadataVersion");
        C14794k kVar = this.f63914a;
        if (!C15727i.m95050b(aVar)) {
            hVar2 = this.f63918e;
        }
        return new C14798m(kVar, cVar, mVar, gVar, hVar2, aVar, this.f63920g, this.f63921h, list);
    }

    /* renamed from: c */
    public final C14794k mo73988c() {
        return this.f63914a;
    }

    /* renamed from: d */
    public final C14750f mo73989d() {
        return this.f63920g;
    }

    /* renamed from: e */
    public final C14064m mo73990e() {
        return this.f63916c;
    }

    /* renamed from: f */
    public final C14814w mo73991f() {
        return this.f63922i;
    }

    /* renamed from: g */
    public final C15719c mo73992g() {
        return this.f63915b;
    }

    /* renamed from: h */
    public final C17012n mo73993h() {
        return this.f63914a.mo73979u();
    }

    /* renamed from: i */
    public final C14720d0 mo73994i() {
        return this.f63921h;
    }

    /* renamed from: j */
    public final C15724g mo73995j() {
        return this.f63917d;
    }

    /* renamed from: k */
    public final C15725h mo73996k() {
        return this.f63918e;
    }
}

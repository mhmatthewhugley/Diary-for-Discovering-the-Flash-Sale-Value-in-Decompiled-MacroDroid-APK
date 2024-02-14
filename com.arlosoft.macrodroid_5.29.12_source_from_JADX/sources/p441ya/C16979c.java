package p441ya;

import kotlin.Metadata;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13703l;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.C13720b;
import kotlin.reflect.jvm.internal.C13841i0;
import kotlin.reflect.jvm.internal.C15047j;
import kotlin.reflect.jvm.internal.impl.descriptors.C14156y0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C14814w;
import p297ja.C13316c;
import p297ja.C13328m;
import p308kb.C13481i;
import p308kb.C13524t;
import p327mb.C15724g;
import p349ob.C15834e;
import p349ob.C15836f;
import p349ob.C15841i;
import p370qa.C16269p;
import p433xa.C16878g;
import p433xa.C16879h;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¨\u0006\u0004"}, mo71668d2 = {"R", "Lja/c;", "Lxa/h;", "a", "kotlin-reflection"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* renamed from: ya.c */
/* compiled from: reflectLambda.kt */
public final class C16979c {

    @Metadata(mo71669k = 3, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* renamed from: ya.c$a */
    /* compiled from: reflectLambda.kt */
    /* synthetic */ class C16980a extends C13703l implements C16269p<C14814w, C13481i, C14156y0> {

        /* renamed from: a */
        public static final C16980a f68360a = new C16980a();

        C16980a() {
            super(2);
        }

        public final String getName() {
            return "loadFunction";
        }

        public final C16878g getOwner() {
            return C13687e0.m87868b(C14814w.class);
        }

        public final String getSignature() {
            return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
        }

        /* renamed from: l */
        public final C14156y0 invoke(C14814w wVar, C13481i iVar) {
            C13706o.m87929f(wVar, "p0");
            C13706o.m87929f(iVar, "p1");
            return wVar.mo74010j(iVar);
        }
    }

    /* renamed from: a */
    public static final <R> C16879h<R> m100218a(C13316c<? extends R> cVar) {
        C13706o.m87929f(cVar, "<this>");
        Metadata metadata = (Metadata) cVar.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] d1 = metadata.mo71667d1();
        boolean z = true;
        if (d1.length == 0) {
            d1 = null;
        }
        if (d1 == null) {
            return null;
        }
        C13328m<C15836f, C13481i> j = C15841i.m95462j(d1, metadata.mo71668d2());
        C15836f a = j.mo70152a();
        C13481i b = j.mo70153b();
        int[] mv = metadata.mo71670mv();
        if ((metadata.mo71672xi() & 8) == 0) {
            z = false;
        }
        C15834e eVar = new C15834e(mv, z);
        Class<?> cls = cVar.getClass();
        C13524t t0 = b.mo71276t0();
        C13706o.m87928e(t0, "proto.typeTable");
        return new C15047j(C13720b.f61937f, (C14156y0) C13841i0.m88202g(cls, b, a, new C15724g(t0), eVar, C16980a.f68360a));
    }
}

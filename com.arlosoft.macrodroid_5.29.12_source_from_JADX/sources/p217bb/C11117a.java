package p217bb;

import java.util.Collection;
import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13944d;
import kotlin.reflect.jvm.internal.impl.descriptors.C13948e;
import kotlin.reflect.jvm.internal.impl.descriptors.C14156y0;
import kotlin.reflect.jvm.internal.impl.types.C14900e0;
import p362pb.C16157f;

/* renamed from: bb.a */
/* compiled from: AdditionalClassPartsProvider.kt */
public interface C11117a {

    /* renamed from: bb.a$a */
    /* compiled from: AdditionalClassPartsProvider.kt */
    public static final class C11118a implements C11117a {

        /* renamed from: a */
        public static final C11118a f54036a = new C11118a();

        private C11118a() {
        }

        /* renamed from: b */
        public Collection<C14156y0> mo62249b(C16157f fVar, C13948e eVar) {
            C13706o.m87929f(fVar, "name");
            C13706o.m87929f(eVar, "classDescriptor");
            return C13614t.m87748j();
        }

        /* renamed from: c */
        public Collection<C13944d> mo62250c(C13948e eVar) {
            C13706o.m87929f(eVar, "classDescriptor");
            return C13614t.m87748j();
        }

        /* renamed from: d */
        public Collection<C14900e0> mo62251d(C13948e eVar) {
            C13706o.m87929f(eVar, "classDescriptor");
            return C13614t.m87748j();
        }

        /* renamed from: e */
        public Collection<C16157f> mo62252e(C13948e eVar) {
            C13706o.m87929f(eVar, "classDescriptor");
            return C13614t.m87748j();
        }
    }

    /* renamed from: b */
    Collection<C14156y0> mo62249b(C16157f fVar, C13948e eVar);

    /* renamed from: c */
    Collection<C13944d> mo62250c(C13948e eVar);

    /* renamed from: d */
    Collection<C14900e0> mo62251d(C13948e eVar);

    /* renamed from: e */
    Collection<C16157f> mo62252e(C13948e eVar);
}

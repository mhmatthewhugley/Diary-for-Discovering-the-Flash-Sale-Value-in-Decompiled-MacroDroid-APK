package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.C13706o;
import kotlin.reflect.jvm.internal.impl.descriptors.C13952f0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14074p0;
import p362pb.C16152c;
import p442yb.C17012n;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.a0 */
/* compiled from: PackageViewDescriptorFactory.kt */
public interface C13972a0 {

    /* renamed from: a */
    public static final C13973a f62443a = C13973a.f62444a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.a0$a */
    /* compiled from: PackageViewDescriptorFactory.kt */
    public static final class C13973a {

        /* renamed from: a */
        static final /* synthetic */ C13973a f62444a = new C13973a();

        /* renamed from: b */
        private static final C13952f0<C13972a0> f62445b = new C13952f0<>("PackageViewDescriptorFactory");

        private C13973a() {
        }

        /* renamed from: a */
        public final C13952f0<C13972a0> mo72315a() {
            return f62445b;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.a0$b */
    /* compiled from: PackageViewDescriptorFactory.kt */
    public static final class C13974b implements C13972a0 {

        /* renamed from: b */
        public static final C13974b f62446b = new C13974b();

        private C13974b() {
        }

        /* renamed from: a */
        public C14074p0 mo72314a(C14037x xVar, C16152c cVar, C17012n nVar) {
            C13706o.m87929f(xVar, "module");
            C13706o.m87929f(cVar, "fqName");
            C13706o.m87929f(nVar, "storageManager");
            return new C14025r(xVar, cVar, nVar);
        }
    }

    /* renamed from: a */
    C14074p0 mo72314a(C14037x xVar, C16152c cVar, C17012n nVar);
}

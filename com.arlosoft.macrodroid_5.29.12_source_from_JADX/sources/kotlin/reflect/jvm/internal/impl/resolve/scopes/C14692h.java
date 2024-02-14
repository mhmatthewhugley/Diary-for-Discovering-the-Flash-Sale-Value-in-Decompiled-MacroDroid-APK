package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.reflect.jvm.internal.impl.descriptors.C14140t0;
import kotlin.reflect.jvm.internal.impl.descriptors.C14156y0;
import p263fb.C12253b;
import p362pb.C16157f;
import p370qa.C16265l;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.h */
/* compiled from: MemberScope.kt */
public interface C14692h extends C14698k {

    /* renamed from: a */
    public static final C14693a f63722a = C14693a.f63723a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.h$a */
    /* compiled from: MemberScope.kt */
    public static final class C14693a {

        /* renamed from: a */
        static final /* synthetic */ C14693a f63723a = new C14693a();

        /* renamed from: b */
        private static final C16265l<C16157f, Boolean> f63724b = C14694a.f63725a;

        /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.h$a$a */
        /* compiled from: MemberScope.kt */
        static final class C14694a extends C13708q implements C16265l<C16157f, Boolean> {

            /* renamed from: a */
            public static final C14694a f63725a = new C14694a();

            C14694a() {
                super(1);
            }

            /* renamed from: a */
            public final Boolean invoke(C16157f fVar) {
                C13706o.m87929f(fVar, "it");
                return Boolean.TRUE;
            }
        }

        private C14693a() {
        }

        /* renamed from: a */
        public final C16265l<C16157f, Boolean> mo73822a() {
            return f63724b;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.h$b */
    /* compiled from: MemberScope.kt */
    public static final class C14695b extends C14696i {

        /* renamed from: b */
        public static final C14695b f63726b = new C14695b();

        private C14695b() {
        }

        /* renamed from: a */
        public Set<C16157f> mo72448a() {
            return C13627z0.m87806d();
        }

        /* renamed from: b */
        public Set<C16157f> mo72449b() {
            return C13627z0.m87806d();
        }

        /* renamed from: f */
        public Set<C16157f> mo72404f() {
            return C13627z0.m87806d();
        }
    }

    /* renamed from: a */
    Set<C16157f> mo72448a();

    /* renamed from: b */
    Set<C16157f> mo72449b();

    /* renamed from: c */
    Collection<? extends C14156y0> mo72450c(C16157f fVar, C12253b bVar);

    /* renamed from: d */
    Collection<? extends C14140t0> mo72451d(C16157f fVar, C12253b bVar);

    /* renamed from: f */
    Set<C16157f> mo72404f();
}

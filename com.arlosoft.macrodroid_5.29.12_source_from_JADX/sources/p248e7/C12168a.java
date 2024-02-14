package p248e7;

import android.app.Activity;
import android.app.Application;
import com.yalantis.ucrop.C11913a;
import p259f7.C12241a;
import p259f7.C12242b;
import p259f7.C12245e;
import p267g7.C12314c;
import p284i7.C12444a;
import p284i7.C12446c;
import p414v9.C16735i;
import rx_activity_result2.C17430g;

/* renamed from: e7.a */
/* compiled from: RxPaparazzo */
public final class C12168a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static String f58607a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static String f58608b;

    /* renamed from: e7.a$a */
    /* compiled from: RxPaparazzo */
    private static abstract class C12169a<T, B extends C12169a<T, B>> {

        /* renamed from: a */
        private final C12444a f58609a;

        /* renamed from: b */
        private final B f58610b = this;

        /* renamed from: c */
        private final C12241a f58611c;

        C12169a(T t) {
            C12241a aVar = new C12241a();
            this.f58611c = aVar;
            aVar.mo68540p(C12168a.f58607a);
            aVar.mo68541q(C12168a.f58608b);
            this.f58609a = C12444a.m83379a(new C12446c(aVar, t));
        }

        /* renamed from: a */
        public <O extends C11913a.C11914a> B mo68446a(O o) {
            this.f58611c.mo68538n(o);
            return this.f58610b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C12444a mo68447b() {
            return this.f58609a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C12241a mo68448c() {
            return this.f58611c;
        }

        /* renamed from: d */
        public B mo68449d(C12314c cVar) {
            this.f58611c.mo68543s(cVar);
            return this.f58610b;
        }

        /* renamed from: e */
        public B mo68450e() {
            this.f58611c.mo68544t(true);
            return this.f58610b;
        }
    }

    /* renamed from: e7.a$b */
    /* compiled from: RxPaparazzo */
    public static class C12170b {

        /* renamed from: a */
        private final C12170b f58612a = this;

        C12170b() {
        }

        /* renamed from: a */
        public C12170b mo68451a(String str) {
            String unused = C12168a.f58608b = str;
            return this.f58612a;
        }
    }

    /* renamed from: e7.a$c */
    /* compiled from: RxPaparazzo */
    public static class C12171c<T> extends C12169a<T, C12171c<T>> {
        C12171c(T t) {
            super(t);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ C12169a mo68446a(C11913a.C11914a aVar) {
            return super.mo68446a(aVar);
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ C12169a mo68449d(C12314c cVar) {
            return super.mo68449d(cVar);
        }

        /* renamed from: e */
        public /* bridge */ /* synthetic */ C12169a mo68450e() {
            return super.mo68450e();
        }

        /* renamed from: f */
        public C16735i<C12245e<T, C12242b>> mo68452f() {
            return mo68447b().mo68830b().mo70126i();
        }

        /* renamed from: g */
        public C16735i<C12245e<T, C12242b>> mo68453g() {
            C12241a c = mo68448c();
            c.mo68542r("image/*");
            c.mo68539o(true);
            return mo68452f();
        }
    }

    /* renamed from: d */
    public static C12170b m82811d(Application application) {
        C17430g.m101212c(application);
        return new C12170b();
    }

    /* renamed from: e */
    public static <T extends Activity> C12171c<T> m82812e(T t) {
        return new C12171c<>(t);
    }
}

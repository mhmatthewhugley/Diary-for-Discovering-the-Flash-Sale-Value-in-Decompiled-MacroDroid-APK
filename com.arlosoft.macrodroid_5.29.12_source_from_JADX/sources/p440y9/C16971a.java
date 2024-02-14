package p440y9;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import p414v9.C16742o;
import p432x9.C16871a;

/* renamed from: y9.a */
/* compiled from: AndroidSchedulers */
public final class C16971a {

    /* renamed from: a */
    private static final C16742o f68350a = C16871a.m99924d(new C16972a());

    /* renamed from: y9.a$a */
    /* compiled from: AndroidSchedulers */
    static class C16972a implements Callable<C16742o> {
        C16972a() {
        }

        /* renamed from: a */
        public C16742o call() throws Exception {
            return C16973b.f68351a;
        }
    }

    /* renamed from: y9.a$b */
    /* compiled from: AndroidSchedulers */
    private static final class C16973b {

        /* renamed from: a */
        static final C16742o f68351a = new C16974b(new Handler(Looper.getMainLooper()), false);
    }

    /* renamed from: a */
    public static C16742o m100210a() {
        return C16871a.m99925e(f68350a);
    }
}

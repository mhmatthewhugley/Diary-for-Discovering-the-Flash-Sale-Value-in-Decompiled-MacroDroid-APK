package p455ag;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ag.a */
/* compiled from: Timber */
public final class C17105a {

    /* renamed from: a */
    private static final C17107b[] f68681a;

    /* renamed from: b */
    private static final List<C17107b> f68682b = new ArrayList();

    /* renamed from: c */
    static volatile C17107b[] f68683c;

    /* renamed from: d */
    private static final C17107b f68684d = new C17106a();

    /* renamed from: ag.a$a */
    /* compiled from: Timber */
    static class C17106a extends C17107b {
        C17106a() {
        }

        /* renamed from: a */
        public void mo80380a(String str, Object... objArr) {
            for (C17107b a : C17105a.f68683c) {
                a.mo80380a(str, objArr);
            }
        }

        /* renamed from: b */
        public void mo80381b(Throwable th, String str, Object... objArr) {
            for (C17107b b : C17105a.f68683c) {
                b.mo80381b(th, str, objArr);
            }
        }

        /* renamed from: c */
        public void mo80382c(String str, Object... objArr) {
            for (C17107b c : C17105a.f68683c) {
                c.mo80382c(str, objArr);
            }
        }

        /* renamed from: d */
        public void mo80383d(Throwable th) {
            for (C17107b d : C17105a.f68683c) {
                d.mo80383d(th);
            }
        }

        /* renamed from: e */
        public void mo80384e(String str, Object... objArr) {
            for (C17107b e : C17105a.f68683c) {
                e.mo80384e(str, objArr);
            }
        }
    }

    /* renamed from: ag.a$b */
    /* compiled from: Timber */
    public static abstract class C17107b {

        /* renamed from: a */
        final ThreadLocal<String> f68685a = new ThreadLocal<>();

        /* renamed from: a */
        public abstract void mo80380a(String str, Object... objArr);

        /* renamed from: b */
        public abstract void mo80381b(Throwable th, String str, Object... objArr);

        /* renamed from: c */
        public abstract void mo80382c(String str, Object... objArr);

        /* renamed from: d */
        public abstract void mo80383d(Throwable th);

        /* renamed from: e */
        public abstract void mo80384e(String str, Object... objArr);
    }

    static {
        C17107b[] bVarArr = new C17107b[0];
        f68681a = bVarArr;
        f68683c = bVarArr;
    }

    /* renamed from: a */
    public static void m100579a(String str, Object... objArr) {
        f68684d.mo80380a(str, objArr);
    }

    /* renamed from: b */
    public static void m100580b(Throwable th, String str, Object... objArr) {
        f68684d.mo80381b(th, str, objArr);
    }

    /* renamed from: c */
    public static void m100581c(String str, Object... objArr) {
        f68684d.mo80382c(str, objArr);
    }

    /* renamed from: d */
    public static void m100582d(Throwable th) {
        f68684d.mo80383d(th);
    }

    /* renamed from: e */
    public static void m100583e(String str, Object... objArr) {
        f68684d.mo80384e(str, objArr);
    }
}

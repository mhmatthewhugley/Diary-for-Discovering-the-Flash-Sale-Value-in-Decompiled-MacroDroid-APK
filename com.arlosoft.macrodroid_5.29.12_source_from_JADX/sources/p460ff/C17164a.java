package p460ff;

import android.app.Activity;
import android.app.Fragment;
import p459ef.C17153c;
import p461gf.C17170a;
import p462hf.C17171a;
import p464jf.C17181e;

/* renamed from: ff.a */
/* compiled from: AppObservable */
public final class C17164a {

    /* renamed from: a */
    private static final C17181e<Activity, Boolean> f68713a = new C17165a();

    /* renamed from: b */
    private static final C17181e<Fragment, Boolean> f68714b = new C17166b();

    /* renamed from: c */
    private static final C17181e<androidx.fragment.app.Fragment, Boolean> f68715c = new C17167c();

    /* renamed from: d */
    public static final boolean f68716d;

    /* renamed from: ff.a$a */
    /* compiled from: AppObservable */
    static class C17165a implements C17181e<Activity, Boolean> {
        C17165a() {
        }

        /* renamed from: b */
        public Boolean mo80454a(Activity activity) {
            return Boolean.valueOf(!activity.isFinishing());
        }
    }

    /* renamed from: ff.a$b */
    /* compiled from: AppObservable */
    static class C17166b implements C17181e<Fragment, Boolean> {
        C17166b() {
        }

        /* renamed from: b */
        public Boolean mo80454a(Fragment fragment) {
            return Boolean.valueOf(fragment.isAdded() && !fragment.getActivity().isFinishing());
        }
    }

    /* renamed from: ff.a$c */
    /* compiled from: AppObservable */
    static class C17167c implements C17181e<androidx.fragment.app.Fragment, Boolean> {
        C17167c() {
        }

        /* renamed from: b */
        public Boolean mo80454a(androidx.fragment.app.Fragment fragment) {
            return Boolean.valueOf(fragment.isAdded() && !fragment.getActivity().isFinishing());
        }
    }

    static {
        boolean z;
        try {
            Class.forName("androidx.fragment.app.Fragment");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f68716d = z;
    }

    /* renamed from: a */
    public static <T> C17153c<T> m100658a(Activity activity, C17153c<T> cVar) {
        C17170a.m100673a();
        return cVar.mo80430e(C17171a.m100674a()).mo80429d(new C17168b(activity, f68713a));
    }
}

package p215b8;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.List;
import p216ba.C11114e;
import p292io.reactivex.subjects.C13244c;
import p414v9.C16735i;
import p414v9.C16739l;
import p414v9.C16740m;

/* renamed from: b8.b */
/* compiled from: RxPermissions */
public class C11102b {

    /* renamed from: b */
    static final String f54021b = "b";

    /* renamed from: c */
    static final Object f54022c = new Object();
    @VisibleForTesting

    /* renamed from: a */
    C11108e<C11109c> f54023a;

    /* renamed from: b8.b$a */
    /* compiled from: RxPermissions */
    class C11103a implements C11108e<C11109c> {

        /* renamed from: a */
        private C11109c f54024a;

        /* renamed from: b */
        final /* synthetic */ FragmentManager f54025b;

        C11103a(FragmentManager fragmentManager) {
            this.f54025b = fragmentManager;
        }

        /* renamed from: a */
        public synchronized C11109c get() {
            if (this.f54024a == null) {
                this.f54024a = C11102b.this.m74746h(this.f54025b);
            }
            return this.f54024a;
        }
    }

    /* renamed from: b8.b$b */
    /* compiled from: RxPermissions */
    class C11104b implements C16740m<T, Boolean> {

        /* renamed from: a */
        final /* synthetic */ String[] f54027a;

        /* renamed from: b8.b$b$a */
        /* compiled from: RxPermissions */
        class C11105a implements C11114e<List<C11101a>, C16739l<Boolean>> {
            C11105a() {
            }

            /* renamed from: a */
            public C16739l<Boolean> apply(List<C11101a> list) {
                if (list.isEmpty()) {
                    return C16735i.m99354s();
                }
                for (C11101a aVar : list) {
                    if (!aVar.f54019b) {
                        return C16735i.m99342F(Boolean.FALSE);
                    }
                }
                return C16735i.m99342F(Boolean.TRUE);
            }
        }

        C11104b(String[] strArr) {
            this.f54027a = strArr;
        }

        /* renamed from: a */
        public C16739l<Boolean> mo62236a(C16735i<T> iVar) {
            return C11102b.this.m74749n(iVar, this.f54027a).mo79696b(this.f54027a.length).mo79712u(new C11105a());
        }
    }

    /* renamed from: b8.b$c */
    /* compiled from: RxPermissions */
    class C11106c implements C16740m<T, C11101a> {

        /* renamed from: a */
        final /* synthetic */ String[] f54030a;

        C11106c(String[] strArr) {
            this.f54030a = strArr;
        }

        /* renamed from: a */
        public C16739l<C11101a> mo62236a(C16735i<T> iVar) {
            return C11102b.this.m74749n(iVar, this.f54030a);
        }
    }

    /* renamed from: b8.b$d */
    /* compiled from: RxPermissions */
    class C11107d implements C11114e<Object, C16735i<C11101a>> {

        /* renamed from: a */
        final /* synthetic */ String[] f54032a;

        C11107d(String[] strArr) {
            this.f54032a = strArr;
        }

        /* renamed from: a */
        public C16735i<C11101a> apply(Object obj) {
            return C11102b.this.m74750q(this.f54032a);
        }
    }

    @FunctionalInterface
    /* renamed from: b8.b$e */
    /* compiled from: RxPermissions */
    public interface C11108e<V> {
        V get();
    }

    public C11102b(@NonNull FragmentActivity fragmentActivity) {
        this.f54023a = m74745g(fragmentActivity.getSupportFragmentManager());
    }

    /* renamed from: f */
    private C11109c m74744f(@NonNull FragmentManager fragmentManager) {
        return (C11109c) fragmentManager.findFragmentByTag(f54021b);
    }

    @NonNull
    /* renamed from: g */
    private C11108e<C11109c> m74745g(@NonNull FragmentManager fragmentManager) {
        return new C11103a(fragmentManager);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public C11109c m74746h(@NonNull FragmentManager fragmentManager) {
        C11109c f = m74744f(fragmentManager);
        if (!(f == null)) {
            return f;
        }
        C11109c cVar = new C11109c();
        fragmentManager.beginTransaction().add((Fragment) cVar, f54021b).commitNow();
        return cVar;
    }

    /* renamed from: l */
    private C16735i<?> m74747l(C16735i<?> iVar, C16735i<?> iVar2) {
        if (iVar == null) {
            return C16735i.m99342F(f54022c);
        }
        return C16735i.m99343H(iVar, iVar2);
    }

    /* renamed from: m */
    private C16735i<?> m74748m(String... strArr) {
        for (String U : strArr) {
            if (!this.f54023a.get().mo62239U(U)) {
                return C16735i.m99354s();
            }
        }
        return C16735i.m99342F(f54022c);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public C16735i<C11101a> m74749n(C16735i<?> iVar, String... strArr) {
        if (strArr != null && strArr.length != 0) {
            return m74747l(iVar, m74748m(strArr)).mo79712u(new C11107d(strArr));
        }
        throw new IllegalArgumentException("RxPermissions.request/requestEach requires at least one input permission");
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public C16735i<C11101a> m74750q(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        ArrayList arrayList2 = new ArrayList();
        for (String str : strArr) {
            this.f54023a.get().mo62243Z("Requesting permission " + str);
            if (mo62228i(str)) {
                arrayList.add(C16735i.m99342F(new C11101a(str, true, false)));
            } else if (mo62230k(str)) {
                arrayList.add(C16735i.m99342F(new C11101a(str, false, false)));
            } else {
                C13244c<C11101a> V = this.f54023a.get().mo62240V(str);
                if (V == null) {
                    arrayList2.add(str);
                    V = C13244c.m85607i0();
                    this.f54023a.get().mo62246f0(str, V);
                }
                arrayList.add(V);
            }
        }
        if (!arrayList2.isEmpty()) {
            mo62233r((String[]) arrayList2.toArray(new String[arrayList2.size()]));
        }
        return C16735i.m99349g(C16735i.m99339B(arrayList));
    }

    /* renamed from: d */
    public <T> C16740m<T, Boolean> mo62226d(String... strArr) {
        return new C11104b(strArr);
    }

    /* renamed from: e */
    public <T> C16740m<T, C11101a> mo62227e(String... strArr) {
        return new C11106c(strArr);
    }

    /* renamed from: i */
    public boolean mo62228i(String str) {
        return !mo62229j() || this.f54023a.get().mo62241W(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo62229j() {
        return Build.VERSION.SDK_INT >= 23;
    }

    /* renamed from: k */
    public boolean mo62230k(String str) {
        return mo62229j() && this.f54023a.get().mo62242X(str);
    }

    /* renamed from: o */
    public C16735i<Boolean> mo62231o(String... strArr) {
        return C16735i.m99342F(f54022c).mo79701f(mo62226d(strArr));
    }

    /* renamed from: p */
    public C16735i<C11101a> mo62232p(String... strArr) {
        return C16735i.m99342F(f54022c).mo79701f(mo62227e(strArr));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo62233r(String[] strArr) {
        this.f54023a.get().mo62243Z("requestPermissionsFromFragment " + TextUtils.join(", ", strArr));
        this.f54023a.get().mo62245e0(strArr);
    }

    public C11102b(@NonNull Fragment fragment) {
        this.f54023a = m74745g(fragment.getChildFragmentManager());
    }
}

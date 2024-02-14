package rx_activity_result2;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import p216ba.C11113d;
import p292io.reactivex.subjects.C13244c;
import p414v9.C16735i;

/* renamed from: rx_activity_result2.g */
/* compiled from: RxActivityResult */
public final class C17430g {

    /* renamed from: a */
    static C17419a f69200a;

    /* renamed from: rx_activity_result2.g$a */
    /* compiled from: RxActivityResult */
    public static class C17431a<T> {

        /* renamed from: a */
        final Class f69201a;

        /* renamed from: b */
        final C13244c<C17429f<T>> f69202b = C13244c.m85607i0();

        /* renamed from: c */
        private final boolean f69203c;

        /* renamed from: rx_activity_result2.g$a$a */
        /* compiled from: RxActivityResult */
        class C17432a implements C11113d<Activity> {
            C17432a() {
            }

            /* renamed from: a */
            public void accept(Activity activity) throws Exception {
                activity.startActivity(new Intent(activity, HolderActivity.class).addFlags(65536));
            }
        }

        /* renamed from: rx_activity_result2.g$a$b */
        /* compiled from: RxActivityResult */
        class C17433b implements C17426c {
            C17433b() {
            }

            /* renamed from: o */
            public void mo80762o(int i, int i2, Intent intent) {
                if (C17430g.f69200a.mo80751a() != null && C17430g.f69200a.mo80751a().getClass() == C17431a.this.f69201a) {
                    C17431a.this.f69202b.onNext(new C17429f(C17430g.f69200a.mo80751a(), i, i2, intent));
                    C17431a.this.f69202b.onComplete();
                }
            }

            /* renamed from: s */
            public void mo80763s(Throwable th) {
                C17431a.this.f69202b.onError(th);
            }
        }

        /* renamed from: rx_activity_result2.g$a$c */
        /* compiled from: RxActivityResult */
        class C17434c implements C17426c {
            C17434c() {
            }

            /* renamed from: o */
            public void mo80762o(int i, int i2, Intent intent) {
                if (C17430g.f69200a.mo80751a() != null) {
                    Fragment a = C17431a.this.mo80778a(((FragmentActivity) C17430g.f69200a.mo80751a()).getSupportFragmentManager().getFragments());
                    if (a != null) {
                        C17431a.this.f69202b.onNext(new C17429f(a, i, i2, intent));
                        C17431a.this.f69202b.onComplete();
                    }
                }
            }

            /* renamed from: s */
            public void mo80763s(Throwable th) {
                C17431a.this.f69202b.onError(th);
            }
        }

        public C17431a(T t) {
            if (C17430g.f69200a != null) {
                this.f69201a = t.getClass();
                this.f69203c = t instanceof Activity;
                return;
            }
            throw new IllegalStateException("You must call RxActivityResult.register(application) before attempting to use startIntent");
        }

        /* renamed from: b */
        private C17426c m101213b() {
            return new C17433b();
        }

        /* renamed from: c */
        private C17426c m101214c() {
            return new C17434c();
        }

        /* renamed from: d */
        private C16735i<C17429f<T>> m101215d(C17427d dVar, @Nullable C17425b bVar) {
            dVar.mo80768e(this.f69203c ? m101213b() : m101214c());
            dVar.mo80767d(bVar);
            HolderActivity.m101182a(dVar);
            C17430g.f69200a.mo80752b().mo79685P(new C17432a());
            return this.f69202b;
        }

        /* access modifiers changed from: package-private */
        @Nullable
        /* renamed from: a */
        public Fragment mo80778a(List<Fragment> list) {
            Fragment a;
            if (list == null) {
                return null;
            }
            for (Fragment next : list) {
                if (next != null && next.isVisible() && next.getClass() == this.f69201a) {
                    return next;
                }
                if (next != null && next.isAdded() && next.getChildFragmentManager() != null && (a = mo80778a(next.getChildFragmentManager().getFragments())) != null) {
                    return a;
                }
            }
            return null;
        }

        /* renamed from: e */
        public C16735i<C17429f<T>> mo80779e(Intent intent, @Nullable C17425b bVar) {
            return m101215d(new C17427d(intent), bVar);
        }
    }

    /* renamed from: a */
    public static <T extends Activity> C17431a<T> m101210a(T t) {
        return new C17431a<>(t);
    }

    /* renamed from: b */
    public static <T extends Fragment> C17431a<T> m101211b(T t) {
        return new C17431a<>(t);
    }

    /* renamed from: c */
    public static void m101212c(Application application) {
        f69200a = new C17419a(application);
    }
}

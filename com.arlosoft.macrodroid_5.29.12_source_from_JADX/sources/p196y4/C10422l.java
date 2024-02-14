package p196y4;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.HashMap;
import java.util.Map;
import p083e4.C7271c;
import p083e4.C7278i;
import p090f5.C7316k;

/* renamed from: y4.l */
/* compiled from: RequestManagerRetriever */
public class C10422l implements Handler.Callback {

    /* renamed from: z */
    private static final C10424b f23665z = new C10423a();

    /* renamed from: a */
    private volatile C7278i f23666a;
    @VisibleForTesting

    /* renamed from: c */
    final Map<FragmentManager, C10420k> f23667c = new HashMap();
    @VisibleForTesting

    /* renamed from: d */
    final Map<androidx.fragment.app.FragmentManager, C10427o> f23668d = new HashMap();

    /* renamed from: f */
    private final Handler f23669f;

    /* renamed from: g */
    private final C10424b f23670g;

    /* renamed from: o */
    private final ArrayMap<View, Fragment> f23671o = new ArrayMap<>();

    /* renamed from: p */
    private final ArrayMap<View, android.app.Fragment> f23672p = new ArrayMap<>();

    /* renamed from: s */
    private final Bundle f23673s = new Bundle();

    /* renamed from: y4.l$a */
    /* compiled from: RequestManagerRetriever */
    class C10423a implements C10424b {
        C10423a() {
        }

        @NonNull
        /* renamed from: a */
        public C7278i mo41130a(@NonNull C7271c cVar, @NonNull C10417h hVar, @NonNull C10425m mVar, @NonNull Context context) {
            return new C7278i(cVar, hVar, mVar, context);
        }
    }

    /* renamed from: y4.l$b */
    /* compiled from: RequestManagerRetriever */
    public interface C10424b {
        @NonNull
        /* renamed from: a */
        C7278i mo41130a(@NonNull C7271c cVar, @NonNull C10417h hVar, @NonNull C10425m mVar, @NonNull Context context);
    }

    public C10422l(@Nullable C10424b bVar) {
        this.f23670g = bVar == null ? f23665z : bVar;
        this.f23669f = new Handler(Looper.getMainLooper(), this);
    }

    /* renamed from: a */
    private static void m40804a(@NonNull Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    @NonNull
    @Deprecated
    /* renamed from: b */
    private C7278i m40805b(@NonNull Context context, @NonNull FragmentManager fragmentManager, @Nullable android.app.Fragment fragment, boolean z) {
        C10420k h = m40807h(fragmentManager, fragment, z);
        C7278i d = h.mo41113d();
        if (d != null) {
            return d;
        }
        C7278i a = this.f23670g.mo41130a(C7271c.m30011c(context), h.mo41112b(), h.mo41114e(), context);
        h.mo41116i(a);
        return a;
    }

    @NonNull
    /* renamed from: f */
    private C7278i m40806f(@NonNull Context context) {
        if (this.f23666a == null) {
            synchronized (this) {
                if (this.f23666a == null) {
                    this.f23666a = this.f23670g.mo41130a(C7271c.m30011c(context.getApplicationContext()), new C10409b(), new C10416g(), context.getApplicationContext());
                }
            }
        }
        return this.f23666a;
    }

    @NonNull
    /* renamed from: h */
    private C10420k m40807h(@NonNull FragmentManager fragmentManager, @Nullable android.app.Fragment fragment, boolean z) {
        C10420k kVar = (C10420k) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (kVar == null && (kVar = this.f23667c.get(fragmentManager)) == null) {
            kVar = new C10420k();
            kVar.mo41115h(fragment);
            if (z) {
                kVar.mo41112b().mo41107d();
            }
            this.f23667c.put(fragmentManager, kVar);
            fragmentManager.beginTransaction().add(kVar, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f23669f.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return kVar;
    }

    @NonNull
    /* renamed from: j */
    private C10427o m40808j(@NonNull androidx.fragment.app.FragmentManager fragmentManager, @Nullable Fragment fragment, boolean z) {
        C10427o oVar = (C10427o) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (oVar == null && (oVar = this.f23668d.get(fragmentManager)) == null) {
            oVar = new C10427o();
            oVar.mo41141f0(fragment);
            if (z) {
                oVar.mo41138V().mo41107d();
            }
            this.f23668d.put(fragmentManager, oVar);
            fragmentManager.beginTransaction().add((Fragment) oVar, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f23669f.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return oVar;
    }

    /* renamed from: k */
    private static boolean m40809k(Activity activity) {
        return !activity.isFinishing();
    }

    @NonNull
    /* renamed from: l */
    private C7278i m40810l(@NonNull Context context, @NonNull androidx.fragment.app.FragmentManager fragmentManager, @Nullable Fragment fragment, boolean z) {
        C10427o j = m40808j(fragmentManager, fragment, z);
        C7278i X = j.mo41139X();
        if (X != null) {
            return X;
        }
        C7278i a = this.f23670g.mo41130a(C7271c.m30011c(context), j.mo41138V(), j.mo41140Z(), context);
        j.mo41142g0(a);
        return a;
    }

    @NonNull
    /* renamed from: c */
    public C7278i mo41124c(@NonNull Activity activity) {
        if (C7316k.m30220o()) {
            return mo41125d(activity.getApplicationContext());
        }
        m40804a(activity);
        return m40805b(activity, activity.getFragmentManager(), (android.app.Fragment) null, m40809k(activity));
    }

    @NonNull
    /* renamed from: d */
    public C7278i mo41125d(@NonNull Context context) {
        if (context != null) {
            if (C7316k.m30221p() && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    return mo41126e((FragmentActivity) context);
                }
                if (context instanceof Activity) {
                    return mo41124c((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    return mo41125d(((ContextWrapper) context).getBaseContext());
                }
            }
            return m40806f(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    @NonNull
    /* renamed from: e */
    public C7278i mo41126e(@NonNull FragmentActivity fragmentActivity) {
        if (C7316k.m30220o()) {
            return mo41125d(fragmentActivity.getApplicationContext());
        }
        m40804a(fragmentActivity);
        return m40810l(fragmentActivity, fragmentActivity.getSupportFragmentManager(), (Fragment) null, m40809k(fragmentActivity));
    }

    /* access modifiers changed from: package-private */
    @NonNull
    @Deprecated
    /* renamed from: g */
    public C10420k mo41127g(Activity activity) {
        return m40807h(activity.getFragmentManager(), (android.app.Fragment) null, m40809k(activity));
    }

    public boolean handleMessage(Message message) {
        Object obj;
        Object obj2;
        Object obj3;
        int i = message.what;
        Object obj4 = null;
        boolean z = true;
        if (i == 1) {
            obj3 = (FragmentManager) message.obj;
            obj2 = this.f23667c.remove(obj3);
        } else if (i != 2) {
            z = false;
            obj = null;
            if (z && obj4 == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
            }
            return z;
        } else {
            obj3 = (androidx.fragment.app.FragmentManager) message.obj;
            obj2 = this.f23668d.remove(obj3);
        }
        Object obj5 = obj3;
        obj4 = obj2;
        obj = obj5;
        Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
        return z;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: i */
    public C10427o mo41129i(FragmentActivity fragmentActivity) {
        return m40808j(fragmentActivity.getSupportFragmentManager(), (Fragment) null, m40809k(fragmentActivity));
    }
}

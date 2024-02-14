package p196y4;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.HashSet;
import java.util.Set;
import p083e4.C7271c;
import p083e4.C7278i;

@Deprecated
/* renamed from: y4.k */
/* compiled from: RequestManagerFragment */
public class C10420k extends Fragment {

    /* renamed from: a */
    private final C10408a f23658a;

    /* renamed from: c */
    private final C10425m f23659c;

    /* renamed from: d */
    private final Set<C10420k> f23660d;
    @Nullable

    /* renamed from: f */
    private C7278i f23661f;
    @Nullable

    /* renamed from: g */
    private C10420k f23662g;
    @Nullable

    /* renamed from: o */
    private Fragment f23663o;

    /* renamed from: y4.k$a */
    /* compiled from: RequestManagerFragment */
    private class C10421a implements C10425m {
        C10421a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + C10420k.this + "}";
        }
    }

    public C10420k() {
        this(new C10408a());
    }

    /* renamed from: a */
    private void m40794a(C10420k kVar) {
        this.f23660d.add(kVar);
    }

    @Nullable
    /* renamed from: c */
    private Fragment m40795c() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f23663o;
    }

    /* renamed from: f */
    private void m40796f(@NonNull Activity activity) {
        m40798j();
        C10420k g = C7271c.m30011c(activity).mo37148k().mo41127g(activity);
        this.f23662g = g;
        if (!equals(g)) {
            this.f23662g.m40794a(this);
        }
    }

    /* renamed from: g */
    private void m40797g(C10420k kVar) {
        this.f23660d.remove(kVar);
    }

    /* renamed from: j */
    private void m40798j() {
        C10420k kVar = this.f23662g;
        if (kVar != null) {
            kVar.m40797g(this);
            this.f23662g = null;
        }
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: b */
    public C10408a mo41112b() {
        return this.f23658a;
    }

    @Nullable
    /* renamed from: d */
    public C7278i mo41113d() {
        return this.f23661f;
    }

    @NonNull
    /* renamed from: e */
    public C10425m mo41114e() {
        return this.f23659c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo41115h(@Nullable Fragment fragment) {
        this.f23663o = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            m40796f(fragment.getActivity());
        }
    }

    /* renamed from: i */
    public void mo41116i(@Nullable C7278i iVar) {
        this.f23661f = iVar;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m40796f(activity);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f23658a.mo41106c();
        m40798j();
    }

    public void onDetach() {
        super.onDetach();
        m40798j();
    }

    public void onStart() {
        super.onStart();
        this.f23658a.mo41107d();
    }

    public void onStop() {
        super.onStop();
        this.f23658a.mo41108e();
    }

    public String toString() {
        return super.toString() + "{parent=" + m40795c() + "}";
    }

    @VisibleForTesting
    C10420k(@NonNull C10408a aVar) {
        this.f23659c = new C10421a();
        this.f23660d = new HashSet();
        this.f23658a = aVar;
    }
}

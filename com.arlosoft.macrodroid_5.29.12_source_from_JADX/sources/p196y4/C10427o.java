package p196y4;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.HashSet;
import java.util.Set;
import p083e4.C7271c;
import p083e4.C7278i;

/* renamed from: y4.o */
/* compiled from: SupportRequestManagerFragment */
public class C10427o extends Fragment {

    /* renamed from: a */
    private final C10408a f23677a;

    /* renamed from: c */
    private final C10425m f23678c;

    /* renamed from: d */
    private final Set<C10427o> f23679d;
    @Nullable

    /* renamed from: f */
    private C10427o f23680f;
    @Nullable

    /* renamed from: g */
    private C7278i f23681g;
    @Nullable

    /* renamed from: o */
    private Fragment f23682o;

    /* renamed from: y4.o$a */
    /* compiled from: SupportRequestManagerFragment */
    private class C10428a implements C10425m {
        C10428a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + C10427o.this + "}";
        }
    }

    public C10427o() {
        this(new C10408a());
    }

    /* renamed from: U */
    private void m40825U(C10427o oVar) {
        this.f23679d.add(oVar);
    }

    @Nullable
    /* renamed from: W */
    private Fragment m40826W() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f23682o;
    }

    /* renamed from: a0 */
    private void m40827a0(@NonNull FragmentActivity fragmentActivity) {
        m40829h0();
        C10427o i = C7271c.m30011c(fragmentActivity).mo37148k().mo41129i(fragmentActivity);
        this.f23680f = i;
        if (!equals(i)) {
            this.f23680f.m40825U(this);
        }
    }

    /* renamed from: e0 */
    private void m40828e0(C10427o oVar) {
        this.f23679d.remove(oVar);
    }

    /* renamed from: h0 */
    private void m40829h0() {
        C10427o oVar = this.f23680f;
        if (oVar != null) {
            oVar.m40828e0(this);
            this.f23680f = null;
        }
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: V */
    public C10408a mo41138V() {
        return this.f23677a;
    }

    @Nullable
    /* renamed from: X */
    public C7278i mo41139X() {
        return this.f23681g;
    }

    @NonNull
    /* renamed from: Z */
    public C10425m mo41140Z() {
        return this.f23678c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void mo41141f0(@Nullable Fragment fragment) {
        this.f23682o = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            m40827a0(fragment.getActivity());
        }
    }

    /* renamed from: g0 */
    public void mo41142g0(@Nullable C7278i iVar) {
        this.f23681g = iVar;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            m40827a0(getActivity());
        } catch (IllegalStateException e) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f23677a.mo41106c();
        m40829h0();
    }

    public void onDetach() {
        super.onDetach();
        this.f23682o = null;
        m40829h0();
    }

    public void onStart() {
        super.onStart();
        this.f23677a.mo41107d();
    }

    public void onStop() {
        super.onStop();
        this.f23677a.mo41108e();
    }

    public String toString() {
        return super.toString() + "{parent=" + m40826W() + "}";
    }

    @VisibleForTesting
    public C10427o(@NonNull C10408a aVar) {
        this.f23678c = new C10428a();
        this.f23679d = new HashSet();
        this.f23677a = aVar;
    }
}

package p259f7;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: f7.f */
/* compiled from: TargetUi */
public class C12246f {

    /* renamed from: a */
    private Object f58755a;

    public C12246f(Object obj) {
        this.f58755a = obj;
    }

    /* renamed from: a */
    public FragmentActivity mo68559a() {
        return mo68560b() != null ? mo68560b().getActivity() : (FragmentActivity) this.f58755a;
    }

    @Nullable
    /* renamed from: b */
    public Fragment mo68560b() {
        Object obj = this.f58755a;
        if (obj instanceof Fragment) {
            return (Fragment) obj;
        }
        return null;
    }

    /* renamed from: c */
    public Context mo68561c() {
        return mo68560b() == null ? mo68559a() : mo68560b().getContext();
    }

    /* renamed from: d */
    public void mo68562d(Object obj) {
        this.f58755a = obj;
    }

    /* renamed from: e */
    public Object mo68563e() {
        return this.f58755a;
    }
}

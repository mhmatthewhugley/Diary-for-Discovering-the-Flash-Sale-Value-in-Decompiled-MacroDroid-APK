package p413v8;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import dagger.android.C11986a;
import p422w8.C16779b;

/* renamed from: v8.a */
/* compiled from: AndroidSupportInjection */
public final class C16725a {
    /* renamed from: a */
    private static C16726b m99291a(Fragment fragment) {
        Fragment fragment2 = fragment;
        do {
            fragment2 = fragment2.getParentFragment();
            if (fragment2 == null) {
                FragmentActivity activity = fragment.getActivity();
                if (activity instanceof C16726b) {
                    return (C16726b) activity;
                }
                if (activity.getApplication() instanceof C16726b) {
                    return (C16726b) activity.getApplication();
                }
                throw new IllegalArgumentException(String.format("No injector was found for %s", new Object[]{fragment.getClass().getCanonicalName()}));
            }
        } while (!(fragment2 instanceof C16726b));
        return (C16726b) fragment2;
    }

    /* renamed from: b */
    public static void m99292b(Fragment fragment) {
        C16779b.m99514b(fragment, "fragment");
        C16726b a = m99291a(fragment);
        if (Log.isLoggable("dagger.android.support", 3)) {
            String.format("An injector for %s was found in %s", new Object[]{fragment.getClass().getCanonicalName(), a.getClass().getCanonicalName()});
        }
        C11986a<Fragment> h0 = a.mo27312h0();
        C16779b.m99515c(h0, "%s.supportFragmentInjector() returned null", a.getClass());
        h0.mo38318a(fragment);
    }
}

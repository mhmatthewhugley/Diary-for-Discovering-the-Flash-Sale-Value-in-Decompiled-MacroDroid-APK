package androidx.fragment.app;

import android.os.Bundle;
import androidx.annotation.IdRes;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\b\u001a-\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\b\u001a;\u0010\n\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\b¨\u0006\u000b"}, mo71668d2 = {"add", "Landroidx/fragment/app/FragmentTransaction;", "F", "Landroidx/fragment/app/Fragment;", "containerViewId", "", "tag", "", "args", "Landroid/os/Bundle;", "replace", "fragment-ktx_release"}, mo71669k = 2, mo71670mv = {1, 5, 1}, mo71672xi = 48)
/* compiled from: FragmentTransaction.kt */
public final class FragmentTransactionKt {
    public static final /* synthetic */ <F extends Fragment> FragmentTransaction add(FragmentTransaction fragmentTransaction, @IdRes int i, String str, Bundle bundle) {
        C13706o.m87929f(fragmentTransaction, "<this>");
        C13706o.m87933j(4, "F");
        FragmentTransaction add = fragmentTransaction.add(i, Fragment.class, bundle, str);
        C13706o.m87928e(add, "add(containerViewId, F::class.java, args, tag)");
        return add;
    }

    public static /* synthetic */ FragmentTransaction add$default(FragmentTransaction fragmentTransaction, int i, String str, Bundle bundle, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            bundle = null;
        }
        C13706o.m87929f(fragmentTransaction, "<this>");
        C13706o.m87933j(4, "F");
        FragmentTransaction add = fragmentTransaction.add(i, Fragment.class, bundle, str);
        C13706o.m87928e(add, "add(containerViewId, F::class.java, args, tag)");
        return add;
    }

    public static final /* synthetic */ <F extends Fragment> FragmentTransaction replace(FragmentTransaction fragmentTransaction, @IdRes int i, String str, Bundle bundle) {
        C13706o.m87929f(fragmentTransaction, "<this>");
        C13706o.m87933j(4, "F");
        FragmentTransaction replace = fragmentTransaction.replace(i, Fragment.class, bundle, str);
        C13706o.m87928e(replace, "replace(containerViewId, F::class.java, args, tag)");
        return replace;
    }

    public static /* synthetic */ FragmentTransaction replace$default(FragmentTransaction fragmentTransaction, int i, String str, Bundle bundle, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            bundle = null;
        }
        C13706o.m87929f(fragmentTransaction, "<this>");
        C13706o.m87933j(4, "F");
        FragmentTransaction replace = fragmentTransaction.replace(i, Fragment.class, bundle, str);
        C13706o.m87928e(replace, "replace(containerViewId, F::class.java, args, tag)");
        return replace;
    }

    public static final /* synthetic */ <F extends Fragment> FragmentTransaction add(FragmentTransaction fragmentTransaction, String str, Bundle bundle) {
        C13706o.m87929f(fragmentTransaction, "<this>");
        C13706o.m87929f(str, "tag");
        C13706o.m87933j(4, "F");
        FragmentTransaction add = fragmentTransaction.add((Class<? extends Fragment>) Fragment.class, bundle, str);
        C13706o.m87928e(add, "add(F::class.java, args, tag)");
        return add;
    }

    public static /* synthetic */ FragmentTransaction add$default(FragmentTransaction fragmentTransaction, String str, Bundle bundle, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        C13706o.m87929f(fragmentTransaction, "<this>");
        C13706o.m87929f(str, "tag");
        C13706o.m87933j(4, "F");
        FragmentTransaction add = fragmentTransaction.add((Class<? extends Fragment>) Fragment.class, bundle, str);
        C13706o.m87928e(add, "add(F::class.java, args, tag)");
        return add;
    }
}

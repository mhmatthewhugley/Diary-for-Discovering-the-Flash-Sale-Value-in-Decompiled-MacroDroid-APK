package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.ApplicationInstalledRemovedTrigger;
import com.arlosoft.macrodroid.triggers.C5889c8;

/* renamed from: k3.d */
/* compiled from: ApplicationInstalledRemovedTriggerInfo */
public class C7487d extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18345g;

    /* renamed from: u */
    public static C4001c1 m31122u() {
        if (f18345g == null) {
            f18345g = new C7487d();
        }
        return f18345g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ApplicationInstalledRemovedTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_application_installed_removed_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_package_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_application_installed_removed;
    }
}

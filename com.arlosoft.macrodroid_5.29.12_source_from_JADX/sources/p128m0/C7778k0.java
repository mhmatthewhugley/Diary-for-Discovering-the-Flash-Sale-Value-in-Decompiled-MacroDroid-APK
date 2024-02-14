package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.DisableAppAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.k0 */
/* compiled from: DisableAppActionInfo */
public class C7778k0 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18786g;

    /* renamed from: u */
    public static C4001c1 m32472u() {
        if (f18786g == null) {
            f18786g = new C7778k0();
        }
        return f18786g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new DisableAppAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_disable_app_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_apps_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_disable_app;
    }

    /* renamed from: l */
    public int mo27894l() {
        return 1;
    }
}

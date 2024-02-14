package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.DisableMacroAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.n0 */
/* compiled from: DisableMacroActionInfo */
public class C7799n0 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18818g;

    /* renamed from: u */
    public static C4001c1 m32579u() {
        if (f18818g == null) {
            f18818g = new C7799n0();
        }
        return f18818g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new DisableMacroAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_disable_macro_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_offline_pin_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_disable_macro;
    }
}

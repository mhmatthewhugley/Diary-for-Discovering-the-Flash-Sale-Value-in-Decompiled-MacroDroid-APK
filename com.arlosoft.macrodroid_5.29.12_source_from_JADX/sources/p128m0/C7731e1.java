package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.ForceLocationUpdateAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.e1 */
/* compiled from: ForceLocationUpdateActionInfo */
public class C7731e1 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18710g;

    /* renamed from: u */
    public static C4001c1 m32246u() {
        if (f18710g == null) {
            f18710g = new C7731e1();
        }
        return f18710g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ForceLocationUpdateAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_force_location_update_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_map_marker_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_force_location_update;
    }
}

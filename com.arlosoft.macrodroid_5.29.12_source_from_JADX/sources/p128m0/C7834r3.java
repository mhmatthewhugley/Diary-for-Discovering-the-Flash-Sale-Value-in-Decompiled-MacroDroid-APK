package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.SetLocationUpdateRateAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.r3 */
/* compiled from: SetLocationUpdateRateActionInfo */
public class C7834r3 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18880g;

    /* renamed from: u */
    public static C4001c1 m32749u() {
        if (f18880g == null) {
            f18880g = new C7834r3();
        }
        return f18880g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new SetLocationUpdateRateAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_set_location_update_rate_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_map_marker_multiple_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_set_location_update_rate;
    }
}

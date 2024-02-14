package p123l1;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.constraint.WifiHotSpotConstraint;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: l1.i1 */
/* compiled from: WifiHotSpotConstraintInfo */
public class C7620i1 extends C4227b0 {

    /* renamed from: g */
    private static C4001c1 f18527g;

    /* renamed from: u */
    public static C4001c1 m31737u() {
        if (f18527g == null) {
            f18527g = new C7620i1();
        }
        return f18527g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new WifiHotSpotConstraint(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_wifi_hotspot_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_wifi_tethering_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_wifi_hotspot;
    }
}

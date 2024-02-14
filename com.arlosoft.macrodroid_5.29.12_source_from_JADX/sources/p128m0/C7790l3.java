package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.SetGPSAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.l3 */
/* compiled from: SetGPSActionInfo */
public class C7790l3 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18809g;

    /* renamed from: u */
    public static C4001c1 m32529u() {
        if (f18809g == null) {
            f18809g = new C7790l3();
        }
        return f18809g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new SetGPSAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_set_gps_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_crosshairs_gps_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_set_gps;
    }

    /* renamed from: l */
    public int mo27894l() {
        return 1;
    }
}

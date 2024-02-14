package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.ProximityTrigger;

/* renamed from: k3.k1 */
/* compiled from: ProximityTriggerInfo */
public class C7524k1 extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18403g;

    /* renamed from: u */
    public static C4001c1 m31299u() {
        if (f18403g == null) {
            f18403g = new C7524k1();
        }
        return f18403g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ProximityTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_proximity_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_phonelink_ring_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_proximity;
    }
}

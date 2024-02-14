package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.PowerButtonToggleTrigger;

/* renamed from: k3.i1 */
/* compiled from: PowerButtonToggleTriggerInfo */
public class C7513i1 extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18382g;

    /* renamed from: u */
    public static C4001c1 m31251u() {
        if (f18382g == null) {
            f18382g = new C7513i1();
        }
        return f18382g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new PowerButtonToggleTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_power_button_toggle_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_power_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_power_button_toggle;
    }
}

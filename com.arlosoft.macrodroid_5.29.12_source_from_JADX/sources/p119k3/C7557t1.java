package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.SignalOnOffTrigger;

/* renamed from: k3.t1 */
/* compiled from: SignalOnOffTriggerInfo */
public class C7557t1 extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18451g;

    /* renamed from: u */
    public static C4001c1 m31456u() {
        if (f18451g == null) {
            f18451g = new C7557t1();
        }
        return f18451g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new SignalOnOffTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_signal_on_off_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_network_cell_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_signal_on_off;
    }
}

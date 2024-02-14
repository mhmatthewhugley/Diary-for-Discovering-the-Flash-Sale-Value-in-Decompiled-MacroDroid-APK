package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.WifiConnectionTrigger;

/* renamed from: k3.j2 */
/* compiled from: WifiConnectionTriggerInfo */
public class C7520j2 extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18395g;

    /* renamed from: u */
    public static C4001c1 m31280u() {
        if (f18395g == null) {
            f18395g = new C7520j2();
        }
        return f18395g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new WifiConnectionTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_wifi_connection_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_settings_input_antenna_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_wifi_connection;
    }
}

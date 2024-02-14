package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.BatterySaverTrigger;
import com.arlosoft.macrodroid.triggers.C5889c8;

/* renamed from: k3.i */
/* compiled from: BatterySaverTriggerInfo */
public class C7511i extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18380g;

    /* renamed from: u */
    public static C4001c1 m31239u() {
        if (f18380g == null) {
            f18380g = new C7511i();
        }
        return f18380g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new BatterySaverTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_battery_saver_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_battery_plus_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_battery_saver;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 21;
    }
}

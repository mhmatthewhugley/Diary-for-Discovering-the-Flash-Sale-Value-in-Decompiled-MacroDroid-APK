package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.BatteryLevelTrigger;
import com.arlosoft.macrodroid.triggers.C5889c8;

/* renamed from: k3.h */
/* compiled from: BatteryLevelTriggerInfo */
public class C7506h extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18372g;

    /* renamed from: u */
    public static C4001c1 m31216u() {
        if (f18372g == null) {
            f18372g = new C7506h();
        }
        return f18372g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new BatteryLevelTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_battery_level_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_battery_60_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_battery_level;
    }
}

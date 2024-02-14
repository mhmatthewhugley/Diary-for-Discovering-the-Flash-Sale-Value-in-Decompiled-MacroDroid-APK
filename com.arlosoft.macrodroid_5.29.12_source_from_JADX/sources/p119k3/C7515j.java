package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.BatteryTemperatureTrigger;
import com.arlosoft.macrodroid.triggers.C5889c8;

/* renamed from: k3.j */
/* compiled from: BatteryTemperatureTriggerInfo */
public class C7515j extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18384g;

    /* renamed from: u */
    public static C4001c1 m31261u() {
        if (f18384g == null) {
            f18384g = new C7515j();
        }
        return f18384g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new BatteryTemperatureTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_battery_temp_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.temperature_celsius;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_battery_temp;
    }
}

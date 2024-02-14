package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: com.arlosoft.macrodroid.constraint.h */
/* compiled from: BatteryTemperatureConstraintInfo */
public class C4261h extends C4227b0 {

    /* renamed from: g */
    private static C4001c1 f10857g;

    /* renamed from: u */
    public static C4001c1 m17265u() {
        if (f10857g == null) {
            f10857g = new C4261h();
        }
        return f10857g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new BatteryTemperatureConstraint(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_battery_temp_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.temperature_celsius;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_battery_temp;
    }
}

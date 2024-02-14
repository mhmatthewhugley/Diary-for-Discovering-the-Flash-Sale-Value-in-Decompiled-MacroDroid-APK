package p123l1;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.BatterySaverStateConstraint;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: l1.f */
/* compiled from: BatterySaverStateConstraintInfo */
public class C7608f extends C4227b0 {

    /* renamed from: g */
    private static C4001c1 f18515g;

    /* renamed from: u */
    public static C4001c1 m31675u() {
        if (f18515g == null) {
            f18515g = new C7608f();
        }
        return f18515g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new BatterySaverStateConstraint(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_battery_saver_state_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_battery_unknown_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_battery_saver_state;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 21;
    }
}

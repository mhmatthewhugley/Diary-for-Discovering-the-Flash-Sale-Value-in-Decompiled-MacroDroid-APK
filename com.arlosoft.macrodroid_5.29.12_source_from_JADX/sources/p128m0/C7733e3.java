package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.SetAlarmClockAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.e3 */
/* compiled from: SetAlarmClockActionInfo */
public class C7733e3 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18712g;

    /* renamed from: u */
    public static C4001c1 m32256u() {
        if (f18712g == null) {
            f18712g = new C7733e3();
        }
        return f18712g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new SetAlarmClockAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_alarm_clock_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_alarm_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_alarm_clock;
    }
}

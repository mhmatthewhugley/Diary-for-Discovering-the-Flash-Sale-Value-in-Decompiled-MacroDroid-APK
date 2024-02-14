package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.TimerTrigger;

/* renamed from: k3.a2 */
/* compiled from: TimerTriggerInfo */
public class C7476a2 extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18328g;

    /* renamed from: u */
    public static C4001c1 m31072u() {
        if (f18328g == null) {
            f18328g = new C7476a2();
        }
        return f18328g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new TimerTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_timer_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_clock_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_timer;
    }
}

package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.StopwatchTrigger;

/* renamed from: k3.x1 */
/* compiled from: StopwatchTriggerInfo */
public class C7573x1 extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18481g;

    /* renamed from: u */
    public static C4001c1 m31528u() {
        if (f18481g == null) {
            f18481g = new C7573x1();
        }
        return f18481g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new StopwatchTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_stopwatch_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_timer_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_stop_watch;
    }
}

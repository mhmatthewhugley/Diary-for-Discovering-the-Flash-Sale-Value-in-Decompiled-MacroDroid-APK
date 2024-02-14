package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.StopWatchAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.l4 */
/* compiled from: StopWatchActionInfo */
public class C7791l4 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18810g;

    /* renamed from: u */
    public static C4001c1 m32535u() {
        if (f18810g == null) {
            f18810g = new C7791l4();
        }
        return f18810g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new StopWatchAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_stop_watch_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_timer_sand_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_stop_watch;
    }
}

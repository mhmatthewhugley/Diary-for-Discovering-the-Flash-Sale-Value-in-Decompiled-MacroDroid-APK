package p123l1;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.constraint.StopWatchConstraint;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: l1.x0 */
/* compiled from: StopWatchConstraintInfo */
public class C7654x0 extends C4227b0 {

    /* renamed from: g */
    private static C4001c1 f18561g;

    /* renamed from: u */
    public static C4001c1 m31899u() {
        if (f18561g == null) {
            f18561g = new C7654x0();
        }
        return f18561g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new StopWatchConstraint(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.contraint_stop_watch_help;
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

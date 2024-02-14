package p123l1;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.constraint.TimeSinceBootConstraint;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: l1.b1 */
/* compiled from: TimeSinceBootConstraintInfo */
public class C7597b1 extends C4227b0 {

    /* renamed from: g */
    private static C4001c1 f18504g;

    /* renamed from: u */
    public static C4001c1 m31622u() {
        if (f18504g == null) {
            f18504g = new C7597b1();
        }
        return f18504g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new TimeSinceBootConstraint(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_time_since_boot_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_timer_sand_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_time_since_boot;
    }
}

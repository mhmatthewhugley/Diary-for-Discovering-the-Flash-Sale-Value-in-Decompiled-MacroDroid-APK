package p123l1;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.constraint.TimeOfDayConstraint;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: l1.a1 */
/* compiled from: TimeOfDayConstraintInfo */
public class C7594a1 extends C4227b0 {

    /* renamed from: g */
    private static C4001c1 f18501g;

    /* renamed from: u */
    public static C4001c1 m31607u() {
        if (f18501g == null) {
            f18501g = new C7594a1();
        }
        return f18501g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new TimeOfDayConstraint(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_time_of_day_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_clock_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_time_of_day;
    }
}

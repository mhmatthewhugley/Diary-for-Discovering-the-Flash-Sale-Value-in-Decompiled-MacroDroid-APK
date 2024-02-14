package p123l1;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.constraint.MonthOfYearConstraint;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: l1.k0 */
/* compiled from: MonthOfYearConstraintInfo */
public class C7625k0 extends C4227b0 {

    /* renamed from: g */
    private static C4001c1 f18532g;

    /* renamed from: u */
    public static C4001c1 m31759u() {
        if (f18532g == null) {
            f18532g = new C7625k0();
        }
        return f18532g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new MonthOfYearConstraint(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_month_of_year_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_calendar_check_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_month_of_year;
    }
}

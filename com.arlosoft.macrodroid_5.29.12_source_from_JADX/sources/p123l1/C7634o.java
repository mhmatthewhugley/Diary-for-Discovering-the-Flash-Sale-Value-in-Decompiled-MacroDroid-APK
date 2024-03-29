package p123l1;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.constraint.DayOfMonthConstraint;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: l1.o */
/* compiled from: DayOfMonthConstraintInfo */
public class C7634o extends C4227b0 {

    /* renamed from: g */
    private static C4001c1 f18541g;

    /* renamed from: u */
    public static C4001c1 m31800u() {
        if (f18541g == null) {
            f18541g = new C7634o();
        }
        return f18541g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new DayOfMonthConstraint(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_day_of_month_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_calendar_multiple_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_day_of_month;
    }
}

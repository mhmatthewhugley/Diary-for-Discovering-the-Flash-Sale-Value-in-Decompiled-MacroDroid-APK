package p123l1;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.constraint.NotificationPresentConstraint;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: l1.n0 */
/* compiled from: NotificationPresentConstraintInfo */
public class C7633n0 extends C4227b0 {

    /* renamed from: g */
    private static C4001c1 f18540g;

    /* renamed from: u */
    public static C4001c1 m31794u() {
        if (f18540g == null) {
            f18540g = new C7633n0();
        }
        return f18540g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new NotificationPresentConstraint(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_notification_present_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_report_problem_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_notification_present;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 18;
    }
}

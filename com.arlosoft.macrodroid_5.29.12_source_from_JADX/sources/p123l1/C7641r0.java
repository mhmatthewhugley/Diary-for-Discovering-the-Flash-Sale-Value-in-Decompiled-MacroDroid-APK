package p123l1;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.constraint.PriorityModeConstraint;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: l1.r0 */
/* compiled from: PriorityModeConstraintInfo */
public class C7641r0 extends C4227b0 {

    /* renamed from: g */
    private static C4001c1 f18548g;

    /* renamed from: u */
    public static C4001c1 m31836u() {
        if (f18548g == null) {
            f18548g = new C7641r0();
        }
        return f18548g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new PriorityModeConstraint(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_priority_mode_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_bell_off_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_priority_mode;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 21;
    }
}

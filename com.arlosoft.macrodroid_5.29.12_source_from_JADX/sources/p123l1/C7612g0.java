package p123l1;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.constraint.LogicConstraint;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: l1.g0 */
/* compiled from: LogicConstraintInfo */
public class C7612g0 extends C4227b0 {

    /* renamed from: g */
    private static C4001c1 f18519g;

    /* renamed from: u */
    public static C4001c1 m31699u() {
        if (f18519g == null) {
            f18519g = new C7612g0();
        }
        return f18519g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new LogicConstraint(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_logic_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_source_fork_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_logic;
    }
}

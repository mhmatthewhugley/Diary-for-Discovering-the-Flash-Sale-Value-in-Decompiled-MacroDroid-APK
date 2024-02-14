package p123l1;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.constraint.MacroDroidVariableConstraint;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: l1.h0 */
/* compiled from: MacroDroidVariableConstraintInfo */
public class C7616h0 extends C4227b0 {

    /* renamed from: g */
    private static C4001c1 f18523g;

    /* renamed from: u */
    public static C4001c1 m31717u() {
        if (f18523g == null) {
            f18523g = new C7616h0();
        }
        return f18523g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new MacroDroidVariableConstraint(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_macrodroid_variable_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_help_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_macrodroid_variable;
    }
}

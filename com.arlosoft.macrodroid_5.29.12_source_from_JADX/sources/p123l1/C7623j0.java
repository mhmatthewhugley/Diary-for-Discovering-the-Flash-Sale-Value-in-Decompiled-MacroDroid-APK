package p123l1;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.constraint.ModeConstraint;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: l1.j0 */
/* compiled from: ModeConstraintInfo */
public class C7623j0 extends C4227b0 {

    /* renamed from: g */
    private static C4001c1 f18530g;

    /* renamed from: u */
    public static C4001c1 m31749u() {
        if (f18530g == null) {
            f18530g = new C7623j0();
        }
        return f18530g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ModeConstraint(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_mode_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_settings_applications_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_mode;
    }
}

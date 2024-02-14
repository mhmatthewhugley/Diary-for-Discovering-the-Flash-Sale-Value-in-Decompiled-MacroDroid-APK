package p123l1;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.constraint.PhoneRingingConstraint;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: l1.q0 */
/* compiled from: PhoneRingingConstraintInfo */
public class C7639q0 extends C4227b0 {

    /* renamed from: g */
    private static C4001c1 f18546g;

    /* renamed from: u */
    public static C4001c1 m31826u() {
        if (f18546g == null) {
            f18546g = new C7639q0();
        }
        return f18546g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new PhoneRingingConstraint(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_phone_ringing_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_bell_ring_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_phone_ringing;
    }
}

package p123l1;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.constraint.NFCStateConstraint;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: l1.m0 */
/* compiled from: NFCStateConstraintInfo */
public class C7631m0 extends C4227b0 {

    /* renamed from: g */
    private static C4001c1 f18538g;

    /* renamed from: u */
    public static C4001c1 m31784u() {
        if (f18538g == null) {
            f18538g = new C7631m0();
        }
        return f18538g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new NFCStateConstraint(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_nfc_state_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.not_icon_nfc;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_nfc_state;
    }
}

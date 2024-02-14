package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.ConfirmNextAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.z */
/* compiled from: ConfirmNextActionInfo */
public class C7887z extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18960g;

    /* renamed from: u */
    public static C4001c1 m33003u() {
        if (f18960g == null) {
            f18960g = new C7887z();
        }
        return f18960g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ConfirmNextAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_confirm_next_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_help_circle_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_confirm_next;
    }
}

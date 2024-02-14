package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.OptionDialogAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.m2 */
/* compiled from: OptionDialogActionInfo */
public class C7795m2 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18814g;

    /* renamed from: u */
    public static C4001c1 m32558u() {
        if (f18814g == null) {
            f18814g = new C7795m2();
        }
        return f18814g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new OptionDialogAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_option_dialog_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_help_circle_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_option_dialog;
    }
}

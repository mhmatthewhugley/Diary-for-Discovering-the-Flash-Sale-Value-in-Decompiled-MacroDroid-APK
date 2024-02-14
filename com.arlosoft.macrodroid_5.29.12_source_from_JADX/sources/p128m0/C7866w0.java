package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.ExpandCollapseStatusBarAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.w0 */
/* compiled from: ExpandCollapseStatusBarActionInfo */
public class C7866w0 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18927g;

    /* renamed from: u */
    public static C4001c1 m32903u() {
        if (f18927g == null) {
            f18927g = new C7866w0();
        }
        return f18927g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ExpandCollapseStatusBarAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_expand_collapse_status_bar_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_swap_vertical_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_expand_collapse_status_bar;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 17;
    }
}

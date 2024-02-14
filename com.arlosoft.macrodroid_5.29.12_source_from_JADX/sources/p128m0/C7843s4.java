package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.TouchScreenAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.s4 */
/* compiled from: TouchScreenActionInfo */
public class C7843s4 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18895g;

    /* renamed from: u */
    public static C4001c1 m32788u() {
        if (f18895g == null) {
            f18895g = new C7843s4();
        }
        return f18895g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new TouchScreenAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_touch_screen_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_hand_pointing_right_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_touch_screen;
    }

    /* renamed from: l */
    public int mo27894l() {
        return 1;
    }

    /* renamed from: o */
    public boolean mo27897o() {
        return true;
    }
}

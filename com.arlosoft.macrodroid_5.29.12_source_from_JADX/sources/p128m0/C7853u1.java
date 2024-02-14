package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.LaunchAndPressAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.u1 */
/* compiled from: LaunchAndPressActionInfo */
public class C7853u1 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18908g;

    /* renamed from: u */
    public static C4001c1 m32839u() {
        if (f18908g == null) {
            f18908g = new C7853u1();
        }
        return f18908g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new LaunchAndPressAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_launch_and_press_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_cursor_pointer_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_launch_and_press;
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

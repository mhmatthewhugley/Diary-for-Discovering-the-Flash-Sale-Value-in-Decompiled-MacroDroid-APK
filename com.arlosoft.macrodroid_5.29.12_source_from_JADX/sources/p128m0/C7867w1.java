package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.LaunchShortcutAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.w1 */
/* compiled from: LaunchShortcutActionInfo */
public class C7867w1 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18928g;

    /* renamed from: u */
    public static C4001c1 m32909u() {
        if (f18928g == null) {
            f18928g = new C7867w1();
        }
        return f18928g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new LaunchShortcutAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_launch_shortcut_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_share_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_launch_shortcut;
    }
}

package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.SetScreenTimeoutAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.a4 */
/* compiled from: SetScreenTimeoutActionInfo */
public class C7697a4 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18647g;

    /* renamed from: u */
    public static C4001c1 m32097u() {
        if (f18647g == null) {
            f18647g = new C7697a4();
        }
        return f18647g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new SetScreenTimeoutAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_set_screen_timeout_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.not_icon_displaybright;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_set_screen_timeout;
    }
}

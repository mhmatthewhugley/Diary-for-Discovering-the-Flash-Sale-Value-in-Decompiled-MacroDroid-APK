package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.PressBackAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.q2 */
/* compiled from: PressBackActionInfo */
public class C7824q2 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18861g;

    /* renamed from: u */
    public static C4001c1 m32703u() {
        if (f18861g == null) {
            f18861g = new C7824q2();
        }
        return f18861g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new PressBackAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_press_back_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_keyboard_backspace_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_press_back;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 17;
    }
}

package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.SetPriorityMode;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.x3 */
/* compiled from: SetPriorityModeInfo */
public class C7877x3 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18944g;

    /* renamed from: u */
    public static C4001c1 m32956u() {
        if (f18944g == null) {
            f18944g = new C7877x3();
        }
        return f18944g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new SetPriorityMode(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_set_priority_mode_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_bell_off_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_set_priority_mode;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 21;
    }
}

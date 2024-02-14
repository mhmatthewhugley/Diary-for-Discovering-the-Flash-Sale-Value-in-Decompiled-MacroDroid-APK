package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.SetQuickSettingsStateAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.y3 */
/* compiled from: SetQuickSettingsStateActionInfo */
public class C7884y3 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18954g;

    /* renamed from: u */
    public static C4001c1 m32989u() {
        if (f18954g == null) {
            f18954g = new C7884y3();
        }
        return f18954g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new SetQuickSettingsStateAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_set_quick_settings_state_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_settings_applications_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_set_quick_settings_state;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 24;
    }
}

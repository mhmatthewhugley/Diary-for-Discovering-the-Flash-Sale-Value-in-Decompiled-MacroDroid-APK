package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.ModeEnterExitTrigger;

/* renamed from: k3.z0 */
/* compiled from: ModeEnterExitTriggerInfo */
public class C7578z0 extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18486g;

    /* renamed from: u */
    public static C4001c1 m31555u() {
        if (f18486g == null) {
            f18486g = new C7578z0();
        }
        return f18486g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ModeEnterExitTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_mode_enter_exit_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_settings_applications_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_mode_enter_exit;
    }
}

package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.SecureSettingsAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.z2 */
/* compiled from: SecureSettingsActionInfo */
public class C7890z2 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18963g;

    /* renamed from: u */
    public static C4001c1 m33021u() {
        if (f18963g == null) {
            f18963g = new C7890z2();
        }
        return f18963g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new SecureSettingsAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_secure_settings_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_shield_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_secure_settings;
    }
}

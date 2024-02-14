package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.ForceScreenRotationAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.g1 */
/* compiled from: ForceScreenRotationActionInfo */
public class C7747g1 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18732g;

    /* renamed from: u */
    public static C4001c1 m32324u() {
        if (f18732g == null) {
            f18732g = new C7747g1();
        }
        return f18732g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ForceScreenRotationAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_force_screen_rotation_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_screen_rotation_lock_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_force_screen_rotation;
    }
}

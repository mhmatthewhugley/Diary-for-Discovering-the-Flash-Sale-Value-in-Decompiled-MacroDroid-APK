package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.FailedLoginTrigger;

/* renamed from: k3.d0 */
/* compiled from: FailedLoginTriggerInfo */
public class C7488d0 extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18346g;

    /* renamed from: u */
    public static C4001c1 m31127u() {
        if (f18346g == null) {
            f18346g = new C7488d0();
        }
        return f18346g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new FailedLoginTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_failed_login_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_do_not_disturb_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_failed_login;
    }
}

package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.ForwardSMSAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.h1 */
/* compiled from: ForwardSMSActionInfo */
public class C7755h1 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18743g;

    /* renamed from: u */
    public static C4001c1 m32363u() {
        if (f18743g == null) {
            f18743g = new C7755h1();
        }
        return f18743g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ForwardSMSAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_forwards_sms_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_forward_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_forwards_sms;
    }
}

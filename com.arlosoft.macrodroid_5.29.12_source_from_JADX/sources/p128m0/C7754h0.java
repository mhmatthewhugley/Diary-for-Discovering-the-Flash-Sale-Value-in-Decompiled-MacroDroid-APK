package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.DeleteSMSAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.h0 */
/* compiled from: DeleteSMSActionInfo */
public class C7754h0 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18742g;

    /* renamed from: u */
    public static C4001c1 m32357u() {
        if (f18742g == null) {
            f18742g = new C7754h0();
        }
        return f18742g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new DeleteSMSAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.not_available_policy_restrictions;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_delete_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_delete_sms;
    }

    /* renamed from: r */
    public int mo27900r() {
        return 18;
    }
}

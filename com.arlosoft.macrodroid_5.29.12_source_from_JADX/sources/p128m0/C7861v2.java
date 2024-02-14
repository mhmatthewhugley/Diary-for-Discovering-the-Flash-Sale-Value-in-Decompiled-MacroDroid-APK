package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.RejectCallAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.v2 */
/* compiled from: RejectCallActionInfo */
public class C7861v2 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18919g;

    /* renamed from: u */
    public static C4001c1 m32880u() {
        if (f18919g == null) {
            f18919g = new C7861v2();
        }
        return f18919g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new RejectCallAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_reject_call_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_phone_hangup_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_reject_call;
    }
}

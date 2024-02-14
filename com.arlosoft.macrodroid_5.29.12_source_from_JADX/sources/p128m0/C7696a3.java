package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.SendEmailAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.a3 */
/* compiled from: SendEmailActionInfo */
public class C7696a3 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18646g;

    /* renamed from: u */
    public static C4001c1 m32092u() {
        if (f18646g == null) {
            f18646g = new C7696a3();
        }
        return f18646g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new SendEmailAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_send_email_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_email_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_send_email;
    }
}

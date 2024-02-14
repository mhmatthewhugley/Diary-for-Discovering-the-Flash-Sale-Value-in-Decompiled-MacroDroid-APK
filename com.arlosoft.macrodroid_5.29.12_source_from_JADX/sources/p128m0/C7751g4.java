package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.ShareLocationAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.g4 */
/* compiled from: ShareLocationActionInfo */
public class C7751g4 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18739g;

    /* renamed from: u */
    public static C4001c1 m32342u() {
        if (f18739g == null) {
            f18739g = new C7751g4();
        }
        return f18739g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ShareLocationAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_share_location_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_account_location_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_share_location;
    }
}

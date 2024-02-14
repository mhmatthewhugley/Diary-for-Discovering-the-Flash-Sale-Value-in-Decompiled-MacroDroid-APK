package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.OpenCallLogAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.h2 */
/* compiled from: OpenCallLogActionInfo */
public class C7756h2 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18744g;

    /* renamed from: u */
    public static C4001c1 m32368u() {
        if (f18744g == null) {
            f18744g = new C7756h2();
        }
        return f18744g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new OpenCallLogAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_open_call_log_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_folder_shared_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_open_call_log;
    }
}

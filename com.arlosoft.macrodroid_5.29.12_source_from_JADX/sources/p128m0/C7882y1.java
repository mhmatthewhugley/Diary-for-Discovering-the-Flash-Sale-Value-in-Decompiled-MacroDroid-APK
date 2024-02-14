package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.LogAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.y1 */
/* compiled from: LogActionInfo */
public class C7882y1 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18952g;

    /* renamed from: u */
    public static C4001c1 m32978u() {
        if (f18952g == null) {
            f18952g = new C7882y1();
        }
        return f18952g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new LogAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_log_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_format_list_numbered_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_log;
    }
}

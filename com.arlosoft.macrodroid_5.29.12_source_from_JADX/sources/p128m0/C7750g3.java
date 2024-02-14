package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.SetAutoSyncAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.g3 */
/* compiled from: SetAutoSyncActionInfo */
public class C7750g3 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18738g;

    /* renamed from: u */
    public static C4001c1 m32337u() {
        if (f18738g == null) {
            f18738g = new C7750g3();
        }
        return f18738g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new SetAutoSyncAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_set_autosync_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_sync_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_set_autosync;
    }
}

package p123l1;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.AutoSyncConstraint;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: l1.d */
/* compiled from: AutoSyncConstraintInfo */
public class C7602d extends C4227b0 {

    /* renamed from: g */
    private static C4001c1 f18509g;

    /* renamed from: u */
    public static C4001c1 m31645u() {
        if (f18509g == null) {
            f18509g = new C7602d();
        }
        return f18509g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new AutoSyncConstraint(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_autosync_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_sync_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_autosync;
    }
}

package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.RecentAppsTrigger;

/* renamed from: k3.m1 */
/* compiled from: RecentAppsTriggerInfo */
public class C7532m1 extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18414g;

    /* renamed from: u */
    public static C4001c1 m31339u() {
        if (f18414g == null) {
            f18414g = new C7532m1();
        }
        return f18414g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new RecentAppsTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_recent_apps_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_launch_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_recent_apps;
    }

    /* renamed from: r */
    public int mo27900r() {
        return 27;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 21;
    }
}

package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.RebootAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.t2 */
/* compiled from: RebootActionInfo */
public class C7847t2 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18899g;

    /* renamed from: u */
    public static C4001c1 m32811u() {
        if (f18899g == null) {
            f18899g = new C7847t2();
        }
        return f18899g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new RebootAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_reboot_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_power_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_reboot;
    }

    /* renamed from: l */
    public int mo27894l() {
        return 1;
    }
}

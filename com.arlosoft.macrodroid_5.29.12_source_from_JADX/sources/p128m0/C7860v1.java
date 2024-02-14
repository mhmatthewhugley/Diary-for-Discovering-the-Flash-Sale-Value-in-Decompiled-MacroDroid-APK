package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.LaunchHomeScreenAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.v1 */
/* compiled from: LaunchHomeScreenActionInfo */
public class C7860v1 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18918g;

    /* renamed from: u */
    public static C4001c1 m32875u() {
        if (f18918g == null) {
            f18918g = new C7860v1();
        }
        return f18918g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new LaunchHomeScreenAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_launch_home_screen_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_home_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_launch_home_screen;
    }
}

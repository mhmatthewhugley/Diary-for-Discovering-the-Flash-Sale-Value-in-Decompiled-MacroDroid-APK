package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.MacroDroidDrawerAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.a2 */
/* compiled from: MacroDroidDrawerActionInfo */
public class C7695a2 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18645g;

    /* renamed from: u */
    public static C4001c1 m32087u() {
        if (f18645g == null) {
            f18645g = new C7695a2();
        }
        return f18645g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new MacroDroidDrawerAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_macrodroid_drawer_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_page_layout_sidebar_right_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_macrodroid_drawer;
    }
}

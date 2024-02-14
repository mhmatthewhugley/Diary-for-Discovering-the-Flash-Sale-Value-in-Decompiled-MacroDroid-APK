package p128m0;

import android.app.Activity;
import android.os.Build;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.TakeScreenshotAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.p4 */
/* compiled from: TakeScreenshotActionInfo */
public class C7819p4 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18852g;

    /* renamed from: u */
    public static C4001c1 m32679u() {
        if (f18852g == null) {
            f18852g = new C7819p4();
        }
        return f18852g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new TakeScreenshotAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return Build.VERSION.SDK_INT >= 28 ? C17541R$string.action_take_screenshot_help_android_pie : C17541R$string.action_take_screenshot_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_cellphone_android_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_take_screenshot;
    }

    /* renamed from: q */
    public boolean mo27899q() {
        return Build.VERSION.SDK_INT < 28;
    }
}

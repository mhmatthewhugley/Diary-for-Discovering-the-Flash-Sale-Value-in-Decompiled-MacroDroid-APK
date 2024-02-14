package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.NotificationTrigger;

/* renamed from: k3.e1 */
/* compiled from: NotificationTriggerInfo */
public class C7493e1 extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18351g;

    /* renamed from: u */
    public static C4001c1 m31154u() {
        if (f18351g == null) {
            f18351g = new C7493e1();
        }
        return f18351g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new NotificationTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_notification_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_report_problem_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_notification;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 16;
    }
}

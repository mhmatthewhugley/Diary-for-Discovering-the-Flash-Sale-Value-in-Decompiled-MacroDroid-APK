package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.DayTrigger;

/* renamed from: k3.w */
/* compiled from: DayTriggerInfo */
public class C7566w extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18468g;

    /* renamed from: u */
    public static C4001c1 m31497u() {
        if (f18468g == null) {
            f18468g = new C7566w();
        }
        return f18468g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new DayTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_day_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_today_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_day;
    }
}

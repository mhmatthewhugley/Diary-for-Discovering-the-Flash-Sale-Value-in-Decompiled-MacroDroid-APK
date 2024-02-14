package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.CarModeAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.n */
/* compiled from: CarModeActionInfo */
public class C7798n extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18817g;

    /* renamed from: u */
    public static C4001c1 m32574u() {
        if (f18817g == null) {
            f18817g = new C7798n();
        }
        return f18817g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new CarModeAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_car_mode_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_directions_car_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_car_mode;
    }
}

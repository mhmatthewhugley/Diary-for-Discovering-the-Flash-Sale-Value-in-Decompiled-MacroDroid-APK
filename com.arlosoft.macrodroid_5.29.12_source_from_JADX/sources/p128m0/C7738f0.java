package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.DayDreamAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.f0 */
/* compiled from: DayDreamActionInfo */
public class C7738f0 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18720g;

    /* renamed from: u */
    public static C4001c1 m32280u() {
        if (f18720g == null) {
            f18720g = new C7738f0();
        }
        return f18720g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new DayDreamAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_daydream_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_weather_night_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_daydream;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 17;
    }
}

package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.BatterySaverAction;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.Collections;
import java.util.List;

/* renamed from: m0.i */
/* compiled from: BatterySaverActionInfo */
public class C7759i extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18747g;

    /* renamed from: u */
    public static C4001c1 m32383u() {
        if (f18747g == null) {
            f18747g = new C7759i();
        }
        return f18747g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new BatterySaverAction(activity, macro);
    }

    /* renamed from: c */
    public List<String> mo27889c() {
        return Collections.singletonList("android.permission.WRITE_SECURE_SETTINGS");
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_battery_saver_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_battery_plus_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_battery_saver;
    }

    /* renamed from: l */
    public int mo27894l() {
        return 1;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 21;
    }
}

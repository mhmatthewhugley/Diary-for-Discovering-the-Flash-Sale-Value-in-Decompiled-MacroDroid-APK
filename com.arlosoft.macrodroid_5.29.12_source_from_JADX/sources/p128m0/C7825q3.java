package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.SetLocationModeAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: m0.q3 */
/* compiled from: SetLocationModeActionInfo */
public class C7825q3 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18862g;

    /* renamed from: u */
    public static C4001c1 m32709u() {
        if (f18862g == null) {
            f18862g = new C7825q3();
        }
        return f18862g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new SetLocationModeAction(activity, macro);
    }

    /* renamed from: c */
    public List<String> mo27889c() {
        return Collections.singletonList("android.permission.WRITE_SECURE_SETTINGS");
    }

    /* renamed from: d */
    public List<Integer> mo27890d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(C17541R$string.action_set_gps));
        return arrayList;
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_set_location_mode_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_edit_location_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_set_location_mode;
    }

    /* renamed from: l */
    public int mo27894l() {
        return 1;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 19;
    }
}

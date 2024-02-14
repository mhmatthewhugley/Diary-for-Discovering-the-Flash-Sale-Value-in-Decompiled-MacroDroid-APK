package p123l1;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.constraint.LocationModeConstraint;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.ArrayList;
import java.util.List;

/* renamed from: l1.f0 */
/* compiled from: LocationModeConstraintInfo */
public class C7609f0 extends C4227b0 {

    /* renamed from: g */
    private static C4001c1 f18516g;

    /* renamed from: u */
    public static C4001c1 m31681u() {
        if (f18516g == null) {
            f18516g = new C7609f0();
        }
        return f18516g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new LocationModeConstraint(activity, macro);
    }

    /* renamed from: d */
    public List<Integer> mo27890d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(C17541R$string.constraint_gps_enabled));
        return arrayList;
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_location_mode_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_edit_location_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_location_mode;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 19;
    }
}

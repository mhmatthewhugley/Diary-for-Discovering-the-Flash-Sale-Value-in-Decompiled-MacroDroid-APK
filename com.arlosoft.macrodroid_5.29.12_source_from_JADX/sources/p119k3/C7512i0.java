package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.GeofenceTrigger;
import java.util.ArrayList;
import java.util.List;

/* renamed from: k3.i0 */
/* compiled from: GeofenceTriggerInfo */
public class C7512i0 extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18381g;

    /* renamed from: u */
    public static C4001c1 m31245u() {
        if (f18381g == null) {
            f18381g = new C7512i0();
        }
        return f18381g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new GeofenceTrigger(activity, macro);
    }

    /* renamed from: d */
    public List<Integer> mo27890d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(C17541R$string.location_lat_lng));
        return arrayList;
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_geofence_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_map_marker_circle_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_geofence;
    }
}

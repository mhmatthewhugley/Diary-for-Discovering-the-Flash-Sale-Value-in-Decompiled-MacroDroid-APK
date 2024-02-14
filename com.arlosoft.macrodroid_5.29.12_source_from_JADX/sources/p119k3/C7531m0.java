package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.HotspotTrigger;

/* renamed from: k3.m0 */
/* compiled from: HotspotTriggerInfo */
public class C7531m0 extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18413g;

    /* renamed from: u */
    public static C4001c1 m31334u() {
        if (f18413g == null) {
            f18413g = new C7531m0();
        }
        return f18413g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new HotspotTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_hotspot_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_wifi_tethering_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_hotspot;
    }
}

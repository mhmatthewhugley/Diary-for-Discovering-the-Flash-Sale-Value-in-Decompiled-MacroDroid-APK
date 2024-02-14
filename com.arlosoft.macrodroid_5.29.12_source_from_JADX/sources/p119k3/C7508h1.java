package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4031k;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.PebbleTrigger;

/* renamed from: k3.h1 */
/* compiled from: PebbleTriggerInfo */
public class C7508h1 extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18374g;

    /* renamed from: u */
    public static C4001c1 m31226u() {
        if (f18374g == null) {
            f18374g = new C7508h1();
        }
        return f18374g;
    }

    /* renamed from: a */
    public boolean mo27887a() {
        return super.mo27887a() && C4031k.m15911k();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new PebbleTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_pebble_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_watch_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_pebble;
    }
}

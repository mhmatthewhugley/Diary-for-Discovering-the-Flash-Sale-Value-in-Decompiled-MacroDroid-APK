package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.FingerprintGestureTrigger;

/* renamed from: k3.e0 */
/* compiled from: FingerprintGestureTriggerInfo */
public class C7492e0 extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18350g;

    /* renamed from: u */
    public static C4001c1 m31147u() {
        if (f18350g == null) {
            f18350g = new C7492e0();
        }
        return f18350g;
    }

    /* renamed from: a */
    public boolean mo27887a() {
        return super.mo27887a() && MacroDroidApplication.m14845u().getPackageManager().hasSystemFeature("android.hardware.fingerprint");
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new FingerprintGestureTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_fingerprint_gesture_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_fingerprint_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_fingerprint_gesture;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 26;
    }
}

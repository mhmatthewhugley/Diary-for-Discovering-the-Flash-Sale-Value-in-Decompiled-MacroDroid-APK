package p119k3;

import android.app.Activity;
import android.hardware.SensorManager;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.LightSensorTrigger;

/* renamed from: k3.r0 */
/* compiled from: LightSensorTriggerInfo */
public class C7549r0 extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18440g;

    /* renamed from: u */
    public static C4001c1 m31417u() {
        if (f18440g == null) {
            f18440g = new C7549r0();
        }
        return f18440g;
    }

    /* renamed from: a */
    public boolean mo27887a() {
        return super.mo27887a() && ((SensorManager) MacroDroidApplication.m14845u().getSystemService("sensor")).getDefaultSensor(5) != null;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new LightSensorTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_light_sensor_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_lightbulb_on_outline_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_light_sensor;
    }
}

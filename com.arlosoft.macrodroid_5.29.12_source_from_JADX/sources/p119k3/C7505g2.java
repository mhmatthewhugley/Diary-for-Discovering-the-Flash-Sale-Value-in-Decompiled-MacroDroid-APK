package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.WeatherTrigger;
import java.util.ArrayList;
import java.util.List;

/* renamed from: k3.g2 */
/* compiled from: WeatherTriggerInfo */
public class C7505g2 extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18371g;

    /* renamed from: u */
    public static C4001c1 m31210u() {
        if (f18371g == null) {
            f18371g = new C7505g2();
        }
        return f18371g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new WeatherTrigger(activity, macro);
    }

    /* renamed from: d */
    public List<Integer> mo27890d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(C17541R$string.trigger_weather_temperature));
        arrayList.add(Integer.valueOf(C17541R$string.trigger_weather_wind_direction));
        arrayList.add(Integer.valueOf(C17541R$string.wind_speed));
        arrayList.add(Integer.valueOf(C17541R$string.humidity));
        return arrayList;
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_weather_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_weather_lightning_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_weather;
    }
}

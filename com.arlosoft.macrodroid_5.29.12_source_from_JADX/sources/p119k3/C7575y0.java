package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.MediaButtonV2Trigger;

/* renamed from: k3.y0 */
/* compiled from: MediaButtonV2TriggerInfo */
public class C7575y0 extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18483g;

    /* renamed from: u */
    public static C4001c1 m31538u() {
        if (f18483g == null) {
            f18483g = new C7575y0();
        }
        return f18483g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new MediaButtonV2Trigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_media_button_v2_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_skip_next_circle;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_media_button_v2;
    }

    /* renamed from: n */
    public boolean mo27896n() {
        return true;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 21;
    }
}

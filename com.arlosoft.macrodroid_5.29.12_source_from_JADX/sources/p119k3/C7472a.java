package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.ActivityRecognitionTrigger;
import com.arlosoft.macrodroid.triggers.C5889c8;

/* renamed from: k3.a */
/* compiled from: ActivityRecognitionTriggerInfo */
public class C7472a extends C5889c8 {

    /* renamed from: g */
    private static C4001c1 f18321g;

    /* renamed from: u */
    public static C4001c1 m31055u() {
        if (f18321g == null) {
            f18321g = new C7472a();
        }
        return f18321g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new ActivityRecognitionTrigger(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.trigger_activity_recognition_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_bike_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.trigger_activity_recognition;
    }
}

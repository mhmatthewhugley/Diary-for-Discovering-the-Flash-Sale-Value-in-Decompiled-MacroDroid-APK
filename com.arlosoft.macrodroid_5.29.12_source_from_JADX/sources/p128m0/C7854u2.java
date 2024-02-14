package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.RecordMicrophoneAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.u2 */
/* compiled from: RecordMicrophoneActionInfo */
public class C7854u2 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18909g;

    /* renamed from: u */
    public static C4001c1 m32846u() {
        if (f18909g == null) {
            f18909g = new C7854u2();
        }
        return f18909g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new RecordMicrophoneAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_record_microphone_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_microphone_variant_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_record_microphone;
    }
}

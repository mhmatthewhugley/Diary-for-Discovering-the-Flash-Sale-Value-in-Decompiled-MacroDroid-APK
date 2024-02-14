package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.VolumeIncrementDecrementAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: m0.d5 */
/* compiled from: VolumeIncrementDecrementActionInfo */
public class C7727d5 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18701g;

    /* renamed from: u */
    public static C4001c1 m32223u() {
        if (f18701g == null) {
            f18701g = new C7727d5();
        }
        return f18701g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new VolumeIncrementDecrementAction(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_volume_increment_decrement_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_clipboard_text_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_volume_increment_decrement;
    }
}

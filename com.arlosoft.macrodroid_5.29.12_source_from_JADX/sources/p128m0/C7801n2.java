package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.PauseAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.ArrayList;
import java.util.List;

/* renamed from: m0.n2 */
/* compiled from: PauseActionInfo */
public class C7801n2 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18820g;

    /* renamed from: u */
    public static C4001c1 m32592u() {
        if (f18820g == null) {
            f18820g = new C7801n2();
        }
        return f18820g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new PauseAction(activity, macro);
    }

    /* renamed from: d */
    public List<Integer> mo27890d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(C17541R$string.media_button_pause));
        arrayList.add(Integer.valueOf(C17541R$string.action_answer_call_delay));
        return arrayList;
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_pause_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_sleep_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_pause;
    }
}

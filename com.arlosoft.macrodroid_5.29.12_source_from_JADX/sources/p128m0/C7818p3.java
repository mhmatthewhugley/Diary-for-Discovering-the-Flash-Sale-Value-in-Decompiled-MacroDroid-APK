package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.SetLanguageAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.Collections;
import java.util.List;

/* renamed from: m0.p3 */
/* compiled from: SetLanguageActionInfo */
public class C7818p3 extends C3072g {

    /* renamed from: g */
    private static C4001c1 f18851g;

    /* renamed from: u */
    public static C4001c1 m32670u() {
        if (f18851g == null) {
            f18851g = new C7818p3();
        }
        return f18851g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new SetLanguageAction(activity, macro);
    }

    /* renamed from: c */
    public List<String> mo27889c() {
        return Collections.singletonList("android.permission.WRITE_SECURE_SETTINGS");
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.action_set_language_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_format_color_text_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.action_set_language;
    }

    /* renamed from: l */
    public int mo27894l() {
        return 1;
    }

    /* renamed from: o */
    public boolean mo27897o() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public int mo27900r() {
        return 25;
    }
}

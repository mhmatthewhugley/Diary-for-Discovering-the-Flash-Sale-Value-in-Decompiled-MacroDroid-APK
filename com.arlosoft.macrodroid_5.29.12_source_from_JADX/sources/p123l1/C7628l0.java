package p123l1;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.C4227b0;
import com.arlosoft.macrodroid.constraint.MusicActiveConstraint;
import com.arlosoft.macrodroid.macro.Macro;

/* renamed from: l1.l0 */
/* compiled from: MusicActiveConstraintInfo */
public class C7628l0 extends C4227b0 {

    /* renamed from: g */
    private static C4001c1 f18535g;

    /* renamed from: u */
    public static C4001c1 m31771u() {
        if (f18535g == null) {
            f18535g = new C7628l0();
        }
        return f18535g;
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new MusicActiveConstraint(activity, macro);
    }

    @StringRes
    /* renamed from: f */
    public int mo27891f() {
        return C17541R$string.constraint_music_active_help;
    }

    /* renamed from: g */
    public int mo27892g() {
        return C17530R$drawable.ic_audiotrack_white_24dp;
    }

    @StringRes
    /* renamed from: k */
    public int mo27893k() {
        return C17541R$string.constraint_music_active;
    }
}

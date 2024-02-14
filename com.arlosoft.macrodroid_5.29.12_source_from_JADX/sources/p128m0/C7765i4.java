package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.action.SilentModeVibrateOffAction;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.i4 */
/* compiled from: SilentModeVibrateOffActionInfo.kt */
public final class C7765i4 extends C3072g {

    /* renamed from: j */
    public static final C7766a f18758j = new C7766a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18759k = new C7765i4();
    @StringRes

    /* renamed from: g */
    private final int f18760g = C17541R$string.action_silent_vibrate_off;

    /* renamed from: h */
    private final int f18761h = C17530R$drawable.ic_volume_off_white_24dp;
    @StringRes

    /* renamed from: i */
    private final int f18762i = C17541R$string.action_silent_vibrate_off_help;

    /* renamed from: m0.i4$a */
    /* compiled from: SilentModeVibrateOffActionInfo.kt */
    public static final class C7766a {
        private C7766a() {
        }

        public /* synthetic */ C7766a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37754a() {
            return C7765i4.f18759k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32420v() {
        return f18758j.mo37754a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new SilentModeVibrateOffAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18762i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18761h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18760g;
    }
}

package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.DarkThemeTrigger;
import kotlin.jvm.internal.C13695i;

/* renamed from: k3.t */
/* compiled from: DarkThemeTriggerInfo.kt */
public final class C7554t extends C5889c8 {

    /* renamed from: j */
    public static final C7555a f18445j = new C7555a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18446k = new C7554t();
    @StringRes

    /* renamed from: g */
    private final int f18447g = C17541R$string.trigger_dark_theme;

    /* renamed from: h */
    private final int f18448h = C17530R$drawable.ic_contrast;
    @StringRes

    /* renamed from: i */
    private final int f18449i = C17541R$string.trigger_dark_theme_help;

    /* renamed from: k3.t$a */
    /* compiled from: DarkThemeTriggerInfo.kt */
    public static final class C7555a {
        private C7555a() {
        }

        public /* synthetic */ C7555a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37650a() {
            return C7554t.f18446k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m31444v() {
        return f18445j.mo37650a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new DarkThemeTrigger(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18449i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18448h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18447g;
    }

    /* renamed from: s */
    public int mo27901s() {
        return 29;
    }
}

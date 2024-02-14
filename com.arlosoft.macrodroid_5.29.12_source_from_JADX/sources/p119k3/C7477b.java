package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.AirplaneModeTrigger;
import com.arlosoft.macrodroid.triggers.C5889c8;
import kotlin.jvm.internal.C13695i;

/* renamed from: k3.b */
/* compiled from: AirplaneModeTriggerInfo.kt */
public final class C7477b extends C5889c8 {

    /* renamed from: j */
    public static final C7478a f18329j = new C7478a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18330k = new C7477b();
    @StringRes

    /* renamed from: g */
    private final int f18331g = C17541R$string.trigger_airplane_mode;

    /* renamed from: h */
    private final int f18332h = C17530R$drawable.ic_airplane_white_24dp;
    @StringRes

    /* renamed from: i */
    private final int f18333i = C17541R$string.trigger_airplane_mode_help;

    /* renamed from: k3.b$a */
    /* compiled from: AirplaneModeTriggerInfo.kt */
    public static final class C7478a {
        private C7478a() {
        }

        public /* synthetic */ C7478a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37637a() {
            return C7477b.f18330k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m31078v() {
        return f18329j.mo37637a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new AirplaneModeTrigger(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18333i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18332h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18331g;
    }
}

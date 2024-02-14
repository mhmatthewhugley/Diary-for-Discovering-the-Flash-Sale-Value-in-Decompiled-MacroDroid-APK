package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.GoogleAssistantTrigger;
import kotlin.jvm.internal.C13695i;

/* renamed from: k3.j0 */
/* compiled from: GoogleAssistantTriggerInfo.kt */
public final class C7516j0 extends C5889c8 {

    /* renamed from: j */
    public static final C7517a f18385j = new C7517a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18386k = new C7516j0();
    @StringRes

    /* renamed from: g */
    private final int f18387g = C17541R$string.trigger_google_assistant;

    /* renamed from: h */
    private final int f18388h = C17530R$drawable.google_assistant;
    @StringRes

    /* renamed from: i */
    private final int f18389i = C17541R$string.trigger_google_assistant_help;

    /* renamed from: k3.j0$a */
    /* compiled from: GoogleAssistantTriggerInfo.kt */
    public static final class C7517a {
        private C7517a() {
        }

        public /* synthetic */ C7517a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37643a() {
            return C7516j0.f18386k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m31267v() {
        return f18385j.mo37643a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new GoogleAssistantTrigger(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18389i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18388h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18387g;
    }
}

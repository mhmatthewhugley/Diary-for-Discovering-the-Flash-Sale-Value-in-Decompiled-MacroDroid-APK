package p119k3;

import android.app.Activity;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.IntentReceivedTrigger;
import kotlin.jvm.internal.C13695i;

/* renamed from: k3.p0 */
/* compiled from: IntentReceivedTriggerInfo.kt */
public final class C7540p0 extends C5889c8 {

    /* renamed from: j */
    public static final C7541a f18422j = new C7541a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C7540p0 f18423k = new C7540p0();

    /* renamed from: g */
    private final int f18424g = C17541R$string.trigger_intent_received;

    /* renamed from: h */
    private final int f18425h = C17530R$drawable.ic_cube_send_white_24dp;

    /* renamed from: i */
    private final int f18426i = C17541R$string.trigger_intent_received_help;

    /* renamed from: k3.p0$a */
    /* compiled from: IntentReceivedTriggerInfo.kt */
    public static final class C7541a {
        private C7541a() {
        }

        public /* synthetic */ C7541a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C7540p0 mo37647a() {
            return C7540p0.f18423k;
        }
    }

    /* renamed from: v */
    public static final C7540p0 m31382v() {
        return f18422j.mo37647a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new IntentReceivedTrigger(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18426i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18425h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18424g;
    }
}

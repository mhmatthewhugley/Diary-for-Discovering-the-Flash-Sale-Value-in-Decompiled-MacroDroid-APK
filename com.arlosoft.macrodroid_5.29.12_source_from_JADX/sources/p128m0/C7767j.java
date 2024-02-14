package p128m0;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.BluetoothTetheringAction;
import com.arlosoft.macrodroid.action.C3072g;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;

/* renamed from: m0.j */
/* compiled from: BluetoothTetheringActionInfo.kt */
public final class C7767j extends C3072g {

    /* renamed from: j */
    public static final C7768a f18763j = new C7768a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18764k = new C7767j();
    @StringRes

    /* renamed from: g */
    private final int f18765g = C17541R$string.action_bluetooth_tethering;

    /* renamed from: h */
    private final int f18766h = C17530R$drawable.ic_bluetooth_transfer;
    @StringRes

    /* renamed from: i */
    private final int f18767i = C17541R$string.action_bluetooth_tethering_help;

    /* renamed from: m0.j$a */
    /* compiled from: BluetoothTetheringActionInfo.kt */
    public static final class C7768a {
        private C7768a() {
        }

        public /* synthetic */ C7768a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37755a() {
            return C7767j.f18764k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m32427v() {
        return f18763j.mo37755a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new BluetoothTetheringAction(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18767i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18766h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18765g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public int mo27900r() {
        return 29;
    }
}

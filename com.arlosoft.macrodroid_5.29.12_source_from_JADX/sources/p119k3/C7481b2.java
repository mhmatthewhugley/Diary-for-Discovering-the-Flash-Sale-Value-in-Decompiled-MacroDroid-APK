package p119k3;

import android.app.Activity;
import androidx.annotation.StringRes;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.C5889c8;
import com.arlosoft.macrodroid.triggers.UsbDeviceConnectionTrigger;
import kotlin.jvm.internal.C13695i;

/* renamed from: k3.b2 */
/* compiled from: UsbDeviceConnectionTriggerInfo.kt */
public final class C7481b2 extends C5889c8 {

    /* renamed from: j */
    public static final C7482a f18336j = new C7482a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C4001c1 f18337k = new C7481b2();
    @StringRes

    /* renamed from: g */
    private final int f18338g = C17541R$string.trigger_usb_device_connection;

    /* renamed from: h */
    private final int f18339h = C17530R$drawable.ic_usb;
    @StringRes

    /* renamed from: i */
    private final int f18340i = C17541R$string.trigger_usb_device_connection_help;

    /* renamed from: k3.b2$a */
    /* compiled from: UsbDeviceConnectionTriggerInfo.kt */
    public static final class C7482a {
        private C7482a() {
        }

        public /* synthetic */ C7482a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final C4001c1 mo37638a() {
            return C7481b2.f18337k;
        }
    }

    /* renamed from: v */
    public static final C4001c1 m31096v() {
        return f18336j.mo37638a();
    }

    /* renamed from: b */
    public SelectableItem mo27888b(Activity activity, Macro macro) {
        return new UsbDeviceConnectionTrigger(activity, macro);
    }

    /* renamed from: f */
    public int mo27891f() {
        return this.f18340i;
    }

    /* renamed from: g */
    public int mo27892g() {
        return this.f18339h;
    }

    /* renamed from: k */
    public int mo27893k() {
        return this.f18338g;
    }
}

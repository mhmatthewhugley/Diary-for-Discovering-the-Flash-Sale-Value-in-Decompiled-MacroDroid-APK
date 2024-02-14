package p195y2;

import android.content.Context;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import kotlin.jvm.internal.C13706o;

/* renamed from: y2.a */
/* compiled from: TelephonyMonitor.kt */
public final class C10405a {

    /* renamed from: a */
    public static final C10405a f23647a = new C10405a();

    /* renamed from: b */
    private static TelephonyDisplayInfo f23648b;

    /* renamed from: y2.a$a */
    /* compiled from: TelephonyMonitor.kt */
    public static final class C10406a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
        C10406a() {
        }

        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            C13706o.m87929f(telephonyDisplayInfo, "displayInfo");
            C10405a.f23647a.mo41101c(telephonyDisplayInfo);
        }
    }

    /* renamed from: y2.a$b */
    /* compiled from: TelephonyMonitor.kt */
    public static final class C10407b extends PhoneStateListener {
        C10407b() {
        }

        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            C13706o.m87929f(telephonyDisplayInfo, "displayInfo");
            C10405a.f23647a.mo41101c(telephonyDisplayInfo);
        }
    }

    private C10405a() {
    }

    /* renamed from: a */
    public final boolean mo41099a() {
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        TelephonyDisplayInfo telephonyDisplayInfo = f23648b;
        if (!(telephonyDisplayInfo != null && telephonyDisplayInfo.getNetworkType() == 2)) {
            TelephonyDisplayInfo telephonyDisplayInfo2 = f23648b;
            if (!(telephonyDisplayInfo2 != null && telephonyDisplayInfo2.getNetworkType() == 3)) {
                TelephonyDisplayInfo telephonyDisplayInfo3 = f23648b;
                if (telephonyDisplayInfo3 != null && telephonyDisplayInfo3.getNetworkType() == 4) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final void mo41100b(Context context) {
        C13706o.m87929f(context, "context");
        try {
            Object systemService = context.getSystemService("phone");
            C13706o.m87927d(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            TelephonyManager telephonyManager = (TelephonyManager) systemService;
            int i = Build.VERSION.SDK_INT;
            if (i >= 39) {
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), new C10406a());
            } else if (i > 30) {
                telephonyManager.listen(new C10407b(), 1048576);
            }
        } catch (SecurityException unused) {
            C4878b.m18864c("NOT monitoring telephony display info changes (No permission).");
        }
    }

    /* renamed from: c */
    public final void mo41101c(TelephonyDisplayInfo telephonyDisplayInfo) {
        f23648b = telephonyDisplayInfo;
    }
}

package dev.skomlach.biometric.compat.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.p007os.BuildCompat;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.contextprovider.C12104a;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/DeviceUnlockedReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lja/u;", "onReceive", "<init>", "()V", "Companion", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: DeviceUnlockedReceiver.kt */
public final class DeviceUnlockedReceiver extends BroadcastReceiver {
    public static final Companion Companion = new Companion((C13695i) null);
    /* access modifiers changed from: private */
    public static final Context appContext = C12104a.f58372a.mo68283g();

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/DeviceUnlockedReceiver$Companion;", "", "Lja/u;", "registerDeviceUnlockListener", "Landroid/content/Context;", "appContext", "Landroid/content/Context;", "<init>", "()V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: DeviceUnlockedReceiver.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        public final void registerDeviceUnlockListener() {
            if (BuildCompat.isAtLeastN()) {
                try {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.USER_PRESENT");
                    intentFilter.addAction("android.intent.action.MANAGED_PROFILE_UNLOCKED");
                    intentFilter.addAction("android.intent.action.USER_UNLOCKED");
                    DeviceUnlockedReceiver.appContext.registerReceiver(new DeviceUnlockedReceiver(), intentFilter);
                } catch (Throwable th) {
                    BiometricLoggerImpl.INSTANCE.mo68218e(th);
                }
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        C13706o.m87929f(context, "context");
        C13706o.m87929f(intent, "intent");
        String action = intent.getAction();
        if (!(action == null || action.length() == 0)) {
            BiometricLoggerImpl.INSTANCE.mo68217d("Device unlocked or boot completed");
            BiometricErrorLockoutPermanentFix.INSTANCE.resetBiometricSensorPermanentlyLocked();
        }
    }
}

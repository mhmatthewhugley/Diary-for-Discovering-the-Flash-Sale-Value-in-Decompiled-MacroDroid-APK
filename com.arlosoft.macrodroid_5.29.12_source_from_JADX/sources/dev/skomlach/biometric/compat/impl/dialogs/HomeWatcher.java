package dev.skomlach.biometric.compat.impl.dialogs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import dev.skomlach.biometric.compat.utils.logging.BiometricLoggerImpl;
import dev.skomlach.common.contextprovider.C12104a;
import dev.skomlach.common.misc.C12113b;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\r\u001a\u00060\fR\u00020\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/impl/dialogs/HomeWatcher;", "", "Lja/u;", "stopWatch", "Ljava/lang/Runnable;", "startWatch", "Ldev/skomlach/biometric/compat/impl/dialogs/HomeWatcher$OnHomePressedListener;", "mListener", "Ldev/skomlach/biometric/compat/impl/dialogs/HomeWatcher$OnHomePressedListener;", "Landroid/content/IntentFilter;", "mFilter", "Landroid/content/IntentFilter;", "Ldev/skomlach/biometric/compat/impl/dialogs/HomeWatcher$InnerReceiver;", "mReceiver", "Ldev/skomlach/biometric/compat/impl/dialogs/HomeWatcher$InnerReceiver;", "Landroid/content/Context;", "appContext", "Landroid/content/Context;", "<init>", "(Ldev/skomlach/biometric/compat/impl/dialogs/HomeWatcher$OnHomePressedListener;)V", "InnerReceiver", "OnHomePressedListener", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: HomeWatcher.kt */
public final class HomeWatcher {
    private final Context appContext = C12104a.f58372a.mo68283g();
    private final IntentFilter mFilter;
    /* access modifiers changed from: private */
    public final OnHomePressedListener mListener;
    private final InnerReceiver mReceiver = new InnerReceiver();

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\t\u001a\u00020\b8\u0006XD¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\b8\u0006XD¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\b8\u0006XD¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0011\u001a\u00020\b8\u0006XD¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\u00020\b8\u0006XD¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\f¨\u0006\u0017"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/impl/dialogs/HomeWatcher$InnerReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lja/u;", "onReceive", "", "SYSTEM_DIALOG_REASON_KEY", "Ljava/lang/String;", "getSYSTEM_DIALOG_REASON_KEY", "()Ljava/lang/String;", "SYSTEM_DIALOG_REASON_GLOBAL_ACTIONS", "getSYSTEM_DIALOG_REASON_GLOBAL_ACTIONS", "SYSTEM_DIALOG_REASON_RECENT_APPS", "getSYSTEM_DIALOG_REASON_RECENT_APPS", "SYSTEM_DIALOG_REASON_HOME_KEY", "getSYSTEM_DIALOG_REASON_HOME_KEY", "SYSTEM_DIALOG_REASON_DREAM", "getSYSTEM_DIALOG_REASON_DREAM", "<init>", "(Ldev/skomlach/biometric/compat/impl/dialogs/HomeWatcher;)V", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: HomeWatcher.kt */
    private final class InnerReceiver extends BroadcastReceiver {
        private final String SYSTEM_DIALOG_REASON_DREAM = "dream";
        private final String SYSTEM_DIALOG_REASON_GLOBAL_ACTIONS = "globalactions";
        private final String SYSTEM_DIALOG_REASON_HOME_KEY = "homekey";
        private final String SYSTEM_DIALOG_REASON_KEY = "reason";
        private final String SYSTEM_DIALOG_REASON_RECENT_APPS = "recentapps";

        public InnerReceiver() {
        }

        public final String getSYSTEM_DIALOG_REASON_DREAM() {
            return this.SYSTEM_DIALOG_REASON_DREAM;
        }

        public final String getSYSTEM_DIALOG_REASON_GLOBAL_ACTIONS() {
            return this.SYSTEM_DIALOG_REASON_GLOBAL_ACTIONS;
        }

        public final String getSYSTEM_DIALOG_REASON_HOME_KEY() {
            return this.SYSTEM_DIALOG_REASON_HOME_KEY;
        }

        public final String getSYSTEM_DIALOG_REASON_KEY() {
            return this.SYSTEM_DIALOG_REASON_KEY;
        }

        public final String getSYSTEM_DIALOG_REASON_RECENT_APPS() {
            return this.SYSTEM_DIALOG_REASON_RECENT_APPS;
        }

        public void onReceive(Context context, Intent intent) {
            C13706o.m87929f(context, "context");
            C13706o.m87929f(intent, "intent");
            try {
                String action = intent.getAction();
                if (C13706o.m87924a("android.intent.action.CLOSE_SYSTEM_DIALOGS", action)) {
                    String stringExtra = intent.getStringExtra(this.SYSTEM_DIALOG_REASON_KEY);
                    if (C13706o.m87924a(this.SYSTEM_DIALOG_REASON_GLOBAL_ACTIONS, stringExtra)) {
                        return;
                    }
                    if (C13706o.m87924a(this.SYSTEM_DIALOG_REASON_HOME_KEY, stringExtra)) {
                        HomeWatcher.this.mListener.onHomePressed();
                    } else if (C13706o.m87924a(this.SYSTEM_DIALOG_REASON_RECENT_APPS, stringExtra)) {
                        HomeWatcher.this.mListener.onRecentAppPressed();
                    }
                } else if (C13706o.m87924a("android.intent.action.SCREEN_OFF", action) || C13706o.m87924a("android.intent.action.SCREEN_ON", action)) {
                    HomeWatcher.this.mListener.onPowerPressed();
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&¨\u0006\u0006"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/impl/dialogs/HomeWatcher$OnHomePressedListener;", "", "Lja/u;", "onHomePressed", "onRecentAppPressed", "onPowerPressed", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: HomeWatcher.kt */
    public interface OnHomePressedListener {
        void onHomePressed();

        void onPowerPressed();

        void onRecentAppPressed();
    }

    public HomeWatcher(OnHomePressedListener onHomePressedListener) {
        C13706o.m87929f(onHomePressedListener, "mListener");
        this.mListener = onHomePressedListener;
        IntentFilter intentFilter = new IntentFilter();
        this.mFilter = intentFilter;
        intentFilter.addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
    }

    /* access modifiers changed from: private */
    /* renamed from: startWatch$lambda-0  reason: not valid java name */
    public static final void m101345startWatch$lambda0(HomeWatcher homeWatcher) {
        C13706o.m87929f(homeWatcher, "this$0");
        homeWatcher.stopWatch();
    }

    /* access modifiers changed from: private */
    /* renamed from: startWatch$lambda-1  reason: not valid java name */
    public static final void m101346startWatch$lambda1() {
    }

    private final void stopWatch() {
        try {
            C12113b.f58378a.mo68301c(this.appContext, this.mReceiver);
        } catch (Throwable unused) {
        }
    }

    public final Runnable startWatch() {
        try {
            stopWatch();
            C12113b.f58378a.mo68299a(this.appContext, this.mReceiver, this.mFilter);
            return new C12060k(this);
        } catch (Throwable th) {
            BiometricLoggerImpl.INSTANCE.mo68218e(th);
            return C12061l.f58284a;
        }
    }
}

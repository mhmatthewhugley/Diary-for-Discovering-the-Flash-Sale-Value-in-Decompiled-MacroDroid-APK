package androidx.window.layout;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.window.core.SpecificationComputer;
import androidx.window.core.Version;
import androidx.window.layout.ExtensionInterfaceCompat;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 &2\u00020\u0001:\u0004&'()B\u001d\b\u0007\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b!\u0010\"B\u0011\b\u0016\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b!\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0017R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001e0\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010 ¨\u0006*"}, mo71668d2 = {"Landroidx/window/layout/SidecarCompat;", "Landroidx/window/layout/ExtensionInterfaceCompat;", "Landroid/app/Activity;", "activity", "Lja/u;", "registerConfigurationChangeListener", "unregisterComponentCallback", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "extensionCallback", "setExtensionCallback", "Landroidx/window/layout/WindowLayoutInfo;", "getWindowLayoutInfo", "onWindowLayoutChangeListenerAdded", "Landroid/os/IBinder;", "windowToken", "register", "onWindowLayoutChangeListenerRemoved", "", "validateExtensionInterface", "Landroidx/window/sidecar/SidecarInterface;", "sidecar", "Landroidx/window/sidecar/SidecarInterface;", "getSidecar", "()Landroidx/window/sidecar/SidecarInterface;", "Landroidx/window/layout/SidecarAdapter;", "sidecarAdapter", "Landroidx/window/layout/SidecarAdapter;", "", "windowListenerRegisteredContexts", "Ljava/util/Map;", "Landroid/content/ComponentCallbacks;", "componentCallbackMap", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "<init>", "(Landroidx/window/sidecar/SidecarInterface;Landroidx/window/layout/SidecarAdapter;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "Companion", "DistinctElementCallback", "FirstAttachAdapter", "TranslatingCallback", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: SidecarCompat.kt */
public final class SidecarCompat implements ExtensionInterfaceCompat {
    public static final Companion Companion = new Companion((C13695i) null);
    private static final String TAG = "SidecarCompat";
    private final Map<Activity, ComponentCallbacks> componentCallbackMap;
    /* access modifiers changed from: private */
    public ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallback;
    private final SidecarInterface sidecar;
    /* access modifiers changed from: private */
    public final SidecarAdapter sidecarAdapter;
    /* access modifiers changed from: private */
    public final Map<IBinder, Activity> windowListenerRegisteredContexts;

    @Metadata(mo71667d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0002\b\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, mo71668d2 = {"Landroidx/window/layout/SidecarCompat$Companion;", "", "()V", "TAG", "", "sidecarVersion", "Landroidx/window/core/Version;", "getSidecarVersion", "()Landroidx/window/core/Version;", "getActivityWindowToken", "Landroid/os/IBinder;", "activity", "Landroid/app/Activity;", "getActivityWindowToken$window_release", "getSidecarCompat", "Landroidx/window/sidecar/SidecarInterface;", "context", "Landroid/content/Context;", "getSidecarCompat$window_release", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: SidecarCompat.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        public final IBinder getActivityWindowToken$window_release(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        public final SidecarInterface getSidecarCompat$window_release(Context context) {
            C13706o.m87929f(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        public final Version getSidecarVersion() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (!TextUtils.isEmpty(apiVersion)) {
                    return Version.Companion.parse(apiVersion);
                }
                return null;
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\b\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, mo71668d2 = {"Landroidx/window/layout/SidecarCompat$DistinctElementCallback;", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "Landroid/app/Activity;", "activity", "Landroidx/window/layout/WindowLayoutInfo;", "newLayout", "Lja/u;", "onWindowLayoutChanged", "callbackInterface", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/WeakHashMap;", "activityWindowLayoutInfo", "Ljava/util/WeakHashMap;", "<init>", "(Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;)V", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: SidecarCompat.kt */
    private static final class DistinctElementCallback implements ExtensionInterfaceCompat.ExtensionCallbackInterface {
        @GuardedBy("mLock")
        private final WeakHashMap<Activity, WindowLayoutInfo> activityWindowLayoutInfo = new WeakHashMap<>();
        private final ExtensionInterfaceCompat.ExtensionCallbackInterface callbackInterface;
        private final ReentrantLock lock = new ReentrantLock();

        public DistinctElementCallback(ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface) {
            C13706o.m87929f(extensionCallbackInterface, "callbackInterface");
            this.callbackInterface = extensionCallbackInterface;
        }

        public void onWindowLayoutChanged(Activity activity, WindowLayoutInfo windowLayoutInfo) {
            C13706o.m87929f(activity, "activity");
            C13706o.m87929f(windowLayoutInfo, "newLayout");
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            try {
                if (!C13706o.m87924a(windowLayoutInfo, this.activityWindowLayoutInfo.get(activity))) {
                    WindowLayoutInfo put = this.activityWindowLayoutInfo.put(activity, windowLayoutInfo);
                    reentrantLock.unlock();
                    this.callbackInterface.onWindowLayoutChanged(activity, windowLayoutInfo);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\r\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo71668d2 = {"Landroidx/window/layout/SidecarCompat$FirstAttachAdapter;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "Lja/u;", "onViewAttachedToWindow", "onViewDetachedFromWindow", "Landroidx/window/layout/SidecarCompat;", "sidecarCompat", "Landroidx/window/layout/SidecarCompat;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "kotlin.jvm.PlatformType", "activityWeakReference", "Ljava/lang/ref/WeakReference;", "activity", "<init>", "(Landroidx/window/layout/SidecarCompat;Landroid/app/Activity;)V", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: SidecarCompat.kt */
    private static final class FirstAttachAdapter implements View.OnAttachStateChangeListener {
        private final WeakReference<Activity> activityWeakReference;
        private final SidecarCompat sidecarCompat;

        public FirstAttachAdapter(SidecarCompat sidecarCompat2, Activity activity) {
            C13706o.m87929f(sidecarCompat2, "sidecarCompat");
            C13706o.m87929f(activity, "activity");
            this.sidecarCompat = sidecarCompat2;
            this.activityWeakReference = new WeakReference<>(activity);
        }

        public void onViewAttachedToWindow(View view) {
            C13706o.m87929f(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = (Activity) this.activityWeakReference.get();
            IBinder activityWindowToken$window_release = SidecarCompat.Companion.getActivityWindowToken$window_release(activity);
            if (activity != null && activityWindowToken$window_release != null) {
                this.sidecarCompat.register(activityWindowToken$window_release, activity);
            }
        }

        public void onViewDetachedFromWindow(View view) {
            C13706o.m87929f(view, "view");
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0017¨\u0006\r"}, mo71668d2 = {"Landroidx/window/layout/SidecarCompat$TranslatingCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "Lja/u;", "onDeviceStateChanged", "Landroid/os/IBinder;", "windowToken", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "<init>", "(Landroidx/window/layout/SidecarCompat;)V", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: SidecarCompat.kt */
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        public TranslatingCallback() {
        }

        public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
            SidecarInterface sidecar;
            C13706o.m87929f(sidecarDeviceState, "newDeviceState");
            Collection<Activity> values = SidecarCompat.this.windowListenerRegisteredContexts.values();
            SidecarCompat sidecarCompat = SidecarCompat.this;
            for (Activity activity : values) {
                IBinder activityWindowToken$window_release = SidecarCompat.Companion.getActivityWindowToken$window_release(activity);
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                if (!(activityWindowToken$window_release == null || (sidecar = sidecarCompat.getSidecar()) == null)) {
                    sidecarWindowLayoutInfo = sidecar.getWindowLayoutInfo(activityWindowToken$window_release);
                }
                ExtensionInterfaceCompat.ExtensionCallbackInterface access$getExtensionCallback$p = sidecarCompat.extensionCallback;
                if (access$getExtensionCallback$p != null) {
                    access$getExtensionCallback$p.onWindowLayoutChanged(activity, sidecarCompat.sidecarAdapter.translate(sidecarWindowLayoutInfo, sidecarDeviceState));
                }
            }
        }

        public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            SidecarDeviceState sidecarDeviceState;
            C13706o.m87929f(iBinder, "windowToken");
            C13706o.m87929f(sidecarWindowLayoutInfo, "newLayout");
            Activity activity = (Activity) SidecarCompat.this.windowListenerRegisteredContexts.get(iBinder);
            if (activity == null) {
                Log.w(SidecarCompat.TAG, "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            SidecarAdapter access$getSidecarAdapter$p = SidecarCompat.this.sidecarAdapter;
            SidecarInterface sidecar = SidecarCompat.this.getSidecar();
            if (sidecar == null || (sidecarDeviceState = sidecar.getDeviceState()) == null) {
                sidecarDeviceState = new SidecarDeviceState();
            }
            WindowLayoutInfo translate = access$getSidecarAdapter$p.translate(sidecarWindowLayoutInfo, sidecarDeviceState);
            ExtensionInterfaceCompat.ExtensionCallbackInterface access$getExtensionCallback$p = SidecarCompat.this.extensionCallback;
            if (access$getExtensionCallback$p != null) {
                access$getExtensionCallback$p.onWindowLayoutChanged(activity, translate);
            }
        }
    }

    @VisibleForTesting
    public SidecarCompat(@VisibleForTesting SidecarInterface sidecarInterface, SidecarAdapter sidecarAdapter2) {
        C13706o.m87929f(sidecarAdapter2, "sidecarAdapter");
        this.sidecar = sidecarInterface;
        this.sidecarAdapter = sidecarAdapter2;
        this.windowListenerRegisteredContexts = new LinkedHashMap();
        this.componentCallbackMap = new LinkedHashMap();
    }

    private final void registerConfigurationChangeListener(Activity activity) {
        if (this.componentCallbackMap.get(activity) == null) {
            C1308xe5f1d4c7 sidecarCompat$registerConfigurationChangeListener$configChangeObserver$1 = new C1308xe5f1d4c7(this, activity);
            this.componentCallbackMap.put(activity, sidecarCompat$registerConfigurationChangeListener$configChangeObserver$1);
            activity.registerComponentCallbacks(sidecarCompat$registerConfigurationChangeListener$configChangeObserver$1);
        }
    }

    private final void unregisterComponentCallback(Activity activity) {
        activity.unregisterComponentCallbacks(this.componentCallbackMap.get(activity));
        this.componentCallbackMap.remove(activity);
    }

    public final SidecarInterface getSidecar() {
        return this.sidecar;
    }

    @VisibleForTesting
    public final WindowLayoutInfo getWindowLayoutInfo(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        C13706o.m87929f(activity, "activity");
        IBinder activityWindowToken$window_release = Companion.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release == null) {
            return new WindowLayoutInfo(C13614t.m87748j());
        }
        SidecarInterface sidecarInterface = this.sidecar;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(activityWindowToken$window_release) : null;
        SidecarAdapter sidecarAdapter2 = this.sidecarAdapter;
        SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return sidecarAdapter2.translate(windowLayoutInfo, sidecarDeviceState);
    }

    public void onWindowLayoutChangeListenerAdded(Activity activity) {
        C13706o.m87929f(activity, "activity");
        IBinder activityWindowToken$window_release = Companion.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release != null) {
            register(activityWindowToken$window_release, activity);
            return;
        }
        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new FirstAttachAdapter(this, activity));
    }

    public void onWindowLayoutChangeListenerRemoved(Activity activity) {
        SidecarInterface sidecarInterface;
        C13706o.m87929f(activity, "activity");
        IBinder activityWindowToken$window_release = Companion.getActivityWindowToken$window_release(activity);
        if (activityWindowToken$window_release != null) {
            SidecarInterface sidecarInterface2 = this.sidecar;
            if (sidecarInterface2 != null) {
                sidecarInterface2.onWindowLayoutChangeListenerRemoved(activityWindowToken$window_release);
            }
            unregisterComponentCallback(activity);
            boolean z = this.windowListenerRegisteredContexts.size() == 1;
            this.windowListenerRegisteredContexts.remove(activityWindowToken$window_release);
            if (z && (sidecarInterface = this.sidecar) != null) {
                sidecarInterface.onDeviceStateListenersChanged(true);
            }
        }
    }

    public final void register(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        C13706o.m87929f(iBinder, "windowToken");
        C13706o.m87929f(activity, "activity");
        this.windowListenerRegisteredContexts.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (this.windowListenerRegisteredContexts.size() == 1 && (sidecarInterface = this.sidecar) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = this.extensionCallback;
        if (extensionCallbackInterface != null) {
            extensionCallbackInterface.onWindowLayoutChanged(activity, getWindowLayoutInfo(activity));
        }
        registerConfigurationChangeListener(activity);
    }

    public void setExtensionCallback(ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface) {
        C13706o.m87929f(extensionCallbackInterface, "extensionCallback");
        this.extensionCallback = new DistinctElementCallback(extensionCallbackInterface);
        SidecarInterface sidecarInterface = this.sidecar;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.sidecarAdapter, new TranslatingCallback()));
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:51|52|53|54|60|61|62|63|64|(2:66|81)(2:67|68)) */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        return true;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x010e */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0148 A[Catch:{ NoSuchFieldError -> 0x00b8, all -> 0x01b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0149 A[Catch:{ NoSuchFieldError -> 0x00b8, all -> 0x01b5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean validateExtensionInterface() {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            androidx.window.sidecar.SidecarInterface r2 = r8.sidecar     // Catch:{ all -> 0x01b5 }
            r3 = 0
            if (r2 == 0) goto L_0x001a
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x01b5 }
            if (r2 == 0) goto L_0x001a
            java.lang.String r4 = "setSidecarCallback"
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ all -> 0x01b5 }
            java.lang.Class<androidx.window.sidecar.SidecarInterface$SidecarCallback> r6 = androidx.window.sidecar.SidecarInterface.SidecarCallback.class
            r5[r1] = r6     // Catch:{ all -> 0x01b5 }
            java.lang.reflect.Method r2 = r2.getMethod(r4, r5)     // Catch:{ all -> 0x01b5 }
            goto L_0x001b
        L_0x001a:
            r2 = r3
        L_0x001b:
            if (r2 == 0) goto L_0x0022
            java.lang.Class r2 = r2.getReturnType()     // Catch:{ all -> 0x01b5 }
            goto L_0x0023
        L_0x0022:
            r2 = r3
        L_0x0023:
            java.lang.Class r4 = java.lang.Void.TYPE     // Catch:{ all -> 0x01b5 }
            boolean r4 = kotlin.jvm.internal.C13706o.m87924a(r2, r4)     // Catch:{ all -> 0x01b5 }
            if (r4 == 0) goto L_0x019e
            androidx.window.sidecar.SidecarInterface r2 = r8.sidecar     // Catch:{ all -> 0x01b5 }
            if (r2 == 0) goto L_0x0032
            r2.getDeviceState()     // Catch:{ all -> 0x01b5 }
        L_0x0032:
            androidx.window.sidecar.SidecarInterface r2 = r8.sidecar     // Catch:{ all -> 0x01b5 }
            if (r2 == 0) goto L_0x0039
            r2.onDeviceStateListenersChanged(r0)     // Catch:{ all -> 0x01b5 }
        L_0x0039:
            androidx.window.sidecar.SidecarInterface r2 = r8.sidecar     // Catch:{ all -> 0x01b5 }
            if (r2 == 0) goto L_0x0050
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x01b5 }
            if (r2 == 0) goto L_0x0050
            java.lang.String r4 = "getWindowLayoutInfo"
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ all -> 0x01b5 }
            java.lang.Class<android.os.IBinder> r6 = android.os.IBinder.class
            r5[r1] = r6     // Catch:{ all -> 0x01b5 }
            java.lang.reflect.Method r2 = r2.getMethod(r4, r5)     // Catch:{ all -> 0x01b5 }
            goto L_0x0051
        L_0x0050:
            r2 = r3
        L_0x0051:
            if (r2 == 0) goto L_0x0058
            java.lang.Class r2 = r2.getReturnType()     // Catch:{ all -> 0x01b5 }
            goto L_0x0059
        L_0x0058:
            r2 = r3
        L_0x0059:
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r4 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            boolean r4 = kotlin.jvm.internal.C13706o.m87924a(r2, r4)     // Catch:{ all -> 0x01b5 }
            if (r4 == 0) goto L_0x0187
            androidx.window.sidecar.SidecarInterface r2 = r8.sidecar     // Catch:{ all -> 0x01b5 }
            if (r2 == 0) goto L_0x0078
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x01b5 }
            if (r2 == 0) goto L_0x0078
            java.lang.String r4 = "onWindowLayoutChangeListenerAdded"
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ all -> 0x01b5 }
            java.lang.Class<android.os.IBinder> r6 = android.os.IBinder.class
            r5[r1] = r6     // Catch:{ all -> 0x01b5 }
            java.lang.reflect.Method r2 = r2.getMethod(r4, r5)     // Catch:{ all -> 0x01b5 }
            goto L_0x0079
        L_0x0078:
            r2 = r3
        L_0x0079:
            if (r2 == 0) goto L_0x0080
            java.lang.Class r2 = r2.getReturnType()     // Catch:{ all -> 0x01b5 }
            goto L_0x0081
        L_0x0080:
            r2 = r3
        L_0x0081:
            java.lang.Class r4 = java.lang.Void.TYPE     // Catch:{ all -> 0x01b5 }
            boolean r4 = kotlin.jvm.internal.C13706o.m87924a(r2, r4)     // Catch:{ all -> 0x01b5 }
            if (r4 == 0) goto L_0x0170
            androidx.window.sidecar.SidecarInterface r2 = r8.sidecar     // Catch:{ all -> 0x01b5 }
            if (r2 == 0) goto L_0x00a0
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x01b5 }
            if (r2 == 0) goto L_0x00a0
            java.lang.String r4 = "onWindowLayoutChangeListenerRemoved"
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ all -> 0x01b5 }
            java.lang.Class<android.os.IBinder> r6 = android.os.IBinder.class
            r5[r1] = r6     // Catch:{ all -> 0x01b5 }
            java.lang.reflect.Method r2 = r2.getMethod(r4, r5)     // Catch:{ all -> 0x01b5 }
            goto L_0x00a1
        L_0x00a0:
            r2 = r3
        L_0x00a1:
            if (r2 == 0) goto L_0x00a7
            java.lang.Class r3 = r2.getReturnType()     // Catch:{ all -> 0x01b5 }
        L_0x00a7:
            java.lang.Class r2 = java.lang.Void.TYPE     // Catch:{ all -> 0x01b5 }
            boolean r2 = kotlin.jvm.internal.C13706o.m87924a(r3, r2)     // Catch:{ all -> 0x01b5 }
            if (r2 == 0) goto L_0x0159
            androidx.window.sidecar.SidecarDeviceState r2 = new androidx.window.sidecar.SidecarDeviceState     // Catch:{ all -> 0x01b5 }
            r2.<init>()     // Catch:{ all -> 0x01b5 }
            r3 = 3
            r2.posture = r3     // Catch:{ NoSuchFieldError -> 0x00b8 }
            goto L_0x00ee
        L_0x00b8:
            java.lang.Class<androidx.window.sidecar.SidecarDeviceState> r4 = androidx.window.sidecar.SidecarDeviceState.class
            java.lang.String r5 = "setPosture"
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x01b5 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ all -> 0x01b5 }
            r6[r1] = r7     // Catch:{ all -> 0x01b5 }
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch:{ all -> 0x01b5 }
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ all -> 0x01b5 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01b5 }
            r5[r1] = r6     // Catch:{ all -> 0x01b5 }
            r4.invoke(r2, r5)     // Catch:{ all -> 0x01b5 }
            java.lang.Class<androidx.window.sidecar.SidecarDeviceState> r4 = androidx.window.sidecar.SidecarDeviceState.class
            java.lang.String r5 = "getPosture"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ all -> 0x01b5 }
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch:{ all -> 0x01b5 }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x01b5 }
            java.lang.Object r2 = r4.invoke(r2, r5)     // Catch:{ all -> 0x01b5 }
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Int"
            kotlin.jvm.internal.C13706o.m87927d(r2, r4)     // Catch:{ all -> 0x01b5 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x01b5 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x01b5 }
            if (r2 != r3) goto L_0x0151
        L_0x00ee:
            androidx.window.sidecar.SidecarDisplayFeature r2 = new androidx.window.sidecar.SidecarDisplayFeature     // Catch:{ all -> 0x01b5 }
            r2.<init>()     // Catch:{ all -> 0x01b5 }
            android.graphics.Rect r3 = r2.getRect()     // Catch:{ all -> 0x01b5 }
            java.lang.String r4 = "displayFeature.rect"
            kotlin.jvm.internal.C13706o.m87928e(r3, r4)     // Catch:{ all -> 0x01b5 }
            r2.setRect(r3)     // Catch:{ all -> 0x01b5 }
            r2.getType()     // Catch:{ all -> 0x01b5 }
            r2.setType(r0)     // Catch:{ all -> 0x01b5 }
            androidx.window.sidecar.SidecarWindowLayoutInfo r3 = new androidx.window.sidecar.SidecarWindowLayoutInfo     // Catch:{ all -> 0x01b5 }
            r3.<init>()     // Catch:{ all -> 0x01b5 }
            java.util.List r1 = r3.displayFeatures     // Catch:{ NoSuchFieldError -> 0x010e }
            goto L_0x01b6
        L_0x010e:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x01b5 }
            r4.<init>()     // Catch:{ all -> 0x01b5 }
            r4.add(r2)     // Catch:{ all -> 0x01b5 }
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r2 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            java.lang.String r5 = "setDisplayFeatures"
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x01b5 }
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r6[r1] = r7     // Catch:{ all -> 0x01b5 }
            java.lang.reflect.Method r2 = r2.getMethod(r5, r6)     // Catch:{ all -> 0x01b5 }
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ all -> 0x01b5 }
            r5[r1] = r4     // Catch:{ all -> 0x01b5 }
            r2.invoke(r3, r5)     // Catch:{ all -> 0x01b5 }
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r2 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            java.lang.String r5 = "getDisplayFeatures"
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ all -> 0x01b5 }
            java.lang.reflect.Method r2 = r2.getMethod(r5, r6)     // Catch:{ all -> 0x01b5 }
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ all -> 0x01b5 }
            java.lang.Object r2 = r2.invoke(r3, r5)     // Catch:{ all -> 0x01b5 }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>"
            kotlin.jvm.internal.C13706o.m87927d(r2, r3)     // Catch:{ all -> 0x01b5 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x01b5 }
            boolean r2 = kotlin.jvm.internal.C13706o.m87924a(r4, r2)     // Catch:{ all -> 0x01b5 }
            if (r2 == 0) goto L_0x0149
            goto L_0x01b6
        L_0x0149:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x01b5 }
            java.lang.String r2 = "Invalid display feature getter/setter"
            r0.<init>(r2)     // Catch:{ all -> 0x01b5 }
            throw r0     // Catch:{ all -> 0x01b5 }
        L_0x0151:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x01b5 }
            java.lang.String r2 = "Invalid device posture getter/setter"
            r0.<init>(r2)     // Catch:{ all -> 0x01b5 }
            throw r0     // Catch:{ all -> 0x01b5 }
        L_0x0159:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x01b5 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b5 }
            r2.<init>()     // Catch:{ all -> 0x01b5 }
            java.lang.String r4 = "Illegal return type for 'onWindowLayoutChangeListenerRemoved': "
            r2.append(r4)     // Catch:{ all -> 0x01b5 }
            r2.append(r3)     // Catch:{ all -> 0x01b5 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01b5 }
            r0.<init>(r2)     // Catch:{ all -> 0x01b5 }
            throw r0     // Catch:{ all -> 0x01b5 }
        L_0x0170:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x01b5 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b5 }
            r3.<init>()     // Catch:{ all -> 0x01b5 }
            java.lang.String r4 = "Illegal return type for 'onWindowLayoutChangeListenerAdded': "
            r3.append(r4)     // Catch:{ all -> 0x01b5 }
            r3.append(r2)     // Catch:{ all -> 0x01b5 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x01b5 }
            r0.<init>(r2)     // Catch:{ all -> 0x01b5 }
            throw r0     // Catch:{ all -> 0x01b5 }
        L_0x0187:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x01b5 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b5 }
            r3.<init>()     // Catch:{ all -> 0x01b5 }
            java.lang.String r4 = "Illegal return type for 'getWindowLayoutInfo': "
            r3.append(r4)     // Catch:{ all -> 0x01b5 }
            r3.append(r2)     // Catch:{ all -> 0x01b5 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x01b5 }
            r0.<init>(r2)     // Catch:{ all -> 0x01b5 }
            throw r0     // Catch:{ all -> 0x01b5 }
        L_0x019e:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x01b5 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b5 }
            r3.<init>()     // Catch:{ all -> 0x01b5 }
            java.lang.String r4 = "Illegal return type for 'setSidecarCallback': "
            r3.append(r4)     // Catch:{ all -> 0x01b5 }
            r3.append(r2)     // Catch:{ all -> 0x01b5 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x01b5 }
            r0.<init>(r2)     // Catch:{ all -> 0x01b5 }
            throw r0     // Catch:{ all -> 0x01b5 }
        L_0x01b5:
            r0 = 0
        L_0x01b6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SidecarCompat.validateExtensionInterface():boolean");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SidecarCompat(Context context) {
        this(Companion.getSidecarCompat$window_release(context), new SidecarAdapter((SpecificationComputer.VerificationMode) null, 1, (C13695i) null));
        C13706o.m87929f(context, "context");
    }
}

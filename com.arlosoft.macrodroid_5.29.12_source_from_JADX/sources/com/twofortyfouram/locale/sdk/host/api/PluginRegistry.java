package com.twofortyfouram.locale.sdk.host.api;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.twofortyfouram.locale.sdk.host.internal.PluginRegistryHandler;
import com.twofortyfouram.locale.sdk.host.model.Plugin;
import com.twofortyfouram.locale.sdk.host.model.PluginType;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import p276h8.C12406a;
import p295j8.C13301a;
import p295j8.C13303c;
import p295j8.C13306e;
import p295j8.C13307f;

public final class PluginRegistry {
    @NonNull
    private static final String ACTION_REGISTRY_CHANGED = "com.twofortyfouram.locale.intent.action.PLUGIN_REGISTRY_CHANGED:%d";
    @NonNull
    private static final Object LAZY_INITIALIZATION_INTRINSIC_LOCK = new Object();
    @Nullable
    private static volatile PluginRegistry sRegistry;
    @NonNull
    private final PluginRegistryHandler mHandler;
    @NonNull
    private final HandlerThread mHandlerThread;
    @NonNull
    private final CountDownLatch mLoadLatch = new CountDownLatch(1);
    @NonNull
    private final String mRegistryChangeAction;
    @NonNull
    private final String mRegistryChangePermission;

    /* renamed from: com.twofortyfouram.locale.sdk.host.api.PluginRegistry$1 */
    static /* synthetic */ class C117951 {
        static final /* synthetic */ int[] $SwitchMap$com$twofortyfouram$locale$sdk$host$model$PluginType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.twofortyfouram.locale.sdk.host.model.PluginType[] r0 = com.twofortyfouram.locale.sdk.host.model.PluginType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$twofortyfouram$locale$sdk$host$model$PluginType = r0
                com.twofortyfouram.locale.sdk.host.model.PluginType r1 = com.twofortyfouram.locale.sdk.host.model.PluginType.CONDITION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$twofortyfouram$locale$sdk$host$model$PluginType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.twofortyfouram.locale.sdk.host.model.PluginType r1 = com.twofortyfouram.locale.sdk.host.model.PluginType.SETTING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$twofortyfouram$locale$sdk$host$model$PluginType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.twofortyfouram.locale.sdk.host.model.PluginType r1 = com.twofortyfouram.locale.sdk.host.model.PluginType.EVENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.twofortyfouram.locale.sdk.host.api.PluginRegistry.C117951.<clinit>():void");
        }
    }

    private PluginRegistry(@NonNull Context context, @NonNull String str) {
        HandlerThread a = C13307f.m85642a(PluginRegistryHandler.class.getName(), C13307f.C13308a.BACKGROUND);
        this.mHandlerThread = a;
        C12406a.m83260d(context, "context");
        C12406a.m83260d(str, "notificationAction");
        Context a2 = C13303c.m85635a(context);
        this.mRegistryChangeAction = str;
        String internalPermission = getInternalPermission(a2);
        this.mRegistryChangePermission = internalPermission;
        this.mHandler = new PluginRegistryHandler(a.getLooper(), a2, str, internalPermission);
    }

    private void blockUntilLoaded() {
        try {
            this.mLoadLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    public static PluginRegistry getInstance(@NonNull Context context) {
        Context a = C13303c.m85635a(context);
        PluginRegistry pluginRegistry = sRegistry;
        if (pluginRegistry == null) {
            synchronized (LAZY_INITIALIZATION_INTRINSIC_LOCK) {
                pluginRegistry = sRegistry;
                if (pluginRegistry == null) {
                    PluginRegistry pluginRegistry2 = new PluginRegistry(a, String.format(Locale.US, ACTION_REGISTRY_CHANGED, new Object[]{Integer.valueOf(Process.myPid())}));
                    sRegistry = pluginRegistry2;
                    pluginRegistry2.init();
                    pluginRegistry = pluginRegistry2;
                }
            }
        }
        return pluginRegistry;
    }

    @NonNull
    private static String getInternalPermission(@NonNull Context context) {
        C12406a.m83260d(context, "context");
        return context.getPackageName() + ".com.twofortyfouram.locale.sdk.host.permission.internal";
    }

    private void init() {
        PluginRegistryHandler pluginRegistryHandler = this.mHandler;
        if (!pluginRegistryHandler.sendMessage(pluginRegistryHandler.obtainMessage(0, this.mLoadLatch))) {
            throw new AssertionError();
        }
    }

    @Nullable
    private Map<String, Plugin> peekPluginMap(@NonNull PluginType pluginType) {
        C12406a.m83260d(pluginType, "type");
        int i = C117951.$SwitchMap$com$twofortyfouram$locale$sdk$host$model$PluginType[pluginType.ordinal()];
        if (i == 1) {
            return this.mHandler.getConditions();
        }
        if (i == 2) {
            return this.mHandler.getSettings();
        }
        if (i == 3) {
            return this.mHandler.getEvents();
        }
        throw new AssertionError();
    }

    public void destroy() {
        synchronized (this) {
            if (!this.mHandler.sendEmptyMessage(4)) {
                throw new AssertionError();
            } else if (C13301a.m85633a(18)) {
                this.mHandlerThread.quitSafely();
            } else {
                this.mHandlerThread.quit();
                this.mLoadLatch.countDown();
            }
        }
        sRegistry = null;
    }

    @NonNull
    public String getChangeIntentAction() {
        return this.mRegistryChangeAction;
    }

    @NonNull
    public String getChangeIntentPermission() {
        return this.mRegistryChangePermission;
    }

    @NonNull
    public Map<String, Plugin> getPluginMap(@NonNull PluginType pluginType) {
        C12406a.m83260d(pluginType, "type");
        C13306e.m85641a("Call getPluginMap(PluginType).  Use peekPluginMap(PluginType) for performance critical sections of code");
        blockUntilLoaded();
        return peekPluginMap(pluginType);
    }
}

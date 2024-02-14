package com.twofortyfouram.locale.sdk.host.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.twofortyfouram.locale.sdk.host.model.Plugin;
import com.twofortyfouram.locale.sdk.host.model.PluginType;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import p276h8.C12406a;
import p285i8.C12447a;
import p295j8.C13303c;
import p295j8.C13307f;
import p305k8.C13419d;

public final class PluginRegistryHandler extends Handler {
    public static final int MESSAGE_DESTROY = 4;
    public static final int MESSAGE_INIT = 0;
    private static final int MESSAGE_PACKAGE_ADDED = 1;
    private static final int MESSAGE_PACKAGE_CHANGED = 3;
    private static final int MESSAGE_PACKAGE_REMOVED = 2;
    @NonNull
    private final Context mContext;
    @Nullable
    private volatile Map<String, Plugin> mImmutableConditionMap = null;
    @Nullable
    private volatile Map<String, Plugin> mImmutableEventMap = null;
    @Nullable
    private volatile Map<String, Plugin> mImmutableSettingMap = null;
    @Nullable
    private volatile Map<String, Plugin> mMutableConditionMap = null;
    @Nullable
    private volatile Map<String, Plugin> mMutableEventMap = null;
    @Nullable
    private volatile Map<String, Plugin> mMutableSettingMap = null;
    @NonNull
    private final BroadcastReceiver mReceiver = new RegistryReceiver(this, (C117981) null);
    @Nullable
    private volatile HandlerThread mReceiverHandlerThread = null;
    @Nullable
    private final Intent mRegistryReloadedIntent;
    @Nullable
    private final String mRegistryReloadedPermission;

    /* renamed from: com.twofortyfouram.locale.sdk.host.internal.PluginRegistryHandler$1 */
    static /* synthetic */ class C117981 {

        /* renamed from: $SwitchMap$com$twofortyfouram$locale$sdk$host$internal$PackageResult */
        static final /* synthetic */ int[] f57733xaf624d51;
        static final /* synthetic */ int[] $SwitchMap$com$twofortyfouram$locale$sdk$host$model$PluginType;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|23|24|25|26|(3:27|28|30)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x007b */
        static {
            /*
                com.twofortyfouram.locale.sdk.host.internal.PackageResult[] r0 = com.twofortyfouram.locale.sdk.host.internal.PackageResult.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f57733xaf624d51 = r0
                r1 = 1
                com.twofortyfouram.locale.sdk.host.internal.PackageResult r2 = com.twofortyfouram.locale.sdk.host.internal.PackageResult.NOTHING_CHANGED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f57733xaf624d51     // Catch:{ NoSuchFieldError -> 0x001d }
                com.twofortyfouram.locale.sdk.host.internal.PackageResult r3 = com.twofortyfouram.locale.sdk.host.internal.PackageResult.EVENT_AND_SETTINGS_AND_CONDITIONS_CHANGED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f57733xaf624d51     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.twofortyfouram.locale.sdk.host.internal.PackageResult r4 = com.twofortyfouram.locale.sdk.host.internal.PackageResult.CONDITIONS_AND_SETTINGS_CHANGED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = f57733xaf624d51     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.twofortyfouram.locale.sdk.host.internal.PackageResult r4 = com.twofortyfouram.locale.sdk.host.internal.PackageResult.EVENT_AND_SETTINGS_CHANGED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r3 = f57733xaf624d51     // Catch:{ NoSuchFieldError -> 0x003e }
                com.twofortyfouram.locale.sdk.host.internal.PackageResult r4 = com.twofortyfouram.locale.sdk.host.internal.PackageResult.EVENTS_AND_CONDITIONS_CHANGED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r3 = f57733xaf624d51     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.twofortyfouram.locale.sdk.host.internal.PackageResult r4 = com.twofortyfouram.locale.sdk.host.internal.PackageResult.EVENTS_CHANGED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r5 = 6
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r3 = f57733xaf624d51     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.twofortyfouram.locale.sdk.host.internal.PackageResult r4 = com.twofortyfouram.locale.sdk.host.internal.PackageResult.CONDITIONS_CHANGED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r5 = 7
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r3 = f57733xaf624d51     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.twofortyfouram.locale.sdk.host.internal.PackageResult r4 = com.twofortyfouram.locale.sdk.host.internal.PackageResult.SETTINGS_CHANGED     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r5 = 8
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                com.twofortyfouram.locale.sdk.host.model.PluginType[] r3 = com.twofortyfouram.locale.sdk.host.model.PluginType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                $SwitchMap$com$twofortyfouram$locale$sdk$host$model$PluginType = r3
                com.twofortyfouram.locale.sdk.host.model.PluginType r4 = com.twofortyfouram.locale.sdk.host.model.PluginType.CONDITION     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r1 = $SwitchMap$com$twofortyfouram$locale$sdk$host$model$PluginType     // Catch:{ NoSuchFieldError -> 0x007b }
                com.twofortyfouram.locale.sdk.host.model.PluginType r3 = com.twofortyfouram.locale.sdk.host.model.PluginType.SETTING     // Catch:{ NoSuchFieldError -> 0x007b }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x007b }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x007b }
            L_0x007b:
                int[] r0 = $SwitchMap$com$twofortyfouram$locale$sdk$host$model$PluginType     // Catch:{ NoSuchFieldError -> 0x0085 }
                com.twofortyfouram.locale.sdk.host.model.PluginType r1 = com.twofortyfouram.locale.sdk.host.model.PluginType.EVENT     // Catch:{ NoSuchFieldError -> 0x0085 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0085 }
            L_0x0085:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.twofortyfouram.locale.sdk.host.internal.PluginRegistryHandler.C117981.<clinit>():void");
        }
    }

    private final class RegistryReceiver extends BroadcastReceiver {
        private RegistryReceiver() {
        }

        @Nullable
        private String getChangedPackage(@NonNull Intent intent) {
            Uri data = intent.getData();
            if (data != null) {
                return data.getSchemeSpecificPart();
            }
            return null;
        }

        private boolean isReplacing(@NonNull Intent intent) {
            return !intent.getBooleanExtra("android.intent.extra.REPLACING", false);
        }

        private void sendChangedPackageMessage(@Nullable String str) {
            if (str != null) {
                PluginRegistryHandler pluginRegistryHandler = PluginRegistryHandler.this;
                pluginRegistryHandler.sendMessage(pluginRegistryHandler.obtainMessage(1, str));
            }
        }

        public void onReceive(Context context, Intent intent) {
            String[] stringArrayExtra;
            if (!C13419d.m85855a(intent)) {
                String action = intent.getAction();
                if ("android.intent.action.PACKAGE_ADDED".equals(action) || "android.intent.action.PACKAGE_REMOVED".equals(action)) {
                    String changedPackage = getChangedPackage(intent);
                    if (!isReplacing(intent)) {
                        sendChangedPackageMessage(changedPackage);
                    }
                } else if ("android.intent.action.PACKAGE_REPLACED".equals(action) || "android.intent.action.PACKAGE_CHANGED".equals(action)) {
                    sendChangedPackageMessage(getChangedPackage(intent));
                } else if (("android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE".equals(action) || "android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE".equals(action)) && (stringArrayExtra = intent.getStringArrayExtra("android.intent.extra.changed_package_list")) != null) {
                    for (String sendChangedPackageMessage : stringArrayExtra) {
                        sendChangedPackageMessage(sendChangedPackageMessage);
                    }
                }
            }
        }

        /* synthetic */ RegistryReceiver(PluginRegistryHandler pluginRegistryHandler, C117981 r2) {
            this();
        }
    }

    public PluginRegistryHandler(@NonNull Looper looper, @NonNull Context context, @NonNull String str, @NonNull String str2) {
        super(looper);
        C12406a.m83260d(context, "context");
        C12406a.m83260d(str, "notificationAction");
        C12406a.m83260d(str2, "notificationPermission");
        this.mContext = C13303c.m85635a(context);
        Intent intent = new Intent(str);
        this.mRegistryReloadedIntent = intent;
        intent.setPackage(context.getPackageName());
        this.mRegistryReloadedPermission = str2;
    }

    @NonNull
    private Map<String, Plugin> getMutablePluginMap(@NonNull PluginType pluginType) {
        C12406a.m83260d(pluginType, "type");
        int i = C117981.$SwitchMap$com$twofortyfouram$locale$sdk$host$model$PluginType[pluginType.ordinal()];
        if (i == 1) {
            return this.mMutableConditionMap;
        }
        if (i == 2) {
            return this.mMutableSettingMap;
        }
        if (i == 3) {
            return this.mMutableEventMap;
        }
        throw new AssertionError();
    }

    private void handleDestroy() {
        this.mContext.unregisterReceiver(this.mReceiver);
        this.mReceiverHandlerThread.quit();
    }

    private void handleInit() {
        this.mReceiverHandlerThread = C13307f.m85642a(RegistryReceiver.class.getName(), C13307f.C13308a.BACKGROUND);
        Handler handler = new Handler(this.mReceiverHandlerThread.getLooper());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addDataScheme("package");
        this.mContext.registerReceiver(this.mReceiver, intentFilter, (String) null, handler);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE");
        intentFilter2.addAction("android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE");
        this.mContext.registerReceiver(this.mReceiver, intentFilter2, (String) null, handler);
        this.mMutableConditionMap = PluginPackageScanner.loadPluginMap(this.mContext, PluginType.CONDITION, (String) null);
        this.mMutableSettingMap = PluginPackageScanner.loadPluginMap(this.mContext, PluginType.SETTING, (String) null);
        this.mMutableEventMap = PluginPackageScanner.loadPluginMap(this.mContext, PluginType.EVENT, (String) null);
        setEvents();
        setConditions();
        setSettings();
        sendBroadcast();
    }

    @NonNull
    private PackageResult handlePackageAdded(@NonNull String str) {
        C12406a.m83260d(str, "packageName");
        PluginType pluginType = PluginType.CONDITION;
        boolean isPluginAdded = isPluginAdded(pluginType, PluginPackageScanner.loadPluginMap(this.mContext, pluginType, str));
        PluginType pluginType2 = PluginType.SETTING;
        boolean isPluginAdded2 = isPluginAdded(pluginType2, PluginPackageScanner.loadPluginMap(this.mContext, pluginType2, str));
        PluginType pluginType3 = PluginType.EVENT;
        return PackageResult.get(isPluginAdded, isPluginAdded2, isPluginAdded(pluginType3, PluginPackageScanner.loadPluginMap(this.mContext, pluginType3, str)));
    }

    @NonNull
    private PackageResult handlePackageChanged(@NonNull String str) {
        C12406a.m83260d(str, "packageName");
        Context context = this.mContext;
        PluginType pluginType = PluginType.CONDITION;
        Map<String, Plugin> loadPluginMap = PluginPackageScanner.loadPluginMap(context, pluginType, str);
        Context context2 = this.mContext;
        PluginType pluginType2 = PluginType.SETTING;
        Map<String, Plugin> loadPluginMap2 = PluginPackageScanner.loadPluginMap(context2, pluginType2, str);
        Context context3 = this.mContext;
        PluginType pluginType3 = PluginType.EVENT;
        Map<String, Plugin> loadPluginMap3 = PluginPackageScanner.loadPluginMap(context3, pluginType3, str);
        boolean z = false;
        boolean z2 = isPluginRemoved(pluginType, str, loadPluginMap) || isPluginAdded(pluginType, loadPluginMap);
        boolean z3 = isPluginRemoved(pluginType2, str, loadPluginMap2) || isPluginAdded(pluginType2, loadPluginMap2);
        if (isPluginRemoved(pluginType3, str, loadPluginMap3) || isPluginAdded(pluginType3, loadPluginMap2)) {
            z = true;
        }
        for (Plugin next : loadPluginMap.values()) {
            if (this.mImmutableConditionMap.containsKey(next.getRegistryName()) && this.mImmutableConditionMap.get(next.getRegistryName()).getVersionCode() != next.getVersionCode()) {
                z2 = true;
            }
            if (this.mImmutableEventMap.containsKey(next.getRegistryName()) && this.mImmutableEventMap.get(next.getRegistryName()).getVersionCode() != next.getVersionCode()) {
                z2 = true;
            }
        }
        return PackageResult.get(z2, z3, z);
    }

    @NonNull
    private PackageResult handlePackageRemoved(@NonNull String str) {
        C12406a.m83260d(str, "packageName");
        PluginType pluginType = PluginType.CONDITION;
        boolean isPluginRemoved = isPluginRemoved(pluginType, str, PluginPackageScanner.loadPluginMap(this.mContext, pluginType, str));
        PluginType pluginType2 = PluginType.SETTING;
        boolean isPluginRemoved2 = isPluginRemoved(pluginType2, str, PluginPackageScanner.loadPluginMap(this.mContext, pluginType2, str));
        PluginType pluginType3 = PluginType.EVENT;
        return PackageResult.get(isPluginRemoved, isPluginRemoved2, isPluginRemoved(pluginType3, str, PluginPackageScanner.loadPluginMap(this.mContext, pluginType3, str)));
    }

    private boolean isPluginAdded(@NonNull PluginType pluginType, @NonNull Map<String, Plugin> map) {
        C12406a.m83260d(pluginType, "type");
        C12406a.m83260d(map, "scannedPlugins");
        Map<String, Plugin> mutablePluginMap = getMutablePluginMap(pluginType);
        if (mutablePluginMap.keySet().containsAll(map.keySet())) {
            return false;
        }
        mutablePluginMap.putAll(map);
        return true;
    }

    private boolean isPluginRemoved(@NonNull PluginType pluginType, @NonNull String str, @NonNull Map<String, Plugin> map) {
        C12406a.m83260d(pluginType, "type");
        C12406a.m83260d(map, "scannedPlugins");
        Iterator<Plugin> it = getMutablePluginMap(pluginType).values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Plugin next = it.next();
            if (str.equals(next.getPackageName()) && !map.containsKey(next.getRegistryName())) {
                next.getRegistryName();
                it.remove();
                z = true;
            }
        }
        return z;
    }

    private void processPackageResult(@NonNull PackageResult packageResult) {
        C12406a.m83260d(packageResult, "result");
        switch (C117981.f57733xaf624d51[packageResult.ordinal()]) {
            case 2:
                setEvents();
                setConditions();
                setSettings();
                sendBroadcast();
                return;
            case 3:
                setConditions();
                setSettings();
                sendBroadcast();
                return;
            case 4:
                setEvents();
                setSettings();
                sendBroadcast();
                return;
            case 5:
                setEvents();
                setConditions();
                sendBroadcast();
                return;
            case 6:
                setEvents();
                sendBroadcast();
                return;
            case 7:
                setConditions();
                sendBroadcast();
                return;
            case 8:
                setSettings();
                sendBroadcast();
                return;
            default:
                return;
        }
    }

    private void sendBroadcast() {
        Intent intent = this.mRegistryReloadedIntent;
        if (intent != null) {
            this.mContext.sendBroadcast(intent, this.mRegistryReloadedPermission);
        }
    }

    private void setConditions() {
        this.mImmutableConditionMap = Collections.unmodifiableMap(new HashMap(this.mMutableConditionMap));
    }

    private void setEvents() {
        this.mImmutableEventMap = Collections.unmodifiableMap(new HashMap(this.mMutableEventMap));
    }

    private void setSettings() {
        this.mImmutableSettingMap = Collections.unmodifiableMap(new HashMap(this.mMutableSettingMap));
    }

    @Nullable
    public Map<String, Plugin> getConditions() {
        return this.mImmutableConditionMap;
    }

    @Nullable
    public Map<String, Plugin> getEvents() {
        return this.mImmutableEventMap;
    }

    @Nullable
    public Map<String, Plugin> getSettings() {
        return this.mImmutableSettingMap;
    }

    public void handleMessage(@NonNull Message message) {
        int i = message.what;
        if (i == 0) {
            CountDownLatch countDownLatch = (CountDownLatch) message.obj;
            try {
                handleInit();
            } finally {
                countDownLatch.countDown();
            }
        } else if (i == 1) {
            processPackageResult(handlePackageAdded((String) message.obj));
        } else if (i == 2) {
            processPackageResult(handlePackageRemoved((String) message.obj));
        } else if (i == 3) {
            processPackageResult(handlePackageChanged((String) message.obj));
        } else if (i == 4) {
            handleDestroy();
        } else {
            throw new AssertionError(C12447a.m83390g("Unrecognized what=%d", Integer.valueOf(message.what)));
        }
    }

    PluginRegistryHandler(@NonNull Looper looper, @NonNull Context context, @NonNull String str) {
        super(looper);
        C12406a.m83260d(context, "context");
        C12406a.m83260d(str, "notificationAction");
        this.mContext = C13303c.m85635a(context);
        Intent intent = new Intent(str);
        this.mRegistryReloadedIntent = intent;
        intent.setPackage(context.getPackageName());
        this.mRegistryReloadedPermission = null;
    }
}

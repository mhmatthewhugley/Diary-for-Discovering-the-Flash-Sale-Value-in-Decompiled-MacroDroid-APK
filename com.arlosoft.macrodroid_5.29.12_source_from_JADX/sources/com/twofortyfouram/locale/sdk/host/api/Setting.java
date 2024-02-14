package com.twofortyfouram.locale.sdk.host.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import com.twofortyfouram.locale.sdk.host.internal.BundleSerializer;
import com.twofortyfouram.locale.sdk.host.model.Plugin;
import com.twofortyfouram.locale.sdk.host.model.PluginInstanceData;
import com.twofortyfouram.locale.sdk.host.model.PluginType;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.util.concurrent.CountDownLatch;
import p276h8.C12406a;
import p285i8.C12447a;
import p295j8.C13303c;
import p295j8.C13307f;
import p305k8.C13419d;

public final class Setting {
    private static final int BROADCAST_TIMEOUT_MILLIS = 11000;
    @NonNull
    private final Context mContext;
    @NonNull
    private final Handler mHandler;
    @NonNull
    private final HandlerThread mHandlerThread;
    @NonNull
    private final Plugin mPlugin;

    private static final class FireResultReceiver extends BroadcastReceiver {
        @NonNull
        final CountDownLatch mLatch;

        private FireResultReceiver() {
            this.mLatch = new CountDownLatch(1);
        }

        public void onReceive(Context context, Intent intent) {
            try {
                if (!C13419d.m85855a(intent)) {
                    this.mLatch.countDown();
                }
            } finally {
                this.mLatch.countDown();
            }
        }
    }

    public Setting(@NonNull Context context, @NonNull Plugin plugin) {
        HandlerThread a = C13307f.m85642a(Setting.class.getName(), C13307f.C13308a.BACKGROUND);
        this.mHandlerThread = a;
        this.mHandler = new Handler(a.getLooper());
        C12406a.m83260d(context, "context");
        C12406a.m83260d(plugin, "plugin");
        if (PluginType.SETTING == plugin.getType()) {
            this.mContext = C13303c.m85635a(context);
            this.mPlugin = plugin;
            return;
        }
        throw new IllegalArgumentException("plugin.getType() must be SETTING");
    }

    private static void addFlagsHoneycombMr1(@NonNull Intent intent) {
        intent.addFlags(32);
    }

    public void destroy() {
        this.mHandlerThread.getLooper().quit();
    }

    public void fire(@NonNull PluginInstanceData pluginInstanceData, Intent intent) {
        C12406a.m83260d(pluginInstanceData, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        try {
            fire(BundleSerializer.deserializeFromByteArray(pluginInstanceData.getSerializedBundle()), intent);
        } catch (Exception e) {
            C12447a.m83384a("Error deserializing bundle", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r12.mContext.sendBroadcast(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0087 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void fire(@androidx.annotation.NonNull android.os.Bundle r13, android.content.Intent r14) {
        /*
            r12 = this;
            java.lang.String r0 = "pluginBundle"
            p276h8.C12406a.m83260d(r13, r0)
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.twofortyfouram.locale.sdk.host.model.Plugin r2 = r12.mPlugin
            java.lang.String r2 = r2.getRegistryName()
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "Firing plug-in setting %s"
            p285i8.C12447a.m83384a(r2, r1)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "com.twofortyfouram.locale.intent.action.FIRE_SETTING"
            r1.setAction(r2)
            r2 = 4
            r1.setFlags(r2)
            r2 = 12
            boolean r2 = p295j8.C13301a.m85633a(r2)
            if (r2 == 0) goto L_0x002f
            addFlagsHoneycombMr1(r1)
        L_0x002f:
            r2 = 126(0x7e, float:1.77E-43)
            com.twofortyfouram.locale.sdk.host.TaskerPlugin.Host.addCapabilities(r1, r2)
            com.twofortyfouram.locale.sdk.host.TaskerPlugin.Host.addCompletionIntent(r1, r14)
            com.twofortyfouram.locale.sdk.host.model.Plugin r14 = r12.mPlugin
            java.lang.String r14 = r14.getPackageName()
            com.twofortyfouram.locale.sdk.host.model.Plugin r2 = r12.mPlugin
            java.lang.String r2 = r2.getReceiverClassName()
            r1.setClassName(r14, r2)
            java.lang.String r14 = "com.twofortyfouram.locale.intent.extra.BUNDLE"
            r1.putExtra(r14, r13)
            com.twofortyfouram.locale.sdk.host.model.Plugin r14 = r12.mPlugin
            com.twofortyfouram.locale.sdk.host.model.PluginConfiguration r14 = r14.getConfiguration()
            boolean r14 = r14.isBackwardsCompatibilityEnabled()
            if (r14 == 0) goto L_0x005a
            r1.putExtras(r13)
        L_0x005a:
            com.twofortyfouram.locale.sdk.host.api.Setting$FireResultReceiver r13 = new com.twofortyfouram.locale.sdk.host.api.Setting$FireResultReceiver     // Catch:{ Exception -> 0x008d }
            r14 = 0
            r13.<init>()     // Catch:{ Exception -> 0x008d }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x008d }
            android.content.Context r4 = r12.mContext     // Catch:{ Exception -> 0x008d }
            r6 = 0
            android.os.Handler r8 = r12.mHandler     // Catch:{ Exception -> 0x008d }
            r9 = 18
            r10 = 0
            r11 = 0
            r5 = r1
            r7 = r13
            r4.sendOrderedBroadcast(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x008d }
            java.util.concurrent.CountDownLatch r13 = r13.mLatch     // Catch:{ InterruptedException -> 0x0087 }
            r4 = 11000(0x2af8, double:5.4347E-320)
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0087 }
            boolean r13 = r13.await(r4, r14)     // Catch:{ InterruptedException -> 0x0087 }
            if (r13 != 0) goto L_0x0083
            android.content.Context r13 = r12.mContext     // Catch:{ InterruptedException -> 0x0087 }
            r13.sendBroadcast(r1)     // Catch:{ InterruptedException -> 0x0087 }
            goto L_0x0097
        L_0x0083:
            android.os.SystemClock.elapsedRealtime()     // Catch:{ InterruptedException -> 0x0087 }
            goto L_0x0097
        L_0x0087:
            android.content.Context r13 = r12.mContext     // Catch:{ Exception -> 0x008d }
            r13.sendBroadcast(r1)     // Catch:{ Exception -> 0x008d }
            goto L_0x0097
        L_0x008d:
            r13 = move-exception
            java.lang.Object[] r14 = new java.lang.Object[r0]
            r14[r3] = r13
            java.lang.String r13 = "Could not fire plug-in setting%s"
            p285i8.C12447a.m83384a(r13, r14)
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.twofortyfouram.locale.sdk.host.api.Setting.fire(android.os.Bundle, android.content.Intent):void");
    }
}

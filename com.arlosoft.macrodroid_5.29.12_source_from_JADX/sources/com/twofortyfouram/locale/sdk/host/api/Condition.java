package com.twofortyfouram.locale.sdk.host.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.core.util.Pair;
import com.twofortyfouram.locale.sdk.host.TaskerPlugin;
import com.twofortyfouram.locale.sdk.host.internal.BundleSerializer;
import com.twofortyfouram.locale.sdk.host.model.Plugin;
import com.twofortyfouram.locale.sdk.host.model.PluginInstanceData;
import com.twofortyfouram.locale.sdk.host.model.PluginType;
import dev.skomlach.biometric.compat.engine.internal.face.miui.impl.Miui3DFaceManagerImpl;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p276h8.C12406a;
import p285i8.C12447a;
import p295j8.C13303c;
import p295j8.C13307f;
import p305k8.C13419d;

public final class Condition {
    private static final int BROADCAST_TIMEOUT_MILLIS = 11000;
    private Context mContext;
    @NonNull
    private final Handler mHandler;
    @NonNull
    private final HandlerThread mHandlerThread;
    private Plugin mPlugin;

    @Retention(RetentionPolicy.SOURCE)
    @interface ConditionResult {
    }

    private static final class QueryResultReceiver extends BroadcastReceiver {
        @NonNull
        final CountDownLatch mLatch;
        @NonNull
        final AtomicInteger mQueryResult;
        Bundle variablesBundle;

        private QueryResultReceiver() {
            this.mLatch = new CountDownLatch(1);
            this.mQueryResult = new AtomicInteger(18);
            this.variablesBundle = null;
        }

        public void onReceive(Context context, Intent intent) {
            try {
                if (C13419d.m85855a(intent)) {
                    this.mQueryResult.set(18);
                    return;
                }
                switch (getResultCode()) {
                    case 16:
                        if (getResultExtras(true) != null) {
                            this.variablesBundle = TaskerPlugin.Host.getVariablesBundle(getResultExtras(true));
                        } else {
                            this.variablesBundle = null;
                        }
                        C12447a.m83384a("Got RESULT_CONDITION_SATISFIED", new Object[0]);
                        this.mQueryResult.set(16);
                        break;
                    case 17:
                        C12447a.m83384a("Got RESULT_CONDITION_UNSATISFIED", new Object[0]);
                        this.mQueryResult.set(17);
                        break;
                    case 18:
                        C12447a.m83384a("Got RESULT_CONDITION_UNKNOWN", new Object[0]);
                        this.mQueryResult.set(18);
                        break;
                    default:
                        getResultCode();
                        this.mQueryResult.set(18);
                        break;
                }
                this.mLatch.countDown();
            } finally {
                this.mLatch.countDown();
            }
        }
    }

    public Condition(@NonNull Context context, @NonNull Plugin plugin) {
        HandlerThread a = C13307f.m85642a(Condition.class.getName(), C13307f.C13308a.BACKGROUND);
        this.mHandlerThread = a;
        this.mHandler = new Handler(a.getLooper());
        C12406a.m83260d(context, "context");
        C12406a.m83260d(plugin, "plugin");
        if (PluginType.CONDITION == plugin.getType()) {
            this.mContext = C13303c.m85635a(context);
            this.mPlugin = plugin;
            return;
        }
        throw new IllegalArgumentException("plugin.getType() must be CONDITION");
    }

    private static void addFlagsHoneycombMr1(@NonNull Intent intent) {
        intent.addFlags(32);
    }

    @NonNull
    private static Intent newQueryIntent(@NonNull Plugin plugin, @NonNull Bundle bundle) {
        C12406a.m83260d(plugin, "plugin");
        C12406a.m83260d(bundle, "extraBundle");
        Intent intent = new Intent();
        intent.setAction("com.twofortyfouram.locale.intent.action.QUERY_CONDITION");
        intent.setFlags(4);
        TaskerPlugin.Host.addCapabilities(intent, 126);
        addFlagsHoneycombMr1(intent);
        intent.setClassName(plugin.getPackageName(), plugin.getReceiverClassName());
        intent.putExtra("com.twofortyfouram.locale.intent.extra.BUNDLE", bundle);
        return intent;
    }

    public void destroy() {
        this.mHandlerThread.getLooper().quit();
        this.mContext = null;
        this.mPlugin = null;
    }

    public Pair<Integer, Bundle> query(@NonNull PluginInstanceData pluginInstanceData, int i) {
        C12406a.m83260d(pluginInstanceData, Miui3DFaceManagerImpl.TABLE_TEMPLATE_COLUMN_DATA);
        C12406a.m83257a(i, 16, 18, "previousState");
        try {
            return query(BundleSerializer.deserializeFromByteArray(pluginInstanceData.getSerializedBundle()), i);
        } catch (Exception e) {
            C12447a.m83384a("Error deserializing bundle", e);
            return new Pair<>(18, null);
        }
    }

    private Pair<Integer, Bundle> query(@NonNull Bundle bundle, int i) {
        C12406a.m83260d(bundle, "pluginBundle");
        C12406a.m83257a(i, 16, 18, "previousState");
        C12447a.m83384a("Querying plug-in condition %s", this.mPlugin.getRegistryName());
        Intent newQueryIntent = newQueryIntent(this.mPlugin, bundle);
        TaskerPlugin.Host.addCapabilities(newQueryIntent, 126);
        QueryResultReceiver queryResultReceiver = new QueryResultReceiver();
        SystemClock.elapsedRealtime();
        this.mContext.sendOrderedBroadcast(newQueryIntent, (String) null, queryResultReceiver, this.mHandler, i, (String) null, (Bundle) null);
        try {
            if (queryResultReceiver.mLatch.await(11000, TimeUnit.MILLISECONDS)) {
                SystemClock.elapsedRealtime();
            }
        } catch (InterruptedException unused) {
        }
        return new Pair<>(Integer.valueOf(queryResultReceiver.mQueryResult.get()), queryResultReceiver.variablesBundle);
    }
}

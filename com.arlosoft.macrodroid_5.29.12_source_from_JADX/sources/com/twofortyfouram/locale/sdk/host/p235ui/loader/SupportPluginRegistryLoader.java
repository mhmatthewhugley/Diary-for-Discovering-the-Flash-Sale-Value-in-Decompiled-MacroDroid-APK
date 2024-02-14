package com.twofortyfouram.locale.sdk.host.p235ui.loader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.loader.content.AsyncTaskLoader;
import com.twofortyfouram.locale.sdk.host.api.PluginRegistry;
import com.twofortyfouram.locale.sdk.host.internal.UiConfigChangeChecker;
import com.twofortyfouram.locale.sdk.host.model.Plugin;
import com.twofortyfouram.locale.sdk.host.model.PluginType;
import java.util.Map;
import p276h8.C12406a;
import p295j8.C13303c;
import p305k8.C13419d;

/* renamed from: com.twofortyfouram.locale.sdk.host.ui.loader.SupportPluginRegistryLoader */
public final class SupportPluginRegistryLoader extends AsyncTaskLoader<Map<String, Plugin>> {
    @NonNull
    private final UiConfigChangeChecker mLastConfig = new UiConfigChangeChecker();
    @NonNull
    private final PluginRegistry mPluginRegistry;
    /* access modifiers changed from: private */
    @Nullable
    public RegistryReloadReceiver mReceiver = null;
    @Nullable
    private Map<String, Plugin> mResult = null;
    @NonNull
    private final PluginType mType;

    /* renamed from: com.twofortyfouram.locale.sdk.host.ui.loader.SupportPluginRegistryLoader$RegistryReloadReceiver */
    private final class RegistryReloadReceiver extends BroadcastReceiver {
        private RegistryReloadReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            C12406a.m83258b();
            if (!C13419d.m85855a(intent) && this == SupportPluginRegistryLoader.this.mReceiver) {
                SupportPluginRegistryLoader.this.onContentChanged();
            }
        }
    }

    public SupportPluginRegistryLoader(@NonNull Context context, @NonNull PluginType pluginType) {
        super(C13303c.m85635a(context));
        C12406a.m83260d(pluginType, "type");
        this.mType = pluginType;
        this.mPluginRegistry = PluginRegistry.getInstance(getContext());
    }

    /* access modifiers changed from: protected */
    public void onReset() {
        C12406a.m83258b();
        onStopLoading();
        if (this.mReceiver != null) {
            getContext().unregisterReceiver(this.mReceiver);
            this.mReceiver = null;
        }
        this.mResult = null;
        super.onReset();
    }

    /* access modifiers changed from: protected */
    public void onStartLoading() {
        C12406a.m83258b();
        if (this.mReceiver == null) {
            IntentFilter intentFilter = new IntentFilter(this.mPluginRegistry.getChangeIntentAction());
            this.mReceiver = new RegistryReloadReceiver();
            getContext().registerReceiver(this.mReceiver, intentFilter, this.mPluginRegistry.getChangeIntentPermission(), (Handler) null);
        }
        Map<String, Plugin> map = this.mResult;
        if (map != null) {
            deliverResult(map);
        }
        boolean checkNewConfig = this.mLastConfig.checkNewConfig(getContext().getResources());
        if (takeContentChanged() || this.mResult == null || checkNewConfig) {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public void onStopLoading() {
        C12406a.m83258b();
        cancelLoad();
    }

    public void deliverResult(Map<String, Plugin> map) {
        C12406a.m83258b();
        if (map != this.mResult) {
            this.mResult = map;
            if (isStarted()) {
                super.deliverResult(this.mResult);
            }
        }
    }

    @WorkerThread
    public Map<String, Plugin> loadInBackground() {
        return this.mPluginRegistry.getPluginMap(this.mType);
    }
}

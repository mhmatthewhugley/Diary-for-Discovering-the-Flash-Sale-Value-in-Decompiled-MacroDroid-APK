package com.twofortyfouram.locale.sdk.client.receiver;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.twofortyfouram.locale.sdk.client.internal.C11783d;
import p295j8.C13301a;
import p305k8.C13419d;

public abstract class AbstractPluginSettingReceiver extends C11783d {
    /* access modifiers changed from: protected */
    public abstract void firePluginSetting(@NonNull Context context, @NonNull Bundle bundle);

    /* access modifiers changed from: protected */
    public abstract boolean isAsync();

    /* access modifiers changed from: protected */
    public abstract boolean isBundleValid(@NonNull Bundle bundle);

    public final void onReceive(Context context, Intent intent) {
        if (C13419d.m85855a(intent) || !"com.twofortyfouram.locale.intent.action.FIRE_SETTING".equals(intent.getAction())) {
            return;
        }
        if (context.getPackageName().equals(intent.getPackage()) || new ComponentName(context, getClass().getName()).equals(intent.getComponent())) {
            Bundle bundleExtra = intent.getBundleExtra("com.twofortyfouram.locale.intent.extra.BUNDLE");
            if (C13419d.m85855a(intent) || bundleExtra == null || !isBundleValid(bundleExtra)) {
                return;
            }
            if (!isAsync() || !C13301a.m85633a(11)) {
                firePluginSetting(context, bundleExtra);
            } else {
                mo67004a(new C11783d.C11784a(context, bundleExtra) {

                    /* renamed from: a */
                    final /* synthetic */ Context f57723a;

                    /* renamed from: b */
                    final /* synthetic */ Bundle f57724b;
                    @NonNull

                    /* renamed from: d */
                    private final Context f57726d;
                    @NonNull

                    /* renamed from: e */
                    private final Bundle f57727e;

                    {
                        this.f57723a = r2;
                        this.f57724b = r3;
                        this.f57726d = r2;
                        this.f57727e = r3;
                    }

                    /* renamed from: a */
                    public final int mo67005a() {
                        AbstractPluginSettingReceiver.this.firePluginSetting(this.f57726d, this.f57727e);
                        return -1;
                    }
                }, isOrderedBroadcast());
            }
        }
    }
}

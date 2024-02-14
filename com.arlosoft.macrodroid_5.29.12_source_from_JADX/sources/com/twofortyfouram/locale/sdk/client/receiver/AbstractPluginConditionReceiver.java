package com.twofortyfouram.locale.sdk.client.receiver;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.twofortyfouram.locale.sdk.client.internal.C11783d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p285i8.C12447a;
import p295j8.C13301a;
import p305k8.C13419d;

public abstract class AbstractPluginConditionReceiver extends C11783d {

    @Retention(RetentionPolicy.SOURCE)
    public @interface ConditionResult {
    }

    /* renamed from: a */
    static void m82005a(int i) {
        if (16 != i && 17 != i && 18 != i) {
            throw new AssertionError(C12447a.m83390g("result=%d is not one of [%d, %d, %d]", Integer.valueOf(i), 16, 17, 18));
        }
    }

    /* access modifiers changed from: protected */
    public abstract int getPluginConditionResult(@NonNull Context context, @NonNull Bundle bundle);

    /* access modifiers changed from: protected */
    public abstract boolean isAsync();

    /* access modifiers changed from: protected */
    public abstract boolean isBundleValid(@NonNull Bundle bundle);

    public final void onReceive(Context context, Intent intent) {
        if (C13419d.m85855a(intent) || !isOrderedBroadcast()) {
            return;
        }
        if (!"com.twofortyfouram.locale.intent.action.QUERY_CONDITION".equals(intent.getAction())) {
            setResultCode(18);
        } else if (!new ComponentName(context, getClass().getName()).equals(intent.getComponent())) {
            setResultCode(18);
            abortBroadcast();
        } else {
            Bundle bundleExtra = intent.getBundleExtra("com.twofortyfouram.locale.intent.extra.BUNDLE");
            if (!C13419d.m85855a(intent)) {
                if (bundleExtra == null) {
                    setResultCode(18);
                } else if (!isBundleValid(bundleExtra)) {
                    setResultCode(18);
                } else if (!isAsync() || !C13301a.m85633a(11)) {
                    int pluginConditionResult = getPluginConditionResult(context, bundleExtra);
                    m82005a(pluginConditionResult);
                    setResultCode(pluginConditionResult);
                } else {
                    mo67004a(new C11783d.C11784a(context, bundleExtra) {

                        /* renamed from: a */
                        final /* synthetic */ Context f57718a;

                        /* renamed from: b */
                        final /* synthetic */ Bundle f57719b;
                        @NonNull

                        /* renamed from: d */
                        private final Context f57721d;
                        @NonNull

                        /* renamed from: e */
                        private final Bundle f57722e;

                        {
                            this.f57718a = r2;
                            this.f57719b = r3;
                            this.f57721d = r2;
                            this.f57722e = r3;
                        }

                        /* renamed from: a */
                        public final int mo67005a() {
                            int pluginConditionResult = AbstractPluginConditionReceiver.this.getPluginConditionResult(this.f57721d, this.f57722e);
                            AbstractPluginConditionReceiver.m82005a(pluginConditionResult);
                            return pluginConditionResult;
                        }
                    }, isOrderedBroadcast());
                }
            }
        }
    }
}

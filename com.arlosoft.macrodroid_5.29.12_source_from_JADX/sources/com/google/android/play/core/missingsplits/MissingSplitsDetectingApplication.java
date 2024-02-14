package com.google.android.play.core.missingsplits;

import android.app.Application;

@Deprecated
/* compiled from: com.google.android.play:core@@1.10.3 */
public class MissingSplitsDetectingApplication extends Application {

    /* renamed from: a */
    private boolean f51732a = false;

    @Deprecated
    /* renamed from: a */
    public void mo59915a() {
    }

    public final void onCreate() {
        if (!this.f51732a) {
            this.f51732a = true;
            if (!MissingSplitsManagerFactory.m71034a(this).mo59917a()) {
                super.onCreate();
                mo59915a();
                return;
            }
            return;
        }
        throw new IllegalStateException("The onCreate method must be invoked at most once.");
    }
}

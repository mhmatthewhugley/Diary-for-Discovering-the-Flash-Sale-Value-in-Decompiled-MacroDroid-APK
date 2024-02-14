package com.google.firebase.crashlytics.internal;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;
import java.io.InputStream;

public class DevelopmentPlatformProvider {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f4845a;
    @Nullable

    /* renamed from: b */
    private DevelopmentPlatform f4846b = null;

    private class DevelopmentPlatform {
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: a */
        public final String f4847a;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: b */
        public final String f4848b;

        private DevelopmentPlatform() {
            int q = CommonUtils.m6594q(DevelopmentPlatformProvider.this.f4845a, "com.google.firebase.crashlytics.unity_version", TypedValues.Custom.S_STRING);
            if (q != 0) {
                this.f4847a = "Unity";
                String string = DevelopmentPlatformProvider.this.f4845a.getResources().getString(q);
                this.f4848b = string;
                Logger f = Logger.m6525f();
                f.mo22960i("Unity Editor version is: " + string);
            } else if (DevelopmentPlatformProvider.this.m6518c("flutter_assets/NOTICES.Z")) {
                this.f4847a = "Flutter";
                this.f4848b = null;
                Logger.m6525f().mo22960i("Development platform is: Flutter");
            } else {
                this.f4847a = null;
                this.f4848b = null;
            }
        }
    }

    public DevelopmentPlatformProvider(Context context) {
        this.f4845a = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m6518c(String str) {
        if (this.f4845a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.f4845a.getAssets().open(str);
            if (open != null) {
                open.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: f */
    private DevelopmentPlatform m6519f() {
        if (this.f4846b == null) {
            this.f4846b = new DevelopmentPlatform();
        }
        return this.f4846b;
    }

    @Nullable
    /* renamed from: d */
    public String mo22952d() {
        return m6519f().f4847a;
    }

    @Nullable
    /* renamed from: e */
    public String mo22953e() {
        return m6519f().f4848b;
    }
}

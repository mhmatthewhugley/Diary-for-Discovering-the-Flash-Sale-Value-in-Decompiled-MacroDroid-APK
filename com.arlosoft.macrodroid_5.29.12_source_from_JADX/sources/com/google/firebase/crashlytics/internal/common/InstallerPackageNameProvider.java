package com.google.firebase.crashlytics.internal.common;

import android.content.Context;

class InstallerPackageNameProvider {

    /* renamed from: a */
    private String f5022a;

    InstallerPackageNameProvider() {
    }

    /* renamed from: b */
    private static String m6767b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized String mo23055a(Context context) {
        if (this.f5022a == null) {
            this.f5022a = m6767b(context);
        }
        return "".equals(this.f5022a) ? null : this.f5022a;
    }
}

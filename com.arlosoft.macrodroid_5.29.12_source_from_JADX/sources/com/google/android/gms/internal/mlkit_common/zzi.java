package com.google.android.gms.internal.mlkit_common;

import android.os.Build;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final class zzi {

    /* renamed from: a */
    private static final String[] f42659a = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze"};

    /* renamed from: b */
    private static final String[] f42660b;

    /* renamed from: c */
    private static final String[] f42661c;

    /* renamed from: d */
    public static final /* synthetic */ int f42662d = 0;

    static {
        String[] strArr = new String[2];
        strArr[0] = "media";
        String str = Build.HARDWARE;
        String str2 = "";
        strArr[1] = true != (str.equals("goldfish") || str.equals("ranchu")) ? str2 : "androidx.test.services.storage.runfiles";
        f42660b = strArr;
        String[] strArr2 = new String[3];
        int i = Build.VERSION.SDK_INT;
        strArr2[0] = i <= 25 ? "com.google.android.inputmethod.latin.inputcontent" : str2;
        if (i <= 25) {
            str2 = "com.google.android.inputmethod.latin.dev.inputcontent";
        }
        strArr2[1] = str2;
        strArr2[2] = "com.google.android.apps.docs.storage.legacy";
        f42661c = strArr2;
    }
}

package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zzfo implements zzfsy {

    /* renamed from: a */
    public static final /* synthetic */ zzfo f36183a = new zzfo();

    private /* synthetic */ zzfo() {
    }

    /* renamed from: a */
    public final boolean mo45704a(Object obj) {
        String str = (String) obj;
        if (str == null) {
            return false;
        }
        String a = zzfse.m50915a(str);
        if (!TextUtils.isEmpty(a)) {
            return (!a.contains("text") || a.contains("text/vtt")) && !a.contains("html") && !a.contains("xml");
        }
        return false;
    }
}

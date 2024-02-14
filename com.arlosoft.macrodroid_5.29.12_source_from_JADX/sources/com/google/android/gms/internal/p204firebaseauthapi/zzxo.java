package com.google.android.gms.internal.p204firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.LibraryVersion;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxo */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzxo {

    /* renamed from: a */
    private final int f40596a;

    public zzxo(String str) {
        int i = -1;
        try {
            List d = zzaf.m56722c("[.-]").mo49156d(str);
            if (d.size() == 1) {
                i = Integer.parseInt(str);
            } else if (d.size() >= 3) {
                i = (Integer.parseInt((String) d.get(0)) * 1000000) + (Integer.parseInt((String) d.get(1)) * 1000) + Integer.parseInt((String) d.get(2));
            }
        } catch (IllegalArgumentException e) {
            if (Log.isLoggable("LibraryVersionContainer", 3)) {
                String.format("Version code parsing failed for: %s with exception %s.", new Object[]{str, e});
            }
        }
        this.f40596a = i;
    }

    /* renamed from: a */
    public static zzxo m58381a() {
        String b = LibraryVersion.m4468a().mo21718b("firebase-auth");
        if (TextUtils.isEmpty(b) || b.equals("UNKNOWN")) {
            b = "-1";
        }
        return new zzxo(b);
    }

    /* renamed from: b */
    public final String mo50038b() {
        return String.format("X%s", new Object[]{Integer.toString(this.f40596a)});
    }
}

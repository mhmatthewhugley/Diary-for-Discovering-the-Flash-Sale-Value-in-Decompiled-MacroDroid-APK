package com.arlosoft.macrodroid.utils;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.FirebaseCrashlytics;

/* renamed from: com.arlosoft.macrodroid.utils.q1 */
/* compiled from: UriHelper */
public class C6420q1 {
    /* renamed from: a */
    public static String m24719a(@NonNull Context context, Uri uri) {
        String str = "";
        if (uri == null) {
            return str;
        }
        try {
            Cursor query = context.getContentResolver().query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
            if (query != null) {
                if (query.moveToFirst()) {
                    String string = query.getString(query.getColumnIndex("_display_name"));
                    if (string != null) {
                        str = string;
                    }
                }
                query.close();
            }
        } catch (IllegalArgumentException e) {
            FirebaseCrashlytics.m6487a().mo22936d(e);
        }
        return str;
    }
}

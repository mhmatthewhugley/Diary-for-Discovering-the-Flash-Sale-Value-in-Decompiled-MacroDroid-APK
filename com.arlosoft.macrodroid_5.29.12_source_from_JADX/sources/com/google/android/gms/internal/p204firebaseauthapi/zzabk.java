package com.google.android.gms.internal.p204firebaseauthapi;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabk */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzabk {
    @NonNull
    /* renamed from: a */
    public static zzvg m56110a(@NonNull Exception exc, @NonNull String str, @NonNull String str2) {
        String message = exc.getMessage();
        Log.e(str, "Failed to parse " + str + " for string [" + str2 + "] with exception: " + message);
        return new zzvg("Failed to parse " + str + " for string [" + str2 + "]", exc);
    }

    @NonNull
    /* renamed from: b */
    public static List m56111b(@Nullable JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
        }
        return arrayList;
    }
}

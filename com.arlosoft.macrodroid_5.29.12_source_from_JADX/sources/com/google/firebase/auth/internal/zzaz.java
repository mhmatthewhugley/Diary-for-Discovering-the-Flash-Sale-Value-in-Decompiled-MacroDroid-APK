package com.google.firebase.auth.internal;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.p204firebaseauthapi.zzaf;
import com.google.android.gms.internal.p204firebaseauthapi.zzqx;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.p353io.FilenameUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class zzaz {

    /* renamed from: a */
    private static final Logger f4628a = new Logger("JSONParser", new String[0]);

    @VisibleForTesting
    /* renamed from: a */
    static List m6195a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = m6195a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m6198d((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: b */
    public static Map m6196b(String str) {
        Preconditions.m4484g(str);
        List d = zzaf.m56721b(FilenameUtils.EXTENSION_SEPARATOR).mo49156d(str);
        if (d.size() < 2) {
            f4628a.mo21839c("Invalid idToken ".concat(String.valueOf(str)), new Object[0]);
            return new HashMap();
        }
        try {
            Map c = m6197c(new String(Base64Utils.m4852b((String) d.get(1)), "UTF-8"));
            return c == null ? new HashMap() : c;
        } catch (UnsupportedEncodingException e) {
            f4628a.mo21838b("Unable to decode token", e, new Object[0]);
            return new HashMap();
        }
    }

    @Nullable
    /* renamed from: c */
    public static Map m6197c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return m6198d(jSONObject);
            }
            return null;
        } catch (Exception e) {
            throw new zzqx(e);
        }
    }

    @VisibleForTesting
    /* renamed from: d */
    static Map m6198d(JSONObject jSONObject) throws JSONException {
        ArrayMap arrayMap = new ArrayMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = m6195a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = m6198d((JSONObject) obj);
            }
            arrayMap.put(next, obj);
        }
        return arrayMap;
    }
}

package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

class MetaDataStore {

    /* renamed from: b */
    private static final Charset f5047b = Charset.forName("UTF-8");

    /* renamed from: a */
    private final FileStore f5048a;

    public MetaDataStore(FileStore fileStore) {
        this.f5048a = fileStore;
    }

    /* renamed from: d */
    private static Map<String, String> m6840d(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m6844j(jSONObject, next));
        }
        return hashMap;
    }

    @Nullable
    /* renamed from: e */
    private String m6841e(String str) throws JSONException {
        return m6844j(new JSONObject(str), "userId");
    }

    /* renamed from: h */
    private static void m6842h(File file) {
        if (file.exists() && file.delete()) {
            Logger f = Logger.m6525f();
            f.mo22958g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    /* renamed from: i */
    private static String m6843i(String str) throws JSONException {
        return new JSONObject(str) {

            /* renamed from: a */
            final /* synthetic */ String f5049a;

            {
                this.f5049a = r2;
                put("userId", r2);
            }
        }.toString();
    }

    /* renamed from: j */
    private static String m6844j(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str, (String) null);
        }
        return null;
    }

    @NonNull
    /* renamed from: a */
    public File mo23087a(String str) {
        return this.f5048a.mo23510o(str, "internal-keys");
    }

    @NonNull
    /* renamed from: b */
    public File mo23088b(String str) {
        return this.f5048a.mo23510o(str, "keys");
    }

    @NonNull
    /* renamed from: c */
    public File mo23089c(String str) {
        return this.f5048a.mo23510o(str, "user-data");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Map<String, String> mo23090f(String str, boolean z) {
        Exception e;
        FileInputStream fileInputStream;
        File a = z ? mo23087a(str) : mo23088b(str);
        if (!a.exists() || a.length() == 0) {
            m6842h(a);
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(a);
            try {
                Map<String, String> d = m6840d(CommonUtils.m6577B(fileInputStream));
                CommonUtils.m6582e(fileInputStream, "Failed to close user metadata file.");
                return d;
            } catch (Exception e2) {
                e = e2;
                try {
                    Logger.m6525f().mo22963l("Error deserializing user metadata.", e);
                    m6842h(a);
                    CommonUtils.m6582e(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    CommonUtils.m6582e(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            }
        } catch (Exception e3) {
            Exception exc = e3;
            fileInputStream = null;
            e = exc;
            Logger.m6525f().mo22963l("Error deserializing user metadata.", e);
            m6842h(a);
            CommonUtils.m6582e(fileInputStream, "Failed to close user metadata file.");
            return Collections.emptyMap();
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.m6582e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    @Nullable
    /* renamed from: g */
    public String mo23091g(String str) {
        FileInputStream fileInputStream;
        File c = mo23089c(str);
        FileInputStream fileInputStream2 = null;
        if (!c.exists() || c.length() == 0) {
            Logger.m6525f().mo22954b("No userId set for session " + str);
            m6842h(c);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(c);
            try {
                String e = m6841e(CommonUtils.m6577B(fileInputStream));
                Logger.m6525f().mo22954b("Loaded userId " + e + " for session " + str);
                CommonUtils.m6582e(fileInputStream, "Failed to close user metadata file.");
                return e;
            } catch (Exception e2) {
                e = e2;
                try {
                    Logger.m6525f().mo22963l("Error deserializing user metadata.", e);
                    m6842h(c);
                    CommonUtils.m6582e(fileInputStream, "Failed to close user metadata file.");
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    CommonUtils.m6582e(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
            Logger.m6525f().mo22963l("Error deserializing user metadata.", e);
            m6842h(c);
            CommonUtils.m6582e(fileInputStream, "Failed to close user metadata file.");
            return null;
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.m6582e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    /* renamed from: k */
    public void mo23092k(String str, String str2) {
        File c = mo23089c(str);
        BufferedWriter bufferedWriter = null;
        try {
            String i = m6843i(str2);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c), f5047b));
            try {
                bufferedWriter2.write(i);
                bufferedWriter2.flush();
                CommonUtils.m6582e(bufferedWriter2, "Failed to close user metadata file.");
            } catch (Exception e) {
                e = e;
                bufferedWriter = bufferedWriter2;
                try {
                    Logger.m6525f().mo22963l("Error serializing user metadata.", e);
                    CommonUtils.m6582e(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    CommonUtils.m6582e(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                CommonUtils.m6582e(bufferedWriter, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            Logger.m6525f().mo22963l("Error serializing user metadata.", e);
            CommonUtils.m6582e(bufferedWriter, "Failed to close user metadata file.");
        }
    }
}

package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

public class CachedSettingsIo {

    /* renamed from: a */
    private final File f5476a;

    public CachedSettingsIo(FileStore fileStore) {
        this.f5476a = fileStore.mo23501e("com.crashlytics.settings.json");
    }

    /* renamed from: a */
    private File m7575a() {
        return this.f5476a;
    }

    /* renamed from: b */
    public JSONObject mo23517b() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        Logger.m6525f().mo22954b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            File a = m7575a();
            if (a.exists()) {
                fileInputStream = new FileInputStream(a);
                try {
                    jSONObject = new JSONObject(CommonUtils.m6577B(fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception e) {
                    e = e;
                    try {
                        Logger.m6525f().mo22957e("Failed to fetch cached settings", e);
                        CommonUtils.m6582e(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        CommonUtils.m6582e(fileInputStream, "Error while closing settings cache file.");
                        throw th;
                    }
                }
            } else {
                Logger.m6525f().mo22960i("Settings file does not exist.");
                jSONObject = null;
            }
            CommonUtils.m6582e(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
            Logger.m6525f().mo22957e("Failed to fetch cached settings", e);
            CommonUtils.m6582e(fileInputStream, "Error while closing settings cache file.");
            return null;
        } catch (Throwable th2) {
            fileInputStream = null;
            th = th2;
            CommonUtils.m6582e(fileInputStream, "Error while closing settings cache file.");
            throw th;
        }
    }

    /* renamed from: c */
    public void mo23518c(long j, JSONObject jSONObject) {
        Logger.m6525f().mo22960i("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                jSONObject.put("expires_at", j);
                FileWriter fileWriter2 = new FileWriter(m7575a());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    CommonUtils.m6582e(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e) {
                    e = e;
                    fileWriter = fileWriter2;
                    try {
                        Logger.m6525f().mo22957e("Failed to cache settings", e);
                        CommonUtils.m6582e(fileWriter, "Failed to close settings writer.");
                    } catch (Throwable th) {
                        th = th;
                        CommonUtils.m6582e(fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    CommonUtils.m6582e(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                Logger.m6525f().mo22957e("Failed to cache settings", e);
                CommonUtils.m6582e(fileWriter, "Failed to close settings writer.");
            }
        }
    }
}

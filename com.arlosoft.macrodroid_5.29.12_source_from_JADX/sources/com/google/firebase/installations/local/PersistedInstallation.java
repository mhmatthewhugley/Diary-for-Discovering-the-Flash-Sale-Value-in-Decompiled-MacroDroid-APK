package com.google.firebase.installations.local;

import androidx.annotation.NonNull;
import com.google.firebase.FirebaseApp;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class PersistedInstallation {

    /* renamed from: a */
    private File f54884a;
    @NonNull

    /* renamed from: b */
    private final FirebaseApp f54885b;

    public enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public PersistedInstallation(@NonNull FirebaseApp firebaseApp) {
        this.f54885b = firebaseApp;
    }

    /* renamed from: a */
    private File m76677a() {
        if (this.f54884a == null) {
            synchronized (this) {
                if (this.f54884a == null) {
                    File filesDir = this.f54885b.mo61950l().getFilesDir();
                    this.f54884a = new File(filesDir, "PersistedInstallation." + this.f54885b.mo61953q() + ".json");
                }
            }
        }
        return this.f54884a;
    }

    /* renamed from: c */
    private JSONObject m76678c() {
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            fileInputStream = new FileInputStream(m76677a());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @NonNull
    /* renamed from: b */
    public PersistedInstallationEntry mo63270b(@NonNull PersistedInstallationEntry persistedInstallationEntry) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", persistedInstallationEntry.mo63251d());
            jSONObject.put("Status", persistedInstallationEntry.mo63255g().ordinal());
            jSONObject.put("AuthToken", persistedInstallationEntry.mo63249b());
            jSONObject.put("RefreshToken", persistedInstallationEntry.mo63254f());
            jSONObject.put("TokenCreationEpochInSecs", persistedInstallationEntry.mo63256h());
            jSONObject.put("ExpiresInSecs", persistedInstallationEntry.mo63250c());
            jSONObject.put("FisError", persistedInstallationEntry.mo63252e());
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f54885b.mo61950l().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(m76677a())) {
                return persistedInstallationEntry;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }

    @NonNull
    /* renamed from: d */
    public PersistedInstallationEntry mo63271d() {
        JSONObject c = m76678c();
        String optString = c.optString("Fid", (String) null);
        int optInt = c.optInt("Status", RegistrationStatus.ATTEMPT_MIGRATION.ordinal());
        String optString2 = c.optString("AuthToken", (String) null);
        String optString3 = c.optString("RefreshToken", (String) null);
        long optLong = c.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = c.optLong("ExpiresInSecs", 0);
        return PersistedInstallationEntry.m76681a().mo63263d(optString).mo63266g(RegistrationStatus.values()[optInt]).mo63261b(optString2).mo63265f(optString3).mo63267h(optLong).mo63262c(optLong2).mo63264e(c.optString("FisError", (String) null)).mo63260a();
    }
}

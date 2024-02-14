package com.google.android.gms.internal.mlkit_translate;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.util.AtomicFile;
import com.google.firebase.components.Component;
import com.google.firebase.components.Dependency;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzqy {

    /* renamed from: b */
    public static final Component f44504b = Component.m6343c(zzqy.class).mo22880b(Dependency.m6427j(Context.class)).mo22884f(zzqx.f44503a).mo22882d();

    /* renamed from: c */
    private static final Object f44505c = new Object();

    /* renamed from: a */
    private final Context f44506a;

    public zzqy(Context context) {
        this.f44506a = context;
    }

    /* renamed from: c */
    private final File m62233c() {
        File noBackupFilesDir = ContextCompat.getNoBackupFilesDir(this.f44506a);
        if (noBackupFilesDir == null || !noBackupFilesDir.isDirectory()) {
            Log.w("MLKitRemoteConfigSaver", "noBackupFilesDir doesn't exist, using regular files directory instead");
            File filesDir = this.f44506a.getFilesDir();
            if (filesDir != null && !filesDir.isDirectory()) {
                try {
                    if (!filesDir.mkdirs()) {
                        String obj = filesDir.toString();
                        Log.w("MLKitRemoteConfigSaver", "mkdirs failed: " + obj);
                    }
                } catch (SecurityException e) {
                    Log.w("MLKitRemoteConfigSaver", "mkdirs threw an exception: ".concat(filesDir.toString()), e);
                }
            }
            noBackupFilesDir = filesDir;
        }
        return new File(noBackupFilesDir, "com.google.mlkit.RemoteConfig");
    }

    @Nullable
    /* renamed from: a */
    public final zzqk mo52471a(zzox zzox) {
        zzqk zzqk;
        synchronized (f44505c) {
            File c = m62233c();
            zzqk = null;
            try {
                String str = new String(new AtomicFile(c).readFully(), Charset.forName("UTF-8"));
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    try {
                        zzqk = new zzqk(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"));
                    } catch (JSONException e) {
                        zzox.mo52387c(zznk.FILE_READ_RETURNED_INVALID_DATA);
                        Log.e("MLKitRemoteConfigSaver", "Error parsing remote config settings JSON object:\n".concat(jSONObject.toString()), e);
                    }
                } catch (JSONException e2) {
                    zzox.mo52387c(zznk.FILE_READ_RETURNED_MALFORMED_DATA);
                    Log.e("MLKitRemoteConfigSaver", "Error parsing remote config settings JSON string:\n".concat(str), e2);
                }
            } catch (IOException e3) {
                if (!c.exists()) {
                    String obj = c.toString();
                    Log.i("MLKitRemoteConfigSaver", "remote config settings file not yet present: " + obj);
                    return null;
                }
                zzox.mo52387c(zznk.FILE_READ_FAILED);
                String obj2 = c.toString();
                Log.w("MLKitRemoteConfigSaver", "Error reading remote config settings file: " + obj2, e3);
                return null;
            }
        }
        return zzqk;
    }

    /* renamed from: b */
    public final void mo52472b(zzqk zzqk, zzox zzox) {
        File file;
        AtomicFile atomicFile;
        FileOutputStream startWrite;
        String zzqk2 = zzqk.toString();
        synchronized (f44505c) {
            try {
                file = m62233c();
                try {
                    String obj = file.toString();
                    Log.i("MLKitRemoteConfigSaver", "Creating remote config settings: " + obj);
                    atomicFile = new AtomicFile(file);
                    startWrite = atomicFile.startWrite();
                    PrintWriter printWriter = new PrintWriter(startWrite);
                    printWriter.println(zzqk2);
                    printWriter.flush();
                    atomicFile.finishWrite(startWrite);
                    String obj2 = file.toString();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Succeeded writing remote config settings: ");
                    sb.append(obj2);
                    sb.append(":\n");
                    sb.append(zzqk2);
                } catch (IOException e) {
                    e = e;
                    zzox.mo52387c(zznk.FILE_WRITE_FAILED);
                    String valueOf = String.valueOf(file);
                    Log.e("MLKitRemoteConfigSaver", "Error writing to remote config settings file " + valueOf, e);
                } catch (Throwable th) {
                    atomicFile.failWrite(startWrite);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                file = null;
                zzox.mo52387c(zznk.FILE_WRITE_FAILED);
                String valueOf2 = String.valueOf(file);
                Log.e("MLKitRemoteConfigSaver", "Error writing to remote config settings file " + valueOf2, e);
            }
        }
    }
}

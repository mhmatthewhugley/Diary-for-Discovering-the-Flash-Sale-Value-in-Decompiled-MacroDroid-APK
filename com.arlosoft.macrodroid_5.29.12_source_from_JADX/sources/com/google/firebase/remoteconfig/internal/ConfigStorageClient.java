package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.GuardedBy;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@AnyThread
public class ConfigStorageClient {
    @GuardedBy("ConfigStorageClient.class")

    /* renamed from: c */
    private static final Map<String, ConfigStorageClient> f55280c = new HashMap();

    /* renamed from: a */
    private final Context f55281a;

    /* renamed from: b */
    private final String f55282b;

    private ConfigStorageClient(Context context, String str) {
        this.f55281a = context;
        this.f55282b = str;
    }

    /* renamed from: c */
    public static synchronized ConfigStorageClient m77331c(Context context, String str) {
        ConfigStorageClient configStorageClient;
        synchronized (ConfigStorageClient.class) {
            Map<String, ConfigStorageClient> map = f55280c;
            if (!map.containsKey(str)) {
                map.put(str, new ConfigStorageClient(context, str));
            }
            configStorageClient = map.get(str);
        }
        return configStorageClient;
    }

    /* renamed from: a */
    public synchronized Void mo63575a() {
        this.f55281a.deleteFile(this.f55282b);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo63576b() {
        return this.f55282b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[SYNTHETIC, Splitter:B:14:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0038 A[Catch:{ FileNotFoundException | JSONException -> 0x0035, all -> 0x002b }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.google.firebase.remoteconfig.internal.ConfigContainer mo63577d() throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            android.content.Context r1 = r6.f55281a     // Catch:{ FileNotFoundException | JSONException -> 0x0035, all -> 0x002b }
            java.lang.String r2 = r6.f55282b     // Catch:{ FileNotFoundException | JSONException -> 0x0035, all -> 0x002b }
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch:{ FileNotFoundException | JSONException -> 0x0035, all -> 0x002b }
            int r2 = r1.available()     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            byte[] r3 = new byte[r2]     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            r4 = 0
            r1.read(r3, r4, r2)     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            java.lang.String r2 = new java.lang.String     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            java.lang.String r4 = "UTF-8"
            r2.<init>(r3, r4)     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            r3.<init>(r2)     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            com.google.firebase.remoteconfig.internal.ConfigContainer r0 = com.google.firebase.remoteconfig.internal.ConfigContainer.m77250b(r3)     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            r1.close()     // Catch:{ all -> 0x003c }
            monitor-exit(r6)
            return r0
        L_0x0029:
            r0 = move-exception
            goto L_0x002f
        L_0x002b:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x002f:
            if (r1 == 0) goto L_0x0034
            r1.close()     // Catch:{ all -> 0x003c }
        L_0x0034:
            throw r0     // Catch:{ all -> 0x003c }
        L_0x0035:
            r1 = r0
        L_0x0036:
            if (r1 == 0) goto L_0x003f
            r1.close()     // Catch:{ all -> 0x003c }
            goto L_0x003f
        L_0x003c:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x003f:
            monitor-exit(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigStorageClient.mo63577d():com.google.firebase.remoteconfig.internal.ConfigContainer");
    }

    /* renamed from: e */
    public synchronized Void mo63578e(ConfigContainer configContainer) throws IOException {
        FileOutputStream openFileOutput = this.f55281a.openFileOutput(this.f55282b, 0);
        try {
            openFileOutput.write(configContainer.toString().getBytes("UTF-8"));
        } finally {
            openFileOutput.close();
        }
        return null;
    }
}

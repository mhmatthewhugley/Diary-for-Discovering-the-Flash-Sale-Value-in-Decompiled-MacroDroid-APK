package com.google.android.gms.internal.mlkit_translate;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import androidx.core.util.AtomicFile;
import com.google.firebase.components.Component;
import com.google.firebase.components.Dependency;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;

/* compiled from: com.google.mlkit:translate@@17.0.1 */
public final class zzpa {

    /* renamed from: b */
    public static final Component f44390b = Component.m6343c(zzpa.class).mo22880b(Dependency.m6427j(Context.class)).mo22884f(zzoz.f44386a).mo22882d();

    /* renamed from: c */
    private static final Object f44391c = new Object();

    /* renamed from: a */
    private final Context f44392a;

    public zzpa(Context context) {
        this.f44392a = context;
    }

    @Nullable
    /* renamed from: a */
    public final zzpb mo52395a(zzox zzox) {
        zzpb zzpb;
        synchronized (f44391c) {
            File b = mo52396b(zzox);
            zzpb = null;
            try {
                String str = new String(new AtomicFile(b).readFully(), Charset.forName("UTF-8"));
                try {
                    zzbo b2 = zzbt.m61650b(str);
                    if (!(b2 instanceof zzbr)) {
                        Log.e("MLKitInstallationIdSaver", "Error parsing installation info JSON element:\n".concat(String.valueOf(b2)));
                        zzox.mo52387c(zznk.FILE_READ_RETURNED_MALFORMED_DATA);
                    } else {
                        zzbr c = b2.mo52101c();
                        try {
                            zzop zzop = new zzop(c.mo52108h("fid").mo52116h());
                            String h = c.mo52108h("refreshToken").mo52116h();
                            String h2 = c.mo52108h("temporaryToken").mo52116h();
                            long d = c.mo52108h("temporaryTokenExpiryTimestamp").mo52113d();
                            String obj = zzop.toString();
                            StringBuilder sb = new StringBuilder();
                            sb.append("fid: ");
                            sb.append(obj);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("refresh_token: ");
                            sb2.append(h);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("temporary_token: ");
                            sb3.append(h2);
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("temporary token expiry: ");
                            sb4.append(d);
                            zzpb = new zzpb(zzop, h, h2, d);
                        } catch (ClassCastException | IllegalStateException | NullPointerException e) {
                            zzox.mo52387c(zznk.FILE_READ_RETURNED_INVALID_DATA);
                            String obj2 = c.toString();
                            Log.e("MLKitInstallationIdSaver", "Error traversing installation info JSON object:\nraw json:\n" + str + "\nparsed json:\n" + obj2, e);
                        }
                    }
                } catch (zzbv e2) {
                    Log.e("MLKitInstallationIdSaver", "Error parsing installation info JSON object:\n".concat(str), e2);
                    zzox.mo52387c(zznk.FILE_READ_RETURNED_MALFORMED_DATA);
                }
            } catch (IOException e3) {
                if (!b.exists()) {
                    String obj3 = b.toString();
                    Log.i("MLKitInstallationIdSaver", "Installation id file not yet present: " + obj3);
                    return null;
                }
                zzox.mo52387c(zznk.FILE_READ_FAILED);
                String obj4 = b.toString();
                Log.w("MLKitInstallationIdSaver", "Error reading installation id file: " + obj4, e3);
                return null;
            }
        }
        return zzpb;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: b */
    public final File mo52396b(zzox zzox) {
        File noBackupFilesDir = ContextCompat.getNoBackupFilesDir(this.f44392a);
        if (noBackupFilesDir == null || !noBackupFilesDir.isDirectory()) {
            Log.w("MLKitInstallationIdSaver", "noBackupFilesDir doesn't exist, using regular files directory instead");
            File filesDir = this.f44392a.getFilesDir();
            if (filesDir != null && !filesDir.isDirectory()) {
                try {
                    if (!filesDir.mkdirs()) {
                        String obj = filesDir.toString();
                        Log.w("MLKitInstallationIdSaver", "mkdirs failed: " + obj);
                        zzox.mo52388d(zznk.DIRECTORY_CREATION_FAILED);
                    }
                } catch (SecurityException e) {
                    Log.w("MLKitInstallationIdSaver", "mkdirs threw an exception: ".concat(filesDir.toString()), e);
                    zzox.mo52388d(zznk.DIRECTORY_CREATION_FAILED);
                }
            }
            noBackupFilesDir = filesDir;
        }
        return new File(noBackupFilesDir, "com.google.mlkit.InstallationId");
    }

    /* renamed from: c */
    public final void mo52397c(zzpb zzpb, zzox zzox) {
        File file;
        AtomicFile atomicFile;
        FileOutputStream startWrite;
        String format = String.format("{\n \"fid\": \"%s\",\n \"refreshToken\": \"%s\",\n \"temporaryToken\": \"%s\",\n \"temporaryTokenExpiryTimestamp\": \"%d\"\n}\n", new Object[]{zzpb.mo52399b().mo52371a(), zzpb.mo52400c(), zzpb.mo52401d(), Long.valueOf(zzpb.mo52398a())});
        synchronized (f44391c) {
            try {
                file = mo52396b(zzox);
                try {
                    String obj = file.toString();
                    Log.i("MLKitInstallationIdSaver", "Creating installation id: " + obj);
                    atomicFile = new AtomicFile(file);
                    startWrite = atomicFile.startWrite();
                    PrintWriter printWriter = new PrintWriter(startWrite);
                    printWriter.println(format);
                    printWriter.flush();
                    atomicFile.finishWrite(startWrite);
                    String obj2 = file.toString();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Succeeded writing installation id: ");
                    sb.append(obj2);
                    sb.append(":\n");
                    sb.append(format);
                } catch (IOException e) {
                    e = e;
                    zzox.mo52387c(zznk.FILE_WRITE_FAILED);
                    String valueOf = String.valueOf(file);
                    Log.e("MLKitInstallationIdSaver", "Error writing to installation id file " + valueOf, e);
                } catch (Throwable th) {
                    atomicFile.failWrite(startWrite);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                file = null;
                zzox.mo52387c(zznk.FILE_WRITE_FAILED);
                String valueOf2 = String.valueOf(file);
                Log.e("MLKitInstallationIdSaver", "Error writing to installation id file " + valueOf2, e);
            }
        }
    }
}

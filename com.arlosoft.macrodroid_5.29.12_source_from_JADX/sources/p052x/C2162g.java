package p052x;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p001a0.C0006d;

/* renamed from: x.g */
/* compiled from: NetworkCache */
public class C2162g {
    @NonNull

    /* renamed from: a */
    private final C2160e f6768a;

    public C2162g(@NonNull C2160e eVar) {
        this.f6768a = eVar;
    }

    /* renamed from: b */
    private static String m8933b(String str, C2158c cVar, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z ? cVar.mo24382b() : cVar.extension);
        return sb.toString();
    }

    @Nullable
    /* renamed from: c */
    private File m8934c(String str) throws FileNotFoundException {
        File file = new File(m8935d(), m8933b(str, C2158c.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(m8935d(), m8933b(str, C2158c.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    /* renamed from: d */
    private File m8935d() {
        File a = this.f6768a.mo17051a();
        if (a.isFile()) {
            a.delete();
        }
        if (!a.exists()) {
            a.mkdirs();
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @androidx.annotation.WorkerThread
    @androidx.annotation.Nullable
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair<p052x.C2158c, java.io.InputStream> mo24384a(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            java.io.File r1 = r5.m8934c(r6)     // Catch:{ FileNotFoundException -> 0x0044 }
            if (r1 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{  }
            r2.<init>(r1)     // Catch:{  }
            java.lang.String r0 = r1.getAbsolutePath()
            java.lang.String r3 = ".zip"
            boolean r0 = r0.endsWith(r3)
            if (r0 == 0) goto L_0x001c
            x.c r0 = p052x.C2158c.ZIP
            goto L_0x001e
        L_0x001c:
            x.c r0 = p052x.C2158c.JSON
        L_0x001e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cache hit for "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r6 = " at "
            r3.append(r6)
            java.lang.String r6 = r1.getAbsolutePath()
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            p001a0.C0006d.m30a(r6)
            android.util.Pair r6 = new android.util.Pair
            r6.<init>(r0, r2)
            return r6
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p052x.C2162g.mo24384a(java.lang.String):android.util.Pair");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo24385e(String str, C2158c cVar) {
        File file = new File(m8935d(), m8933b(str, cVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        C0006d.m30a("Copying temp file to real file (" + file2 + ")");
        if (!renameTo) {
            C0006d.m32c("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public File mo24386f(String str, InputStream inputStream, C2158c cVar) throws IOException {
        FileOutputStream fileOutputStream;
        File file = new File(m8935d(), m8933b(str, cVar, true));
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return file;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }
}

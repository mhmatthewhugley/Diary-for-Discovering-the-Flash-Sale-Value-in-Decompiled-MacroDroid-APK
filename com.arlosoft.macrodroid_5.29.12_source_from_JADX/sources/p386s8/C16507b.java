package p386s8;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.webkit.ProxyConfig;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import p368q8.C16233b;
import p377r8.C16363b;
import p395t8.C16581a;
import p395t8.C16585e;

/* renamed from: s8.b */
/* compiled from: BitmapLoadTask */
public class C16507b extends AsyncTask<Void, Void, C16508a> {

    /* renamed from: a */
    private final Context f67222a;

    /* renamed from: b */
    private Uri f67223b;

    /* renamed from: c */
    private Uri f67224c;

    /* renamed from: d */
    private final int f67225d;

    /* renamed from: e */
    private final int f67226e;

    /* renamed from: f */
    private final C16233b f67227f;

    public C16507b(@NonNull Context context, @NonNull Uri uri, @Nullable Uri uri2, int i, int i2, C16233b bVar) {
        this.f67222a = context;
        this.f67223b = uri;
        this.f67224c = uri2;
        this.f67225d = i;
        this.f67226e = i2;
        this.f67227f = bVar;
    }

    /* renamed from: a */
    private void m98591a(@NonNull Uri uri, @Nullable Uri uri2) throws NullPointerException, IOException {
        InputStream inputStream;
        Objects.requireNonNull(uri2, "Output Uri is null - cannot copy image");
        FileOutputStream fileOutputStream = null;
        try {
            inputStream = this.f67222a.getContentResolver().openInputStream(uri);
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(new File(uri2.getPath()));
                if (inputStream != null) {
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read > 0) {
                                fileOutputStream2.write(bArr, 0, read);
                            } else {
                                C16581a.m98833c(fileOutputStream2);
                                C16581a.m98833c(inputStream);
                                this.f67223b = this.f67224c;
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        C16581a.m98833c(fileOutputStream);
                        C16581a.m98833c(inputStream);
                        this.f67223b = this.f67224c;
                        throw th;
                    }
                } else {
                    throw new NullPointerException("InputStream for given input Uri is null");
                }
            } catch (Throwable th2) {
                th = th2;
                C16581a.m98833c(fileOutputStream);
                C16581a.m98833c(inputStream);
                this.f67223b = this.f67224c;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            C16581a.m98833c(fileOutputStream);
            C16581a.m98833c(inputStream);
            this.f67223b = this.f67224c;
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0075  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m98592c(@androidx.annotation.NonNull android.net.Uri r6, @androidx.annotation.Nullable android.net.Uri r7) throws java.lang.NullPointerException, java.io.IOException {
        /*
            r5 = this;
            java.lang.String r0 = "Output Uri is null - cannot download image"
            java.util.Objects.requireNonNull(r7, r0)
            okhttp3.z r0 = new okhttp3.z
            r0.<init>()
            r1 = 0
            okhttp3.b0$a r2 = new okhttp3.b0$a     // Catch:{ all -> 0x006a }
            r2.<init>()     // Catch:{ all -> 0x006a }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x006a }
            okhttp3.b0$a r6 = r2.mo75935n(r6)     // Catch:{ all -> 0x006a }
            okhttp3.b0 r6 = r6.mo75923b()     // Catch:{ all -> 0x006a }
            okhttp3.e r6 = r0.mo76008a(r6)     // Catch:{ all -> 0x006a }
            okhttp3.d0 r6 = r6.execute()     // Catch:{ all -> 0x006a }
            okhttp3.e0 r2 = r6.mo75966b()     // Catch:{ all -> 0x0066 }
            cd.d r2 = r2.source()     // Catch:{ all -> 0x0066 }
            android.content.Context r3 = r5.f67222a     // Catch:{ all -> 0x0060 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ all -> 0x0060 }
            java.io.OutputStream r7 = r3.openOutputStream(r7)     // Catch:{ all -> 0x0060 }
            if (r7 == 0) goto L_0x0058
            cd.w r1 = p226cd.C11196l.m75165d(r7)     // Catch:{ all -> 0x0060 }
            r2.mo62408L0(r1)     // Catch:{ all -> 0x0060 }
            p395t8.C16581a.m98833c(r2)
            p395t8.C16581a.m98833c(r1)
            okhttp3.e0 r6 = r6.mo75966b()
            p395t8.C16581a.m98833c(r6)
            okhttp3.p r6 = r0.mo76348o()
            r6.mo76191a()
            android.net.Uri r6 = r5.f67224c
            r5.f67223b = r6
            return
        L_0x0058:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException     // Catch:{ all -> 0x0060 }
            java.lang.String r3 = "OutputStream for given output Uri is null"
            r7.<init>(r3)     // Catch:{ all -> 0x0060 }
            throw r7     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r7 = move-exception
            r4 = r2
            r2 = r6
            r6 = r1
            r1 = r4
            goto L_0x006d
        L_0x0066:
            r7 = move-exception
            r2 = r6
            r6 = r1
            goto L_0x006d
        L_0x006a:
            r7 = move-exception
            r6 = r1
            r2 = r6
        L_0x006d:
            p395t8.C16581a.m98833c(r1)
            p395t8.C16581a.m98833c(r6)
            if (r2 == 0) goto L_0x007c
            okhttp3.e0 r6 = r2.mo75966b()
            p395t8.C16581a.m98833c(r6)
        L_0x007c:
            okhttp3.p r6 = r0.mo76348o()
            r6.mo76191a()
            android.net.Uri r6 = r5.f67224c
            r5.f67223b = r6
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p386s8.C16507b.m98592c(android.net.Uri, android.net.Uri):void");
    }

    /* renamed from: d */
    private String m98593d() {
        if (ContextCompat.checkSelfPermission(this.f67222a, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return C16585e.m98847c(this.f67222a, this.f67223b);
        }
        return null;
    }

    /* renamed from: f */
    private void m98594f() throws NullPointerException, IOException {
        String scheme = this.f67223b.getScheme();
        StringBuilder sb = new StringBuilder();
        sb.append("Uri scheme: ");
        sb.append(scheme);
        if ("http".equals(scheme) || ProxyConfig.MATCH_HTTPS.equals(scheme)) {
            try {
                m98592c(this.f67223b, this.f67224c);
            } catch (IOException | NullPointerException e) {
                Log.e("BitmapWorkerTask", "Downloading failed", e);
                throw e;
            }
        } else if ("content".equals(scheme)) {
            String d = m98593d();
            if (TextUtils.isEmpty(d) || !new File(d).exists()) {
                try {
                    m98591a(this.f67223b, this.f67224c);
                } catch (IOException | NullPointerException e2) {
                    Log.e("BitmapWorkerTask", "Copying failed", e2);
                    throw e2;
                }
            } else {
                this.f67223b = Uri.fromFile(new File(d));
            }
        } else if (!"file".equals(scheme)) {
            Log.e("BitmapWorkerTask", "Invalid Uri scheme " + scheme);
            throw new IllegalArgumentException("Invalid Uri scheme" + scheme);
        }
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: b */
    public C16508a doInBackground(Void... voidArr) {
        if (this.f67223b == null) {
            return new C16508a(new NullPointerException("Input Uri cannot be null"));
        }
        try {
            m98594f();
            try {
                ParcelFileDescriptor openFileDescriptor = this.f67222a.getContentResolver().openFileDescriptor(this.f67223b, "r");
                if (openFileDescriptor != null) {
                    FileDescriptor fileDescriptor = openFileDescriptor.getFileDescriptor();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFileDescriptor(fileDescriptor, (Rect) null, options);
                    if (options.outWidth == -1 || options.outHeight == -1) {
                        return new C16508a(new IllegalArgumentException("Bounds for bitmap could not be retrieved from the Uri: [" + this.f67223b + "]"));
                    }
                    options.inSampleSize = C16581a.m98831a(options, this.f67225d, this.f67226e);
                    boolean z = false;
                    options.inJustDecodeBounds = false;
                    Bitmap bitmap = null;
                    while (!z) {
                        try {
                            bitmap = BitmapFactory.decodeFileDescriptor(fileDescriptor, (Rect) null, options);
                            z = true;
                        } catch (OutOfMemoryError e) {
                            Log.e("BitmapWorkerTask", "doInBackground: BitmapFactory.decodeFileDescriptor: ", e);
                            options.inSampleSize *= 2;
                        }
                    }
                    if (bitmap == null) {
                        return new C16508a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.f67223b + "]"));
                    }
                    C16581a.m98833c(openFileDescriptor);
                    int g = C16581a.m98837g(this.f67222a, this.f67223b);
                    int e2 = C16581a.m98835e(g);
                    int f = C16581a.m98836f(g);
                    C16363b bVar = new C16363b(g, e2, f);
                    Matrix matrix = new Matrix();
                    if (e2 != 0) {
                        matrix.preRotate((float) e2);
                    }
                    if (f != 1) {
                        matrix.postScale((float) f, 1.0f);
                    }
                    if (!matrix.isIdentity()) {
                        return new C16508a(C16581a.m98838h(bitmap, matrix), bVar);
                    }
                    return new C16508a(bitmap, bVar);
                }
                return new C16508a(new NullPointerException("ParcelFileDescriptor was null for given Uri: [" + this.f67223b + "]"));
            } catch (FileNotFoundException e3) {
                return new C16508a(e3);
            }
        } catch (IOException | NullPointerException e4) {
            return new C16508a(e4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void onPostExecute(@NonNull C16508a aVar) {
        Exception exc = aVar.f67230c;
        if (exc == null) {
            C16233b bVar = this.f67227f;
            Bitmap bitmap = aVar.f67228a;
            C16363b bVar2 = aVar.f67229b;
            String path = this.f67223b.getPath();
            Uri uri = this.f67224c;
            bVar.mo67308a(bitmap, bVar2, path, uri == null ? null : uri.getPath());
            return;
        }
        this.f67227f.mo67309c(exc);
    }

    /* renamed from: s8.b$a */
    /* compiled from: BitmapLoadTask */
    public static class C16508a {

        /* renamed from: a */
        Bitmap f67228a;

        /* renamed from: b */
        C16363b f67229b;

        /* renamed from: c */
        Exception f67230c;

        public C16508a(@NonNull Bitmap bitmap, @NonNull C16363b bVar) {
            this.f67228a = bitmap;
            this.f67229b = bVar;
        }

        public C16508a(@NonNull Exception exc) {
            this.f67230c = exc;
        }
    }
}

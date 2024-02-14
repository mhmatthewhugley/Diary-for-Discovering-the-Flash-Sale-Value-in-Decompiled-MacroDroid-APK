package p275h7;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;
import androidx.exifinterface.media.ExifInterface;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p209aa.C11078a;
import p259f7.C12241a;
import p259f7.C12242b;
import p259f7.C12246f;

/* renamed from: h7.f */
/* compiled from: ImageUtils */
public final class C12393f {

    /* renamed from: c */
    private static final String f59098c = "f";

    /* renamed from: a */
    private final C12246f f59099a;

    /* renamed from: b */
    private final C12241a f59100b;

    public C12393f(C12246f fVar, C12241a aVar) {
        this.f59099a = fVar;
        this.f59100b = aVar;
    }

    /* renamed from: B */
    public static String m83197B(String str) {
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(lastIndexOf + 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0037 A[SYNTHETIC, Splitter:B:20:0x0037] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m83198a(android.graphics.Bitmap r4, java.io.File r5, android.graphics.Bitmap.CompressFormat r6) {
        /*
            r3 = this;
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x001a }
            r1.<init>(r5)     // Catch:{ Exception -> 0x001a }
            r0 = 90
            r4.compress(r6, r0, r1)     // Catch:{ Exception -> 0x0015, all -> 0x0012 }
            r1.flush()     // Catch:{ IOException -> 0x0011 }
            r1.close()     // Catch:{ IOException -> 0x0011 }
        L_0x0011:
            return
        L_0x0012:
            r4 = move-exception
            r0 = r1
            goto L_0x0035
        L_0x0015:
            r4 = move-exception
            r0 = r1
            goto L_0x001b
        L_0x0018:
            r4 = move-exception
            goto L_0x0035
        L_0x001a:
            r4 = move-exception
        L_0x001b:
            java.lang.String r6 = "Could not save bitmap file to '%s'"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0018 }
            r2 = 0
            java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ all -> 0x0018 }
            r1[r2] = r5     // Catch:{ all -> 0x0018 }
            java.lang.String r5 = java.lang.String.format(r6, r1)     // Catch:{ all -> 0x0018 }
            java.lang.String r6 = f59098c     // Catch:{ all -> 0x0018 }
            android.util.Log.e(r6, r5, r4)     // Catch:{ all -> 0x0018 }
            java.lang.RuntimeException r4 = p209aa.C11078a.m74638a(r4)     // Catch:{ all -> 0x0018 }
            throw r4     // Catch:{ all -> 0x0018 }
        L_0x0035:
            if (r0 == 0) goto L_0x003d
            r0.flush()     // Catch:{ IOException -> 0x003d }
            r0.close()     // Catch:{ IOException -> 0x003d }
        L_0x003d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p275h7.C12393f.m83198a(android.graphics.Bitmap, java.io.File, android.graphics.Bitmap$CompressFormat):void");
    }

    /* renamed from: b */
    private int m83199b(BitmapFactory.Options options, int i, int i2) {
        C12383b j = m83204j(options.outWidth, options.outHeight);
        C12383b j2 = m83204j(i, i2);
        float width = (float) j.getWidth();
        float height = (float) j.getHeight();
        float width2 = (float) j2.getWidth();
        float height2 = (float) j2.getHeight();
        if (height <= height2 && width <= width2) {
            return 1;
        }
        int round = Math.round(height / height2);
        int round2 = Math.round(width / width2);
        if (round >= round2) {
            round = round2;
        }
        float f = width * height;
        int i3 = round;
        while (f / ((float) (i3 * i3)) > width2 * height2 * 2.0f) {
            i3++;
        }
        return i3;
    }

    /* renamed from: e */
    private void m83200e(File file, File file2, C12383b bVar) {
        try {
            String absolutePath = file2.getAbsolutePath();
            String absolutePath2 = file.getAbsolutePath();
            if (m83203i(absolutePath) == Bitmap.CompressFormat.JPEG) {
                ExifInterface exifInterface = new ExifInterface(absolutePath2);
                ExifInterface exifInterface2 = new ExifInterface(absolutePath);
                for (String str : m83206l()) {
                    String attribute = exifInterface.getAttribute(str);
                    if (!TextUtils.isEmpty(attribute)) {
                        exifInterface2.setAttribute(str, attribute);
                    }
                }
                exifInterface2.setAttribute(ExifInterface.TAG_IMAGE_WIDTH, String.valueOf(bVar.getWidth()));
                exifInterface2.setAttribute(ExifInterface.TAG_IMAGE_LENGTH, String.valueOf(bVar.getHeight()));
                exifInterface2.saveAttributes();
            }
        } catch (IOException unused) {
            String.format("Could not copy exif tags from '%s'", new Object[]{file.getAbsolutePath()});
        }
    }

    /* renamed from: f */
    private void m83201f(File file, File file2, C12383b bVar) {
        mo68734c(file, file2);
        m83200e(file, file2, bVar);
    }

    /* renamed from: g */
    private File m83202g(File file, String str, String str2) {
        File file2 = new File(file.getAbsolutePath(), mo68736h(str, str2));
        while (file2.exists()) {
            file2 = new File(file.getAbsolutePath(), mo68736h(str, str2));
        }
        return file2;
    }

    /* renamed from: i */
    private Bitmap.CompressFormat m83203i(String str) {
        return mo68738n(str).toLowerCase().contains("png") ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    /* renamed from: j */
    private C12383b m83204j(int i, int i2) {
        if (i < i2) {
            return new C12383b(i, i2);
        }
        return new C12383b(i2, i);
    }

    /* renamed from: k */
    private File m83205k(String str, String str2) {
        File w = !this.f59100b.mo68537m() ? m83212w(str, str2) : null;
        return w == null ? m83211u(str2) : w;
    }

    /* renamed from: l */
    private String[] m83206l() {
        return new String[]{ExifInterface.TAG_DATETIME, ExifInterface.TAG_EXPOSURE_TIME, ExifInterface.TAG_FLASH, ExifInterface.TAG_FOCAL_LENGTH, ExifInterface.TAG_GPS_ALTITUDE, ExifInterface.TAG_GPS_ALTITUDE_REF, ExifInterface.TAG_GPS_DATESTAMP, ExifInterface.TAG_GPS_LATITUDE, ExifInterface.TAG_GPS_LATITUDE_REF, ExifInterface.TAG_GPS_LONGITUDE, ExifInterface.TAG_GPS_LONGITUDE_REF, ExifInterface.TAG_GPS_PROCESSING_METHOD, ExifInterface.TAG_WHITE_BALANCE, ExifInterface.TAG_ORIENTATION, ExifInterface.TAG_MAKE, ExifInterface.TAG_GPS_TIMESTAMP, ExifInterface.TAG_MODEL, ExifInterface.TAG_ISO_SPEED_RATINGS, ExifInterface.TAG_SUBSEC_TIME, ExifInterface.TAG_DATETIME_DIGITIZED, ExifInterface.TAG_SUBSEC_TIME_DIGITIZED, ExifInterface.TAG_SUBSEC_TIME_ORIGINAL, ExifInterface.TAG_METERING_MODE, ExifInterface.TAG_F_NUMBER};
    }

    /* renamed from: p */
    public static String m83207p(String str) {
        return new File(str).getName();
    }

    /* renamed from: q */
    public static C12383b m83208q(File file) {
        String absolutePath = file.getAbsolutePath();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(absolutePath, options);
        return new C12383b(options.outWidth, options.outHeight);
    }

    /* renamed from: r */
    public static String m83209r(Context context, Uri uri) {
        if (uri.getScheme().equals("content")) {
            return context.getContentResolver().getType(uri);
        }
        return m83210s(uri.toString());
    }

    /* renamed from: s */
    public static String m83210s(String str) {
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str).toLowerCase());
    }

    /* renamed from: u */
    private File m83211u(String str) {
        File filesDir = this.f59099a.mo68561c().getFilesDir();
        if (!TextUtils.isEmpty(str)) {
            filesDir = new File(filesDir, str);
        }
        if (filesDir.exists() || filesDir.mkdirs()) {
            return filesDir;
        }
        return null;
    }

    /* renamed from: w */
    private File m83212w(String str, String str2) {
        File file;
        if (!Environment.getExternalStorageState().equals("mounted")) {
            return null;
        }
        if (str == null) {
            file = Environment.getExternalStorageDirectory();
        } else {
            file = Environment.getExternalStoragePublicDirectory(str);
        }
        File file2 = new File(file, str2);
        if (file2.exists() || file2.mkdirs()) {
            return file2;
        }
        return null;
    }

    /* renamed from: y */
    private Bitmap m83213y(File file, int i, int i2) {
        BitmapFactory.Options z = m83214z(file, i, i2);
        if (z.inSampleSize == 1) {
            return null;
        }
        z.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(file.getAbsolutePath(), z);
    }

    /* renamed from: z */
    private BitmapFactory.Options m83214z(File file, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        if (i <= 0 || i2 <= 0) {
            options.inSampleSize = 1;
        } else {
            options.inSampleSize = m83199b(options, i, i2);
        }
        return options;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public C12242b mo68733A(C12242b bVar, File file, C12383b bVar2) {
        String str;
        String str2;
        File c = bVar.mo68545c();
        this.f59100b.mo68531g();
        Bitmap y = m83213y(c, bVar2.getWidth(), bVar2.getHeight());
        if (y == null) {
            m83201f(c, file, bVar2);
            str = bVar.mo68547e();
        } else {
            Bitmap.CompressFormat i = m83203i(file.getName());
            if (Bitmap.CompressFormat.JPEG == i) {
                str2 = "image/jpeg";
            } else if (Bitmap.CompressFormat.PNG == i) {
                str2 = "image/png";
            } else {
                throw new IllegalStateException(String.format("Received unexpected compression format '%s'", new Object[]{i}));
            }
            m83198a(y, file, i);
            m83200e(c, file, bVar2);
            str = str2;
        }
        return new C12242b(bVar, file, true, str);
    }

    /* renamed from: c */
    public void mo68734c(File file, File file2) {
        try {
            mo68735d(new FileInputStream(file), file2);
        } catch (IOException e) {
            Log.e(f59098c, String.format("Could not copy file to '%s'", new Object[]{file2.getAbsolutePath()}), e);
            throw C11078a.m74638a(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0044 A[SYNTHETIC, Splitter:B:23:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049 A[Catch:{ IOException -> 0x004f }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo68735d(java.io.InputStream r7, java.io.File r8) {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0023, all -> 0x0021 }
            r2.<init>(r8)     // Catch:{ IOException -> 0x0023, all -> 0x0021 }
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch:{ IOException -> 0x001f }
        L_0x000b:
            int r3 = r7.read(r1)     // Catch:{ IOException -> 0x001f }
            if (r3 <= 0) goto L_0x0015
            r2.write(r1, r0, r3)     // Catch:{ IOException -> 0x001f }
            goto L_0x000b
        L_0x0015:
            r7.close()     // Catch:{ IOException -> 0x001e }
            r2.flush()     // Catch:{ IOException -> 0x001e }
            r2.close()     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            return
        L_0x001f:
            r1 = move-exception
            goto L_0x0027
        L_0x0021:
            r8 = move-exception
            goto L_0x0042
        L_0x0023:
            r2 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
        L_0x0027:
            java.lang.String r3 = "Could not copy file to '%s'"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0040 }
            java.lang.String r8 = r8.getAbsolutePath()     // Catch:{ all -> 0x0040 }
            r4[r0] = r8     // Catch:{ all -> 0x0040 }
            java.lang.String r8 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = f59098c     // Catch:{ all -> 0x0040 }
            android.util.Log.e(r0, r8, r1)     // Catch:{ all -> 0x0040 }
            java.lang.RuntimeException r8 = p209aa.C11078a.m74638a(r1)     // Catch:{ all -> 0x0040 }
            throw r8     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r8 = move-exception
            r1 = r2
        L_0x0042:
            if (r7 == 0) goto L_0x0047
            r7.close()     // Catch:{ IOException -> 0x004f }
        L_0x0047:
            if (r1 == 0) goto L_0x004f
            r1.flush()     // Catch:{ IOException -> 0x004f }
            r1.close()     // Catch:{ IOException -> 0x004f }
        L_0x004f:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p275h7.C12393f.mo68735d(java.io.InputStream, java.io.File):void");
    }

    /* renamed from: h */
    public String mo68736h(String str, String str2) {
        String format = new SimpleDateFormat("yyyyMMdd_HHmm_ssSSS", new Locale("en")).format(new Date());
        if (!TextUtils.isEmpty(str2) && !str2.startsWith(".")) {
            str2 = "." + str2;
        }
        return str + format + str2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public String mo68737m(Uri uri) {
        String r = m83209r(this.f59099a.mo68561c(), uri);
        if (TextUtils.isEmpty(r)) {
            return mo68738n(uri.getLastPathSegment());
        }
        return r.split("/")[1];
    }

    /* renamed from: n */
    public String mo68738n(String str) {
        return mo68739o(str, "");
    }

    /* renamed from: o */
    public String mo68739o(String str, String str2) {
        int lastIndexOf;
        String str3 = "";
        if (str != null && (lastIndexOf = str.lastIndexOf(46)) > 0) {
            str3 = str.substring(lastIndexOf + 1);
        }
        return (!TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2)) ? str3 : str2;
    }

    /* renamed from: t */
    public File mo68740t(String str, String str2) {
        return m83202g(m83205k((String) null, this.f59100b.mo68526b()), str, str2);
    }

    /* renamed from: v */
    public File mo68741v(String str, String str2) {
        File file = new File(this.f59099a.mo68561c().getFilesDir(), str);
        file.mkdirs();
        return new File(file, str2);
    }

    /* renamed from: x */
    public boolean mo68742x(File file) {
        BitmapFactory.Options z = m83214z(file, 0, 0);
        if (z.outWidth <= 0 || z.outHeight <= 0) {
            return false;
        }
        return true;
    }
}

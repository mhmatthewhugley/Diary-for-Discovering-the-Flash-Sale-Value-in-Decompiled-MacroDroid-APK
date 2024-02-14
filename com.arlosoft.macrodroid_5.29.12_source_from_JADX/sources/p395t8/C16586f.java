package p395t8;

import android.media.ExifInterface;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.view.MotionEventCompat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: t8.f */
/* compiled from: ImageHeaderParser */
public class C16586f {

    /* renamed from: b */
    private static final byte[] f67399b = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: c */
    private static final int[] f67400c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: a */
    private final C16588b f67401a;

    /* renamed from: t8.f$a */
    /* compiled from: ImageHeaderParser */
    private static class C16587a {

        /* renamed from: a */
        private final ByteBuffer f67402a;

        public C16587a(byte[] bArr, int i) {
            this.f67402a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* renamed from: a */
        public short mo79431a(int i) {
            return this.f67402a.getShort(i);
        }

        /* renamed from: b */
        public int mo79432b(int i) {
            return this.f67402a.getInt(i);
        }

        /* renamed from: c */
        public int mo79433c() {
            return this.f67402a.remaining();
        }

        /* renamed from: d */
        public void mo79434d(ByteOrder byteOrder) {
            this.f67402a.order(byteOrder);
        }
    }

    /* renamed from: t8.f$b */
    /* compiled from: ImageHeaderParser */
    private interface C16588b {
        /* renamed from: a */
        int mo79435a() throws IOException;

        /* renamed from: b */
        int mo79436b(byte[] bArr, int i) throws IOException;

        /* renamed from: c */
        short mo79437c() throws IOException;

        long skip(long j) throws IOException;
    }

    /* renamed from: t8.f$c */
    /* compiled from: ImageHeaderParser */
    private static class C16589c implements C16588b {

        /* renamed from: a */
        private final InputStream f67403a;

        public C16589c(InputStream inputStream) {
            this.f67403a = inputStream;
        }

        /* renamed from: a */
        public int mo79435a() throws IOException {
            return ((this.f67403a.read() << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | (this.f67403a.read() & 255);
        }

        /* renamed from: b */
        public int mo79436b(byte[] bArr, int i) throws IOException {
            int i2 = i;
            while (i2 > 0) {
                int read = this.f67403a.read(bArr, i - i2, i2);
                if (read == -1) {
                    break;
                }
                i2 -= read;
            }
            return i - i2;
        }

        /* renamed from: c */
        public short mo79437c() throws IOException {
            return (short) (this.f67403a.read() & 255);
        }

        public long skip(long j) throws IOException {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f67403a.skip(j2);
                if (skip <= 0) {
                    if (this.f67403a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }

    public C16586f(InputStream inputStream) {
        this.f67401a = new C16589c(inputStream);
    }

    /* renamed from: a */
    private static int m98852a(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: b */
    public static void m98853b(ExifInterface exifInterface, int i, int i2, String str) {
        String[] strArr = {androidx.exifinterface.media.ExifInterface.TAG_F_NUMBER, androidx.exifinterface.media.ExifInterface.TAG_DATETIME, androidx.exifinterface.media.ExifInterface.TAG_DATETIME_DIGITIZED, androidx.exifinterface.media.ExifInterface.TAG_EXPOSURE_TIME, androidx.exifinterface.media.ExifInterface.TAG_FLASH, androidx.exifinterface.media.ExifInterface.TAG_FOCAL_LENGTH, androidx.exifinterface.media.ExifInterface.TAG_GPS_ALTITUDE, androidx.exifinterface.media.ExifInterface.TAG_GPS_ALTITUDE_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_DATESTAMP, androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE, androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE, androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE_REF, androidx.exifinterface.media.ExifInterface.TAG_GPS_PROCESSING_METHOD, androidx.exifinterface.media.ExifInterface.TAG_GPS_TIMESTAMP, androidx.exifinterface.media.ExifInterface.TAG_ISO_SPEED_RATINGS, androidx.exifinterface.media.ExifInterface.TAG_MAKE, androidx.exifinterface.media.ExifInterface.TAG_MODEL, androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME, androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_DIGITIZED, androidx.exifinterface.media.ExifInterface.TAG_SUBSEC_TIME_ORIGINAL, androidx.exifinterface.media.ExifInterface.TAG_WHITE_BALANCE};
        try {
            ExifInterface exifInterface2 = new ExifInterface(str);
            for (int i3 = 0; i3 < 22; i3++) {
                String str2 = strArr[i3];
                String attribute = exifInterface.getAttribute(str2);
                if (!TextUtils.isEmpty(attribute)) {
                    exifInterface2.setAttribute(str2, attribute);
                }
            }
            exifInterface2.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_WIDTH, String.valueOf(i));
            exifInterface2.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_IMAGE_LENGTH, String.valueOf(i2));
            exifInterface2.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, "0");
            exifInterface2.saveAttributes();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    /* renamed from: d */
    private static boolean m98854d(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* renamed from: e */
    private boolean m98855e(byte[] bArr, int i) {
        boolean z = bArr != null && i > f67399b.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f67399b;
                if (i2 >= bArr2.length) {
                    break;
                } else if (bArr[i2] != bArr2[i2]) {
                    return false;
                } else {
                    i2++;
                }
            }
        }
        return z;
    }

    /* renamed from: f */
    private int m98856f() throws IOException {
        short c;
        int a;
        long j;
        long skip;
        do {
            short c2 = this.f67401a.mo79437c();
            if (c2 != 255) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown segmentId=");
                    sb.append(c2);
                }
                return -1;
            }
            c = this.f67401a.mo79437c();
            if (c == 218) {
                return -1;
            }
            if (c == 217) {
                Log.isLoggable("ImageHeaderParser", 3);
                return -1;
            }
            a = this.f67401a.mo79435a() - 2;
            if (c == 225) {
                return a;
            }
            j = (long) a;
            skip = this.f67401a.skip(j);
        } while (skip == j);
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to skip enough data, type: ");
            sb2.append(c);
            sb2.append(", wanted to skip: ");
            sb2.append(a);
            sb2.append(", but actually skipped: ");
            sb2.append(skip);
        }
        return -1;
    }

    /* renamed from: g */
    private static int m98857g(C16587a aVar) {
        ByteOrder byteOrder;
        short a = aVar.mo79431a(6);
        if (a == 19789) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else if (a == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown endianness = ");
                sb.append(a);
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        aVar.mo79434d(byteOrder);
        int b = aVar.mo79432b(10) + 6;
        short a2 = aVar.mo79431a(b);
        for (int i = 0; i < a2; i++) {
            int a3 = m98852a(b, i);
            short a4 = aVar.mo79431a(a3);
            if (a4 == 274) {
                short a5 = aVar.mo79431a(a3 + 2);
                if (a5 >= 1 && a5 <= 12) {
                    int b2 = aVar.mo79432b(a3 + 4);
                    if (b2 < 0) {
                        Log.isLoggable("ImageHeaderParser", 3);
                    } else {
                        if (Log.isLoggable("ImageHeaderParser", 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Got tagIndex=");
                            sb2.append(i);
                            sb2.append(" tagType=");
                            sb2.append(a4);
                            sb2.append(" formatCode=");
                            sb2.append(a5);
                            sb2.append(" componentCount=");
                            sb2.append(b2);
                        }
                        int i2 = b2 + f67400c[a5];
                        if (i2 <= 4) {
                            int i3 = a3 + 8;
                            if (i3 < 0 || i3 > aVar.mo79433c()) {
                                if (Log.isLoggable("ImageHeaderParser", 3)) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("Illegal tagValueOffset=");
                                    sb3.append(i3);
                                    sb3.append(" tagType=");
                                    sb3.append(a4);
                                }
                            } else if (i2 >= 0 && i2 + i3 <= aVar.mo79433c()) {
                                return aVar.mo79431a(i3);
                            } else {
                                if (Log.isLoggable("ImageHeaderParser", 3)) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("Illegal number of bytes for TI tag data tagType=");
                                    sb4.append(a4);
                                }
                            }
                        } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Got byte count > 4, not orientation, continuing, formatCode=");
                            sb5.append(a5);
                        }
                    }
                } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Got invalid format code = ");
                    sb6.append(a5);
                }
            }
        }
        return -1;
    }

    /* renamed from: h */
    private int m98858h(byte[] bArr, int i) throws IOException {
        int b = this.f67401a.mo79436b(bArr, i);
        if (b != i) {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to read exif segment data, length: ");
                sb.append(i);
                sb.append(", actually read: ");
                sb.append(b);
            }
            return -1;
        } else if (m98855e(bArr, i)) {
            return m98857g(new C16587a(bArr, i));
        } else {
            Log.isLoggable("ImageHeaderParser", 3);
            return -1;
        }
    }

    /* renamed from: c */
    public int mo79430c() throws IOException {
        int a = this.f67401a.mo79435a();
        if (!m98854d(a)) {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Parser doesn't handle magic number: ");
                sb.append(a);
            }
            return -1;
        }
        int f = m98856f();
        if (f != -1) {
            return m98858h(new byte[f], f);
        }
        Log.isLoggable("ImageHeaderParser", 3);
        return -1;
    }
}

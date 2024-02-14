package p164s4;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.MotionEventCompat;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p090f5.C7315j;
import p126l4.C7667b;

/* renamed from: s4.i */
/* compiled from: DefaultImageHeaderParser */
public final class C10194i implements ImageHeaderParser {

    /* renamed from: a */
    static final byte[] f23303a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    private static final int[] f23304b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: s4.i$a */
    /* compiled from: DefaultImageHeaderParser */
    private static final class C10195a implements C10197c {

        /* renamed from: a */
        private final ByteBuffer f23305a;

        C10195a(ByteBuffer byteBuffer) {
            this.f23305a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public int mo40795a() {
            return ((mo40798d() << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | (mo40798d() & 255);
        }

        /* renamed from: b */
        public int mo40796b(byte[] bArr, int i) {
            int min = Math.min(i, this.f23305a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f23305a.get(bArr, 0, min);
            return min;
        }

        /* renamed from: c */
        public short mo40797c() {
            return (short) (mo40798d() & 255);
        }

        /* renamed from: d */
        public int mo40798d() {
            if (this.f23305a.remaining() < 1) {
                return -1;
            }
            return this.f23305a.get();
        }

        public long skip(long j) {
            int min = (int) Math.min((long) this.f23305a.remaining(), j);
            ByteBuffer byteBuffer = this.f23305a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }
    }

    /* renamed from: s4.i$b */
    /* compiled from: DefaultImageHeaderParser */
    private static final class C10196b {

        /* renamed from: a */
        private final ByteBuffer f23306a;

        C10196b(byte[] bArr, int i) {
            this.f23306a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* renamed from: c */
        private boolean m40123c(int i, int i2) {
            return this.f23306a.remaining() - i >= i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public short mo40800a(int i) {
            if (m40123c(i, 2)) {
                return this.f23306a.getShort(i);
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo40801b(int i) {
            if (m40123c(i, 4)) {
                return this.f23306a.getInt(i);
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo40802d() {
            return this.f23306a.remaining();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo40803e(ByteOrder byteOrder) {
            this.f23306a.order(byteOrder);
        }
    }

    /* renamed from: s4.i$c */
    /* compiled from: DefaultImageHeaderParser */
    private interface C10197c {
        /* renamed from: a */
        int mo40795a() throws IOException;

        /* renamed from: b */
        int mo40796b(byte[] bArr, int i) throws IOException;

        /* renamed from: c */
        short mo40797c() throws IOException;

        /* renamed from: d */
        int mo40798d() throws IOException;

        long skip(long j) throws IOException;
    }

    /* renamed from: s4.i$d */
    /* compiled from: DefaultImageHeaderParser */
    private static final class C10198d implements C10197c {

        /* renamed from: a */
        private final InputStream f23307a;

        C10198d(InputStream inputStream) {
            this.f23307a = inputStream;
        }

        /* renamed from: a */
        public int mo40795a() throws IOException {
            return ((this.f23307a.read() << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | (this.f23307a.read() & 255);
        }

        /* renamed from: b */
        public int mo40796b(byte[] bArr, int i) throws IOException {
            int i2 = i;
            while (i2 > 0) {
                int read = this.f23307a.read(bArr, i - i2, i2);
                if (read == -1) {
                    break;
                }
                i2 -= read;
            }
            return i - i2;
        }

        /* renamed from: c */
        public short mo40797c() throws IOException {
            return (short) (this.f23307a.read() & 255);
        }

        /* renamed from: d */
        public int mo40798d() throws IOException {
            return this.f23307a.read();
        }

        public long skip(long j) throws IOException {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f23307a.skip(j2);
                if (skip <= 0) {
                    if (this.f23307a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }

    /* renamed from: d */
    private static int m40108d(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: e */
    private int m40109e(C10197c cVar, C7667b bVar) throws IOException {
        int a = cVar.mo40795a();
        if (!m40111g(a)) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Parser doesn't handle magic number: ");
                sb.append(a);
            }
            return -1;
        }
        int i = m40113i(cVar);
        if (i == -1) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        byte[] bArr = (byte[]) bVar.mo37684c(i, byte[].class);
        try {
            return m40115k(cVar, bArr, i);
        } finally {
            bVar.put(bArr);
        }
    }

    @NonNull
    /* renamed from: f */
    private ImageHeaderParser.ImageType m40110f(C10197c cVar) throws IOException {
        int a = cVar.mo40795a();
        if (a == 65496) {
            return ImageHeaderParser.ImageType.JPEG;
        }
        int a2 = ((a << 16) & SupportMenu.CATEGORY_MASK) | (cVar.mo40795a() & 65535);
        if (a2 == -1991225785) {
            cVar.skip(21);
            return cVar.mo40798d() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
        } else if ((a2 >> 8) == 4671814) {
            return ImageHeaderParser.ImageType.GIF;
        } else {
            if (a2 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            cVar.skip(4);
            if ((((cVar.mo40795a() << 16) & SupportMenu.CATEGORY_MASK) | (cVar.mo40795a() & 65535)) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int a3 = ((cVar.mo40795a() << 16) & SupportMenu.CATEGORY_MASK) | (cVar.mo40795a() & 65535);
            if ((a3 & InputDeviceCompat.SOURCE_ANY) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i = a3 & 255;
            if (i == 88) {
                cVar.skip(4);
                return (cVar.mo40798d() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            } else if (i != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            } else {
                cVar.skip(4);
                return (cVar.mo40798d() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
        }
    }

    /* renamed from: g */
    private static boolean m40111g(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* renamed from: h */
    private boolean m40112h(byte[] bArr, int i) {
        boolean z = bArr != null && i > f23303a.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f23303a;
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

    /* renamed from: i */
    private int m40113i(C10197c cVar) throws IOException {
        short c;
        int a;
        long j;
        long skip;
        do {
            short c2 = cVar.mo40797c();
            if (c2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown segmentId=");
                    sb.append(c2);
                }
                return -1;
            }
            c = cVar.mo40797c();
            if (c == 218) {
                return -1;
            }
            if (c == 217) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            a = cVar.mo40795a() - 2;
            if (c == 225) {
                return a;
            }
            j = (long) a;
            skip = cVar.skip(j);
        } while (skip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
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

    /* renamed from: j */
    private static int m40114j(C10196b bVar) {
        ByteOrder byteOrder;
        short a = bVar.mo40800a(6);
        if (a == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (a != 19789) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown endianness = ");
                sb.append(a);
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.mo40803e(byteOrder);
        int b = bVar.mo40801b(10) + 6;
        short a2 = bVar.mo40800a(b);
        for (int i = 0; i < a2; i++) {
            int d = m40108d(b, i);
            short a3 = bVar.mo40800a(d);
            if (a3 == 274) {
                short a4 = bVar.mo40800a(d + 2);
                if (a4 >= 1 && a4 <= 12) {
                    int b2 = bVar.mo40801b(d + 4);
                    if (b2 < 0) {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Got tagIndex=");
                            sb2.append(i);
                            sb2.append(" tagType=");
                            sb2.append(a3);
                            sb2.append(" formatCode=");
                            sb2.append(a4);
                            sb2.append(" componentCount=");
                            sb2.append(b2);
                        }
                        int i2 = b2 + f23304b[a4];
                        if (i2 <= 4) {
                            int i3 = d + 8;
                            if (i3 < 0 || i3 > bVar.mo40802d()) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("Illegal tagValueOffset=");
                                    sb3.append(i3);
                                    sb3.append(" tagType=");
                                    sb3.append(a3);
                                }
                            } else if (i2 >= 0 && i2 + i3 <= bVar.mo40802d()) {
                                return bVar.mo40800a(i3);
                            } else {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("Illegal number of bytes for TI tag data tagType=");
                                    sb4.append(a3);
                                }
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("Got byte count > 4, not orientation, continuing, formatCode=");
                            sb5.append(a4);
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Got invalid format code = ");
                    sb6.append(a4);
                }
            }
        }
        return -1;
    }

    /* renamed from: k */
    private int m40115k(C10197c cVar, byte[] bArr, int i) throws IOException {
        int b = cVar.mo40796b(bArr, i);
        if (b != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to read exif segment data, length: ");
                sb.append(i);
                sb.append(", actually read: ");
                sb.append(b);
            }
            return -1;
        } else if (m40112h(bArr, i)) {
            return m40114j(new C10196b(bArr, i));
        } else {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
    }

    /* renamed from: a */
    public int mo32976a(@NonNull InputStream inputStream, @NonNull C7667b bVar) throws IOException {
        return m40109e(new C10198d((InputStream) C7315j.m30204d(inputStream)), (C7667b) C7315j.m30204d(bVar));
    }

    @NonNull
    /* renamed from: b */
    public ImageHeaderParser.ImageType mo32977b(@NonNull ByteBuffer byteBuffer) throws IOException {
        return m40110f(new C10195a((ByteBuffer) C7315j.m30204d(byteBuffer)));
    }

    @NonNull
    /* renamed from: c */
    public ImageHeaderParser.ImageType mo32978c(@NonNull InputStream inputStream) throws IOException {
        return m40110f(new C10198d((InputStream) C7315j.m30204d(inputStream)));
    }
}

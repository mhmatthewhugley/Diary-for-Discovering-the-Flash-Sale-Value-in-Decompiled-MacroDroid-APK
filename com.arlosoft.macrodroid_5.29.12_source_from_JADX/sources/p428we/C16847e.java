package p428we;

import androidx.core.view.MotionEventCompat;
import javax.mail.UIDFolder;

/* renamed from: we.e */
/* compiled from: ZipLong */
public final class C16847e implements Cloneable {

    /* renamed from: c */
    public static final C16847e f68030c = new C16847e(33639248);

    /* renamed from: d */
    public static final C16847e f68031d = new C16847e(67324752);

    /* renamed from: f */
    public static final C16847e f68032f = new C16847e(134695760);

    /* renamed from: g */
    static final C16847e f68033g = new C16847e(UIDFolder.MAXUID);

    /* renamed from: a */
    private final long f68034a;

    public C16847e(long j) {
        this.f68034a = j;
    }

    /* renamed from: a */
    public static byte[] m99855a(long j) {
        return new byte[]{(byte) ((int) (255 & j)), (byte) ((int) ((65280 & j) >> 8)), (byte) ((int) ((16711680 & j) >> 16)), (byte) ((int) ((j & 4278190080L) >> 24))};
    }

    /* renamed from: c */
    public static long m99856c(byte[] bArr, int i) {
        return (((long) (bArr[i + 3] << 24)) & 4278190080L) + ((long) ((bArr[i + 2] << 16) & 16711680)) + ((long) ((bArr[i + 1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK)) + ((long) (bArr[i] & 255));
    }

    /* renamed from: b */
    public long mo79974b() {
        return this.f68034a;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C16847e) || this.f68034a != ((C16847e) obj).mo79974b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (int) this.f68034a;
    }

    public String toString() {
        return "ZipLong value: " + this.f68034a;
    }
}

package p352oe;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.regex.Pattern;
import org.apache.commons.p353io.FilenameUtils;
import p383re.C16501d;

/* renamed from: oe.c */
/* compiled from: Duration */
public final class C15857c implements Comparable<C15857c>, Serializable {

    /* renamed from: a */
    public static final C15857c f65314a = new C15857c(0, 0);

    /* renamed from: c */
    private static final BigInteger f65315c = BigInteger.valueOf(1000000000);

    /* renamed from: d */
    private static final Pattern f65316d = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    private static final long serialVersionUID = 3078945930695997490L;
    private final int nanos;
    private final long seconds;

    private C15857c(long j, int i) {
        this.seconds = j;
        this.nanos = i;
    }

    /* renamed from: d */
    private static C15857c m95498d(long j, int i) {
        if ((((long) i) | j) == 0) {
            return f65314a;
        }
        return new C15857c(j, i);
    }

    /* renamed from: f */
    public static C15857c m95499f(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i += 1000000000;
            j2--;
        }
        return m95498d(j2, i);
    }

    /* renamed from: g */
    public static C15857c m95500g(long j) {
        return m95498d(j, 0);
    }

    /* renamed from: i */
    public static C15857c m95501i(long j, long j2) {
        return m95498d(C16501d.m98550k(j, C16501d.m98544e(j2, 1000000000)), C16501d.m98546g(j2, 1000000000));
    }

    /* renamed from: j */
    static C15857c m95502j(DataInput dataInput) throws IOException {
        return m95501i(dataInput.readLong(), (long) dataInput.readInt());
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C15883m((byte) 1, this);
    }

    /* renamed from: b */
    public int compareTo(C15857c cVar) {
        int b = C16501d.m98541b(this.seconds, cVar.seconds);
        if (b != 0) {
            return b;
        }
        return this.nanos - cVar.nanos;
    }

    /* renamed from: e */
    public long mo75653e() {
        return this.seconds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15857c)) {
            return false;
        }
        C15857c cVar = (C15857c) obj;
        if (this.seconds == cVar.seconds && this.nanos == cVar.nanos) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.seconds;
        return ((int) (j ^ (j >>> 32))) + (this.nanos * 51);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo75656k(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.seconds);
        dataOutput.writeInt(this.nanos);
    }

    public String toString() {
        if (this == f65314a) {
            return "PT0S";
        }
        long j = this.seconds;
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j2 != 0) {
            sb.append(j2);
            sb.append('H');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('M');
        }
        if (i2 == 0 && this.nanos == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (i2 >= 0 || this.nanos <= 0) {
            sb.append(i2);
        } else if (i2 == -1) {
            sb.append("-0");
        } else {
            sb.append(i2 + 1);
        }
        if (this.nanos > 0) {
            int length = sb.length();
            if (i2 < 0) {
                sb.append(2000000000 - this.nanos);
            } else {
                sb.append(this.nanos + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, FilenameUtils.EXTENSION_SEPARATOR);
        }
        sb.append('S');
        return sb.toString();
    }
}

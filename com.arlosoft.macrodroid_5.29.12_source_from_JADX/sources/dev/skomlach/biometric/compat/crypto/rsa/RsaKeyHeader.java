package dev.skomlach.biometric.compat.crypto.rsa;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u0012\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0003J\u0006\u0010\u0016\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0019"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/crypto/rsa/RsaKeyHeader;", "", "magic", "", "bitLength", "cbPublicExp", "cbModulus", "cbPrime1", "cbPrime2", "(IIIIII)V", "getBitLength", "()I", "getCbModulus", "getCbPrime1", "getCbPrime2", "getCbPublicExp", "expectedDataLength", "getExpectedDataLength", "getMagic", "toByteArray", "", "sizeOfLong", "toByteArray32", "toByteArray64", "Companion", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: RsaKeyHeader.kt */
public final class RsaKeyHeader {
    public static final Companion Companion = new Companion((C13695i) null);
    public static final int KEY_SIZE = 2048;
    public static final int MAGIC_RSAKEY_PRIVATE = 859919186;
    public static final int MAGIC_RSAKEY_PUBLIC = 826364754;
    private final int bitLength;
    private final int cbModulus;
    private final int cbPrime1;
    private final int cbPrime2;
    private final int cbPublicExp;
    private final int magic;

    @Metadata(mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/crypto/rsa/RsaKeyHeader$Companion;", "", "()V", "KEY_SIZE", "", "MAGIC_RSAKEY_PRIVATE", "MAGIC_RSAKEY_PUBLIC", "fromByteArray", "Ldev/skomlach/biometric/compat/crypto/rsa/RsaKeyHeader;", "bytes", "", "sizeOfLong", "fromByteArray32", "fromByteArray64", "getHeaderLength", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: RsaKeyHeader.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        public final RsaKeyHeader fromByteArray(byte[] bArr, int i) throws RsaKeyDataException {
            C13706o.m87929f(bArr, "bytes");
            if (i == 4) {
                return fromByteArray32(bArr);
            }
            if (i == 8) {
                return fromByteArray64(bArr);
            }
            throw new IllegalStateException("Unexpected size of int " + i);
        }

        public final RsaKeyHeader fromByteArray32(byte[] bArr) throws RsaKeyDataException {
            C13706o.m87929f(bArr, "bytes");
            if (bArr.length == getHeaderLength(4)) {
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                wrap.order(ByteOrder.nativeOrder());
                return new RsaKeyHeader(wrap.getInt(), wrap.getInt(), wrap.getInt(), wrap.getInt(), wrap.getInt(), wrap.getInt());
            }
            int length = bArr.length;
            int headerLength = getHeaderLength(4);
            throw new RsaKeyDataException("RsaKeyHeader unexpected data length " + length + ". Expected " + headerLength);
        }

        public final RsaKeyHeader fromByteArray64(byte[] bArr) throws RsaKeyDataException {
            C13706o.m87929f(bArr, "bytes");
            if (bArr.length == getHeaderLength(8)) {
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                wrap.order(ByteOrder.nativeOrder());
                return new RsaKeyHeader((int) wrap.getLong(), (int) wrap.getLong(), (int) wrap.getLong(), (int) wrap.getLong(), (int) wrap.getLong(), (int) wrap.getLong());
            }
            int length = bArr.length;
            int headerLength = getHeaderLength(8);
            throw new RsaKeyDataException("RsaKeyHeader unexpected data length " + length + ". Expected " + headerLength);
        }

        public final int getHeaderLength(int i) {
            return i * 6;
        }
    }

    public RsaKeyHeader(int i, int i2, int i3, int i4, int i5, int i6) {
        this.magic = i;
        this.bitLength = i2;
        this.cbPublicExp = i3;
        this.cbModulus = i4;
        this.cbPrime1 = i5;
        this.cbPrime2 = i6;
    }

    public static final RsaKeyHeader fromByteArray(byte[] bArr, int i) throws RsaKeyDataException {
        return Companion.fromByteArray(bArr, i);
    }

    public static final int getHeaderLength(int i) {
        return Companion.getHeaderLength(i);
    }

    public final int getBitLength() {
        return this.bitLength;
    }

    public final int getCbModulus() {
        return this.cbModulus;
    }

    public final int getCbPrime1() {
        return this.cbPrime1;
    }

    public final int getCbPrime2() {
        return this.cbPrime2;
    }

    public final int getCbPublicExp() {
        return this.cbPublicExp;
    }

    public final int getExpectedDataLength() {
        int i;
        int i2;
        int i3 = this.magic;
        if (i3 == 826364754) {
            i2 = this.cbPublicExp;
            i = this.cbModulus;
        } else if (i3 == 859919186) {
            int i4 = this.cbPublicExp;
            i = this.cbModulus;
            int i5 = this.cbPrime1;
            int i6 = this.cbPrime2;
            i2 = i4 + i + i5 + i6 + i5 + i6 + i5;
        } else {
            int i7 = this.magic;
            throw new IllegalStateException("Cannot determine expected key length for magic " + i7);
        }
        return i2 + i;
    }

    public final int getMagic() {
        return this.magic;
    }

    public final byte[] toByteArray(int i) {
        if (i == 4) {
            return toByteArray32();
        }
        if (i == 8) {
            return toByteArray64();
        }
        throw new IllegalStateException("Unexpected size of int " + i);
    }

    public final byte[] toByteArray32() {
        ByteBuffer allocate = ByteBuffer.allocate(Companion.getHeaderLength(4));
        allocate.order(ByteOrder.nativeOrder());
        allocate.putInt(this.magic);
        allocate.putInt(this.bitLength);
        allocate.putInt(this.cbPublicExp);
        allocate.putInt(this.cbModulus);
        allocate.putInt(this.cbPrime1);
        allocate.putInt(this.cbPrime2);
        byte[] array = allocate.array();
        C13706o.m87928e(array, "buffer.array()");
        return array;
    }

    public final byte[] toByteArray64() {
        ByteBuffer allocate = ByteBuffer.allocate(Companion.getHeaderLength(8));
        allocate.order(ByteOrder.nativeOrder());
        allocate.putLong((long) this.magic);
        allocate.putLong((long) this.bitLength);
        allocate.putLong((long) this.cbPublicExp);
        allocate.putLong((long) this.cbModulus);
        allocate.putLong((long) this.cbPrime1);
        allocate.putLong((long) this.cbPrime2);
        byte[] array = allocate.array();
        C13706o.m87928e(array, "buffer.array()");
        return array;
    }
}

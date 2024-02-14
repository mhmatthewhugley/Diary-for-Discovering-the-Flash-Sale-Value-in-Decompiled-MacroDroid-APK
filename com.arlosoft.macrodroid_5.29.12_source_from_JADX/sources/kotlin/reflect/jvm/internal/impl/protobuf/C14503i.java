package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.i */
/* compiled from: Internal */
public class C14503i {

    /* renamed from: a */
    public static final byte[] f63379a;

    /* renamed from: b */
    public static final ByteBuffer f63380b;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.i$a */
    /* compiled from: Internal */
    public interface C14504a {
        /* renamed from: c */
        int mo71084c();
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.i$b */
    /* compiled from: Internal */
    public interface C14505b<T extends C14504a> {
        /* renamed from: a */
        T mo71085a(int i);
    }

    static {
        byte[] bArr = new byte[0];
        f63379a = bArr;
        f63380b = ByteBuffer.wrap(bArr);
    }

    /* renamed from: a */
    public static boolean m90989a(byte[] bArr) {
        return C14538v.m91112e(bArr);
    }

    /* renamed from: b */
    public static String m90990b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }
}

package kotlin.reflect.jvm.internal.impl.protobuf;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.w */
/* compiled from: WireFormat */
public final class C14539w {

    /* renamed from: a */
    static final int f63437a = m91119c(1, 3);

    /* renamed from: b */
    static final int f63438b = m91119c(1, 4);

    /* renamed from: c */
    static final int f63439c = m91119c(2, 0);

    /* renamed from: d */
    static final int f63440d = m91119c(3, 2);

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.w$b */
    /* compiled from: WireFormat */
    public enum C14541b {
        DOUBLE(C14546c.DOUBLE, 1),
        FLOAT(C14546c.FLOAT, 5),
        INT64(r5, 0),
        UINT64(r5, 0),
        INT32(r11, 0),
        FIXED64(r5, 1),
        FIXED32(r11, 5),
        BOOL(C14546c.BOOLEAN, 0),
        STRING(C14546c.STRING, 2) {
            /* renamed from: e */
            public boolean mo73523e() {
                return false;
            }
        },
        GROUP(r13, 3) {
            /* renamed from: e */
            public boolean mo73523e() {
                return false;
            }
        },
        MESSAGE(r13, 2) {
            /* renamed from: e */
            public boolean mo73523e() {
                return false;
            }
        },
        BYTES(C14546c.BYTE_STRING, 2) {
            /* renamed from: e */
            public boolean mo73523e() {
                return false;
            }
        },
        UINT32(r11, 0),
        ENUM(C14546c.ENUM, 0),
        SFIXED32(r11, 5),
        SFIXED64(r5, 1),
        SINT32(r11, 0),
        SINT64(r5, 0);
        
        private final C14546c javaType;
        private final int wireType;

        /* renamed from: b */
        public C14546c mo73521b() {
            return this.javaType;
        }

        /* renamed from: d */
        public int mo73522d() {
            return this.wireType;
        }

        /* renamed from: e */
        public boolean mo73523e() {
            return true;
        }

        private C14541b(C14546c cVar, int i) {
            this.javaType = cVar;
            this.wireType = i;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.w$c */
    /* compiled from: WireFormat */
    public enum C14546c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(C14485d.f63329a),
        ENUM((String) null),
        MESSAGE((String) null);
        
        private final Object defaultDefault;

        private C14546c(Object obj) {
            this.defaultDefault = obj;
        }
    }

    /* renamed from: a */
    public static int m91117a(int i) {
        return i >>> 3;
    }

    /* renamed from: b */
    static int m91118b(int i) {
        return i & 7;
    }

    /* renamed from: c */
    static int m91119c(int i, int i2) {
        return (i << 3) | i2;
    }
}

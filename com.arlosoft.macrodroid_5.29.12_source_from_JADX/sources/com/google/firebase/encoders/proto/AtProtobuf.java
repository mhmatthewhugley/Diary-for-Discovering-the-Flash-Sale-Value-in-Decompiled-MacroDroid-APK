package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.proto.Protobuf;
import java.lang.annotation.Annotation;

public final class AtProtobuf {

    /* renamed from: a */
    private int f5587a;

    /* renamed from: b */
    private Protobuf.IntEncoding f5588b = Protobuf.IntEncoding.DEFAULT;

    private static final class ProtobufImpl implements Protobuf {

        /* renamed from: a */
        private final int f5589a;

        /* renamed from: b */
        private final Protobuf.IntEncoding f5590b;

        ProtobufImpl(int i, Protobuf.IntEncoding intEncoding) {
            this.f5589a = i;
            this.f5590b = intEncoding;
        }

        public Class<? extends Annotation> annotationType() {
            return Protobuf.class;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Protobuf)) {
                return false;
            }
            Protobuf protobuf = (Protobuf) obj;
            if (this.f5589a != protobuf.tag() || !this.f5590b.equals(protobuf.intEncoding())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f5589a ^ 14552422) + (this.f5590b.hashCode() ^ 2041407134);
        }

        public Protobuf.IntEncoding intEncoding() {
            return this.f5590b;
        }

        public int tag() {
            return this.f5589a;
        }

        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf" + '(' + "tag=" + this.f5589a + "intEncoding=" + this.f5590b + ')';
        }
    }

    /* renamed from: b */
    public static AtProtobuf m7791b() {
        return new AtProtobuf();
    }

    /* renamed from: a */
    public Protobuf mo23631a() {
        return new ProtobufImpl(this.f5587a, this.f5588b);
    }

    /* renamed from: c */
    public AtProtobuf mo23632c(int i) {
        this.f5587a = i;
        return this;
    }
}

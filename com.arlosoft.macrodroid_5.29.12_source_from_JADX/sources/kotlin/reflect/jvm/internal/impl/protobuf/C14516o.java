package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.o */
/* compiled from: MessageLite */
public interface C14516o extends C14518p {

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.o$a */
    /* compiled from: MessageLite */
    public interface C14517a extends Cloneable, C14518p {
        C14516o build();

        /* renamed from: h0 */
        C14517a mo71034h0(C14488e eVar, C14490f fVar) throws IOException;
    }

    /* renamed from: b */
    C14517a mo71014b();

    /* renamed from: c */
    int mo71015c();

    /* renamed from: d */
    C14517a mo71016d();

    /* renamed from: f */
    C14519q<? extends C14516o> mo71017f();

    /* renamed from: g */
    void mo71018g(CodedOutputStream codedOutputStream) throws IOException;
}

package p292io.grpc.internal;

/* renamed from: io.grpc.internal.c */
/* compiled from: AbstractReadableBuffer */
public abstract class C12614c implements C12798s1 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo69238b(int i) {
        if (mo69462l() < i) {
            throw new IndexOutOfBoundsException();
        }
    }

    public void close() {
    }

    public final int readInt() {
        mo69238b(4);
        return (readUnsignedByte() << 24) | (readUnsignedByte() << 16) | (readUnsignedByte() << 8) | readUnsignedByte();
    }
}

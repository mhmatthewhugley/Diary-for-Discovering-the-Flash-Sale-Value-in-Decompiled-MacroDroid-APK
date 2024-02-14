package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessageLite.Builder;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLite;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class AbstractMessageLite<MessageType extends AbstractMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> implements MessageLite {
    protected int memoizedHashCode = 0;

    protected interface InternalOneOfEnum {
    }

    /* renamed from: i */
    protected static <T> void m79287i(Iterable<T> iterable, List<? super T> list) {
        Builder.m79295n(iterable, list);
    }

    /* renamed from: n */
    private String m79288n(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* renamed from: g */
    public ByteString mo64717g() {
        try {
            ByteString.CodedBuilder J = ByteString.m79760J(mo65174c());
            mo65180k(J.mo64945b());
            return J.mo64944a();
        } catch (IOException e) {
            throw new RuntimeException(m79288n("ByteString"), e);
        }
    }

    /* renamed from: h */
    public byte[] mo64718h() {
        try {
            byte[] bArr = new byte[mo65174c()];
            CodedOutputStream Y0 = CodedOutputStream.m80106Y0(bArr);
            mo65180k(Y0);
            Y0.mo65021U();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(m79288n("byte array"), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo64719j() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo64720m(Schema schema) {
        int j = mo64719j();
        if (j != -1) {
            return j;
        }
        int g = schema.mo65350g(this);
        mo64722p(g);
        return g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public UninitializedMessageException mo64721o() {
        return new UninitializedMessageException(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo64722p(int i) {
        throw new UnsupportedOperationException();
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        CodedOutputStream X0 = CodedOutputStream.m80104X0(outputStream, CodedOutputStream.m80080A0(mo65174c()));
        mo65180k(X0);
        X0.mo65022U0();
    }

    public static abstract class Builder<MessageType extends AbstractMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> implements MessageLite.Builder {
        /* renamed from: n */
        protected static <T> void m79295n(Iterable<T> iterable, List<? super T> list) {
            Internal.m80732a(iterable);
            if (iterable instanceof LazyStringList) {
                List<?> r = ((LazyStringList) iterable).mo65276r();
                LazyStringList lazyStringList = (LazyStringList) list;
                int size = list.size();
                for (Object next : r) {
                    if (next == null) {
                        String str = "Element at index " + (lazyStringList.size() - size) + " is null.";
                        for (int size2 = lazyStringList.size() - 1; size2 >= size; size2--) {
                            lazyStringList.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (next instanceof ByteString) {
                        lazyStringList.mo65272Z((ByteString) next);
                    } else {
                        lazyStringList.add((String) next);
                    }
                }
            } else if (iterable instanceof PrimitiveNonBoxingCollection) {
                list.addAll((Collection) iterable);
            } else {
                m79296o(iterable, list);
            }
        }

        /* renamed from: o */
        private static <T> void m79296o(Iterable<T> iterable, List<? super T> list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (T next : iterable) {
                if (next == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(next);
            }
        }

        /* renamed from: q */
        private String m79297q(String str) {
            return "Reading " + getClass().getName() + " from a " + str + " threw an IOException (should never happen).";
        }

        /* renamed from: y */
        protected static UninitializedMessageException m79298y(MessageLite messageLite) {
            return new UninitializedMessageException(messageLite);
        }

        /* renamed from: p */
        public abstract BuilderType clone();

        /* access modifiers changed from: protected */
        /* renamed from: r */
        public abstract BuilderType mo64726r(MessageType messagetype);

        /* renamed from: s */
        public BuilderType mo64727s(CodedInputStream codedInputStream) throws IOException {
            return mo64728t(codedInputStream, ExtensionRegistryLite.m80520b());
        }

        /* renamed from: t */
        public abstract BuilderType mo64728t(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException;

        /* renamed from: u */
        public BuilderType mo64733y0(MessageLite messageLite) {
            if (mo65176e().getClass().isInstance(messageLite)) {
                return mo64726r((AbstractMessageLite) messageLite);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        /* renamed from: v */
        public BuilderType mo64731w1(byte[] bArr) throws InvalidProtocolBufferException {
            return mo64732x(bArr, 0, bArr.length);
        }

        /* renamed from: x */
        public BuilderType mo64732x(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            try {
                CodedInputStream j = CodedInputStream.m79838j(bArr, i, i2);
                mo64727s(j);
                j.mo64958a(0);
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException(m79297q("byte array"), e2);
            }
        }

        static final class LimitedInputStream extends FilterInputStream {

            /* renamed from: a */
            private int f56560a;

            public int available() throws IOException {
                return Math.min(super.available(), this.f56560a);
            }

            public int read() throws IOException {
                if (this.f56560a <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f56560a--;
                }
                return read;
            }

            public long skip(long j) throws IOException {
                long skip = super.skip(Math.min(j, (long) this.f56560a));
                if (skip >= 0) {
                    this.f56560a = (int) (((long) this.f56560a) - skip);
                }
                return skip;
            }

            public int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.f56560a;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, i3));
                if (read >= 0) {
                    this.f56560a -= read;
                }
                return read;
            }
        }
    }
}

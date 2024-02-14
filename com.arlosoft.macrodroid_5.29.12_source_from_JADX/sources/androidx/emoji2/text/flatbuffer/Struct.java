package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public class Struct {

    /* renamed from: bb */
    protected ByteBuffer f538bb;
    protected int bb_pos;

    /* access modifiers changed from: protected */
    public void __reset(int i, ByteBuffer byteBuffer) {
        this.f538bb = byteBuffer;
        if (byteBuffer != null) {
            this.bb_pos = i;
        } else {
            this.bb_pos = 0;
        }
    }

    public void __reset() {
        __reset(0, (ByteBuffer) null);
    }
}

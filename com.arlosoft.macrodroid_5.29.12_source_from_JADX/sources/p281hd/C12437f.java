package p281hd;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

/* renamed from: hd.f */
/* compiled from: DistinctPacketDetector */
public class C12437f {
    @NonNull

    /* renamed from: a */
    private final Set<ByteBuffer> f59221a = new HashSet();

    /* renamed from: a */
    public void mo68819a() {
        this.f59221a.clear();
    }

    /* renamed from: b */
    public boolean mo68820b(@NonNull String str, @NonNull byte[] bArr) {
        byte[] bytes = str.getBytes();
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + bArr.length);
        allocate.put(bytes);
        allocate.put(bArr);
        allocate.rewind();
        if (this.f59221a.size() == 1000) {
            return this.f59221a.contains(allocate);
        }
        return this.f59221a.add(allocate);
    }
}

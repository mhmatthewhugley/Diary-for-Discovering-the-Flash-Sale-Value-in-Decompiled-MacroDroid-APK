package p060a5;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: a5.b */
/* compiled from: ImageHeaderParserRegistry */
public final class C2233b {

    /* renamed from: a */
    private final List<ImageHeaderParser> f6864a = new ArrayList();

    /* renamed from: a */
    public synchronized void mo24450a(@NonNull ImageHeaderParser imageHeaderParser) {
        this.f6864a.add(imageHeaderParser);
    }

    @NonNull
    /* renamed from: b */
    public synchronized List<ImageHeaderParser> mo24451b() {
        return this.f6864a;
    }
}

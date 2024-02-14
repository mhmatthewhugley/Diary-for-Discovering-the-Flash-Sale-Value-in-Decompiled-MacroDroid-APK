package p185w4;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.C6659a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import p090f5.C7311f;
import p090f5.C7316k;
import p095g4.C7333a;
import p095g4.C7336c;
import p095g4.C7337d;
import p095g4.C7338e;
import p102h4.C7377b;
import p102h4.C7384g;
import p102h4.C7385h;
import p126l4.C7667b;
import p126l4.C7669d;
import p158r4.C8197b;

/* renamed from: w4.a */
/* compiled from: ByteBufferGifDecoder */
public class C10332a implements C7385h<ByteBuffer, C10336c> {

    /* renamed from: f */
    private static final C10333a f23505f = new C10333a();

    /* renamed from: g */
    private static final C10334b f23506g = new C10334b();

    /* renamed from: a */
    private final Context f23507a;

    /* renamed from: b */
    private final List<ImageHeaderParser> f23508b;

    /* renamed from: c */
    private final C10334b f23509c;

    /* renamed from: d */
    private final C10333a f23510d;

    /* renamed from: e */
    private final C10335b f23511e;

    @VisibleForTesting
    /* renamed from: w4.a$a */
    /* compiled from: ByteBufferGifDecoder */
    static class C10333a {
        C10333a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C7333a mo40961a(C7333a.C7334a aVar, C7336c cVar, ByteBuffer byteBuffer, int i) {
            return new C7338e(aVar, cVar, byteBuffer, i);
        }
    }

    @VisibleForTesting
    /* renamed from: w4.a$b */
    /* compiled from: ByteBufferGifDecoder */
    static class C10334b {

        /* renamed from: a */
        private final Queue<C7337d> f23512a = C7316k.m30210e(0);

        C10334b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized C7337d mo40962a(ByteBuffer byteBuffer) {
            C7337d poll;
            poll = this.f23512a.poll();
            if (poll == null) {
                poll = new C7337d();
            }
            return poll.mo37319p(byteBuffer);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized void mo40963b(C7337d dVar) {
            dVar.mo37317a();
            this.f23512a.offer(dVar);
        }
    }

    public C10332a(Context context, List<ImageHeaderParser> list, C7669d dVar, C7667b bVar) {
        this(context, list, dVar, bVar, f23506g, f23505f);
    }

    @Nullable
    /* renamed from: c */
    private C10339e m40560c(ByteBuffer byteBuffer, int i, int i2, C7337d dVar, C7384g gVar) {
        long b = C7311f.m30188b();
        try {
            C7336c c = dVar.mo37318c();
            if (c.mo37314b() > 0) {
                if (c.mo37315c() == 0) {
                    Bitmap.Config config = gVar.mo37379c(C10347i.f23550a) == C7377b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                    C7333a a = this.f23510d.mo40961a(this.f23511e, c, byteBuffer, m40561e(c, i, i2));
                    a.mo37302e(config);
                    a.mo37299c();
                    Bitmap b2 = a.mo37298b();
                    if (b2 == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Decoded GIF from stream in ");
                            sb.append(C7311f.m30187a(b));
                        }
                        return null;
                    }
                    C10339e eVar = new C10339e(new C10336c(this.f23507a, a, C8197b.m34012c(), i, i2, b2));
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Decoded GIF from stream in ");
                        sb2.append(C7311f.m30187a(b));
                    }
                    return eVar;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Decoded GIF from stream in ");
                sb3.append(C7311f.m30187a(b));
            }
        }
    }

    /* renamed from: e */
    private static int m40561e(C7336c cVar, int i, int i2) {
        int i3;
        int min = Math.min(cVar.mo37313a() / i2, cVar.mo37316d() / i);
        if (min == 0) {
            i3 = 0;
        } else {
            i3 = Integer.highestOneBit(min);
        }
        int max = Math.max(1, i3);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Downsampling GIF, sampleSize: ");
            sb.append(max);
            sb.append(", target dimens: [");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            sb.append("], actual dimens: [");
            sb.append(cVar.mo37316d());
            sb.append("x");
            sb.append(cVar.mo37313a());
            sb.append("]");
        }
        return max;
    }

    /* renamed from: d */
    public C10339e mo37384b(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull C7384g gVar) {
        C7337d a = this.f23509c.mo40962a(byteBuffer);
        try {
            return m40560c(byteBuffer, i, i2, a, gVar);
        } finally {
            this.f23509c.mo40963b(a);
        }
    }

    /* renamed from: f */
    public boolean mo37383a(@NonNull ByteBuffer byteBuffer, @NonNull C7384g gVar) throws IOException {
        return !((Boolean) gVar.mo37379c(C10347i.f23551b)).booleanValue() && C6659a.m25238c(this.f23508b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    @VisibleForTesting
    C10332a(Context context, List<ImageHeaderParser> list, C7669d dVar, C7667b bVar, C10334b bVar2, C10333a aVar) {
        this.f23507a = context.getApplicationContext();
        this.f23508b = list;
        this.f23510d = aVar;
        this.f23511e = new C10335b(dVar, bVar);
        this.f23509c = bVar2;
    }
}

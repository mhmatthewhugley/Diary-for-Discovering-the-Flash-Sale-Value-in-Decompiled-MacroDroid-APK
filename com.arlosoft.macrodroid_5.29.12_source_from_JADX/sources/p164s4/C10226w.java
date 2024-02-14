package p164s4;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p102h4.C7381f;
import p102h4.C7384g;
import p102h4.C7385h;
import p120k4.C7587c;
import p126l4.C7669d;

/* renamed from: s4.w */
/* compiled from: VideoDecoder */
public class C10226w<T> implements C7385h<T, Bitmap> {

    /* renamed from: d */
    public static final C7381f<Long> f23360d = C7381f.m30481a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C10227a());

    /* renamed from: e */
    public static final C7381f<Integer> f23361e = C7381f.m30481a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C10228b());

    /* renamed from: f */
    private static final C10230d f23362f = new C10230d();

    /* renamed from: a */
    private final C10231e<T> f23363a;

    /* renamed from: b */
    private final C7669d f23364b;

    /* renamed from: c */
    private final C10230d f23365c;

    /* renamed from: s4.w$a */
    /* compiled from: VideoDecoder */
    class C10227a implements C7381f.C7383b<Long> {

        /* renamed from: a */
        private final ByteBuffer f23366a = ByteBuffer.allocate(8);

        C10227a() {
        }

        /* renamed from: b */
        public void mo37378a(@NonNull byte[] bArr, @NonNull Long l, @NonNull MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f23366a) {
                this.f23366a.position(0);
                messageDigest.update(this.f23366a.putLong(l.longValue()).array());
            }
        }
    }

    /* renamed from: s4.w$b */
    /* compiled from: VideoDecoder */
    class C10228b implements C7381f.C7383b<Integer> {

        /* renamed from: a */
        private final ByteBuffer f23367a = ByteBuffer.allocate(4);

        C10228b() {
        }

        /* renamed from: b */
        public void mo37378a(@NonNull byte[] bArr, @NonNull Integer num, @NonNull MessageDigest messageDigest) {
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f23367a) {
                    this.f23367a.position(0);
                    messageDigest.update(this.f23367a.putInt(num.intValue()).array());
                }
            }
        }
    }

    /* renamed from: s4.w$c */
    /* compiled from: VideoDecoder */
    private static final class C10229c implements C10231e<AssetFileDescriptor> {
        private C10229c() {
        }

        /* synthetic */ C10229c(C10227a aVar) {
            this();
        }

        /* renamed from: b */
        public void mo40840a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    @VisibleForTesting
    /* renamed from: s4.w$d */
    /* compiled from: VideoDecoder */
    static class C10230d {
        C10230d() {
        }

        /* renamed from: a */
        public MediaMetadataRetriever mo40842a() {
            return new MediaMetadataRetriever();
        }
    }

    @VisibleForTesting
    /* renamed from: s4.w$e */
    /* compiled from: VideoDecoder */
    interface C10231e<T> {
        /* renamed from: a */
        void mo40840a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* renamed from: s4.w$f */
    /* compiled from: VideoDecoder */
    static final class C10232f implements C10231e<ParcelFileDescriptor> {
        C10232f() {
        }

        /* renamed from: b */
        public void mo40840a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    C10226w(C7669d dVar, C10231e<T> eVar) {
        this(dVar, eVar, f23362f);
    }

    /* renamed from: c */
    public static C7385h<AssetFileDescriptor, Bitmap> m40227c(C7669d dVar) {
        return new C10226w(dVar, new C10229c((C10227a) null));
    }

    @Nullable
    /* renamed from: d */
    private static Bitmap m40228d(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, C10199j jVar) {
        Bitmap f = (Build.VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || jVar == C10199j.f23313f) ? null : m40230f(mediaMetadataRetriever, j, i, i2, i3, jVar);
        return f == null ? m40229e(mediaMetadataRetriever, j, i) : f;
    }

    /* renamed from: e */
    private static Bitmap m40229e(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    /* renamed from: f */
    private static Bitmap m40230f(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, C10199j jVar) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                int i4 = parseInt2;
                parseInt2 = parseInt;
                parseInt = i4;
            }
            float b = jVar.mo40805b(parseInt, parseInt2, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(((float) parseInt) * b), Math.round(b * ((float) parseInt2)));
        } catch (Throwable unused) {
            Log.isLoggable("VideoDecoder", 3);
            return null;
        }
    }

    /* renamed from: g */
    public static C7385h<ParcelFileDescriptor, Bitmap> m40231g(C7669d dVar) {
        return new C10226w(dVar, new C10232f());
    }

    /* renamed from: a */
    public boolean mo37383a(@NonNull T t, @NonNull C7384g gVar) {
        return true;
    }

    /* renamed from: b */
    public C7587c<Bitmap> mo37384b(@NonNull T t, int i, int i2, @NonNull C7384g gVar) throws IOException {
        long longValue = ((Long) gVar.mo37379c(f23360d)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) gVar.mo37379c(f23361e);
            if (num == null) {
                num = 2;
            }
            C10199j jVar = (C10199j) gVar.mo37379c(C10199j.f23315h);
            if (jVar == null) {
                jVar = C10199j.f23314g;
            }
            C10199j jVar2 = jVar;
            MediaMetadataRetriever a = this.f23365c.mo40842a();
            try {
                this.f23363a.mo40840a(a, t);
                Bitmap d = m40228d(a, longValue, num.intValue(), i, i2, jVar2);
                a.release();
                return C10189d.m40094d(d, this.f23364b);
            } catch (RuntimeException e) {
                throw new IOException(e);
            } catch (Throwable th) {
                a.release();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
    }

    @VisibleForTesting
    C10226w(C7669d dVar, C10231e<T> eVar, C10230d dVar2) {
        this.f23364b = dVar;
        this.f23363a = eVar;
        this.f23365c = dVar2;
    }
}

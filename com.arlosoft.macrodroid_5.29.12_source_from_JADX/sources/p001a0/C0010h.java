package p001a0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.provider.Settings;
import androidx.annotation.Nullable;
import com.airbnb.lottie.C1461c;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
import p045q.C2067s;
import p046r.C2076c;

/* renamed from: a0.h */
/* compiled from: Utils */
public final class C0010h {

    /* renamed from: a */
    private static final ThreadLocal<PathMeasure> f30a = new C0011a();

    /* renamed from: b */
    private static final ThreadLocal<Path> f31b = new C0012b();

    /* renamed from: c */
    private static final ThreadLocal<Path> f32c = new C0013c();

    /* renamed from: d */
    private static final ThreadLocal<float[]> f33d = new C0014d();

    /* renamed from: e */
    private static final float f34e = ((float) (Math.sqrt(2.0d) / 2.0d));

    /* renamed from: f */
    private static float f35f = -1.0f;

    /* renamed from: a0.h$a */
    /* compiled from: Utils */
    class C0011a extends ThreadLocal<PathMeasure> {
        C0011a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* renamed from: a0.h$b */
    /* compiled from: Utils */
    class C0012b extends ThreadLocal<Path> {
        C0012b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Path initialValue() {
            return new Path();
        }
    }

    /* renamed from: a0.h$c */
    /* compiled from: Utils */
    class C0013c extends ThreadLocal<Path> {
        C0013c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Path initialValue() {
            return new Path();
        }
    }

    /* renamed from: a0.h$d */
    /* compiled from: Utils */
    class C0014d extends ThreadLocal<float[]> {
        C0014d() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float[] initialValue() {
            return new float[4];
        }
    }

    /* renamed from: a */
    public static void m71a(Path path, float f, float f2, float f3) {
        C1461c.m735a("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = f30a.get();
        Path path2 = f31b.get();
        Path path3 = f32c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            C1461c.m736b("applyTrimPathIfNeeded");
        } else if (length < 1.0f || ((double) Math.abs((f2 - f) - 1.0f)) < 0.01d) {
            C1461c.m736b("applyTrimPathIfNeeded");
        } else {
            float f4 = f * length;
            float f5 = f2 * length;
            float f6 = f3 * length;
            float min = Math.min(f4, f5) + f6;
            float max = Math.max(f4, f5) + f6;
            if (min >= length && max >= length) {
                min = (float) C0009g.m64g(min, length);
                max = (float) C0009g.m64g(max, length);
            }
            if (min < 0.0f) {
                min = (float) C0009g.m64g(min, length);
            }
            if (max < 0.0f) {
                max = (float) C0009g.m64g(max, length);
            }
            int i = (min > max ? 1 : (min == max ? 0 : -1));
            if (i == 0) {
                path.reset();
                C1461c.m736b("applyTrimPathIfNeeded");
                return;
            }
            if (i >= 0) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            C1461c.m736b("applyTrimPathIfNeeded");
        }
    }

    /* renamed from: b */
    public static void m72b(Path path, @Nullable C2067s sVar) {
        if (sVar != null && !sVar.mo24141j()) {
            m71a(path, ((C2076c) sVar.mo24139h()).mo24164p() / 100.0f, ((C2076c) sVar.mo24137d()).mo24164p() / 100.0f, ((C2076c) sVar.mo24138f()).mo24164p() / 360.0f);
        }
    }

    /* renamed from: c */
    public static void m73c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static Path m74d(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f = pointF.x;
            float f2 = pointF2.x;
            float f3 = pointF2.y;
            path.cubicTo(pointF3.x + f, pointF.y + pointF3.y, f2 + pointF4.x, f3 + pointF4.y, f2, f3);
        }
        return path;
    }

    /* renamed from: e */
    public static float m75e() {
        if (f35f == -1.0f) {
            f35f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f35f;
    }

    /* renamed from: f */
    public static float m76f(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    /* renamed from: g */
    public static float m77g(Matrix matrix) {
        float[] fArr = f33d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f34e;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot((double) (fArr[2] - fArr[0]), (double) (fArr[3] - fArr[1]));
    }

    /* renamed from: h */
    public static boolean m78h(Matrix matrix) {
        float[] fArr = f33d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        if (fArr[0] == fArr[2] || fArr[1] == fArr[3]) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static int m79i(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (((float) 527) * f) : 17;
        if (f2 != 0.0f) {
            i = (int) (((float) (i * 31)) * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (((float) (i * 31)) * f3);
        }
        return f4 != 0.0f ? (int) (((float) (i * 31)) * f4) : i;
    }

    /* renamed from: j */
    public static boolean m80j(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        return i2 > i5 || i3 >= i6;
    }

    /* renamed from: k */
    public static boolean m81k(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    /* renamed from: l */
    public static Bitmap m82l(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    /* renamed from: m */
    public static void m83m(Canvas canvas, RectF rectF, Paint paint) {
        m84n(canvas, rectF, paint, 31);
    }

    /* renamed from: n */
    public static void m84n(Canvas canvas, RectF rectF, Paint paint, int i) {
        C1461c.m735a("Utils#saveLayer");
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, i);
        } else {
            canvas.saveLayer(rectF, paint);
        }
        C1461c.m736b("Utils#saveLayer");
    }
}

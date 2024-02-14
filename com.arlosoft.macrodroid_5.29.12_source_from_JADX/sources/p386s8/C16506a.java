package p386s8;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import p368q8.C16232a;
import p377r8.C16362a;
import p377r8.C16363b;
import p377r8.C16364c;
import p395t8.C16581a;
import p395t8.C16585e;
import p395t8.C16586f;

/* renamed from: s8.a */
/* compiled from: BitmapCropTask */
public class C16506a extends AsyncTask<Void, Void, Throwable> {

    /* renamed from: a */
    private final WeakReference<Context> f67204a;

    /* renamed from: b */
    private Bitmap f67205b;

    /* renamed from: c */
    private final RectF f67206c;

    /* renamed from: d */
    private final RectF f67207d;

    /* renamed from: e */
    private float f67208e;

    /* renamed from: f */
    private float f67209f;

    /* renamed from: g */
    private final int f67210g;

    /* renamed from: h */
    private final int f67211h;

    /* renamed from: i */
    private final Bitmap.CompressFormat f67212i;

    /* renamed from: j */
    private final int f67213j;

    /* renamed from: k */
    private final String f67214k;

    /* renamed from: l */
    private final String f67215l;

    /* renamed from: m */
    private final C16363b f67216m;

    /* renamed from: n */
    private final C16232a f67217n;

    /* renamed from: o */
    private int f67218o;

    /* renamed from: p */
    private int f67219p;

    /* renamed from: q */
    private int f67220q;

    /* renamed from: r */
    private int f67221r;

    public C16506a(@NonNull Context context, @Nullable Bitmap bitmap, @NonNull C16364c cVar, @NonNull C16362a aVar, @Nullable C16232a aVar2) {
        this.f67204a = new WeakReference<>(context);
        this.f67205b = bitmap;
        this.f67206c = cVar.mo79048a();
        this.f67207d = cVar.mo79050c();
        this.f67208e = cVar.mo79051d();
        this.f67209f = cVar.mo79049b();
        this.f67210g = aVar.mo79044f();
        this.f67211h = aVar.mo79045g();
        this.f67212i = aVar.mo79039a();
        this.f67213j = aVar.mo79040b();
        this.f67214k = aVar.mo79042d();
        this.f67215l = aVar.mo79043e();
        this.f67216m = aVar.mo79041c();
        this.f67217n = aVar2;
    }

    /* renamed from: a */
    private boolean m98586a() throws IOException {
        if (this.f67210g > 0 && this.f67211h > 0) {
            float width = this.f67206c.width() / this.f67208e;
            float height = this.f67206c.height() / this.f67208e;
            int i = this.f67210g;
            if (width > ((float) i) || height > ((float) this.f67211h)) {
                float min = Math.min(((float) i) / width, ((float) this.f67211h) / height);
                Bitmap bitmap = this.f67205b;
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(((float) bitmap.getWidth()) * min), Math.round(((float) this.f67205b.getHeight()) * min), false);
                Bitmap bitmap2 = this.f67205b;
                if (bitmap2 != createScaledBitmap) {
                    bitmap2.recycle();
                }
                this.f67205b = createScaledBitmap;
                this.f67208e /= min;
            }
        }
        if (this.f67209f != 0.0f) {
            Matrix matrix = new Matrix();
            matrix.setRotate(this.f67209f, (float) (this.f67205b.getWidth() / 2), (float) (this.f67205b.getHeight() / 2));
            Bitmap bitmap3 = this.f67205b;
            Bitmap createBitmap = Bitmap.createBitmap(bitmap3, 0, 0, bitmap3.getWidth(), this.f67205b.getHeight(), matrix, true);
            Bitmap bitmap4 = this.f67205b;
            if (bitmap4 != createBitmap) {
                bitmap4.recycle();
            }
            this.f67205b = createBitmap;
        }
        this.f67220q = Math.round((this.f67206c.left - this.f67207d.left) / this.f67208e);
        this.f67221r = Math.round((this.f67206c.top - this.f67207d.top) / this.f67208e);
        this.f67218o = Math.round(this.f67206c.width() / this.f67208e);
        int round = Math.round(this.f67206c.height() / this.f67208e);
        this.f67219p = round;
        boolean e = m98588e(this.f67218o, round);
        Log.i("BitmapCropTask", "Should crop: " + e);
        if (e) {
            ExifInterface exifInterface = new ExifInterface(this.f67214k);
            m98587d(Bitmap.createBitmap(this.f67205b, this.f67220q, this.f67221r, this.f67218o, this.f67219p));
            if (!this.f67212i.equals(Bitmap.CompressFormat.JPEG)) {
                return true;
            }
            C16586f.m98853b(exifInterface, this.f67218o, this.f67219p, this.f67215l);
            return true;
        }
        C16585e.m98845a(this.f67214k, this.f67215l);
        return false;
    }

    /* renamed from: d */
    private void m98587d(@NonNull Bitmap bitmap) throws FileNotFoundException {
        Context context = (Context) this.f67204a.get();
        if (context != null) {
            OutputStream outputStream = null;
            try {
                outputStream = context.getContentResolver().openOutputStream(Uri.fromFile(new File(this.f67215l)));
                bitmap.compress(this.f67212i, this.f67213j, outputStream);
                bitmap.recycle();
            } finally {
                C16581a.m98833c(outputStream);
            }
        }
    }

    /* renamed from: e */
    private boolean m98588e(int i, int i2) {
        int round = Math.round(((float) Math.max(i, i2)) / 1000.0f) + 1;
        if (this.f67210g > 0 && this.f67211h > 0) {
            return true;
        }
        float f = (float) round;
        if (Math.abs(this.f67206c.left - this.f67207d.left) > f || Math.abs(this.f67206c.top - this.f67207d.top) > f || Math.abs(this.f67206c.bottom - this.f67207d.bottom) > f || Math.abs(this.f67206c.right - this.f67207d.right) > f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: b */
    public Throwable doInBackground(Void... voidArr) {
        Bitmap bitmap = this.f67205b;
        if (bitmap == null) {
            return new NullPointerException("ViewBitmap is null");
        }
        if (bitmap.isRecycled()) {
            return new NullPointerException("ViewBitmap is recycled");
        }
        if (this.f67207d.isEmpty()) {
            return new NullPointerException("CurrentImageRect is empty");
        }
        try {
            m98586a();
            this.f67205b = null;
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void onPostExecute(@Nullable Throwable th) {
        C16232a aVar = this.f67217n;
        if (aVar == null) {
            return;
        }
        if (th == null) {
            this.f67217n.mo67205a(Uri.fromFile(new File(this.f67215l)), this.f67220q, this.f67221r, this.f67218o, this.f67219p);
            return;
        }
        aVar.mo67206b(th);
    }
}

package dev.skomlach.biometric.compat.utils.activityView;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.renderscript.RSRuntimeException;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00020\u0006\"\u00020\u0007H\u0002J \u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eJ\"\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0007H\u0003J\"\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0004H\u0002¨\u0006\u0015"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/activityView/FastBlur;", "", "()V", "hasZero", "", "args", "", "", "of", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "source", "factor", "Ldev/skomlach/biometric/compat/utils/activityView/FastBlurConfig;", "rs", "bitmap", "radius", "stack", "sentBitmap", "canReuseInBitmap", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: FastBlur.kt */
public final class FastBlur {
    public static final FastBlur INSTANCE = new FastBlur();

    private FastBlur() {
    }

    private final boolean hasZero(int... iArr) {
        for (int i : iArr) {
            if (i == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.renderscript.RenderScript} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.renderscript.RenderScript} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061  */
    @androidx.annotation.RequiresApi(api = 17)
    /* renamed from: rs */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.graphics.Bitmap m82540rs(android.content.Context r6, android.graphics.Bitmap r7, int r8) throws android.renderscript.RSRuntimeException {
        /*
            r5 = this;
            r0 = 0
            android.renderscript.RenderScript r6 = android.renderscript.RenderScript.create(r6)     // Catch:{ all -> 0x004c }
            android.renderscript.RenderScript$RSMessageHandler r1 = new android.renderscript.RenderScript$RSMessageHandler     // Catch:{ all -> 0x0046 }
            r1.<init>()     // Catch:{ all -> 0x0046 }
            r6.setMessageHandler(r1)     // Catch:{ all -> 0x0046 }
            android.renderscript.Allocation$MipmapControl r1 = android.renderscript.Allocation.MipmapControl.MIPMAP_NONE     // Catch:{ all -> 0x0046 }
            r2 = 1
            android.renderscript.Allocation r1 = android.renderscript.Allocation.createFromBitmap(r6, r7, r1, r2)     // Catch:{ all -> 0x0046 }
            android.renderscript.Type r2 = r1.getType()     // Catch:{ all -> 0x0043 }
            android.renderscript.Allocation r2 = android.renderscript.Allocation.createTyped(r6, r2)     // Catch:{ all -> 0x0043 }
            android.renderscript.Element r3 = android.renderscript.Element.U8_4(r6)     // Catch:{ all -> 0x003e }
            android.renderscript.ScriptIntrinsicBlur r0 = android.renderscript.ScriptIntrinsicBlur.create(r6, r3)     // Catch:{ all -> 0x003e }
            r0.setInput(r1)     // Catch:{ all -> 0x003e }
            float r8 = (float) r8     // Catch:{ all -> 0x003e }
            r0.setRadius(r8)     // Catch:{ all -> 0x003e }
            r0.forEach(r2)     // Catch:{ all -> 0x003e }
            r2.copyTo(r7)     // Catch:{ all -> 0x003e }
            r6.destroy()
            r1.destroy()
            r2.destroy()
            r0.destroy()
            return r7
        L_0x003e:
            r7 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
            goto L_0x0050
        L_0x0043:
            r7 = move-exception
            r2 = r0
            goto L_0x0049
        L_0x0046:
            r7 = move-exception
            r1 = r0
            r2 = r1
        L_0x0049:
            r0 = r6
            r6 = r2
            goto L_0x0050
        L_0x004c:
            r7 = move-exception
            r6 = r0
            r1 = r6
            r2 = r1
        L_0x0050:
            if (r0 == 0) goto L_0x0055
            r0.destroy()
        L_0x0055:
            if (r1 == 0) goto L_0x005a
            r1.destroy()
        L_0x005a:
            if (r2 == 0) goto L_0x005f
            r2.destroy()
        L_0x005f:
            if (r6 == 0) goto L_0x0064
            r6.destroy()
        L_0x0064:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.skomlach.biometric.compat.utils.activityView.FastBlur.m82540rs(android.content.Context, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    private final Bitmap stack(Bitmap bitmap, int i, boolean z) {
        Bitmap bitmap2;
        int[] iArr;
        int i2 = i;
        if (z) {
            bitmap2 = bitmap;
        } else {
            bitmap2 = bitmap.copy(bitmap.getConfig(), true);
            C13706o.m87928e(bitmap2, "{\n            sentBitmap…p.config, true)\n        }");
        }
        if (i2 < 1) {
            return null;
        }
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        int i3 = width * height;
        int[] iArr2 = new int[i3];
        bitmap2.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i4 = width - 1;
        int i5 = height - 1;
        int i6 = i2 + i2 + 1;
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[i3];
        int[] iArr5 = new int[i3];
        int[] iArr6 = new int[Math.max(width, height)];
        int i7 = (i6 + 1) >> 1;
        int i8 = i7 * i7;
        int i9 = i8 * 256;
        int[] iArr7 = new int[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            iArr7[i10] = i10 / i8;
        }
        int[][] iArr8 = new int[i6][];
        for (int i11 = 0; i11 < i6; i11++) {
            iArr8[i11] = new int[3];
        }
        int i12 = i2 + 1;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < height) {
            Bitmap bitmap3 = bitmap2;
            int i16 = height;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = -i2;
            int i26 = 0;
            while (i25 <= i2) {
                int i27 = i5;
                int[] iArr9 = iArr6;
                int i28 = iArr2[i14 + C16792h.m99542d(i4, C16792h.m99540b(i25, 0))];
                int[] iArr10 = iArr8[i25 + i2];
                iArr10[0] = (i28 & 16711680) >> 16;
                iArr10[1] = (i28 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr10[2] = i28 & 255;
                int abs = i12 - Math.abs(i25);
                i26 += iArr10[0] * abs;
                i17 += iArr10[1] * abs;
                i18 += iArr10[2] * abs;
                if (i25 > 0) {
                    i22 += iArr10[0];
                    i23 += iArr10[1];
                    i24 += iArr10[2];
                } else {
                    i19 += iArr10[0];
                    i20 += iArr10[1];
                    i21 += iArr10[2];
                }
                i25++;
                i5 = i27;
                iArr6 = iArr9;
            }
            int i29 = i5;
            int[] iArr11 = iArr6;
            int i30 = i2;
            int i31 = i26;
            int i32 = 0;
            while (i32 < width) {
                iArr3[i14] = iArr7[i31];
                iArr4[i14] = iArr7[i17];
                iArr5[i14] = iArr7[i18];
                int i33 = i31 - i19;
                int i34 = i17 - i20;
                int i35 = i18 - i21;
                int[] iArr12 = iArr8[((i30 - i2) + i6) % i6];
                int i36 = i19 - iArr12[0];
                int i37 = i20 - iArr12[1];
                int i38 = i21 - iArr12[2];
                if (i13 == 0) {
                    iArr = iArr7;
                    iArr11[i32] = C16792h.m99542d(i32 + i2 + 1, i4);
                } else {
                    iArr = iArr7;
                }
                int i39 = iArr2[i15 + iArr11[i32]];
                iArr12[0] = (i39 & 16711680) >> 16;
                iArr12[1] = (i39 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr12[2] = i39 & 255;
                int i40 = i22 + iArr12[0];
                int i41 = i23 + iArr12[1];
                int i42 = i24 + iArr12[2];
                i31 = i33 + i40;
                i17 = i34 + i41;
                i18 = i35 + i42;
                i30 = (i30 + 1) % i6;
                int[] iArr13 = iArr8[i30 % i6];
                i19 = i36 + iArr13[0];
                i20 = i37 + iArr13[1];
                i21 = i38 + iArr13[2];
                i22 = i40 - iArr13[0];
                i23 = i41 - iArr13[1];
                i24 = i42 - iArr13[2];
                i14++;
                i32++;
                iArr7 = iArr;
            }
            int[] iArr14 = iArr7;
            i15 += width;
            i13++;
            bitmap2 = bitmap3;
            height = i16;
            i5 = i29;
            iArr6 = iArr11;
        }
        Bitmap bitmap4 = bitmap2;
        int i43 = i5;
        int[] iArr15 = iArr6;
        int i44 = height;
        int[] iArr16 = iArr7;
        int i45 = 0;
        while (i45 < width) {
            int i46 = -i2;
            int i47 = i6;
            int[] iArr17 = iArr2;
            int i48 = 0;
            int i49 = 0;
            int i50 = 0;
            int i51 = 0;
            int i52 = 0;
            int i53 = 0;
            int i54 = 0;
            int i55 = i46;
            int i56 = i46 * width;
            int i57 = 0;
            int i58 = 0;
            while (i55 <= i2) {
                int i59 = width;
                int b = C16792h.m99540b(0, i56) + i45;
                int[] iArr18 = iArr8[i55 + i2];
                iArr18[0] = iArr3[b];
                iArr18[1] = iArr4[b];
                iArr18[2] = iArr5[b];
                int abs2 = i12 - Math.abs(i55);
                i57 += iArr3[b] * abs2;
                i58 += iArr4[b] * abs2;
                i48 += iArr5[b] * abs2;
                if (i55 > 0) {
                    i52 += iArr18[0];
                    i53 += iArr18[1];
                    i54 += iArr18[2];
                } else {
                    i49 += iArr18[0];
                    i50 += iArr18[1];
                    i51 += iArr18[2];
                }
                int i60 = i43;
                if (i55 < i60) {
                    i56 += i59;
                }
                i55++;
                i43 = i60;
                width = i59;
            }
            int i61 = width;
            int i62 = i43;
            int i63 = i2;
            int i64 = i45;
            int i65 = i44;
            int i66 = 0;
            while (i66 < i65) {
                iArr17[i64] = (iArr17[i64] & ViewCompat.MEASURED_STATE_MASK) | (iArr16[i57] << 16) | (iArr16[i58] << 8) | iArr16[i48];
                int i67 = i57 - i49;
                int i68 = i58 - i50;
                int i69 = i48 - i51;
                int[] iArr19 = iArr8[((i63 - i2) + i47) % i47];
                int i70 = i49 - iArr19[0];
                int i71 = i50 - iArr19[1];
                int i72 = i51 - iArr19[2];
                if (i45 == 0) {
                    iArr15[i66] = Math.min(i66 + i12, i62) * i61;
                }
                int i73 = iArr15[i66] + i45;
                iArr19[0] = iArr3[i73];
                iArr19[1] = iArr4[i73];
                iArr19[2] = iArr5[i73];
                int i74 = i52 + iArr19[0];
                int i75 = i53 + iArr19[1];
                int i76 = i54 + iArr19[2];
                i57 = i67 + i74;
                i58 = i68 + i75;
                i48 = i69 + i76;
                i63 = (i63 + 1) % i47;
                int[] iArr20 = iArr8[i63];
                i49 = i70 + iArr20[0];
                i50 = i71 + iArr20[1];
                i51 = i72 + iArr20[2];
                i52 = i74 - iArr20[0];
                i53 = i75 - iArr20[1];
                i54 = i76 - iArr20[2];
                i64 += i61;
                i66++;
                i2 = i;
            }
            i45++;
            i2 = i;
            i43 = i62;
            i44 = i65;
            i6 = i47;
            iArr2 = iArr17;
            width = i61;
        }
        int i77 = width;
        bitmap4.setPixels(iArr2, 0, i77, 0, 0, i77, i44);
        return bitmap4;
    }

    /* renamed from: of */
    public final Bitmap mo68136of(Context context, Bitmap bitmap, FastBlurConfig fastBlurConfig) {
        Bitmap bitmap2;
        C13706o.m87929f(context, "context");
        C13706o.m87929f(bitmap, "source");
        C13706o.m87929f(fastBlurConfig, "factor");
        int width = fastBlurConfig.getWidth() / fastBlurConfig.getSampling();
        int height = fastBlurConfig.getHeight() / fastBlurConfig.getSampling();
        if (hasZero(width, height)) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(createBitmap);
        float f = (float) 1;
        canvas.scale(f / ((float) fastBlurConfig.getSampling()), f / ((float) fastBlurConfig.getSampling()));
        Paint paint = new Paint();
        paint.setFlags(3);
        paint.setColorFilter(new PorterDuffColorFilter(fastBlurConfig.getColor(), PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        try {
            C13706o.m87928e(createBitmap, "bitmap");
            bitmap2 = m82540rs(context, createBitmap, fastBlurConfig.getRadius());
        } catch (RSRuntimeException unused) {
            C13706o.m87928e(createBitmap, "bitmap");
            bitmap2 = stack(createBitmap, fastBlurConfig.getRadius(), true);
        }
        if (fastBlurConfig.getSampling() == 1) {
            return bitmap2;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, fastBlurConfig.getWidth(), fastBlurConfig.getHeight(), true);
        bitmap2.recycle();
        return createScaledBitmap;
    }
}

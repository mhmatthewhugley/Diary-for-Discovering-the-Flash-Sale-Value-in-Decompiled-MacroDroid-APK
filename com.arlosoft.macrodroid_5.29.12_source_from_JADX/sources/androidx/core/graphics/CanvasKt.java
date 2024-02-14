package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.Metadata;
import kotlin.jvm.internal.C13705n;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\bø\u0001\u0000\u001a8\u0010\b\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\bø\u0001\u0000\u001aB\u0010\f\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\bø\u0001\u0000\u001aL\u0010\r\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\bø\u0001\u0000\u001a8\u0010\u000e\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\bø\u0001\u0000\u001a.\u0010\u0011\u001a\u00020\u0002*\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\bø\u0001\u0000\u001a,\u0010\u0014\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\bø\u0001\u0000\u001a,\u0010\u0014\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00152\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\bø\u0001\u0000\u001aD\u0010\u0014\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00162\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\bø\u0001\u0000\u001aD\u0010\u0014\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00052\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\bø\u0001\u0000\u001a,\u0010\u0014\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u001d"}, mo71668d2 = {"Landroid/graphics/Canvas;", "Lkotlin/Function1;", "Lja/u;", "block", "withSave", "", "x", "y", "withTranslation", "degrees", "pivotX", "pivotY", "withRotation", "withScale", "withSkew", "Landroid/graphics/Matrix;", "matrix", "withMatrix", "Landroid/graphics/Rect;", "clipRect", "withClip", "Landroid/graphics/RectF;", "", "left", "top", "right", "bottom", "Landroid/graphics/Path;", "clipPath", "core-ktx_release"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* compiled from: Canvas.kt */
public final class CanvasKt {
    public static final void withClip(Canvas canvas, Rect rect, C16265l<? super Canvas, C13339u> lVar) {
        C13706o.m87929f(canvas, "<this>");
        C13706o.m87929f(rect, "clipRect");
        C13706o.m87929f(lVar, "block");
        int save = canvas.save();
        canvas.clipRect(rect);
        try {
            lVar.invoke(canvas);
        } finally {
            C13705n.m87922b(1);
            canvas.restoreToCount(save);
            C13705n.m87921a(1);
        }
    }

    public static final void withMatrix(Canvas canvas, Matrix matrix, C16265l<? super Canvas, C13339u> lVar) {
        C13706o.m87929f(canvas, "<this>");
        C13706o.m87929f(matrix, "matrix");
        C13706o.m87929f(lVar, "block");
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            lVar.invoke(canvas);
        } finally {
            C13705n.m87922b(1);
            canvas.restoreToCount(save);
            C13705n.m87921a(1);
        }
    }

    public static /* synthetic */ void withMatrix$default(Canvas canvas, Matrix matrix, C16265l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            matrix = new Matrix();
        }
        C13706o.m87929f(canvas, "<this>");
        C13706o.m87929f(matrix, "matrix");
        C13706o.m87929f(lVar, "block");
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            lVar.invoke(canvas);
        } finally {
            C13705n.m87922b(1);
            canvas.restoreToCount(save);
            C13705n.m87921a(1);
        }
    }

    public static final void withRotation(Canvas canvas, float f, float f2, float f3, C16265l<? super Canvas, C13339u> lVar) {
        C13706o.m87929f(canvas, "<this>");
        C13706o.m87929f(lVar, "block");
        int save = canvas.save();
        canvas.rotate(f, f2, f3);
        try {
            lVar.invoke(canvas);
        } finally {
            C13705n.m87922b(1);
            canvas.restoreToCount(save);
            C13705n.m87921a(1);
        }
    }

    public static /* synthetic */ void withRotation$default(Canvas canvas, float f, float f2, float f3, C16265l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        C13706o.m87929f(canvas, "<this>");
        C13706o.m87929f(lVar, "block");
        int save = canvas.save();
        canvas.rotate(f, f2, f3);
        try {
            lVar.invoke(canvas);
        } finally {
            C13705n.m87922b(1);
            canvas.restoreToCount(save);
            C13705n.m87921a(1);
        }
    }

    public static final void withSave(Canvas canvas, C16265l<? super Canvas, C13339u> lVar) {
        C13706o.m87929f(canvas, "<this>");
        C13706o.m87929f(lVar, "block");
        int save = canvas.save();
        try {
            lVar.invoke(canvas);
        } finally {
            C13705n.m87922b(1);
            canvas.restoreToCount(save);
            C13705n.m87921a(1);
        }
    }

    public static final void withScale(Canvas canvas, float f, float f2, float f3, float f4, C16265l<? super Canvas, C13339u> lVar) {
        C13706o.m87929f(canvas, "<this>");
        C13706o.m87929f(lVar, "block");
        int save = canvas.save();
        canvas.scale(f, f2, f3, f4);
        try {
            lVar.invoke(canvas);
        } finally {
            C13705n.m87922b(1);
            canvas.restoreToCount(save);
            C13705n.m87921a(1);
        }
    }

    public static /* synthetic */ void withScale$default(Canvas canvas, float f, float f2, float f3, float f4, C16265l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        C13706o.m87929f(canvas, "<this>");
        C13706o.m87929f(lVar, "block");
        int save = canvas.save();
        canvas.scale(f, f2, f3, f4);
        try {
            lVar.invoke(canvas);
        } finally {
            C13705n.m87922b(1);
            canvas.restoreToCount(save);
            C13705n.m87921a(1);
        }
    }

    public static final void withSkew(Canvas canvas, float f, float f2, C16265l<? super Canvas, C13339u> lVar) {
        C13706o.m87929f(canvas, "<this>");
        C13706o.m87929f(lVar, "block");
        int save = canvas.save();
        canvas.skew(f, f2);
        try {
            lVar.invoke(canvas);
        } finally {
            C13705n.m87922b(1);
            canvas.restoreToCount(save);
            C13705n.m87921a(1);
        }
    }

    public static /* synthetic */ void withSkew$default(Canvas canvas, float f, float f2, C16265l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        C13706o.m87929f(canvas, "<this>");
        C13706o.m87929f(lVar, "block");
        int save = canvas.save();
        canvas.skew(f, f2);
        try {
            lVar.invoke(canvas);
        } finally {
            C13705n.m87922b(1);
            canvas.restoreToCount(save);
            C13705n.m87921a(1);
        }
    }

    public static final void withTranslation(Canvas canvas, float f, float f2, C16265l<? super Canvas, C13339u> lVar) {
        C13706o.m87929f(canvas, "<this>");
        C13706o.m87929f(lVar, "block");
        int save = canvas.save();
        canvas.translate(f, f2);
        try {
            lVar.invoke(canvas);
        } finally {
            C13705n.m87922b(1);
            canvas.restoreToCount(save);
            C13705n.m87921a(1);
        }
    }

    public static /* synthetic */ void withTranslation$default(Canvas canvas, float f, float f2, C16265l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        C13706o.m87929f(canvas, "<this>");
        C13706o.m87929f(lVar, "block");
        int save = canvas.save();
        canvas.translate(f, f2);
        try {
            lVar.invoke(canvas);
        } finally {
            C13705n.m87922b(1);
            canvas.restoreToCount(save);
            C13705n.m87921a(1);
        }
    }

    public static final void withClip(Canvas canvas, RectF rectF, C16265l<? super Canvas, C13339u> lVar) {
        C13706o.m87929f(canvas, "<this>");
        C13706o.m87929f(rectF, "clipRect");
        C13706o.m87929f(lVar, "block");
        int save = canvas.save();
        canvas.clipRect(rectF);
        try {
            lVar.invoke(canvas);
        } finally {
            C13705n.m87922b(1);
            canvas.restoreToCount(save);
            C13705n.m87921a(1);
        }
    }

    public static final void withClip(Canvas canvas, int i, int i2, int i3, int i4, C16265l<? super Canvas, C13339u> lVar) {
        C13706o.m87929f(canvas, "<this>");
        C13706o.m87929f(lVar, "block");
        int save = canvas.save();
        canvas.clipRect(i, i2, i3, i4);
        try {
            lVar.invoke(canvas);
        } finally {
            C13705n.m87922b(1);
            canvas.restoreToCount(save);
            C13705n.m87921a(1);
        }
    }

    public static final void withClip(Canvas canvas, float f, float f2, float f3, float f4, C16265l<? super Canvas, C13339u> lVar) {
        C13706o.m87929f(canvas, "<this>");
        C13706o.m87929f(lVar, "block");
        int save = canvas.save();
        canvas.clipRect(f, f2, f3, f4);
        try {
            lVar.invoke(canvas);
        } finally {
            C13705n.m87922b(1);
            canvas.restoreToCount(save);
            C13705n.m87921a(1);
        }
    }

    public static final void withClip(Canvas canvas, Path path, C16265l<? super Canvas, C13339u> lVar) {
        C13706o.m87929f(canvas, "<this>");
        C13706o.m87929f(path, "clipPath");
        C13706o.m87929f(lVar, "block");
        int save = canvas.save();
        canvas.clipPath(path);
        try {
            lVar.invoke(canvas);
        } finally {
            C13705n.m87922b(1);
            canvas.restoreToCount(save);
            C13705n.m87921a(1);
        }
    }
}

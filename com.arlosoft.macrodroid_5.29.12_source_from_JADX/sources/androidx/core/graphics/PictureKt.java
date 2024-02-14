package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Picture;
import kotlin.Metadata;
import kotlin.jvm.internal.C13705n;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a4\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\t"}, mo71668d2 = {"Landroid/graphics/Picture;", "", "width", "height", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "Lja/u;", "block", "record", "core-ktx_release"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* compiled from: Picture.kt */
public final class PictureKt {
    public static final Picture record(Picture picture, int i, int i2, C16265l<? super Canvas, C13339u> lVar) {
        C13706o.m87929f(picture, "<this>");
        C13706o.m87929f(lVar, "block");
        Canvas beginRecording = picture.beginRecording(i, i2);
        C13706o.m87928e(beginRecording, "beginRecording(width, height)");
        try {
            lVar.invoke(beginRecording);
            return picture;
        } finally {
            C13705n.m87922b(1);
            picture.endRecording();
            C13705n.m87921a(1);
        }
    }
}

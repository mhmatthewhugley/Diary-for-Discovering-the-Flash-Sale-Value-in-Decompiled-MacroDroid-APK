package p439y8;

import android.graphics.Color;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, mo71668d2 = {"", "color", "", "a", "library_release"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* renamed from: y8.a */
/* compiled from: ColorUtilsExt.kt */
public final class C16970a {
    /* renamed from: a */
    public static final boolean m100209a(int i) {
        return ((double) 1) - ((((((double) Color.red(i)) * 0.299d) + (((double) Color.green(i)) * 0.587d)) + (((double) Color.blue(i)) * 0.114d)) / ((double) 255)) >= 0.5d;
    }
}

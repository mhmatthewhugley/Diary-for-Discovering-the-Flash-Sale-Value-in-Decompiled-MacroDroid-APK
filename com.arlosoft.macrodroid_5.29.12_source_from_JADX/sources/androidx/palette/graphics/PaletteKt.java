package androidx.palette.graphics;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.palette.graphics.Palette;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {1, 0, 2}, mo71667d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¨\u0006\u0005"}, mo71668d2 = {"get", "Landroidx/palette/graphics/Palette$Swatch;", "Landroidx/palette/graphics/Palette;", "target", "Landroidx/palette/graphics/Target;", "palette-ktx_release"}, mo71669k = 2, mo71670mv = {1, 1, 10})
/* compiled from: Palette.kt */
public final class PaletteKt {
    public static final Palette.Swatch get(Palette palette, Target target) {
        C13706o.m87930g(palette, "$receiver");
        C13706o.m87930g(target, TypedValues.Attributes.S_TARGET);
        return palette.getSwatchForTarget(target);
    }
}

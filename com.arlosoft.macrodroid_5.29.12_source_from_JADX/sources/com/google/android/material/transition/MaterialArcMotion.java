package com.google.android.material.transition;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.transition.PathMotion;

public final class MaterialArcMotion extends PathMotion {
    /* renamed from: a */
    private static PointF m70160a(float f, float f2, float f3, float f4) {
        if (f2 > f4) {
            return new PointF(f3, f2);
        }
        return new PointF(f, f4);
    }

    @NonNull
    public Path getPath(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        PointF a = m70160a(f, f2, f3, f4);
        path.quadTo(a.x, a.y, f3, f4);
        return path;
    }
}

package com.google.android.material.motion;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.PathParser;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.google.android.material.resources.MaterialAttributes;
import org.apache.http.cookie.ClientCookie;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class MotionUtils {
    private MotionUtils() {
    }

    /* renamed from: a */
    private static float m68857a(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    /* renamed from: b */
    private static String m68858b(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    /* renamed from: c */
    private static boolean m68859c(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("(");
        return str.startsWith(sb.toString()) && str.endsWith(")");
    }

    /* renamed from: d */
    public static int m68860d(@NonNull Context context, @AttrRes int i, int i2) {
        return MaterialAttributes.m69118c(context, i, i2);
    }

    @NonNull
    /* renamed from: e */
    public static TimeInterpolator m68861e(@NonNull Context context, @AttrRes int i, @NonNull TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (m68859c(valueOf, "cubic-bezier")) {
                String[] split = m68858b(valueOf, "cubic-bezier").split(",");
                if (split.length == 4) {
                    return PathInterpolatorCompat.create(m68857a(split, 0), m68857a(split, 1), m68857a(split, 2), m68857a(split, 3));
                }
                throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
            } else if (m68859c(valueOf, ClientCookie.PATH_ATTR)) {
                return PathInterpolatorCompat.create(PathParser.createPathFromPathData(m68858b(valueOf, ClientCookie.PATH_ATTR)));
            } else {
                throw new IllegalArgumentException("Invalid motion easing type: " + valueOf);
            }
        } else {
            throw new IllegalArgumentException("Motion easing theme attribute must be a string");
        }
    }
}

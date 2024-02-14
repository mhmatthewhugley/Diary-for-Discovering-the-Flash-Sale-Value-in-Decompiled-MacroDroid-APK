package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* renamed from: androidx.constraintlayout.core.motion.utils.e */
/* compiled from: TypedValues */
public final /* synthetic */ class C0332e {
    static {
        String str = TypedValues.MotionScene.NAME;
    }

    /* renamed from: a */
    public static int m390a(String str) {
        str.hashCode();
        if (!str.equals(TypedValues.MotionScene.S_DEFAULT_DURATION)) {
            return !str.equals(TypedValues.MotionScene.S_LAYOUT_DURING_TRANSITION) ? -1 : 601;
        }
        return 600;
    }

    /* renamed from: b */
    public static int m391b(int i) {
        if (i != 600) {
            return i != 601 ? -1 : 1;
        }
        return 2;
    }
}

package com.google.android.gms.location.places;

import androidx.core.view.InputDeviceCompat;
import androidx.core.view.PointerIconCompat;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.CollectionUtils;
import dev.skomlach.biometric.compat.engine.internal.iris.samsung.SamsungIrisUnlockModule;
import java.util.Set;

@Deprecated
public class PlaceTypes {
    @ShowFirstParty

    /* renamed from: a */
    private static final Set<Integer> f45923a;
    @ShowFirstParty

    /* renamed from: b */
    private static final Set<Integer> f45924b;

    /* renamed from: c */
    public static final Set<Integer> f45925c;

    static {
        Integer valueOf = Integer.valueOf(SamsungIrisUnlockModule.IRIS_ERROR_IDENTIFY_FAILURE_SENSOR_CHANGED);
        Integer valueOf2 = Integer.valueOf(PointerIconCompat.TYPE_VERTICAL_TEXT);
        Integer valueOf3 = Integer.valueOf(PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW);
        Integer valueOf4 = Integer.valueOf(PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW);
        Integer valueOf5 = Integer.valueOf(PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW);
        f45923a = CollectionUtils.m4867g(1001, 1002, 1003, valueOf, 1006, valueOf2, Integer.valueOf(PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW), valueOf3, valueOf4, valueOf5, Integer.valueOf(PointerIconCompat.TYPE_ZOOM_IN), Integer.valueOf(PointerIconCompat.TYPE_ZOOM_OUT), Integer.valueOf(PointerIconCompat.TYPE_GRAB), Integer.valueOf(PointerIconCompat.TYPE_GRABBING), 1022, 1023, 1024, Integer.valueOf(InputDeviceCompat.SOURCE_GAMEPAD), 1026, 1027, 1028);
        f45924b = CollectionUtils.m4867g(1001, 1002, 1003, valueOf, valueOf2, valueOf3, valueOf4, valueOf5);
        f45925c = CollectionUtils.m4867g(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 1001, 1002, 1003, 1004, valueOf, 1006, Integer.valueOf(PointerIconCompat.TYPE_CROSSHAIR), Integer.valueOf(PointerIconCompat.TYPE_TEXT), valueOf2, Integer.valueOf(PointerIconCompat.TYPE_ALIAS), 1011, Integer.valueOf(PointerIconCompat.TYPE_NO_DROP), Integer.valueOf(PointerIconCompat.TYPE_ALL_SCROLL), Integer.valueOf(PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW), valueOf3, valueOf4, valueOf5, Integer.valueOf(PointerIconCompat.TYPE_ZOOM_IN), Integer.valueOf(PointerIconCompat.TYPE_ZOOM_OUT), Integer.valueOf(PointerIconCompat.TYPE_GRAB), Integer.valueOf(PointerIconCompat.TYPE_GRABBING), 1022, 1023, 1024, Integer.valueOf(InputDeviceCompat.SOURCE_GAMEPAD), 1026, 1027, 1028, 1030);
    }

    private PlaceTypes() {
    }
}

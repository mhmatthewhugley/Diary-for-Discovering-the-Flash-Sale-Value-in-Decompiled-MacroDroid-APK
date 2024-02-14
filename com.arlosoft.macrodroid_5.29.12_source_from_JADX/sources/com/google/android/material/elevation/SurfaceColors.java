package com.google.android.material.elevation;

import androidx.annotation.DimenRes;
import com.google.android.material.C10462R;

public enum SurfaceColors {
    SURFACE_0(C10462R.dimen.m3_sys_elevation_level0),
    SURFACE_1(C10462R.dimen.m3_sys_elevation_level1),
    SURFACE_2(C10462R.dimen.m3_sys_elevation_level2),
    SURFACE_3(C10462R.dimen.m3_sys_elevation_level3),
    SURFACE_4(C10462R.dimen.m3_sys_elevation_level4),
    SURFACE_5(C10462R.dimen.m3_sys_elevation_level5);
    
    private final int elevationResId;

    private SurfaceColors(@DimenRes int i) {
        this.elevationResId = i;
    }
}

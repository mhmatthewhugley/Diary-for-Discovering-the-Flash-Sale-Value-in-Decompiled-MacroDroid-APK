package com.arlosoft.macrodroid.utils;

import android.content.Context;
import android.os.Vibrator;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import java.util.HashMap;

/* renamed from: com.arlosoft.macrodroid.utils.x1 */
/* compiled from: Vibrate */
public class C6457x1 {

    /* renamed from: a */
    private static final HashMap<Integer, long[]> f15084a;

    static {
        HashMap<Integer, long[]> hashMap = new HashMap<>();
        f15084a = hashMap;
        hashMap.put(0, new long[]{0, 100});
        hashMap.put(1, new long[]{0, 300});
        hashMap.put(2, new long[]{0, 1000});
        hashMap.put(3, new long[]{0, 100, 50, 100, 50, 100, 50, 100, 50, 100, 50, 100, 50, 100});
        hashMap.put(4, new long[]{0, 600, 400, 600, 400, 600});
        hashMap.put(5, new long[]{0, 150, 300, 300, 300, 450, 300, 600});
        hashMap.put(6, new long[]{0, 300, 500, 300, 500, 300, 500, 300, 500});
        hashMap.put(7, new long[]{0, 600, 300, 450, 300, 300, 300, 150});
        hashMap.put(8, new long[]{0, 50, 100, 50, 100, 50, 100, 400, 100, 300, 100, 350, 50, 200, 100, 100, 50, 600});
        hashMap.put(9, new long[]{0, 100, 200, 100, 100, 100, 100, 100, 200, 100, 500, 100, 225, 100});
        hashMap.put(10, new long[]{0, 500, 110, 500, 110, 450, 110, 200, 110, 170, 40, 450, 110, 200, 110, 170, 40, 500});
        hashMap.put(11, new long[]{0, 35});
        hashMap.put(12, new long[]{0, 10});
    }

    /* renamed from: a */
    public static String[] m24785a() {
        return new String[]{MacroDroidApplication.m14845u().getString(C17541R$string.vibrate_blip), MacroDroidApplication.m14845u().getString(C17541R$string.vibrate_short_buzz), MacroDroidApplication.m14845u().getString(C17541R$string.vibrate_long_buzz), MacroDroidApplication.m14845u().getString(C17541R$string.vibrate_rapid), MacroDroidApplication.m14845u().getString(C17541R$string.vibrate_slow), MacroDroidApplication.m14845u().getString(C17541R$string.vibrate_increasing), MacroDroidApplication.m14845u().getString(C17541R$string.vibrate_constant), MacroDroidApplication.m14845u().getString(C17541R$string.vibrate_decreasing), MacroDroidApplication.m14845u().getString(C17541R$string.vibrate_final_fantasy), MacroDroidApplication.m14845u().getString(C17541R$string.vibrate_game_over), MacroDroidApplication.m14845u().getString(C17541R$string.vibrate_star_wars), MacroDroidApplication.m14845u().getString(C17541R$string.vibrate_mini_blip), MacroDroidApplication.m14845u().getString(C17541R$string.vibrate_micro_blip)};
    }

    /* renamed from: b */
    public static void m24786b(Context context, int i) {
        HashMap<Integer, long[]> hashMap = f15084a;
        if (i >= hashMap.size()) {
            C4878b.m18868g("Illegal vibrate pattern selected. Reverting to Blip");
            i = 0;
        }
        ((Vibrator) context.getSystemService("vibrator")).vibrate(hashMap.get(Integer.valueOf(i)), -1);
    }
}

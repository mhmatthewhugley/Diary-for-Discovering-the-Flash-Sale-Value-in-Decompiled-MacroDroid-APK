package dev.skomlach.biometric.compat.utils.monet;

import android.content.Context;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import dev.skomlach.biometric.compat.utils.monet.colors.Srgb;
import dev.skomlach.common.contextprovider.C12104a;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import p297ja.C13337s;

@RequiresApi(31)
@Metadata(mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\b¨\u0006\u0016"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/monet/SystemColorScheme;", "", "()V", "accent1", "", "", "Ldev/skomlach/biometric/compat/utils/monet/colors/Srgb;", "getAccent1", "()Ljava/util/Map;", "accent2", "getAccent2", "accent3", "getAccent3", "appContext", "Landroid/content/Context;", "neutral1", "getNeutral1", "neutral2", "getNeutral2", "getSwatch", "ids", "Companion", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: SystemColorScheme.kt */
public final class SystemColorScheme {
    /* access modifiers changed from: private */
    public static final Map<Integer, Integer> ACCENT1_RES;
    /* access modifiers changed from: private */
    public static final Map<Integer, Integer> ACCENT2_RES;
    /* access modifiers changed from: private */
    public static final Map<Integer, Integer> ACCENT3_RES;
    public static final Companion Companion = new Companion((C13695i) null);
    /* access modifiers changed from: private */
    public static final Map<Integer, Integer> NEUTRAL1_RES;
    /* access modifiers changed from: private */
    public static final Map<Integer, Integer> NEUTRAL2_RES;
    private final Map<Integer, Srgb> accent1 = getSwatch(ACCENT1_RES);
    private final Map<Integer, Srgb> accent2 = getSwatch(ACCENT2_RES);
    private final Map<Integer, Srgb> accent3 = getSwatch(ACCENT3_RES);
    private final Context appContext = C12104a.f58372a.mo68283g();
    private final Map<Integer, Srgb> neutral1 = getSwatch(NEUTRAL1_RES);
    private final Map<Integer, Srgb> neutral2 = getSwatch(NEUTRAL2_RES);

    @Metadata(mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/monet/SystemColorScheme$Companion;", "", "()V", "ACCENT1_RES", "", "", "getACCENT1_RES", "()Ljava/util/Map;", "ACCENT2_RES", "getACCENT2_RES", "ACCENT3_RES", "getACCENT3_RES", "NEUTRAL1_RES", "getNEUTRAL1_RES", "NEUTRAL2_RES", "getNEUTRAL2_RES", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: SystemColorScheme.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        public final Map<Integer, Integer> getACCENT1_RES() {
            return SystemColorScheme.ACCENT1_RES;
        }

        public final Map<Integer, Integer> getACCENT2_RES() {
            return SystemColorScheme.ACCENT2_RES;
        }

        public final Map<Integer, Integer> getACCENT3_RES() {
            return SystemColorScheme.ACCENT3_RES;
        }

        public final Map<Integer, Integer> getNEUTRAL1_RES() {
            return SystemColorScheme.NEUTRAL1_RES;
        }

        public final Map<Integer, Integer> getNEUTRAL2_RES() {
            return SystemColorScheme.NEUTRAL2_RES;
        }
    }

    static {
        Integer valueOf = Integer.valueOf(TypedValues.Transition.TYPE_DURATION);
        ACCENT1_RES = C13615t0.m87762l(C13337s.m85692a(0, 17170487), C13337s.m85692a(10, 17170488), C13337s.m85692a(50, 17170489), C13337s.m85692a(100, 17170490), C13337s.m85692a(200, 17170491), C13337s.m85692a(300, 17170492), C13337s.m85692a(400, 17170493), C13337s.m85692a(500, 17170494), C13337s.m85692a(600, 17170495), C13337s.m85692a(valueOf, 17170496), C13337s.m85692a(800, 17170497), C13337s.m85692a(Integer.valueOf(TypedValues.Custom.TYPE_INT), 17170498), C13337s.m85692a(1000, 17170499));
        ACCENT2_RES = C13615t0.m87762l(C13337s.m85692a(0, 17170500), C13337s.m85692a(10, 17170501), C13337s.m85692a(50, 17170502), C13337s.m85692a(100, 17170503), C13337s.m85692a(200, 17170504), C13337s.m85692a(300, 17170505), C13337s.m85692a(400, 17170506), C13337s.m85692a(500, 17170507), C13337s.m85692a(600, 17170508), C13337s.m85692a(valueOf, 17170509), C13337s.m85692a(800, 17170510), C13337s.m85692a(Integer.valueOf(TypedValues.Custom.TYPE_INT), 17170511), C13337s.m85692a(1000, 17170512));
        ACCENT3_RES = C13615t0.m87762l(C13337s.m85692a(0, 17170513), C13337s.m85692a(10, 17170514), C13337s.m85692a(50, 17170515), C13337s.m85692a(100, 17170516), C13337s.m85692a(200, 17170517), C13337s.m85692a(300, 17170518), C13337s.m85692a(400, 17170519), C13337s.m85692a(500, 17170520), C13337s.m85692a(600, 17170521), C13337s.m85692a(valueOf, 17170522), C13337s.m85692a(800, 17170523), C13337s.m85692a(Integer.valueOf(TypedValues.Custom.TYPE_INT), 17170524), C13337s.m85692a(1000, 17170525));
        NEUTRAL1_RES = C13615t0.m87762l(C13337s.m85692a(0, 17170461), C13337s.m85692a(10, 17170462), C13337s.m85692a(50, 17170463), C13337s.m85692a(100, 17170464), C13337s.m85692a(200, 17170465), C13337s.m85692a(300, 17170466), C13337s.m85692a(400, 17170467), C13337s.m85692a(500, 17170468), C13337s.m85692a(600, 17170469), C13337s.m85692a(valueOf, 17170470), C13337s.m85692a(800, 17170471), C13337s.m85692a(Integer.valueOf(TypedValues.Custom.TYPE_INT), 17170472), C13337s.m85692a(1000, 17170473));
        NEUTRAL2_RES = C13615t0.m87762l(C13337s.m85692a(0, 17170474), C13337s.m85692a(10, 17170475), C13337s.m85692a(50, 17170476), C13337s.m85692a(100, 17170477), C13337s.m85692a(200, 17170478), C13337s.m85692a(300, 17170479), C13337s.m85692a(400, 17170480), C13337s.m85692a(500, 17170481), C13337s.m85692a(600, 17170482), C13337s.m85692a(valueOf, 17170483), C13337s.m85692a(800, 17170484), C13337s.m85692a(Integer.valueOf(TypedValues.Custom.TYPE_INT), 17170485), C13337s.m85692a(1000, 17170486));
    }

    private final Map<Integer, Srgb> getSwatch(Map<Integer, Integer> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(C13337s.m85692a(next.getKey(), new Srgb(this.appContext.getColor(((Number) next.getValue()).intValue()))));
        }
        return C13615t0.m87768r(arrayList);
    }

    public final Map<Integer, Srgb> getAccent1() {
        return this.accent1;
    }

    public final Map<Integer, Srgb> getAccent2() {
        return this.accent2;
    }

    public final Map<Integer, Srgb> getAccent3() {
        return this.accent3;
    }

    public final Map<Integer, Srgb> getNeutral1() {
        return this.neutral1;
    }

    public final Map<Integer, Srgb> getNeutral2() {
        return this.neutral2;
    }
}

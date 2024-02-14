package p332n7;

import android.location.Location;
import java.util.Arrays;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;

/* renamed from: n7.a */
/* compiled from: LocationExtensions.kt */
public final class C15756a {
    /* renamed from: a */
    public static final String m95058a(Location location) {
        String str;
        C13706o.m87929f(location, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append("Location [");
        sb.append(location.getProvider());
        C13696i0 i0Var = C13696i0.f61931a;
        String format = String.format(" %.6f,%.6f", Arrays.copyOf(new Object[]{Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())}, 2));
        C13706o.m87928e(format, "format(format, *args)");
        sb.append(format);
        if (location.hasAccuracy()) {
            str = String.format(" hAcc=%.0f", Arrays.copyOf(new Object[]{Float.valueOf(location.getAccuracy())}, 1));
            C13706o.m87928e(str, "format(format, *args)");
        } else {
            str = " hAcc=???";
        }
        sb.append(str);
        if (location.getTime() == 0) {
            sb.append(" t=?!?");
        }
        if (location.hasAltitude()) {
            sb.append(" alt=");
            sb.append((int) location.getAltitude());
        }
        if (location.hasSpeed()) {
            sb.append(" vel=");
            sb.append((int) location.getSpeed());
        }
        if (location.hasBearing()) {
            sb.append(" bear=");
            sb.append((int) location.getBearing());
        }
        if (location.isFromMockProvider()) {
            sb.append(" mock");
        }
        sb.append(']');
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "s.toString()");
        return sb2;
    }
}

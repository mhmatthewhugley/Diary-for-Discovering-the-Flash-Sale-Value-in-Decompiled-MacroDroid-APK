package p214b7;

import com.twofortyfouram.locale.sdk.host.TaskerPlugin;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.TimeZone;
import p207a7.C11059b;
import p221c7.C11158a;

/* renamed from: b7.a */
/* compiled from: SolarEventCalculator */
public class C11100a {

    /* renamed from: a */
    private final C11158a f54016a;

    /* renamed from: b */
    private final TimeZone f54017b;

    public C11100a(C11158a aVar, TimeZone timeZone) {
        this.f54016a = aVar;
        this.f54017b = timeZone;
    }

    /* renamed from: a */
    private BigDecimal m74717a(BigDecimal bigDecimal, Calendar calendar) {
        if (this.f54017b.inDaylightTime(calendar.getTime())) {
            bigDecimal = bigDecimal.add(BigDecimal.ONE);
        }
        return bigDecimal.doubleValue() > 24.0d ? bigDecimal.subtract(BigDecimal.valueOf(24)) : bigDecimal;
    }

    /* renamed from: b */
    private BigDecimal m74718b(C11059b bVar, Calendar calendar, boolean z) {
        calendar.setTimeZone(this.f54017b);
        BigDecimal p = m74729p(calendar, Boolean.valueOf(z));
        BigDecimal u = m74734u(m74730q(p));
        BigDecimal k = m74725k(u, bVar);
        if (k.doubleValue() < -1.0d || k.doubleValue() > 1.0d) {
            return null;
        }
        return m74728n(m74727m(u, p, m74733t(k, Boolean.valueOf(z))), calendar);
    }

    /* renamed from: e */
    private BigDecimal m74719e(BigDecimal bigDecimal) {
        return m74736w(bigDecimal, BigDecimal.valueOf(0.017453292519943295d));
    }

    /* renamed from: f */
    private BigDecimal m74720f(BigDecimal bigDecimal) {
        return m74736w(bigDecimal, new BigDecimal(57.29577951308232d));
    }

    /* renamed from: g */
    private BigDecimal m74721g(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return bigDecimal.divide(bigDecimal2, 4, RoundingMode.HALF_EVEN);
    }

    /* renamed from: h */
    private BigDecimal m74722h(BigDecimal bigDecimal) {
        return m74737x(BigDecimal.valueOf(Math.acos(bigDecimal.doubleValue())));
    }

    /* renamed from: i */
    private BigDecimal m74723i() {
        return m74721g(this.f54016a.mo62347b(), BigDecimal.valueOf(15));
    }

    /* renamed from: j */
    private BigDecimal m74724j(BigDecimal bigDecimal) {
        return m74737x(BigDecimal.valueOf(Math.cos(BigDecimal.valueOf(Math.asin(bigDecimal.doubleValue())).doubleValue())));
    }

    /* renamed from: k */
    private BigDecimal m74725k(BigDecimal bigDecimal, C11059b bVar) {
        BigDecimal s = m74732s(bigDecimal);
        BigDecimal j = m74724j(s);
        return m74737x(m74721g(BigDecimal.valueOf(Math.cos(m74719e(bVar.mo62045a()).doubleValue())).subtract(s.multiply(BigDecimal.valueOf(Math.sin(m74719e(this.f54016a.mo62346a()).doubleValue())))), j.multiply(BigDecimal.valueOf(Math.cos(m74719e(this.f54016a.mo62346a()).doubleValue())))));
    }

    /* renamed from: l */
    private BigDecimal m74726l(Calendar calendar) {
        return new BigDecimal(calendar.get(6));
    }

    /* renamed from: m */
    private BigDecimal m74727m(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        BigDecimal r = m74731r(bigDecimal);
        BigDecimal subtract = bigDecimal3.add(r).subtract(bigDecimal2.multiply(new BigDecimal("0.06571"))).subtract(new BigDecimal("6.622"));
        if (subtract.doubleValue() < 0.0d) {
            subtract = subtract.add(BigDecimal.valueOf(24));
        } else if (subtract.doubleValue() > 24.0d) {
            subtract = subtract.subtract(BigDecimal.valueOf(24));
        }
        return m74737x(subtract);
    }

    /* renamed from: n */
    private BigDecimal m74728n(BigDecimal bigDecimal, Calendar calendar) {
        return m74717a(bigDecimal.subtract(m74723i()).add(m74735v(calendar)), calendar);
    }

    /* renamed from: p */
    private BigDecimal m74729p(Calendar calendar, Boolean bool) {
        return m74737x(m74726l(calendar).add(m74721g(BigDecimal.valueOf((long) (bool.booleanValue() ? 6 : 18)).subtract(m74723i()), BigDecimal.valueOf(24))));
    }

    /* renamed from: q */
    private BigDecimal m74730q(BigDecimal bigDecimal) {
        return m74737x(m74736w(new BigDecimal("0.9856"), bigDecimal).subtract(new BigDecimal("3.289")));
    }

    /* renamed from: r */
    private BigDecimal m74731r(BigDecimal bigDecimal) {
        BigDecimal x = m74737x(m74720f(new BigDecimal(Math.atan(m74719e(m74736w(m74720f(new BigDecimal(Math.tan(m74719e(bigDecimal).doubleValue()))), new BigDecimal("0.91764"))).doubleValue()))));
        if (x.doubleValue() < 0.0d) {
            x = x.add(BigDecimal.valueOf(360));
        } else if (x.doubleValue() > 360.0d) {
            x = x.subtract(BigDecimal.valueOf(360));
        }
        BigDecimal valueOf = BigDecimal.valueOf(90);
        return m74721g(x.add(bigDecimal.divide(valueOf, 0, RoundingMode.FLOOR).multiply(valueOf).subtract(x.divide(valueOf, 0, RoundingMode.FLOOR).multiply(valueOf))), BigDecimal.valueOf(15));
    }

    /* renamed from: s */
    private BigDecimal m74732s(BigDecimal bigDecimal) {
        return m74737x(BigDecimal.valueOf(Math.sin(m74719e(bigDecimal).doubleValue())).multiply(new BigDecimal("0.39782")));
    }

    /* renamed from: t */
    private BigDecimal m74733t(BigDecimal bigDecimal, Boolean bool) {
        BigDecimal f = m74720f(m74722h(bigDecimal));
        if (bool.booleanValue()) {
            f = BigDecimal.valueOf(360).subtract(f);
        }
        return m74721g(f, BigDecimal.valueOf(15));
    }

    /* renamed from: u */
    private BigDecimal m74734u(BigDecimal bigDecimal) {
        BigDecimal add = bigDecimal.add(m74736w(new BigDecimal(Math.sin(m74719e(bigDecimal).doubleValue())), new BigDecimal("1.916"))).add(m74736w(new BigDecimal(Math.sin(m74736w(m74719e(bigDecimal), BigDecimal.valueOf(2)).doubleValue())), new BigDecimal("0.020")).add(new BigDecimal("282.634")));
        if (add.doubleValue() > 360.0d) {
            add = add.subtract(BigDecimal.valueOf(360));
        }
        return m74737x(add);
    }

    /* renamed from: v */
    private BigDecimal m74735v(Calendar calendar) {
        return new BigDecimal(calendar.get(15)).divide(new BigDecimal(TaskerPlugin.Setting.REQUESTED_TIMEOUT_MS_NEVER), new MathContext(2));
    }

    /* renamed from: w */
    private BigDecimal m74736w(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return m74737x(bigDecimal.multiply(bigDecimal2));
    }

    /* renamed from: x */
    private BigDecimal m74737x(BigDecimal bigDecimal) {
        return bigDecimal.setScale(4, RoundingMode.HALF_EVEN);
    }

    /* renamed from: c */
    public Calendar mo62220c(C11059b bVar, Calendar calendar) {
        return mo62222o(m74718b(bVar, calendar, true), calendar);
    }

    /* renamed from: d */
    public Calendar mo62221d(C11059b bVar, Calendar calendar) {
        return mo62222o(m74718b(bVar, calendar, false), calendar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public Calendar mo62222o(BigDecimal bigDecimal, Calendar calendar) {
        if (bigDecimal == null) {
            return null;
        }
        Calendar calendar2 = (Calendar) calendar.clone();
        if (bigDecimal.compareTo(BigDecimal.ZERO) == -1) {
            bigDecimal = bigDecimal.add(BigDecimal.valueOf(24.0d));
            calendar2.add(11, -24);
        }
        String[] split = bigDecimal.toPlainString().split("\\.");
        int parseInt = Integer.parseInt(split[0]);
        BigDecimal scale = new BigDecimal("0." + split[1]).multiply(BigDecimal.valueOf(60)).setScale(0, RoundingMode.HALF_EVEN);
        if (scale.intValue() == 60) {
            scale = BigDecimal.ZERO;
            parseInt++;
        }
        if (parseInt == 24) {
            parseInt = 0;
        }
        calendar2.set(11, parseInt);
        calendar2.set(12, scale.intValue());
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        calendar2.setTimeZone(calendar.getTimeZone());
        return calendar2;
    }
}

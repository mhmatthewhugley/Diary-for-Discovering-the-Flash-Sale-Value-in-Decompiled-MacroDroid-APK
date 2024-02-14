package p392se;

import androidx.core.location.LocationRequestCompat;
import p352oe.C15857c;

/* renamed from: se.b */
/* compiled from: ChronoUnit */
public enum C16541b implements C16566k {
    NANOS("Nanos", C15857c.m95499f(1)),
    MICROS("Micros", C15857c.m95499f(1000)),
    MILLIS("Millis", C15857c.m95499f(1000000)),
    SECONDS("Seconds", C15857c.m95500g(1)),
    MINUTES("Minutes", C15857c.m95500g(60)),
    HOURS("Hours", C15857c.m95500g(3600)),
    HALF_DAYS("HalfDays", C15857c.m95500g(43200)),
    DAYS("Days", C15857c.m95500g(86400)),
    WEEKS("Weeks", C15857c.m95500g(604800)),
    MONTHS("Months", C15857c.m95500g(2629746)),
    YEARS("Years", C15857c.m95500g(31556952)),
    DECADES("Decades", C15857c.m95500g(315569520)),
    CENTURIES("Centuries", C15857c.m95500g(3155695200L)),
    MILLENNIA("Millennia", C15857c.m95500g(31556952000L)),
    ERAS("Eras", C15857c.m95500g(31556952000000000L)),
    FOREVER("Forever", C15857c.m95501i(LocationRequestCompat.PASSIVE_INTERVAL, 999999999));
    
    private final C15857c duration;
    private final String name;

    private C16541b(String str, C15857c cVar) {
        this.name = str;
        this.duration = cVar;
    }

    /* renamed from: b */
    public boolean mo79349b() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    /* renamed from: d */
    public <R extends C16550d> R mo79350d(R r, long j) {
        return r.mo75670e(j, this);
    }

    public String toString() {
        return this.name;
    }
}

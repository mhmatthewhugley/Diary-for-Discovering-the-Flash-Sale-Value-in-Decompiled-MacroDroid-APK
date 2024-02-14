package p392se;

import androidx.core.location.LocationRequestCompat;

/* renamed from: se.a */
/* compiled from: ChronoField */
public enum C16540a implements C16556h {
    NANO_OF_SECOND("NanoOfSecond", r4, r9, C16567l.m98757i(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", r4, r15, C16567l.m98757i(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", r4, r9, C16567l.m98757i(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", r4, r15, C16567l.m98757i(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", r4, r9, C16567l.m98757i(0, 999)),
    MILLI_OF_DAY("MilliOfDay", r4, r15, C16567l.m98757i(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", r4, r20, C16567l.m98757i(0, 59)),
    SECOND_OF_DAY("SecondOfDay", r4, r15, C16567l.m98757i(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", r4, r24, C16567l.m98757i(0, 59)),
    MINUTE_OF_DAY("MinuteOfDay", r4, r15, C16567l.m98757i(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", r24, r20, C16567l.m98757i(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", r4, r20, C16567l.m98757i(1, 12)),
    HOUR_OF_DAY("HourOfDay", r4, r15, C16567l.m98757i(0, 23)),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", r4, r15, C16567l.m98757i(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", r20, r15, C16567l.m98757i(0, 1)),
    DAY_OF_WEEK("DayOfWeek", r4, r30, C16567l.m98757i(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", r4, r5, C16567l.m98757i(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", r4, r5, C16567l.m98757i(1, 7)),
    DAY_OF_MONTH("DayOfMonth", r15, r34, C16567l.m98758j(1, 28, 31)),
    DAY_OF_YEAR("DayOfYear", r4, r36, C16567l.m98758j(1, 365, 366)),
    EPOCH_DAY("EpochDay", r4, r38, C16567l.m98757i(-365243219162L, 365241780471L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", r4, r34, C16567l.m98758j(1, 4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", r4, r5, C16567l.m98757i(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", r4, r5, C16567l.m98757i(1, 12)),
    PROLEPTIC_MONTH("ProlepticMonth", r4, r38, C16567l.m98757i(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", r4, r5, C16567l.m98758j(1, 999999999, 1000000000)),
    YEAR("Year", r4, r5, C16567l.m98757i(-999999999, 999999999)),
    ERA("Era", C16541b.ERAS, r5, C16567l.m98757i(0, 1)),
    INSTANT_SECONDS("InstantSeconds", r4, r5, C16567l.m98757i(Long.MIN_VALUE, LocationRequestCompat.PASSIVE_INTERVAL)),
    OFFSET_SECONDS("OffsetSeconds", r4, r5, C16567l.m98757i(-64800, 64800));
    
    private final C16566k baseUnit;
    private final String name;
    private final C16567l range;
    private final C16566k rangeUnit;

    private C16540a(String str, C16566k kVar, C16566k kVar2, C16567l lVar) {
        this.name = str;
        this.baseUnit = kVar;
        this.rangeUnit = kVar2;
        this.range = lVar;
    }

    /* renamed from: b */
    public boolean mo79339b() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    /* renamed from: d */
    public long mo79340d(C16551e eVar) {
        return eVar.mo75644l(this);
    }

    /* renamed from: e */
    public boolean mo79341e(C16551e eVar) {
        return eVar.mo75642g(this);
    }

    /* renamed from: f */
    public C16567l mo79342f(C16551e eVar) {
        return eVar.mo75641f(this);
    }

    /* renamed from: g */
    public C16567l mo79343g() {
        return this.range;
    }

    /* renamed from: i */
    public <R extends C16550d> R mo79344i(R r, long j) {
        return r.mo75669d(this, j);
    }

    /* renamed from: j */
    public boolean mo79345j() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    /* renamed from: k */
    public int mo79346k(long j) {
        return mo79343g().mo79364a(j, this);
    }

    /* renamed from: l */
    public long mo79347l(long j) {
        return mo79343g().mo79365b(j, this);
    }

    public String toString() {
        return this.name;
    }
}

package p207a7;

import java.util.Calendar;
import java.util.TimeZone;
import p214b7.C11100a;
import p221c7.C11158a;

/* renamed from: a7.a */
/* compiled from: SunriseSunsetCalculator */
public class C11058a {

    /* renamed from: a */
    private C11158a f53897a;

    /* renamed from: b */
    private C11100a f53898b;

    public C11058a(C11158a aVar, TimeZone timeZone) {
        this.f53897a = aVar;
        this.f53898b = new C11100a(aVar, timeZone);
    }

    /* renamed from: a */
    public Calendar mo62043a(Calendar calendar) {
        return this.f53898b.mo62220c(C11059b.f53902e, calendar);
    }

    /* renamed from: b */
    public Calendar mo62044b(Calendar calendar) {
        return this.f53898b.mo62221d(C11059b.f53902e, calendar);
    }
}

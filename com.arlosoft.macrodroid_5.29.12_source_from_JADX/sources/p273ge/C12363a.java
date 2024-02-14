package p273ge;

import org.mockito.exceptions.misusing.NotAMockException;
import p301je.C13378d;
import p311ke.C13559b;
import p321le.C15631c;
import p436xd.C16935g;

/* renamed from: ge.a */
/* compiled from: MockUtil */
public class C12363a {

    /* renamed from: a */
    private static final C15631c f59050a = C16935g.m100059a();

    /* renamed from: a */
    public static <T> C13378d<T> m83120a(T t) {
        if (t == null) {
            throw new NotAMockException("Argument should be a mock, but is null!");
        } else if (m83122c(t)) {
            return f59050a.getHandler(t);
        } else {
            throw new NotAMockException("Argument should be a mock, but is: " + t.getClass());
        }
    }

    /* renamed from: b */
    public static C13559b m83121b(Object obj) {
        return m83120a(obj).mo70791j0().mo71665c();
    }

    /* renamed from: c */
    public static boolean m83122c(Object obj) {
        return (obj == null || f59050a.getHandler(obj) == null) ? false : true;
    }
}

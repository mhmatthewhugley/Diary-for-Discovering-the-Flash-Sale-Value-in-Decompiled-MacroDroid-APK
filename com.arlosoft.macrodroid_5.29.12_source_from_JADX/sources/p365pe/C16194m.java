package p365pe;

import androidx.exifinterface.media.ExifInterface;
import java.io.Serializable;
import p352oe.C15858d;
import p352oe.C15861e;
import p352oe.C15864f;
import p352oe.C15890p;
import p352oe.C15895s;
import p392se.C16551e;

/* renamed from: pe.m */
/* compiled from: IsoChronology */
public final class C16194m extends C16187h implements Serializable {

    /* renamed from: g */
    public static final C16194m f66460g = new C16194m();
    private static final long serialVersionUID = -1440403870442975015L;

    private C16194m() {
    }

    private Object readResolve() {
        return f66460g;
    }

    /* renamed from: A */
    public C15864f mo78648m(C16551e eVar) {
        return C15864f.m95599X(eVar);
    }

    /* renamed from: C */
    public C15895s mo78651v(C15858d dVar, C15890p pVar) {
        return C15895s.m95863X(dVar, pVar);
    }

    public String getId() {
        return ExifInterface.TAG_RW2_ISO;
    }

    /* renamed from: k */
    public String mo78647k() {
        return "iso8601";
    }

    /* renamed from: w */
    public C15861e mo78639d(C16551e eVar) {
        return C15861e.m95539T(eVar);
    }

    /* renamed from: x */
    public C16195n mo78646i(int i) {
        return C16195n.m97296i(i);
    }

    /* renamed from: y */
    public boolean mo78676y(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }
}

package p333n8;

import com.udojava.evalex.C11895e;
import java.util.Locale;

/* renamed from: n8.a */
/* compiled from: AbstractLazyFunction */
public abstract class C15757a implements C11895e {

    /* renamed from: a */
    protected String f65095a;

    /* renamed from: b */
    protected int f65096b;

    /* renamed from: c */
    protected boolean f65097c;

    protected C15757a(String str, int i, boolean z) {
        this.f65095a = str.toUpperCase(Locale.ROOT);
        this.f65096b = i;
        this.f65097c = z;
    }

    /* renamed from: b */
    public int mo67135b() {
        return this.f65096b;
    }

    /* renamed from: d */
    public boolean mo67136d() {
        return this.f65096b < 0;
    }

    public String getName() {
        return this.f65095a;
    }

    protected C15757a(String str, int i) {
        this(str, i, false);
    }
}

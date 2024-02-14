package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.C6799c;
import com.fasterxml.jackson.core.C6807i;
import com.fasterxml.jackson.core.C6821j;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.p072io.C6818k;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import org.apache.commons.p353io.IOUtils;

/* renamed from: com.fasterxml.jackson.core.util.c */
/* compiled from: DefaultPrettyPrinter */
public class C6826c implements C6807i, Serializable {

    /* renamed from: c */
    public static final C6818k f15885c = new C6818k(" ");
    private static final long serialVersionUID = -5512586643324525213L;
    protected C6828b _arrayIndenter;
    protected C6828b _objectIndenter;
    protected final C6821j _rootSeparator;
    protected boolean _spacesInObjectEntries;

    /* renamed from: a */
    protected transient int f15886a;

    /* renamed from: com.fasterxml.jackson.core.util.c$a */
    /* compiled from: DefaultPrettyPrinter */
    public static class C6827a implements C6828b, Serializable {

        /* renamed from: a */
        public static C6827a f15887a = new C6827a();
        private static final long serialVersionUID = 1;

        /* renamed from: a */
        public void mo33955a(C6799c cVar, int i) throws IOException, JsonGenerationException {
            cVar.mo33848v(' ');
        }

        public boolean isInline() {
            return true;
        }
    }

    /* renamed from: com.fasterxml.jackson.core.util.c$b */
    /* compiled from: DefaultPrettyPrinter */
    public interface C6828b {
        /* renamed from: a */
        void mo33955a(C6799c cVar, int i) throws IOException, JsonGenerationException;

        boolean isInline();
    }

    /* renamed from: com.fasterxml.jackson.core.util.c$c */
    /* compiled from: DefaultPrettyPrinter */
    public static class C6829c implements C6828b, Serializable {

        /* renamed from: a */
        public static C6829c f15888a = new C6829c();

        /* renamed from: c */
        static final String f15889c;

        /* renamed from: d */
        static final char[] f15890d;
        private static final long serialVersionUID = 1;

        static {
            String str;
            try {
                str = System.getProperty("line.separator");
            } catch (Throwable unused) {
                str = null;
            }
            if (str == null) {
                str = IOUtils.LINE_SEPARATOR_UNIX;
            }
            f15889c = str;
            char[] cArr = new char[64];
            f15890d = cArr;
            Arrays.fill(cArr, ' ');
        }

        /* renamed from: a */
        public void mo33955a(C6799c cVar, int i) throws IOException, JsonGenerationException {
            cVar.mo33850x(f15889c);
            if (i > 0) {
                int i2 = i + i;
                while (i2 > 64) {
                    char[] cArr = f15890d;
                    cVar.mo33851y(cArr, 0, 64);
                    i2 -= cArr.length;
                }
                cVar.mo33851y(f15890d, 0, i2);
            }
        }

        public boolean isInline() {
            return false;
        }
    }

    public C6826c() {
        this(f15885c);
    }

    /* renamed from: a */
    public void mo33885a(C6799c cVar) throws IOException, JsonGenerationException {
        cVar.mo33848v('{');
        if (!this._objectIndenter.isInline()) {
            this.f15886a++;
        }
    }

    /* renamed from: b */
    public void mo33886b(C6799c cVar) throws IOException, JsonGenerationException {
        C6821j jVar = this._rootSeparator;
        if (jVar != null) {
            cVar.mo33849w(jVar);
        }
    }

    /* renamed from: c */
    public void mo33887c(C6799c cVar) throws IOException, JsonGenerationException {
        cVar.mo33848v(',');
        this._arrayIndenter.mo33955a(cVar, this.f15886a);
    }

    /* renamed from: d */
    public void mo33888d(C6799c cVar) throws IOException, JsonGenerationException {
        this._objectIndenter.mo33955a(cVar, this.f15886a);
    }

    /* renamed from: e */
    public void mo33889e(C6799c cVar) throws IOException, JsonGenerationException {
        this._arrayIndenter.mo33955a(cVar, this.f15886a);
    }

    /* renamed from: f */
    public void mo33890f(C6799c cVar) throws IOException, JsonGenerationException {
        cVar.mo33848v(',');
        this._objectIndenter.mo33955a(cVar, this.f15886a);
    }

    /* renamed from: g */
    public void mo33891g(C6799c cVar, int i) throws IOException, JsonGenerationException {
        if (!this._arrayIndenter.isInline()) {
            this.f15886a--;
        }
        if (i > 0) {
            this._arrayIndenter.mo33955a(cVar, this.f15886a);
        } else {
            cVar.mo33848v(' ');
        }
        cVar.mo33848v(']');
    }

    /* renamed from: h */
    public void mo33892h(C6799c cVar) throws IOException, JsonGenerationException {
        if (this._spacesInObjectEntries) {
            cVar.mo33850x(" : ");
        } else {
            cVar.mo33848v(':');
        }
    }

    /* renamed from: i */
    public void mo33893i(C6799c cVar, int i) throws IOException, JsonGenerationException {
        if (!this._objectIndenter.isInline()) {
            this.f15886a--;
        }
        if (i > 0) {
            this._objectIndenter.mo33955a(cVar, this.f15886a);
        } else {
            cVar.mo33848v(' ');
        }
        cVar.mo33848v('}');
    }

    /* renamed from: j */
    public void mo33894j(C6799c cVar) throws IOException, JsonGenerationException {
        if (!this._arrayIndenter.isInline()) {
            this.f15886a++;
        }
        cVar.mo33848v('[');
    }

    public C6826c(C6821j jVar) {
        this._arrayIndenter = C6827a.f15887a;
        this._objectIndenter = C6829c.f15888a;
        this._spacesInObjectEntries = true;
        this.f15886a = 0;
        this._rootSeparator = jVar;
    }
}

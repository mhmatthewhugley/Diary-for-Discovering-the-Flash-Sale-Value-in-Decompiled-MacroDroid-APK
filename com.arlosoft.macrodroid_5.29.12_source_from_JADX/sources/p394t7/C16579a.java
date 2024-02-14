package p394t7;

import java.io.File;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: t7.a */
/* compiled from: Mount */
public class C16579a {

    /* renamed from: a */
    final File f67384a;

    /* renamed from: b */
    final File f67385b;

    /* renamed from: c */
    final String f67386c;

    /* renamed from: d */
    final Set<String> f67387d;

    public C16579a(File file, File file2, String str, String str2) {
        this.f67384a = file;
        this.f67385b = file2;
        this.f67386c = str;
        this.f67387d = new LinkedHashSet(Arrays.asList(str2.split(",")));
    }

    /* renamed from: a */
    public File mo79402a() {
        return this.f67384a;
    }

    /* renamed from: b */
    public Set<String> mo79403b() {
        return this.f67387d;
    }

    /* renamed from: c */
    public File mo79404c() {
        return this.f67385b;
    }

    public String toString() {
        return String.format("%s on %s type %s %s", new Object[]{this.f67384a, this.f67385b, this.f67386c, this.f67387d});
    }
}

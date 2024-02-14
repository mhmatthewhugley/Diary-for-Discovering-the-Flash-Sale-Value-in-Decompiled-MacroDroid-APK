package p193y0;

import java.io.File;
import kotlin.jvm.internal.C13706o;

/* renamed from: y0.a */
/* compiled from: BackupFile.kt */
public final class C10392a {

    /* renamed from: a */
    private final File f23630a;

    public C10392a(File file) {
        C13706o.m87929f(file, "file");
        this.f23630a = file;
    }

    /* renamed from: a */
    public final File mo41077a() {
        return this.f23630a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10392a) && C13706o.m87924a(this.f23630a, ((C10392a) obj).f23630a);
    }

    public int hashCode() {
        return this.f23630a.hashCode();
    }

    public String toString() {
        return "BackupFile(file=" + this.f23630a + ')';
    }
}

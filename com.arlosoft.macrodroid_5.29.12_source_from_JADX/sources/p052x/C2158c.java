package p052x;

/* renamed from: x.c */
/* compiled from: FileExtension */
public enum C2158c {
    JSON(".json"),
    ZIP(".zip");
    
    public final String extension;

    private C2158c(String str) {
        this.extension = str;
    }

    /* renamed from: b */
    public String mo24382b() {
        return ".temp" + this.extension;
    }

    public String toString() {
        return this.extension;
    }
}

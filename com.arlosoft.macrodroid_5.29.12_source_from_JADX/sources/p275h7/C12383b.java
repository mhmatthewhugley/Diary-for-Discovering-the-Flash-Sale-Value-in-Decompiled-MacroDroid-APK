package p275h7;

import java.io.Serializable;

/* renamed from: h7.b */
/* compiled from: Dimensions */
public final class C12383b implements Serializable {
    private static final long serialVersionUID = 1;
    private int height;
    private int width;

    public C12383b() {
    }

    /* renamed from: a */
    public boolean mo68721a() {
        return this.width > 0 && this.height > 0;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public C12383b(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}

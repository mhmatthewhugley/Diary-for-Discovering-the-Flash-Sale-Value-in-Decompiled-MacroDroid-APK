package dev.skomlach.biometric.compat.utils.activityView;

import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;

@Metadata(mo71667d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006!"}, mo71668d2 = {"Ldev/skomlach/biometric/compat/utils/activityView/FastBlurConfig;", "", "width", "", "height", "radius", "sampling", "color", "(IIIII)V", "getColor", "()I", "setColor", "(I)V", "getHeight", "setHeight", "getRadius", "setRadius", "getSampling", "setSampling", "getWidth", "setWidth", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "biometric_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
/* compiled from: FastBlurConfig.kt */
public final class FastBlurConfig {
    private int color;
    private int height;
    private int radius;
    private int sampling;
    private int width;

    public FastBlurConfig(int i, int i2, int i3, int i4, int i5) {
        this.width = i;
        this.height = i2;
        this.radius = i3;
        this.sampling = i4;
        this.color = i5;
    }

    public static /* synthetic */ FastBlurConfig copy$default(FastBlurConfig fastBlurConfig, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = fastBlurConfig.width;
        }
        if ((i6 & 2) != 0) {
            i2 = fastBlurConfig.height;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = fastBlurConfig.radius;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = fastBlurConfig.sampling;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = fastBlurConfig.color;
        }
        return fastBlurConfig.copy(i, i7, i8, i9, i5);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final int component3() {
        return this.radius;
    }

    public final int component4() {
        return this.sampling;
    }

    public final int component5() {
        return this.color;
    }

    public final FastBlurConfig copy(int i, int i2, int i3, int i4, int i5) {
        return new FastBlurConfig(i, i2, i3, i4, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FastBlurConfig)) {
            return false;
        }
        FastBlurConfig fastBlurConfig = (FastBlurConfig) obj;
        return this.width == fastBlurConfig.width && this.height == fastBlurConfig.height && this.radius == fastBlurConfig.radius && this.sampling == fastBlurConfig.sampling && this.color == fastBlurConfig.color;
    }

    public final int getColor() {
        return this.color;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getRadius() {
        return this.radius;
    }

    public final int getSampling() {
        return this.sampling;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((((((this.width * 31) + this.height) * 31) + this.radius) * 31) + this.sampling) * 31) + this.color;
    }

    public final void setColor(int i) {
        this.color = i;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setRadius(int i) {
        this.radius = i;
    }

    public final void setSampling(int i) {
        this.sampling = i;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public String toString() {
        int i = this.width;
        int i2 = this.height;
        int i3 = this.radius;
        int i4 = this.sampling;
        int i5 = this.color;
        return "FastBlurConfig(width=" + i + ", height=" + i2 + ", radius=" + i3 + ", sampling=" + i4 + ", color=" + i5 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FastBlurConfig(int i, int i2, int i3, int i4, int i5, int i6, C13695i iVar) {
        this(i, i2, (i6 & 4) != 0 ? 25 : i3, (i6 & 8) != 0 ? 1 : i4, (i6 & 16) != 0 ? 0 : i5);
    }
}

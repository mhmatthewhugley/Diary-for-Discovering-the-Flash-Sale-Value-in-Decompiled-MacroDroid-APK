package com.android.p023dx.p024cf.attrib;

import com.android.p023dx.rop.cst.ConstantPool;
import com.android.p023dx.util.ByteArray;
import java.util.Objects;

/* renamed from: com.android.dx.cf.attrib.RawAttribute */
public final class RawAttribute extends BaseAttribute {
    private final ByteArray data;
    private final ConstantPool pool;

    public RawAttribute(String str, ByteArray byteArray, ConstantPool constantPool) {
        super(str);
        Objects.requireNonNull(byteArray, "data == null");
        this.data = byteArray;
        this.pool = constantPool;
    }

    public int byteLength() {
        return this.data.size() + 6;
    }

    public ByteArray getData() {
        return this.data;
    }

    public ConstantPool getPool() {
        return this.pool;
    }

    public RawAttribute(String str, ByteArray byteArray, int i, int i2, ConstantPool constantPool) {
        this(str, byteArray.slice(i, i2 + i), constantPool);
    }
}

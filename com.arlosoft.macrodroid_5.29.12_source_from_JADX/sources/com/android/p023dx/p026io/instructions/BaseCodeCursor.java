package com.android.p023dx.p026io.instructions;

/* renamed from: com.android.dx.io.instructions.BaseCodeCursor */
public abstract class BaseCodeCursor implements CodeCursor {
    private final AddressMap baseAddressMap = new AddressMap();
    private int cursor = 0;

    /* access modifiers changed from: protected */
    public final void advance(int i) {
        this.cursor += i;
    }

    public final int baseAddressForCursor() {
        int i = this.baseAddressMap.get(this.cursor);
        return i >= 0 ? i : this.cursor;
    }

    public final int cursor() {
        return this.cursor;
    }

    public final void setBaseAddress(int i, int i2) {
        this.baseAddressMap.put(i, i2);
    }
}

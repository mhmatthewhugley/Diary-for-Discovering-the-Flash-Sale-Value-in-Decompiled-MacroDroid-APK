package com.android.p023dx.p024cf.code;

import com.android.p023dx.rop.code.LocalItem;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.util.FixedSizeList;
import java.util.Objects;

/* renamed from: com.android.dx.cf.code.LocalVariableList */
public final class LocalVariableList extends FixedSizeList {
    public static final LocalVariableList EMPTY = new LocalVariableList(0);

    /* renamed from: com.android.dx.cf.code.LocalVariableList$Item */
    public static class Item {
        private final CstString descriptor;
        private final int index;
        private final int length;
        private final CstString name;
        private final CstString signature;
        private final int startPc;

        public Item(int i, int i2, CstString cstString, CstString cstString2, CstString cstString3, int i3) {
            if (i < 0) {
                throw new IllegalArgumentException("startPc < 0");
            } else if (i2 >= 0) {
                Objects.requireNonNull(cstString, "name == null");
                if (cstString2 == null) {
                    Objects.requireNonNull(cstString3, "(descriptor == null) && (signature == null)");
                }
                if (i3 >= 0) {
                    this.startPc = i;
                    this.length = i2;
                    this.name = cstString;
                    this.descriptor = cstString2;
                    this.signature = cstString3;
                    this.index = i3;
                    return;
                }
                throw new IllegalArgumentException("index < 0");
            } else {
                throw new IllegalArgumentException("length < 0");
            }
        }

        /* access modifiers changed from: private */
        public CstString getSignature() {
            return this.signature;
        }

        public CstString getDescriptor() {
            return this.descriptor;
        }

        public int getIndex() {
            return this.index;
        }

        public int getLength() {
            return this.length;
        }

        public LocalItem getLocalItem() {
            return LocalItem.make(this.name, this.signature);
        }

        public int getStartPc() {
            return this.startPc;
        }

        public Type getType() {
            return Type.intern(this.descriptor.getString());
        }

        public boolean matchesAllButType(Item item) {
            return this.startPc == item.startPc && this.length == item.length && this.index == item.index && this.name.equals(item.name);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r3 = r1.startPc;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean matchesPcAndIndex(int r2, int r3) {
            /*
                r1 = this;
                int r0 = r1.index
                if (r3 != r0) goto L_0x000f
                int r3 = r1.startPc
                if (r2 < r3) goto L_0x000f
                int r0 = r1.length
                int r3 = r3 + r0
                if (r2 >= r3) goto L_0x000f
                r2 = 1
                goto L_0x0010
            L_0x000f:
                r2 = 0
            L_0x0010:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.p024cf.code.LocalVariableList.Item.matchesPcAndIndex(int, int):boolean");
        }

        public Item withSignature(CstString cstString) {
            return new Item(this.startPc, this.length, this.name, this.descriptor, cstString, this.index);
        }
    }

    public LocalVariableList(int i) {
        super(i);
    }

    public static LocalVariableList concat(LocalVariableList localVariableList, LocalVariableList localVariableList2) {
        if (localVariableList == EMPTY) {
            return localVariableList2;
        }
        int size = localVariableList.size();
        int size2 = localVariableList2.size();
        LocalVariableList localVariableList3 = new LocalVariableList(size + size2);
        for (int i = 0; i < size; i++) {
            localVariableList3.set(i, localVariableList.get(i));
        }
        for (int i2 = 0; i2 < size2; i2++) {
            localVariableList3.set(size + i2, localVariableList2.get(i2));
        }
        localVariableList3.setImmutable();
        return localVariableList3;
    }

    public static LocalVariableList mergeDescriptorsAndSignatures(LocalVariableList localVariableList, LocalVariableList localVariableList2) {
        int size = localVariableList.size();
        LocalVariableList localVariableList3 = new LocalVariableList(size);
        for (int i = 0; i < size; i++) {
            Item item = localVariableList.get(i);
            Item itemToLocal = localVariableList2.itemToLocal(item);
            if (itemToLocal != null) {
                item = item.withSignature(itemToLocal.getSignature());
            }
            localVariableList3.set(i, item);
        }
        localVariableList3.setImmutable();
        return localVariableList3;
    }

    public Item get(int i) {
        return (Item) get0(i);
    }

    public Item itemToLocal(Item item) {
        int size = size();
        for (int i = 0; i < size; i++) {
            Item item2 = (Item) get0(i);
            if (item2 != null && item2.matchesAllButType(item)) {
                return item2;
            }
        }
        return null;
    }

    public Item pcAndIndexToLocal(int i, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            Item item = (Item) get0(i3);
            if (item != null && item.matchesPcAndIndex(i, i2)) {
                return item;
            }
        }
        return null;
    }

    public void set(int i, Item item) {
        Objects.requireNonNull(item, "item == null");
        set0(i, item);
    }

    public void set(int i, int i2, int i3, CstString cstString, CstString cstString2, CstString cstString3, int i4) {
        set0(i, new Item(i2, i3, cstString, cstString2, cstString3, i4));
    }
}

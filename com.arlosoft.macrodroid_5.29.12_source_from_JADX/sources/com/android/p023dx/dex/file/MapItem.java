package com.android.p023dx.dex.file;

import com.android.p023dx.util.AnnotatedOutput;
import com.android.p023dx.util.Hex;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: com.android.dx.dex.file.MapItem */
public final class MapItem extends OffsettedItem {
    private static final int ALIGNMENT = 4;
    private static final int WRITE_SIZE = 12;
    private final Item firstItem;
    private final int itemCount;
    private final Item lastItem;
    private final Section section;
    private final ItemType type;

    private MapItem(ItemType itemType, Section section2, Item item, Item item2, int i) {
        super(4, 12);
        Objects.requireNonNull(itemType, "type == null");
        Objects.requireNonNull(section2, "section == null");
        Objects.requireNonNull(item, "firstItem == null");
        Objects.requireNonNull(item2, "lastItem == null");
        if (i > 0) {
            this.type = itemType;
            this.section = section2;
            this.firstItem = item;
            this.lastItem = item2;
            this.itemCount = i;
            return;
        }
        throw new IllegalArgumentException("itemCount <= 0");
    }

    public static void addMap(Section[] sectionArr, MixedItemSection mixedItemSection) {
        Section[] sectionArr2 = sectionArr;
        MixedItemSection mixedItemSection2 = mixedItemSection;
        Objects.requireNonNull(sectionArr2, "sections == null");
        if (mixedItemSection.items().size() == 0) {
            ArrayList arrayList = new ArrayList(50);
            for (Section section2 : sectionArr2) {
                ItemType itemType = null;
                Item item = null;
                Item item2 = null;
                int i = 0;
                for (Item item3 : section2.items()) {
                    ItemType itemType2 = item3.itemType();
                    if (itemType2 != itemType) {
                        if (i != 0) {
                            MapItem mapItem = r6;
                            MapItem mapItem2 = new MapItem(itemType, section2, item, item2, i);
                            arrayList.add(mapItem);
                        }
                        item = item3;
                        itemType = itemType2;
                        i = 0;
                    }
                    i++;
                    item2 = item3;
                }
                if (i != 0) {
                    arrayList.add(new MapItem(itemType, section2, item, item2, i));
                } else if (section2 == mixedItemSection2) {
                    arrayList.add(new MapItem(mixedItemSection2));
                }
            }
            mixedItemSection2.add(new UniformListItem(ItemType.TYPE_MAP_LIST, arrayList));
            return;
        }
        throw new IllegalArgumentException("mapSection.items().size() != 0");
    }

    public void addContents(DexFile dexFile) {
    }

    public ItemType itemType() {
        return ItemType.TYPE_MAP_ITEM;
    }

    public final String toHuman() {
        return toString();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(100);
        stringBuffer.append(MapItem.class.getName());
        stringBuffer.append('{');
        stringBuffer.append(this.section.toString());
        stringBuffer.append(' ');
        stringBuffer.append(this.type.toHuman());
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    /* access modifiers changed from: protected */
    public void writeTo0(DexFile dexFile, AnnotatedOutput annotatedOutput) {
        int i;
        int mapValue = this.type.getMapValue();
        Item item = this.firstItem;
        if (item == null) {
            i = this.section.getFileOffset();
        } else {
            i = this.section.getAbsoluteItemOffset(item);
        }
        if (annotatedOutput.annotates()) {
            annotatedOutput.annotate(0, offsetString() + ' ' + this.type.getTypeName() + " map");
            annotatedOutput.annotate(2, "  type:   " + Hex.m907u2(mapValue) + " // " + this.type.toString());
            annotatedOutput.annotate(2, "  unused: 0");
            StringBuilder sb = new StringBuilder();
            sb.append("  size:   ");
            sb.append(Hex.m909u4(this.itemCount));
            annotatedOutput.annotate(4, sb.toString());
            annotatedOutput.annotate(4, "  offset: " + Hex.m909u4(i));
        }
        annotatedOutput.writeShort(mapValue);
        annotatedOutput.writeShort(0);
        annotatedOutput.writeInt(this.itemCount);
        annotatedOutput.writeInt(i);
    }

    private MapItem(Section section2) {
        super(4, 12);
        Objects.requireNonNull(section2, "section == null");
        this.type = ItemType.TYPE_MAP_LIST;
        this.section = section2;
        this.firstItem = null;
        this.lastItem = null;
        this.itemCount = 1;
    }
}

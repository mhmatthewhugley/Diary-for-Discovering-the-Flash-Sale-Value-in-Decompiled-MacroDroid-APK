package com.android.p023dx.dex.file;

import com.android.p023dx.util.AnnotatedOutput;
import java.util.HashMap;
import java.util.TreeMap;
import org.apache.commons.p353io.IOUtils;

/* renamed from: com.android.dx.dex.file.Statistics */
public final class Statistics {
    private final HashMap<String, Data> dataMap = new HashMap<>(50);

    /* renamed from: com.android.dx.dex.file.Statistics$Data */
    private static class Data {
        private int count = 1;
        private int largestSize;
        /* access modifiers changed from: private */
        public final String name;
        private int smallestSize;
        private int totalSize;

        public Data(Item item, String str) {
            int writeSize = item.writeSize();
            this.name = str;
            this.totalSize = writeSize;
            this.largestSize = writeSize;
            this.smallestSize = writeSize;
        }

        public void add(Item item) {
            int writeSize = item.writeSize();
            this.count++;
            this.totalSize += writeSize;
            if (writeSize > this.largestSize) {
                this.largestSize = writeSize;
            }
            if (writeSize < this.smallestSize) {
                this.smallestSize = writeSize;
            }
        }

        public String toHuman() {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("  ");
            sb2.append(this.name);
            sb2.append(": ");
            sb2.append(this.count);
            sb2.append(" item");
            sb2.append(this.count == 1 ? "" : "s");
            sb2.append("; ");
            sb2.append(this.totalSize);
            sb2.append(" bytes total\n");
            sb.append(sb2.toString());
            if (this.smallestSize == this.largestSize) {
                sb.append("    " + this.smallestSize + " bytes/item\n");
            } else {
                int i = this.totalSize / this.count;
                sb.append("    " + this.smallestSize + ".." + this.largestSize + " bytes/item; average " + i + IOUtils.LINE_SEPARATOR_UNIX);
            }
            return sb.toString();
        }

        public void writeAnnotation(AnnotatedOutput annotatedOutput) {
            annotatedOutput.annotate(toHuman());
        }
    }

    public void add(Item item) {
        String typeName = item.typeName();
        Data data = this.dataMap.get(typeName);
        if (data == null) {
            this.dataMap.put(typeName, new Data(item, typeName));
        } else {
            data.add(item);
        }
    }

    public void addAll(Section section) {
        for (Item add : section.items()) {
            add(add);
        }
    }

    public String toHuman() {
        StringBuilder sb = new StringBuilder();
        sb.append("Statistics:\n");
        TreeMap treeMap = new TreeMap();
        for (Data next : this.dataMap.values()) {
            treeMap.put(next.name, next);
        }
        for (Data human : treeMap.values()) {
            sb.append(human.toHuman());
        }
        return sb.toString();
    }

    public final void writeAnnotation(AnnotatedOutput annotatedOutput) {
        if (this.dataMap.size() != 0) {
            annotatedOutput.annotate(0, "\nstatistics:\n");
            TreeMap treeMap = new TreeMap();
            for (Data next : this.dataMap.values()) {
                treeMap.put(next.name, next);
            }
            for (Data writeAnnotation : treeMap.values()) {
                writeAnnotation.writeAnnotation(annotatedOutput);
            }
        }
    }
}

package com.android.p023dx.dex.file;

import com.android.dex.DexIndexOverflowException;
import com.android.p023dx.command.dexer.Main;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.android.dx.dex.file.MemberIdsSection */
public abstract class MemberIdsSection extends UniformItemSection {
    public MemberIdsSection(String str, DexFile dexFile) {
        super(str, dexFile, 4);
    }

    private String getTooManyMembersMessage() {
        TreeMap treeMap = new TreeMap();
        Iterator<? extends Item> it = items().iterator();
        while (it.hasNext()) {
            String packageName = ((MemberIdItem) it.next()).getDefiningClass().getPackageName();
            AtomicInteger atomicInteger = (AtomicInteger) treeMap.get(packageName);
            if (atomicInteger == null) {
                atomicInteger = new AtomicInteger();
                treeMap.put(packageName, atomicInteger);
            }
            atomicInteger.incrementAndGet();
        }
        Formatter formatter = new Formatter();
        try {
            String str = this instanceof MethodIdsSection ? "method" : "field";
            formatter.format("Too many %s references: %d; max is %d.%n" + Main.getTooManyIdsErrorMessage() + "%nReferences by package:", new Object[]{str, Integer.valueOf(items().size()), 65536});
            for (Map.Entry entry : treeMap.entrySet()) {
                formatter.format("%n%6d %s", new Object[]{Integer.valueOf(((AtomicInteger) entry.getValue()).get()), entry.getKey()});
            }
            return formatter.toString();
        } finally {
            formatter.close();
        }
    }

    /* access modifiers changed from: protected */
    public void orderItems() {
        if (items().size() <= 65536) {
            Iterator<? extends Item> it = items().iterator();
            int i = 0;
            while (it.hasNext()) {
                ((MemberIdItem) it.next()).setIndex(i);
                i++;
            }
            return;
        }
        throw new DexIndexOverflowException(getTooManyMembersMessage());
    }
}

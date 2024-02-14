package com.android.p023dx.dex.code;

import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.rop.code.RegisterSpecSet;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.util.FixedSizeList;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: com.android.dx.dex.code.LocalList */
public final class LocalList extends FixedSizeList {
    private static final boolean DEBUG = false;
    public static final LocalList EMPTY = new LocalList(0);

    /* renamed from: com.android.dx.dex.code.LocalList$Disposition */
    public enum Disposition {
        START,
        END_SIMPLY,
        END_REPLACED,
        END_MOVED,
        END_CLOBBERED_BY_PREV,
        END_CLOBBERED_BY_NEXT
    }

    /* renamed from: com.android.dx.dex.code.LocalList$Entry */
    public static class Entry implements Comparable<Entry> {
        private final int address;
        private final Disposition disposition;
        private final RegisterSpec spec;
        private final CstType type;

        public Entry(int i, Disposition disposition2, RegisterSpec registerSpec) {
            if (i >= 0) {
                Objects.requireNonNull(disposition2, "disposition == null");
                try {
                    if (registerSpec.getLocalItem() != null) {
                        this.address = i;
                        this.disposition = disposition2;
                        this.spec = registerSpec;
                        this.type = CstType.intern(registerSpec.getType());
                        return;
                    }
                    throw new NullPointerException("spec.getLocalItem() == null");
                } catch (NullPointerException unused) {
                    throw new NullPointerException("spec == null");
                }
            } else {
                throw new IllegalArgumentException("address < 0");
            }
        }

        public boolean equals(Object obj) {
            if ((obj instanceof Entry) && compareTo((Entry) obj) == 0) {
                return true;
            }
            return false;
        }

        public int getAddress() {
            return this.address;
        }

        public Disposition getDisposition() {
            return this.disposition;
        }

        public CstString getName() {
            return this.spec.getLocalItem().getName();
        }

        public int getRegister() {
            return this.spec.getReg();
        }

        public RegisterSpec getRegisterSpec() {
            return this.spec;
        }

        public CstString getSignature() {
            return this.spec.getLocalItem().getSignature();
        }

        public CstType getType() {
            return this.type;
        }

        public boolean isStart() {
            return this.disposition == Disposition.START;
        }

        public boolean matches(RegisterSpec registerSpec) {
            return this.spec.equalsUsingSimpleType(registerSpec);
        }

        public String toString() {
            return Integer.toHexString(this.address) + " " + this.disposition + " " + this.spec;
        }

        public Entry withDisposition(Disposition disposition2) {
            if (disposition2 == this.disposition) {
                return this;
            }
            return new Entry(this.address, disposition2, this.spec);
        }

        public int compareTo(Entry entry) {
            int i = this.address;
            int i2 = entry.address;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            boolean isStart = isStart();
            if (isStart == entry.isStart()) {
                return this.spec.compareTo(entry.spec);
            }
            if (isStart) {
                return 1;
            }
            return -1;
        }

        public boolean matches(Entry entry) {
            return matches(entry.spec);
        }
    }

    /* renamed from: com.android.dx.dex.code.LocalList$MakeState */
    public static class MakeState {
        private int[] endIndices = null;
        private int lastAddress = 0;
        private int nullResultCount = 0;
        private RegisterSpecSet regs = null;
        private final ArrayList<Entry> result;

        public MakeState(int i) {
            this.result = new ArrayList<>(i);
        }

        private void aboutToProcess(int i, int i2) {
            int[] iArr = this.endIndices;
            boolean z = iArr == null;
            int i3 = this.lastAddress;
            if (i == i3 && !z) {
                return;
            }
            if (i < i3) {
                throw new RuntimeException("shouldn't happen");
            } else if (z || i2 >= iArr.length) {
                int i4 = i2 + 1;
                RegisterSpecSet registerSpecSet = new RegisterSpecSet(i4);
                int[] iArr2 = new int[i4];
                Arrays.fill(iArr2, -1);
                if (!z) {
                    registerSpecSet.putAll(this.regs);
                    int[] iArr3 = this.endIndices;
                    System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
                }
                this.regs = registerSpecSet;
                this.endIndices = iArr2;
            }
        }

        private void add(int i, Disposition disposition, RegisterSpec registerSpec) {
            int reg = registerSpec.getReg();
            this.result.add(new Entry(i, disposition, registerSpec));
            if (disposition == Disposition.START) {
                this.regs.put(registerSpec);
                this.endIndices[reg] = -1;
                return;
            }
            this.regs.remove(registerSpec);
            this.endIndices[reg] = this.result.size() - 1;
        }

        private void addOrUpdateEnd(int i, Disposition disposition, RegisterSpec registerSpec) {
            if (disposition != Disposition.START) {
                int i2 = this.endIndices[registerSpec.getReg()];
                if (i2 >= 0) {
                    Entry entry = this.result.get(i2);
                    if (entry.getAddress() == i && entry.getRegisterSpec().equals(registerSpec)) {
                        this.result.set(i2, entry.withDisposition(disposition));
                        this.regs.remove(registerSpec);
                        return;
                    }
                }
                endLocal(i, registerSpec, disposition);
                return;
            }
            throw new RuntimeException("shouldn't happen");
        }

        private boolean checkForEmptyRange(int i, RegisterSpec registerSpec) {
            boolean z;
            int size = this.result.size() - 1;
            while (true) {
                z = false;
                if (size < 0) {
                    break;
                }
                Entry entry = this.result.get(size);
                if (entry != null) {
                    if (entry.getAddress() != i) {
                        return false;
                    }
                    if (entry.matches(registerSpec)) {
                        break;
                    }
                }
                size--;
            }
            this.regs.remove(registerSpec);
            Entry entry2 = null;
            this.result.set(size, (Object) null);
            this.nullResultCount++;
            int reg = registerSpec.getReg();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                entry2 = this.result.get(size);
                if (entry2 != null && entry2.getRegisterSpec().getReg() == reg) {
                    z = true;
                    break;
                }
            }
            if (z) {
                this.endIndices[reg] = size;
                if (entry2.getAddress() == i) {
                    this.result.set(size, entry2.withDisposition(Disposition.END_SIMPLY));
                }
            }
            return true;
        }

        private static RegisterSpec filterSpec(RegisterSpec registerSpec) {
            return (registerSpec == null || registerSpec.getType() != Type.KNOWN_NULL) ? registerSpec : registerSpec.withType(Type.OBJECT);
        }

        public void endLocal(int i, RegisterSpec registerSpec) {
            endLocal(i, registerSpec, Disposition.END_SIMPLY);
        }

        public LocalList finish() {
            aboutToProcess(Integer.MAX_VALUE, 0);
            int size = this.result.size();
            int i = size - this.nullResultCount;
            if (i == 0) {
                return LocalList.EMPTY;
            }
            Entry[] entryArr = new Entry[i];
            if (size == i) {
                this.result.toArray(entryArr);
            } else {
                Iterator<Entry> it = this.result.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    Entry next = it.next();
                    if (next != null) {
                        entryArr[i2] = next;
                        i2++;
                    }
                }
            }
            Arrays.sort(entryArr);
            LocalList localList = new LocalList(i);
            for (int i3 = 0; i3 < i; i3++) {
                localList.set(i3, entryArr[i3]);
            }
            localList.setImmutable();
            return localList;
        }

        public void snapshot(int i, RegisterSpecSet registerSpecSet) {
            int maxSize = registerSpecSet.getMaxSize();
            aboutToProcess(i, maxSize - 1);
            for (int i2 = 0; i2 < maxSize; i2++) {
                RegisterSpec registerSpec = this.regs.get(i2);
                RegisterSpec filterSpec = filterSpec(registerSpecSet.get(i2));
                if (registerSpec == null) {
                    if (filterSpec != null) {
                        startLocal(i, filterSpec);
                    }
                } else if (filterSpec == null) {
                    endLocal(i, registerSpec);
                } else if (!filterSpec.equalsUsingSimpleType(registerSpec)) {
                    endLocal(i, registerSpec);
                    startLocal(i, filterSpec);
                }
            }
        }

        public void startLocal(int i, RegisterSpec registerSpec) {
            RegisterSpec registerSpec2;
            RegisterSpec registerSpec3;
            int reg = registerSpec.getReg();
            RegisterSpec filterSpec = filterSpec(registerSpec);
            aboutToProcess(i, reg);
            RegisterSpec registerSpec4 = this.regs.get(reg);
            if (!filterSpec.equalsUsingSimpleType(registerSpec4)) {
                RegisterSpec findMatchingLocal = this.regs.findMatchingLocal(filterSpec);
                if (findMatchingLocal != null) {
                    addOrUpdateEnd(i, Disposition.END_MOVED, findMatchingLocal);
                }
                int i2 = this.endIndices[reg];
                if (registerSpec4 != null) {
                    add(i, Disposition.END_REPLACED, registerSpec4);
                } else if (i2 >= 0) {
                    Entry entry = this.result.get(i2);
                    if (entry.getAddress() == i) {
                        if (entry.matches(filterSpec)) {
                            this.result.set(i2, (Object) null);
                            this.nullResultCount++;
                            this.regs.put(filterSpec);
                            this.endIndices[reg] = -1;
                            return;
                        }
                        this.result.set(i2, entry.withDisposition(Disposition.END_REPLACED));
                    }
                }
                if (reg > 0 && (registerSpec3 = this.regs.get(reg - 1)) != null && registerSpec3.isCategory2()) {
                    addOrUpdateEnd(i, Disposition.END_CLOBBERED_BY_NEXT, registerSpec3);
                }
                if (filterSpec.isCategory2() && (registerSpec2 = this.regs.get(reg + 1)) != null) {
                    addOrUpdateEnd(i, Disposition.END_CLOBBERED_BY_PREV, registerSpec2);
                }
                add(i, Disposition.START, filterSpec);
            }
        }

        public void endLocal(int i, RegisterSpec registerSpec, Disposition disposition) {
            int reg = registerSpec.getReg();
            RegisterSpec filterSpec = filterSpec(registerSpec);
            aboutToProcess(i, reg);
            if (this.endIndices[reg] < 0 && !checkForEmptyRange(i, filterSpec)) {
                add(i, disposition, filterSpec);
            }
        }
    }

    public LocalList(int i) {
        super(i);
    }

    private static void debugVerify(LocalList localList) {
        try {
            debugVerify0(localList);
        } catch (RuntimeException e) {
            int size = localList.size();
            for (int i = 0; i < size; i++) {
                System.err.println(localList.get(i));
            }
            throw e;
        }
    }

    private static void debugVerify0(LocalList localList) {
        int size = localList.size();
        Entry[] entryArr = new Entry[65536];
        for (int i = 0; i < size; i++) {
            Entry entry = localList.get(i);
            int register = entry.getRegister();
            if (entry.isStart()) {
                Entry entry2 = entryArr[register];
                if (entry2 == null || !entry.matches(entry2)) {
                    entryArr[register] = entry;
                } else {
                    throw new RuntimeException("redundant start at " + Integer.toHexString(entry.getAddress()) + ": got " + entry + "; had " + entry2);
                }
            } else if (entryArr[register] != null) {
                int address = entry.getAddress();
                boolean z = false;
                for (int i2 = i + 1; i2 < size; i2++) {
                    Entry entry3 = localList.get(i2);
                    if (entry3.getAddress() != address) {
                        break;
                    }
                    if (entry3.getRegisterSpec().getReg() == register) {
                        if (!entry3.isStart()) {
                            throw new RuntimeException("redundant end at " + Integer.toHexString(address));
                        } else if (entry.getDisposition() == Disposition.END_REPLACED) {
                            z = true;
                        } else {
                            throw new RuntimeException("improperly marked end at " + Integer.toHexString(address));
                        }
                    }
                }
                if (z || entry.getDisposition() != Disposition.END_REPLACED) {
                    entryArr[register] = null;
                } else {
                    throw new RuntimeException("improper end replacement claim at " + Integer.toHexString(address));
                }
            } else {
                throw new RuntimeException("redundant end at " + Integer.toHexString(entry.getAddress()));
            }
        }
    }

    public static LocalList make(DalvInsnList dalvInsnList) {
        int size = dalvInsnList.size();
        MakeState makeState = new MakeState(size);
        for (int i = 0; i < size; i++) {
            DalvInsn dalvInsn = dalvInsnList.get(i);
            if (dalvInsn instanceof LocalSnapshot) {
                makeState.snapshot(dalvInsn.getAddress(), ((LocalSnapshot) dalvInsn).getLocals());
            } else if (dalvInsn instanceof LocalStart) {
                makeState.startLocal(dalvInsn.getAddress(), ((LocalStart) dalvInsn).getLocal());
            }
        }
        return makeState.finish();
    }

    public void debugPrint(PrintStream printStream, String str) {
        int size = size();
        for (int i = 0; i < size; i++) {
            printStream.print(str);
            printStream.println(get(i));
        }
    }

    public Entry get(int i) {
        return (Entry) get0(i);
    }

    public void set(int i, Entry entry) {
        set0(i, entry);
    }
}

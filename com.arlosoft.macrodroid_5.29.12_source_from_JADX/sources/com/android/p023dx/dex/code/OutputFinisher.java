package com.android.p023dx.dex.code;

import com.android.dex.DexException;
import com.android.p023dx.dex.DexOptions;
import com.android.p023dx.dex.code.DalvCode;
import com.android.p023dx.rop.code.LocalItem;
import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.code.RegisterSpecSet;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstMemberRef;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.ssa.BasicRegisterMapper;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.android.dx.dex.code.OutputFinisher */
public final class OutputFinisher {
    private final DexOptions dexOptions;
    private boolean hasAnyLocalInfo = false;
    private boolean hasAnyPositionInfo = false;
    private ArrayList<DalvInsn> insns;
    private final int paramSize;
    private int reservedCount = -1;
    private int reservedParameterCount;
    private final int unreservedRegCount;

    public OutputFinisher(DexOptions dexOptions2, int i, int i2, int i3) {
        this.dexOptions = dexOptions2;
        this.unreservedRegCount = i2;
        this.insns = new ArrayList<>(i);
        this.paramSize = i3;
    }

    private static void addConstants(HashSet<Constant> hashSet, DalvInsn dalvInsn) {
        if (dalvInsn instanceof CstInsn) {
            hashSet.add(((CstInsn) dalvInsn).getConstant());
        } else if (dalvInsn instanceof LocalSnapshot) {
            RegisterSpecSet locals = ((LocalSnapshot) dalvInsn).getLocals();
            int size = locals.size();
            for (int i = 0; i < size; i++) {
                addConstants(hashSet, locals.get(i));
            }
        } else if (dalvInsn instanceof LocalStart) {
            addConstants(hashSet, ((LocalStart) dalvInsn).getLocal());
        }
    }

    private void addReservedParameters(int i) {
        shiftParameters(i);
        this.reservedParameterCount += i;
    }

    private void addReservedRegisters(int i) {
        shiftAllRegisters(i);
        this.reservedCount += i;
    }

    private void align64bits(Dop[] dopArr) {
        do {
            int i = ((this.unreservedRegCount + this.reservedCount) + this.reservedParameterCount) - this.paramSize;
            Iterator<DalvInsn> it = this.insns.iterator();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (it.hasNext()) {
                RegisterSpecList registers = it.next().getRegisters();
                for (int i6 = 0; i6 < registers.size(); i6++) {
                    RegisterSpec registerSpec = registers.get(i6);
                    if (registerSpec.isCategory2()) {
                        boolean z = registerSpec.getReg() >= i;
                        if (registerSpec.isEvenRegister()) {
                            if (z) {
                                i3++;
                            } else {
                                i5++;
                            }
                        } else if (z) {
                            i2++;
                        } else {
                            i4++;
                        }
                    }
                }
            }
            if (i2 > i3 && i4 > i5) {
                addReservedRegisters(1);
            } else if (i2 > i3) {
                addReservedParameters(1);
            } else if (i4 > i5) {
                addReservedRegisters(1);
                if (this.paramSize != 0 && i3 > i2) {
                    addReservedParameters(1);
                }
            } else {
                return;
            }
        } while (reserveRegisters(dopArr));
    }

    private void assignAddresses() {
        int size = this.insns.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            DalvInsn dalvInsn = this.insns.get(i2);
            dalvInsn.setAddress(i);
            i += dalvInsn.codeSize();
        }
    }

    private void assignAddressesAndFixBranches() {
        do {
            assignAddresses();
        } while (fixBranches());
    }

    private int calculateReservedCount(Dop[] dopArr) {
        int size = this.insns.size();
        int i = this.reservedCount;
        for (int i2 = 0; i2 < size; i2++) {
            DalvInsn dalvInsn = this.insns.get(i2);
            Dop dop = dopArr[i2];
            Dop findOpcodeForInsn = findOpcodeForInsn(dalvInsn, dop);
            if (findOpcodeForInsn == null) {
                int minimumRegisterRequirement = dalvInsn.getMinimumRegisterRequirement(findExpandedOpcodeForInsn(dalvInsn).getFormat().compatibleRegs(dalvInsn));
                if (minimumRegisterRequirement > i) {
                    i = minimumRegisterRequirement;
                }
            } else if (dop == findOpcodeForInsn) {
            }
            dopArr[i2] = findOpcodeForInsn;
        }
        return i;
    }

    private Dop findExpandedOpcodeForInsn(DalvInsn dalvInsn) {
        Dop findOpcodeForInsn = findOpcodeForInsn(dalvInsn.getLowRegVersion(), dalvInsn.getOpcode());
        if (findOpcodeForInsn != null) {
            return findOpcodeForInsn;
        }
        throw new DexException("No expanded opcode for " + dalvInsn);
    }

    private Dop findOpcodeForInsn(DalvInsn dalvInsn, Dop dop) {
        while (dop != null && (!dop.getFormat().isCompatible(dalvInsn) || (this.dexOptions.forceJumbo && dop.getOpcode() == 26))) {
            dop = Dops.getNextOrNull(dop, this.dexOptions);
        }
        return dop;
    }

    private boolean fixBranches() {
        int size = this.insns.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            DalvInsn dalvInsn = this.insns.get(i);
            if (dalvInsn instanceof TargetInsn) {
                Dop opcode = dalvInsn.getOpcode();
                TargetInsn targetInsn = (TargetInsn) dalvInsn;
                if (!opcode.getFormat().branchFits(targetInsn)) {
                    if (opcode.getFamily() == 40) {
                        Dop findOpcodeForInsn = findOpcodeForInsn(dalvInsn, opcode);
                        if (findOpcodeForInsn != null) {
                            this.insns.set(i, dalvInsn.withOpcode(findOpcodeForInsn));
                        } else {
                            throw new UnsupportedOperationException("method too long");
                        }
                    } else {
                        try {
                            int i2 = i + 1;
                            CodeAddress codeAddress = (CodeAddress) this.insns.get(i2);
                            this.insns.set(i, new TargetInsn(Dops.GOTO, targetInsn.getPosition(), RegisterSpecList.EMPTY, targetInsn.getTarget()));
                            this.insns.add(i, targetInsn.withNewTargetAndReversed(codeAddress));
                            size++;
                            i = i2;
                        } catch (IndexOutOfBoundsException unused) {
                            throw new IllegalStateException("unpaired TargetInsn (dangling)");
                        } catch (ClassCastException unused2) {
                            throw new IllegalStateException("unpaired TargetInsn");
                        }
                    }
                    z = true;
                } else {
                    continue;
                }
            }
            i++;
        }
        return z;
    }

    private static boolean hasLocalInfo(DalvInsn dalvInsn) {
        if (!(dalvInsn instanceof LocalSnapshot)) {
            return (dalvInsn instanceof LocalStart) && hasLocalInfo(((LocalStart) dalvInsn).getLocal());
        }
        RegisterSpecSet locals = ((LocalSnapshot) dalvInsn).getLocals();
        int size = locals.size();
        for (int i = 0; i < size; i++) {
            if (hasLocalInfo(locals.get(i))) {
                return true;
            }
        }
    }

    private Dop[] makeOpcodesArray() {
        int size = this.insns.size();
        Dop[] dopArr = new Dop[size];
        for (int i = 0; i < size; i++) {
            dopArr[i] = this.insns.get(i).getOpcode();
        }
        return dopArr;
    }

    private void massageInstructions(Dop[] dopArr) {
        if (this.reservedCount == 0) {
            int size = this.insns.size();
            for (int i = 0; i < size; i++) {
                DalvInsn dalvInsn = this.insns.get(i);
                Dop opcode = dalvInsn.getOpcode();
                Dop dop = dopArr[i];
                if (opcode != dop) {
                    this.insns.set(i, dalvInsn.withOpcode(dop));
                }
            }
            return;
        }
        this.insns = performExpansion(dopArr);
    }

    private ArrayList<DalvInsn> performExpansion(Dop[] dopArr) {
        DalvInsn dalvInsn;
        int size = this.insns.size();
        ArrayList<DalvInsn> arrayList = new ArrayList<>(size * 2);
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < size; i++) {
            DalvInsn dalvInsn2 = this.insns.get(i);
            Dop opcode = dalvInsn2.getOpcode();
            Dop dop = dopArr[i];
            DalvInsn dalvInsn3 = null;
            if (dop != null) {
                dalvInsn = null;
            } else {
                dop = findExpandedOpcodeForInsn(dalvInsn2);
                BitSet compatibleRegs = dop.getFormat().compatibleRegs(dalvInsn2);
                DalvInsn expandedPrefix = dalvInsn2.expandedPrefix(compatibleRegs);
                dalvInsn = dalvInsn2.expandedSuffix(compatibleRegs);
                dalvInsn2 = dalvInsn2.expandedVersion(compatibleRegs);
                dalvInsn3 = expandedPrefix;
            }
            if (dalvInsn2 instanceof CodeAddress) {
                CodeAddress codeAddress = (CodeAddress) dalvInsn2;
                if (codeAddress.getBindsClosely()) {
                    arrayList2.add(codeAddress);
                }
            }
            if (dalvInsn3 != null) {
                arrayList.add(dalvInsn3);
            }
            if (!(dalvInsn2 instanceof ZeroSizeInsn) && arrayList2.size() > 0) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add((CodeAddress) it.next());
                }
                arrayList2.clear();
            }
            if (dop != opcode) {
                dalvInsn2 = dalvInsn2.withOpcode(dop);
            }
            arrayList.add(dalvInsn2);
            if (dalvInsn != null) {
                arrayList.add(dalvInsn);
            }
        }
        return arrayList;
    }

    private boolean reserveRegisters(Dop[] dopArr) {
        int i = this.reservedCount;
        if (i < 0) {
            i = 0;
        }
        boolean z = false;
        while (true) {
            int calculateReservedCount = calculateReservedCount(dopArr);
            if (i >= calculateReservedCount) {
                this.reservedCount = i;
                return z;
            }
            int i2 = calculateReservedCount - i;
            int size = this.insns.size();
            for (int i3 = 0; i3 < size; i3++) {
                DalvInsn dalvInsn = this.insns.get(i3);
                if (!(dalvInsn instanceof CodeAddress)) {
                    this.insns.set(i3, dalvInsn.withRegisterOffset(i2));
                }
            }
            z = true;
            i = calculateReservedCount;
        }
    }

    private void shiftAllRegisters(int i) {
        int size = this.insns.size();
        for (int i2 = 0; i2 < size; i2++) {
            DalvInsn dalvInsn = this.insns.get(i2);
            if (!(dalvInsn instanceof CodeAddress)) {
                this.insns.set(i2, dalvInsn.withRegisterOffset(i));
            }
        }
    }

    private void shiftParameters(int i) {
        int size = this.insns.size();
        int i2 = this.unreservedRegCount + this.reservedCount + this.reservedParameterCount;
        int i3 = i2 - this.paramSize;
        BasicRegisterMapper basicRegisterMapper = new BasicRegisterMapper(i2);
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 >= i3) {
                basicRegisterMapper.addMapping(i4, i4 + i, 1);
            } else {
                basicRegisterMapper.addMapping(i4, i4, 1);
            }
        }
        for (int i5 = 0; i5 < size; i5++) {
            DalvInsn dalvInsn = this.insns.get(i5);
            if (!(dalvInsn instanceof CodeAddress)) {
                this.insns.set(i5, dalvInsn.withMapper(basicRegisterMapper));
            }
        }
    }

    private void updateInfo(DalvInsn dalvInsn) {
        if (!this.hasAnyPositionInfo && dalvInsn.getPosition().getLine() >= 0) {
            this.hasAnyPositionInfo = true;
        }
        if (!this.hasAnyLocalInfo && hasLocalInfo(dalvInsn)) {
            this.hasAnyLocalInfo = true;
        }
    }

    public void add(DalvInsn dalvInsn) {
        this.insns.add(dalvInsn);
        updateInfo(dalvInsn);
    }

    public void assignIndices(DalvCode.AssignIndicesCallback assignIndicesCallback) {
        Iterator<DalvInsn> it = this.insns.iterator();
        while (it.hasNext()) {
            DalvInsn next = it.next();
            if (next instanceof CstInsn) {
                assignIndices((CstInsn) next, assignIndicesCallback);
            }
        }
    }

    public DalvInsnList finishProcessingAndGetList() {
        if (this.reservedCount < 0) {
            Dop[] makeOpcodesArray = makeOpcodesArray();
            reserveRegisters(makeOpcodesArray);
            if (this.dexOptions.ALIGN_64BIT_REGS_IN_OUTPUT_FINISHER) {
                align64bits(makeOpcodesArray);
            }
            massageInstructions(makeOpcodesArray);
            assignAddressesAndFixBranches();
            return DalvInsnList.makeImmutable(this.insns, this.reservedCount + this.unreservedRegCount + this.reservedParameterCount);
        }
        throw new UnsupportedOperationException("already processed");
    }

    public HashSet<Constant> getAllConstants() {
        HashSet<Constant> hashSet = new HashSet<>(20);
        Iterator<DalvInsn> it = this.insns.iterator();
        while (it.hasNext()) {
            addConstants(hashSet, it.next());
        }
        return hashSet;
    }

    public boolean hasAnyLocalInfo() {
        return this.hasAnyLocalInfo;
    }

    public boolean hasAnyPositionInfo() {
        return this.hasAnyPositionInfo;
    }

    public void insert(int i, DalvInsn dalvInsn) {
        this.insns.add(i, dalvInsn);
        updateInfo(dalvInsn);
    }

    public void reverseBranch(int i, CodeAddress codeAddress) {
        int size = (this.insns.size() - i) - 1;
        try {
            this.insns.set(size, ((TargetInsn) this.insns.get(size)).withNewTargetAndReversed(codeAddress));
        } catch (IndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("too few instructions");
        } catch (ClassCastException unused2) {
            throw new IllegalArgumentException("non-reversible instruction");
        }
    }

    private static void assignIndices(CstInsn cstInsn, DalvCode.AssignIndicesCallback assignIndicesCallback) {
        int index;
        Constant constant = cstInsn.getConstant();
        int index2 = assignIndicesCallback.getIndex(constant);
        if (index2 >= 0) {
            cstInsn.setIndex(index2);
        }
        if ((constant instanceof CstMemberRef) && (index = assignIndicesCallback.getIndex(((CstMemberRef) constant).getDefiningClass())) >= 0) {
            cstInsn.setClassIndex(index);
        }
    }

    private static boolean hasLocalInfo(RegisterSpec registerSpec) {
        return (registerSpec == null || registerSpec.getLocalItem().getName() == null) ? false : true;
    }

    private static void addConstants(HashSet<Constant> hashSet, RegisterSpec registerSpec) {
        if (registerSpec != null) {
            LocalItem localItem = registerSpec.getLocalItem();
            CstString name = localItem.getName();
            CstString signature = localItem.getSignature();
            Type type = registerSpec.getType();
            if (type != Type.KNOWN_NULL) {
                hashSet.add(CstType.intern(type));
            }
            if (name != null) {
                hashSet.add(name);
            }
            if (signature != null) {
                hashSet.add(signature);
            }
        }
    }
}

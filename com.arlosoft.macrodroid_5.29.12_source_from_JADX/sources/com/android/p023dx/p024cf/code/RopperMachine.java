package com.android.p023dx.p024cf.code;

import com.android.p023dx.p024cf.iface.Method;
import com.android.p023dx.p024cf.iface.MethodList;
import com.android.p023dx.rop.code.AccessFlags;
import com.android.p023dx.rop.code.Insn;
import com.android.p023dx.rop.code.RegisterSpec;
import com.android.p023dx.rop.code.RegisterSpecList;
import com.android.p023dx.rop.code.Rop;
import com.android.p023dx.rop.code.SourcePosition;
import com.android.p023dx.rop.code.TranslationAdvice;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstMethodRef;
import com.android.p023dx.rop.cst.CstNat;
import com.android.p023dx.rop.cst.CstString;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.rop.type.TypeList;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: com.android.dx.cf.code.RopperMachine */
final class RopperMachine extends ValueAwareMachine {
    private static final CstType ARRAY_REFLECT_TYPE;
    private static final CstMethodRef MULTIANEWARRAY_METHOD;
    private final TranslationAdvice advice;
    private boolean blockCanThrow = false;
    private TypeList catches = null;
    private boolean catchesUsed = false;
    private int extraBlockCount = 0;
    private boolean hasJsr;
    private final ArrayList<Insn> insns = new ArrayList<>(25);
    private final int maxLocals;
    private final ConcreteMethod method;
    private final MethodList methods;
    private int primarySuccessorIndex = -1;
    private ReturnAddress returnAddress;
    private Rop returnOp = null;
    private SourcePosition returnPosition = null;
    private boolean returns = false;
    private final Ropper ropper;

    static {
        CstType cstType = new CstType(Type.internClassName("java/lang/reflect/Array"));
        ARRAY_REFLECT_TYPE = cstType;
        MULTIANEWARRAY_METHOD = new CstMethodRef(cstType, new CstNat(new CstString("newInstance"), new CstString("(Ljava/lang/Class;[I)Ljava/lang/Object;")));
    }

    public RopperMachine(Ropper ropper2, ConcreteMethod concreteMethod, TranslationAdvice translationAdvice, MethodList methodList) {
        super(concreteMethod.getEffectiveDescriptor());
        Objects.requireNonNull(methodList, "methods == null");
        Objects.requireNonNull(ropper2, "ropper == null");
        Objects.requireNonNull(translationAdvice, "advice == null");
        this.ropper = ropper2;
        this.method = concreteMethod;
        this.methods = methodList;
        this.advice = translationAdvice;
        this.maxLocals = concreteMethod.getMaxLocals();
    }

    private RegisterSpecList getSources(int i, int i2) {
        RegisterSpecList registerSpecList;
        int argCount = argCount();
        if (argCount == 0) {
            return RegisterSpecList.EMPTY;
        }
        int localIndex = getLocalIndex();
        if (localIndex >= 0) {
            registerSpecList = new RegisterSpecList(1);
            registerSpecList.set(0, RegisterSpec.make(localIndex, arg(0)));
        } else {
            RegisterSpecList registerSpecList2 = new RegisterSpecList(argCount);
            for (int i3 = 0; i3 < argCount; i3++) {
                RegisterSpec make = RegisterSpec.make(i2, arg(i3));
                registerSpecList2.set(i3, make);
                i2 += make.getCategory();
            }
            if (i != 79) {
                if (i == 181) {
                    if (argCount == 2) {
                        RegisterSpec registerSpec = registerSpecList2.get(0);
                        registerSpecList2.set(0, registerSpecList2.get(1));
                        registerSpecList2.set(1, registerSpec);
                    } else {
                        throw new RuntimeException("shouldn't happen");
                    }
                }
            } else if (argCount == 3) {
                RegisterSpec registerSpec2 = registerSpecList2.get(0);
                RegisterSpec registerSpec3 = registerSpecList2.get(1);
                registerSpecList2.set(0, registerSpecList2.get(2));
                registerSpecList2.set(1, registerSpec2);
                registerSpecList2.set(2, registerSpec3);
            } else {
                throw new RuntimeException("shouldn't happen");
            }
            registerSpecList = registerSpecList2;
        }
        registerSpecList.setImmutable();
        return registerSpecList;
    }

    private int jopToRopOpcode(int i, Constant constant) {
        if (i == 0) {
            return 1;
        }
        if (i == 20) {
            return 5;
        }
        if (i == 21) {
            return 2;
        }
        if (i == 171) {
            return 13;
        }
        if (i == 172) {
            return 33;
        }
        if (i == 198) {
            return 7;
        }
        if (i == 199) {
            return 8;
        }
        switch (i) {
            case 0:
                return 1;
            case 18:
                return 5;
            case 46:
                return 38;
            case 54:
                return 2;
            case 79:
                return 39;
            case 96:
                return 14;
            case 100:
                return 15;
            case 104:
                return 16;
            case 108:
                return 17;
            case 112:
                return 18;
            case 116:
                return 19;
            case 120:
                return 23;
            case 122:
                return 24;
            case 124:
                return 25;
            case 126:
                return 20;
            case 128:
                return 21;
            case 130:
                return 22;
            default:
                switch (i) {
                    case 132:
                        return 14;
                    case 133:
                    case 134:
                    case 135:
                    case 136:
                    case 137:
                    case 138:
                    case 139:
                    case 140:
                    case 141:
                    case 142:
                    case 143:
                    case 144:
                        return 29;
                    case 145:
                        return 30;
                    case 146:
                        return 31;
                    case 147:
                        return 32;
                    case 148:
                    case 149:
                    case 151:
                        return 27;
                    case 150:
                    case 152:
                        return 28;
                    case 153:
                    case 159:
                    case 165:
                        return 7;
                    case 154:
                    case 160:
                    case 166:
                        return 8;
                    case 155:
                    case 161:
                        return 9;
                    case 156:
                    case 162:
                        return 10;
                    case 157:
                    case 163:
                        return 12;
                    case 158:
                    case 164:
                        return 11;
                    case 167:
                        return 6;
                    default:
                        switch (i) {
                            case 177:
                                return 33;
                            case 178:
                                return 46;
                            case 179:
                                return 48;
                            case 180:
                                return 45;
                            case 181:
                                return 47;
                            case 182:
                                CstMethodRef cstMethodRef = (CstMethodRef) constant;
                                if (!cstMethodRef.getDefiningClass().equals(this.method.getDefiningClass())) {
                                    return 50;
                                }
                                for (int i2 = 0; i2 < this.methods.size(); i2++) {
                                    Method method2 = this.methods.get(i2);
                                    if (AccessFlags.isPrivate(method2.getAccessFlags()) && cstMethodRef.getNat().equals(method2.getNat())) {
                                        return 52;
                                    }
                                }
                                return 50;
                            case 183:
                                CstMethodRef cstMethodRef2 = (CstMethodRef) constant;
                                if (cstMethodRef2.isInstanceInit() || cstMethodRef2.getDefiningClass().equals(this.method.getDefiningClass()) || !this.method.getAccSuper()) {
                                    return 52;
                                }
                                return 51;
                            case 184:
                                return 49;
                            case 185:
                                return 53;
                            default:
                                switch (i) {
                                    case 187:
                                        return 40;
                                    case 188:
                                    case 189:
                                        return 41;
                                    case 190:
                                        return 34;
                                    case 191:
                                        return 35;
                                    case 192:
                                        return 43;
                                    case 193:
                                        return 44;
                                    case 194:
                                        return 36;
                                    case 195:
                                        return 37;
                                    default:
                                        throw new RuntimeException("shouldn't happen");
                                }
                        }
                }
        }
    }

    private void updateReturnOp(Rop rop, SourcePosition sourcePosition) {
        Objects.requireNonNull(rop, "op == null");
        Objects.requireNonNull(sourcePosition, "pos == null");
        Rop rop2 = this.returnOp;
        if (rop2 == null) {
            this.returnOp = rop;
            this.returnPosition = sourcePosition;
        } else if (rop2 != rop) {
            throw new SimException("return op mismatch: " + rop + ", " + this.returnOp);
        } else if (sourcePosition.getLine() > this.returnPosition.getLine()) {
            this.returnPosition = sourcePosition;
        }
    }

    public boolean canThrow() {
        return this.blockCanThrow;
    }

    public int getExtraBlockCount() {
        return this.extraBlockCount;
    }

    public ArrayList<Insn> getInsns() {
        return this.insns;
    }

    public int getPrimarySuccessorIndex() {
        return this.primarySuccessorIndex;
    }

    public ReturnAddress getReturnAddress() {
        return this.returnAddress;
    }

    public Rop getReturnOp() {
        return this.returnOp;
    }

    public SourcePosition getReturnPosition() {
        return this.returnPosition;
    }

    public boolean hasJsr() {
        return this.hasJsr;
    }

    public boolean hasRet() {
        return this.returnAddress != null;
    }

    public boolean returns() {
        return this.returns;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: com.android.dx.rop.code.ThrowingInsn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: com.android.dx.rop.code.PlainInsn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: com.android.dx.rop.type.TypeBearer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: com.android.dx.rop.type.TypeBearer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: com.android.dx.rop.cst.Constant} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: com.android.dx.rop.cst.Constant} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: com.android.dx.rop.cst.CstType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: com.android.dx.rop.code.PlainInsn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v57, resolved type: com.android.dx.rop.code.SwitchInsn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v58, resolved type: com.android.dx.rop.code.SwitchInsn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v59, resolved type: com.android.dx.rop.code.SwitchInsn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v26, resolved type: com.android.dx.rop.code.SwitchInsn} */
    /* JADX WARNING: type inference failed for: r2v3, types: [com.android.dx.rop.code.Insn, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r0v17 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r0v38 */
    /* JADX WARNING: type inference failed for: r10v24, types: [com.android.dx.rop.code.PlainCstInsn] */
    /* JADX WARNING: type inference failed for: r10v25, types: [com.android.dx.rop.code.ThrowingCstInsn] */
    /* JADX WARNING: type inference failed for: r0v39 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01de A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0310  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run(com.android.p023dx.p024cf.code.Frame r19, int r20, int r21) {
        /*
            r18 = this;
            r1 = r18
            r0 = r21
            int r2 = r1.maxLocals
            com.android.dx.cf.code.ExecutionStack r3 = r19.getStack()
            int r3 = r3.size()
            int r2 = r2 + r3
            com.android.dx.rop.code.RegisterSpecList r6 = r1.getSources(r0, r2)
            int r9 = r6.size()
            super.run(r19, r20, r21)
            com.android.dx.cf.code.ConcreteMethod r3 = r1.method
            r4 = r20
            com.android.dx.rop.code.SourcePosition r15 = r3.makeSourcePosistion(r4)
            r14 = 0
            r13 = 1
            r3 = 54
            if (r0 != r3) goto L_0x002a
            r3 = 1
            goto L_0x002b
        L_0x002a:
            r3 = 0
        L_0x002b:
            com.android.dx.rop.code.RegisterSpec r3 = r1.getLocalTarget(r3)
            int r4 = r18.resultCount()
            if (r4 != 0) goto L_0x0040
            r2 = 87
            if (r0 == r2) goto L_0x003f
            r2 = 88
            if (r0 == r2) goto L_0x003f
            r2 = 0
            goto L_0x004f
        L_0x003f:
            return
        L_0x0040:
            if (r3 == 0) goto L_0x0044
        L_0x0042:
            r2 = r3
            goto L_0x004f
        L_0x0044:
            if (r4 != r13) goto L_0x0335
            com.android.dx.rop.type.TypeBearer r3 = r1.result(r14)
            com.android.dx.rop.code.RegisterSpec r3 = com.android.p023dx.rop.code.RegisterSpec.make(r2, r3)
            goto L_0x0042
        L_0x004f:
            if (r2 == 0) goto L_0x0053
            r11 = r2
            goto L_0x0056
        L_0x0053:
            com.android.dx.rop.type.Type r3 = com.android.p023dx.rop.type.Type.VOID
            r11 = r3
        L_0x0056:
            com.android.dx.rop.cst.Constant r10 = r18.getAuxCst()
            r3 = 197(0xc5, float:2.76E-43)
            if (r0 != r3) goto L_0x015b
            r1.blockCanThrow = r13
            r0 = 6
            r1.extraBlockCount = r0
            int r0 = r2.getNextReg()
            com.android.dx.rop.type.Type r8 = com.android.p023dx.rop.type.Type.INT_ARRAY
            com.android.dx.rop.code.RegisterSpec r0 = com.android.p023dx.rop.code.RegisterSpec.make(r0, r8)
            com.android.dx.rop.code.Rop r4 = com.android.p023dx.rop.code.Rops.opFilledNewArray(r8, r9)
            com.android.dx.rop.code.ThrowingCstInsn r7 = new com.android.dx.rop.code.ThrowingCstInsn
            com.android.dx.rop.type.TypeList r5 = r1.catches
            com.android.dx.rop.cst.CstType r16 = com.android.p023dx.rop.cst.CstType.INT_ARRAY
            r3 = r7
            r17 = r5
            r5 = r15
            r12 = r7
            r7 = r17
            r17 = r8
            r8 = r16
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.ArrayList<com.android.dx.rop.code.Insn> r3 = r1.insns
            r3.add(r12)
            com.android.dx.rop.code.Rop r3 = com.android.p023dx.rop.code.Rops.opMoveResult(r17)
            com.android.dx.rop.code.PlainInsn r4 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.code.RegisterSpecList r5 = com.android.p023dx.rop.code.RegisterSpecList.EMPTY
            r4.<init>((com.android.p023dx.rop.code.Rop) r3, (com.android.p023dx.rop.code.SourcePosition) r15, (com.android.p023dx.rop.code.RegisterSpec) r0, (com.android.p023dx.rop.code.RegisterSpecList) r5)
            java.util.ArrayList<com.android.dx.rop.code.Insn> r3 = r1.insns
            r3.add(r4)
            r3 = r10
            com.android.dx.rop.cst.CstType r3 = (com.android.p023dx.rop.cst.CstType) r3
            com.android.dx.rop.type.Type r3 = r3.getClassType()
            r4 = 0
        L_0x00a2:
            if (r4 >= r9) goto L_0x00ab
            com.android.dx.rop.type.Type r3 = r3.getComponentType()
            int r4 = r4 + 1
            goto L_0x00a2
        L_0x00ab:
            int r4 = r2.getReg()
            com.android.dx.rop.type.Type r5 = com.android.p023dx.rop.type.Type.CLASS
            com.android.dx.rop.code.RegisterSpec r4 = com.android.p023dx.rop.code.RegisterSpec.make(r4, r5)
            boolean r5 = r3.isPrimitive()
            if (r5 == 0) goto L_0x00dd
            com.android.dx.rop.cst.CstFieldRef r3 = com.android.p023dx.rop.cst.CstFieldRef.forPrimitiveType(r3)
            com.android.dx.rop.code.ThrowingCstInsn r5 = new com.android.dx.rop.code.ThrowingCstInsn
            com.android.dx.rop.code.Rop r6 = com.android.p023dx.rop.code.Rops.GET_STATIC_OBJECT
            com.android.dx.rop.code.RegisterSpecList r7 = com.android.p023dx.rop.code.RegisterSpecList.EMPTY
            com.android.dx.rop.type.TypeList r8 = r1.catches
            r12 = r10
            r10 = r5
            r20 = r5
            r5 = r11
            r11 = r6
            r6 = r12
            r12 = r15
            r16 = r9
            r9 = 1
            r13 = r7
            r7 = 0
            r14 = r8
            r8 = r15
            r15 = r3
            r10.<init>(r11, r12, r13, r14, r15)
            r3 = r20
            goto L_0x00f9
        L_0x00dd:
            r16 = r9
            r6 = r10
            r5 = r11
            r8 = r15
            r7 = 0
            r9 = 1
            com.android.dx.rop.code.ThrowingCstInsn r17 = new com.android.dx.rop.code.ThrowingCstInsn
            com.android.dx.rop.code.Rop r11 = com.android.p023dx.rop.code.Rops.CONST_OBJECT
            com.android.dx.rop.code.RegisterSpecList r13 = com.android.p023dx.rop.code.RegisterSpecList.EMPTY
            com.android.dx.rop.type.TypeList r14 = r1.catches
            com.android.dx.rop.cst.CstType r15 = new com.android.dx.rop.cst.CstType
            r15.<init>(r3)
            r10 = r17
            r12 = r8
            r10.<init>(r11, r12, r13, r14, r15)
            r3 = r17
        L_0x00f9:
            java.util.ArrayList<com.android.dx.rop.code.Insn> r10 = r1.insns
            r10.add(r3)
            com.android.dx.rop.type.Type r3 = r4.getType()
            com.android.dx.rop.code.Rop r3 = com.android.p023dx.rop.code.Rops.opMoveResultPseudo(r3)
            com.android.dx.rop.code.PlainInsn r10 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.code.RegisterSpecList r15 = com.android.p023dx.rop.code.RegisterSpecList.EMPTY
            r10.<init>((com.android.p023dx.rop.code.Rop) r3, (com.android.p023dx.rop.code.SourcePosition) r8, (com.android.p023dx.rop.code.RegisterSpec) r4, (com.android.p023dx.rop.code.RegisterSpecList) r15)
            java.util.ArrayList<com.android.dx.rop.code.Insn> r3 = r1.insns
            r3.add(r10)
            int r3 = r2.getReg()
            com.android.dx.rop.type.Type r10 = com.android.p023dx.rop.type.Type.OBJECT
            com.android.dx.rop.code.RegisterSpec r3 = com.android.p023dx.rop.code.RegisterSpec.make(r3, r10)
            com.android.dx.rop.code.ThrowingCstInsn r14 = new com.android.dx.rop.code.ThrowingCstInsn
            com.android.dx.rop.cst.CstMethodRef r17 = MULTIANEWARRAY_METHOD
            com.android.dx.rop.type.Prototype r10 = r17.getPrototype()
            com.android.dx.rop.code.Rop r11 = com.android.p023dx.rop.code.Rops.opInvokeStatic(r10)
            com.android.dx.rop.code.RegisterSpecList r13 = com.android.p023dx.rop.code.RegisterSpecList.make(r4, r0)
            com.android.dx.rop.type.TypeList r0 = r1.catches
            r10 = r14
            r12 = r8
            r4 = r14
            r14 = r0
            r0 = r15
            r15 = r17
            r10.<init>(r11, r12, r13, r14, r15)
            java.util.ArrayList<com.android.dx.rop.code.Insn> r10 = r1.insns
            r10.add(r4)
            com.android.dx.rop.type.Prototype r4 = r17.getPrototype()
            com.android.dx.rop.type.Type r4 = r4.getReturnType()
            com.android.dx.rop.code.Rop r4 = com.android.p023dx.rop.code.Rops.opMoveResult(r4)
            com.android.dx.rop.code.PlainInsn r10 = new com.android.dx.rop.code.PlainInsn
            r10.<init>((com.android.p023dx.rop.code.Rop) r4, (com.android.p023dx.rop.code.SourcePosition) r8, (com.android.p023dx.rop.code.RegisterSpec) r3, (com.android.p023dx.rop.code.RegisterSpecList) r0)
            java.util.ArrayList<com.android.dx.rop.code.Insn> r0 = r1.insns
            r0.add(r10)
            r0 = 192(0xc0, float:2.69E-43)
            com.android.dx.rop.code.RegisterSpecList r3 = com.android.p023dx.rop.code.RegisterSpecList.make(r3)
            r4 = 0
            goto L_0x0181
        L_0x015b:
            r3 = r6
            r16 = r9
            r6 = r10
            r5 = r11
            r8 = r15
            r4 = 0
            r7 = 0
            r9 = 1
            r10 = 168(0xa8, float:2.35E-43)
            if (r0 != r10) goto L_0x016b
            r1.hasJsr = r9
            return
        L_0x016b:
            r10 = 169(0xa9, float:2.37E-43)
            if (r0 != r10) goto L_0x0181
            com.android.dx.rop.type.TypeBearer r0 = r1.arg(r7)     // Catch:{ ClassCastException -> 0x0178 }
            com.android.dx.cf.code.ReturnAddress r0 = (com.android.p023dx.p024cf.code.ReturnAddress) r0     // Catch:{ ClassCastException -> 0x0178 }
            r1.returnAddress = r0     // Catch:{ ClassCastException -> 0x0178 }
            return
        L_0x0178:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Argument to RET was not a ReturnAddress"
            r2.<init>(r3, r0)
            throw r2
        L_0x0181:
            int r10 = r1.jopToRopOpcode(r0, r6)
            com.android.dx.rop.code.Rop r11 = com.android.p023dx.rop.code.Rops.ropFor(r10, r5, r3, r6)
            if (r2 == 0) goto L_0x01af
            boolean r12 = r11.isCallLike()
            if (r12 == 0) goto L_0x01af
            int r12 = r1.extraBlockCount
            int r12 = r12 + r9
            r1.extraBlockCount = r12
            com.android.dx.rop.code.PlainInsn r12 = new com.android.dx.rop.code.PlainInsn
            r13 = r6
            com.android.dx.rop.cst.CstMethodRef r13 = (com.android.p023dx.rop.cst.CstMethodRef) r13
            com.android.dx.rop.type.Prototype r13 = r13.getPrototype()
            com.android.dx.rop.type.Type r13 = r13.getReturnType()
            com.android.dx.rop.code.Rop r13 = com.android.p023dx.rop.code.Rops.opMoveResult(r13)
            com.android.dx.rop.code.RegisterSpecList r14 = com.android.p023dx.rop.code.RegisterSpecList.EMPTY
            r12.<init>((com.android.p023dx.rop.code.Rop) r13, (com.android.p023dx.rop.code.SourcePosition) r8, (com.android.p023dx.rop.code.RegisterSpec) r2, (com.android.p023dx.rop.code.RegisterSpecList) r14)
        L_0x01ac:
            r13 = r4
            r2 = r12
            goto L_0x01ce
        L_0x01af:
            if (r2 == 0) goto L_0x01cc
            boolean r12 = r11.canThrow()
            if (r12 == 0) goto L_0x01cc
            int r12 = r1.extraBlockCount
            int r12 = r12 + r9
            r1.extraBlockCount = r12
            com.android.dx.rop.code.PlainInsn r12 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.type.TypeBearer r13 = r2.getTypeBearer()
            com.android.dx.rop.code.Rop r13 = com.android.p023dx.rop.code.Rops.opMoveResultPseudo(r13)
            com.android.dx.rop.code.RegisterSpecList r14 = com.android.p023dx.rop.code.RegisterSpecList.EMPTY
            r12.<init>((com.android.p023dx.rop.code.Rop) r13, (com.android.p023dx.rop.code.SourcePosition) r8, (com.android.p023dx.rop.code.RegisterSpec) r2, (com.android.p023dx.rop.code.RegisterSpecList) r14)
            goto L_0x01ac
        L_0x01cc:
            r13 = r2
            r2 = r4
        L_0x01ce:
            r12 = 41
            if (r10 != r12) goto L_0x01de
            com.android.dx.rop.type.Type r5 = r11.getResult()
            com.android.dx.rop.cst.CstType r5 = com.android.p023dx.rop.cst.CstType.intern(r5)
            r14 = r3
            r4 = r5
            goto L_0x0247
        L_0x01de:
            if (r6 != 0) goto L_0x0245
            r12 = 2
            r14 = r16
            if (r14 != r12) goto L_0x0245
            com.android.dx.rop.code.RegisterSpec r12 = r3.get(r7)
            com.android.dx.rop.type.TypeBearer r12 = r12.getTypeBearer()
            com.android.dx.rop.code.RegisterSpec r14 = r3.get(r9)
            com.android.dx.rop.type.TypeBearer r14 = r14.getTypeBearer()
            boolean r15 = r14.isConstant()
            if (r15 != 0) goto L_0x0201
            boolean r15 = r12.isConstant()
            if (r15 == 0) goto L_0x0245
        L_0x0201:
            com.android.dx.rop.code.TranslationAdvice r15 = r1.advice
            com.android.dx.rop.code.RegisterSpec r4 = r3.get(r7)
            com.android.dx.rop.code.RegisterSpec r7 = r3.get(r9)
            boolean r4 = r15.hasConstantOperation(r11, r4, r7)
            if (r4 == 0) goto L_0x0245
            boolean r4 = r14.isConstant()
            if (r4 == 0) goto L_0x0237
            r4 = r14
            com.android.dx.rop.cst.Constant r4 = (com.android.p023dx.rop.cst.Constant) r4
            com.android.dx.rop.code.RegisterSpecList r3 = r3.withoutLast()
            int r6 = r11.getOpcode()
            r7 = 15
            if (r6 != r7) goto L_0x023e
            r4 = 14
            com.android.dx.rop.cst.CstInteger r14 = (com.android.p023dx.rop.cst.CstInteger) r14
            int r6 = r14.getValue()
            int r6 = -r6
            com.android.dx.rop.cst.CstInteger r6 = com.android.p023dx.rop.cst.CstInteger.make(r6)
            r4 = r6
            r10 = 14
            goto L_0x023e
        L_0x0237:
            r4 = r12
            com.android.dx.rop.cst.Constant r4 = (com.android.p023dx.rop.cst.Constant) r4
            com.android.dx.rop.code.RegisterSpecList r3 = r3.withoutFirst()
        L_0x023e:
            com.android.dx.rop.code.Rop r5 = com.android.p023dx.rop.code.Rops.ropFor(r10, r5, r3, r4)
            r14 = r3
            r11 = r5
            goto L_0x0247
        L_0x0245:
            r14 = r3
            r4 = r6
        L_0x0247:
            com.android.dx.cf.code.SwitchList r3 = r18.getAuxCases()
            java.util.ArrayList r5 = r18.getInitValues()
            boolean r6 = r11.canThrow()
            boolean r7 = r1.blockCanThrow
            r7 = r7 | r6
            r1.blockCanThrow = r7
            if (r3 == 0) goto L_0x0284
            int r0 = r3.size()
            if (r0 != 0) goto L_0x026f
            com.android.dx.rop.code.PlainInsn r0 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.code.Rop r3 = com.android.p023dx.rop.code.Rops.GOTO
            com.android.dx.rop.code.RegisterSpecList r6 = com.android.p023dx.rop.code.RegisterSpecList.EMPTY
            r7 = 0
            r0.<init>((com.android.p023dx.rop.code.Rop) r3, (com.android.p023dx.rop.code.SourcePosition) r8, (com.android.p023dx.rop.code.RegisterSpec) r7, (com.android.p023dx.rop.code.RegisterSpecList) r6)
            r3 = 0
            r1.primarySuccessorIndex = r3
            goto L_0x0309
        L_0x026f:
            com.android.dx.util.IntList r0 = r3.getValues()
            com.android.dx.rop.code.SwitchInsn r3 = new com.android.dx.rop.code.SwitchInsn
            r10 = r3
            r12 = r8
            r15 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            int r0 = r0.size()
            r1.primarySuccessorIndex = r0
        L_0x0281:
            r0 = r3
            goto L_0x0309
        L_0x0284:
            r3 = 33
            if (r10 != r3) goto L_0x02c3
            int r0 = r14.size()
            if (r0 == 0) goto L_0x02b0
            r0 = 0
            com.android.dx.rop.code.RegisterSpec r3 = r14.get(r0)
            com.android.dx.rop.type.TypeBearer r6 = r3.getTypeBearer()
            int r7 = r3.getReg()
            if (r7 == 0) goto L_0x02b1
            java.util.ArrayList<com.android.dx.rop.code.Insn> r7 = r1.insns
            com.android.dx.rop.code.PlainInsn r10 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.code.Rop r12 = com.android.p023dx.rop.code.Rops.opMove(r6)
            com.android.dx.rop.code.RegisterSpec r6 = com.android.p023dx.rop.code.RegisterSpec.make(r0, r6)
            r10.<init>((com.android.p023dx.rop.code.Rop) r12, (com.android.p023dx.rop.code.SourcePosition) r8, (com.android.p023dx.rop.code.RegisterSpec) r6, (com.android.p023dx.rop.code.RegisterSpec) r3)
            r7.add(r10)
            goto L_0x02b1
        L_0x02b0:
            r0 = 0
        L_0x02b1:
            com.android.dx.rop.code.PlainInsn r3 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.code.Rop r6 = com.android.p023dx.rop.code.Rops.GOTO
            com.android.dx.rop.code.RegisterSpecList r7 = com.android.p023dx.rop.code.RegisterSpecList.EMPTY
            r10 = 0
            r3.<init>((com.android.p023dx.rop.code.Rop) r6, (com.android.p023dx.rop.code.SourcePosition) r8, (com.android.p023dx.rop.code.RegisterSpec) r10, (com.android.p023dx.rop.code.RegisterSpecList) r7)
            r1.primarySuccessorIndex = r0
            r1.updateReturnOp(r11, r8)
            r1.returns = r9
            goto L_0x0281
        L_0x02c3:
            if (r4 == 0) goto L_0x02e7
            if (r6 == 0) goto L_0x02de
            com.android.dx.rop.code.ThrowingCstInsn r0 = new com.android.dx.rop.code.ThrowingCstInsn
            com.android.dx.rop.type.TypeList r3 = r1.catches
            r10 = r0
            r12 = r8
            r13 = r14
            r14 = r3
            r15 = r4
            r10.<init>(r11, r12, r13, r14, r15)
            r1.catchesUsed = r9
            com.android.dx.rop.type.TypeList r3 = r1.catches
            int r3 = r3.size()
            r1.primarySuccessorIndex = r3
            goto L_0x0309
        L_0x02de:
            com.android.dx.rop.code.PlainCstInsn r0 = new com.android.dx.rop.code.PlainCstInsn
            r10 = r0
            r12 = r8
            r15 = r4
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x0309
        L_0x02e7:
            if (r6 == 0) goto L_0x0304
            com.android.dx.rop.code.ThrowingInsn r3 = new com.android.dx.rop.code.ThrowingInsn
            com.android.dx.rop.type.TypeList r6 = r1.catches
            r3.<init>(r11, r8, r14, r6)
            r1.catchesUsed = r9
            r6 = 191(0xbf, float:2.68E-43)
            if (r0 != r6) goto L_0x02fa
            r0 = -1
            r1.primarySuccessorIndex = r0
            goto L_0x0281
        L_0x02fa:
            com.android.dx.rop.type.TypeList r0 = r1.catches
            int r0 = r0.size()
            r1.primarySuccessorIndex = r0
            goto L_0x0281
        L_0x0304:
            com.android.dx.rop.code.PlainInsn r0 = new com.android.dx.rop.code.PlainInsn
            r0.<init>((com.android.p023dx.rop.code.Rop) r11, (com.android.p023dx.rop.code.SourcePosition) r8, (com.android.p023dx.rop.code.RegisterSpec) r13, (com.android.p023dx.rop.code.RegisterSpecList) r14)
        L_0x0309:
            java.util.ArrayList<com.android.dx.rop.code.Insn> r3 = r1.insns
            r3.add(r0)
            if (r2 == 0) goto L_0x0315
            java.util.ArrayList<com.android.dx.rop.code.Insn> r0 = r1.insns
            r0.add(r2)
        L_0x0315:
            if (r5 == 0) goto L_0x0334
            int r0 = r1.extraBlockCount
            int r0 = r0 + r9
            r1.extraBlockCount = r0
            com.android.dx.rop.code.FillArrayDataInsn r0 = new com.android.dx.rop.code.FillArrayDataInsn
            com.android.dx.rop.code.Rop r11 = com.android.p023dx.rop.code.Rops.FILL_ARRAY_DATA
            com.android.dx.rop.code.RegisterSpec r2 = r2.getResult()
            com.android.dx.rop.code.RegisterSpecList r13 = com.android.p023dx.rop.code.RegisterSpecList.make(r2)
            r10 = r0
            r12 = r8
            r14 = r5
            r15 = r4
            r10.<init>(r11, r12, r13, r14, r15)
            java.util.ArrayList<com.android.dx.rop.code.Insn> r2 = r1.insns
            r2.add(r0)
        L_0x0334:
            return
        L_0x0335:
            r3 = r6
            r14 = r9
            r8 = r15
            r0 = 0
            r9 = 1
            com.android.dx.cf.code.Ropper r4 = r1.ropper
            int r4 = r4.getFirstTempStackReg()
            com.android.dx.rop.code.RegisterSpec[] r5 = new com.android.p023dx.rop.code.RegisterSpec[r14]
        L_0x0342:
            if (r0 >= r14) goto L_0x0368
            com.android.dx.rop.code.RegisterSpec r6 = r3.get(r0)
            com.android.dx.rop.type.TypeBearer r7 = r6.getTypeBearer()
            com.android.dx.rop.code.RegisterSpec r10 = r6.withReg(r4)
            java.util.ArrayList<com.android.dx.rop.code.Insn> r11 = r1.insns
            com.android.dx.rop.code.PlainInsn r12 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.code.Rop r7 = com.android.p023dx.rop.code.Rops.opMove(r7)
            r12.<init>((com.android.p023dx.rop.code.Rop) r7, (com.android.p023dx.rop.code.SourcePosition) r8, (com.android.p023dx.rop.code.RegisterSpec) r10, (com.android.p023dx.rop.code.RegisterSpec) r6)
            r11.add(r12)
            r5[r0] = r10
            int r6 = r6.getCategory()
            int r4 = r4 + r6
            int r0 = r0 + 1
            goto L_0x0342
        L_0x0368:
            int r0 = r18.getAuxInt()
        L_0x036c:
            if (r0 == 0) goto L_0x0395
            r3 = r0 & 15
            int r3 = r3 - r9
            r3 = r5[r3]
            com.android.dx.rop.type.TypeBearer r4 = r3.getTypeBearer()
            java.util.ArrayList<com.android.dx.rop.code.Insn> r6 = r1.insns
            com.android.dx.rop.code.PlainInsn r7 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.code.Rop r10 = com.android.p023dx.rop.code.Rops.opMove(r4)
            com.android.dx.rop.code.RegisterSpec r11 = r3.withReg(r2)
            r7.<init>((com.android.p023dx.rop.code.Rop) r10, (com.android.p023dx.rop.code.SourcePosition) r8, (com.android.p023dx.rop.code.RegisterSpec) r11, (com.android.p023dx.rop.code.RegisterSpec) r3)
            r6.add(r7)
            com.android.dx.rop.type.Type r3 = r4.getType()
            int r3 = r3.getCategory()
            int r2 = r2 + r3
            int r0 = r0 >> 4
            goto L_0x036c
        L_0x0395:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.p024cf.code.RopperMachine.run(com.android.dx.cf.code.Frame, int, int):void");
    }

    public void startBlock(TypeList typeList) {
        this.catches = typeList;
        this.insns.clear();
        this.catchesUsed = false;
        this.returns = false;
        this.primarySuccessorIndex = 0;
        this.extraBlockCount = 0;
        this.blockCanThrow = false;
        this.hasJsr = false;
        this.returnAddress = null;
    }

    public boolean wereCatchesUsed() {
        return this.catchesUsed;
    }
}

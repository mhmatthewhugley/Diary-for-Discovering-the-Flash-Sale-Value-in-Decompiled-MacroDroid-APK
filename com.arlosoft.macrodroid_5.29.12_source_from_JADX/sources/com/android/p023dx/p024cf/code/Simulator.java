package com.android.p023dx.p024cf.code;

import com.android.p023dx.p024cf.code.BytecodeArray;
import com.android.p023dx.p024cf.code.LocalVariableList;
import com.android.p023dx.rop.code.LocalItem;
import com.android.p023dx.rop.cst.Constant;
import com.android.p023dx.rop.cst.CstInteger;
import com.android.p023dx.rop.cst.CstType;
import com.android.p023dx.rop.type.Type;
import com.android.p023dx.util.Hex;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: com.android.dx.cf.code.Simulator */
public class Simulator {
    private static final String LOCAL_MISMATCH_ERROR = "This is symptomatic of .class transformation tools that ignore local variable information.";
    private final BytecodeArray code;
    /* access modifiers changed from: private */
    public final LocalVariableList localVariables;
    /* access modifiers changed from: private */
    public final Machine machine;
    private final SimVisitor visitor = new SimVisitor();

    /* renamed from: com.android.dx.cf.code.Simulator$SimVisitor */
    private class SimVisitor implements BytecodeArray.Visitor {
        private Frame frame = null;
        private final Machine machine;
        private int previousOffset;

        public SimVisitor() {
            this.machine = Simulator.this.machine;
        }

        private void checkReturnType(Type type) {
            Type returnType = this.machine.getPrototype().getReturnType();
            if (!Merger.isPossiblyAssignableFrom(returnType, type)) {
                throw new SimException("return type mismatch: prototype indicates " + returnType.toHuman() + ", but encountered type " + type.toHuman());
            }
        }

        public int getPreviousOffset() {
            return this.previousOffset;
        }

        public void setFrame(Frame frame2) {
            Objects.requireNonNull(frame2, "frame == null");
            this.frame = frame2;
        }

        public void setPreviousOffset(int i) {
            this.previousOffset = i;
        }

        public void visitBranch(int i, int i2, int i3, int i4) {
            switch (i) {
                case 153:
                case 154:
                case 155:
                case 156:
                case 157:
                case 158:
                    this.machine.popArgs(this.frame, Type.INT);
                    break;
                case 159:
                case 160:
                case 161:
                case 162:
                case 163:
                case 164:
                    Machine machine2 = this.machine;
                    Frame frame2 = this.frame;
                    Type type = Type.INT;
                    machine2.popArgs(frame2, type, type);
                    break;
                case 165:
                case 166:
                    Machine machine3 = this.machine;
                    Frame frame3 = this.frame;
                    Type type2 = Type.OBJECT;
                    machine3.popArgs(frame3, type2, type2);
                    break;
                case 167:
                case 168:
                    this.machine.clearArgs();
                    break;
                default:
                    switch (i) {
                        case 198:
                        case 199:
                            this.machine.popArgs(this.frame, Type.OBJECT);
                            break;
                        case 200:
                        case 201:
                            break;
                        default:
                            visitInvalid(i, i2, i3);
                            return;
                    }
                    this.machine.clearArgs();
                    break;
            }
            this.machine.auxTargetArg(i4);
            this.machine.run(this.frame, i2, i);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
            r3.machine.popArgs(r3.frame, ((com.android.p023dx.rop.cst.CstMethodRef) r7).getPrototype(false));
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void visitConstant(int r4, int r5, int r6, com.android.p023dx.rop.cst.Constant r7, int r8) {
            /*
                r3 = this;
                r6 = 189(0xbd, float:2.65E-43)
                if (r4 == r6) goto L_0x0078
                r6 = 197(0xc5, float:2.76E-43)
                if (r4 == r6) goto L_0x006a
                r6 = 192(0xc0, float:2.69E-43)
                if (r4 == r6) goto L_0x0060
                r6 = 193(0xc1, float:2.7E-43)
                if (r4 == r6) goto L_0x0060
                switch(r4) {
                    case 179: goto L_0x0051;
                    case 180: goto L_0x0060;
                    case 181: goto L_0x0040;
                    case 182: goto L_0x0030;
                    case 183: goto L_0x0030;
                    case 184: goto L_0x0020;
                    case 185: goto L_0x0019;
                    default: goto L_0x0013;
                }
            L_0x0013:
                com.android.dx.cf.code.Machine r6 = r3.machine
                r6.clearArgs()
                goto L_0x0081
            L_0x0019:
                com.android.dx.rop.cst.CstInterfaceMethodRef r7 = (com.android.p023dx.rop.cst.CstInterfaceMethodRef) r7
                com.android.dx.rop.cst.CstMethodRef r7 = r7.toMethodRef()
                goto L_0x0030
            L_0x0020:
                r6 = r7
                com.android.dx.rop.cst.CstMethodRef r6 = (com.android.p023dx.rop.cst.CstMethodRef) r6
                r0 = 1
                com.android.dx.rop.type.Prototype r6 = r6.getPrototype(r0)
                com.android.dx.cf.code.Machine r0 = r3.machine
                com.android.dx.cf.code.Frame r1 = r3.frame
                r0.popArgs((com.android.p023dx.p024cf.code.Frame) r1, (com.android.p023dx.rop.type.Prototype) r6)
                goto L_0x0081
            L_0x0030:
                r6 = r7
                com.android.dx.rop.cst.CstMethodRef r6 = (com.android.p023dx.rop.cst.CstMethodRef) r6
                r0 = 0
                com.android.dx.rop.type.Prototype r6 = r6.getPrototype(r0)
                com.android.dx.cf.code.Machine r0 = r3.machine
                com.android.dx.cf.code.Frame r1 = r3.frame
                r0.popArgs((com.android.p023dx.p024cf.code.Frame) r1, (com.android.p023dx.rop.type.Prototype) r6)
                goto L_0x0081
            L_0x0040:
                r6 = r7
                com.android.dx.rop.cst.CstFieldRef r6 = (com.android.p023dx.rop.cst.CstFieldRef) r6
                com.android.dx.rop.type.Type r6 = r6.getType()
                com.android.dx.cf.code.Machine r0 = r3.machine
                com.android.dx.cf.code.Frame r1 = r3.frame
                com.android.dx.rop.type.Type r2 = com.android.p023dx.rop.type.Type.OBJECT
                r0.popArgs(r1, r2, r6)
                goto L_0x0081
            L_0x0051:
                r6 = r7
                com.android.dx.rop.cst.CstFieldRef r6 = (com.android.p023dx.rop.cst.CstFieldRef) r6
                com.android.dx.rop.type.Type r6 = r6.getType()
                com.android.dx.cf.code.Machine r0 = r3.machine
                com.android.dx.cf.code.Frame r1 = r3.frame
                r0.popArgs((com.android.p023dx.p024cf.code.Frame) r1, (com.android.p023dx.rop.type.Type) r6)
                goto L_0x0081
            L_0x0060:
                com.android.dx.cf.code.Machine r6 = r3.machine
                com.android.dx.cf.code.Frame r0 = r3.frame
                com.android.dx.rop.type.Type r1 = com.android.p023dx.rop.type.Type.OBJECT
                r6.popArgs((com.android.p023dx.p024cf.code.Frame) r0, (com.android.p023dx.rop.type.Type) r1)
                goto L_0x0081
            L_0x006a:
                com.android.dx.rop.type.Type r6 = com.android.p023dx.rop.type.Type.VOID
                com.android.dx.rop.type.Prototype r6 = com.android.p023dx.rop.type.Prototype.internInts(r6, r8)
                com.android.dx.cf.code.Machine r0 = r3.machine
                com.android.dx.cf.code.Frame r1 = r3.frame
                r0.popArgs((com.android.p023dx.p024cf.code.Frame) r1, (com.android.p023dx.rop.type.Prototype) r6)
                goto L_0x0081
            L_0x0078:
                com.android.dx.cf.code.Machine r6 = r3.machine
                com.android.dx.cf.code.Frame r0 = r3.frame
                com.android.dx.rop.type.Type r1 = com.android.p023dx.rop.type.Type.INT
                r6.popArgs((com.android.p023dx.p024cf.code.Frame) r0, (com.android.p023dx.rop.type.Type) r1)
            L_0x0081:
                com.android.dx.cf.code.Machine r6 = r3.machine
                r6.auxIntArg(r8)
                com.android.dx.cf.code.Machine r6 = r3.machine
                r6.auxCstArg(r7)
                com.android.dx.cf.code.Machine r6 = r3.machine
                com.android.dx.cf.code.Frame r7 = r3.frame
                r6.run(r7, r5, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.p024cf.code.Simulator.SimVisitor.visitConstant(int, int, int, com.android.dx.rop.cst.Constant, int):void");
        }

        public void visitInvalid(int i, int i2, int i3) {
            throw new SimException("invalid opcode " + Hex.m906u1(i));
        }

        public void visitLocal(int i, int i2, int i3, int i4, Type type, int i5) {
            Type type2;
            LocalVariableList.Item pcAndIndexToLocal = Simulator.this.localVariables.pcAndIndexToLocal(i == 54 ? i2 + i3 : i2, i4);
            if (pcAndIndexToLocal != null) {
                type2 = pcAndIndexToLocal.getType();
                if (type2.getBasicFrameType() != type.getBasicFrameType()) {
                    BaseMachine.throwLocalMismatch(type, type2);
                    return;
                }
            } else {
                type2 = type;
            }
            if (i != 21) {
                LocalItem localItem = null;
                if (i == 54) {
                    if (pcAndIndexToLocal != null) {
                        localItem = pcAndIndexToLocal.getLocalItem();
                    }
                    this.machine.popArgs(this.frame, type);
                    this.machine.auxType(type);
                    this.machine.localTarget(i4, type2, localItem);
                } else if (i == 132) {
                    if (pcAndIndexToLocal != null) {
                        localItem = pcAndIndexToLocal.getLocalItem();
                    }
                    this.machine.localArg(this.frame, i4);
                    this.machine.localTarget(i4, type2, localItem);
                    this.machine.auxType(type);
                    this.machine.auxIntArg(i5);
                    this.machine.auxCstArg(CstInteger.make(i5));
                } else if (i != 169) {
                    visitInvalid(i, i2, i3);
                    return;
                }
                this.machine.run(this.frame, i2, i);
            }
            this.machine.localArg(this.frame, i4);
            this.machine.localInfo(pcAndIndexToLocal != null);
            this.machine.auxType(type);
            this.machine.run(this.frame, i2, i);
        }

        public void visitNewarray(int i, int i2, CstType cstType, ArrayList<Constant> arrayList) {
            this.machine.popArgs(this.frame, Type.INT);
            this.machine.auxInitValues(arrayList);
            this.machine.auxCstArg(cstType);
            this.machine.run(this.frame, i, 188);
        }

        public void visitNoArgs(int i, int i2, int i3, Type type) {
            if (i != 0) {
                if (i != 190) {
                    if (i != 191 && i != 194 && i != 195) {
                        int i4 = 3;
                        switch (i) {
                            case 0:
                                break;
                            case 46:
                                Type access$200 = Simulator.requiredArrayTypeFor(type, this.frame.getStack().peekType(1));
                                type = Type.KNOWN_NULL;
                                if (access$200 != type) {
                                    type = access$200.getComponentType();
                                }
                                this.machine.popArgs(this.frame, access$200, Type.INT);
                                break;
                            case 79:
                                ExecutionStack stack = this.frame.getStack();
                                if (type.isCategory1()) {
                                    i4 = 2;
                                }
                                Type peekType = stack.peekType(i4);
                                boolean peekLocal = stack.peekLocal(i4);
                                Type access$2002 = Simulator.requiredArrayTypeFor(type, peekType);
                                if (peekLocal) {
                                    Type type2 = Type.KNOWN_NULL;
                                    if (access$2002 != type2) {
                                        type2 = access$2002.getComponentType();
                                    }
                                    type = type2;
                                }
                                this.machine.popArgs(this.frame, access$2002, Type.INT, type);
                                break;
                            case 100:
                            case 104:
                            case 108:
                            case 112:
                            case 126:
                            case 128:
                            case 130:
                                this.machine.popArgs(this.frame, type, type);
                                break;
                            case 116:
                                this.machine.popArgs(this.frame, type);
                                break;
                            case 120:
                            case 122:
                            case 124:
                                this.machine.popArgs(this.frame, type, Type.INT);
                                break;
                            case 172:
                                Type peekType2 = type == Type.OBJECT ? this.frame.getStack().peekType(0) : type;
                                this.machine.popArgs(this.frame, type);
                                checkReturnType(peekType2);
                                break;
                            case 177:
                                this.machine.clearArgs();
                                checkReturnType(Type.VOID);
                                break;
                            default:
                                int i5 = 17;
                                switch (i) {
                                    case 87:
                                        if (!this.frame.getStack().peekType(0).isCategory2()) {
                                            this.machine.popArgs(this.frame, 1);
                                            break;
                                        } else {
                                            throw Simulator.illegalTos();
                                        }
                                    case 88:
                                    case 92:
                                        ExecutionStack stack2 = this.frame.getStack();
                                        if (stack2.peekType(0).isCategory2()) {
                                            this.machine.popArgs(this.frame, 1);
                                        } else if (stack2.peekType(1).isCategory1()) {
                                            this.machine.popArgs(this.frame, 2);
                                            i5 = 8481;
                                        } else {
                                            throw Simulator.illegalTos();
                                        }
                                        if (i == 92) {
                                            this.machine.auxIntArg(i5);
                                            break;
                                        }
                                        break;
                                    case 89:
                                        if (!this.frame.getStack().peekType(0).isCategory2()) {
                                            this.machine.popArgs(this.frame, 1);
                                            this.machine.auxIntArg(17);
                                            break;
                                        } else {
                                            throw Simulator.illegalTos();
                                        }
                                    case 90:
                                        ExecutionStack stack3 = this.frame.getStack();
                                        if (stack3.peekType(0).isCategory1() && stack3.peekType(1).isCategory1()) {
                                            this.machine.popArgs(this.frame, 2);
                                            this.machine.auxIntArg(530);
                                            break;
                                        } else {
                                            throw Simulator.illegalTos();
                                        }
                                        break;
                                    case 91:
                                        ExecutionStack stack4 = this.frame.getStack();
                                        if (stack4.peekType(0).isCategory2()) {
                                            throw Simulator.illegalTos();
                                        } else if (stack4.peekType(1).isCategory2()) {
                                            this.machine.popArgs(this.frame, 2);
                                            this.machine.auxIntArg(530);
                                            break;
                                        } else if (stack4.peekType(2).isCategory1()) {
                                            this.machine.popArgs(this.frame, 3);
                                            this.machine.auxIntArg(12819);
                                            break;
                                        } else {
                                            throw Simulator.illegalTos();
                                        }
                                    case 93:
                                        ExecutionStack stack5 = this.frame.getStack();
                                        if (!stack5.peekType(0).isCategory2()) {
                                            if (!stack5.peekType(1).isCategory2() && !stack5.peekType(2).isCategory2()) {
                                                this.machine.popArgs(this.frame, 3);
                                                this.machine.auxIntArg(205106);
                                                break;
                                            } else {
                                                throw Simulator.illegalTos();
                                            }
                                        } else if (!stack5.peekType(2).isCategory2()) {
                                            this.machine.popArgs(this.frame, 2);
                                            this.machine.auxIntArg(530);
                                            break;
                                        } else {
                                            throw Simulator.illegalTos();
                                        }
                                        break;
                                    case 94:
                                        ExecutionStack stack6 = this.frame.getStack();
                                        if (stack6.peekType(0).isCategory2()) {
                                            if (stack6.peekType(2).isCategory2()) {
                                                this.machine.popArgs(this.frame, 2);
                                                this.machine.auxIntArg(530);
                                                break;
                                            } else if (stack6.peekType(3).isCategory1()) {
                                                this.machine.popArgs(this.frame, 3);
                                                this.machine.auxIntArg(12819);
                                                break;
                                            } else {
                                                throw Simulator.illegalTos();
                                            }
                                        } else if (!stack6.peekType(1).isCategory1()) {
                                            throw Simulator.illegalTos();
                                        } else if (stack6.peekType(2).isCategory2()) {
                                            this.machine.popArgs(this.frame, 3);
                                            this.machine.auxIntArg(205106);
                                            break;
                                        } else if (stack6.peekType(3).isCategory1()) {
                                            this.machine.popArgs(this.frame, 4);
                                            this.machine.auxIntArg(4399427);
                                            break;
                                        } else {
                                            throw Simulator.illegalTos();
                                        }
                                    case 95:
                                        ExecutionStack stack7 = this.frame.getStack();
                                        if (stack7.peekType(0).isCategory1() && stack7.peekType(1).isCategory1()) {
                                            this.machine.popArgs(this.frame, 2);
                                            this.machine.auxIntArg(18);
                                            break;
                                        } else {
                                            throw Simulator.illegalTos();
                                        }
                                    case 96:
                                        break;
                                    default:
                                        switch (i) {
                                            case 133:
                                            case 134:
                                            case 135:
                                            case 145:
                                            case 146:
                                            case 147:
                                                this.machine.popArgs(this.frame, Type.INT);
                                                break;
                                            case 136:
                                            case 137:
                                            case 138:
                                                this.machine.popArgs(this.frame, Type.LONG);
                                                break;
                                            case 139:
                                            case 140:
                                            case 141:
                                                this.machine.popArgs(this.frame, Type.FLOAT);
                                                break;
                                            case 142:
                                            case 143:
                                            case 144:
                                                this.machine.popArgs(this.frame, Type.DOUBLE);
                                                break;
                                            case 148:
                                                Machine machine2 = this.machine;
                                                Frame frame2 = this.frame;
                                                Type type3 = Type.LONG;
                                                machine2.popArgs(frame2, type3, type3);
                                                break;
                                            case 149:
                                            case 150:
                                                Machine machine3 = this.machine;
                                                Frame frame3 = this.frame;
                                                Type type4 = Type.FLOAT;
                                                machine3.popArgs(frame3, type4, type4);
                                                break;
                                            case 151:
                                            case 152:
                                                Machine machine4 = this.machine;
                                                Frame frame4 = this.frame;
                                                Type type5 = Type.DOUBLE;
                                                machine4.popArgs(frame4, type5, type5);
                                                break;
                                            default:
                                                visitInvalid(i, i2, i3);
                                                return;
                                        }
                                }
                                this.machine.popArgs(this.frame, type, type);
                                break;
                        }
                    } else {
                        this.machine.popArgs(this.frame, Type.OBJECT);
                    }
                } else {
                    Type peekType3 = this.frame.getStack().peekType(0);
                    if (peekType3.isArrayOrKnownNull()) {
                        this.machine.popArgs(this.frame, Type.OBJECT);
                    } else {
                        throw new SimException("type mismatch: expected array type but encountered " + peekType3.toHuman());
                    }
                }
                this.machine.auxType(type);
                this.machine.run(this.frame, i2, i);
            }
            this.machine.clearArgs();
            this.machine.auxType(type);
            this.machine.run(this.frame, i2, i);
        }

        public void visitSwitch(int i, int i2, int i3, SwitchList switchList, int i4) {
            this.machine.popArgs(this.frame, Type.INT);
            this.machine.auxIntArg(i4);
            this.machine.auxSwitchArg(switchList);
            this.machine.run(this.frame, i2, i);
        }
    }

    public Simulator(Machine machine2, ConcreteMethod concreteMethod) {
        Objects.requireNonNull(machine2, "machine == null");
        Objects.requireNonNull(concreteMethod, "method == null");
        this.machine = machine2;
        this.code = concreteMethod.getCode();
        this.localVariables = concreteMethod.getLocalVariables();
    }

    /* access modifiers changed from: private */
    public static SimException illegalTos() {
        return new SimException("stack mismatch: illegal top-of-stack for opcode");
    }

    /* access modifiers changed from: private */
    public static Type requiredArrayTypeFor(Type type, Type type2) {
        Type type3;
        Type type4 = Type.KNOWN_NULL;
        if (type2 == type4) {
            return type.isReference() ? type4 : type.getArrayType();
        }
        if (type == Type.OBJECT && type2.isArray() && type2.getComponentType().isReference()) {
            return type2;
        }
        if (type == Type.BYTE && type2 == (type3 = Type.BOOLEAN_ARRAY)) {
            return type3;
        }
        return type.getArrayType();
    }

    public void simulate(ByteBlock byteBlock, Frame frame) {
        int end = byteBlock.getEnd();
        this.visitor.setFrame(frame);
        try {
            int start = byteBlock.getStart();
            while (start < end) {
                int parseInstruction = this.code.parseInstruction(start, this.visitor);
                this.visitor.setPreviousOffset(start);
                start += parseInstruction;
            }
        } catch (SimException e) {
            frame.annotate(e);
            throw e;
        }
    }

    public int simulate(int i, Frame frame) {
        this.visitor.setFrame(frame);
        return this.code.parseInstruction(i, this.visitor);
    }
}

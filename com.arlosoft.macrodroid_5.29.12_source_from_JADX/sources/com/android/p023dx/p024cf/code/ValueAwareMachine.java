package com.android.p023dx.p024cf.code;

import com.android.p023dx.rop.type.Prototype;

/* renamed from: com.android.dx.cf.code.ValueAwareMachine */
public class ValueAwareMachine extends BaseMachine {
    public ValueAwareMachine(Prototype prototype) {
        super(prototype);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        setResult(((com.android.p023dx.rop.cst.CstType) getAuxCst()).getClassType());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00dd, code lost:
        setResult(getAuxType());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run(com.android.p023dx.p024cf.code.Frame r3, int r4, int r5) {
        /*
            r2 = this;
            if (r5 == 0) goto L_0x00f7
            r0 = 20
            if (r5 == r0) goto L_0x00ed
            r0 = 21
            r1 = 0
            if (r5 == r0) goto L_0x00e5
            r0 = 171(0xab, float:2.4E-43)
            if (r5 == r0) goto L_0x00f7
            r0 = 172(0xac, float:2.41E-43)
            if (r5 == r0) goto L_0x00f7
            switch(r5) {
                case 0: goto L_0x00f7;
                case 18: goto L_0x00ed;
                case 46: goto L_0x00dd;
                case 54: goto L_0x00e5;
                case 79: goto L_0x00f7;
                case 100: goto L_0x00dd;
                case 104: goto L_0x00dd;
                case 108: goto L_0x00dd;
                case 112: goto L_0x00dd;
                case 116: goto L_0x00dd;
                case 120: goto L_0x00dd;
                case 122: goto L_0x00dd;
                case 124: goto L_0x00dd;
                case 126: goto L_0x00dd;
                case 128: goto L_0x00dd;
                case 130: goto L_0x00dd;
                default: goto L_0x0016;
            }
        L_0x0016:
            switch(r5) {
                case 87: goto L_0x00f7;
                case 88: goto L_0x00f7;
                case 89: goto L_0x00c6;
                case 90: goto L_0x00c6;
                case 91: goto L_0x00c6;
                case 92: goto L_0x00c6;
                case 93: goto L_0x00c6;
                case 94: goto L_0x00c6;
                case 95: goto L_0x00c6;
                case 96: goto L_0x00dd;
                default: goto L_0x0019;
            }
        L_0x0019:
            switch(r5) {
                case 132: goto L_0x00dd;
                case 133: goto L_0x00dd;
                case 134: goto L_0x00dd;
                case 135: goto L_0x00dd;
                case 136: goto L_0x00dd;
                case 137: goto L_0x00dd;
                case 138: goto L_0x00dd;
                case 139: goto L_0x00dd;
                case 140: goto L_0x00dd;
                case 141: goto L_0x00dd;
                case 142: goto L_0x00dd;
                case 143: goto L_0x00dd;
                case 144: goto L_0x00dd;
                case 145: goto L_0x00dd;
                case 146: goto L_0x00dd;
                case 147: goto L_0x00dd;
                case 148: goto L_0x00dd;
                case 149: goto L_0x00dd;
                case 150: goto L_0x00dd;
                case 151: goto L_0x00dd;
                case 152: goto L_0x00dd;
                case 153: goto L_0x00f7;
                case 154: goto L_0x00f7;
                case 155: goto L_0x00f7;
                case 156: goto L_0x00f7;
                case 157: goto L_0x00f7;
                case 158: goto L_0x00f7;
                case 159: goto L_0x00f7;
                case 160: goto L_0x00f7;
                case 161: goto L_0x00f7;
                case 162: goto L_0x00f7;
                case 163: goto L_0x00f7;
                case 164: goto L_0x00f7;
                case 165: goto L_0x00f7;
                case 166: goto L_0x00f7;
                case 167: goto L_0x00f7;
                case 168: goto L_0x00b9;
                case 169: goto L_0x00f7;
                default: goto L_0x001c;
            }
        L_0x001c:
            switch(r5) {
                case 177: goto L_0x00f7;
                case 178: goto L_0x00a3;
                case 179: goto L_0x00f7;
                case 180: goto L_0x00a3;
                case 181: goto L_0x00f7;
                case 182: goto L_0x00a3;
                case 183: goto L_0x007c;
                case 184: goto L_0x00a3;
                case 185: goto L_0x00a3;
                default: goto L_0x001f;
            }
        L_0x001f:
            switch(r5) {
                case 187: goto L_0x0069;
                case 188: goto L_0x005a;
                case 189: goto L_0x0047;
                case 190: goto L_0x00dd;
                case 191: goto L_0x00f7;
                case 192: goto L_0x005a;
                case 193: goto L_0x0040;
                case 194: goto L_0x00f7;
                case 195: goto L_0x00f7;
                default: goto L_0x0022;
            }
        L_0x0022:
            switch(r5) {
                case 197: goto L_0x005a;
                case 198: goto L_0x00f7;
                case 199: goto L_0x00f7;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "shouldn't happen: "
            r4.append(r0)
            java.lang.String r5 = com.android.p023dx.util.Hex.m906u1(r5)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x0040:
            com.android.dx.rop.type.Type r4 = com.android.p023dx.rop.type.Type.INT
            r2.setResult(r4)
            goto L_0x00fa
        L_0x0047:
            com.android.dx.rop.cst.Constant r4 = r2.getAuxCst()
            com.android.dx.rop.cst.CstType r4 = (com.android.p023dx.rop.cst.CstType) r4
            com.android.dx.rop.type.Type r4 = r4.getClassType()
            com.android.dx.rop.type.Type r4 = r4.getArrayType()
            r2.setResult(r4)
            goto L_0x00fa
        L_0x005a:
            com.android.dx.rop.cst.Constant r4 = r2.getAuxCst()
            com.android.dx.rop.cst.CstType r4 = (com.android.p023dx.rop.cst.CstType) r4
            com.android.dx.rop.type.Type r4 = r4.getClassType()
            r2.setResult(r4)
            goto L_0x00fa
        L_0x0069:
            com.android.dx.rop.cst.Constant r5 = r2.getAuxCst()
            com.android.dx.rop.cst.CstType r5 = (com.android.p023dx.rop.cst.CstType) r5
            com.android.dx.rop.type.Type r5 = r5.getClassType()
            com.android.dx.rop.type.Type r4 = r5.asUninitialized(r4)
            r2.setResult(r4)
            goto L_0x00fa
        L_0x007c:
            com.android.dx.rop.type.TypeBearer r4 = r2.arg(r1)
            com.android.dx.rop.type.Type r4 = r4.getType()
            boolean r5 = r4.isUninitialized()
            if (r5 == 0) goto L_0x008d
            r3.makeInitialized(r4)
        L_0x008d:
            com.android.dx.rop.cst.Constant r4 = r2.getAuxCst()
            com.android.dx.rop.type.TypeBearer r4 = (com.android.p023dx.rop.type.TypeBearer) r4
            com.android.dx.rop.type.Type r4 = r4.getType()
            com.android.dx.rop.type.Type r5 = com.android.p023dx.rop.type.Type.VOID
            if (r4 != r5) goto L_0x009f
            r2.clearResult()
            goto L_0x00fa
        L_0x009f:
            r2.setResult(r4)
            goto L_0x00fa
        L_0x00a3:
            com.android.dx.rop.cst.Constant r4 = r2.getAuxCst()
            com.android.dx.rop.type.TypeBearer r4 = (com.android.p023dx.rop.type.TypeBearer) r4
            com.android.dx.rop.type.Type r4 = r4.getType()
            com.android.dx.rop.type.Type r5 = com.android.p023dx.rop.type.Type.VOID
            if (r4 != r5) goto L_0x00b5
            r2.clearResult()
            goto L_0x00fa
        L_0x00b5:
            r2.setResult(r4)
            goto L_0x00fa
        L_0x00b9:
            com.android.dx.cf.code.ReturnAddress r4 = new com.android.dx.cf.code.ReturnAddress
            int r5 = r2.getAuxTarget()
            r4.<init>(r5)
            r2.setResult(r4)
            goto L_0x00fa
        L_0x00c6:
            r2.clearResult()
            int r4 = r2.getAuxInt()
        L_0x00cd:
            if (r4 == 0) goto L_0x00fa
            r5 = r4 & 15
            int r5 = r5 + -1
            com.android.dx.rop.type.TypeBearer r5 = r2.arg(r5)
            r2.addResult(r5)
            int r4 = r4 >> 4
            goto L_0x00cd
        L_0x00dd:
            com.android.dx.rop.type.Type r4 = r2.getAuxType()
            r2.setResult(r4)
            goto L_0x00fa
        L_0x00e5:
            com.android.dx.rop.type.TypeBearer r4 = r2.arg(r1)
            r2.setResult(r4)
            goto L_0x00fa
        L_0x00ed:
            com.android.dx.rop.cst.Constant r4 = r2.getAuxCst()
            com.android.dx.rop.type.TypeBearer r4 = (com.android.p023dx.rop.type.TypeBearer) r4
            r2.setResult(r4)
            goto L_0x00fa
        L_0x00f7:
            r2.clearResult()
        L_0x00fa:
            r2.storeResults(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.p023dx.p024cf.code.ValueAwareMachine.run(com.android.dx.cf.code.Frame, int, int):void");
    }
}

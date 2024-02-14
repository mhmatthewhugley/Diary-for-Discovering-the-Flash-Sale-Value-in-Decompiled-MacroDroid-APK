package com.android.p023dx.dex.p025cf;

import com.android.p023dx.dex.code.DalvCode;
import com.android.p023dx.rop.code.RopMethod;
import java.io.PrintStream;

/* renamed from: com.android.dx.dex.cf.CodeStatistics */
public final class CodeStatistics {
    private static final boolean DEBUG = false;
    public static int dexRunningDeltaInsns;
    public static int dexRunningDeltaRegisters;
    public static int dexRunningTotalInsns;
    public static int runningDeltaInsns;
    public static int runningDeltaRegisters;
    public static int runningOriginalBytes;
    public static int runningTotalInsns;

    private CodeStatistics() {
    }

    public static void dumpStatistics(PrintStream printStream) {
        int i = runningDeltaInsns;
        printStream.printf("Optimizer Delta Rop Insns: %d total: %d (%.2f%%) Delta Registers: %d\n", new Object[]{Integer.valueOf(runningDeltaInsns), Integer.valueOf(runningTotalInsns), Double.valueOf(((double) (((float) i) / ((float) (runningTotalInsns + Math.abs(i))))) * 100.0d), Integer.valueOf(runningDeltaRegisters)});
        int i2 = dexRunningDeltaInsns;
        printStream.printf("Optimizer Delta Dex Insns: Insns: %d total: %d (%.2f%%) Delta Registers: %d\n", new Object[]{Integer.valueOf(dexRunningDeltaInsns), Integer.valueOf(dexRunningTotalInsns), Double.valueOf(((double) (((float) i2) / ((float) (dexRunningTotalInsns + Math.abs(i2))))) * 100.0d), Integer.valueOf(dexRunningDeltaRegisters)});
        printStream.printf("Original bytecode byte count: %d\n", new Object[]{Integer.valueOf(runningOriginalBytes)});
    }

    public static void updateDexStatistics(DalvCode dalvCode, DalvCode dalvCode2) {
        dexRunningDeltaInsns += dalvCode2.getInsns().codeSize() - dalvCode.getInsns().codeSize();
        dexRunningDeltaRegisters += dalvCode2.getInsns().getRegistersSize() - dalvCode.getInsns().getRegistersSize();
        dexRunningTotalInsns += dalvCode2.getInsns().codeSize();
    }

    public static void updateOriginalByteCount(int i) {
        runningOriginalBytes += i;
    }

    public static void updateRopStatistics(RopMethod ropMethod, RopMethod ropMethod2) {
        int effectiveInstructionCount = ropMethod.getBlocks().getEffectiveInstructionCount();
        int regCount = ropMethod.getBlocks().getRegCount();
        int effectiveInstructionCount2 = ropMethod2.getBlocks().getEffectiveInstructionCount();
        runningDeltaInsns += effectiveInstructionCount2 - effectiveInstructionCount;
        runningDeltaRegisters += ropMethod2.getBlocks().getRegCount() - regCount;
        runningTotalInsns += effectiveInstructionCount2;
    }
}

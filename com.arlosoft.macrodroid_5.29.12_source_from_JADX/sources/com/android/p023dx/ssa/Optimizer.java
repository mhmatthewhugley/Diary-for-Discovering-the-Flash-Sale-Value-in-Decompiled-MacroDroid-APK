package com.android.p023dx.ssa;

import com.android.p023dx.rop.code.RopMethod;
import com.android.p023dx.rop.code.TranslationAdvice;
import com.android.p023dx.ssa.back.LivenessAnalyzer;
import com.android.p023dx.ssa.back.SsaToRop;
import java.util.EnumSet;

/* renamed from: com.android.dx.ssa.Optimizer */
public class Optimizer {
    private static TranslationAdvice advice = null;
    private static boolean preserveLocals = true;

    /* renamed from: com.android.dx.ssa.Optimizer$OptionalStep */
    public enum OptionalStep {
        MOVE_PARAM_COMBINER,
        SCCP,
        LITERAL_UPGRADE,
        CONST_COLLECTOR,
        ESCAPE_ANALYSIS
    }

    public static SsaMethod debugDeadCodeRemover(RopMethod ropMethod, int i, boolean z, boolean z2, TranslationAdvice translationAdvice) {
        preserveLocals = z2;
        advice = translationAdvice;
        SsaMethod convertToSsaMethod = SsaConverter.convertToSsaMethod(ropMethod, i, z);
        DeadCodeRemover.process(convertToSsaMethod);
        return convertToSsaMethod;
    }

    public static SsaMethod debugEdgeSplit(RopMethod ropMethod, int i, boolean z, boolean z2, TranslationAdvice translationAdvice) {
        preserveLocals = z2;
        advice = translationAdvice;
        return SsaConverter.testEdgeSplit(ropMethod, i, z);
    }

    public static SsaMethod debugNoRegisterAllocation(RopMethod ropMethod, int i, boolean z, boolean z2, TranslationAdvice translationAdvice, EnumSet<OptionalStep> enumSet) {
        preserveLocals = z2;
        advice = translationAdvice;
        SsaMethod convertToSsaMethod = SsaConverter.convertToSsaMethod(ropMethod, i, z);
        runSsaFormSteps(convertToSsaMethod, enumSet);
        LivenessAnalyzer.constructInterferenceGraph(convertToSsaMethod);
        return convertToSsaMethod;
    }

    public static SsaMethod debugPhiPlacement(RopMethod ropMethod, int i, boolean z, boolean z2, TranslationAdvice translationAdvice) {
        preserveLocals = z2;
        advice = translationAdvice;
        return SsaConverter.testPhiPlacement(ropMethod, i, z);
    }

    public static SsaMethod debugRenaming(RopMethod ropMethod, int i, boolean z, boolean z2, TranslationAdvice translationAdvice) {
        preserveLocals = z2;
        advice = translationAdvice;
        return SsaConverter.convertToSsaMethod(ropMethod, i, z);
    }

    public static TranslationAdvice getAdvice() {
        return advice;
    }

    public static boolean getPreserveLocals() {
        return preserveLocals;
    }

    public static RopMethod optimize(RopMethod ropMethod, int i, boolean z, boolean z2, TranslationAdvice translationAdvice) {
        return optimize(ropMethod, i, z, z2, translationAdvice, EnumSet.allOf(OptionalStep.class));
    }

    private static RopMethod optimizeMinimizeRegisters(RopMethod ropMethod, int i, boolean z, EnumSet<OptionalStep> enumSet) {
        SsaMethod convertToSsaMethod = SsaConverter.convertToSsaMethod(ropMethod, i, z);
        EnumSet<OptionalStep> clone = enumSet.clone();
        clone.remove(OptionalStep.CONST_COLLECTOR);
        runSsaFormSteps(convertToSsaMethod, clone);
        return SsaToRop.convertToRopMethod(convertToSsaMethod, true);
    }

    private static void runSsaFormSteps(SsaMethod ssaMethod, EnumSet<OptionalStep> enumSet) {
        boolean z;
        if (enumSet.contains(OptionalStep.MOVE_PARAM_COMBINER)) {
            MoveParamCombiner.process(ssaMethod);
        }
        boolean z2 = false;
        if (enumSet.contains(OptionalStep.SCCP)) {
            SCCP.process(ssaMethod);
            DeadCodeRemover.process(ssaMethod);
            z = false;
        } else {
            z = true;
        }
        if (enumSet.contains(OptionalStep.LITERAL_UPGRADE)) {
            LiteralOpUpgrader.process(ssaMethod);
            DeadCodeRemover.process(ssaMethod);
            z = false;
        }
        OptionalStep optionalStep = OptionalStep.ESCAPE_ANALYSIS;
        enumSet.remove(optionalStep);
        if (enumSet.contains(optionalStep)) {
            EscapeAnalysis.process(ssaMethod);
            DeadCodeRemover.process(ssaMethod);
            z = false;
        }
        if (enumSet.contains(OptionalStep.CONST_COLLECTOR)) {
            ConstCollector.process(ssaMethod);
            DeadCodeRemover.process(ssaMethod);
        } else {
            z2 = z;
        }
        if (z2) {
            DeadCodeRemover.process(ssaMethod);
        }
        PhiTypeResolver.process(ssaMethod);
    }

    public static RopMethod optimize(RopMethod ropMethod, int i, boolean z, boolean z2, TranslationAdvice translationAdvice, EnumSet<OptionalStep> enumSet) {
        preserveLocals = z2;
        advice = translationAdvice;
        SsaMethod convertToSsaMethod = SsaConverter.convertToSsaMethod(ropMethod, i, z);
        runSsaFormSteps(convertToSsaMethod, enumSet);
        RopMethod convertToRopMethod = SsaToRop.convertToRopMethod(convertToSsaMethod, false);
        return convertToRopMethod.getBlocks().getRegCount() > advice.getMaxOptimalRegisterCount() ? optimizeMinimizeRegisters(ropMethod, i, z, enumSet) : convertToRopMethod;
    }
}

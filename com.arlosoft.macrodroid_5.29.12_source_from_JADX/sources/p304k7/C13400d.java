package p304k7;

/* renamed from: k7.d */
/* compiled from: IntEvaluator */
public class C13400d implements C13407h<Integer> {
    /* renamed from: a */
    public Integer evaluate(float f, Integer num, Integer num2) {
        int intValue = num.intValue();
        return Integer.valueOf((int) (((float) intValue) + (f * ((float) (num2.intValue() - intValue)))));
    }
}

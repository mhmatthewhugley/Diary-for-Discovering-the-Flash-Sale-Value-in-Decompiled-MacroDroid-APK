package p304k7;

/* renamed from: k7.b */
/* compiled from: FloatEvaluator */
public class C13398b implements C13407h<Number> {
    /* renamed from: a */
    public Float evaluate(float f, Number number, Number number2) {
        float floatValue = number.floatValue();
        return Float.valueOf(floatValue + (f * (number2.floatValue() - floatValue)));
    }
}

package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Flow;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.Placeholder;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.motion.utils.StopLogic;
import androidx.constraintlayout.motion.utils.ViewState;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.C0382R;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayoutStates;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.StateSet;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MotionLayout extends ConstraintLayout implements NestedScrollingParent3 {
    private static final boolean DEBUG = false;
    public static final int DEBUG_SHOW_NONE = 0;
    public static final int DEBUG_SHOW_PATH = 2;
    public static final int DEBUG_SHOW_PROGRESS = 1;
    private static final float EPSILON = 1.0E-5f;
    public static boolean IS_IN_EDIT_MODE = false;
    static final int MAX_KEY_FRAMES = 50;
    static final String TAG = "MotionLayout";
    public static final int TOUCH_UP_COMPLETE = 0;
    public static final int TOUCH_UP_COMPLETE_TO_END = 2;
    public static final int TOUCH_UP_COMPLETE_TO_START = 1;
    public static final int TOUCH_UP_DECELERATE = 4;
    public static final int TOUCH_UP_DECELERATE_AND_COMPLETE = 5;
    public static final int TOUCH_UP_NEVER_TO_END = 7;
    public static final int TOUCH_UP_NEVER_TO_START = 6;
    public static final int TOUCH_UP_STOP = 3;
    public static final int VELOCITY_LAYOUT = 1;
    public static final int VELOCITY_POST_LAYOUT = 0;
    public static final int VELOCITY_STATIC_LAYOUT = 3;
    public static final int VELOCITY_STATIC_POST_LAYOUT = 2;
    boolean firstDown = true;
    private float lastPos;
    private float lastY;
    private long mAnimationStartTime = 0;
    /* access modifiers changed from: private */
    public int mBeginState = -1;
    private RectF mBoundsCheck = new RectF();
    int mCurrentState = -1;
    int mDebugPath = 0;
    private DecelerateInterpolator mDecelerateLogic = new DecelerateInterpolator();
    private ArrayList<MotionHelper> mDecoratorsHelpers = null;
    private boolean mDelayedApply = false;
    private DesignTool mDesignTool;
    DevModeDraw mDevModeDraw;
    /* access modifiers changed from: private */
    public int mEndState = -1;
    int mEndWrapHeight;
    int mEndWrapWidth;
    HashMap<View, MotionController> mFrameArrayList = new HashMap<>();
    private int mFrames = 0;
    int mHeightMeasureMode;
    private boolean mInLayout = false;
    /* access modifiers changed from: private */
    public boolean mInRotation = false;
    boolean mInTransition = false;
    boolean mIndirectTransition = false;
    private boolean mInteractionEnabled = true;
    Interpolator mInterpolator;
    private Matrix mInverseMatrix = null;
    boolean mIsAnimating = false;
    private boolean mKeepAnimating = false;
    private KeyCache mKeyCache = new KeyCache();
    private long mLastDrawTime = -1;
    private float mLastFps = 0.0f;
    /* access modifiers changed from: private */
    public int mLastHeightMeasureSpec = 0;
    int mLastLayoutHeight;
    int mLastLayoutWidth;
    float mLastVelocity = 0.0f;
    /* access modifiers changed from: private */
    public int mLastWidthMeasureSpec = 0;
    private float mListenerPosition = 0.0f;
    private int mListenerState = 0;
    protected boolean mMeasureDuringTransition = false;
    Model mModel = new Model();
    private boolean mNeedsFireTransitionCompleted = false;
    int mOldHeight;
    int mOldWidth;
    private Runnable mOnComplete = null;
    private ArrayList<MotionHelper> mOnHideHelpers = null;
    private ArrayList<MotionHelper> mOnShowHelpers = null;
    float mPostInterpolationPosition;
    HashMap<View, ViewState> mPreRotate = new HashMap<>();
    /* access modifiers changed from: private */
    public int mPreRotateHeight;
    /* access modifiers changed from: private */
    public int mPreRotateWidth;
    private int mPreviouseRotation;
    Interpolator mProgressInterpolator = null;
    private View mRegionView = null;
    int mRotatMode = 0;
    MotionScene mScene;
    private int[] mScheduledTransitionTo = null;
    int mScheduledTransitions = 0;
    float mScrollTargetDT;
    float mScrollTargetDX;
    float mScrollTargetDY;
    long mScrollTargetTime;
    int mStartWrapHeight;
    int mStartWrapWidth;
    /* access modifiers changed from: private */
    public StateCache mStateCache;
    private StopLogic mStopLogic = new StopLogic();
    Rect mTempRect = new Rect();
    private boolean mTemporalInterpolator = false;
    ArrayList<Integer> mTransitionCompleted = new ArrayList<>();
    private float mTransitionDuration = 1.0f;
    float mTransitionGoalPosition = 0.0f;
    private boolean mTransitionInstantly;
    float mTransitionLastPosition = 0.0f;
    private long mTransitionLastTime;
    private TransitionListener mTransitionListener;
    private CopyOnWriteArrayList<TransitionListener> mTransitionListeners = null;
    float mTransitionPosition = 0.0f;
    TransitionState mTransitionState = TransitionState.UNDEFINED;
    boolean mUndergoingMotion = false;
    int mWidthMeasureMode;

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$5 */
    static /* synthetic */ class C03655 {

        /* renamed from: $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState */
        static final /* synthetic */ int[] f390xabc7e4ac;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState[] r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f390xabc7e4ac = r0
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f390xabc7e4ac     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f390xabc7e4ac     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f390xabc7e4ac     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.C03655.<clinit>():void");
        }
    }

    class DecelerateInterpolator extends MotionInterpolator {
        float currentP = 0.0f;
        float initalV = 0.0f;
        float maxA;

        DecelerateInterpolator() {
        }

        public void config(float f, float f2, float f3) {
            this.initalV = f;
            this.currentP = f2;
            this.maxA = f3;
        }

        public float getInterpolation(float f) {
            float f2;
            float f3;
            float f4 = this.initalV;
            if (f4 > 0.0f) {
                float f5 = this.maxA;
                if (f4 / f5 < f) {
                    f = f4 / f5;
                }
                MotionLayout.this.mLastVelocity = f4 - (f5 * f);
                f2 = (f4 * f) - (((f5 * f) * f) / 2.0f);
                f3 = this.currentP;
            } else {
                float f6 = this.maxA;
                if ((-f4) / f6 < f) {
                    f = (-f4) / f6;
                }
                MotionLayout.this.mLastVelocity = (f6 * f) + f4;
                f2 = (f4 * f) + (((f6 * f) * f) / 2.0f);
                f3 = this.currentP;
            }
            return f2 + f3;
        }

        public float getVelocity() {
            return MotionLayout.this.mLastVelocity;
        }
    }

    private class DevModeDraw {
        private static final int DEBUG_PATH_TICKS_PER_MS = 16;
        final int DIAMOND_SIZE = 10;
        final int GRAPH_COLOR = -13391360;
        final int KEYFRAME_COLOR = -2067046;
        final int RED_COLOR = -21965;
        final int SHADOW_COLOR = 1996488704;
        Rect mBounds = new Rect();
        DashPathEffect mDashPathEffect;
        Paint mFillPaint;
        int mKeyFrameCount;
        float[] mKeyFramePoints;
        Paint mPaint;
        Paint mPaintGraph;
        Paint mPaintKeyframes;
        Path mPath;
        int[] mPathMode;
        float[] mPoints;
        boolean mPresentationMode = false;
        private float[] mRectangle;
        int mShadowTranslate = 1;
        Paint mTextPaint;

        public DevModeDraw() {
            Paint paint = new Paint();
            this.mPaint = paint;
            paint.setAntiAlias(true);
            this.mPaint.setColor(-21965);
            this.mPaint.setStrokeWidth(2.0f);
            this.mPaint.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.mPaintKeyframes = paint2;
            paint2.setAntiAlias(true);
            this.mPaintKeyframes.setColor(-2067046);
            this.mPaintKeyframes.setStrokeWidth(2.0f);
            this.mPaintKeyframes.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.mPaintGraph = paint3;
            paint3.setAntiAlias(true);
            this.mPaintGraph.setColor(-13391360);
            this.mPaintGraph.setStrokeWidth(2.0f);
            this.mPaintGraph.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.mTextPaint = paint4;
            paint4.setAntiAlias(true);
            this.mTextPaint.setColor(-13391360);
            this.mTextPaint.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.mRectangle = new float[8];
            Paint paint5 = new Paint();
            this.mFillPaint = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.mDashPathEffect = dashPathEffect;
            this.mPaintGraph.setPathEffect(dashPathEffect);
            this.mKeyFramePoints = new float[100];
            this.mPathMode = new int[50];
            if (this.mPresentationMode) {
                this.mPaint.setStrokeWidth(8.0f);
                this.mFillPaint.setStrokeWidth(8.0f);
                this.mPaintKeyframes.setStrokeWidth(8.0f);
                this.mShadowTranslate = 4;
            }
        }

        private void drawBasicPath(Canvas canvas) {
            canvas.drawLines(this.mPoints, this.mPaint);
        }

        private void drawPathAsConfigured(Canvas canvas) {
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < this.mKeyFrameCount; i++) {
                int[] iArr = this.mPathMode;
                if (iArr[i] == 1) {
                    z = true;
                }
                if (iArr[i] == 0) {
                    z2 = true;
                }
            }
            if (z) {
                drawPathRelative(canvas);
            }
            if (z2) {
                drawPathCartesian(canvas);
            }
        }

        private void drawPathCartesian(Canvas canvas) {
            float[] fArr = this.mPoints;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.mPaintGraph);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.mPaintGraph);
        }

        private void drawPathCartesianTicks(Canvas canvas, float f, float f2) {
            Canvas canvas2 = canvas;
            float[] fArr = this.mPoints;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float min = Math.min(f3, f5);
            float max = Math.max(f4, f6);
            float min2 = f - Math.min(f3, f5);
            float max2 = Math.max(f4, f6) - f2;
            StringBuilder sb = new StringBuilder(15);
            sb.append(((float) ((int) (((double) ((min2 * 100.0f) / Math.abs(f5 - f3))) + 0.5d))) / 100.0f);
            String sb2 = sb.toString();
            getTextBounds(sb2, this.mTextPaint);
            canvas2.drawText(sb2, ((min2 / 2.0f) - ((float) (this.mBounds.width() / 2))) + min, f2 - 20.0f, this.mTextPaint);
            canvas.drawLine(f, f2, Math.min(f3, f5), f2, this.mPaintGraph);
            StringBuilder sb3 = new StringBuilder(15);
            sb3.append(((float) ((int) (((double) ((max2 * 100.0f) / Math.abs(f6 - f4))) + 0.5d))) / 100.0f);
            String sb4 = sb3.toString();
            getTextBounds(sb4, this.mTextPaint);
            canvas2.drawText(sb4, f + 5.0f, max - ((max2 / 2.0f) - ((float) (this.mBounds.height() / 2))), this.mTextPaint);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), this.mPaintGraph);
        }

        private void drawPathRelative(Canvas canvas) {
            float[] fArr = this.mPoints;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.mPaintGraph);
        }

        private void drawPathRelativeTicks(Canvas canvas, float f, float f2) {
            float[] fArr = this.mPoints;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot((double) (f3 - f5), (double) (f4 - f6));
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            float f9 = (((f - f3) * f7) + ((f2 - f4) * f8)) / (hypot * hypot);
            float f10 = f3 + (f7 * f9);
            float f11 = f4 + (f9 * f8);
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f10, f11);
            float hypot2 = (float) Math.hypot((double) (f10 - f), (double) (f11 - f2));
            StringBuilder sb = new StringBuilder(15);
            sb.append(((float) ((int) ((hypot2 * 100.0f) / hypot))) / 100.0f);
            String sb2 = sb.toString();
            getTextBounds(sb2, this.mTextPaint);
            canvas.drawTextOnPath(sb2, path, (hypot2 / 2.0f) - ((float) (this.mBounds.width() / 2)), -20.0f, this.mTextPaint);
            canvas.drawLine(f, f2, f10, f11, this.mPaintGraph);
        }

        private void drawPathScreenTicks(Canvas canvas, float f, float f2, int i, int i2) {
            Canvas canvas2 = canvas;
            StringBuilder sb = new StringBuilder(15);
            sb.append(((float) ((int) (((double) (((f - ((float) (i / 2))) * 100.0f) / ((float) (MotionLayout.this.getWidth() - i)))) + 0.5d))) / 100.0f);
            String sb2 = sb.toString();
            getTextBounds(sb2, this.mTextPaint);
            canvas2.drawText(sb2, ((f / 2.0f) - ((float) (this.mBounds.width() / 2))) + 0.0f, f2 - 20.0f, this.mTextPaint);
            canvas.drawLine(f, f2, Math.min(0.0f, 1.0f), f2, this.mPaintGraph);
            StringBuilder sb3 = new StringBuilder(15);
            sb3.append(((float) ((int) (((double) (((f2 - ((float) (i2 / 2))) * 100.0f) / ((float) (MotionLayout.this.getHeight() - i2)))) + 0.5d))) / 100.0f);
            String sb4 = sb3.toString();
            getTextBounds(sb4, this.mTextPaint);
            canvas2.drawText(sb4, f + 5.0f, 0.0f - ((f2 / 2.0f) - ((float) (this.mBounds.height() / 2))), this.mTextPaint);
            canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), this.mPaintGraph);
        }

        private void drawRectangle(Canvas canvas, MotionController motionController) {
            this.mPath.reset();
            for (int i = 0; i <= 50; i++) {
                motionController.buildRect(((float) i) / ((float) 50), this.mRectangle, 0);
                Path path = this.mPath;
                float[] fArr = this.mRectangle;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.mPath;
                float[] fArr2 = this.mRectangle;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.mPath;
                float[] fArr3 = this.mRectangle;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.mPath;
                float[] fArr4 = this.mRectangle;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.mPath.close();
            }
            this.mPaint.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.mPath, this.mPaint);
            canvas.translate(-2.0f, -2.0f);
            this.mPaint.setColor(SupportMenu.CATEGORY_MASK);
            canvas.drawPath(this.mPath, this.mPaint);
        }

        private void drawTicks(Canvas canvas, int i, int i2, MotionController motionController) {
            int i3;
            int i4;
            float f;
            float f2;
            Canvas canvas2 = canvas;
            int i5 = i;
            MotionController motionController2 = motionController;
            View view = motionController2.mView;
            if (view != null) {
                i4 = view.getWidth();
                i3 = motionController2.mView.getHeight();
            } else {
                i4 = 0;
                i3 = 0;
            }
            for (int i6 = 1; i6 < i2 - 1; i6++) {
                if (i5 != 4 || this.mPathMode[i6 - 1] != 0) {
                    float[] fArr = this.mKeyFramePoints;
                    int i7 = i6 * 2;
                    float f3 = fArr[i7];
                    float f4 = fArr[i7 + 1];
                    this.mPath.reset();
                    this.mPath.moveTo(f3, f4 + 10.0f);
                    this.mPath.lineTo(f3 + 10.0f, f4);
                    this.mPath.lineTo(f3, f4 - 10.0f);
                    this.mPath.lineTo(f3 - 10.0f, f4);
                    this.mPath.close();
                    int i8 = i6 - 1;
                    motionController2.getKeyFrame(i8);
                    if (i5 == 4) {
                        int[] iArr = this.mPathMode;
                        if (iArr[i8] == 1) {
                            drawPathRelativeTicks(canvas2, f3 - 0.0f, f4 - 0.0f);
                        } else if (iArr[i8] == 0) {
                            drawPathCartesianTicks(canvas2, f3 - 0.0f, f4 - 0.0f);
                        } else if (iArr[i8] == 2) {
                            f2 = f4;
                            f = f3;
                            drawPathScreenTicks(canvas, f3 - 0.0f, f4 - 0.0f, i4, i3);
                            canvas2.drawPath(this.mPath, this.mFillPaint);
                        }
                        f2 = f4;
                        f = f3;
                        canvas2.drawPath(this.mPath, this.mFillPaint);
                    } else {
                        f2 = f4;
                        f = f3;
                    }
                    if (i5 == 2) {
                        drawPathRelativeTicks(canvas2, f - 0.0f, f2 - 0.0f);
                    }
                    if (i5 == 3) {
                        drawPathCartesianTicks(canvas2, f - 0.0f, f2 - 0.0f);
                    }
                    if (i5 == 6) {
                        drawPathScreenTicks(canvas, f - 0.0f, f2 - 0.0f, i4, i3);
                    }
                    canvas2.drawPath(this.mPath, this.mFillPaint);
                }
            }
            float[] fArr2 = this.mPoints;
            if (fArr2.length > 1) {
                canvas2.drawCircle(fArr2[0], fArr2[1], 8.0f, this.mPaintKeyframes);
                float[] fArr3 = this.mPoints;
                canvas2.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.mPaintKeyframes);
            }
        }

        private void drawTranslation(Canvas canvas, float f, float f2, float f3, float f4) {
            canvas.drawRect(f, f2, f3, f4, this.mPaintGraph);
            canvas.drawLine(f, f2, f3, f4, this.mPaintGraph);
        }

        public void draw(Canvas canvas, HashMap<View, MotionController> hashMap, int i, int i2) {
            if (hashMap != null && hashMap.size() != 0) {
                canvas.save();
                if (!MotionLayout.this.isInEditMode() && (i2 & 1) == 2) {
                    String resourceName = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.mEndState);
                    float progress = MotionLayout.this.getProgress();
                    StringBuilder sb = new StringBuilder(String.valueOf(resourceName).length() + 16);
                    sb.append(resourceName);
                    sb.append(":");
                    sb.append(progress);
                    String sb2 = sb.toString();
                    canvas.drawText(sb2, 10.0f, (float) (MotionLayout.this.getHeight() - 30), this.mTextPaint);
                    canvas.drawText(sb2, 11.0f, (float) (MotionLayout.this.getHeight() - 29), this.mPaint);
                }
                for (MotionController next : hashMap.values()) {
                    int drawPath = next.getDrawPath();
                    if (i2 > 0 && drawPath == 0) {
                        drawPath = 1;
                    }
                    if (drawPath != 0) {
                        this.mKeyFrameCount = next.buildKeyFrames(this.mKeyFramePoints, this.mPathMode);
                        if (drawPath >= 1) {
                            int i3 = i / 16;
                            float[] fArr = this.mPoints;
                            if (fArr == null || fArr.length != i3 * 2) {
                                this.mPoints = new float[(i3 * 2)];
                                this.mPath = new Path();
                            }
                            int i4 = this.mShadowTranslate;
                            canvas.translate((float) i4, (float) i4);
                            this.mPaint.setColor(1996488704);
                            this.mFillPaint.setColor(1996488704);
                            this.mPaintKeyframes.setColor(1996488704);
                            this.mPaintGraph.setColor(1996488704);
                            next.buildPath(this.mPoints, i3);
                            drawAll(canvas, drawPath, this.mKeyFrameCount, next);
                            this.mPaint.setColor(-21965);
                            this.mPaintKeyframes.setColor(-2067046);
                            this.mFillPaint.setColor(-2067046);
                            this.mPaintGraph.setColor(-13391360);
                            int i5 = this.mShadowTranslate;
                            canvas.translate((float) (-i5), (float) (-i5));
                            drawAll(canvas, drawPath, this.mKeyFrameCount, next);
                            if (drawPath == 5) {
                                drawRectangle(canvas, next);
                            }
                        }
                    }
                }
                canvas.restore();
            }
        }

        public void drawAll(Canvas canvas, int i, int i2, MotionController motionController) {
            if (i == 4) {
                drawPathAsConfigured(canvas);
            }
            if (i == 2) {
                drawPathRelative(canvas);
            }
            if (i == 3) {
                drawPathCartesian(canvas);
            }
            drawBasicPath(canvas);
            drawTicks(canvas, i, i2, motionController);
        }

        /* access modifiers changed from: package-private */
        public void getTextBounds(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.mBounds);
        }
    }

    class Model {
        ConstraintSet mEnd = null;
        int mEndId;
        ConstraintWidgetContainer mLayoutEnd = new ConstraintWidgetContainer();
        ConstraintWidgetContainer mLayoutStart = new ConstraintWidgetContainer();
        ConstraintSet mStart = null;
        int mStartId;

        Model() {
        }

        private void computeStartEndSize(int i, int i2) {
            int optimizationLevel = MotionLayout.this.getOptimizationLevel();
            MotionLayout motionLayout = MotionLayout.this;
            if (motionLayout.mCurrentState == motionLayout.getStartState()) {
                MotionLayout motionLayout2 = MotionLayout.this;
                ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutEnd;
                ConstraintSet constraintSet = this.mEnd;
                motionLayout2.resolveSystem(constraintWidgetContainer, optimizationLevel, (constraintSet == null || constraintSet.mRotate == 0) ? i : i2, (constraintSet == null || constraintSet.mRotate == 0) ? i2 : i);
                ConstraintSet constraintSet2 = this.mStart;
                if (constraintSet2 != null) {
                    MotionLayout motionLayout3 = MotionLayout.this;
                    ConstraintWidgetContainer constraintWidgetContainer2 = this.mLayoutStart;
                    int i3 = constraintSet2.mRotate;
                    int i4 = i3 == 0 ? i : i2;
                    if (i3 == 0) {
                        i = i2;
                    }
                    motionLayout3.resolveSystem(constraintWidgetContainer2, optimizationLevel, i4, i);
                    return;
                }
                return;
            }
            ConstraintSet constraintSet3 = this.mStart;
            if (constraintSet3 != null) {
                MotionLayout motionLayout4 = MotionLayout.this;
                ConstraintWidgetContainer constraintWidgetContainer3 = this.mLayoutStart;
                int i5 = constraintSet3.mRotate;
                motionLayout4.resolveSystem(constraintWidgetContainer3, optimizationLevel, i5 == 0 ? i : i2, i5 == 0 ? i2 : i);
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            ConstraintWidgetContainer constraintWidgetContainer4 = this.mLayoutEnd;
            ConstraintSet constraintSet4 = this.mEnd;
            int i6 = (constraintSet4 == null || constraintSet4.mRotate == 0) ? i : i2;
            if (constraintSet4 == null || constraintSet4.mRotate == 0) {
                i = i2;
            }
            motionLayout5.resolveSystem(constraintWidgetContainer4, optimizationLevel, i6, i);
        }

        private void debugLayout(String str, ConstraintWidgetContainer constraintWidgetContainer) {
            String name = Debug.getName((View) constraintWidgetContainer.getCompanionWidget());
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(name).length());
            sb.append(str);
            sb.append(" ");
            sb.append(name);
            String sb2 = sb.toString();
            String valueOf = String.valueOf(constraintWidgetContainer);
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 12 + valueOf.length());
            sb3.append(sb2);
            sb3.append("  ========= ");
            sb3.append(valueOf);
            int size = constraintWidgetContainer.getChildren().size();
            for (int i = 0; i < size; i++) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(sb2).length() + 14);
                sb4.append(sb2);
                sb4.append("[");
                sb4.append(i);
                sb4.append("] ");
                String sb5 = sb4.toString();
                ConstraintWidget constraintWidget = constraintWidgetContainer.getChildren().get(i);
                String str2 = "_";
                String str3 = constraintWidget.mTop.mTarget != null ? ExifInterface.GPS_DIRECTION_TRUE : str2;
                String valueOf2 = String.valueOf(str3.length() != 0 ? "".concat(str3) : new String(""));
                String str4 = constraintWidget.mBottom.mTarget != null ? "B" : str2;
                String valueOf3 = String.valueOf(str4.length() != 0 ? valueOf2.concat(str4) : new String(valueOf2));
                String str5 = constraintWidget.mLeft.mTarget != null ? "L" : str2;
                String valueOf4 = String.valueOf(str5.length() != 0 ? valueOf3.concat(str5) : new String(valueOf3));
                if (constraintWidget.mRight.mTarget != null) {
                    str2 = "R";
                }
                String concat = str2.length() != 0 ? valueOf4.concat(str2) : new String(valueOf4);
                View view = (View) constraintWidget.getCompanionWidget();
                String name2 = Debug.getName(view);
                if (view instanceof TextView) {
                    String valueOf5 = String.valueOf(name2);
                    String valueOf6 = String.valueOf(((TextView) view).getText());
                    StringBuilder sb6 = new StringBuilder(valueOf5.length() + 2 + valueOf6.length());
                    sb6.append(valueOf5);
                    sb6.append("(");
                    sb6.append(valueOf6);
                    sb6.append(")");
                    name2 = sb6.toString();
                }
                String valueOf7 = String.valueOf(constraintWidget);
                StringBuilder sb7 = new StringBuilder(String.valueOf(sb5).length() + 4 + String.valueOf(name2).length() + valueOf7.length() + String.valueOf(concat).length());
                sb7.append(sb5);
                sb7.append("  ");
                sb7.append(name2);
                sb7.append(" ");
                sb7.append(valueOf7);
                sb7.append(" ");
                sb7.append(concat);
            }
            String.valueOf(sb2).concat(" done. ");
        }

        private void debugLayoutParam(String str, ConstraintLayout.LayoutParams layoutParams) {
            String str2 = layoutParams.startToStart != -1 ? "SS" : "__";
            String valueOf = String.valueOf(str2.length() != 0 ? " ".concat(str2) : new String(" "));
            String str3 = "|__";
            String str4 = layoutParams.startToEnd != -1 ? "|SE" : str3;
            String valueOf2 = String.valueOf(str4.length() != 0 ? valueOf.concat(str4) : new String(valueOf));
            String str5 = layoutParams.endToStart != -1 ? "|ES" : str3;
            String valueOf3 = String.valueOf(str5.length() != 0 ? valueOf2.concat(str5) : new String(valueOf2));
            String str6 = layoutParams.endToEnd != -1 ? "|EE" : str3;
            String valueOf4 = String.valueOf(str6.length() != 0 ? valueOf3.concat(str6) : new String(valueOf3));
            String str7 = layoutParams.leftToLeft != -1 ? "|LL" : str3;
            String valueOf5 = String.valueOf(str7.length() != 0 ? valueOf4.concat(str7) : new String(valueOf4));
            String str8 = layoutParams.leftToRight != -1 ? "|LR" : str3;
            String valueOf6 = String.valueOf(str8.length() != 0 ? valueOf5.concat(str8) : new String(valueOf5));
            String str9 = layoutParams.rightToLeft != -1 ? "|RL" : str3;
            String valueOf7 = String.valueOf(str9.length() != 0 ? valueOf6.concat(str9) : new String(valueOf6));
            String str10 = layoutParams.rightToRight != -1 ? "|RR" : str3;
            String valueOf8 = String.valueOf(str10.length() != 0 ? valueOf7.concat(str10) : new String(valueOf7));
            String str11 = layoutParams.topToTop != -1 ? "|TT" : str3;
            String valueOf9 = String.valueOf(str11.length() != 0 ? valueOf8.concat(str11) : new String(valueOf8));
            String str12 = layoutParams.topToBottom != -1 ? "|TB" : str3;
            String valueOf10 = String.valueOf(str12.length() != 0 ? valueOf9.concat(str12) : new String(valueOf9));
            String str13 = layoutParams.bottomToTop != -1 ? "|BT" : str3;
            String valueOf11 = String.valueOf(str13.length() != 0 ? valueOf10.concat(str13) : new String(valueOf10));
            if (layoutParams.bottomToBottom != -1) {
                str3 = "|BB";
            }
            String concat = str3.length() != 0 ? valueOf11.concat(str3) : new String(valueOf11);
            String valueOf12 = String.valueOf(str);
            String valueOf13 = String.valueOf(concat);
            if (valueOf13.length() != 0) {
                valueOf12.concat(valueOf13);
            }
        }

        private void debugWidget(String str, ConstraintWidget constraintWidget) {
            String str2;
            String str3;
            String str4;
            ConstraintAnchor constraintAnchor = constraintWidget.mTop.mTarget;
            String str5 = ExifInterface.GPS_DIRECTION_TRUE;
            String str6 = "__";
            if (constraintAnchor != null) {
                String str7 = constraintAnchor.mType == ConstraintAnchor.Type.TOP ? str5 : "B";
                str2 = str7.length() != 0 ? str5.concat(str7) : new String(str5);
            } else {
                str2 = str6;
            }
            String valueOf = String.valueOf(str2);
            String valueOf2 = String.valueOf(valueOf.length() != 0 ? " ".concat(valueOf) : new String(" "));
            ConstraintAnchor constraintAnchor2 = constraintWidget.mBottom.mTarget;
            if (constraintAnchor2 != null) {
                if (constraintAnchor2.mType != ConstraintAnchor.Type.TOP) {
                    str5 = "B";
                }
                str3 = str5.length() != 0 ? "B".concat(str5) : new String("B");
            } else {
                str3 = str6;
            }
            String valueOf3 = String.valueOf(str3);
            String valueOf4 = String.valueOf(valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2));
            ConstraintAnchor constraintAnchor3 = constraintWidget.mLeft.mTarget;
            String str8 = "L";
            if (constraintAnchor3 != null) {
                String str9 = constraintAnchor3.mType == ConstraintAnchor.Type.LEFT ? str8 : "R";
                str4 = str9.length() != 0 ? str8.concat(str9) : new String(str8);
            } else {
                str4 = str6;
            }
            String valueOf5 = String.valueOf(str4);
            String valueOf6 = String.valueOf(valueOf5.length() != 0 ? valueOf4.concat(valueOf5) : new String(valueOf4));
            ConstraintAnchor constraintAnchor4 = constraintWidget.mRight.mTarget;
            if (constraintAnchor4 != null) {
                if (constraintAnchor4.mType != ConstraintAnchor.Type.LEFT) {
                    str8 = "R";
                }
                str6 = str8.length() != 0 ? "R".concat(str8) : new String("R");
            }
            String valueOf7 = String.valueOf(str6);
            String concat = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
            String valueOf8 = String.valueOf(constraintWidget);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6 + String.valueOf(concat).length() + valueOf8.length());
            sb.append(str);
            sb.append(concat);
            sb.append(" ---  ");
            sb.append(valueOf8);
        }

        private void setupConstraintWidget(ConstraintWidgetContainer constraintWidgetContainer, ConstraintSet constraintSet) {
            SparseArray sparseArray = new SparseArray();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, constraintWidgetContainer);
            sparseArray.put(MotionLayout.this.getId(), constraintWidgetContainer);
            if (!(constraintSet == null || constraintSet.mRotate == 0)) {
                MotionLayout motionLayout = MotionLayout.this;
                motionLayout.resolveSystem(this.mLayoutEnd, motionLayout.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getHeight(), BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getWidth(), BasicMeasure.EXACTLY));
            }
            Iterator<ConstraintWidget> it = constraintWidgetContainer.getChildren().iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                sparseArray.put(((View) next.getCompanionWidget()).getId(), next);
            }
            Iterator<ConstraintWidget> it2 = constraintWidgetContainer.getChildren().iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                View view = (View) next2.getCompanionWidget();
                constraintSet.applyToLayoutParams(view.getId(), layoutParams);
                next2.setWidth(constraintSet.getWidth(view.getId()));
                next2.setHeight(constraintSet.getHeight(view.getId()));
                if (view instanceof ConstraintHelper) {
                    constraintSet.applyToHelper((ConstraintHelper) view, next2, layoutParams, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).validateParams();
                    }
                }
                layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.this.applyConstraintsFromLayoutParams(false, view, next2, layoutParams, sparseArray);
                if (constraintSet.getVisibilityMode(view.getId()) == 1) {
                    next2.setVisibility(view.getVisibility());
                } else {
                    next2.setVisibility(constraintSet.getVisibility(view.getId()));
                }
            }
            Iterator<ConstraintWidget> it3 = constraintWidgetContainer.getChildren().iterator();
            while (it3.hasNext()) {
                ConstraintWidget next3 = it3.next();
                if (next3 instanceof VirtualLayout) {
                    Helper helper = (Helper) next3;
                    ((ConstraintHelper) next3.getCompanionWidget()).updatePreLayout(constraintWidgetContainer, helper, sparseArray);
                    ((VirtualLayout) helper).captureWidgets();
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0103  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x016f A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void build() {
            /*
                r19 = this;
                r0 = r19
                androidx.constraintlayout.motion.widget.MotionLayout r1 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r1 = r1.getChildCount()
                androidx.constraintlayout.motion.widget.MotionLayout r2 = androidx.constraintlayout.motion.widget.MotionLayout.this
                java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r2 = r2.mFrameArrayList
                r2.clear()
                android.util.SparseArray r2 = new android.util.SparseArray
                r2.<init>()
                int[] r3 = new int[r1]
                r5 = 0
            L_0x0017:
                if (r5 >= r1) goto L_0x0037
                androidx.constraintlayout.motion.widget.MotionLayout r6 = androidx.constraintlayout.motion.widget.MotionLayout.this
                android.view.View r6 = r6.getChildAt(r5)
                androidx.constraintlayout.motion.widget.MotionController r7 = new androidx.constraintlayout.motion.widget.MotionController
                r7.<init>(r6)
                int r8 = r6.getId()
                r3[r5] = r8
                r2.put(r8, r7)
                androidx.constraintlayout.motion.widget.MotionLayout r8 = androidx.constraintlayout.motion.widget.MotionLayout.this
                java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r8 = r8.mFrameArrayList
                r8.put(r6, r7)
                int r5 = r5 + 1
                goto L_0x0017
            L_0x0037:
                r5 = 0
            L_0x0038:
                if (r5 >= r1) goto L_0x0175
                androidx.constraintlayout.motion.widget.MotionLayout r6 = androidx.constraintlayout.motion.widget.MotionLayout.this
                android.view.View r6 = r6.getChildAt(r5)
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r7 = r7.mFrameArrayList
                java.lang.Object r7 = r7.get(r6)
                r13 = r7
                androidx.constraintlayout.motion.widget.MotionController r13 = (androidx.constraintlayout.motion.widget.MotionController) r13
                if (r13 != 0) goto L_0x0051
                r18 = r2
                goto L_0x016f
            L_0x0051:
                androidx.constraintlayout.widget.ConstraintSet r7 = r0.mStart
                java.lang.String r14 = ")"
                java.lang.String r15 = " ("
                java.lang.String r12 = "no widget for  "
                java.lang.String r11 = "MotionLayout"
                if (r7 == 0) goto L_0x00cd
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r7 = r0.mLayoutStart
                androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r0.getWidget(r7, r6)
                if (r7 == 0) goto L_0x007e
                androidx.constraintlayout.motion.widget.MotionLayout r8 = androidx.constraintlayout.motion.widget.MotionLayout.this
                android.graphics.Rect r7 = r8.toRect(r7)
                androidx.constraintlayout.widget.ConstraintSet r8 = r0.mStart
                androidx.constraintlayout.motion.widget.MotionLayout r9 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r9 = r9.getWidth()
                androidx.constraintlayout.motion.widget.MotionLayout r10 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r10 = r10.getHeight()
                r13.setStartState(r7, r8, r9, r10)
                goto L_0x00fb
            L_0x007e:
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r7 = r7.mDebugPath
                if (r7 == 0) goto L_0x00fb
                java.lang.String r7 = androidx.constraintlayout.motion.widget.Debug.getLocation()
                java.lang.String r8 = androidx.constraintlayout.motion.widget.Debug.getName(r6)
                java.lang.Class r9 = r6.getClass()
                java.lang.String r9 = r9.getName()
                java.lang.String r10 = java.lang.String.valueOf(r7)
                int r10 = r10.length()
                int r10 = r10 + 18
                java.lang.String r16 = java.lang.String.valueOf(r8)
                int r16 = r16.length()
                int r10 = r10 + r16
                int r16 = r9.length()
                int r10 = r10 + r16
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>(r10)
                r4.append(r7)
                r4.append(r12)
                r4.append(r8)
                r4.append(r15)
                r4.append(r9)
                r4.append(r14)
                java.lang.String r4 = r4.toString()
                android.util.Log.e(r11, r4)
                goto L_0x00fb
            L_0x00cd:
                androidx.constraintlayout.motion.widget.MotionLayout r4 = androidx.constraintlayout.motion.widget.MotionLayout.this
                boolean r4 = r4.mInRotation
                if (r4 == 0) goto L_0x00fb
                androidx.constraintlayout.motion.widget.MotionLayout r4 = androidx.constraintlayout.motion.widget.MotionLayout.this
                java.util.HashMap<android.view.View, androidx.constraintlayout.motion.utils.ViewState> r4 = r4.mPreRotate
                java.lang.Object r4 = r4.get(r6)
                r8 = r4
                androidx.constraintlayout.motion.utils.ViewState r8 = (androidx.constraintlayout.motion.utils.ViewState) r8
                androidx.constraintlayout.motion.widget.MotionLayout r4 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r10 = r4.mRotatMode
                int r4 = r4.mPreRotateWidth
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r17 = r7.mPreRotateHeight
                r7 = r13
                r9 = r6
                r18 = r2
                r2 = r11
                r11 = r4
                r4 = r12
                r12 = r17
                r7.setStartState(r8, r9, r10, r11, r12)
                goto L_0x00ff
            L_0x00fb:
                r18 = r2
                r2 = r11
                r4 = r12
            L_0x00ff:
                androidx.constraintlayout.widget.ConstraintSet r7 = r0.mEnd
                if (r7 == 0) goto L_0x016f
                androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r7 = r0.mLayoutEnd
                androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r0.getWidget(r7, r6)
                if (r7 == 0) goto L_0x0123
                androidx.constraintlayout.motion.widget.MotionLayout r2 = androidx.constraintlayout.motion.widget.MotionLayout.this
                android.graphics.Rect r2 = r2.toRect(r7)
                androidx.constraintlayout.widget.ConstraintSet r4 = r0.mEnd
                androidx.constraintlayout.motion.widget.MotionLayout r6 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r6 = r6.getWidth()
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r7 = r7.getHeight()
                r13.setEndState(r2, r4, r6, r7)
                goto L_0x016f
            L_0x0123:
                androidx.constraintlayout.motion.widget.MotionLayout r7 = androidx.constraintlayout.motion.widget.MotionLayout.this
                int r7 = r7.mDebugPath
                if (r7 == 0) goto L_0x016f
                java.lang.String r7 = androidx.constraintlayout.motion.widget.Debug.getLocation()
                java.lang.String r8 = androidx.constraintlayout.motion.widget.Debug.getName(r6)
                java.lang.Class r6 = r6.getClass()
                java.lang.String r6 = r6.getName()
                java.lang.String r9 = java.lang.String.valueOf(r7)
                int r9 = r9.length()
                int r9 = r9 + 18
                java.lang.String r10 = java.lang.String.valueOf(r8)
                int r10 = r10.length()
                int r9 = r9 + r10
                int r10 = r6.length()
                int r9 = r9 + r10
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>(r9)
                r10.append(r7)
                r10.append(r4)
                r10.append(r8)
                r10.append(r15)
                r10.append(r6)
                r10.append(r14)
                java.lang.String r4 = r10.toString()
                android.util.Log.e(r2, r4)
            L_0x016f:
                int r5 = r5 + 1
                r2 = r18
                goto L_0x0038
            L_0x0175:
                r18 = r2
                r4 = 0
            L_0x0178:
                if (r4 >= r1) goto L_0x0199
                r2 = r3[r4]
                r5 = r18
                java.lang.Object r2 = r5.get(r2)
                androidx.constraintlayout.motion.widget.MotionController r2 = (androidx.constraintlayout.motion.widget.MotionController) r2
                int r6 = r2.getAnimateRelativeTo()
                r7 = -1
                if (r6 == r7) goto L_0x0194
                java.lang.Object r6 = r5.get(r6)
                androidx.constraintlayout.motion.widget.MotionController r6 = (androidx.constraintlayout.motion.widget.MotionController) r6
                r2.setupRelative(r6)
            L_0x0194:
                int r4 = r4 + 1
                r18 = r5
                goto L_0x0178
            L_0x0199:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.Model.build():void");
        }

        /* access modifiers changed from: package-private */
        public void copy(ConstraintWidgetContainer constraintWidgetContainer, ConstraintWidgetContainer constraintWidgetContainer2) {
            ConstraintWidget constraintWidget;
            ArrayList<ConstraintWidget> children = constraintWidgetContainer.getChildren();
            HashMap hashMap = new HashMap();
            hashMap.put(constraintWidgetContainer, constraintWidgetContainer2);
            constraintWidgetContainer2.getChildren().clear();
            constraintWidgetContainer2.copy(constraintWidgetContainer, hashMap);
            Iterator<ConstraintWidget> it = children.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                if (next instanceof androidx.constraintlayout.core.widgets.Barrier) {
                    constraintWidget = new androidx.constraintlayout.core.widgets.Barrier();
                } else if (next instanceof Guideline) {
                    constraintWidget = new Guideline();
                } else if (next instanceof Flow) {
                    constraintWidget = new Flow();
                } else if (next instanceof Placeholder) {
                    constraintWidget = new Placeholder();
                } else if (next instanceof Helper) {
                    constraintWidget = new HelperWidget();
                } else {
                    constraintWidget = new ConstraintWidget();
                }
                constraintWidgetContainer2.add(constraintWidget);
                hashMap.put(next, constraintWidget);
            }
            Iterator<ConstraintWidget> it2 = children.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                ((ConstraintWidget) hashMap.get(next2)).copy(next2, hashMap);
            }
        }

        /* access modifiers changed from: package-private */
        public ConstraintWidget getWidget(ConstraintWidgetContainer constraintWidgetContainer, View view) {
            if (constraintWidgetContainer.getCompanionWidget() == view) {
                return constraintWidgetContainer;
            }
            ArrayList<ConstraintWidget> children = constraintWidgetContainer.getChildren();
            int size = children.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = children.get(i);
                if (constraintWidget.getCompanionWidget() == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public void initFrom(ConstraintWidgetContainer constraintWidgetContainer, ConstraintSet constraintSet, ConstraintSet constraintSet2) {
            this.mStart = constraintSet;
            this.mEnd = constraintSet2;
            this.mLayoutStart = new ConstraintWidgetContainer();
            this.mLayoutEnd = new ConstraintWidgetContainer();
            this.mLayoutStart.setMeasurer(MotionLayout.this.mLayoutWidget.getMeasurer());
            this.mLayoutEnd.setMeasurer(MotionLayout.this.mLayoutWidget.getMeasurer());
            this.mLayoutStart.removeAllChildren();
            this.mLayoutEnd.removeAllChildren();
            copy(MotionLayout.this.mLayoutWidget, this.mLayoutStart);
            copy(MotionLayout.this.mLayoutWidget, this.mLayoutEnd);
            if (((double) MotionLayout.this.mTransitionLastPosition) > 0.5d) {
                if (constraintSet != null) {
                    setupConstraintWidget(this.mLayoutStart, constraintSet);
                }
                setupConstraintWidget(this.mLayoutEnd, constraintSet2);
            } else {
                setupConstraintWidget(this.mLayoutEnd, constraintSet2);
                if (constraintSet != null) {
                    setupConstraintWidget(this.mLayoutStart, constraintSet);
                }
            }
            this.mLayoutStart.setRtl(MotionLayout.this.isRtl());
            this.mLayoutStart.updateHierarchy();
            this.mLayoutEnd.setRtl(MotionLayout.this.isRtl());
            this.mLayoutEnd.updateHierarchy();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    ConstraintWidgetContainer constraintWidgetContainer2 = this.mLayoutStart;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    constraintWidgetContainer2.setHorizontalDimensionBehaviour(dimensionBehaviour);
                    this.mLayoutEnd.setHorizontalDimensionBehaviour(dimensionBehaviour);
                }
                if (layoutParams.height == -2) {
                    ConstraintWidgetContainer constraintWidgetContainer3 = this.mLayoutStart;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    constraintWidgetContainer3.setVerticalDimensionBehaviour(dimensionBehaviour2);
                    this.mLayoutEnd.setVerticalDimensionBehaviour(dimensionBehaviour2);
                }
            }
        }

        public boolean isNotConfiguredWith(int i, int i2) {
            return (i == this.mStartId && i2 == this.mEndId) ? false : true;
        }

        public void measure(int i, int i2) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.mWidthMeasureMode = mode;
            motionLayout.mHeightMeasureMode = mode2;
            motionLayout.getOptimizationLevel();
            computeStartEndSize(i, i2);
            if (((MotionLayout.this.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) ? false : true) {
                computeStartEndSize(i, i2);
                MotionLayout.this.mStartWrapWidth = this.mLayoutStart.getWidth();
                MotionLayout.this.mStartWrapHeight = this.mLayoutStart.getHeight();
                MotionLayout.this.mEndWrapWidth = this.mLayoutEnd.getWidth();
                MotionLayout.this.mEndWrapHeight = this.mLayoutEnd.getHeight();
                MotionLayout motionLayout2 = MotionLayout.this;
                motionLayout2.mMeasureDuringTransition = (motionLayout2.mStartWrapWidth == motionLayout2.mEndWrapWidth && motionLayout2.mStartWrapHeight == motionLayout2.mEndWrapHeight) ? false : true;
            }
            MotionLayout motionLayout3 = MotionLayout.this;
            int i3 = motionLayout3.mStartWrapWidth;
            int i4 = motionLayout3.mStartWrapHeight;
            int i5 = motionLayout3.mWidthMeasureMode;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                i3 = (int) (((float) i3) + (motionLayout3.mPostInterpolationPosition * ((float) (motionLayout3.mEndWrapWidth - i3))));
            }
            int i6 = i3;
            int i7 = motionLayout3.mHeightMeasureMode;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                i4 = (int) (((float) i4) + (motionLayout3.mPostInterpolationPosition * ((float) (motionLayout3.mEndWrapHeight - i4))));
            }
            MotionLayout.this.resolveMeasuredDimension(i, i2, i6, i4, this.mLayoutStart.isWidthMeasuredTooSmall() || this.mLayoutEnd.isWidthMeasuredTooSmall(), this.mLayoutStart.isHeightMeasuredTooSmall() || this.mLayoutEnd.isHeightMeasuredTooSmall());
        }

        public void reEvaluateState() {
            measure(MotionLayout.this.mLastWidthMeasureSpec, MotionLayout.this.mLastHeightMeasureSpec);
            MotionLayout.this.setupMotionViews();
        }

        public void setMeasuredId(int i, int i2) {
            this.mStartId = i;
            this.mEndId = i2;
        }
    }

    protected interface MotionTracker {
        void addMovement(MotionEvent motionEvent);

        void clear();

        void computeCurrentVelocity(int i);

        void computeCurrentVelocity(int i, float f);

        float getXVelocity();

        float getXVelocity(int i);

        float getYVelocity();

        float getYVelocity(int i);

        void recycle();
    }

    class StateCache {
        final String KeyEndState = "motion.EndState";
        final String KeyProgress = "motion.progress";
        final String KeyStartState = "motion.StartState";
        final String KeyVelocity = "motion.velocity";
        int endState = -1;
        float mProgress = Float.NaN;
        float mVelocity = Float.NaN;
        int startState = -1;

        StateCache() {
        }

        /* access modifiers changed from: package-private */
        public void apply() {
            int i = this.startState;
            if (!(i == -1 && this.endState == -1)) {
                if (i == -1) {
                    MotionLayout.this.transitionToState(this.endState);
                } else {
                    int i2 = this.endState;
                    if (i2 == -1) {
                        MotionLayout.this.setState(i, -1, -1);
                    } else {
                        MotionLayout.this.setTransition(i, i2);
                    }
                }
                MotionLayout.this.setState(TransitionState.SETUP);
            }
            if (!Float.isNaN(this.mVelocity)) {
                MotionLayout.this.setProgress(this.mProgress, this.mVelocity);
                this.mProgress = Float.NaN;
                this.mVelocity = Float.NaN;
                this.startState = -1;
                this.endState = -1;
            } else if (!Float.isNaN(this.mProgress)) {
                MotionLayout.this.setProgress(this.mProgress);
            }
        }

        public Bundle getTransitionState() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.mProgress);
            bundle.putFloat("motion.velocity", this.mVelocity);
            bundle.putInt("motion.StartState", this.startState);
            bundle.putInt("motion.EndState", this.endState);
            return bundle;
        }

        public void recordState() {
            this.endState = MotionLayout.this.mEndState;
            this.startState = MotionLayout.this.mBeginState;
            this.mVelocity = MotionLayout.this.getVelocity();
            this.mProgress = MotionLayout.this.getProgress();
        }

        public void setEndState(int i) {
            this.endState = i;
        }

        public void setProgress(float f) {
            this.mProgress = f;
        }

        public void setStartState(int i) {
            this.startState = i;
        }

        public void setTransitionState(Bundle bundle) {
            this.mProgress = bundle.getFloat("motion.progress");
            this.mVelocity = bundle.getFloat("motion.velocity");
            this.startState = bundle.getInt("motion.StartState");
            this.endState = bundle.getInt("motion.EndState");
        }

        public void setVelocity(float f) {
            this.mVelocity = f;
        }
    }

    public interface TransitionListener {
        void onTransitionChange(MotionLayout motionLayout, int i, int i2, float f);

        void onTransitionCompleted(MotionLayout motionLayout, int i);

        void onTransitionStarted(MotionLayout motionLayout, int i, int i2);

        void onTransitionTrigger(MotionLayout motionLayout, int i, boolean z, float f);
    }

    enum TransitionState {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public MotionLayout(@NonNull Context context) {
        super(context);
        init((AttributeSet) null);
    }

    private boolean callTransformedTouchEvent(View view, MotionEvent motionEvent, float f, float f2) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            motionEvent.offsetLocation(f, f2);
            boolean onTouchEvent = view.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(-f, -f2);
            return onTouchEvent;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(f, f2);
        if (this.mInverseMatrix == null) {
            this.mInverseMatrix = new Matrix();
        }
        matrix.invert(this.mInverseMatrix);
        obtain.transform(this.mInverseMatrix);
        boolean onTouchEvent2 = view.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent2;
    }

    private void checkStructure() {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            Log.e(TAG, "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int startId = motionScene.getStartId();
        MotionScene motionScene2 = this.mScene;
        checkStructure(startId, motionScene2.getConstraintSet(motionScene2.getStartId()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        Iterator<MotionScene.Transition> it = this.mScene.getDefinedTransitions().iterator();
        while (it.hasNext()) {
            MotionScene.Transition next = it.next();
            MotionScene.Transition transition = this.mScene.mCurrentTransition;
            checkStructure(next);
            int startConstraintSetId = next.getStartConstraintSetId();
            int endConstraintSetId = next.getEndConstraintSetId();
            String name = Debug.getName(getContext(), startConstraintSetId);
            String name2 = Debug.getName(getContext(), endConstraintSetId);
            if (sparseIntArray.get(startConstraintSetId) == endConstraintSetId) {
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 53 + String.valueOf(name2).length());
                sb.append("CHECK: two transitions with the same start and end ");
                sb.append(name);
                sb.append("->");
                sb.append(name2);
                Log.e(TAG, sb.toString());
            }
            if (sparseIntArray2.get(endConstraintSetId) == startConstraintSetId) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 43 + String.valueOf(name2).length());
                sb2.append("CHECK: you can't have reverse transitions");
                sb2.append(name);
                sb2.append("->");
                sb2.append(name2);
                Log.e(TAG, sb2.toString());
            }
            sparseIntArray.put(startConstraintSetId, endConstraintSetId);
            sparseIntArray2.put(endConstraintSetId, startConstraintSetId);
            if (this.mScene.getConstraintSet(startConstraintSetId) == null) {
                String valueOf = String.valueOf(name);
                Log.e(TAG, valueOf.length() != 0 ? " no such constraintSetStart ".concat(valueOf) : new String(" no such constraintSetStart "));
            }
            if (this.mScene.getConstraintSet(endConstraintSetId) == null) {
                String valueOf2 = String.valueOf(name);
                Log.e(TAG, valueOf2.length() != 0 ? " no such constraintSetEnd ".concat(valueOf2) : new String(" no such constraintSetEnd "));
            }
        }
    }

    private void computeCurrentPositions() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            MotionController motionController = this.mFrameArrayList.get(childAt);
            if (motionController != null) {
                motionController.setStartCurrentState(childAt);
            }
        }
    }

    private void debugPos() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            String location = Debug.getLocation();
            String name = Debug.getName(this);
            String name2 = Debug.getName(getContext(), this.mCurrentState);
            String name3 = Debug.getName(childAt);
            int left = childAt.getLeft();
            int top = childAt.getTop();
            StringBuilder sb = new StringBuilder(String.valueOf(location).length() + 27 + String.valueOf(name).length() + String.valueOf(name2).length() + String.valueOf(name3).length());
            sb.append(" ");
            sb.append(location);
            sb.append(" ");
            sb.append(name);
            sb.append(" ");
            sb.append(name2);
            sb.append(" ");
            sb.append(name3);
            sb.append(left);
            sb.append(" ");
            sb.append(top);
        }
    }

    private void evaluateLayout() {
        boolean z;
        float signum = Math.signum(this.mTransitionGoalPosition - this.mTransitionLastPosition);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.mInterpolator;
        float f = this.mTransitionLastPosition + (!(interpolator instanceof StopLogic) ? ((((float) (nanoTime - this.mTransitionLastTime)) * signum) * 1.0E-9f) / this.mTransitionDuration : 0.0f);
        if (this.mTransitionInstantly) {
            f = this.mTransitionGoalPosition;
        }
        int i = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
        if ((i <= 0 || f < this.mTransitionGoalPosition) && (signum > 0.0f || f > this.mTransitionGoalPosition)) {
            z = false;
        } else {
            f = this.mTransitionGoalPosition;
            z = true;
        }
        if (interpolator != null && !z) {
            if (this.mTemporalInterpolator) {
                f = interpolator.getInterpolation(((float) (nanoTime - this.mAnimationStartTime)) * 1.0E-9f);
            } else {
                f = interpolator.getInterpolation(f);
            }
        }
        if ((i > 0 && f >= this.mTransitionGoalPosition) || (signum <= 0.0f && f <= this.mTransitionGoalPosition)) {
            f = this.mTransitionGoalPosition;
        }
        this.mPostInterpolationPosition = f;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator2 = this.mProgressInterpolator;
        if (interpolator2 != null) {
            f = interpolator2.getInterpolation(f);
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            MotionController motionController = this.mFrameArrayList.get(childAt);
            if (motionController != null) {
                motionController.interpolate(childAt, f, nanoTime2, this.mKeyCache);
            }
        }
        if (this.mMeasureDuringTransition) {
            requestLayout();
        }
    }

    private void fireTransitionChange() {
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList;
        if ((this.mTransitionListener != null || ((copyOnWriteArrayList = this.mTransitionListeners) != null && !copyOnWriteArrayList.isEmpty())) && this.mListenerPosition != this.mTransitionPosition) {
            if (this.mListenerState != -1) {
                TransitionListener transitionListener = this.mTransitionListener;
                if (transitionListener != null) {
                    transitionListener.onTransitionStarted(this, this.mBeginState, this.mEndState);
                }
                CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList2 = this.mTransitionListeners;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<TransitionListener> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().onTransitionStarted(this, this.mBeginState, this.mEndState);
                    }
                }
                this.mIsAnimating = true;
            }
            this.mListenerState = -1;
            float f = this.mTransitionPosition;
            this.mListenerPosition = f;
            TransitionListener transitionListener2 = this.mTransitionListener;
            if (transitionListener2 != null) {
                transitionListener2.onTransitionChange(this, this.mBeginState, this.mEndState, f);
            }
            CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList3 = this.mTransitionListeners;
            if (copyOnWriteArrayList3 != null) {
                Iterator<TransitionListener> it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().onTransitionChange(this, this.mBeginState, this.mEndState, this.mTransitionPosition);
                }
            }
            this.mIsAnimating = true;
        }
    }

    private void fireTransitionStarted(MotionLayout motionLayout, int i, int i2) {
        TransitionListener transitionListener = this.mTransitionListener;
        if (transitionListener != null) {
            transitionListener.onTransitionStarted(this, i, i2);
        }
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList = this.mTransitionListeners;
        if (copyOnWriteArrayList != null) {
            Iterator<TransitionListener> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().onTransitionStarted(motionLayout, i, i2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean handlesTouchEvent(float r8, float r9, android.view.View r10, android.view.MotionEvent r11) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof android.view.ViewGroup
            r1 = 1
            if (r0 == 0) goto L_0x0036
            r0 = r10
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = r0.getChildCount()
            int r2 = r2 - r1
        L_0x000d:
            if (r2 < 0) goto L_0x0036
            android.view.View r3 = r0.getChildAt(r2)
            int r4 = r3.getLeft()
            float r4 = (float) r4
            float r4 = r4 + r8
            int r5 = r10.getScrollX()
            float r5 = (float) r5
            float r4 = r4 - r5
            int r5 = r3.getTop()
            float r5 = (float) r5
            float r5 = r5 + r9
            int r6 = r10.getScrollY()
            float r6 = (float) r6
            float r5 = r5 - r6
            boolean r3 = r7.handlesTouchEvent(r4, r5, r3, r11)
            if (r3 == 0) goto L_0x0033
            r0 = 1
            goto L_0x0037
        L_0x0033:
            int r2 = r2 + -1
            goto L_0x000d
        L_0x0036:
            r0 = 0
        L_0x0037:
            if (r0 != 0) goto L_0x0075
            android.graphics.RectF r2 = r7.mBoundsCheck
            int r3 = r10.getRight()
            float r3 = (float) r3
            float r3 = r3 + r8
            int r4 = r10.getLeft()
            float r4 = (float) r4
            float r3 = r3 - r4
            int r4 = r10.getBottom()
            float r4 = (float) r4
            float r4 = r4 + r9
            int r5 = r10.getTop()
            float r5 = (float) r5
            float r4 = r4 - r5
            r2.set(r8, r9, r3, r4)
            int r2 = r11.getAction()
            if (r2 != 0) goto L_0x006c
            android.graphics.RectF r2 = r7.mBoundsCheck
            float r3 = r11.getX()
            float r4 = r11.getY()
            boolean r2 = r2.contains(r3, r4)
            if (r2 == 0) goto L_0x0075
        L_0x006c:
            float r8 = -r8
            float r9 = -r9
            boolean r8 = r7.callTransformedTouchEvent(r10, r11, r8, r9)
            if (r8 == 0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r1 = r0
        L_0x0076:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.handlesTouchEvent(float, float, android.view.View, android.view.MotionEvent):boolean");
    }

    private void init(AttributeSet attributeSet) {
        MotionScene motionScene;
        IS_IN_EDIT_MODE = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0382R.styleable.MotionLayout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0382R.styleable.MotionLayout_layoutDescription) {
                    this.mScene = new MotionScene(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == C0382R.styleable.MotionLayout_currentState) {
                    this.mCurrentState = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == C0382R.styleable.MotionLayout_motionProgress) {
                    this.mTransitionGoalPosition = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.mInTransition = true;
                } else if (index == C0382R.styleable.MotionLayout_applyMotionScene) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else if (index == C0382R.styleable.MotionLayout_showPaths) {
                    if (this.mDebugPath == 0) {
                        this.mDebugPath = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == C0382R.styleable.MotionLayout_motionDebug) {
                    this.mDebugPath = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (this.mScene == null) {
                Log.e(TAG, "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.mScene = null;
            }
        }
        if (this.mDebugPath != 0) {
            checkStructure();
        }
        if (this.mCurrentState == -1 && (motionScene = this.mScene) != null) {
            this.mCurrentState = motionScene.getStartId();
            this.mBeginState = this.mScene.getStartId();
            this.mEndState = this.mScene.getEndId();
        }
    }

    private void processTransitionCompleted() {
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList;
        if (this.mTransitionListener != null || ((copyOnWriteArrayList = this.mTransitionListeners) != null && !copyOnWriteArrayList.isEmpty())) {
            this.mIsAnimating = false;
            Iterator<Integer> it = this.mTransitionCompleted.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                TransitionListener transitionListener = this.mTransitionListener;
                if (transitionListener != null) {
                    transitionListener.onTransitionCompleted(this, next.intValue());
                }
                CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList2 = this.mTransitionListeners;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<TransitionListener> it2 = copyOnWriteArrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().onTransitionCompleted(this, next.intValue());
                    }
                }
            }
            this.mTransitionCompleted.clear();
        }
    }

    /* access modifiers changed from: private */
    public void setupMotionViews() {
        int childCount = getChildCount();
        this.mModel.build();
        boolean z = true;
        this.mInTransition = true;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            sparseArray.put(childAt.getId(), this.mFrameArrayList.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int gatPathMotionArc = this.mScene.gatPathMotionArc();
        if (gatPathMotionArc != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                MotionController motionController = this.mFrameArrayList.get(getChildAt(i3));
                if (motionController != null) {
                    motionController.setPathMotionArc(gatPathMotionArc);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.mFrameArrayList.size()];
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            MotionController motionController2 = this.mFrameArrayList.get(getChildAt(i5));
            if (motionController2.getAnimateRelativeTo() != -1) {
                sparseBooleanArray.put(motionController2.getAnimateRelativeTo(), true);
                iArr[i4] = motionController2.getAnimateRelativeTo();
                i4++;
            }
        }
        if (this.mDecoratorsHelpers != null) {
            for (int i6 = 0; i6 < i4; i6++) {
                MotionController motionController3 = this.mFrameArrayList.get(findViewById(iArr[i6]));
                if (motionController3 != null) {
                    this.mScene.getKeyFrames(motionController3);
                }
            }
            Iterator<MotionHelper> it = this.mDecoratorsHelpers.iterator();
            while (it.hasNext()) {
                it.next().onPreSetup(this, this.mFrameArrayList);
            }
            for (int i7 = 0; i7 < i4; i7++) {
                MotionController motionController4 = this.mFrameArrayList.get(findViewById(iArr[i7]));
                if (motionController4 != null) {
                    motionController4.setup(width, height, this.mTransitionDuration, getNanoTime());
                }
            }
        } else {
            for (int i8 = 0; i8 < i4; i8++) {
                MotionController motionController5 = this.mFrameArrayList.get(findViewById(iArr[i8]));
                if (motionController5 != null) {
                    this.mScene.getKeyFrames(motionController5);
                    motionController5.setup(width, height, this.mTransitionDuration, getNanoTime());
                }
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = getChildAt(i9);
            MotionController motionController6 = this.mFrameArrayList.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && motionController6 != null) {
                this.mScene.getKeyFrames(motionController6);
                motionController6.setup(width, height, this.mTransitionDuration, getNanoTime());
            }
        }
        float staggered = this.mScene.getStaggered();
        if (staggered != 0.0f) {
            boolean z2 = ((double) staggered) < 0.0d;
            float abs = Math.abs(staggered);
            float f = -3.4028235E38f;
            float f2 = Float.MAX_VALUE;
            int i10 = 0;
            float f3 = Float.MAX_VALUE;
            float f4 = -3.4028235E38f;
            while (true) {
                if (i10 >= childCount) {
                    z = false;
                    break;
                }
                MotionController motionController7 = this.mFrameArrayList.get(getChildAt(i10));
                if (!Float.isNaN(motionController7.mMotionStagger)) {
                    break;
                }
                float finalX = motionController7.getFinalX();
                float finalY = motionController7.getFinalY();
                float f5 = z2 ? finalY - finalX : finalY + finalX;
                f3 = Math.min(f3, f5);
                f4 = Math.max(f4, f5);
                i10++;
            }
            if (z) {
                for (int i11 = 0; i11 < childCount; i11++) {
                    MotionController motionController8 = this.mFrameArrayList.get(getChildAt(i11));
                    if (!Float.isNaN(motionController8.mMotionStagger)) {
                        f2 = Math.min(f2, motionController8.mMotionStagger);
                        f = Math.max(f, motionController8.mMotionStagger);
                    }
                }
                while (i < childCount) {
                    MotionController motionController9 = this.mFrameArrayList.get(getChildAt(i));
                    if (!Float.isNaN(motionController9.mMotionStagger)) {
                        motionController9.mStaggerScale = 1.0f / (1.0f - abs);
                        if (z2) {
                            motionController9.mStaggerOffset = abs - (((f - motionController9.mMotionStagger) / (f - f2)) * abs);
                        } else {
                            motionController9.mStaggerOffset = abs - (((motionController9.mMotionStagger - f2) * abs) / (f - f2));
                        }
                    }
                    i++;
                }
                return;
            }
            while (i < childCount) {
                MotionController motionController10 = this.mFrameArrayList.get(getChildAt(i));
                float finalX2 = motionController10.getFinalX();
                float finalY2 = motionController10.getFinalY();
                float f6 = z2 ? finalY2 - finalX2 : finalY2 + finalX2;
                motionController10.mStaggerScale = 1.0f / (1.0f - abs);
                motionController10.mStaggerOffset = abs - (((f6 - f3) * abs) / (f4 - f3));
                i++;
            }
        }
    }

    /* access modifiers changed from: private */
    public Rect toRect(ConstraintWidget constraintWidget) {
        this.mTempRect.top = constraintWidget.getY();
        this.mTempRect.left = constraintWidget.getX();
        Rect rect = this.mTempRect;
        int width = constraintWidget.getWidth();
        Rect rect2 = this.mTempRect;
        rect.right = width + rect2.left;
        int height = constraintWidget.getHeight();
        Rect rect3 = this.mTempRect;
        rect2.bottom = height + rect3.top;
        return rect3;
    }

    private static boolean willJump(float f, float f2, float f3) {
        if (f > 0.0f) {
            float f4 = f / f3;
            return f2 + ((f * f4) - (((f3 * f4) * f4) / 2.0f)) > 1.0f;
        }
        float f5 = (-f) / f3;
        return f2 + ((f * f5) + (((f3 * f5) * f5) / 2.0f)) < 0.0f;
    }

    public void addTransitionListener(TransitionListener transitionListener) {
        if (this.mTransitionListeners == null) {
            this.mTransitionListeners = new CopyOnWriteArrayList<>();
        }
        this.mTransitionListeners.add(transitionListener);
    }

    /* access modifiers changed from: package-private */
    public void animateTo(float f) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            float f2 = this.mTransitionLastPosition;
            float f3 = this.mTransitionPosition;
            if (f2 != f3 && this.mTransitionInstantly) {
                this.mTransitionLastPosition = f3;
            }
            float f4 = this.mTransitionLastPosition;
            if (f4 != f) {
                this.mTemporalInterpolator = false;
                this.mTransitionGoalPosition = f;
                this.mTransitionDuration = ((float) motionScene.getDuration()) / 1000.0f;
                setProgress(this.mTransitionGoalPosition);
                this.mInterpolator = null;
                this.mProgressInterpolator = this.mScene.getInterpolator();
                this.mTransitionInstantly = false;
                this.mAnimationStartTime = getNanoTime();
                this.mInTransition = true;
                this.mTransitionPosition = f4;
                this.mTransitionLastPosition = f4;
                invalidate();
            }
        }
    }

    public boolean applyViewTransition(int i, MotionController motionController) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            return motionScene.applyViewTransition(i, motionController);
        }
        return false;
    }

    public ConstraintSet cloneConstraintSet(int i) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        ConstraintSet constraintSet = motionScene.getConstraintSet(i);
        ConstraintSet constraintSet2 = new ConstraintSet();
        constraintSet2.clone(constraintSet);
        return constraintSet2;
    }

    /* access modifiers changed from: package-private */
    public void disableAutoTransition(boolean z) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.disableAutoTransition(z);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        ViewTransitionController viewTransitionController;
        ArrayList<MotionHelper> arrayList = this.mDecoratorsHelpers;
        if (arrayList != null) {
            Iterator<MotionHelper> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onPreDraw(canvas);
            }
        }
        evaluate(false);
        MotionScene motionScene = this.mScene;
        if (!(motionScene == null || (viewTransitionController = motionScene.mViewTransitionController) == null)) {
            viewTransitionController.animate();
        }
        super.dispatchDraw(canvas);
        if (this.mScene != null) {
            if ((this.mDebugPath & 1) == 1 && !isInEditMode()) {
                this.mFrames++;
                long nanoTime = getNanoTime();
                long j = this.mLastDrawTime;
                if (j != -1) {
                    long j2 = nanoTime - j;
                    if (j2 > 200000000) {
                        this.mLastFps = ((float) ((int) ((((float) this.mFrames) / (((float) j2) * 1.0E-9f)) * 100.0f))) / 100.0f;
                        this.mFrames = 0;
                        this.mLastDrawTime = nanoTime;
                    }
                } else {
                    this.mLastDrawTime = nanoTime;
                }
                Paint paint = new Paint();
                paint.setTextSize(42.0f);
                float progress = ((float) ((int) (getProgress() * 1000.0f))) / 10.0f;
                float f = this.mLastFps;
                String state = Debug.getState(this, this.mBeginState);
                StringBuilder sb = new StringBuilder(String.valueOf(state).length() + 24);
                sb.append(f);
                sb.append(" fps ");
                sb.append(state);
                sb.append(" -> ");
                String valueOf = String.valueOf(sb.toString());
                String state2 = Debug.getState(this, this.mEndState);
                int i = this.mCurrentState;
                String state3 = i == -1 ? "undefined" : Debug.getState(this, i);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 36 + String.valueOf(state2).length() + String.valueOf(state3).length());
                sb2.append(valueOf);
                sb2.append(state2);
                sb2.append(" (progress: ");
                sb2.append(progress);
                sb2.append(" ) state=");
                sb2.append(state3);
                String sb3 = sb2.toString();
                paint.setColor(ViewCompat.MEASURED_STATE_MASK);
                canvas.drawText(sb3, 11.0f, (float) (getHeight() - 29), paint);
                paint.setColor(-7864184);
                canvas.drawText(sb3, 10.0f, (float) (getHeight() - 30), paint);
            }
            if (this.mDebugPath > 1) {
                if (this.mDevModeDraw == null) {
                    this.mDevModeDraw = new DevModeDraw();
                }
                this.mDevModeDraw.draw(canvas, this.mFrameArrayList, this.mScene.getDuration(), this.mDebugPath);
            }
            ArrayList<MotionHelper> arrayList2 = this.mDecoratorsHelpers;
            if (arrayList2 != null) {
                Iterator<MotionHelper> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().onPostDraw(canvas);
                }
            }
        }
    }

    public void enableTransition(int i, boolean z) {
        MotionScene.Transition transition = getTransition(i);
        if (z) {
            transition.setEnabled(true);
            return;
        }
        MotionScene motionScene = this.mScene;
        if (transition == motionScene.mCurrentTransition) {
            Iterator<MotionScene.Transition> it = motionScene.getTransitionsWithState(this.mCurrentState).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                MotionScene.Transition next = it.next();
                if (next.isEnabled()) {
                    this.mScene.mCurrentTransition = next;
                    break;
                }
            }
        }
        transition.setEnabled(false);
    }

    public void enableViewTransition(int i, boolean z) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.enableViewTransition(i, z);
        }
    }

    /* access modifiers changed from: package-private */
    public void endTrigger(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            MotionController motionController = this.mFrameArrayList.get(getChildAt(i));
            if (motionController != null) {
                motionController.endTrigger(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0210 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x011c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0174  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void evaluate(boolean r24) {
        /*
            r23 = this;
            r0 = r23
            long r1 = r0.mTransitionLastTime
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0010
            long r1 = r23.getNanoTime()
            r0.mTransitionLastTime = r1
        L_0x0010:
            float r1 = r0.mTransitionLastPosition
            r2 = -1
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x0020
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0020
            r0.mCurrentState = r2
        L_0x0020:
            boolean r5 = r0.mKeepAnimating
            r6 = 1
            r7 = 0
            if (r5 != 0) goto L_0x0032
            boolean r5 = r0.mInTransition
            if (r5 == 0) goto L_0x0244
            if (r24 != 0) goto L_0x0032
            float r5 = r0.mTransitionGoalPosition
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 == 0) goto L_0x0244
        L_0x0032:
            float r5 = r0.mTransitionGoalPosition
            float r5 = r5 - r1
            float r1 = java.lang.Math.signum(r5)
            long r8 = r23.getNanoTime()
            android.view.animation.Interpolator r5 = r0.mInterpolator
            boolean r10 = r5 instanceof androidx.constraintlayout.motion.widget.MotionInterpolator
            r11 = 814313567(0x3089705f, float:1.0E-9)
            if (r10 != 0) goto L_0x0053
            long r12 = r0.mTransitionLastTime
            long r12 = r8 - r12
            float r10 = (float) r12
            float r10 = r10 * r1
            float r10 = r10 * r11
            float r12 = r0.mTransitionDuration
            float r10 = r10 / r12
            goto L_0x0054
        L_0x0053:
            r10 = 0
        L_0x0054:
            float r12 = r0.mTransitionLastPosition
            float r12 = r12 + r10
            boolean r13 = r0.mTransitionInstantly
            if (r13 == 0) goto L_0x005d
            float r12 = r0.mTransitionGoalPosition
        L_0x005d:
            int r13 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r13 <= 0) goto L_0x0067
            float r14 = r0.mTransitionGoalPosition
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 >= 0) goto L_0x0071
        L_0x0067:
            int r14 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r14 > 0) goto L_0x0077
            float r14 = r0.mTransitionGoalPosition
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 > 0) goto L_0x0077
        L_0x0071:
            float r12 = r0.mTransitionGoalPosition
            r0.mInTransition = r7
            r14 = 1
            goto L_0x0078
        L_0x0077:
            r14 = 0
        L_0x0078:
            r0.mTransitionLastPosition = r12
            r0.mTransitionPosition = r12
            r0.mTransitionLastTime = r8
            r15 = 2
            r16 = 925353388(0x3727c5ac, float:1.0E-5)
            if (r5 == 0) goto L_0x0108
            if (r14 != 0) goto L_0x0108
            boolean r14 = r0.mTemporalInterpolator
            if (r14 == 0) goto L_0x00e8
            long r2 = r0.mAnimationStartTime
            long r2 = r8 - r2
            float r2 = (float) r2
            float r2 = r2 * r11
            float r2 = r5.getInterpolation(r2)
            android.view.animation.Interpolator r3 = r0.mInterpolator
            androidx.constraintlayout.motion.utils.StopLogic r5 = r0.mStopLogic
            if (r3 != r5) goto L_0x00a5
            boolean r3 = r5.isStopped()
            if (r3 == 0) goto L_0x00a3
            r3 = 2
            goto L_0x00a6
        L_0x00a3:
            r3 = 1
            goto L_0x00a6
        L_0x00a5:
            r3 = 0
        L_0x00a6:
            r0.mTransitionLastPosition = r2
            r0.mTransitionLastTime = r8
            android.view.animation.Interpolator r5 = r0.mInterpolator
            boolean r8 = r5 instanceof androidx.constraintlayout.motion.widget.MotionInterpolator
            if (r8 == 0) goto L_0x00e6
            androidx.constraintlayout.motion.widget.MotionInterpolator r5 = (androidx.constraintlayout.motion.widget.MotionInterpolator) r5
            float r5 = r5.getVelocity()
            r0.mLastVelocity = r5
            float r8 = java.lang.Math.abs(r5)
            float r9 = r0.mTransitionDuration
            float r8 = r8 * r9
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 > 0) goto L_0x00c8
            if (r3 != r15) goto L_0x00c8
            r0.mInTransition = r7
        L_0x00c8:
            int r8 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x00d8
            r8 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r9 < 0) goto L_0x00d8
            r0.mTransitionLastPosition = r8
            r0.mInTransition = r7
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x00d8:
            int r5 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x00e6
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 > 0) goto L_0x00e6
            r0.mTransitionLastPosition = r4
            r0.mInTransition = r7
            r12 = 0
            goto L_0x010b
        L_0x00e6:
            r12 = r2
            goto L_0x010b
        L_0x00e8:
            float r2 = r5.getInterpolation(r12)
            android.view.animation.Interpolator r3 = r0.mInterpolator
            boolean r5 = r3 instanceof androidx.constraintlayout.motion.widget.MotionInterpolator
            if (r5 == 0) goto L_0x00fb
            androidx.constraintlayout.motion.widget.MotionInterpolator r3 = (androidx.constraintlayout.motion.widget.MotionInterpolator) r3
            float r3 = r3.getVelocity()
            r0.mLastVelocity = r3
            goto L_0x0106
        L_0x00fb:
            float r12 = r12 + r10
            float r3 = r3.getInterpolation(r12)
            float r3 = r3 - r2
            float r3 = r3 * r1
            float r3 = r3 / r10
            r0.mLastVelocity = r3
        L_0x0106:
            r12 = r2
            goto L_0x010a
        L_0x0108:
            r0.mLastVelocity = r10
        L_0x010a:
            r3 = 0
        L_0x010b:
            float r2 = r0.mLastVelocity
            float r2 = java.lang.Math.abs(r2)
            int r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r2 <= 0) goto L_0x011a
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            r0.setState(r2)
        L_0x011a:
            if (r3 == r6) goto L_0x0143
            if (r13 <= 0) goto L_0x0124
            float r2 = r0.mTransitionGoalPosition
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x012e
        L_0x0124:
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x0132
            float r2 = r0.mTransitionGoalPosition
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0132
        L_0x012e:
            float r12 = r0.mTransitionGoalPosition
            r0.mInTransition = r7
        L_0x0132:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x013c
            int r2 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x0143
        L_0x013c:
            r0.mInTransition = r7
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r2)
        L_0x0143:
            int r2 = r23.getChildCount()
            r0.mKeepAnimating = r7
            long r8 = r23.getNanoTime()
            r0.mPostInterpolationPosition = r12
            android.view.animation.Interpolator r3 = r0.mProgressInterpolator
            if (r3 != 0) goto L_0x0155
            r3 = r12
            goto L_0x0159
        L_0x0155:
            float r3 = r3.getInterpolation(r12)
        L_0x0159:
            android.view.animation.Interpolator r5 = r0.mProgressInterpolator
            if (r5 == 0) goto L_0x0171
            float r10 = r0.mTransitionDuration
            float r10 = r1 / r10
            float r10 = r10 + r12
            float r5 = r5.getInterpolation(r10)
            r0.mLastVelocity = r5
            android.view.animation.Interpolator r10 = r0.mProgressInterpolator
            float r10 = r10.getInterpolation(r12)
            float r5 = r5 - r10
            r0.mLastVelocity = r5
        L_0x0171:
            r5 = 0
        L_0x0172:
            if (r5 >= r2) goto L_0x019a
            android.view.View r10 = r0.getChildAt(r5)
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r11 = r0.mFrameArrayList
            java.lang.Object r11 = r11.get(r10)
            r17 = r11
            androidx.constraintlayout.motion.widget.MotionController r17 = (androidx.constraintlayout.motion.widget.MotionController) r17
            if (r17 == 0) goto L_0x0197
            boolean r11 = r0.mKeepAnimating
            androidx.constraintlayout.core.motion.utils.KeyCache r15 = r0.mKeyCache
            r18 = r10
            r19 = r3
            r20 = r8
            r22 = r15
            boolean r10 = r17.interpolate(r18, r19, r20, r22)
            r10 = r10 | r11
            r0.mKeepAnimating = r10
        L_0x0197:
            int r5 = r5 + 1
            goto L_0x0172
        L_0x019a:
            if (r13 <= 0) goto L_0x01a2
            float r2 = r0.mTransitionGoalPosition
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x01ac
        L_0x01a2:
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x01ae
            float r2 = r0.mTransitionGoalPosition
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x01ae
        L_0x01ac:
            r2 = 1
            goto L_0x01af
        L_0x01ae:
            r2 = 0
        L_0x01af:
            boolean r3 = r0.mKeepAnimating
            if (r3 != 0) goto L_0x01be
            boolean r3 = r0.mInTransition
            if (r3 != 0) goto L_0x01be
            if (r2 == 0) goto L_0x01be
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r3 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r3)
        L_0x01be:
            boolean r3 = r0.mMeasureDuringTransition
            if (r3 == 0) goto L_0x01c5
            r23.requestLayout()
        L_0x01c5:
            boolean r3 = r0.mKeepAnimating
            r2 = r2 ^ r6
            r2 = r2 | r3
            r0.mKeepAnimating = r2
            int r2 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r2 > 0) goto L_0x01e9
            int r2 = r0.mBeginState
            r3 = -1
            if (r2 == r3) goto L_0x01e9
            int r3 = r0.mCurrentState
            if (r3 == r2) goto L_0x01e9
            r0.mCurrentState = r2
            androidx.constraintlayout.motion.widget.MotionScene r3 = r0.mScene
            androidx.constraintlayout.widget.ConstraintSet r2 = r3.getConstraintSet(r2)
            r2.applyCustomAttributes(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r2)
            r7 = 1
        L_0x01e9:
            double r2 = (double) r12
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r5 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r5 < 0) goto L_0x0207
            int r2 = r0.mCurrentState
            int r3 = r0.mEndState
            if (r2 == r3) goto L_0x0207
            r0.mCurrentState = r3
            androidx.constraintlayout.motion.widget.MotionScene r2 = r0.mScene
            androidx.constraintlayout.widget.ConstraintSet r2 = r2.getConstraintSet(r3)
            r2.applyCustomAttributes(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r2)
            r7 = 1
        L_0x0207:
            boolean r2 = r0.mKeepAnimating
            if (r2 != 0) goto L_0x0226
            boolean r2 = r0.mInTransition
            if (r2 == 0) goto L_0x0210
            goto L_0x0226
        L_0x0210:
            if (r13 <= 0) goto L_0x0218
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x0220
        L_0x0218:
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0229
            int r2 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0229
        L_0x0220:
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r0.setState(r2)
            goto L_0x0229
        L_0x0226:
            r23.invalidate()
        L_0x0229:
            boolean r2 = r0.mKeepAnimating
            if (r2 != 0) goto L_0x0244
            boolean r2 = r0.mInTransition
            if (r2 != 0) goto L_0x0244
            if (r13 <= 0) goto L_0x0239
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x0241
        L_0x0239:
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x0244
            int r1 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0244
        L_0x0241:
            r23.onNewStateAttachHandlers()
        L_0x0244:
            float r1 = r0.mTransitionLastPosition
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0258
            int r1 = r0.mCurrentState
            int r2 = r0.mEndState
            if (r1 == r2) goto L_0x0253
            goto L_0x0254
        L_0x0253:
            r6 = r7
        L_0x0254:
            r0.mCurrentState = r2
        L_0x0256:
            r7 = r6
            goto L_0x0267
        L_0x0258:
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x0267
            int r1 = r0.mCurrentState
            int r2 = r0.mBeginState
            if (r1 == r2) goto L_0x0263
            goto L_0x0264
        L_0x0263:
            r6 = r7
        L_0x0264:
            r0.mCurrentState = r2
            goto L_0x0256
        L_0x0267:
            boolean r1 = r0.mNeedsFireTransitionCompleted
            r1 = r1 | r7
            r0.mNeedsFireTransitionCompleted = r1
            if (r7 == 0) goto L_0x0275
            boolean r1 = r0.mInLayout
            if (r1 != 0) goto L_0x0275
            r23.requestLayout()
        L_0x0275:
            float r1 = r0.mTransitionLastPosition
            r0.mTransitionPosition = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.evaluate(boolean):void");
    }

    /* access modifiers changed from: protected */
    public void fireTransitionCompleted() {
        int i;
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList;
        if ((this.mTransitionListener != null || ((copyOnWriteArrayList = this.mTransitionListeners) != null && !copyOnWriteArrayList.isEmpty())) && this.mListenerState == -1) {
            this.mListenerState = this.mCurrentState;
            if (!this.mTransitionCompleted.isEmpty()) {
                ArrayList<Integer> arrayList = this.mTransitionCompleted;
                i = arrayList.get(arrayList.size() - 1).intValue();
            } else {
                i = -1;
            }
            int i2 = this.mCurrentState;
            if (!(i == i2 || i2 == -1)) {
                this.mTransitionCompleted.add(Integer.valueOf(i2));
            }
        }
        processTransitionCompleted();
        Runnable runnable = this.mOnComplete;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.mScheduledTransitionTo;
        if (iArr != null && this.mScheduledTransitions > 0) {
            transitionToState(iArr[0]);
            int[] iArr2 = this.mScheduledTransitionTo;
            System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
            this.mScheduledTransitions--;
        }
    }

    public void fireTrigger(int i, boolean z, float f) {
        TransitionListener transitionListener = this.mTransitionListener;
        if (transitionListener != null) {
            transitionListener.onTransitionTrigger(this, i, z, f);
        }
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList = this.mTransitionListeners;
        if (copyOnWriteArrayList != null) {
            Iterator<TransitionListener> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().onTransitionTrigger(this, i, z, f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void getAnchorDpDt(int i, float f, float f2, float f3, float[] fArr) {
        String str;
        HashMap<View, MotionController> hashMap = this.mFrameArrayList;
        View viewById = getViewById(i);
        MotionController motionController = hashMap.get(viewById);
        if (motionController != null) {
            motionController.getDpDt(f, f2, f3, fArr);
            float y = viewById.getY();
            this.lastPos = f;
            this.lastY = y;
            return;
        }
        if (viewById == null) {
            StringBuilder sb = new StringBuilder(11);
            sb.append(i);
            str = sb.toString();
        } else {
            str = viewById.getContext().getResources().getResourceName(i);
        }
        String valueOf = String.valueOf(str);
        Log.w(TAG, valueOf.length() != 0 ? "WARNING could not find view id ".concat(valueOf) : new String("WARNING could not find view id "));
    }

    public ConstraintSet getConstraintSet(int i) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getConstraintSet(i);
    }

    public int[] getConstraintSetIds() {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getConstraintSetIds();
    }

    /* access modifiers changed from: package-private */
    public String getConstraintSetNames(int i) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.lookUpConstraintName(i);
    }

    public int getCurrentState() {
        return this.mCurrentState;
    }

    public void getDebugMode(boolean z) {
        this.mDebugPath = z ? 2 : 1;
        invalidate();
    }

    public ArrayList<MotionScene.Transition> getDefinedTransitions() {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getDefinedTransitions();
    }

    public DesignTool getDesignTool() {
        if (this.mDesignTool == null) {
            this.mDesignTool = new DesignTool(this);
        }
        return this.mDesignTool;
    }

    public int getEndState() {
        return this.mEndState;
    }

    /* access modifiers changed from: package-private */
    public MotionController getMotionController(int i) {
        return this.mFrameArrayList.get(findViewById(i));
    }

    /* access modifiers changed from: protected */
    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.mTransitionLastPosition;
    }

    public MotionScene getScene() {
        return this.mScene;
    }

    public int getStartState() {
        return this.mBeginState;
    }

    public float getTargetPosition() {
        return this.mTransitionGoalPosition;
    }

    public MotionScene.Transition getTransition(int i) {
        return this.mScene.getTransitionById(i);
    }

    public Bundle getTransitionState() {
        if (this.mStateCache == null) {
            this.mStateCache = new StateCache();
        }
        this.mStateCache.recordState();
        return this.mStateCache.getTransitionState();
    }

    public long getTransitionTimeMs() {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            this.mTransitionDuration = ((float) motionScene.getDuration()) / 1000.0f;
        }
        return (long) (this.mTransitionDuration * 1000.0f);
    }

    public float getVelocity() {
        return this.mLastVelocity;
    }

    public void getViewVelocity(View view, float f, float f2, float[] fArr, int i) {
        float f3;
        float f4 = this.mLastVelocity;
        float f5 = this.mTransitionLastPosition;
        if (this.mInterpolator != null) {
            float signum = Math.signum(this.mTransitionGoalPosition - f5);
            float interpolation = this.mInterpolator.getInterpolation(this.mTransitionLastPosition + EPSILON);
            float interpolation2 = this.mInterpolator.getInterpolation(this.mTransitionLastPosition);
            f4 = (signum * ((interpolation - interpolation2) / EPSILON)) / this.mTransitionDuration;
            f3 = interpolation2;
        } else {
            f3 = f5;
        }
        Interpolator interpolator = this.mInterpolator;
        if (interpolator instanceof MotionInterpolator) {
            f4 = ((MotionInterpolator) interpolator).getVelocity();
        }
        MotionController motionController = this.mFrameArrayList.get(view);
        if ((i & 1) == 0) {
            motionController.getPostLayoutDvDp(f3, view.getWidth(), view.getHeight(), f, f2, fArr);
        } else {
            motionController.getDpDt(f3, f, f2, fArr);
        }
        if (i < 2) {
            fArr[0] = fArr[0] * f4;
            fArr[1] = fArr[1] * f4;
        }
    }

    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    public boolean isDelayedApplicationOfInitialState() {
        return this.mDelayedApply;
    }

    public boolean isInRotation() {
        return this.mInRotation;
    }

    public boolean isInteractionEnabled() {
        return this.mInteractionEnabled;
    }

    public boolean isViewTransitionEnabled(int i) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            return motionScene.isViewTransitionEnabled(i);
        }
        return false;
    }

    public void jumpToState(int i) {
        if (!isAttachedToWindow()) {
            this.mCurrentState = i;
        }
        if (this.mBeginState == i) {
            setProgress(0.0f);
        } else if (this.mEndState == i) {
            setProgress(1.0f);
        } else {
            setTransition(i, i);
        }
    }

    public void loadLayoutDescription(int i) {
        int i2;
        MotionScene.Transition transition;
        if (i != 0) {
            try {
                MotionScene motionScene = new MotionScene(getContext(), this, i);
                this.mScene = motionScene;
                if (this.mCurrentState == -1) {
                    this.mCurrentState = motionScene.getStartId();
                    this.mBeginState = this.mScene.getStartId();
                    this.mEndState = this.mScene.getEndId();
                }
                if (isAttachedToWindow()) {
                    Display display = getDisplay();
                    if (display == null) {
                        i2 = 0;
                    } else {
                        i2 = display.getRotation();
                    }
                    this.mPreviouseRotation = i2;
                    MotionScene motionScene2 = this.mScene;
                    if (motionScene2 != null) {
                        ConstraintSet constraintSet = motionScene2.getConstraintSet(this.mCurrentState);
                        this.mScene.readFallback(this);
                        ArrayList<MotionHelper> arrayList = this.mDecoratorsHelpers;
                        if (arrayList != null) {
                            Iterator<MotionHelper> it = arrayList.iterator();
                            while (it.hasNext()) {
                                it.next().onFinishedMotionScene(this);
                            }
                        }
                        if (constraintSet != null) {
                            constraintSet.applyTo(this);
                        }
                        this.mBeginState = this.mCurrentState;
                    }
                    onNewStateAttachHandlers();
                    StateCache stateCache = this.mStateCache;
                    if (stateCache == null) {
                        MotionScene motionScene3 = this.mScene;
                        if (motionScene3 != null && (transition = motionScene3.mCurrentTransition) != null && transition.getAutoTransition() == 4) {
                            transitionToEnd();
                            setState(TransitionState.SETUP);
                            setState(TransitionState.MOVING);
                        }
                    } else if (this.mDelayedApply) {
                        post(new Runnable() {
                            public void run() {
                                MotionLayout.this.mStateCache.apply();
                            }
                        });
                    } else {
                        stateCache.apply();
                    }
                } else {
                    this.mScene = null;
                }
            } catch (Exception e) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e);
            } catch (Exception e2) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e2);
            }
        } else {
            this.mScene = null;
        }
    }

    /* access modifiers changed from: package-private */
    public int lookUpConstraintId(String str) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return 0;
        }
        return motionScene.lookUpConstraintId(str);
    }

    /* access modifiers changed from: protected */
    public MotionTracker obtainVelocityTracker() {
        return MyTracker.obtain();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        MotionScene.Transition transition;
        int i;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.mPreviouseRotation = display.getRotation();
        }
        MotionScene motionScene = this.mScene;
        if (!(motionScene == null || (i = this.mCurrentState) == -1)) {
            ConstraintSet constraintSet = motionScene.getConstraintSet(i);
            this.mScene.readFallback(this);
            ArrayList<MotionHelper> arrayList = this.mDecoratorsHelpers;
            if (arrayList != null) {
                Iterator<MotionHelper> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().onFinishedMotionScene(this);
                }
            }
            if (constraintSet != null) {
                constraintSet.applyTo(this);
            }
            this.mBeginState = this.mCurrentState;
        }
        onNewStateAttachHandlers();
        StateCache stateCache = this.mStateCache;
        if (stateCache == null) {
            MotionScene motionScene2 = this.mScene;
            if (motionScene2 != null && (transition = motionScene2.mCurrentTransition) != null && transition.getAutoTransition() == 4) {
                transitionToEnd();
                setState(TransitionState.SETUP);
                setState(TransitionState.MOVING);
            }
        } else if (this.mDelayedApply) {
            post(new Runnable() {
                public void run() {
                    MotionLayout.this.mStateCache.apply();
                }
            });
        } else {
            stateCache.apply();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        TouchResponse touchResponse;
        int touchRegionId;
        RectF touchRegion;
        MotionScene motionScene = this.mScene;
        if (motionScene != null && this.mInteractionEnabled) {
            ViewTransitionController viewTransitionController = motionScene.mViewTransitionController;
            if (viewTransitionController != null) {
                viewTransitionController.touchEvent(motionEvent);
            }
            MotionScene.Transition transition = this.mScene.mCurrentTransition;
            if (transition != null && transition.isEnabled() && (touchResponse = transition.getTouchResponse()) != null && ((motionEvent.getAction() != 0 || (touchRegion = touchResponse.getTouchRegion(this, new RectF())) == null || touchRegion.contains(motionEvent.getX(), motionEvent.getY())) && (touchRegionId = touchResponse.getTouchRegionId()) != -1)) {
                View view = this.mRegionView;
                if (view == null || view.getId() != touchRegionId) {
                    this.mRegionView = findViewById(touchRegionId);
                }
                View view2 = this.mRegionView;
                if (view2 != null) {
                    this.mBoundsCheck.set((float) view2.getLeft(), (float) this.mRegionView.getTop(), (float) this.mRegionView.getRight(), (float) this.mRegionView.getBottom());
                    if (this.mBoundsCheck.contains(motionEvent.getX(), motionEvent.getY()) && !handlesTouchEvent((float) this.mRegionView.getLeft(), (float) this.mRegionView.getTop(), this.mRegionView, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.mInLayout = true;
        try {
            if (this.mScene == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (!(this.mLastLayoutWidth == i5 && this.mLastLayoutHeight == i6)) {
                rebuildScene();
                evaluate(true);
            }
            this.mLastLayoutWidth = i5;
            this.mLastLayoutHeight = i6;
            this.mOldWidth = i5;
            this.mOldHeight = i6;
            this.mInLayout = false;
        } finally {
            this.mInLayout = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.mScene == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z = false;
        boolean z2 = (this.mLastWidthMeasureSpec == i && this.mLastHeightMeasureSpec == i2) ? false : true;
        if (this.mNeedsFireTransitionCompleted) {
            this.mNeedsFireTransitionCompleted = false;
            onNewStateAttachHandlers();
            processTransitionCompleted();
            z2 = true;
        }
        if (this.mDirtyHierarchy) {
            z2 = true;
        }
        this.mLastWidthMeasureSpec = i;
        this.mLastHeightMeasureSpec = i2;
        int startId = this.mScene.getStartId();
        int endId = this.mScene.getEndId();
        if ((z2 || this.mModel.isNotConfiguredWith(startId, endId)) && this.mBeginState != -1) {
            super.onMeasure(i, i2);
            this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(startId), this.mScene.getConstraintSet(endId));
            this.mModel.reEvaluateState();
            this.mModel.setMeasuredId(startId, endId);
        } else {
            if (z2) {
                super.onMeasure(i, i2);
            }
            z = true;
        }
        if (this.mMeasureDuringTransition || z) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int width = this.mLayoutWidget.getWidth() + getPaddingLeft() + getPaddingRight();
            int height = this.mLayoutWidget.getHeight() + paddingTop;
            int i3 = this.mWidthMeasureMode;
            if (i3 == Integer.MIN_VALUE || i3 == 0) {
                int i4 = this.mStartWrapWidth;
                width = (int) (((float) i4) + (this.mPostInterpolationPosition * ((float) (this.mEndWrapWidth - i4))));
                requestLayout();
            }
            int i5 = this.mHeightMeasureMode;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                int i6 = this.mStartWrapHeight;
                height = (int) (((float) i6) + (this.mPostInterpolationPosition * ((float) (this.mEndWrapHeight - i6))));
                requestLayout();
            }
            setMeasuredDimension(width, height);
        }
        evaluateLayout();
    }

    public boolean onNestedFling(@NonNull View view, float f, float f2, boolean z) {
        return false;
    }

    public boolean onNestedPreFling(@NonNull View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(@NonNull final View view, int i, int i2, @NonNull int[] iArr, int i3) {
        MotionScene.Transition transition;
        TouchResponse touchResponse;
        int touchRegionId;
        MotionScene motionScene = this.mScene;
        if (motionScene != null && (transition = motionScene.mCurrentTransition) != null && transition.isEnabled()) {
            int i4 = -1;
            if (!transition.isEnabled() || (touchResponse = transition.getTouchResponse()) == null || (touchRegionId = touchResponse.getTouchRegionId()) == -1 || view.getId() == touchRegionId) {
                if (motionScene.getMoveWhenScrollAtTop()) {
                    TouchResponse touchResponse2 = transition.getTouchResponse();
                    if (!(touchResponse2 == null || (touchResponse2.getFlags() & 4) == 0)) {
                        i4 = i2;
                    }
                    float f = this.mTransitionPosition;
                    if ((f == 1.0f || f == 0.0f) && view.canScrollVertically(i4)) {
                        return;
                    }
                }
                if (!(transition.getTouchResponse() == null || (transition.getTouchResponse().getFlags() & 1) == 0)) {
                    float progressDirection = motionScene.getProgressDirection((float) i, (float) i2);
                    float f2 = this.mTransitionLastPosition;
                    if ((f2 <= 0.0f && progressDirection < 0.0f) || (f2 >= 1.0f && progressDirection > 0.0f)) {
                        view.setNestedScrollingEnabled(false);
                        view.post(new Runnable(this) {
                            public void run() {
                                view.setNestedScrollingEnabled(true);
                            }
                        });
                        return;
                    }
                }
                float f3 = this.mTransitionPosition;
                long nanoTime = getNanoTime();
                float f4 = (float) i;
                this.mScrollTargetDX = f4;
                float f5 = (float) i2;
                this.mScrollTargetDY = f5;
                this.mScrollTargetDT = (float) (((double) (nanoTime - this.mScrollTargetTime)) * 1.0E-9d);
                this.mScrollTargetTime = nanoTime;
                motionScene.processScrollMove(f4, f5);
                if (f3 != this.mTransitionPosition) {
                    iArr[0] = i;
                    iArr[1] = i2;
                }
                evaluate(false);
                if (iArr[0] != 0 || iArr[1] != 0) {
                    this.mUndergoingMotion = true;
                }
            }
        }
    }

    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4, int i5) {
    }

    public void onNestedScroll(@NonNull View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (!(!this.mUndergoingMotion && i == 0 && i2 == 0)) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.mUndergoingMotion = false;
    }

    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i, int i2) {
        this.mScrollTargetTime = getNanoTime();
        this.mScrollTargetDT = 0.0f;
        this.mScrollTargetDX = 0.0f;
        this.mScrollTargetDY = 0.0f;
    }

    /* access modifiers changed from: package-private */
    public void onNewStateAttachHandlers() {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            if (motionScene.autoTransition(this, this.mCurrentState)) {
                requestLayout();
                return;
            }
            int i = this.mCurrentState;
            if (i != -1) {
                this.mScene.addOnClickListeners(this, i);
            }
            if (this.mScene.supportTouch()) {
                this.mScene.setupTouch();
            }
        }
    }

    public void onRtlPropertiesChanged(int i) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.setRtl(isRtl());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.mCurrentTransition;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartNestedScroll(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull android.view.View r2, int r3, int r4) {
        /*
            r0 = this;
            androidx.constraintlayout.motion.widget.MotionScene r1 = r0.mScene
            if (r1 == 0) goto L_0x0021
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = r1.mCurrentTransition
            if (r1 == 0) goto L_0x0021
            androidx.constraintlayout.motion.widget.TouchResponse r1 = r1.getTouchResponse()
            if (r1 == 0) goto L_0x0021
            androidx.constraintlayout.motion.widget.MotionScene r1 = r0.mScene
            androidx.constraintlayout.motion.widget.MotionScene$Transition r1 = r1.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r1 = r1.getTouchResponse()
            int r1 = r1.getFlags()
            r1 = r1 & 2
            if (r1 == 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r1 = 1
            return r1
        L_0x0021:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onStartNestedScroll(android.view.View, android.view.View, int, int):boolean");
    }

    public void onStopNestedScroll(@NonNull View view, int i) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            float f = this.mScrollTargetDT;
            if (f != 0.0f) {
                motionScene.processScrollUp(this.mScrollTargetDX / f, this.mScrollTargetDY / f);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null || !this.mInteractionEnabled || !motionScene.supportTouch()) {
            return super.onTouchEvent(motionEvent);
        }
        MotionScene.Transition transition = this.mScene.mCurrentTransition;
        if (transition != null && !transition.isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        this.mScene.processTouchEvent(motionEvent, getCurrentState(), this);
        if (this.mScene.mCurrentTransition.isTransitionFlag(4)) {
            return this.mScene.mCurrentTransition.getTouchResponse().isDragStarted();
        }
        return true;
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.mTransitionListeners == null) {
                this.mTransitionListeners = new CopyOnWriteArrayList<>();
            }
            this.mTransitionListeners.add(motionHelper);
            if (motionHelper.isUsedOnShow()) {
                if (this.mOnShowHelpers == null) {
                    this.mOnShowHelpers = new ArrayList<>();
                }
                this.mOnShowHelpers.add(motionHelper);
            }
            if (motionHelper.isUseOnHide()) {
                if (this.mOnHideHelpers == null) {
                    this.mOnHideHelpers = new ArrayList<>();
                }
                this.mOnHideHelpers.add(motionHelper);
            }
            if (motionHelper.isDecorator()) {
                if (this.mDecoratorsHelpers == null) {
                    this.mDecoratorsHelpers = new ArrayList<>();
                }
                this.mDecoratorsHelpers.add(motionHelper);
            }
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.mOnShowHelpers;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.mOnHideHelpers;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    /* access modifiers changed from: protected */
    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = null;
    }

    @Deprecated
    public void rebuildMotion() {
        Log.e(TAG, "This method is deprecated. Please call rebuildScene() instead.");
        rebuildScene();
    }

    public void rebuildScene() {
        this.mModel.reEvaluateState();
        invalidate();
    }

    public boolean removeTransitionListener(TransitionListener transitionListener) {
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList = this.mTransitionListeners;
        if (copyOnWriteArrayList == null) {
            return false;
        }
        return copyOnWriteArrayList.remove(transitionListener);
    }

    public void requestLayout() {
        MotionScene motionScene;
        MotionScene.Transition transition;
        if (!this.mMeasureDuringTransition && this.mCurrentState == -1 && (motionScene = this.mScene) != null && (transition = motionScene.mCurrentTransition) != null) {
            int layoutDuringTransition = transition.getLayoutDuringTransition();
            if (layoutDuringTransition != 0) {
                if (layoutDuringTransition == 2) {
                    int childCount = getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        this.mFrameArrayList.get(getChildAt(i)).remeasure();
                    }
                    return;
                }
            } else {
                return;
            }
        }
        super.requestLayout();
    }

    @RequiresApi(api = 17)
    public void rotateTo(int i, int i2) {
        int i3 = 1;
        this.mInRotation = true;
        this.mPreRotateWidth = getWidth();
        this.mPreRotateHeight = getHeight();
        int rotation = getDisplay().getRotation();
        if ((rotation + 1) % 4 <= (this.mPreviouseRotation + 1) % 4) {
            i3 = 2;
        }
        this.mRotatMode = i3;
        this.mPreviouseRotation = rotation;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            ViewState viewState = this.mPreRotate.get(childAt);
            if (viewState == null) {
                viewState = new ViewState();
                this.mPreRotate.put(childAt, viewState);
            }
            viewState.getState(childAt);
        }
        this.mBeginState = -1;
        this.mEndState = i;
        this.mScene.setTransition(-1, i);
        this.mModel.initFrom(this.mLayoutWidget, (ConstraintSet) null, this.mScene.getConstraintSet(this.mEndState));
        this.mTransitionPosition = 0.0f;
        this.mTransitionLastPosition = 0.0f;
        invalidate();
        transitionToEnd(new Runnable() {
            public void run() {
                boolean unused = MotionLayout.this.mInRotation = false;
            }
        });
        if (i2 > 0) {
            this.mTransitionDuration = ((float) i2) / 1000.0f;
        }
    }

    public void scheduleTransitionTo(int i) {
        if (getCurrentState() == -1) {
            transitionToState(i);
            return;
        }
        int[] iArr = this.mScheduledTransitionTo;
        if (iArr == null) {
            this.mScheduledTransitionTo = new int[4];
        } else if (iArr.length <= this.mScheduledTransitions) {
            this.mScheduledTransitionTo = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.mScheduledTransitionTo;
        int i2 = this.mScheduledTransitions;
        this.mScheduledTransitions = i2 + 1;
        iArr2[i2] = i;
    }

    public void setDebugMode(int i) {
        this.mDebugPath = i;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.mDelayedApply = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.mInteractionEnabled = z;
    }

    public void setInterpolatedProgress(float f) {
        if (this.mScene != null) {
            setState(TransitionState.MOVING);
            Interpolator interpolator = this.mScene.getInterpolator();
            if (interpolator != null) {
                setProgress(interpolator.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList<MotionHelper> arrayList = this.mOnHideHelpers;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.mOnHideHelpers.get(i).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList<MotionHelper> arrayList = this.mOnShowHelpers;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.mOnShowHelpers.get(i).setProgress(f);
            }
        }
    }

    public void setProgress(float f, float f2) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.setProgress(f);
            this.mStateCache.setVelocity(f2);
            return;
        }
        setProgress(f);
        setState(TransitionState.MOVING);
        this.mLastVelocity = f2;
        float f3 = 1.0f;
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i != 0) {
            if (i <= 0) {
                f3 = 0.0f;
            }
            animateTo(f3);
        } else if (f != 0.0f && f != 1.0f) {
            if (f <= 0.5f) {
                f3 = 0.0f;
            }
            animateTo(f3);
        }
    }

    public void setScene(MotionScene motionScene) {
        this.mScene = motionScene;
        motionScene.setRtl(isRtl());
        rebuildScene();
    }

    /* access modifiers changed from: package-private */
    public void setStartState(int i) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.setStartState(i);
            this.mStateCache.setEndState(i);
            return;
        }
        this.mCurrentState = i;
    }

    /* access modifiers changed from: package-private */
    public void setState(TransitionState transitionState) {
        TransitionState transitionState2 = TransitionState.FINISHED;
        if (transitionState != transitionState2 || this.mCurrentState != -1) {
            TransitionState transitionState3 = this.mTransitionState;
            this.mTransitionState = transitionState;
            TransitionState transitionState4 = TransitionState.MOVING;
            if (transitionState3 == transitionState4 && transitionState == transitionState4) {
                fireTransitionChange();
            }
            int i = C03655.f390xabc7e4ac[transitionState3.ordinal()];
            if (i == 1 || i == 2) {
                if (transitionState == transitionState4) {
                    fireTransitionChange();
                }
                if (transitionState == transitionState2) {
                    fireTransitionCompleted();
                }
            } else if (i == 3 && transitionState == transitionState2) {
                fireTransitionCompleted();
            }
        }
    }

    public void setTransition(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.setStartState(i);
            this.mStateCache.setEndState(i2);
            return;
        }
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            this.mBeginState = i;
            this.mEndState = i2;
            motionScene.setTransition(i, i2);
            this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(i), this.mScene.getConstraintSet(i2));
            rebuildScene();
            this.mTransitionLastPosition = 0.0f;
            transitionToStart();
        }
    }

    public void setTransitionDuration(int i) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            Log.e(TAG, "MotionScene not defined");
        } else {
            motionScene.setDuration(i);
        }
    }

    public void setTransitionListener(TransitionListener transitionListener) {
        this.mTransitionListener = transitionListener;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.mStateCache == null) {
            this.mStateCache = new StateCache();
        }
        this.mStateCache.setTransitionState(bundle);
        if (isAttachedToWindow()) {
            this.mStateCache.apply();
        }
    }

    public String toString() {
        Context context = getContext();
        String name = Debug.getName(context, this.mBeginState);
        String name2 = Debug.getName(context, this.mEndState);
        float f = this.mTransitionLastPosition;
        float f2 = this.mLastVelocity;
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 47 + String.valueOf(name2).length());
        sb.append(name);
        sb.append("->");
        sb.append(name2);
        sb.append(" (pos:");
        sb.append(f);
        sb.append(" Dpos/Dt:");
        sb.append(f2);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (r10 != 7) goto L_0x00f1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void touchAnimateTo(int r10, float r11, float r12) {
        /*
            r9 = this;
            androidx.constraintlayout.motion.widget.MotionScene r0 = r9.mScene
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            float r0 = r9.mTransitionLastPosition
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x000c
            return
        L_0x000c:
            r0 = 1
            r9.mTemporalInterpolator = r0
            long r1 = r9.getNanoTime()
            r9.mAnimationStartTime = r1
            androidx.constraintlayout.motion.widget.MotionScene r1 = r9.mScene
            int r1 = r1.getDuration()
            float r1 = (float) r1
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r2
            r9.mTransitionDuration = r1
            r9.mTransitionGoalPosition = r11
            r9.mInTransition = r0
            r1 = 0
            r2 = 7
            r3 = 6
            r4 = 2
            if (r10 == 0) goto L_0x0093
            if (r10 == r0) goto L_0x0093
            if (r10 == r4) goto L_0x0093
            r5 = 4
            if (r10 == r5) goto L_0x0081
            r5 = 5
            if (r10 == r5) goto L_0x003b
            if (r10 == r3) goto L_0x0093
            if (r10 == r2) goto L_0x0093
            goto L_0x00f1
        L_0x003b:
            float r10 = r9.mTransitionLastPosition
            androidx.constraintlayout.motion.widget.MotionScene r0 = r9.mScene
            float r0 = r0.getMaxAcceleration()
            boolean r10 = willJump(r12, r10, r0)
            if (r10 == 0) goto L_0x005c
            androidx.constraintlayout.motion.widget.MotionLayout$DecelerateInterpolator r10 = r9.mDecelerateLogic
            float r11 = r9.mTransitionLastPosition
            androidx.constraintlayout.motion.widget.MotionScene r0 = r9.mScene
            float r0 = r0.getMaxAcceleration()
            r10.config(r12, r11, r0)
            androidx.constraintlayout.motion.widget.MotionLayout$DecelerateInterpolator r10 = r9.mDecelerateLogic
            r9.mInterpolator = r10
            goto L_0x00f1
        L_0x005c:
            androidx.constraintlayout.motion.utils.StopLogic r2 = r9.mStopLogic
            float r3 = r9.mTransitionLastPosition
            float r6 = r9.mTransitionDuration
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            float r7 = r10.getMaxAcceleration()
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            float r8 = r10.getMaxVelocity()
            r4 = r11
            r5 = r12
            r2.config(r3, r4, r5, r6, r7, r8)
            r9.mLastVelocity = r1
            int r10 = r9.mCurrentState
            r9.mTransitionGoalPosition = r11
            r9.mCurrentState = r10
            androidx.constraintlayout.motion.utils.StopLogic r10 = r9.mStopLogic
            r9.mInterpolator = r10
            goto L_0x00f1
        L_0x0081:
            androidx.constraintlayout.motion.widget.MotionLayout$DecelerateInterpolator r10 = r9.mDecelerateLogic
            float r11 = r9.mTransitionLastPosition
            androidx.constraintlayout.motion.widget.MotionScene r0 = r9.mScene
            float r0 = r0.getMaxAcceleration()
            r10.config(r12, r11, r0)
            androidx.constraintlayout.motion.widget.MotionLayout$DecelerateInterpolator r10 = r9.mDecelerateLogic
            r9.mInterpolator = r10
            goto L_0x00f1
        L_0x0093:
            if (r10 == r0) goto L_0x009f
            if (r10 != r2) goto L_0x0098
            goto L_0x009f
        L_0x0098:
            if (r10 == r4) goto L_0x009c
            if (r10 != r3) goto L_0x00a0
        L_0x009c:
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00a0
        L_0x009f:
            r11 = 0
        L_0x00a0:
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            int r10 = r10.getAutoCompleteMode()
            if (r10 != 0) goto L_0x00c0
            androidx.constraintlayout.motion.utils.StopLogic r0 = r9.mStopLogic
            float r1 = r9.mTransitionLastPosition
            float r4 = r9.mTransitionDuration
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            float r5 = r10.getMaxAcceleration()
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            float r6 = r10.getMaxVelocity()
            r2 = r11
            r3 = r12
            r0.config(r1, r2, r3, r4, r5, r6)
            goto L_0x00e7
        L_0x00c0:
            androidx.constraintlayout.motion.utils.StopLogic r0 = r9.mStopLogic
            float r1 = r9.mTransitionLastPosition
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            float r4 = r10.getSpringMass()
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            float r5 = r10.getSpringStiffiness()
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            float r6 = r10.getSpringDamping()
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            float r7 = r10.getSpringStopThreshold()
            androidx.constraintlayout.motion.widget.MotionScene r10 = r9.mScene
            int r8 = r10.getSpringBoundary()
            r2 = r11
            r3 = r12
            r0.springConfig(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x00e7:
            int r10 = r9.mCurrentState
            r9.mTransitionGoalPosition = r11
            r9.mCurrentState = r10
            androidx.constraintlayout.motion.utils.StopLogic r10 = r9.mStopLogic
            r9.mInterpolator = r10
        L_0x00f1:
            r10 = 0
            r9.mTransitionInstantly = r10
            long r10 = r9.getNanoTime()
            r9.mAnimationStartTime = r10
            r9.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.touchAnimateTo(int, float, float):void");
    }

    public void touchSpringTo(float f, float f2) {
        if (this.mScene != null && this.mTransitionLastPosition != f) {
            this.mTemporalInterpolator = true;
            this.mAnimationStartTime = getNanoTime();
            this.mTransitionDuration = ((float) this.mScene.getDuration()) / 1000.0f;
            this.mTransitionGoalPosition = f;
            this.mInTransition = true;
            this.mStopLogic.springConfig(this.mTransitionLastPosition, f, f2, this.mScene.getSpringMass(), this.mScene.getSpringStiffiness(), this.mScene.getSpringDamping(), this.mScene.getSpringStopThreshold(), this.mScene.getSpringBoundary());
            int i = this.mCurrentState;
            this.mTransitionGoalPosition = f;
            this.mCurrentState = i;
            this.mInterpolator = this.mStopLogic;
            this.mTransitionInstantly = false;
            this.mAnimationStartTime = getNanoTime();
            invalidate();
        }
    }

    public void transitionToEnd() {
        animateTo(1.0f);
        this.mOnComplete = null;
    }

    public void transitionToStart() {
        animateTo(0.0f);
    }

    public void transitionToState(int i) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.setEndState(i);
            return;
        }
        transitionToState(i, -1, -1);
    }

    public void updateState(int i, ConstraintSet constraintSet) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.setConstraintSet(i, constraintSet);
        }
        updateState();
        if (this.mCurrentState == i) {
            constraintSet.applyTo(this);
        }
    }

    public void updateStateAnimate(int i, ConstraintSet constraintSet, int i2) {
        if (this.mScene != null && this.mCurrentState == i) {
            int i3 = C0382R.C0385id.view_transition;
            updateState(i3, getConstraintSet(i));
            setState(i3, -1, -1);
            updateState(i, constraintSet);
            MotionScene.Transition transition = new MotionScene.Transition(-1, this.mScene, i3, i);
            transition.setDuration(i2);
            setTransition(transition);
            transitionToEnd();
        }
    }

    public void viewTransition(int i, View... viewArr) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.viewTransition(i, viewArr);
        } else {
            Log.e(TAG, " no motionScene");
        }
    }

    private static class MyTracker implements MotionTracker {

        /* renamed from: me */
        private static MyTracker f391me = new MyTracker();
        VelocityTracker tracker;

        private MyTracker() {
        }

        public static MyTracker obtain() {
            f391me.tracker = VelocityTracker.obtain();
            return f391me;
        }

        public void addMovement(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        public void clear() {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }

        public void computeCurrentVelocity(int i) {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i);
            }
        }

        public float getXVelocity() {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        public float getYVelocity() {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        public void recycle() {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.tracker = null;
            }
        }

        public void computeCurrentVelocity(int i, float f) {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i, f);
            }
        }

        public float getXVelocity(int i) {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity(i);
            }
            return 0.0f;
        }

        public float getYVelocity(int i) {
            if (this.tracker != null) {
                return getYVelocity(i);
            }
            return 0.0f;
        }
    }

    public void transitionToEnd(Runnable runnable) {
        animateTo(1.0f);
        this.mOnComplete = runnable;
    }

    public void transitionToState(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.setEndState(i);
            return;
        }
        transitionToState(i, -1, -1, i2);
    }

    public void updateState() {
        this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(this.mBeginState), this.mScene.getConstraintSet(this.mEndState));
        rebuildScene();
    }

    public void setState(int i, int i2, int i3) {
        setState(TransitionState.SETUP);
        this.mCurrentState = i;
        this.mBeginState = -1;
        this.mEndState = -1;
        ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.updateConstraints(i, (float) i2, (float) i3);
            return;
        }
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.getConstraintSet(i).applyTo(this);
        }
    }

    public void setProgress(float f) {
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i < 0 || f > 1.0f) {
            Log.w(TAG, "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.setProgress(f);
            return;
        }
        if (i <= 0) {
            if (this.mTransitionLastPosition == 1.0f && this.mCurrentState == this.mEndState) {
                setState(TransitionState.MOVING);
            }
            this.mCurrentState = this.mBeginState;
            if (this.mTransitionLastPosition == 0.0f) {
                setState(TransitionState.FINISHED);
            }
        } else if (f >= 1.0f) {
            if (this.mTransitionLastPosition == 0.0f && this.mCurrentState == this.mBeginState) {
                setState(TransitionState.MOVING);
            }
            this.mCurrentState = this.mEndState;
            if (this.mTransitionLastPosition == 1.0f) {
                setState(TransitionState.FINISHED);
            }
        } else {
            this.mCurrentState = -1;
            setState(TransitionState.MOVING);
        }
        if (this.mScene != null) {
            this.mTransitionInstantly = true;
            this.mTransitionGoalPosition = f;
            this.mTransitionPosition = f;
            this.mTransitionLastTime = -1;
            this.mAnimationStartTime = -1;
            this.mInterpolator = null;
            this.mInTransition = true;
            invalidate();
        }
    }

    public void transitionToState(int i, int i2, int i3) {
        transitionToState(i, i2, i3, -1);
    }

    public void transitionToState(int i, int i2, int i3, int i4) {
        StateSet stateSet;
        int convertToConstraintSet;
        MotionScene motionScene = this.mScene;
        if (!(motionScene == null || (stateSet = motionScene.mStateSet) == null || (convertToConstraintSet = stateSet.convertToConstraintSet(this.mCurrentState, i, (float) i2, (float) i3)) == -1)) {
            i = convertToConstraintSet;
        }
        int i5 = this.mCurrentState;
        if (i5 != i) {
            if (this.mBeginState == i) {
                animateTo(0.0f);
                if (i4 > 0) {
                    this.mTransitionDuration = ((float) i4) / 1000.0f;
                }
            } else if (this.mEndState == i) {
                animateTo(1.0f);
                if (i4 > 0) {
                    this.mTransitionDuration = ((float) i4) / 1000.0f;
                }
            } else {
                this.mEndState = i;
                if (i5 != -1) {
                    setTransition(i5, i);
                    animateTo(1.0f);
                    this.mTransitionLastPosition = 0.0f;
                    transitionToEnd();
                    if (i4 > 0) {
                        this.mTransitionDuration = ((float) i4) / 1000.0f;
                        return;
                    }
                    return;
                }
                this.mTemporalInterpolator = false;
                this.mTransitionGoalPosition = 1.0f;
                this.mTransitionPosition = 0.0f;
                this.mTransitionLastPosition = 0.0f;
                this.mTransitionLastTime = getNanoTime();
                this.mAnimationStartTime = getNanoTime();
                this.mTransitionInstantly = false;
                this.mInterpolator = null;
                if (i4 == -1) {
                    this.mTransitionDuration = ((float) this.mScene.getDuration()) / 1000.0f;
                }
                this.mBeginState = -1;
                this.mScene.setTransition(-1, this.mEndState);
                SparseArray sparseArray = new SparseArray();
                if (i4 == 0) {
                    this.mTransitionDuration = ((float) this.mScene.getDuration()) / 1000.0f;
                } else if (i4 > 0) {
                    this.mTransitionDuration = ((float) i4) / 1000.0f;
                }
                int childCount = getChildCount();
                this.mFrameArrayList.clear();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = getChildAt(i6);
                    this.mFrameArrayList.put(childAt, new MotionController(childAt));
                    sparseArray.put(childAt.getId(), this.mFrameArrayList.get(childAt));
                }
                this.mInTransition = true;
                this.mModel.initFrom(this.mLayoutWidget, (ConstraintSet) null, this.mScene.getConstraintSet(i));
                rebuildScene();
                this.mModel.build();
                computeCurrentPositions();
                int width = getWidth();
                int height = getHeight();
                if (this.mDecoratorsHelpers != null) {
                    for (int i7 = 0; i7 < childCount; i7++) {
                        MotionController motionController = this.mFrameArrayList.get(getChildAt(i7));
                        if (motionController != null) {
                            this.mScene.getKeyFrames(motionController);
                        }
                    }
                    Iterator<MotionHelper> it = this.mDecoratorsHelpers.iterator();
                    while (it.hasNext()) {
                        it.next().onPreSetup(this, this.mFrameArrayList);
                    }
                    for (int i8 = 0; i8 < childCount; i8++) {
                        MotionController motionController2 = this.mFrameArrayList.get(getChildAt(i8));
                        if (motionController2 != null) {
                            motionController2.setup(width, height, this.mTransitionDuration, getNanoTime());
                        }
                    }
                } else {
                    for (int i9 = 0; i9 < childCount; i9++) {
                        MotionController motionController3 = this.mFrameArrayList.get(getChildAt(i9));
                        if (motionController3 != null) {
                            this.mScene.getKeyFrames(motionController3);
                            motionController3.setup(width, height, this.mTransitionDuration, getNanoTime());
                        }
                    }
                }
                float staggered = this.mScene.getStaggered();
                if (staggered != 0.0f) {
                    float f = Float.MAX_VALUE;
                    float f2 = -3.4028235E38f;
                    for (int i10 = 0; i10 < childCount; i10++) {
                        MotionController motionController4 = this.mFrameArrayList.get(getChildAt(i10));
                        float finalY = motionController4.getFinalY() + motionController4.getFinalX();
                        f = Math.min(f, finalY);
                        f2 = Math.max(f2, finalY);
                    }
                    for (int i11 = 0; i11 < childCount; i11++) {
                        MotionController motionController5 = this.mFrameArrayList.get(getChildAt(i11));
                        float finalX = motionController5.getFinalX();
                        float finalY2 = motionController5.getFinalY();
                        motionController5.mStaggerScale = 1.0f / (1.0f - staggered);
                        motionController5.mStaggerOffset = staggered - ((((finalX + finalY2) - f) * staggered) / (f2 - f));
                    }
                }
                this.mTransitionPosition = 0.0f;
                this.mTransitionLastPosition = 0.0f;
                this.mInTransition = true;
                invalidate();
            }
        }
    }

    public void setTransition(int i) {
        if (this.mScene != null) {
            MotionScene.Transition transition = getTransition(i);
            this.mBeginState = transition.getStartConstraintSetId();
            this.mEndState = transition.getEndConstraintSetId();
            if (!isAttachedToWindow()) {
                if (this.mStateCache == null) {
                    this.mStateCache = new StateCache();
                }
                this.mStateCache.setStartState(this.mBeginState);
                this.mStateCache.setEndState(this.mEndState);
                return;
            }
            float f = Float.NaN;
            int i2 = this.mCurrentState;
            float f2 = 0.0f;
            if (i2 == this.mBeginState) {
                f = 0.0f;
            } else if (i2 == this.mEndState) {
                f = 1.0f;
            }
            this.mScene.setTransition(transition);
            this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(this.mBeginState), this.mScene.getConstraintSet(this.mEndState));
            rebuildScene();
            if (this.mTransitionLastPosition != f) {
                if (f == 0.0f) {
                    endTrigger(true);
                    this.mScene.getConstraintSet(this.mBeginState).applyTo(this);
                } else if (f == 1.0f) {
                    endTrigger(false);
                    this.mScene.getConstraintSet(this.mEndState).applyTo(this);
                }
            }
            if (!Float.isNaN(f)) {
                f2 = f;
            }
            this.mTransitionLastPosition = f2;
            if (Float.isNaN(f)) {
                String.valueOf(Debug.getLocation()).concat(" transitionToStart ");
                transitionToStart();
                return;
            }
            setProgress(f);
        }
    }

    private void checkStructure(int i, ConstraintSet constraintSet) {
        String name = Debug.getName(getContext(), i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            if (id == -1) {
                String name2 = childAt.getClass().getName();
                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 45 + name2.length());
                sb.append("CHECK: ");
                sb.append(name);
                sb.append(" ALL VIEWS SHOULD HAVE ID's ");
                sb.append(name2);
                sb.append(" does not!");
                Log.w(TAG, sb.toString());
            }
            if (constraintSet.getConstraint(id) == null) {
                String name3 = Debug.getName(childAt);
                StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 27 + String.valueOf(name3).length());
                sb2.append("CHECK: ");
                sb2.append(name);
                sb2.append(" NO CONSTRAINTS for ");
                sb2.append(name3);
                Log.w(TAG, sb2.toString());
            }
        }
        int[] knownIds = constraintSet.getKnownIds();
        for (int i3 = 0; i3 < knownIds.length; i3++) {
            int i4 = knownIds[i3];
            String name4 = Debug.getName(getContext(), i4);
            if (findViewById(knownIds[i3]) == null) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(name).length() + 27 + String.valueOf(name4).length());
                sb3.append("CHECK: ");
                sb3.append(name);
                sb3.append(" NO View matches id ");
                sb3.append(name4);
                Log.w(TAG, sb3.toString());
            }
            if (constraintSet.getHeight(i4) == -1) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(name).length() + 26 + String.valueOf(name4).length());
                sb4.append("CHECK: ");
                sb4.append(name);
                sb4.append("(");
                sb4.append(name4);
                sb4.append(") no LAYOUT_HEIGHT");
                Log.w(TAG, sb4.toString());
            }
            if (constraintSet.getWidth(i4) == -1) {
                StringBuilder sb5 = new StringBuilder(String.valueOf(name).length() + 26 + String.valueOf(name4).length());
                sb5.append("CHECK: ");
                sb5.append(name);
                sb5.append("(");
                sb5.append(name4);
                sb5.append(") no LAYOUT_HEIGHT");
                Log.w(TAG, sb5.toString());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void setTransition(MotionScene.Transition transition) {
        this.mScene.setTransition(transition);
        setState(TransitionState.SETUP);
        if (this.mCurrentState == this.mScene.getEndId()) {
            this.mTransitionLastPosition = 1.0f;
            this.mTransitionPosition = 1.0f;
            this.mTransitionGoalPosition = 1.0f;
        } else {
            this.mTransitionLastPosition = 0.0f;
            this.mTransitionPosition = 0.0f;
            this.mTransitionGoalPosition = 0.0f;
        }
        this.mTransitionLastTime = transition.isTransitionFlag(1) ? -1 : getNanoTime();
        int startId = this.mScene.getStartId();
        int endId = this.mScene.getEndId();
        if (startId != this.mBeginState || endId != this.mEndState) {
            this.mBeginState = startId;
            this.mEndState = endId;
            this.mScene.setTransition(startId, endId);
            this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(this.mBeginState), this.mScene.getConstraintSet(this.mEndState));
            this.mModel.setMeasuredId(this.mBeginState, this.mEndState);
            this.mModel.reEvaluateState();
            rebuildScene();
        }
    }

    private void checkStructure(MotionScene.Transition transition) {
        if (transition.getStartConstraintSetId() == transition.getEndConstraintSetId()) {
            Log.e(TAG, "CHECK: start and end constraint set should not be the same!");
        }
    }

    public MotionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    public MotionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
    }
}
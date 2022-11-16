package com.scwang.smart.refresh.layout.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.scwang.smart.refresh.layout.api.RefreshInternal;
import com.scwang.smart.refresh.layout.simple.SimpleComponent;

public abstract class InternalAbstract extends SimpleComponent {


    protected InternalAbstract(@NonNull View wrapped) {
        super(wrapped);
    }

    protected InternalAbstract(@NonNull View wrappedView, @Nullable RefreshInternal wrappedInternal) {
        super(wrappedView, wrappedInternal);
    }

    protected InternalAbstract(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


}
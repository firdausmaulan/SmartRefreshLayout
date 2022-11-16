package com.scwang.smart.refresh.layout.api;

import androidx.annotation.NonNull;

import com.scwang.smart.refresh.layout.constant.SpinnerStyle;

public interface RefreshInternal extends RefreshComponent {

    /**
     * 获取变换方式 {@link SpinnerStyle} 必须返回 非空
     * @return 变换方式
     */
    @NonNull
    SpinnerStyle getSpinnerStyle();
}
package com.wl.ui.androidui.recycleview.entity;

import com.chad.library.adapter.base.entity.MultiItemEntity;

/**
 * https://github.com/CymChad/BaseRecyclerViewAdapterHelper
 */
public class MultipleItem implements MultiItemEntity {
    public static final int TEXT = 1;
    public static final int IMG = 2;
    private int itemType;

    private String content;

    public MultipleItem(int itemType, String content) {
        this.itemType = itemType;
        this.content = content;
    }

    public MultipleItem(int itemType) {
        this.itemType = itemType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public int getItemType() {
        return itemType;
    }
}

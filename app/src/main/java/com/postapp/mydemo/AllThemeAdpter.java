package com.postapp.mydemo;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;


/**
 * Created by POST on 2018/1/23.
 */

public class AllThemeAdpter extends BaseQuickAdapter<String, BaseViewHolder> {

    public AllThemeAdpter() {
        super(R.layout.all_theme_section_head);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {

        helper.setText(R.id.text,item);
    }
}

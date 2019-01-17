package com.system.tmhsdl.zp01hxdl_vjflt.ui.dzs.adapter;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.facebook.drawee.view.SimpleDraweeView;
import com.system.tmhsdl.zp01hxdl_vjflt.BuildConfig;
import com.system.tmhsdl.zp01hxdl_vjflt.R;
import com.system.tmhsdl.zp01hxdl_vjflt.ui.dzs.bean.BookBean;
import com.system.tmhsdl.zp01hxdl_vjflt.ui.dzs.bean.ContentListBean;
import com.tenma.ventures.bean.utils.TMSharedPUtil;

import java.util.List;

public class IVMainAdapter extends BaseQuickAdapter<ContentListBean.ListBean, BaseViewHolder> {
    public IVMainAdapter(@Nullable List<ContentListBean.ListBean> data) {
        super(R.layout.fragment_content_item, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, ContentListBean.ListBean item) {
        SimpleDraweeView iv=helper.getView(R.id.iv);
        iv.setImageURI(TMSharedPUtil.getTMBaseConfig(mContext).getDomain()+item.getImage());
    }
}

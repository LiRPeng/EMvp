package com.study.xuan.emvp.model;

import com.study.xuan.emvp.ComponentId;
import com.xuan.annotation.BindType;

import java.util.List;

/**
 * Author : xuan.
 * Date : 2018/5/22.
 * Description :多样式需要实现HandlerType接口
 */
@BindType(
        {
                ComponentId.IMAGE_TWO_VH,
                ComponentId.TEXT_IMG
        }
)
public class ImageInfo implements HandlerType{
    public int type;
    public List<String> imgs;
    public PromInfo promInfo;

    public ImageInfo(int type) {
        this.type = type;
        promInfo = new PromInfo();
    }

    @Override
    public int handlerType() {
        return type;
    }
}
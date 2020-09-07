package com.common.platform.base.enums;

import lombok.Getter;

@Getter
public enum YesOrNotEnum {
    Y(true, "是", 1), N(false, "否", 0);

    private Boolean flag;
    private String desc;
    private Integer code;

    YesOrNotEnum(Boolean flag, String desc, Integer code) {
        this.code = code;
        this.desc = desc;
        this.flag = flag;
    }

    public static final String ValueOf(Integer status) {
        if (status == null) {
            return "";
        } else {
            for (YesOrNotEnum s : YesOrNotEnum.values()) {
               if (status.equals(s.getCode())){
                    return s.getDesc();
                }
            }
        }
        return "";
    }
}

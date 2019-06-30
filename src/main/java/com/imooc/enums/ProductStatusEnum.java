package com.imooc.enums;

import lombok.Getter;

/**
 * ProductStatusEnum
 *
 * @author Achin
 * @since 2019-06-30 14:00
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}

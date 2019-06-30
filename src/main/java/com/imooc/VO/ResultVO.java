package com.imooc.VO;

import lombok.Data;

/**
 * ResultVO
 * HTTP请求返回的最外层对象
 *
 * @author Achin
 * @since 2019-06-30 21:43
 */
@Data
public class ResultVO<T> {

    /** 状态码 */
    private Integer code;

    /** 错误信息 */
    private String msg;

    /** 数据 */
    private T data;

}

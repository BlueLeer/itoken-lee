package com.lee.itoken.common.web.service;


/**
 * 通用服务消费者接口
 * <p>Title: BaseClientService</p>
 * <p>Description: </p>
 *
 * @author Lusifer
 * @version 1.0.0
 * @date 2018/8/12 13:56
 */
public interface BaseClientService {
    default String page(int pageNum, int pageSize, String domainJson) {
        return null;
//        return Fallback.badGateway();
    }
}

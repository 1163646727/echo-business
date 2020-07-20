package com.echo.constant;

/**
 * className: MQConstants <BR>
 * description: rabbitMQ的相关常量<BR>
 * remark: <BR>
 * author: ChenQi <BR>
 * createDate: 2020-07-20 13:50 <BR>
 */
public class MQConstants {

    /** 总交换机 ChenQi*/
    public static final String EX_SCLOUD = "ex_scloud";

    /** 交换机 ChenQi*/
    public static final String EXCHANGE_HISDATA_RASS = "ex_hisdata_rass";

    /** 队列 ChenQi*/
    public static final String QUEUE_HISDATA_UPDATEDICT = "queue_hisdata_updateDict";

    /** 路由键 ChenQi*/
    public static final String ROUTE_KEY_UPDATEDICT = "updateDict";

}
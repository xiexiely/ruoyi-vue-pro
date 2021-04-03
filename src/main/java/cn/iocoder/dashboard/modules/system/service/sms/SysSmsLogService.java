package cn.iocoder.dashboard.modules.system.service.sms;

import cn.iocoder.dashboard.modules.system.dal.dataobject.sms.SysSmsTemplateDO;

import java.util.Map;

/**
 * 短信日志服务接口
 *
 * @author zzf
 * @date 13:48 2021/3/2
 */
public interface SysSmsLogService {

    /**
     * 创建短信日志
     *
     * @param mobile 手机号
     * @param userId 用户编号
     * @param userType 用户类型
     * @param isSend 是否发送
     * @param template 短信模板
     * @param templateContent 短信内容
     * @param templateParams 短信参数
     * @return 发送日志编号
     */
    Long createSmsLog(String mobile, Long userId, Integer userType, Boolean isSend,
                      SysSmsTemplateDO template, String templateContent, Map<String, Object> templateParams);

    /**
     * 更新发送日志的结果
     *
     * @param id 日志编号
     * @param sendCode 发送结果的编码
     * @param sendMsg 发送结果的提示
     * @param apiSendCode 短信 API 发送结果的编码
     * @param apiSendMsg 短信 API 发送失败的提示
     * @param apiRequestId 短信 API 发送返回的唯一请求 ID
     * @param apiSerialNo 短信 API 发送返回的序号
     */
    void updateSmsSendResult(Long id, Integer sendCode, String sendMsg,
                             String apiSendCode, String apiSendMsg, String apiRequestId, String apiSerialNo);

}

package com.yjw.dailyexpenses.service;

import com.yjw.dailyexpenses.pojo.vo.BaseResponse;
import com.yjw.dailyexpenses.pojo.vo.PersonRegisterVO;

/**
 * 人物服务类
 * 
 * @author YangJianWei
 * @version $Id: IPersonService.java, v 0.1 2018年10月9日 下午1:58:18 YangJianWei Exp $
 */
public interface IPersonService {

    /**
     * 人物注册服务
     * 
     * @param request
     * @return
     */
    BaseResponse personRegister(PersonRegisterVO request);
    
}

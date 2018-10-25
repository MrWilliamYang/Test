package com.yjw.dailyexpenses.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yjw.dailyexpenses.YjwDailyExpensesServiceApplicationTests;
import com.yjw.dailyexpenses.pojo.vo.BaseResponse;
import com.yjw.dailyexpenses.pojo.vo.PersonRegisterVO;

/**
 * 人物服务测试类
 * 
 * @author YangJianWei
 * @version $Id: PersonServiceTest.java, v 0.1 2018年10月9日 下午4:25:32 YangJianWei Exp $
 */
public class PersonServiceTest extends YjwDailyExpensesServiceApplicationTests {

    @Autowired
    IPersonService personService;

    @Test
    public void savePerson() {
        PersonRegisterVO request = new PersonRegisterVO();
        request.setAge(22);
        request.setAvatar("头像1");
        request.setGender(1);
        request.setName("杨建伟");
        request.setPassword("qwer1234");
        request.setTel(123456);
        BaseResponse result = personService.personRegister(request);
        Assert.assertEquals(BaseResponse.SUCCESS_CODE, result.getCode());
    }

}

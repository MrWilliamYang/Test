package com.yjw.dailyexpenses.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yjw.dailyexpenses.common.ResponseErrorEnum;
import com.yjw.dailyexpenses.pojo.entity.PersonEntity;
import com.yjw.dailyexpenses.pojo.vo.BaseResponse;
import com.yjw.dailyexpenses.pojo.vo.PersonRegisterVO;
import com.yjw.dailyexpenses.repository.IPersonRepository;
import com.yjw.dailyexpenses.service.IPersonService;

/**
 * 人物服务实现类
 * 
 * @author YangJianWei
 * @version $Id: PersonServiceImpl.java, v 0.1 2018年10月9日 下午2:27:17 YangJianWei Exp $
 */
@Service
public class PersonServiceImpl implements IPersonService {

    @Autowired
    private IPersonRepository personRepository;
    
    @Override
    public BaseResponse personRegister(PersonRegisterVO request) {
        PersonEntity personEntitys = new PersonEntity();
        PersonEntity personEntity = coverPersonEntity(request, personEntitys);
        int num = personRepository.savePerson(personEntity);
        if (num < 1 || num == 0) {
            return BaseResponse.error(ResponseErrorEnum.DATE_ADD_WRONG);
        }
        return BaseResponse.success();
    }

    private PersonEntity coverPersonEntity(PersonRegisterVO request, PersonEntity personEntitys) {
        Date date = new Date();
        personEntitys.setAge(request.getAge());
        personEntitys.setAvatar(request.getAvatar());
        personEntitys.setCreateTime(date);
        personEntitys.setGender(request.getGender());
        personEntitys.setName(request.getName());
        personEntitys.setPassword(request.getPassword());
        personEntitys.setTel(request.getTel());
        personEntitys.setUpdateTime(date);
        return personEntitys;
    }
}

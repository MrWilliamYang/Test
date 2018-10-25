package com.yjw.dailyexpenses.repository;

import com.yjw.dailyexpenses.pojo.entity.PersonEntity;

/**
 * 人物数据访问层
 * 
 * @author YangJianWei
 * @version $Id: IPersonRepository.java, v 0.1 2018年10月9日 下午2:29:07 YangJianWei Exp $
 */
public interface IPersonRepository {

    int savePerson(PersonEntity personEntity);
    
}

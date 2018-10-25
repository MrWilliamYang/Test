package com.yjw.dailyexpenses.repository.impl;

import java.util.Map;

import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.yjw.dailyexpenses.pojo.entity.PersonEntity;
import com.yjw.dailyexpenses.repository.IPersonRepository;
import com.yjw.dailyexpenses.utils.MapperUtils;

/**
 * 人物数据访问实现层
 * 
 * @author YangJianWei
 * @version $Id: PersonRepositoryImpl.java, v 0.1 2018年10月9日 下午2:34:45 YangJianWei Exp $
 */
@Repository
public class PersonRepositoryImpl implements IPersonRepository {

    private SimpleJdbcInsert insertObject;

    /**
     * 
     * @see com.yjw.dailyexpenses.repository.IPersonRepository#save(com.yjw.dailyexpenses.pojo.entity.PersonEntity)
     */
    @Override
    public int savePerson(PersonEntity personEntity) {
        Map<String, Object> paramMap = MapperUtils.getDBProperties(personEntity);
        return insertObject.executeAndReturnKey(paramMap).intValue();
    }

}

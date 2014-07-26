package com.facemake.dal.test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.facemake.dal.mapper.FmUserMapper;
import com.facemake.dal.pojo.FmUser;
import com.facemake.dal.pojo.FmUserCriteria;

public class Test01 {

    SqlSessionFactory sqlSessionFactory = null;
    Reader            reader            = null;

    @Before
    public void init() {
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test02() {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            FmUserMapper fmUserMapper = session.getMapper(FmUserMapper.class);

            FmUserCriteria query = new FmUserCriteria();
            query.createCriteria().andNickEqualTo("is_zhoufeng");
            query.setLimitStart(3);
            query.setLimitEnd(13);

            List<FmUser> users = fmUserMapper.selectByExample(query);

            System.out.println(users.size());

            System.out.println(fmUserMapper);
        } finally {
            session.close();
        }
    }

    @Test
    public void test01() {
        System.out.println("xxx");
    }

}

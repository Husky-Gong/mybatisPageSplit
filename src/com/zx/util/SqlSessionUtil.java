package com.zx.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {
    public static final String config="mybatis.xml";
    private static final SqlSessionFactory sqlSessionFactory;

    static{
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = null;
        InputStream in = null;

        try {
            in = Resources.getResourceAsStream(config);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        sqlSessionFactory = sqlSessionFactoryBuilder.build(in);
    }

    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }

}

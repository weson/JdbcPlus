package com.hebaibai.jdbcplus;

import com.hebaibai.jdbcplus.entity.Tools;
import com.hebaibai.jdbcplus.entity.User;
import com.hebaibai.jdbcplus.jdbc.JdbcTest;
import org.junit.Test;

public class JdbcPlusProxyTest extends JdbcTest {

    @Test
    public void selectById() {
        User user = jdbcPlus.selectById(User.class, 2);
        User parent = user.getParentId();
        System.out.println(parent);
    }

    @Test
    public void updateById() {
        Tools tools = jdbcPlus.selectById(Tools.class, 1);
        System.out.println(tools);
        User user = jdbcPlus.selectById(User.class, 2);
        System.out.println(user);
        tools.setUserId(user);
        jdbcPlus.updateById(Tools.class, tools);
    }
}
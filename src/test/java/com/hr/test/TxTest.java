package com.hr.test;


import com.hr.dao.IAccountDao;
import com.hr.domain.Account;
import com.hr.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class TxTest {

    @Autowired
    private IAccountService accountService;
    @Autowired
    private IAccountDao accountDao;


    @Test
    public void testTransfer() {
        accountService.transfer("aaa","bbb",100f);
    }

    @Test
    public void testJdbcFindAccountById() {
        Account account = accountService.findAccountById(1);
        System.out.println(account);
    }

    @Test
    public void testJdbcFindAccountByName() {
        Account aaa = accountDao.findAccountByName("aaa");
        System.out.println(aaa);
    }


}

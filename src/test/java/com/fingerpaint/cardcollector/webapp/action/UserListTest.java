package com.fingerpaint.cardcollector.webapp.action;

import org.appfuse.service.UserManager;
import org.compass.gps.CompassGps;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class UserListTest extends BasePageTestCase {
    private UserList bean;
    @Autowired
    private UserManager userManager;
    @Autowired
    private CompassGps compassGps;

    @Override
    @Before
    public void onSetUp() {
        super.onSetUp();
        bean = new UserList();
        bean.setUserManager(userManager);
    }

    @Test
    public void testListUsers() throws Exception {
        assertTrue(bean.getUsers().size() >= 1);
        assertFalse(bean.hasErrors());
    }

    @Test
    public void testSearch() throws Exception {
        compassGps.index();
        bean.setQuery("admin");
        assertEquals("success", bean.search());
        assertTrue(bean.getUsers().size() == 1);
    }
}

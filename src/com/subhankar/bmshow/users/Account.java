package com.subhankar.bmshow.users;

import com.subhankar.bmshow.enums.AccountStatus;

public class Account {
    private String id;
    private String password;
    private AccountStatus status;

    /**
     * Reset account password.
     * @return
     */
    public boolean resetPassword() {
        //return dummy
        return true;
    }
}

package com.itcrats.stemi.networkInterceptor;

import java.io.IOException;

/**
 * Created by JANI SHAIK on 16/09/2019
 */

public class NoConnectivityException extends IOException {
    public String getMessage() {
        return "No connectivity exception";
    }
}

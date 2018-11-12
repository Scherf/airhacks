
package com.airhacks.ping.boundary;

import javax.ejb.Stateless;

/**
 *
 * @author airhacks.com
 */
@Stateless
public class ZnueniService {

    public String message() {
        throw new IllegalStateException("today is 21");
        //return "42";
    }


}

package bean;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import java.io.Serializable;

/**
 * Created by dyr on 2016/8/3.
 */
public class Bean implements HttpSessionBindingListener,HttpSessionActivationListener,Serializable{
    private  int varint;
    private  String varstring;

    public String getVarstring() {
        return varstring;
    }

    public Bean() {
    }

    public void setVarstring(String varstring) {
        this.varstring = varstring;
    }

    public int getVarint() {
        return varint;
    }

    public void setVarint(int varint) {
        this.varint = varint;
    }

    @Override
    public void sessionWillPassivate(HttpSessionEvent httpSessionEvent) {

    }

    @Override
    public void sessionDidActivate(HttpSessionEvent httpSessionEvent) {

    }

    @Override
    public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent) {

    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {

    }
}

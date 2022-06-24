package net.devstudy.jmemcached.exception;

//produce  that type of exception when it is wrong configuration
public class JMemcachedConfigException extends JMemcachedException {
    public JMemcachedConfigException(String message) {
        super(message);
    }

    public JMemcachedConfigException(String message, Throwable cause) {
        super(message, cause);
    }
}

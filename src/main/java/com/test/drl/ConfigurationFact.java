package com.test.drl;


import lombok.ToString;

/**
 * Created by IntelliJ IDEA.
 * User: gorell
 * Date: 1/30/12
 * Time: 10:55 AM
 * Drools configuration fact used for non-applicative data to be passed to Drools policy engine as facts
 */
@ToString
public class ConfigurationFact extends DroolsFact
{
    public ConfigurationFact(String name, Object value)
    {
        super(name, value, null);
    }
}

/**
 * Copyright &copy; 2016 Dell Inc. or its subsidiaries. All Rights Reserved.
 * VCE Confidential/Proprietary Information
 */

package com.dell.cpsd.rcm.fitness.keystore.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * This is the properties config file for this project
 * <p>
 * Copyright &copy; 2016 Dell Inc. or its subsidiaries. All Rights Reserved.
 * <p/>
 *
 * @version 1.0
 * @since SINCE-TBD
 */
public class EncryptionPropertiesConfig
{
    /**
     * Default Constructor - Scope is Private
     */
    private EncryptionPropertiesConfig()
    {
        // Default Private Constructor
        // Added just to hide the class instantiation
    }

    //TODO ADD JAVA DOCS
    public static Properties loadProperties() throws IOException
    {
        Properties properties = new Properties();
        InputStream in = EncryptionPropertiesConfig.class.getClassLoader().getResourceAsStream("encryption.properties");
        properties.load(in);
        return properties;
    }
}

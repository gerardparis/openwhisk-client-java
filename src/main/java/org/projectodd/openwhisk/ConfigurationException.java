package org.projectodd.openwhisk;

class ConfigurationException extends RuntimeException {
    ConfigurationException(final String message, final Throwable cause) {
        super(message, cause);
    }
}

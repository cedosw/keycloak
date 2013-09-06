package org.keycloak.services.models.nosql.api;

/**
 * @author <a href="mailto:mposolda@redhat.com">Marek Posolda</a>
 */
public abstract class AbstractNoSQLObject implements NoSQLObject {

    @Override
    public void afterRemove(NoSQL noSQL) {
        // Empty by default
    }
}

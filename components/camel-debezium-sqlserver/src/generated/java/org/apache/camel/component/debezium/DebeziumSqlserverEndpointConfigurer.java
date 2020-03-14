/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.debezium;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class DebeziumSqlserverEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        DebeziumSqlserverEndpoint target = (DebeziumSqlserverEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": target.getConfiguration().setAdditionalProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "columnblacklist":
        case "columnBlacklist": target.getConfiguration().setColumnBlacklist(property(camelContext, java.lang.String.class, value)); return true;
        case "databasedbname":
        case "databaseDbname": target.getConfiguration().setDatabaseDbname(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistory":
        case "databaseHistory": target.getConfiguration().setDatabaseHistory(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistoryfilefilename":
        case "databaseHistoryFileFilename": target.getConfiguration().setDatabaseHistoryFileFilename(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistorykafkabootstrapservers":
        case "databaseHistoryKafkaBootstrapServers": target.getConfiguration().setDatabaseHistoryKafkaBootstrapServers(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistorykafkarecoveryattempts":
        case "databaseHistoryKafkaRecoveryAttempts": target.getConfiguration().setDatabaseHistoryKafkaRecoveryAttempts(property(camelContext, int.class, value)); return true;
        case "databasehistorykafkarecoverypollintervalms":
        case "databaseHistoryKafkaRecoveryPollIntervalMs": target.getConfiguration().setDatabaseHistoryKafkaRecoveryPollIntervalMs(property(camelContext, int.class, value)); return true;
        case "databasehistorykafkatopic":
        case "databaseHistoryKafkaTopic": target.getConfiguration().setDatabaseHistoryKafkaTopic(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehostname":
        case "databaseHostname": target.getConfiguration().setDatabaseHostname(property(camelContext, java.lang.String.class, value)); return true;
        case "databasepassword":
        case "databasePassword": target.getConfiguration().setDatabasePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseport":
        case "databasePort": target.getConfiguration().setDatabasePort(property(camelContext, int.class, value)); return true;
        case "databaseservername":
        case "databaseServerName": target.getConfiguration().setDatabaseServerName(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseservertimezone":
        case "databaseServerTimezone": target.getConfiguration().setDatabaseServerTimezone(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseuser":
        case "databaseUser": target.getConfiguration().setDatabaseUser(property(camelContext, java.lang.String.class, value)); return true;
        case "decimalhandlingmode":
        case "decimalHandlingMode": target.getConfiguration().setDecimalHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": target.getConfiguration().setHeartbeatIntervalMs(property(camelContext, int.class, value)); return true;
        case "heartbeattopicsprefix":
        case "heartbeatTopicsPrefix": target.getConfiguration().setHeartbeatTopicsPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "internalkeyconverter":
        case "internalKeyConverter": target.getConfiguration().setInternalKeyConverter(property(camelContext, java.lang.String.class, value)); return true;
        case "internalvalueconverter":
        case "internalValueConverter": target.getConfiguration().setInternalValueConverter(property(camelContext, java.lang.String.class, value)); return true;
        case "maxbatchsize":
        case "maxBatchSize": target.getConfiguration().setMaxBatchSize(property(camelContext, int.class, value)); return true;
        case "maxqueuesize":
        case "maxQueueSize": target.getConfiguration().setMaxQueueSize(property(camelContext, int.class, value)); return true;
        case "messagekeycolumns":
        case "messageKeyColumns": target.getConfiguration().setMessageKeyColumns(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetcommitpolicy":
        case "offsetCommitPolicy": target.getConfiguration().setOffsetCommitPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetcommittimeoutms":
        case "offsetCommitTimeoutMs": target.getConfiguration().setOffsetCommitTimeoutMs(property(camelContext, long.class, value)); return true;
        case "offsetflushintervalms":
        case "offsetFlushIntervalMs": target.getConfiguration().setOffsetFlushIntervalMs(property(camelContext, long.class, value)); return true;
        case "offsetstorage":
        case "offsetStorage": target.getConfiguration().setOffsetStorage(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetstoragefilename":
        case "offsetStorageFileName": target.getConfiguration().setOffsetStorageFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetstoragepartitions":
        case "offsetStoragePartitions": target.getConfiguration().setOffsetStoragePartitions(property(camelContext, int.class, value)); return true;
        case "offsetstoragereplicationfactor":
        case "offsetStorageReplicationFactor": target.getConfiguration().setOffsetStorageReplicationFactor(property(camelContext, int.class, value)); return true;
        case "offsetstoragetopic":
        case "offsetStorageTopic": target.getConfiguration().setOffsetStorageTopic(property(camelContext, java.lang.String.class, value)); return true;
        case "pollintervalms":
        case "pollIntervalMs": target.getConfiguration().setPollIntervalMs(property(camelContext, long.class, value)); return true;
        case "snapshotdelayms":
        case "snapshotDelayMs": target.getConfiguration().setSnapshotDelayMs(property(camelContext, long.class, value)); return true;
        case "snapshotfetchsize":
        case "snapshotFetchSize": target.getConfiguration().setSnapshotFetchSize(property(camelContext, int.class, value)); return true;
        case "snapshotlocktimeoutms":
        case "snapshotLockTimeoutMs": target.getConfiguration().setSnapshotLockTimeoutMs(property(camelContext, long.class, value)); return true;
        case "snapshotmode":
        case "snapshotMode": target.getConfiguration().setSnapshotMode(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotselectstatementoverrides":
        case "snapshotSelectStatementOverrides": target.getConfiguration().setSnapshotSelectStatementOverrides(property(camelContext, java.lang.String.class, value)); return true;
        case "sourcestructversion":
        case "sourceStructVersion": target.getConfiguration().setSourceStructVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "tableblacklist":
        case "tableBlacklist": target.getConfiguration().setTableBlacklist(property(camelContext, java.lang.String.class, value)); return true;
        case "tableignorebuiltin":
        case "tableIgnoreBuiltin": target.getConfiguration().setTableIgnoreBuiltin(property(camelContext, boolean.class, value)); return true;
        case "tablewhitelist":
        case "tableWhitelist": target.getConfiguration().setTableWhitelist(property(camelContext, java.lang.String.class, value)); return true;
        case "timeprecisionmode":
        case "timePrecisionMode": target.getConfiguration().setTimePrecisionMode(property(camelContext, java.lang.String.class, value)); return true;
        case "tombstonesondelete":
        case "tombstonesOnDelete": target.getConfiguration().setTombstonesOnDelete(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}

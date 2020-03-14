/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.rabbitmq;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class RabbitMQEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        RabbitMQEndpoint target = (RabbitMQEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "addresses": target.setAddresses(property(camelContext, java.lang.String.class, value)); return true;
        case "allowcustomheaders":
        case "allowCustomHeaders": target.setAllowCustomHeaders(property(camelContext, boolean.class, value)); return true;
        case "allownullheaders":
        case "allowNullHeaders": target.setAllowNullHeaders(property(camelContext, boolean.class, value)); return true;
        case "args": target.setArgs(property(camelContext, java.util.Map.class, value)); return true;
        case "autoack":
        case "autoAck": target.setAutoAck(property(camelContext, boolean.class, value)); return true;
        case "autodelete":
        case "autoDelete": target.setAutoDelete(property(camelContext, boolean.class, value)); return true;
        case "automaticrecoveryenabled":
        case "automaticRecoveryEnabled": target.setAutomaticRecoveryEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeendpoint":
        case "bridgeEndpoint": target.setBridgeEndpoint(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "channelpoolmaxsize":
        case "channelPoolMaxSize": target.setChannelPoolMaxSize(property(camelContext, int.class, value)); return true;
        case "channelpoolmaxwait":
        case "channelPoolMaxWait": target.setChannelPoolMaxWait(property(camelContext, long.class, value)); return true;
        case "clientproperties":
        case "clientProperties": target.setClientProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "concurrentconsumers":
        case "concurrentConsumers": target.setConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "connectionfactory":
        case "connectionFactory": target.setConnectionFactory(property(camelContext, com.rabbitmq.client.ConnectionFactory.class, value)); return true;
        case "connectionfactoryexceptionhandler":
        case "connectionFactoryExceptionHandler": target.setConnectionFactoryExceptionHandler(property(camelContext, com.rabbitmq.client.ExceptionHandler.class, value)); return true;
        case "connectiontimeout":
        case "connectionTimeout": target.setConnectionTimeout(property(camelContext, int.class, value)); return true;
        case "consumertag":
        case "consumerTag": target.setConsumerTag(property(camelContext, java.lang.String.class, value)); return true;
        case "deadletterexchange":
        case "deadLetterExchange": target.setDeadLetterExchange(property(camelContext, java.lang.String.class, value)); return true;
        case "deadletterexchangetype":
        case "deadLetterExchangeType": target.setDeadLetterExchangeType(property(camelContext, java.lang.String.class, value)); return true;
        case "deadletterqueue":
        case "deadLetterQueue": target.setDeadLetterQueue(property(camelContext, java.lang.String.class, value)); return true;
        case "deadletterroutingkey":
        case "deadLetterRoutingKey": target.setDeadLetterRoutingKey(property(camelContext, java.lang.String.class, value)); return true;
        case "declare": target.setDeclare(property(camelContext, boolean.class, value)); return true;
        case "durable": target.setDurable(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "exchangetype":
        case "exchangeType": target.setExchangeType(property(camelContext, java.lang.String.class, value)); return true;
        case "exclusive": target.setExclusive(property(camelContext, boolean.class, value)); return true;
        case "exclusiveconsumer":
        case "exclusiveConsumer": target.setExclusiveConsumer(property(camelContext, boolean.class, value)); return true;
        case "guaranteeddeliveries":
        case "guaranteedDeliveries": target.setGuaranteedDeliveries(property(camelContext, boolean.class, value)); return true;
        case "hostname": target.setHostname(property(camelContext, java.lang.String.class, value)); return true;
        case "immediate": target.setImmediate(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "mandatory": target.setMandatory(property(camelContext, boolean.class, value)); return true;
        case "networkrecoveryinterval":
        case "networkRecoveryInterval": target.setNetworkRecoveryInterval(property(camelContext, java.lang.Integer.class, value)); return true;
        case "passive": target.setPassive(property(camelContext, boolean.class, value)); return true;
        case "password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "portnumber":
        case "portNumber": target.setPortNumber(property(camelContext, int.class, value)); return true;
        case "prefetchcount":
        case "prefetchCount": target.setPrefetchCount(property(camelContext, int.class, value)); return true;
        case "prefetchenabled":
        case "prefetchEnabled": target.setPrefetchEnabled(property(camelContext, boolean.class, value)); return true;
        case "prefetchglobal":
        case "prefetchGlobal": target.setPrefetchGlobal(property(camelContext, boolean.class, value)); return true;
        case "prefetchsize":
        case "prefetchSize": target.setPrefetchSize(property(camelContext, int.class, value)); return true;
        case "publisheracknowledgements":
        case "publisherAcknowledgements": target.setPublisherAcknowledgements(property(camelContext, boolean.class, value)); return true;
        case "publisheracknowledgementstimeout":
        case "publisherAcknowledgementsTimeout": target.setPublisherAcknowledgementsTimeout(property(camelContext, long.class, value)); return true;
        case "queue": target.setQueue(property(camelContext, java.lang.String.class, value)); return true;
        case "requesttimeout":
        case "requestTimeout": target.setRequestTimeout(property(camelContext, long.class, value)); return true;
        case "requesttimeoutcheckerinterval":
        case "requestTimeoutCheckerInterval": target.setRequestTimeoutCheckerInterval(property(camelContext, long.class, value)); return true;
        case "requestedchannelmax":
        case "requestedChannelMax": target.setRequestedChannelMax(property(camelContext, int.class, value)); return true;
        case "requestedframemax":
        case "requestedFrameMax": target.setRequestedFrameMax(property(camelContext, int.class, value)); return true;
        case "requestedheartbeat":
        case "requestedHeartbeat": target.setRequestedHeartbeat(property(camelContext, int.class, value)); return true;
        case "routingkey":
        case "routingKey": target.setRoutingKey(property(camelContext, java.lang.String.class, value)); return true;
        case "skipexchangedeclare":
        case "skipExchangeDeclare": target.setSkipExchangeDeclare(property(camelContext, boolean.class, value)); return true;
        case "skipqueuebind":
        case "skipQueueBind": target.setSkipQueueBind(property(camelContext, boolean.class, value)); return true;
        case "skipqueuedeclare":
        case "skipQueueDeclare": target.setSkipQueueDeclare(property(camelContext, boolean.class, value)); return true;
        case "sslprotocol":
        case "sslProtocol": target.setSslProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "threadpoolsize":
        case "threadPoolSize": target.setThreadPoolSize(property(camelContext, int.class, value)); return true;
        case "topologyrecoveryenabled":
        case "topologyRecoveryEnabled": target.setTopologyRecoveryEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "transferexception":
        case "transferException": target.setTransferException(property(camelContext, boolean.class, value)); return true;
        case "trustmanager":
        case "trustManager": target.setTrustManager(property(camelContext, javax.net.ssl.TrustManager.class, value)); return true;
        case "username": target.setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "vhost": target.setVhost(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}

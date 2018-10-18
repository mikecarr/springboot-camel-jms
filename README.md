


## ActiveMQ

### Admin Console
Checking mapping for admin port i.e.

```
0.0.0.0:32777->8161/tcp,
```

Navigate to http://localhost:32777

admin/admin

### Ports

*	1883	MQTT Port
*	5672	AMQP Port
*	8161	Admin Port
*	61613	Stomp Port
*	61614	Web Sockets
*	61616	Listen Port


### Docker

```
docker run -it --rm -P webcenter/activemq:latest
```







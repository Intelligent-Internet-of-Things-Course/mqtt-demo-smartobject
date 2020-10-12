# MQTT BOT Smart Object

This project implement a Demo MQTT Smart Object with existing resources of different types.
Each resource is associated to a common structure through the class SmartObjectResource and published periodically to a local broker.

Two main topics categories have been defined: 

- Telemetry
- Events

The Smart Object can be configured using the file 'mqtt_dummy_so_conf.yaml'.
The MQTT library currently used by the project is Eclipse Paho (https://www.eclipse.org/paho/).

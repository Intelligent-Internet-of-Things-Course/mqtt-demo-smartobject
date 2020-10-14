package it.unimore.dipi.iot.mqtt.smartobject.resource;

import java.util.Random;
import java.util.UUID;

/**
 * @author Marco Picone, Ph.D. - picone.m@gmail.com
 * @project mqtt-demo-smartobject
 * @created 14/10/2020 - 14:29
 */
public class PresenceSensorResource extends SmartObjectResource<Boolean>{

    private static String UNIT_VALUE = "Boolean";

    private static String TYPE_VALUE = "iot:sensor:presence";

    private Random random;

    public PresenceSensorResource(){
        super(UUID.randomUUID().toString(),
                UNIT_VALUE,
                TYPE_VALUE);

        this.random = new Random(System.currentTimeMillis());
    }

    @Override
    public Boolean refreshValue() {
        return this.random.nextBoolean();
    }

}

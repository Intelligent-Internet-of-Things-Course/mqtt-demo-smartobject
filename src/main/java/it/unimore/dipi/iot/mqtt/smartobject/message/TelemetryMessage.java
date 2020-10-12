package it.unimore.dipi.iot.mqtt.smartobject.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import it.unimore.dipi.iot.mqtt.smartobject.resource.SmartObjectResource;

/**
 * @author Marco Picone, Ph.D. - picone.m@gmail.com
 * @project mqtt-demo-smartobject
 * @created 12/10/2020 - 19:58
 */
public class TelemetryMessage {

    @JsonProperty("timestamp")
    private long timestamp;

    @JsonProperty("data")
    private SmartObjectResource smartObjectResourceList;

    public TelemetryMessage() {
    }

    public TelemetryMessage(long timestamp, SmartObjectResource smartObjectResourceList) {
        this.timestamp = timestamp;
        this.smartObjectResourceList = smartObjectResourceList;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public SmartObjectResource getSmartObjectResourceList() {
        return smartObjectResourceList;
    }

    public void setSmartObjectResourceList(SmartObjectResource smartObjectResourceList) {
        this.smartObjectResourceList = smartObjectResourceList;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TelemetryMessage{");
        sb.append("timestamp=").append(timestamp);
        sb.append(", smartObjectResourceList=").append(smartObjectResourceList);
        sb.append('}');
        return sb.toString();
    }
}

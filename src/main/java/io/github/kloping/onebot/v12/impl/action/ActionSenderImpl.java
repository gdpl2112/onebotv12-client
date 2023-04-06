package io.github.kloping.onebot.v12.impl.action;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import io.github.kloping.onebot.v12.Configuration;
import io.github.kloping.onebot.v12.action.Action;
import io.github.kloping.onebot.v12.action.ActionSender;
import io.github.kloping.onebot.v12.utils.HttpSender;

import java.io.IOException;

/**
 * @author github.kloping
 */
public abstract class ActionSenderImpl implements ActionSender {
    @Override
    public String send(String data) {
        String rep = "{}";
        try {
            rep = HttpSender.sendPost("http://" + getConfiguration().getHost() + ":" + getConfiguration().getPort() + "/", data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return rep;
    }

    @Override
    public String send(Action action) {
        return send(JSON.toJSONString(action));
    }

    @JSONField(deserialize = false, serialize = false)
    private Configuration configuration;

    @JSONField(deserialize = false, serialize = false)
    @Override
    public Configuration getConfiguration() {
        return configuration;
    }

    @JSONField(deserialize = false, serialize = false)
    @Override
    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }
}

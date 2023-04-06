package io.github.gdpl2112.onebot.v12.impl.action;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import io.github.gdpl2112.onebot.v12.Configuration;
import io.github.gdpl2112.onebot.v12.action.Action;
import io.github.gdpl2112.onebot.v12.action.ActionResp;
import io.github.gdpl2112.onebot.v12.action.ActionSender;
import io.github.gdpl2112.onebot.v12.utils.HttpSender;

import java.io.IOException;

/**
 * @author github.kloping
 */
public abstract class ActionSenderImpl implements ActionSender {
    @JSONField(deserialize = false, serialize = false)
    private Configuration configuration;

    @Override
    public ActionResp send(String data) {
        String rep = "{}";
        try {
            rep = HttpSender.sendPost("http://" + getConfiguration().getHost() + ":" + getConfiguration().getPort() + "/", data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ActionResp rp = JSON.parseObject(rep, ActionResp.class);
        return rp;
    }

    @Override
    public ActionResp send(Action action) {
        return send(JSON.toJSONString(action));
    }

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

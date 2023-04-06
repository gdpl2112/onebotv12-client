package io.github.gdpl2112.onebot.v12.utils;

import io.github.gdpl2112.onebot.v12.action.ActionBuilder;
import io.github.gdpl2112.onebot.v12.action.ActionName;
import io.github.gdpl2112.onebot.v12.action.ActionResp;
import io.github.gdpl2112.onebot.v12.action.ActionSender;
import io.github.gdpl2112.onebot.v12.data.FileId;
import io.github.gdpl2112.onebot.v12.data.Image;
import io.github.kloping.file.FileUtils;
import io.github.kloping.url.UrlUtils;

import java.io.File;
import java.util.Base64;
import java.util.UUID;

/**
 * @author github.kloping
 */
public class ConfigurationUtils {
    public static final ConfigurationUtils INSTANCE = new ConfigurationUtils();

    public Image uploadImage(File file, ActionSender sender) {
        byte[] bytes = FileUtils.getBytesFromFile(file.getAbsolutePath());
        ActionResp resp = sender.send(new ActionBuilder(ActionName.UPLOAD_FILE)
                .addParam("type", "data")
                .addParam("name", file.getName())
                .addParam("data", Base64.getEncoder().encode(bytes)).build());
        String fid = resp.getData().get("file_id").toString();
        Image image = new Image();
        image.setData(new FileId(fid));
        return image;
    }

    public Image uploadImage(String url, ActionSender sender) {
        byte[] bytes = UrlUtils.getBytesFromHttpUrl(url);
        ActionResp resp = sender.send(new ActionBuilder(ActionName.UPLOAD_FILE)
                .addParam("type", "data")
                .addParam("name", new File(url).getName())
                .addParam("data", Base64.getEncoder().encode(bytes)).build());
        String fid = resp.getData().get("file_id").toString();
        Image image = new Image();
        image.setData(new FileId(fid));
        return image;
    }

    public Image uploadImage(byte[] bytes, ActionSender sender) {
        ActionResp resp = sender.send(new ActionBuilder(ActionName.UPLOAD_FILE)
                .addParam("type", "data")
                .addParam("name", UUID.randomUUID() + ".jpg")
                .addParam("data", Base64.getEncoder().encode(bytes)).build());
        String fid = resp.getData().get("file_id").toString();
        Image image = new Image();
        image.setData(new FileId(fid));
        return image;
    }
}

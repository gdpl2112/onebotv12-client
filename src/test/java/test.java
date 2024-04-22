import io.github.gdpl2112.onebot.v12.ListenerHost;
import io.github.gdpl2112.onebot.v12.WebChatClientWithOneBotV12;
import io.github.gdpl2112.onebot.v12.contact.Friend;
import io.github.gdpl2112.onebot.v12.data.Message;
import io.github.gdpl2112.onebot.v12.data.MessageChain;
import io.github.gdpl2112.onebot.v12.event.EventReceiver;
import io.github.gdpl2112.onebot.v12.event.FriendMessageEvent;
import io.github.gdpl2112.onebot.v12.event.GroupMessageEvent;
import io.github.gdpl2112.onebot.v12.event.MetaEvent;
import io.github.gdpl2112.onebot.v12.utils.ConfigurationUtils;
import io.github.kloping.file.FileUtils;

/**
 * @author github.kloping
 */
public class test {
    public static void main(String[] args) {
        WebChatClientWithOneBotV12.registerListenerHost(new ListenerHost() {
            @Override
            public void handleException(Throwable e) {

            }

            @EventReceiver
            public void onEvent(GroupMessageEvent event) {
                if (event.getMessage().toString().trim().equals("测试")) {
                    event.sendMessage(new MessageChain(new Message[]{
                            ConfigurationUtils.INSTANCE.uploadImage("96173877.png",
                                    FileUtils.getBytesFromFile("D:\\图片\\96173877.png"), event)}));
                }
            }

            @EventReceiver
            public void onEvent(FriendMessageEvent event) {
                if (event.getMessage().toString().trim().equals("测试")) {
                    Friend friend = event.getFriend();
                    event.sendMessage("测试成功");
                }
            }

            @EventReceiver
            public void onEvent(MetaEvent event) {
                System.out.println(event);
            }
        });
        WebChatClientWithOneBotV12.main(args);
    }
}

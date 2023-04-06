import io.github.kloping.onebot.v12.ListenerHost;
import io.github.kloping.onebot.v12.WebChatClientWithOneBotV12;
import io.github.kloping.onebot.v12.event.EventReceiver;
import io.github.kloping.onebot.v12.event.GroupMessageEvent;

/**
 * @author github.kloping
 */
public class test {
    public static void main(String[] args) {
        WebChatClientWithOneBotV12.LISTENER_HOSTS.add(new ListenerHost() {
            @Override
            public void handleException(Throwable e) {

            }

            @EventReceiver
            public void onEvent(GroupMessageEvent event) {
                if (event.getMessage().toString().trim().equals("测试")) {
                    event.sendMessage("测试成功");
                }
            }
        });
        WebChatClientWithOneBotV12.main(args);
    }
}

package io.github.gdpl2112.onebot.v12.event;

/**
 * <table>
 * <thead>
 * <tr>
 * <th>字段名</th>
 * <th>数据类型</th>
 * <th>说明</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 * <td><code>id</code></td>
 * <td>string</td>
 * <td>事件唯一标识符</td>
 * </tr>
 * <tr>
 * <td><code>time</code></td>
 * <td>float64</td>
 * <td>事件发生时间（Unix 时间戳），单位：秒，建议优先采用聊天平台给出的时间，其次采用实现中创建事件对象的时间</td>
 * </tr>
 * <tr>
 * <td><code>type</code></td>
 * <td>string</td>
 * <td>事件类型，必须是 <code>meta</code>、<code>message</code>、<code>notice</code>、<code>request</code> 中的一个，分别表示元事件、消息事件、通知事件和请求事件</td>
 * </tr>
 * <tr>
 * <td><code>detail_type</code></td>
 * <td>string</td>
 * <td>事件详细类型</td>
 * </tr>
 * <tr>
 * <td><code>sub_type</code></td>
 * <td>string</td>
 * <td>事件子类型（详细类型的下一级类型）</td>
 * </tr>
 * </tbody>
 * </table>
 *
 * @author github.kloping
 */
public interface Event {
    /**
     * id
     *
     * @return
     */
    String getId();

    /**
     * time
     *
     * @return
     */
    Double getTime();

    /**
     * 数据类型
     *
     * @return
     */
    String getType();

    /**
     * 详细类型
     *
     * @return
     */
    String getDetailType();

    /**
     * 子类型
     *
     * @return
     */
    String getSubType();
}

package guo.ping.zsq;

import io.github.biezhi.wechat.WeChatBot;
import io.github.biezhi.wechat.api.WeChatApi;
import io.github.biezhi.wechat.api.WeChatApiImpl;
import io.github.biezhi.wechat.api.constant.Config;
import org.junit.Test;

/**
 * Wechat Api Test
 */
public class ApiTest {

    @Test
    public void login() {
        WeChatApi api = new WeChatApiImpl(new WeChatBot(new Config()));
        api.login(false);
        System.out.println("=====");
        System.out.println(((WeChatApiImpl) api).getGroupList().size());
        System.out.println("=====");
        System.out.println(((WeChatApiImpl) api).getContactList().size());
        System.out.println("=====");
        System.out.println(((WeChatApiImpl) api).getPublicUsersList().size());
        System.out.println("=====");
        System.out.println(((WeChatApiImpl) api).getSpecialUsersList().size());
        System.out.println("=====");
        System.out.println(((WeChatApiImpl) api).getRecentList().size());
    }
}

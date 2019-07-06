package com.imooc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * WeixinController
 * 微信原始文档，不用SDK(后面不用了)
 *
 * @author Achin
 * @since 2019-07-06 09:00
 */
@Slf4j
@RestController
@RequestMapping("/weixin")
public class WeixinController {

    @GetMapping("/auth")
    public void auth(@RequestParam("code") String code) {
        log.info("1111111111111111111111111111");
        log.info("coe = " + code);

        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wx5d13e80e550bebc0&secret=24eeb372ee246d990359917524baf09b&code=" + code + "&grant_type=authorization_code";
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        log.info("response = " + response);
    }

}

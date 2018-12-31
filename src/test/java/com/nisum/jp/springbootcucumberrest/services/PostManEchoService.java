package com.nisum.jp.springbootcucumberrest.services;

import com.nisum.jp.springbootcucumberrest.utils.RestWrapper;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by jpnisum on 12/20/18.
 */
@Component
public class PostManEchoService {

  @Value("${postmanechoservice.host}")
  private String host;

  @Autowired
  private RestWrapper restWrapper;
  private Map<String,Object> headers = new HashMap<>();

  public void getPostManEchoResponse(String foo1, String foo2){
    Map<String, String> params = new HashMap<>();
    params.put("foo1", foo1);
    params.put("foo2", foo2);
    restWrapper.getAsResponse(host, "/get", params, headers);
  }

}

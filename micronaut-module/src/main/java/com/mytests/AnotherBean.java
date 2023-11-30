package com.mytests;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton
public class AnotherBean {

    @Inject  private  SomeBean someBean;


}

package com.os;

public interface Os {
void version();    //let subclass decide  who can initiate this...Give control to Factory class to use a deserved class
}

package com.tranquyet.bindings;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

public interface MessageBidings {
    String RECEIVE_MESSAGE = "receiveMessageTest";

    String RECEIVE_STUDENT = "receiveStudent";

    @Input(RECEIVE_MESSAGE)
    SubscribableChannel receiveMessageAmqp();

    @Input(RECEIVE_STUDENT)
    SubscribableChannel receiveStudent();
}

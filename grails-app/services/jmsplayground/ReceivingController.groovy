package jmsplayground

import grails.plugin.jms.Queue

class ReceivingService {

    static exposes = ["jms"]

    @Queue
    public synchronized test(msg) {
        log.info("ReceivingService.test called wth msg of ${msg}")
    }
}
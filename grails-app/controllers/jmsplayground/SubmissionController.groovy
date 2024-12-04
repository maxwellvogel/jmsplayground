package jmsplayground

import grails.converters.JSON
import grails.plugin.jms.JmsService

class SubmissionController {

    JmsService jmsService

    def send(String text) {
        log.info("SubmissionController.send called wth text of ${text}")
        Map data = [message: text]
        jmsService.send(service: 'receiving', method: 'test', data)
        render(data as JSON)
    }
}
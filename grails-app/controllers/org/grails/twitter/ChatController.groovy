package org.grails.twitter

class ChatController {
	def messageService

	def submitMessage(String message) {
		messageService.updateMessage message
	}
	
	def latestMessages() {
		def messages = Message.listOrderByDateCreated(order: 'desc', max:10)
		String content = g.render(template: "_latestMessages.gsp", model: [messages: messages.reverse()])
		render content
	}
}
